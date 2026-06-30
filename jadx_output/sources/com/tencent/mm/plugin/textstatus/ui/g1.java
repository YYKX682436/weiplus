package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes7.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.h1 f173891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f173892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f173893f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.textstatus.ui.h1 h1Var, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f173891d = h1Var;
        this.f173892e = i17;
        this.f173893f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.textstatus.ui.g1(this.f173891d, this.f173892e, this.f173893f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.textstatus.ui.g1 g1Var = (com.tencent.mm.plugin.textstatus.ui.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.appbrand.service.o6 o6Var = (com.tencent.mm.plugin.appbrand.service.o6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
        java.lang.Boolean valueOf = o6Var != null ? java.lang.Boolean.valueOf(o6Var.l5("wxb1320569c2a2b6d2", 0)) : null;
        boolean b17 = kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.FALSE);
        com.tencent.mars.xlog.Log.i(this.f173891d.f173923f, "updateCoverAgendaView: lastClientVersion:" + this.f173892e + "  CLIENT_VERSION:" + o45.wf.f343029g + " isClientVersionChange:" + this.f173893f + " isNeedPreDownLoad:" + b17 + " isPkgCached:" + valueOf + ' ');
        if (b17) {
            ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).P4("gh_8672f34b4389@app", "wxb1320569c2a2b6d2", "pages/emoji-panel/emoji-panel.html", 14);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_LAST_CLIENT_VERSION_FOR_EMOJI_APPBRAND_PANEL_INT, new java.lang.Integer(o45.wf.f343029g));
        }
        return jz5.f0.f302826a;
    }
}
