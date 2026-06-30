package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ne implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.SoftReference f113626d;

    public ne(java.lang.ref.SoftReference softReference) {
        this.f113626d = softReference;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar;
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.ref.SoftReference softReference = this.f113626d;
        if (softReference != null && (mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) softReference.get()) != null) {
            boolean z17 = !booleanValue;
            mgVar.C1().post(new com.tencent.mm.plugin.finder.live.plugin.uf(intValue, mgVar));
            if (z17) {
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500L);
                alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.finder.live.plugin.dg(mgVar));
                mgVar.f113507t.startAnimation(alphaAnimation);
            } else {
                android.view.View view = mgVar.f113507t;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "unDoDescSticky", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "unDoDescSticky", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
