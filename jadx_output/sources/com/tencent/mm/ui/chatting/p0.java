package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class p0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.q0 f202075d;

    public p0(com.tencent.mm.ui.chatting.q0 q0Var) {
        this.f202075d = q0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().q(mc1.c.CTRL_INDEX, this.f202075d.f202595b);
    }
}
