package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f115011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f115012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f115013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f115014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, kotlinx.coroutines.y0 y0Var, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(2, continuation);
        this.f115011d = hVar;
        this.f115012e = str;
        this.f115013f = y0Var;
        this.f115014g = v3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.x1(this.f115011d, continuation, this.f115012e, this.f115013f, this.f115014g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.x1 x1Var = (com.tencent.mm.plugin.finder.live.plugin.x1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f115011d).f454393b;
        ya2.g gVar = ya2.h.f460484a;
        java.lang.String str = this.f115012e;
        ya2.b2 b17 = gVar.b(str);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var2 = this.f115014g;
        if (b17 != null) {
            com.tencent.mm.protocal.protobuf.FinderContact i17 = ya2.d.i(b17);
            java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            ml2.l1 l1Var = ml2.l1.f327687n;
            y4Var.getClass();
            y4Var.f328295e0 = l1Var;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Ij(ml2.y2.f328253f, "", "", valueOf);
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = v3Var2.f365323d.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_SELECT_UNSPECIFIC_NOTICE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_SESSION_ID", valueOf);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_ENTER_QR_CODE_BACK_PROFILE", true);
            v3Var = v3Var2;
            c61.ub.A3((c61.ub) c17, (android.app.Activity) context, intent, i17, 1012, true, null, null, false, j01Var, null, ag1.b.CTRL_INDEX, null);
            f0Var = f0Var2;
        } else {
            v3Var = v3Var2;
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "createNotice: finder contact is null, isInvitee=" + ((mm2.n0) v3Var.P0(mm2.n0.class)).f329273r + ", createNoticeAnchorUsername=" + str + ", anchorUsername=" + ((mm2.c1) v3Var.S0().a(mm2.c1.class)).f328852o);
        }
        return f0Var2;
    }
}
