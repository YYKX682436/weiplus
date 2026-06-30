package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class bd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.jd f123567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(com.tencent.mm.plugin.finder.profile.uic.jd jdVar) {
        super(0);
        this.f123567d = jdVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fetchEndCallback] totalSize=");
        com.tencent.mm.plugin.finder.profile.uic.jd jdVar = this.f123567d;
        sb6.append(jdVar.O6().getSize());
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
        if (jdVar.getRlLayout().getLoadMoreFooter() != null) {
            jdVar.getRlLayout().E(true);
            jdVar.getRlLayout().C(ym5.x.a(jdVar.getContext(), 160.0f));
            android.view.View findViewById = jdVar.findViewById(com.tencent.mm.R.id.ilh);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileProductUIC$initFeedLoader$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileProductUIC$initFeedLoader$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = jdVar.findViewById(com.tencent.mm.R.id.ilg);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileProductUIC$initFeedLoader$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileProductUIC$initFeedLoader$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
