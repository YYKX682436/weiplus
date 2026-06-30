package s74;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f404433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s74.o0 o0Var, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        super(0);
        this.f404432d = o0Var;
        this.f404433e = i17;
        this.f404434f = snsInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.FrameLayout n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$mainElementMeasuredWidth$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$mainElementMeasuredWidth$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkMeasureWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.o0 o0Var = this.f404432d;
        o0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkMeasureWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.f3 f3Var = o0Var.f404458y;
        int measuredWidth = (f3Var == null || (n17 = f3Var.n()) == null) ? 0 : n17.getMeasuredWidth();
        int i17 = this.f404433e;
        int b17 = (measuredWidth <= 0 || measuredWidth > i17 * 10) ? i65.a.b(o0Var.E(), 302) : measuredWidth;
        java.lang.String j17 = o0Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMeasureWidth, hasMainElement=");
        s74.f3 f3Var2 = o0Var.f404458y;
        sb6.append((f3Var2 != null ? f3Var2.n() : null) != null);
        sb6.append(", hasGridElement=");
        s74.f3 f3Var3 = o0Var.f404458y;
        sb6.append((f3Var3 != null ? f3Var3.k() : null) != null);
        sb6.append(", snsId=");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404434f;
        sb6.append(ca4.z0.t0(snsInfo.field_snsId));
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        s74.f3 f3Var4 = o0Var.f404458y;
        if ((f3Var4 != null ? f3Var4.n() : null) != null && (measuredWidth <= 0 || measuredWidth > i17 * 10)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2008, 8);
            ca4.e0.b("error_in_cal_dynamic_view_width", "" + o0Var.f404448o, 1, 0, "snsId=" + snsInfo.getSnsId() + "|measuredWidth=" + measuredWidth);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMeasureWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkMeasureWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$mainElementMeasuredWidth$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$mainElementMeasuredWidth$1");
        return valueOf;
    }
}
