package g44;

/* loaded from: classes4.dex */
public final class g extends j44.j {
    public com.tencent.mm.ui.widget.dialog.k0 A;

    @Override // j44.j
    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDeleteHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDeleteHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        return com.tencent.mm.R.layout.f488668zx;
    }

    @Override // j44.j
    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        return com.tencent.mm.R.layout.f489166bj3;
    }

    @Override // j44.j
    public java.lang.String k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        return "AdDownloadAppHalfScreenHelper";
    }

    @Override // j44.j
    public void l() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.A;
        boolean z17 = false;
        if (k0Var2 != null && k0Var2.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.A) != null) {
            k0Var.u();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void s(int i17, int i18) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        if (f() == null) {
            k();
            com.tencent.mars.xlog.Log.e("AdDownloadAppHalfScreenHelper", "showBottomSheet, adDownloadParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        boolean z17 = false;
        if (this.A == null) {
            m();
            android.view.View g17 = g();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = g17 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) g17.findViewById(com.tencent.mm.R.id.close_icon) : null;
            if (weImageView != null) {
                weImageView.setOnClickListener(new g44.d(this));
            }
            android.view.View i19 = i();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = i19 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) i19.findViewById(com.tencent.mm.R.id.aac) : null;
            if (weImageView2 != null) {
                weImageView2.setOnClickListener(new g44.e(this));
            }
            this.A = new com.tencent.mm.ui.widget.dialog.k0(h(), 1, false);
            android.view.View g18 = g();
            android.view.ViewGroup.LayoutParams layoutParams = g18 != null ? g18.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            android.view.View g19 = g();
            android.view.ViewGroup.LayoutParams layoutParams2 = g19 != null ? g19.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
            }
            if (g() instanceof android.widget.LinearLayout) {
                android.view.View g27 = g();
                kotlin.jvm.internal.o.e(g27, "null cannot be cast to non-null type android.widget.LinearLayout");
                ((android.widget.LinearLayout) g27).setOrientation(1);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.A;
            if (k0Var2 != null) {
                k0Var2.s(g(), true);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.A;
            if (k0Var3 != null) {
                k0Var3.V1 = true;
            }
            if (k0Var3 != null) {
                k0Var3.e(true);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var4 = this.A;
            if (k0Var4 != null) {
                k0Var4.f211854d = new g44.f(this);
            }
        }
        q();
        com.tencent.mm.ui.widget.dialog.k0 k0Var5 = this.A;
        if (k0Var5 != null && !k0Var5.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.A) != null) {
            k0Var.v();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        this.f297705w = currentTimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        b(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void t(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.A;
        if (k0Var != null) {
            k0Var.s(view, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
    }
}
