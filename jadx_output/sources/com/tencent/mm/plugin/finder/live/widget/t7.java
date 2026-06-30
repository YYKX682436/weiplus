package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class t7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f119873a;

    public t7(android.view.ViewGroup root, yz5.l callback) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f486939my2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        this.f119873a = wxRecyclerView;
        wxRecyclerView.i(new com.tencent.mm.plugin.finder.live.widget.s7(this));
    }
}
