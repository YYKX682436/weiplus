package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class t20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f119861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var) {
        super(0);
        this.f119861d = e30Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.f119861d;
        e30Var.f118219x.setVisibility(4);
        android.view.ViewGroup viewGroup = e30Var.f365323d;
        com.tencent.mm.plugin.finder.live.widget.e30.t1(e30Var, viewGroup, 1.5f);
        e30Var.f118220y.setAlpha(0.0f);
        viewGroup.postDelayed(new com.tencent.mm.plugin.finder.live.widget.s20(e30Var), 100L);
        viewGroup.postDelayed(e30Var.I, 200L);
        return jz5.f0.f302826a;
    }
}
