package oy2;

/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.webview.n0 f349936a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.FrameLayout f349937b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout f349938c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f349939d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f349940e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f349941f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f349942g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f349943h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.MultiCodeMaskView f349944i;

    /* renamed from: j, reason: collision with root package name */
    public final android.content.Context f349945j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View.OnClickListener f349946k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout f349947l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f349948m;

    /* renamed from: n, reason: collision with root package name */
    public final oy2.u f349949n;

    public a0(com.tencent.mm.plugin.finder.webview.n0 dialogWrapper) {
        kotlin.jvm.internal.o.g(dialogWrapper, "dialogWrapper");
        this.f349936a = dialogWrapper;
        android.content.Context g17 = dialogWrapper.a().g();
        this.f349945j = g17;
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout l17 = dialogWrapper.a().l();
        this.f349947l = l17;
        android.view.View findViewById = l17.findViewById(com.tencent.mm.R.id.bzg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f349937b = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = l17.findViewById(com.tencent.mm.R.id.f487699pi0);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f349938c = (com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout) findViewById2;
        this.f349940e = (com.tencent.mm.ui.widget.MMProcessBar) l17.findViewById(com.tencent.mm.R.id.f484988g53);
        android.view.View findViewById3 = l17.findViewById(com.tencent.mm.R.id.f484989g54);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f349941f = findViewById3;
        android.view.View findViewById4 = l17.findViewById(com.tencent.mm.R.id.jun);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f349944i = (com.tencent.mm.plugin.scanner.MultiCodeMaskView) findViewById4;
        this.f349942g = (android.widget.ImageView) l17.findViewById(com.tencent.mm.R.id.f483756bz0);
        this.f349943h = (android.widget.ImageView) l17.findViewById(com.tencent.mm.R.id.bzj);
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
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "setBlur", "(FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "setBlur", "(FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        createBitmap.eraseColor(android.graphics.Color.parseColor("#CCFDFDFD"));
        dVar.b(createBitmap);
        dVar.f429141b = dimensionPixelSize;
        dVar.f429142c = dimensionPixelSize2;
        uq5.b b17 = dVar.f429144e.f429193b.b();
        b17.d(40.0f);
        b17.e(5.0f);
        dVar.a(new oy2.y(this));
        android.widget.ImageView imageView = this.f349943h;
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(g17.getResources().getColor(com.tencent.mm.R.color.f478497h)));
        }
        android.widget.FrameLayout frameLayout = this.f349937b;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("mCloseView");
            throw null;
        }
        frameLayout.setOnClickListener(new oy2.v(this));
        android.view.View view = this.f349941f;
        if (view == null) {
            kotlin.jvm.internal.o.o("mRetryContainer");
            throw null;
        }
        view.setOnClickListener(new oy2.w(this));
        android.widget.FrameLayout frameLayout2 = this.f349937b;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.o.o("mCloseView");
            throw null;
        }
        frameLayout2.setOnLongClickListener(new oy2.x(this));
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout l18 = dialogWrapper.a().l();
        if (l18 instanceof com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout) {
            l18.setDialog(dialogWrapper.a());
        } else if (l18 instanceof com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout) {
            l18.setDialog(dialogWrapper.a());
        }
        a();
        this.f349949n = new oy2.u(this);
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("Finder.DialogScrollViewHelper", "showProgress");
        com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout relativeInterceptScrollLayout = this.f349938c;
        if (relativeInterceptScrollLayout == null) {
            kotlin.jvm.internal.o.o("mWebViewContainer");
            throw null;
        }
        relativeInterceptScrollLayout.setVisibility(4);
        android.view.View view = this.f349941f;
        if (view == null) {
            kotlin.jvm.internal.o.o("mRetryContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f349940e;
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(0);
        }
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = this.f349940e;
        if (mMProcessBar2 != null) {
            mMProcessBar2.d();
        }
        this.f349947l.setForceHandleEvent(true);
    }
}
