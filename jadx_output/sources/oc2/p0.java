package oc2;

/* loaded from: classes8.dex */
public final class p0 extends oz5.a implements kotlinx.coroutines.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView f344239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kotlinx.coroutines.q0 q0Var, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView) {
        super(q0Var);
        this.f344239d = renderView;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launch coroutine error, uuid:");
        com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView = this.f344239d;
        com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo = renderView.getCtrlInfo();
        sb6.append(ctrlInfo != null ? ctrlInfo.field_tips_uuid : null);
        sb6.append(", tipsId:");
        com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo2 = renderView.getCtrlInfo();
        sb6.append(ctrlInfo2 != null ? ctrlInfo2.field_tipsId : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String h17 = renderView.h();
        com.tencent.mars.xlog.Log.printErrStackTrace(h17, th6, sb7, new java.lang.Object[0]);
        java.lang.StackTraceElement[] stackTrace = th6.getStackTrace();
        pm0.z.b(xy2.b.f458155b, "RenderView_launch_coroutine_error", false, pm0.w.f356806g, null, false, false, new oc2.n0(h17, sb7, th6, stackTrace != null ? kz5.n0.g0(kz5.z.s0(stackTrace, 10), "\n", null, null, 0, null, oc2.o0.f344238d, 30, null) : null), 56, null);
    }
}
