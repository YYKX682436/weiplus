package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class t0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f202688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.u0 f202689e;

    public t0(com.tencent.mm.ui.chatting.u0 u0Var, com.tencent.mm.modelbase.m1 m1Var) {
        this.f202689e = u0Var;
        this.f202688d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f202688d);
        com.tencent.mm.pluginsdk.model.app.u5.Ai().a(2, this.f202689e);
    }
}
