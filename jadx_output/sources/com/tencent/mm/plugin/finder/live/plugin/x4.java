package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f115027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f115028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var, boolean z17) {
        super(0);
        this.f115027d = a5Var;
        this.f115028e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f115027d;
        a5Var.w1();
        ll2.e eVar = ll2.e.f319133a;
        eVar.e(a5Var.I1() ? "anchorlive.bottom.videosetting.makeup" : "startlive.bottom.videosetting.makeup", false);
        eVar.e(a5Var.I1() ? "anchorlive.bottom.videosetting.beauty" : "startlive.bottom.videosetting.beauty", false);
        eVar.e(a5Var.I1() ? "anchorlive.bottom.videosetting.filter" : "startlive.bottom.videosetting.filter", false);
        eVar.e(a5Var.D1(), false);
        eVar.e(a5Var.E1(), false);
        eVar.e(a5Var.G1(), false);
        eVar.e(a5Var.F1(), false);
        a5Var.f111807x0 = 0;
        a5Var.f365323d.animate().translationY(com.tencent.mm.ui.bl.b(r1.getContext()).y).setDuration(200L).setListener(new com.tencent.mm.plugin.finder.live.plugin.w4(a5Var, this.f115028e)).start();
        return jz5.f0.f302826a;
    }
}
