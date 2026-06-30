package com.tencent.mm.ui.conversation;

@j95.b
/* loaded from: classes9.dex */
public final class b2 extends i95.w implements rv.c3 {
    public nm5.b Ai() {
        com.tencent.mm.ui.conversation.ConvExposeHelper convExposeHelper = com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d;
        convExposeHelper.getClass();
        kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        java.util.List j17 = convExposeHelper.j();
        return j17.isEmpty() ^ true ? nm5.j.c(java.lang.Integer.valueOf(((rv.e) kz5.n0.X(j17)).f399841b), java.lang.Integer.valueOf(((rv.e) kz5.n0.i0(j17)).f399841b)) : nm5.j.c(0, 0);
    }

    public rv.n3 Bi(com.tencent.mm.storage.l4 conversation) {
        kotlin.jvm.internal.o.g(conversation, "conversation");
        int b17 = com.tencent.mm.ui.conversation.w3.b(conversation);
        return b17 != 0 ? b17 != 1 ? b17 != 2 ? rv.n3.f399884d : rv.n3.f399886f : rv.n3.f399885e : rv.n3.f399884d;
    }

    public java.util.List Di() {
        com.tencent.mm.storage.l4 item;
        com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d.getClass();
        kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        yf5.j0 j0Var = (yf5.j0) com.tencent.mm.ui.conversation.ConvExposeHelper.f207295f.get();
        if (j0Var != null) {
            for (int i17 = 0; i17 < 20; i17++) {
                yf5.w0 w0Var = (yf5.w0) j0Var;
                if (i17 >= w0Var.f461985q.f461844a || (item = w0Var.getItem(i17)) == null) {
                    break;
                }
                arrayList.add(new rv.e(item, i17));
            }
        }
        return arrayList;
    }

    public int wi() {
        com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d.getClass();
        kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        android.widget.ListView listView = (android.widget.ListView) com.tencent.mm.ui.conversation.ConvExposeHelper.f207294e.get();
        yf5.j0 j0Var = (yf5.j0) com.tencent.mm.ui.conversation.ConvExposeHelper.f207295f.get();
        if (j0Var != null && listView != null) {
            yf5.w0 w0Var = (yf5.w0) j0Var;
            int max = java.lang.Math.max(w0Var.f461985q.f461844a, 50);
            for (int i17 = 0; i17 < max; i17++) {
                com.tencent.mm.storage.l4 item = w0Var.getItem(i17);
                if (com.tencent.mm.storage.z3.k4(item != null ? item.h1() : null)) {
                    return i17;
                }
            }
        }
        return -1;
    }
}
