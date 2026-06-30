package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class pp {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f119395a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f119396b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.mn f119397c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f119398d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f119399e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f119400f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f119401g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.c2 f119402h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f119403i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f119404j;

    public pp(gk2.e liveData, android.view.ViewGroup root, com.tencent.mm.plugin.finder.live.widget.mn inviteWidget) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(inviteWidget, "inviteWidget");
        this.f119395a = liveData;
        this.f119396b = root;
        this.f119397c = inviteWidget;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.f484684f53);
        this.f119398d = recyclerView;
        this.f119399e = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.qy6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f119400f = arrayList;
        this.f119401g = new java.util.ArrayList();
        this.f119404j = new java.util.LinkedHashMap();
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(root.getContext()));
        recyclerView.setAdapter(new com.tencent.mm.plugin.finder.live.widget.ip(new com.tencent.mm.plugin.finder.live.mic.pk.factory.FinderLiveAnchorPkConvertFactory(liveData, new com.tencent.mm.plugin.finder.live.widget.jp(this)), arrayList));
        recyclerView.O(new com.tencent.mm.plugin.finder.live.widget.kp(this));
    }
}
