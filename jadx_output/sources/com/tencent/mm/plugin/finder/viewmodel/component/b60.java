package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f133841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f133842e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC) {
        super(0);
        this.f133841d = appCompatActivity;
        this.f133842e = finderSpeedControlUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.plugin.finder.viewmodel.component.x60(this.f133841d, this.f133842e.getContext());
    }
}
