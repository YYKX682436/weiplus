package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public abstract class me {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f201987a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f201988b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f201989c = new java.util.LinkedList();

    public static android.view.View a(int i17) {
        java.util.LinkedList linkedList = i17 == 1 ? f201987a : i17 == 2 ? f201988b : f201989c;
        if (linkedList.size() != 0) {
            return (android.view.View) linkedList.removeFirst();
        }
        return null;
    }

    public static void b(android.view.View view, int i17) {
        java.util.LinkedList linkedList = i17 == 1 ? f201987a : i17 == 2 ? f201988b : f201989c;
        if (linkedList.size() >= 35) {
            linkedList.removeFirst();
        }
        linkedList.addLast(view);
    }
}
