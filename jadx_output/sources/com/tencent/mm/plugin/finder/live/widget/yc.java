package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class yc {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f120431h = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.rc f120432a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f120433b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.PopupWindow f120434c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f120435d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f120436e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f120437f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f120438g;

    public yc(com.tencent.mm.plugin.finder.live.widget.rc builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f120432a = builder;
        android.view.View inflate = android.view.LayoutInflater.from(builder.f119619a).inflate(com.tencent.mm.R.layout.cfy, (android.view.ViewGroup) null);
        this.f120433b = inflate;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -1, -2, true);
        this.f120434c = popupWindow;
        this.f120435d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a4x);
        this.f120436e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a4q);
        this.f120437f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qbn);
        popupWindow.setOutsideTouchable(builder.f119630l);
    }

    public final void a(android.widget.ImageView imageView, int i17) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
        android.graphics.drawable.LayerDrawable layerDrawable = drawable2 instanceof android.graphics.drawable.LayerDrawable ? (android.graphics.drawable.LayerDrawable) drawable2 : null;
        if (layerDrawable != null && (drawable = layerDrawable.getDrawable(0)) != null) {
            drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(this.f120432a.f119624f, android.graphics.PorterDuff.Mode.SRC_IN));
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = i17 - (imageView.getWidth() / 2);
        }
    }

    public final void b(android.view.View attachView, kotlinx.coroutines.y0 scope) {
        android.graphics.drawable.Drawable mutate;
        kotlin.jvm.internal.o.g(attachView, "attachView");
        kotlin.jvm.internal.o.g(scope, "scope");
        com.tencent.mm.plugin.finder.live.widget.rc rcVar = this.f120432a;
        if ((rcVar.f119626h.length() == 0) || !attachView.isShown()) {
            com.tencent.mars.xlog.Log.i("FinderLiveCommonGuideWidget", "showWidget msg: " + rcVar.f119626h + " isShown: " + attachView.isShown() + " attachView = " + attachView);
            return;
        }
        boolean z17 = rcVar.f119627i.length() > 0;
        java.util.HashMap hashMap = f120431h;
        if (z17 && kotlin.jvm.internal.o.b(hashMap.get(rcVar.f119627i), java.lang.Boolean.TRUE)) {
            com.tencent.mars.xlog.Log.i("FinderLiveCommonGuideWidget", "showWidget has call show, key: " + rcVar.f119627i);
            return;
        }
        hashMap.put(rcVar.f119627i, java.lang.Boolean.TRUE);
        java.lang.String str = rcVar.f119626h;
        android.widget.TextView textView = this.f120437f;
        textView.setText(str);
        android.graphics.drawable.Drawable background = textView.getBackground();
        if (background != null && (mutate = background.mutate()) != null) {
            mutate.setTint(rcVar.f119624f);
        }
        textView.setTextColor(rcVar.f119625g);
        this.f120433b.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.uc(this, attachView));
        kotlinx.coroutines.l.d(scope, null, null, new com.tencent.mm.plugin.finder.live.widget.xc(attachView, this, null), 3, null);
    }
}
