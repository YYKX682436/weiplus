package dn2;

/* loaded from: classes.dex */
public final class h0 implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241917a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241918b;

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
        this.f241917a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f241918b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.reo);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show MMFinder_LiveAppMsg_Type_LOCAL_SELF_ENTER ");
        java.lang.Object D = liveMsg.D();
        if (D == null) {
            D = "";
        }
        sb6.append(pm0.b0.g(D));
        com.tencent.mars.xlog.Log.i("LiveSelfEnterBulletItem", sb6.toString());
        java.lang.Object D2 = liveMsg.D();
        r45.vw1 vw1Var = D2 instanceof r45.vw1 ? (r45.vw1) D2 : null;
        if (vw1Var != null) {
            if (vw1Var.getInteger(0) == 5) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Cj(ml2.g5.f327499z, 1);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveSelfEnterBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveSelfEnterBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view = this.f241917a;
                if (view == null) {
                    kotlin.jvm.internal.o.o("bulletContent");
                    throw null;
                }
                view.setOnClickListener(dn2.f0.f241909d);
                android.view.View view2 = this.f241917a;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("bulletContent");
                    throw null;
                }
                view2.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.d3p));
            } else {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Cj(ml2.g5.f327499z, 2);
                android.view.View view3 = this.f241917a;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("bulletContent");
                    throw null;
                }
                view3.setOnClickListener(dn2.g0.f241911d);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveSelfEnterBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveSelfEnterBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f241917a;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("bulletContent");
                    throw null;
                }
                view4.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
            }
            android.widget.TextView textView = this.f241918b;
            if (textView == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            textView.setText(vw1Var.getString(1));
        }
        android.widget.TextView textView2 = this.f241918b;
        if (textView2 != null) {
            textView2.setTextColor(rootView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            return rootView;
        }
        kotlin.jvm.internal.o.o("bulletContentTv");
        throw null;
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dqy;
    }
}
