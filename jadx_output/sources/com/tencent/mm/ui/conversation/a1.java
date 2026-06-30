package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b1 f207430d;

    public a1(com.tencent.mm.ui.conversation.b1 b1Var) {
        this.f207430d = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvDelLogic", "deleteConv onClick() convBox threadpool execute");
        com.tencent.mm.storage.m4 m4Var = (com.tencent.mm.storage.m4) c01.d9.b().r();
        m4Var.getClass();
        java.util.LinkedList<com.tencent.mm.storage.l4> linkedList = new java.util.LinkedList();
        android.database.Cursor s17 = m4Var.s(1, null, "conversationboxservice", -1);
        if (s17 != null && s17.getCount() > 0) {
            while (s17.moveToNext()) {
                com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
                l4Var.convertFrom(s17);
                linkedList.add(l4Var);
            }
            s17.close();
        }
        for (com.tencent.mm.storage.l4 l4Var2 : linkedList) {
            com.tencent.mm.storage.f9 r66 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).r6(l4Var2.h1());
            ((e21.z0) c01.d9.b().w()).c(new e21.m(l4Var2.h1(), r66.I0()));
            boolean R4 = com.tencent.mm.storage.z3.R4(l4Var2.h1());
            com.tencent.mm.ui.conversation.b1 b1Var = this.f207430d;
            if (R4) {
                com.tencent.mm.ui.conversation.t1.b(b1Var.f207454e, l4Var2.h1(), new com.tencent.mm.pointers.PBool(), null, false);
            } else {
                com.tencent.mm.ui.conversation.t1.d(b1Var.f207454e, l4Var2.h1(), l4Var2, new com.tencent.mm.pointers.PBool(), null, false);
            }
        }
    }
}
