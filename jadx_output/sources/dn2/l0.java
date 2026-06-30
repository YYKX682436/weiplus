package dn2;

/* loaded from: classes3.dex */
public final class l0 implements dn2.e {
    @Override // dn2.e
    public java.lang.Integer a() {
        return null;
    }

    @Override // dn2.e
    public java.lang.Object b(android.view.View view, dk2.zf zfVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object b17 = kotlinx.coroutines.k1.b(3000L, continuation);
        return b17 == pz5.a.f359186d ? b17 : jz5.f0.f302826a;
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = i65.a.a(rootView.getContext(), 104.0f);
        }
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.b1u);
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.ren);
        textView.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mop));
        textView.setTextColor(rootView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        findViewById.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingConsumedItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingConsumedItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new dn2.k0(this));
        e(1);
        return rootView;
    }

    public final void e(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("msg_type", 1);
        jSONObject.put("msg_txt", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mop));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327239j2, t17, 0L, null, null, null, null, null, 252, null);
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dqw;
    }
}
