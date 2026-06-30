package nl2;

/* loaded from: classes3.dex */
public final class g extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f338176m;

    /* renamed from: n, reason: collision with root package name */
    public bm2.m3 f338177n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6() {
        bm2.m3 m3Var = this.f338177n;
        if (m3Var != null) {
            ol2.b a17 = ol2.b.f346142c.a(((mm2.u0) business(mm2.u0.class)).f329448n);
            java.util.ArrayList arrayList = a17.f346143a;
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            pm0.v.b0(arrayList, nl2.a.f338169d);
            m3Var.z(arrayList, a17.f346144b);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        android.content.Context context = pluginLayout.getContext();
        super.onViewMount(pluginLayout);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) pluginLayout.findViewById(com.tencent.mm.R.id.tn6);
        if (recyclerView == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveOuterShortcutWordingController", "cannot find outer_fast_comment_container");
            return;
        }
        kotlin.jvm.internal.o.d(context);
        bm2.m3 m3Var = new bm2.m3(context, bm2.h3.f21939e);
        m3Var.f22098g = new nl2.c(m3Var, this);
        m3Var.notifyDataSetChanged();
        this.f338177n = m3Var;
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = new com.google.android.flexbox.FlexboxLayoutManager(context);
        flexboxLayoutManager.F(1);
        flexboxLayoutManager.E(0);
        flexboxLayoutManager.D(4);
        if (flexboxLayoutManager.f44201f != 0) {
            flexboxLayoutManager.f44201f = 0;
            flexboxLayoutManager.requestLayout();
        }
        recyclerView.setAdapter(this.f338177n);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.z());
        this.f338176m = recyclerView;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.u0) business(mm2.u0.class)).f329446i;
        liveMutableData.f111660d = true;
        liveMutableData.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new nl2.d(this));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f338176m;
        if (recyclerView2 != null) {
            this.f291103i = new nl2.f(new if2.d0(recyclerView2, new nl2.e()));
        }
        Z6();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f338176m = null;
        this.f338177n = null;
    }
}
