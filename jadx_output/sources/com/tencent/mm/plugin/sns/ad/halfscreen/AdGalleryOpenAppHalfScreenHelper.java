package com.tencent.mm.plugin.sns.ad.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/halfscreen/AdGalleryOpenAppHalfScreenHelper;", "Lcom/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenOpenAppHelper;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class AdGalleryOpenAppHalfScreenHelper extends com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f162663o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f162664p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f162665q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f162666r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f162667s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f162668t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.FrameLayout f162669u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.FrameLayout f162670v;

    public AdGalleryOpenAppHalfScreenHelper(android.content.Context context) {
        super(context);
        this.f162663o = "AdGalleryOpenAppHalfScreenHelper";
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        return com.tencent.mm.R.layout.dpm;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        return this.f162663o;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void j() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f162664p;
        boolean z17 = false;
        if (k0Var2 != null && k0Var2.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.f162664p) != null) {
            k0Var.u();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void n() {
        java.lang.String str;
        k44.h b17;
        android.widget.TextView textView;
        java.lang.String str2;
        k44.h b18;
        k44.h b19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        super.n();
        h44.c d17 = d();
        java.util.List list = null;
        if (d17 == null || (b19 = d17.b()) == null) {
            str = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            str = b19.f304095j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
        }
        if (!(str == null || str.length() == 0) && (textView = this.f162665q) != null) {
            h44.c d18 = d();
            if (d18 == null || (b18 = d18.b()) == null) {
                str2 = null;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
                str2 = b18.f304095j;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            }
            textView.setText(str2);
        }
        h44.c d19 = d();
        if (d19 != null && (b17 = d19.b()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppImageList", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            list = b17.f304096k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppImageList", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
        }
        s(list);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }

    public int p() {
        int i17;
        k44.h b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        h44.c d17 = d();
        if (d17 == null || (b17 = d17.b()) == null) {
            i17 = 0;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            i17 = b17.f304091f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        return i17;
    }

    public int q() {
        int i17;
        k44.h b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        h44.c d17 = d();
        if (d17 == null || (b17 = d17.b()) == null) {
            i17 = 0;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            i17 = b17.f304092g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        return i17;
    }

    public void r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initExpandAreaClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout = this.f162668t;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new g44.t(this));
        }
        android.widget.FrameLayout frameLayout2 = this.f162669u;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new g44.u(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initExpandAreaClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }

    public final void s(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshGalleryUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (g() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshGalleryUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            return;
        }
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        int b17 = i65.a.b(g(), 55) * 2;
        int b18 = i65.a.b(g(), 8);
        int i18 = ((i17 - b17) - (b18 * 2)) / 3;
        int i19 = (i18 * 16) / 9;
        int i27 = 0;
        if (!(list == null || list.isEmpty())) {
            int size = list.size();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int i28 = i27 + 1;
                java.lang.String str = (java.lang.String) it.next();
                com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = new com.tencent.mm.ui.widget.MMRoundCornerImageView(g());
                mMRoundCornerImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                mMRoundCornerImageView.setRadius(i65.a.b(g(), 6));
                a84.m.a(str, mMRoundCornerImageView);
                android.widget.LinearLayout linearLayout = this.f162666r;
                if (linearLayout != null) {
                    linearLayout.addView(mMRoundCornerImageView);
                }
                android.view.ViewGroup.LayoutParams layoutParams = mMRoundCornerImageView.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = i18;
                    marginLayoutParams.height = i19;
                } else {
                    marginLayoutParams = null;
                }
                if (i27 != size - 1 && marginLayoutParams != null) {
                    marginLayoutParams.rightMargin = b18;
                }
                i27 = i28;
            }
        }
        android.widget.LinearLayout linearLayout2 = this.f162666r;
        java.lang.Object layoutParams2 = linearLayout2 != null ? linearLayout2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.height = i19;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshGalleryUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }

    public void t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnBottomSheetDismissListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f162664p;
        if (k0Var != null) {
            k0Var.p(new g44.v(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnBottomSheetDismissListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }

    public final void u(h44.c cVar) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.ui.widget.dialog.k0 k0Var2;
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e(i(), "showBottomSheet, adOpenAppParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            return;
        }
        m(cVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        boolean z17 = false;
        if (this.f162664p == null) {
            k();
            android.view.View f17 = f();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = f17 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) f17.findViewById(com.tencent.mm.R.id.close_icon) : null;
            android.view.View f18 = f();
            this.f162665q = f18 != null ? (android.widget.TextView) f18.findViewById(com.tencent.mm.R.id.a0x) : null;
            android.view.View f19 = f();
            this.f162666r = f19 != null ? (android.widget.LinearLayout) f19.findViewById(com.tencent.mm.R.id.ghu) : null;
            if (weImageView != null) {
                weImageView.setOnClickListener(new g44.w(this));
            }
            if (p() == 1) {
                android.view.View f27 = f();
                this.f162667s = f27 != null ? (android.widget.LinearLayout) f27.findViewById(com.tencent.mm.R.id.qep) : null;
                android.view.View f28 = f();
                this.f162668t = f28 != null ? (android.widget.FrameLayout) f28.findViewById(com.tencent.mm.R.id.qer) : null;
                android.view.View f29 = f();
                this.f162669u = f29 != null ? (android.widget.FrameLayout) f29.findViewById(com.tencent.mm.R.id.qeq) : null;
                android.view.View f37 = f();
                this.f162670v = f37 != null ? (android.widget.FrameLayout) f37.findViewById(com.tencent.mm.R.id.mbp) : null;
                r();
                android.widget.FrameLayout frameLayout = this.f162669u;
                if (frameLayout != null) {
                    frameLayout.setOnTouchListener(new g44.x(this));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doExpandClickAreaLogic", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
                android.view.View f38 = f();
                if (f38 != null && (viewTreeObserver = f38.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnPreDrawListener(new g44.s(this));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doExpandClickAreaLogic", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            }
            this.f162664p = new com.tencent.mm.ui.widget.dialog.k0(g(), 1, false);
            android.view.View f39 = f();
            android.view.ViewGroup.LayoutParams layoutParams = f39 != null ? f39.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            android.view.View f47 = f();
            android.view.ViewGroup.LayoutParams layoutParams2 = f47 != null ? f47.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f162664p;
            if (k0Var3 != null) {
                k0Var3.s(f(), true);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var4 = this.f162664p;
            if (k0Var4 != null) {
                k0Var4.V1 = true;
            }
            if (k0Var4 != null) {
                k0Var4.e(true);
            }
            if (q() == 1 && (k0Var2 = this.f162664p) != null) {
                k0Var2.n(false);
            }
            t();
        }
        a();
        n();
        com.tencent.mm.ui.widget.dialog.k0 k0Var5 = this.f162664p;
        if (k0Var5 != null && !k0Var5.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.f162664p) != null) {
            k0Var.v();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }
}
