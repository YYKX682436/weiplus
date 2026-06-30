package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class px extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f119455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(com.tencent.mm.plugin.finder.live.widget.rx rxVar) {
        super(1);
        this.f119455d = rxVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f119455d.M;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("cardRv");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$timeRvAdapter$2$1$1", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$timeRvAdapter$2$1$1", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        return jz5.f0.f302826a;
    }
}
