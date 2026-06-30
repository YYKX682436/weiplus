package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uk0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.vk0 f114582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.vk0 vk0Var) {
        super(0);
        this.f114581d = viewGroup;
        this.f114582e = vk0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f114581d.findViewById(com.tencent.mm.R.id.s5u);
        wxRecyclerView.setTag(this.f114582e);
        if (((java.lang.Number) ae2.in.O.r()).intValue() == 0) {
            wxRecyclerView.setRemoveAnimatorWhenDetach(true);
            wxRecyclerView.setItemAnimator(null);
        }
        return wxRecyclerView;
    }
}
