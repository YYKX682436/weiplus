package ni2;

/* loaded from: classes10.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.x0 f337469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ni2.x0 x0Var) {
        super(1);
        this.f337469d = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        tn0.w0 h17;
        qf2.l lVar;
        tn0.w0 h18;
        zn0.a0 U;
        if (((java.lang.Boolean) obj).booleanValue()) {
            ni2.x0 x0Var = this.f337469d;
            int i17 = x0Var.M;
            if (i17 != x0Var.N) {
                boolean z17 = pm0.v.z(i17, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
                android.content.Context context = x0Var.f118183e;
                if (z17) {
                    db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.mmp), com.tencent.mm.R.raw.icons_outlined_done);
                } else if (pm0.v.z(x0Var.M, 64) && !pm0.v.z(x0Var.M, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                    db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.f491609dn5), com.tencent.mm.R.raw.icons_outlined_done);
                } else if (!pm0.v.z(x0Var.M, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) && !pm0.v.z(x0Var.M, 64)) {
                    db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.mkc), com.tencent.mm.R.raw.icons_outlined_done);
                }
            }
            super/*com.tencent.mm.plugin.finder.live.widget.e0*/.U();
            boolean z18 = !pm0.v.z(x0Var.M, 64);
            boolean z19 = pm0.v.z(x0Var.N, 64);
            zh2.c cVar = x0Var.K;
            if (z18 && z19) {
                com.tencent.mars.xlog.Log.i("FinderLiveMicSettingModePanel", "resetMicModeToNormalIfClosed curMicMode:" + ((cVar == null || (h18 = cVar.h()) == null || (U = h18.U()) == null) ? null : java.lang.Integer.valueOf(U.f474316t)));
                if (cVar != null && (lVar = (qf2.l) cVar.getController(qf2.l.class)) != null) {
                    lVar.b7(1, null);
                }
            }
            if (((mm2.c1) ((df2.d3) x0Var.f337502J).a().a(mm2.c1.class)).a8() && cVar != null && (h17 = cVar.h()) != null) {
                h17.M0(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
