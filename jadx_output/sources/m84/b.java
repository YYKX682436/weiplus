package m84;

/* loaded from: classes4.dex */
public final class b implements com.tencent.mm.plugin.sns.ui.widget.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m84.u f324755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f324756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f324757c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f324758d;

    public b(m84.u uVar, int i17, int i18, int i19) {
        this.f324755a = uVar;
        this.f324756b = i17;
        this.f324757c = i18;
        this.f324758d = i19;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$adjustContentContainerLayout$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$adjustContentContainerLayout$1$1");
        m84.u uVar = this.f324755a;
        java.lang.String j17 = uVar.j();
        int i17 = this.f324756b;
        int i18 = this.f324757c;
        int i19 = this.f324758d;
        try {
            android.view.View L = uVar.L();
            if (L != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) uVar.f324799x).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                if (linearLayout != null) {
                    int[] iArr = new int[2];
                    L.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    linearLayout.getLocationOnScreen(iArr2);
                    int height = linearLayout.getHeight();
                    int i27 = iArr2[0] - iArr[0];
                    int i28 = iArr2[1] - iArr[1];
                    com.tencent.mars.xlog.Log.w(uVar.j(), "onPreDraw measured, imagesKeeperLayoutHeight=" + height + ", imagesKeeperLayoutHeightCalc=" + i17 + ", leftMargin=" + i27 + ", leftMarginCalc=" + i18 + ", topMargin=" + i28 + ", topMarginCalc=" + i19);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    uVar.H(height, i27, i28);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$adjustContentContainerLayout$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$adjustContentContainerLayout$1$1");
    }
}
