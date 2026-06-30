package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderJumpAnchorView f123582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f123584f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView, com.tencent.mm.plugin.finder.profile.uic.f4 f4Var, java.lang.Long l17) {
        super(0);
        this.f123582d = finderJumpAnchorView;
        this.f123583e = f4Var;
        this.f123584f = l17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f123582d.setClickable(false);
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f123583e;
        f4Var.A = true;
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView X6 = f4Var.X6();
        if (X6 != null) {
            X6.setLoading(true);
        }
        yz5.a aVar = f4Var.f123701y;
        if (aVar != null) {
            aVar.invoke();
        }
        if (this.f123584f == null) {
            f4Var.b7("channel_profile_recentviewed", 1, 1);
        } else {
            f4Var.c7("view_clk");
        }
        return jz5.f0.f302826a;
    }
}
