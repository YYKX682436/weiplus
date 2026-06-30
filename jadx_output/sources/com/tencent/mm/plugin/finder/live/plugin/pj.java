package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f113895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f113896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, int i17, boolean z17) {
        super(0);
        this.f113894d = hmVar;
        this.f113895e = i17;
        this.f113896f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f113894d;
        java.lang.String str = hmVar.f112831r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getGiftListFromCgi resule,:");
        int i17 = this.f113895e;
        sb6.append(i17);
        sb6.append('!');
        com.tencent.mars.xlog.Log.w(str, sb6.toString());
        android.view.View view = hmVar.f112843z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$getGiftListFromCgi$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$getGiftListFromCgi$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f113896f) {
            jz5.l C1 = hmVar.C1();
            hmVar.V1((java.util.List) C1.f302833d, (java.util.LinkedHashMap) C1.f302834e);
        } else {
            hmVar.f112837x.setVisibility(0);
            com.tencent.mars.xlog.Log.w(hmVar.f112831r, "getGiftListFromCgi fail,:" + i17 + '!');
        }
        return jz5.f0.f302826a;
    }
}
