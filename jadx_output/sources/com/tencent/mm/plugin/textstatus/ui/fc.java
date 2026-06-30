package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes2.dex */
public final class fc extends com.tencent.mm.plugin.textstatus.ui.cc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f173875a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f173876b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f173877c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f173878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(java.lang.String statusID, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, int i17, kotlin.jvm.internal.i iVar) {
        super(adapter);
        refreshLoadMoreLayout = (i17 & 4) != 0 ? null : refreshLoadMoreLayout;
        kotlin.jvm.internal.o.g(statusID, "statusID");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f173875a = statusID;
        this.f173876b = refreshLoadMoreLayout;
        com.tencent.mm.plugin.textstatus.ui.ec ecVar = new com.tencent.mm.plugin.textstatus.ui.ec(this, adapter);
        this.f173877c = ecVar;
        gm0.j1.d().a(6621, ecVar);
    }
}
