package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f119580a;

    /* renamed from: b, reason: collision with root package name */
    public final te2.l0 f119581b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.xg7 f119582c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f119583d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f119584e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f119585f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f119586g;

    /* renamed from: h, reason: collision with root package name */
    public int f119587h;

    public r7(android.view.ViewGroup root, te2.l0 l0Var, r45.xg7 xg7Var, yz5.l callback) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f119580a = root;
        this.f119581b = l0Var;
        this.f119582c = xg7Var;
        this.f119583d = callback;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.jzv);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        this.f119584e = wxRecyclerView;
        this.f119585f = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.qgx);
        wxRecyclerView.i(new com.tencent.mm.plugin.finder.live.widget.o7(this));
    }
}
