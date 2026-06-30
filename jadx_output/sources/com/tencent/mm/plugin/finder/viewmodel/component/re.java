package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class re extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ye f135794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar) {
        super(0);
        this.f135794d = yeVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.RefreshLoadMoreLayout P6;
        com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar = this.f135794d;
        android.view.View rootView = yeVar.getRootView();
        android.view.ViewGroup viewGroup = rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null;
        if (viewGroup == null || (P6 = yeVar.P6(viewGroup)) == null) {
            return null;
        }
        return P6.getRecyclerView();
    }
}
