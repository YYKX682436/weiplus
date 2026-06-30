package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tb f113373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.tb tbVar) {
        super(0);
        this.f113372d = viewGroup;
        this.f113373e = tbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f113372d.findViewById(com.tencent.mm.R.id.awj);
        wxRecyclerView.setTag(this.f113373e);
        if (((java.lang.Number) ae2.in.O.r()).intValue() == 0) {
            wxRecyclerView.setRemoveAnimatorWhenDetach(true);
            wxRecyclerView.setItemAnimator(null);
        }
        return wxRecyclerView;
    }
}
