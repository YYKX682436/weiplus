package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout f132191a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout f132192b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f132193c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f132194d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f132195e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f132196f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f132197g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.MultiCodeMaskView f132198h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View.OnClickListener f132199i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.e f132200j;

    public h(oy2.m dialog, com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout container) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        kotlin.jvm.internal.o.g(container, "container");
        this.f132191a = container;
        android.content.Context g17 = dialog.g();
        android.view.View findViewById = container.findViewById(com.tencent.mm.R.id.f487699pi0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f132192b = (com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout) findViewById;
        this.f132194d = (com.tencent.mm.ui.widget.MMProcessBar) container.findViewById(com.tencent.mm.R.id.f484988g53);
        android.view.View findViewById2 = container.findViewById(com.tencent.mm.R.id.f484989g54);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f132195e = findViewById2;
        android.view.View findViewById3 = container.findViewById(com.tencent.mm.R.id.jun);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f132198h = (com.tencent.mm.plugin.scanner.MultiCodeMaskView) findViewById3;
        this.f132196f = (android.widget.ImageView) container.findViewById(com.tencent.mm.R.id.f483756bz0);
        this.f132197g = (android.widget.ImageView) container.findViewById(com.tencent.mm.R.id.bzj);
        um5.d dVar = new um5.d();
        android.content.res.Resources resources = g17.getResources();
        int dimensionPixelSize = resources != null ? resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db) : 0;
        android.content.res.Resources resources2 = g17.getResources();
        int dimensionPixelSize2 = resources2 != null ? resources2.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) : 0;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(dimensionPixelSize2));
        arrayList.add(java.lang.Integer.valueOf(dimensionPixelSize));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "setBlur", "(FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "setBlur", "(FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        createBitmap.eraseColor(android.graphics.Color.parseColor("#CCFDFDFD"));
        dVar.b(createBitmap);
        dVar.f429141b = dimensionPixelSize;
        dVar.f429142c = dimensionPixelSize2;
        uq5.b b17 = dVar.f429144e.f429193b.b();
        b17.d(40.0f);
        b17.e(5.0f);
        dVar.a(new com.tencent.mm.plugin.finder.view.g(this));
        android.widget.ImageView imageView = this.f132197g;
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(g17.getResources().getColor(com.tencent.mm.R.color.f478497h)));
        }
        android.view.View view = this.f132195e;
        if (view == null) {
            kotlin.jvm.internal.o.o("mRetryContainer");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.view.f(this));
        container.setDialog(dialog);
        a();
        this.f132200j = new com.tencent.mm.plugin.finder.view.e(this);
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogHelper", "showProgress");
        com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout relativeInterceptScrollLayout = this.f132192b;
        if (relativeInterceptScrollLayout == null) {
            kotlin.jvm.internal.o.o("mWebViewContainer");
            throw null;
        }
        relativeInterceptScrollLayout.setVisibility(4);
        android.view.View view = this.f132195e;
        if (view == null) {
            kotlin.jvm.internal.o.o("mRetryContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f132194d;
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(0);
        }
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = this.f132194d;
        if (mMProcessBar2 != null) {
            mMProcessBar2.d();
        }
    }
}
