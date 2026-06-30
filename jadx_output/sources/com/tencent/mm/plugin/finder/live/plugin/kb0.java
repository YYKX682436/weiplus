package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ob0 f113212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var) {
        super(0);
        this.f113212d = ob0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView multiRecyclerView;
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = this.f113212d;
        ob0Var.f113734r.setAlpha(1.0f);
        com.tencent.mm.plugin.finder.live.plugin.zz zzVar = (com.tencent.mm.plugin.finder.live.plugin.zz) ob0Var.X0(com.tencent.mm.plugin.finder.live.plugin.zz.class);
        if (zzVar != null) {
            multiRecyclerView = zzVar.w1().f396471b;
            kotlin.jvm.internal.o.f(multiRecyclerView, "multiRecyclerView");
        } else {
            multiRecyclerView = null;
        }
        if (multiRecyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView multiStreamRecyclerView = multiRecyclerView;
            yj0.a.d(multiStreamRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$startPlay$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            multiRecyclerView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(multiStreamRecyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$startPlay$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f302826a;
    }
}
