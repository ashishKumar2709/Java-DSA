import java.util.Arrays;

import components.BinarySearchTree;
import components.LinkedList;
import components.Queue;
import components.RandomArrayValues;
import components.Search;
import components.Sort;
import components.Stack;
import components.UserInput;

public class App {
        public static void main(String[] args) throws Exception {
                int[] nums = new int[5000000];
                int[] nums1 = new int[1000];
                int[] nums2 = new int[1000];
                int[] nums3 = new int[1000];
                int[] nums4 = new int[1000];
                int[] nums5 = new int[1000];
                int[] nums6 = new int[1000];

                RandomArrayValues insert = new RandomArrayValues();
                insert.addArrayValues(nums);
                insert.addArrayValues(nums1);
                insert.addArrayValues(nums2);
                insert.addArrayValues(nums3);
                insert.addArrayValues(nums4);
                insert.addArrayValues(nums5);
                insert.addArrayValues(nums6);

                Arrays.sort(nums);
                UserInput userIn = new UserInput();
                Search srch = new Search();
                int target = userIn.ReadNumInput();
                int resultIndex1 = srch.binarySearch(nums, target);
                System.out.println(resultIndex1 == -1 ? "Target not found"
                                : "Using BS target found at index: " + resultIndex1);
                System.out.println("-------------------------SEARCH--------------------------------------");
                int resultIndex2 = srch.binarySearchRecur(nums, target, 0, nums.length - 1, 1);
                System.out
                                .println(resultIndex2 == -1 ? "Target not found"
                                                : "Using BSR target found at index: " + resultIndex2);
                System.out.println("----------------------------------------------------------------------------");
                int resultIndex = srch.linearSearch(nums, target);
                System.out.println(resultIndex == -1 ? "Target not found"
                                : "Using LS target found at index: " + resultIndex);
                System.out.println("----------------------SORTING-------------------------------------");
                System.out.println("Unsorted: " + nums1[0] + " " + nums1[4] + " " + nums1[51] + " " + nums1[117] + " "
                                + nums1[259] + " " + nums1[390] + " " + nums1[654] + " " + nums1[878] + " "
                                + nums1[999]);
                int[] stepsCounter1 = { 0 };
                Sort.mergeSort(nums1, 0, nums1.length - 1, stepsCounter1);
                System.out.println("Steps taken in MergeSort: " + stepsCounter1[0]);
                System.out.println("Sorted: " + nums1[0] + " " + nums1[4] + " " + nums1[51] + " " + nums1[117] + " "
                                + nums1[259] + " " + nums1[390] + " " + nums1[654] + " " + nums1[878] + " "
                                + nums1[999]);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Unsorted: " + nums2[0] + " " + nums2[4] + " " + nums2[51] + " " + nums2[117] + " "
                                + nums2[259] + " " + nums2[390] + " " + nums2[654] + " " + nums2[878] + " "
                                + nums2[999]);
                int[] stepsCounter = { 0 };
                Sort.quickSort(nums2, 0, nums2.length - 1, stepsCounter);
                System.out.println("Steps taken in QuickSort: " + stepsCounter[0]);
                System.out.println("Sorted: " + nums2[0] + " " + nums2[4] + " " + nums2[51] + " " + nums2[117] + " "
                                + nums2[259] + " " + nums2[390] + " " + nums2[654] + " " + nums2[878] + " "
                                + nums2[999]);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Unsorted: " + nums3[0] + " " + nums3[4] + " " + nums3[51] + " " + nums3[117] + " "
                                + nums3[259] + " " + nums3[390] + " " + nums3[654] + " " + nums3[878] + " "
                                + nums3[999]);
                Sort.insertionSort(nums3);
                System.out.println("Sorted: " + nums3[0] + " " + nums3[4] + " " + nums3[51] + " " + nums3[117] + " "
                                + nums3[259] + " " + nums3[390] + " " + nums3[654] + " " + nums3[878] + " "
                                + nums3[999]);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Unsorted: " + nums4[0] + " " + nums4[4] + " " + nums4[51] + " " + nums4[117] + " "
                                + nums4[259] + " " + nums4[390] + " " + nums4[654] + " " + nums4[878] + " "
                                + nums4[999]);
                Sort.selectionSort(nums4);
                System.out.println("Sorted: " + nums4[0] + " " + nums4[4] + " " + nums4[51] + " " + nums4[117] + " "
                                + nums4[259] + " " + nums4[390] + " " + nums4[654] + " " + nums4[878] + " "
                                + nums4[999]);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Unsorted: " + nums5[0] + " " + nums5[4] + " " + nums5[51] + " " + nums5[117] + " "
                                + nums5[259] + " " + nums5[390] + " " + nums5[654] + " " + nums5[878] + " "
                                + nums5[999]);
                Sort.bubbleSort(nums5);
                System.out.println("Sorted: " + nums5[0] + " " + nums5[4] + " " + nums5[51] + " " + nums5[117] + " "
                                + nums5[259] + " " + nums5[390] + " " + nums5[654] + " " + nums5[878] + " "
                                + nums5[999]);
                System.out.println("--------------------------LINKED LIST-----------------------------------");
                LinkedList LL = new LinkedList();
                LL.append(34);
                LL.append(45);
                LL.append(9);
                LL.append(78);
                LL.append(46);
                LL.append(567);
                LL.append(8);
                LL.append(44);
                LL.printLinkedList();
                System.out.println("----------------------------------------------------------------------------");
                LL.prepend(29);
                LL.printLinkedList();
                System.out.println("----------------------------------------------------------------------------");
                LL.insertAt(5, 90);
                LL.printLinkedList();
                System.out.println("----------------------------------------------------------------------------");
                LL.deleteAt(8);
                LL.deleteAt(0);
                LL.printLinkedList();
                System.out.println("-----------------------------STACK-------------------------------------");
                Stack stack = new Stack(10);
                stack.push(5);
                stack.push(3);
                stack.push(2);
                stack.push(8);
                stack.push(5);
                stack.push(9);
                stack.push(1);
                stack.push(4);
                stack.push(8);
                stack.push(3);

                stack.show();
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("removed from stack: " + stack.pop());
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Stack top is: " + stack.peek());
                System.out.println("Stack is empty: " + stack.isEmpty());
                System.out.println("Stack size: " + stack.size());
                System.out.println("----------------------------------------------------------------------------");
                for (int i = 0; i < 8; i++) {
                        System.out.println(stack.pop());
                }
                stack.pop();
                System.out.println("Stack is empty: " + stack.isEmpty());
                System.out.println("Stack size: " + stack.size());
                System.out.println("Stack capacity: " + stack.stackCapacity());
                System.out.println("----------------------------------------------------------------------------");
                for (int i = 0; i <= 15; i++) {
                        stack.push(i * 2);
                }
                System.out.println("Stack is empty: " + stack.isEmpty());
                System.out.println("Stack size: " + stack.size());
                System.out.println("Stack capacity: " + stack.stackCapacity());
                System.out.println("Stack top is: " + stack.peek());
                stack.show();
                System.out.println("----------------------------Queue----------------------------------");
                Queue q1 = new Queue(5);
                for (int i = 0; i < 15; i++) {
                        q1.enQueue(i);
                }
                q1.enQueue(15);
                System.out.println("Capacity of queue: " + q1.capacity());
                System.out.println("Size of queue: " + q1.size());
                q1.show();
                System.out.println("----------------------------------------------------------------------------");
                for (int i = 0; i < 16; i++) {
                        System.out.println("Removed element: " + q1.deQueue());

                }
                System.out.println("Capacity of queue: " + q1.capacity());
                System.out.println("Size of queue: " + q1.size());
                q1.show();
                System.out.println("--------------------------BST-----------------------------------------");
                BinarySearchTree tree = new BinarySearchTree();
                for(int i=0;i<10;i++){
                        tree.insert((i+1)*10);
                }
                tree.inOrder();
        }
}
