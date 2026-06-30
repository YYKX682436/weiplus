package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class cl implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f128998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f128999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI f129001d;

    public cl(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, android.view.View view, com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI finderWxProfileJumpDetailUI) {
        this.f128998a = h0Var;
        this.f128999b = refreshLoadMoreLayout;
        this.f129000c = view;
        this.f129001d = finderWxProfileJumpDetailUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.ui.bl((com.tencent.mm.modelbase.f) obj, this.f128998a, this.f128999b, this.f129000c, this.f129001d));
        return jz5.f0.f302826a;
    }
}
