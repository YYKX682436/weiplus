package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SpringBackLayout f132539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f132540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f132541f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.tencent.mm.plugin.finder.view.SpringBackLayout springBackLayout, com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout, so2.n1 n1Var) {
        super(0);
        this.f132539d = springBackLayout;
        this.f132540e = finderColumnFrameLayout;
        this.f132541f = n1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f132539d.post(new com.tencent.mm.plugin.finder.view.k4(this.f132540e, this.f132541f));
        return jz5.f0.f302826a;
    }
}
