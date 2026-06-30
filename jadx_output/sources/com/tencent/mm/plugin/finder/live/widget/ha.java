package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ha extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f118557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f118558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ra f118559f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(az2.f fVar, long j17, com.tencent.mm.plugin.finder.live.widget.ra raVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118557d = fVar;
        this.f118558e = j17;
        this.f118559f = raVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.ha(this.f118557d, this.f118558e, this.f118559f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.ha haVar = (com.tencent.mm.plugin.finder.live.widget.ha) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        haVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f118557d.b();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", "doQuitCoLive success: invitationId=" + this.f118558e);
        mm2.n0 n0Var = this.f118559f.H;
        if (n0Var != null) {
            n0Var.f329274s = true;
        }
        mm2.n0 n0Var2 = this.f118559f.H;
        if (n0Var2 != null) {
            n0Var2.N6();
        }
        re2.e0 e0Var = re2.j1.f394438b;
        if (e0Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "destroy: invitationId=" + e0Var.f394390c + ", phase=" + e0Var.f394389b);
            e0Var.a();
        }
        re2.j1.f394438b = null;
        android.content.Context context = this.f118559f.f118183e;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.onz);
        e4Var.b(com.tencent.mm.R.raw.icons_outlined_done);
        e4Var.c();
        com.tencent.mm.plugin.finder.live.widget.e0.t(this.f118559f, false, 1, null);
        return jz5.f0.f302826a;
    }
}
