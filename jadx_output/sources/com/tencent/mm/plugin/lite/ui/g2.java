package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class g2 implements com.tencent.mm.plugin.lite.ui.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI f144411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f144412b;

    public g2(com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI, kotlin.jvm.internal.h0 h0Var) {
        this.f144411a = wxaLiteAppSheetUI;
        this.f144412b = h0Var;
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void a() {
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void b(float f17) {
        com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI = this.f144411a;
        int i17 = (int) f17;
        int i18 = ((int) wxaLiteAppSheetUI.f144358i) - i17;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        wxaLiteAppSheetUI.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        wxaLiteAppSheetUI.R6((android.view.View) this.f144412b.f310123d, i18 == displayMetrics.heightPixels);
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener = wxaLiteAppSheetUI.f144361o.f143416m;
        if (liteAppHalfScreenStatusChangeListener != null) {
            double d17 = wxaLiteAppSheetUI.f144358i;
            int i19 = ((int) d17) - i17;
            int i27 = (int) d17;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("KEY_ACTION", 15);
            bundle.putInt("KEY_CUR_HEIGHT", i19);
            bundle.putInt("BASE_HEIGHT", i27);
            liteAppHalfScreenStatusChangeListener.f143419e.send(0, bundle);
        }
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void c(com.tencent.mm.plugin.lite.ui.a type) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI = this.f144411a;
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout = (com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) wxaLiteAppSheetUI.findViewById(com.tencent.mm.R.id.gd9);
        if (scrollableFrameLayout == null) {
            kd.c.e(wxaLiteAppSheetUI.f144353d, "onAnimationEnd: contentView is null, skip animation end callback", new java.lang.Object[0]);
            return;
        }
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener = wxaLiteAppSheetUI.f144361o.f143416m;
            if (liteAppHalfScreenStatusChangeListener != null) {
                liteAppHalfScreenStatusChangeListener.a(com.tencent.mm.plugin.lite.api.m.CLOSE_END);
            }
            wxaLiteAppSheetUI.f144357h = true;
            wxaLiteAppSheetUI.finish();
        } else if (ordinal == 1) {
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener2 = wxaLiteAppSheetUI.f144361o.f143416m;
            if (liteAppHalfScreenStatusChangeListener2 != null) {
                liteAppHalfScreenStatusChangeListener2.a(com.tencent.mm.plugin.lite.api.m.FULL_SCREEN_END);
            }
            wxaLiteAppSheetUI.R6(scrollableFrameLayout, true);
        } else if (ordinal == 2) {
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener3 = wxaLiteAppSheetUI.f144361o.f143416m;
            if (liteAppHalfScreenStatusChangeListener3 != null) {
                liteAppHalfScreenStatusChangeListener3.a(com.tencent.mm.plugin.lite.api.m.OPEN_END);
            }
        } else if (ordinal == 3) {
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener4 = wxaLiteAppSheetUI.f144361o.f143416m;
            if (liteAppHalfScreenStatusChangeListener4 != null) {
                liteAppHalfScreenStatusChangeListener4.a(com.tencent.mm.plugin.lite.api.m.RESUME_HALF_SCREEN_END);
            }
            wxaLiteAppSheetUI.P6(false);
        }
        int ordinal2 = type.ordinal();
        if (ordinal2 == 0) {
            str = "onHide";
        } else if (ordinal2 == 1) {
            str = "onFullScreen";
        } else if (ordinal2 == 2) {
            str = "onShow";
        } else {
            if (ordinal2 != 3) {
                throw new jz5.j();
            }
            str = "onResume";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", str);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(wxaLiteAppSheetUI.f144355f.f46063p, 0L, "app.halfScreen.animationEnd", jSONObject);
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void d(com.tencent.mm.plugin.lite.ui.a type) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI = this.f144411a;
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout = (com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) wxaLiteAppSheetUI.findViewById(com.tencent.mm.R.id.gd9);
        if (scrollableFrameLayout == null) {
            kd.c.e(wxaLiteAppSheetUI.f144353d, "onAnimationStart: contentView is null, skip animation start callback", new java.lang.Object[0]);
            return;
        }
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener = wxaLiteAppSheetUI.f144361o.f143416m;
            if (liteAppHalfScreenStatusChangeListener != null) {
                liteAppHalfScreenStatusChangeListener.a(com.tencent.mm.plugin.lite.api.m.CLOSE_START);
            }
        } else if (ordinal == 1) {
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener2 = wxaLiteAppSheetUI.f144361o.f143416m;
            if (liteAppHalfScreenStatusChangeListener2 != null) {
                liteAppHalfScreenStatusChangeListener2.a(com.tencent.mm.plugin.lite.api.m.FULL_SCREEN_START);
            }
            wxaLiteAppSheetUI.P6(true);
        } else if (ordinal == 2) {
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener3 = wxaLiteAppSheetUI.f144361o.f143416m;
            if (liteAppHalfScreenStatusChangeListener3 != null) {
                liteAppHalfScreenStatusChangeListener3.a(com.tencent.mm.plugin.lite.api.m.OPEN_START);
            }
        } else if (ordinal == 3) {
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener liteAppHalfScreenStatusChangeListener4 = wxaLiteAppSheetUI.f144361o.f143416m;
            if (liteAppHalfScreenStatusChangeListener4 != null) {
                liteAppHalfScreenStatusChangeListener4.a(com.tencent.mm.plugin.lite.api.m.RESUME_HALF_SCREEN_START);
            }
            wxaLiteAppSheetUI.R6(scrollableFrameLayout, false);
        }
        int ordinal2 = type.ordinal();
        if (ordinal2 == 0) {
            str = "onHide";
        } else if (ordinal2 == 1) {
            str = "onFullScreen";
        } else if (ordinal2 == 2) {
            str = "onShow";
        } else {
            if (ordinal2 != 3) {
                throw new jz5.j();
            }
            str = "onResume";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", str);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.tencent.mm.feature.lite.i) g0Var).Uj(wxaLiteAppSheetUI.f144355f.f46063p, 0L, "app.halfScreen.animationStart", jSONObject);
        if (type == com.tencent.mm.plugin.lite.ui.a.f144378d) {
            android.view.View findViewById = wxaLiteAppSheetUI.findViewById(com.tencent.mm.R.id.f485558i41);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.view.ViewPropertyAnimator animate = ((android.widget.FrameLayout) findViewById).animate();
            if (animate != null) {
                animate.setDuration(300L);
                animate.setInterpolator(new android.view.animation.DecelerateInterpolator());
                animate.alpha(0.0f);
                animate.start();
            }
        }
    }
}
