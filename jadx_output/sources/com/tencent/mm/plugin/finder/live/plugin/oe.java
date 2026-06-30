package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class oe implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.SoftReference f113745d;

    public oe(java.lang.ref.SoftReference softReference) {
        this.f113745d = softReference;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar;
        java.lang.String content = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.ref.SoftReference softReference = this.f113745d;
        if (softReference != null && (mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) softReference.get()) != null) {
            fk2.k1 k1Var = new fk2.k1(((we2.s) mgVar.S0().a(we2.s.class)).f445255g.d());
            android.content.Context context = mgVar.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            bm2.h1 h1Var = new bm2.h1(mgVar.f113507t);
            java.lang.Object obj3 = mgVar.D.f22180m.get(intValue);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            k1Var.u(context, h1Var, (dk2.zf) obj3, intValue, true);
            android.view.View view = mgVar.f113507t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "doDescSticky", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "doDescSticky", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mgVar.C1().post(new com.tencent.mm.plugin.finder.live.plugin.uf(intValue, mgVar));
        }
        return jz5.f0.f302826a;
    }
}
