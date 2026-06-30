package l94;

/* loaded from: classes4.dex */
public final class r extends g54.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l94.t f317388d;

    public r(l94.t tVar) {
        this.f317388d = tVar;
    }

    @Override // g54.d, com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
        super.E(str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
    }

    @Override // g54.d, com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
        super.N(str, str2, str3, i17, i18);
        com.tencent.mars.xlog.Log.e(this.f317388d.h(), "player callback error, %s, %s, %s, %d, %d", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
    }

    @Override // g54.d
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
        super.a(i17);
        k94.f.f305946a.d(l94.t.n(this.f317388d), i17 * 1000);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
    }

    @Override // g54.d, com.tencent.mm.pluginsdk.ui.d1
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
        super.c();
        k94.f.f305946a.b(l94.t.n(this.f317388d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
    }

    @Override // g54.d, com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
        super.i(str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
    }

    @Override // g54.d, com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
        super.l(str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$AdFoldVideoCallback");
    }
}
