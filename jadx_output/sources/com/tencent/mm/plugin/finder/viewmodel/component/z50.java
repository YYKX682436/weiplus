package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class z50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f136658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC) {
        super(0);
        this.f136658d = finderSpeedControlUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return com.tencent.mm.ui.id.b(this.f136658d.getContext()).inflate(com.tencent.mm.R.layout.b9n, (android.view.ViewGroup) null);
    }
}
