package n34;

/* loaded from: classes4.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f334681a = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.r2 f334682b;

    public final void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doChangeStar", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(context, "context");
        kotlinx.coroutines.r2 r2Var = this.f334682b;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryStarHelper", "the last job is no finish，ignore");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStar", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsFirstSettingShow", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            boolean z17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_STAR_SETTING_TEACH_SHOW_INT, 0) == 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarConfig", "getSnsFirstSettingShow >> " + z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsFirstSettingShow", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            if (z17) {
                n34.o4.f334697a.a(context, new n34.i3(this, snsInfo, i17, context));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStar", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
            }
        }
        b(snsInfo, i17, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStar", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
    }

    public final void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doChangeStarInternal", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
        java.lang.String snsId = snsInfo.getSnsId();
        long n17 = com.tencent.mm.plugin.sns.storage.w2.n(snsId);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryStarHelper", "feedId: " + snsId + ",, action: " + i17);
        this.f334682b = kotlinx.coroutines.l.d(this.f334681a, null, null, new n34.l3(i17, n17, snsId, snsInfo, com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.f493243jf1), false, 0, null), context, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStarInternal", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
    }
}
