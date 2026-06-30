package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes.dex */
public final class ur extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.viewitems.ur f205730d = new com.tencent.mm.ui.chatting.viewitems.ur();

    public ur() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.storage.f9 msg = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(msg, "msg");
        if (com.tencent.mm.storage.z3.L4(msg.Q0())) {
            com.tencent.mm.ui.chatting.viewitems.fs[] fsVarArr = com.tencent.mm.ui.chatting.viewitems.fs.f203999d;
            i17 = 1;
        } else {
            com.tencent.mm.ui.chatting.viewitems.fs[] fsVarArr2 = com.tencent.mm.ui.chatting.viewitems.fs.f203999d;
            i17 = 0;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
