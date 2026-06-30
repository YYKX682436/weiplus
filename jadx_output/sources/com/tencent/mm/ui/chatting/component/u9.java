package com.tencent.mm.ui.chatting.component;

/* loaded from: classes7.dex */
public final class u9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.w9 f200059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200060f;

    public u9(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.component.w9 w9Var, java.lang.String str) {
        this.f200058d = f9Var;
        this.f200059e = w9Var;
        this.f200060f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.storage.f9 f9Var = this.f200058d;
        c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
        com.tencent.mm.ui.chatting.component.w9 w9Var = this.f200059e;
        java.util.HashMap hashMap = w9Var.f200161e;
        java.lang.String frameSetName = this.f200060f;
        hashMap.remove(frameSetName);
        a12.s sVar = (a12.s) ((a12.k) i95.n0.c(a12.k.class));
        sVar.getClass();
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "removeFrameSetViewByName, frameSetName:".concat(frameSetName));
        iq0.c Bi = sVar.Bi();
        if (Bi != null) {
            i95.m c17 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            gq0.t.u5((gq0.t) c17, Bi, null, frameSetName, 2, null);
        }
        if (w9Var.f198580d.B()) {
            w9Var.f198580d.L(true);
        }
    }
}
