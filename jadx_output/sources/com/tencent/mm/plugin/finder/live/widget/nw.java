package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class nw extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f119210h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f119211i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f119212m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f119213n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(android.content.Context context, boolean z17, yz5.l switchRoleSucceeded) {
        super(context, false, zl2.u4.f473988d, false, 10, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(switchRoleSucceeded, "switchRoleSucceeded");
        this.f119210h = z17;
        this.f119211i = switchRoleSucceeded;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.do_;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        rootView.findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.fw(this));
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.qos);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119212m = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.r9c);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f119213n = (android.widget.TextView) findViewById2;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f119212m;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this.f118381d));
        } else {
            kotlin.jvm.internal.o.o("roleListView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        java.util.List list;
        android.widget.TextView textView = this.f119213n;
        if (textView == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView);
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if (c1Var == null || (list = c1Var.V3) == null) {
            list = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new cm2.e((r45.of1) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (this.f119210h && list.size() < 3) {
            arrayList.add(new cm2.d());
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f119212m;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("roleListView");
            throw null;
        }
        recyclerView.setAdapter(new com.tencent.mm.plugin.finder.live.widget.gw(arrayList, new com.tencent.mm.plugin.finder.live.view.convert.FinderLiveSwitchRoleConvertFactory(new com.tencent.mm.plugin.finder.live.widget.hw(this, list), new com.tencent.mm.plugin.finder.live.widget.iw(this, list))));
        super.w();
    }
}
