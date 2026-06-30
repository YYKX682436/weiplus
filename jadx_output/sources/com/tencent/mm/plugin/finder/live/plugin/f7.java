package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class f7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f112506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        super(1);
        this.f112506d = x7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f112506d.f115038r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$7", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$7", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        return jz5.f0.f302826a;
    }
}
