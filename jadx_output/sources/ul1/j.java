package ul1;

/* loaded from: classes7.dex */
public final class j extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f428583b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f428584c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f428585d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        this(context, true);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final ul1.j a(java.lang.CharSequence charSequence) {
        boolean z17 = this.f428583b;
        android.widget.TextView textView = this.f428584c;
        if (!z17) {
            textView.setText(charSequence);
            textView.setContentDescription(charSequence);
            return this;
        }
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(4);
        } else {
            textView.setLineSpacing(0.0f, 1.0f);
            textView.setSpannableFactory(new ul1.m(i65.a.b(getContentView().getContext(), 17)));
            textView.setText(charSequence, android.widget.TextView.BufferType.SPANNABLE);
            textView.setVisibility(0);
            getContentView().findViewById(com.tencent.mm.R.id.mvs).setPadding(0, i65.a.b(getContentView().getContext(), 27), 0, 0);
            textView.setContentDescription(charSequence);
        }
        return this;
    }

    public final void b(long j17) {
        android.app.Activity a17 = q75.a.a(getContentView().getContext());
        if (a17 != null) {
            showAtLocation(a17.findViewById(android.R.id.content), 17, 0, 0);
            this.f428584c.requestFocus();
            if (j17 != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                com.tencent.mm.sdk.platformtools.u3.i(new ul1.k(this), j17);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, boolean z17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f428583b = z17;
        android.graphics.drawable.Drawable drawable = null;
        if (z17) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            android.view.View.inflate(context, com.tencent.mm.R.layout.f488092h2, frameLayout);
            setContentView(frameLayout);
            android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.lbi);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "<init>", "(Landroid/content/Context;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "<init>", "(Landroid/content/Context;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = (android.widget.ImageView) getContentView().findViewById(com.tencent.mm.R.id.hlr);
            this.f428585d = imageView;
            android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.obc);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            this.f428584c = (android.widget.TextView) findViewById2;
            android.graphics.drawable.Drawable drawable2 = b3.l.getDrawable(context, com.tencent.mm.R.drawable.bds);
            if (drawable2 != null) {
                drawable2.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP));
                drawable = drawable2;
            }
            kotlin.jvm.internal.o.d(imageView);
            imageView.setVisibility(0);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            android.view.View findViewById3 = getContentView().findViewById(com.tencent.mm.R.id.lbi);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
            android.view.View.inflate(context, com.tencent.mm.R.layout.f488091h1, frameLayout2);
            setContentView(frameLayout2);
            android.view.View findViewById4 = getContentView().findViewById(com.tencent.mm.R.id.obc);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            this.f428584c = (android.widget.TextView) findViewById4;
            this.f428585d = null;
        }
        setFocusable(true);
        getContentView().setFocusable(true);
        this.f428584c.setFocusable(true);
    }
}
