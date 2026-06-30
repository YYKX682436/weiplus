package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class cb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f117988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f117989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f117991g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(az2.f fVar, int i17, java.lang.String str, com.tencent.mm.plugin.finder.live.widget.nb nbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117988d = fVar;
        this.f117989e = i17;
        this.f117990f = str;
        this.f117991g = nbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.cb(this.f117988d, this.f117989e, this.f117990f, this.f117991g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.cb cbVar = (com.tencent.mm.plugin.finder.live.widget.cb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f117988d.b();
        com.tencent.mars.xlog.Log.e("Finder.FinderLiveCoLiveInvitorPreparePanel", "doRemoveInvitee failed: errCode=" + this.f117989e + ", errMsg=" + this.f117990f);
        android.content.Context context = this.f117991g.f118183e;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.f493463oo2);
        e4Var.b(com.tencent.mm.R.raw.icons_outlined_error);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
