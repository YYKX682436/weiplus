package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class hm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC f134639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
        super(0);
        this.f134639d = finderHorizontalVideoDrawerUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity activity = this.f134639d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((com.tencent.mm.plugin.finder.viewmodel.component.mn) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.mn.class)).T6().getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        return java.lang.Boolean.valueOf(linearLayoutManager == null || linearLayoutManager.t() == 0);
    }
}
