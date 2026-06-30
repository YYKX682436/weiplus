package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public int f164898b;

    /* renamed from: d, reason: collision with root package name */
    public int f164900d;

    /* renamed from: e, reason: collision with root package name */
    public int f164901e;

    /* renamed from: f, reason: collision with root package name */
    public int f164902f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f164903g;

    /* renamed from: i, reason: collision with root package name */
    public int f164905i;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f164897a = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f164899c = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f164904h = "";

    public final void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickLike", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(this.f164905i));
        lVarArr[1] = new jz5.l("associate_username", this.f164904h);
        lVarArr[2] = new jz5.l("sns_feed_id", this.f164899c);
        lVarArr[3] = new jz5.l("like_result", java.lang.Integer.valueOf(z17 ? 1 : 2));
        lVarArr[4] = new jz5.l("snsalbumsid", this.f164897a);
        lVarArr[5] = new jz5.l("is_pin_feed", java.lang.Integer.valueOf(this.f164901e));
        lVarArr[6] = new jz5.l("sns_page_scene", java.lang.Integer.valueOf(this.f164898b));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        java.util.Objects.toString(ri.l0.a(i17));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.t("sns_feed_like", i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickLike", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
    }

    public final int b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parserVisibleRange", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
        int i17 = 1;
        if ((snsInfo.getLocalPrivate() & 1) != 0) {
            i17 = 2;
        } else {
            ca4.e1 e1Var = ca4.f1.f39897a;
            if (e1Var.e(snsObject)) {
                i17 = 3;
            } else if (e1Var.c(snsObject)) {
                i17 = 4;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parserVisibleRange", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
        return i17;
    }
}
