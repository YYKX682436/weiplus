package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b70 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.c70 f133844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(com.tencent.mm.plugin.finder.viewmodel.component.c70 c70Var) {
        super(0);
        this.f133844d = c70Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.Fragment fragment = this.f133844d.getFragment();
        kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
        return java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment).f129265p);
    }
}
