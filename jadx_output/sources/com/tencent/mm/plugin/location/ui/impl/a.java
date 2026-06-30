package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public abstract class a extends ab3.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f144728d;

    /* renamed from: e, reason: collision with root package name */
    public za3.d f144729e;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.f f144733i;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f144736o;

    /* renamed from: r, reason: collision with root package name */
    public int f144739r;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.location_soso.api.SoSoMapView f144741t;

    /* renamed from: u, reason: collision with root package name */
    public long f144742u;

    /* renamed from: w, reason: collision with root package name */
    public i11.e f144744w;

    /* renamed from: f, reason: collision with root package name */
    public int f144730f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.location.model.LocationInfo f144731g = new com.tencent.mm.plugin.location.model.LocationInfo(false);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.location.model.LocationInfo f144732h = new com.tencent.mm.plugin.location.model.LocationInfo(false);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f144734m = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f144737p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f144738q = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f144740s = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f144743v = "";

    /* renamed from: x, reason: collision with root package name */
    public final u60.e f144745x = new com.tencent.mm.plugin.location.ui.impl.c(this);

    /* renamed from: n, reason: collision with root package name */
    public final u60.f f144735n = ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi();

    public a(android.app.Activity activity) {
        this.f144728d = activity;
    }

    @Override // ab3.e
    public void d() {
        this.f144728d.finish();
    }

    public abstract void j();

    public abstract void k();

    public void l() {
        android.app.Activity activity = this.f144728d;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.location.ui.RemarkUI.class);
        intent.putExtra("key_nullable", true);
        java.lang.String str = this.f144736o;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_value", str);
        intent.putExtra("key_hint", activity.getString(com.tencent.mm.R.string.ggs));
        intent.putExtra("Kwebmap_locaion", this.f144731g.f144589h);
        intent.putExtra("kFavInfoLocalId", n().getLongExtra("kFavInfoLocalId", -1L));
        intent.putExtra("kRemark", n().getStringExtra("kRemark"));
        android.app.Activity activity2 = this.f144728d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4096);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "editRemark", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public android.view.View m(int i17) {
        return this.f144728d.findViewById(i17);
    }

    public android.content.Intent n() {
        return this.f144728d.getIntent();
    }

    public abstract int o();

    public void p() {
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        android.app.Activity activity = this.f144728d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    public boolean q() {
        com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer repairerConfigLocationPoiDrawer = new com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer();
        return j62.e.g().c(repairerConfigLocationPoiDrawer) == 1 || bm5.o1.f22719a.h(repairerConfigLocationPoiDrawer) == 1;
    }

    public void r() {
        com.tencent.mm.plugin.location.ui.impl.f fVar = this.f144733i;
        android.widget.TextView textView = fVar.f144807i;
        if (textView == null || fVar.f144808j == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f144733i.f144807i.getContext();
        java.lang.String str = this.f144736o;
        float textSize = this.f144733i.f144807i.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        java.util.ArrayList arrayList = this.f144738q;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f144733i.f144808j.setText("");
            return;
        }
        java.lang.String str2 = (java.lang.String) this.f144738q.get(0);
        java.lang.String string = this.f144728d.getResources().getString(com.tencent.mm.R.string.cdl);
        for (int i17 = 1; i17 < this.f144738q.size(); i17++) {
            str2 = str2 + string + ((java.lang.String) this.f144738q.get(i17));
        }
        android.widget.TextView textView2 = this.f144733i.f144808j;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = this.f144733i.f144808j.getContext();
        float textSize2 = this.f144733i.f144808j.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str2, textSize2));
    }

    public void s(int i17) {
        this.f144733i.f144806h.setBackgroundColor(i17);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.ui.uk.g(i17));
        if (valueOf.booleanValue()) {
            this.f144733i.f144800b.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
            this.f144733i.f144801c.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
            this.f144733i.f144805g.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479549ab0));
        } else {
            this.f144733i.f144800b.getDrawable().setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
            this.f144733i.f144801c.getDrawable().setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
            this.f144733i.f144805g.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478719fa));
        }
        android.view.Window window = this.f144728d.getWindow();
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        fp.m.e();
        this.f144728d.getWindow().setStatusBarColor(i17);
        android.view.View decorView = this.f144728d.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility((valueOf.booleanValue() ? systemUiVisibility & (-8193) : systemUiVisibility | 8192) | 1280);
    }
}
