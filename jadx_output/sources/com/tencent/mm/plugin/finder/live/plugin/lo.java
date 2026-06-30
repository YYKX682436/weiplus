package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f113420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.ap apVar) {
        super(0);
        this.f113419d = viewGroup;
        this.f113420e = apVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sj2.m mVar;
        boolean z17 = com.tencent.mm.plugin.finder.live.plugin.ap.V;
        android.view.ViewGroup viewGroup = this.f113419d;
        if (z17) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(4);
        }
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f113420e;
        if (apVar.G.containsKey(viewGroup) && (mVar = (sj2.m) apVar.G.get(viewGroup)) != null) {
            mVar.h();
        }
        return jz5.f0.f302826a;
    }
}
