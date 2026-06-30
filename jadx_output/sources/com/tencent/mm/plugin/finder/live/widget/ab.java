package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ab extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f117750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f117752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(az2.f fVar, java.lang.String str, com.tencent.mm.plugin.finder.live.widget.nb nbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117750d = fVar;
        this.f117751e = str;
        this.f117752f = nbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.ab(this.f117750d, this.f117751e, this.f117752f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.ab abVar = (com.tencent.mm.plugin.finder.live.widget.ab) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        abVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        kotlinx.coroutines.flow.f3 f3Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f117750d.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRemoveInvitee success: target=");
        java.lang.String str = this.f117751e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", sb6.toString());
        com.tencent.mm.plugin.finder.live.widget.nb nbVar = this.f117752f;
        mm2.n0 n0Var = nbVar.H;
        r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f329265g) == null) ? null : (r45.f50) ((kotlinx.coroutines.flow.l2) f3Var).getValue();
        if (f50Var != null && (linkedList = f50Var.f374016g) != null) {
            kz5.h0.B(linkedList, new com.tencent.mm.plugin.finder.live.widget.za(str));
        }
        nbVar.e0();
        android.content.Context context = nbVar.f118183e;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.f493462oo1);
        e4Var.b(com.tencent.mm.R.raw.icons_outlined_done);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
