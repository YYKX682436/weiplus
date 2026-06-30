package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class pb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.yb f124123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(com.tencent.mm.plugin.finder.profile.uic.yb ybVar) {
        super(0);
        this.f124123d = ybVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout = this.f124123d.getRlLayout();
        kotlin.jvm.internal.o.f(rlLayout, "access$getRlLayout(...)");
        return new com.tencent.mm.plugin.finder.view.mj(rlLayout);
    }
}
