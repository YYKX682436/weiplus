package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes2.dex */
public final class xc extends com.tencent.mm.plugin.textstatus.ui.uc {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f174432b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f174433c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f174434d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f174435e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f174436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(java.lang.String statusID, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter, com.tencent.mm.view.RefreshLoadMoreLayout refreahLayout) {
        super(adapter);
        kotlin.jvm.internal.o.g(statusID, "statusID");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(refreahLayout, "refreahLayout");
        this.f174432b = statusID;
        this.f174433c = refreahLayout;
        com.tencent.mm.plugin.textstatus.ui.wc wcVar = new com.tencent.mm.plugin.textstatus.ui.wc(this, adapter);
        this.f174434d = wcVar;
        gm0.j1.d().a(6621, wcVar);
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.uc
    public boolean a() {
        return this.f174436f;
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.uc
    public void b() {
        gm0.j1.d().g(new ej4.g(this.f174432b, this.f174435e));
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.uc
    public void c() {
        gm0.j1.d().q(6621, this.f174434d);
    }
}
