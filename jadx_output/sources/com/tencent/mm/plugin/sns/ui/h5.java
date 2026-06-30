package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class h5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView f168490d;

    public h5(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView) {
        this.f168490d = longVideoFullScreenView;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
        try {
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView = this.f168490d;
            int i17 = com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.f166350p1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            z17 = longVideoFullScreenView.G;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        if (!z17) {
            if (!com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d).isPlaying()) {
                if (com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d).getCurrPosSec() == com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d).getVideoDurationSec()) {
                    com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d).a(0.0d, true);
                } else {
                    com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d).a(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d).getCurrPosSec(), true);
                }
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.e(this.f168490d, true);
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d).k();
            }
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView2 = this.f168490d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1108", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            longVideoFullScreenView2.S++;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1108", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView3 = this.f168490d;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            longVideoFullScreenView3.M = currentTimeMillis;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView4 = this.f168490d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        longVideoFullScreenView4.G = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView5 = this.f168490d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        boolean z18 = longVideoFullScreenView5.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        if (z18) {
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView6 = this.f168490d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            int i18 = longVideoFullScreenView6.C;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            if (i18 > 0) {
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView7 = this.f168490d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                int i19 = longVideoFullScreenView7.C;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView8 = this.f168490d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                int i27 = longVideoFullScreenView8.f166371x;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                if (i19 <= i27) {
                    com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar b17 = com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.b(this.f168490d);
                    com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView9 = this.f168490d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    int i28 = longVideoFullScreenView9.D;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    b17.a(i28);
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper d17 = com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d);
                    com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView10 = this.f168490d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    int i29 = longVideoFullScreenView10.D;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    d17.a(i29, true);
                    com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView11 = this.f168490d;
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    longVideoFullScreenView11.M = currentTimeMillis2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.e(this.f168490d, true);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
                    return;
                }
            }
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.b(this.f168490d).a(0);
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d).a(0.0d, true);
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView112 = this.f168490d;
            long currentTimeMillis22 = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            longVideoFullScreenView112.M = currentTimeMillis22;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.e(this.f168490d, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
            return;
        }
        int g17 = com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.g(this.f168490d);
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView12 = this.f168490d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        int i37 = longVideoFullScreenView12.f166371x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        if (g17 < i37 && com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.g(this.f168490d) >= 0) {
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.b(this.f168490d).a(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.g(this.f168490d) / 1000);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper d18 = com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d);
            double g18 = com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.g(this.f168490d);
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView13 = this.f168490d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            boolean z19 = longVideoFullScreenView13.f166375z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            d18.a(g18, z19);
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView14 = this.f168490d;
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            longVideoFullScreenView14.M = currentTimeMillis3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView15 = this.f168490d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            boolean z27 = longVideoFullScreenView15.f166375z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.e(longVideoFullScreenView15, z27);
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d).k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
        }
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.b(this.f168490d).a(0);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper d19 = com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d);
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView16 = this.f168490d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        boolean z28 = longVideoFullScreenView16.f166375z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        d19.a(0.0d, z28);
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView142 = this.f168490d;
        long currentTimeMillis32 = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        longVideoFullScreenView142.M = currentTimeMillis32;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView152 = this.f168490d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        boolean z272 = longVideoFullScreenView152.f166375z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.e(longVideoFullScreenView152, z272);
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f168490d).k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
    }
}
