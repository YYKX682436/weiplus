package vk2;

/* loaded from: classes3.dex */
public final class b implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vk2.h f437756d;

    public b(vk2.h hVar) {
        this.f437756d = hVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        vk2.h hVar = this.f437756d;
        int i18 = hVar.f437768q;
        java.util.ArrayList arrayList = hVar.f437766o;
        arrayList.size();
        hVar.a();
        if (hVar.f437768q < arrayList.size() && i17 < arrayList.size()) {
            rk2.r.f396485a.a(5, ((sk2.a) arrayList.get(i17)).f408951d.f428522b.f379274e, ((sk2.a) arrayList.get(hVar.f437768q)).f408951d.f428522b.f379274e);
        }
        com.tencent.mm.plugin.finder.live.plugin.zz zzVar = (com.tencent.mm.plugin.finder.live.plugin.zz) hVar.f437762h;
        zzVar.getClass();
        rk2.q w17 = zzVar.w1();
        int size = (w17.f396472c.size() * 10000) + i17;
        com.tencent.mars.xlog.Log.i("MultiStreamWidget", "notifySelected position: " + i17 + " pos: " + size);
        com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView multiStreamRecyclerView = w17.f396471b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(size));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(multiStreamRecyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "notifySelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        multiStreamRecyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(multiStreamRecyclerView, "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "notifySelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        w17.f396484o = true;
    }
}
