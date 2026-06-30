package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class df extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        super(1);
        this.f112286d = mgVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String msgId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(msgId, "msgId");
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "onHotCommentDismiss, ".concat(msgId));
        mm2.u0 u0Var = (mm2.u0) this.f112286d.P0(mm2.u0.class);
        com.tencent.mars.xlog.Log.i("LiveCommentSlice", "onHotWordDismiss, id:".concat(msgId));
        pm0.v.X(new mm2.r0(u0Var, msgId));
        u0Var.f329453s = null;
        return jz5.f0.f302826a;
    }
}
