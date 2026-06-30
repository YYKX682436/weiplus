package dn2;

/* loaded from: classes3.dex */
public final class e0 implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241906a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241907b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f241906a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f241907b = textView;
        textView.setTextColor(rootView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        android.view.View view = this.f241906a;
        if (view == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        view.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f483515b23);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeV2BulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeV2BulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.content.Context context = rootView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.widget.TextView textView2 = this.f241907b;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        android.text.TextPaint paint = textView2.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        java.lang.String k17 = liveMsg.k();
        if (k17 == null) {
            k17 = "";
        }
        java.lang.String obj = c61.yb.nf(ybVar, context, paint, k17, 0, 8, null).toString();
        java.lang.Object D = liveMsg.D();
        if (D != null && (D instanceof r45.yi1)) {
            java.lang.String str = obj + ' ' + ((r45.yi1) D).getString(1);
            android.widget.TextView textView3 = this.f241907b;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            textView3.setText(str);
            cn2.l.f43568a.c(2, false);
            com.tencent.mars.xlog.Log.i("LiveLikeV2BulletItem", "show bullet: " + str);
        }
        return rootView;
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dex;
    }
}
