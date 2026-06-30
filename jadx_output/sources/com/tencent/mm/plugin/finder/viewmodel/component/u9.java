package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class u9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f136112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC f136113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136114f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC, in5.s0 s0Var) {
        super(0);
        this.f136112d = viewGroup;
        this.f136113e = finderDescPanelUIC;
        this.f136114f = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f136112d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = -2;
        viewGroup.setLayoutParams(layoutParams);
        this.f136113e.P6(this.f136114f);
        return jz5.f0.f302826a;
    }
}
