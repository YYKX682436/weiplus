package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class rm implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f135808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f135809e;

    public rm(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar) {
        this.f135809e = mnVar;
        this.f135808d = mnVar.T6();
    }

    @Override // ym5.m1
    public void onChanged() {
        this.f135808d.onChanged();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f135809e;
        com.tencent.mm.view.RefreshLoadMoreLayout T6 = mnVar.T6();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = mnVar.f135190r;
        if (wxRecyclerAdapter != null) {
            T6.onItemRangeChanged(i17 + wxRecyclerAdapter.a0(), i18);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f135809e;
        com.tencent.mm.view.RefreshLoadMoreLayout T6 = mnVar.T6();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = mnVar.f135190r;
        if (wxRecyclerAdapter != null) {
            T6.onItemRangeInserted(i17 + wxRecyclerAdapter.a0(), i18);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f135809e;
        com.tencent.mm.view.RefreshLoadMoreLayout T6 = mnVar.T6();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = mnVar.f135190r;
        if (wxRecyclerAdapter != null) {
            T6.onItemRangeMoved(i17 + wxRecyclerAdapter.a0(), i18, i19);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f135809e;
        com.tencent.mm.view.RefreshLoadMoreLayout T6 = mnVar.T6();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = mnVar.f135190r;
        if (wxRecyclerAdapter != null) {
            T6.onItemRangeRemoved(i17 + wxRecyclerAdapter.a0(), i18);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f135808d.onPreFinishLoadMoreSmooth(reason);
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f135809e;
        com.tencent.mm.view.RefreshLoadMoreLayout T6 = mnVar.T6();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = mnVar.f135190r;
        if (wxRecyclerAdapter != null) {
            T6.onItemRangeChanged(i17 + wxRecyclerAdapter.a0(), i18, obj);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }
}
