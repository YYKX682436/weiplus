package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.floatball.n f184213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.webview.ui.tools.floatball.n nVar) {
        super(1);
        this.f184213d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            com.tencent.mm.plugin.webview.ui.tools.floatball.n nVar = this.f184213d;
            nVar.b0(2);
            nVar.Q(2);
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = nVar.f93132d;
            ballInfo.f93054o.f93069d = booleanValue;
            ballInfo.f93045J = false;
            ballInfo.I = true;
            android.os.Bundle extra = ballInfo.G;
            kotlin.jvm.internal.o.f(extra, "extra");
            extra.putBoolean("key_state_float_ball_need_persist", true);
            nVar.j();
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(56, com.tencent.mm.plugin.webview.ui.tools.floatball.p.f184216a);
        }
        return jz5.f0.f302826a;
    }
}
