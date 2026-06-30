package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t8 f113841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(com.tencent.mm.plugin.finder.live.plugin.t8 t8Var) {
        super(0);
        this.f113841d = t8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kn0.p pVar;
        in0.q e17 = dk2.ef.f233372a.e();
        java.lang.Boolean valueOf = (e17 == null || (pVar = e17.D) == null) ? null : java.lang.Boolean.valueOf(pVar.f309588h);
        com.tencent.mm.plugin.finder.live.plugin.t8 t8Var = this.f113841d;
        if (t8Var.w0() == 0 && !kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
            t8Var.f114358t++;
            com.tencent.mars.xlog.Log.e(t8Var.f114355q, "checkPauseState anchor pause status error:" + t8Var.f114358t + '!');
            long j17 = t8Var.f114358t;
            long j18 = t8Var.f114359u;
            if (j17 < j18) {
                t8Var.t1();
                pm0.z.b(xy2.b.f458155b, "liveAnchorPauseStateError", false, null, null, false, false, null, 124, null);
            } else if (j17 == j18) {
                com.tencent.mm.plugin.finder.live.view.k0 R0 = t8Var.R0();
                android.content.Context context = t8Var.f365323d.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                R0.showAlertDialog((android.app.Activity) context, "", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e3s), "");
            }
        }
        return jz5.f0.f302826a;
    }
}
