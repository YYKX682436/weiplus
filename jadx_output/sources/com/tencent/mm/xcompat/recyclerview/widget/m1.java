package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f214580a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f214581b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f214582c = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());

    public final com.tencent.mm.xcompat.recyclerview.widget.l1 a(int i17) {
        android.util.SparseArray sparseArray = this.f214580a;
        com.tencent.mm.xcompat.recyclerview.widget.l1 l1Var = (com.tencent.mm.xcompat.recyclerview.widget.l1) sparseArray.get(i17);
        if (l1Var != null) {
            return l1Var;
        }
        com.tencent.mm.xcompat.recyclerview.widget.l1 l1Var2 = new com.tencent.mm.xcompat.recyclerview.widget.l1();
        sparseArray.put(i17, l1Var2);
        return l1Var2;
    }
}
