package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gc f112134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bd5 f112135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(com.tencent.mm.plugin.finder.live.plugin.gc gcVar, r45.bd5 bd5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112134d = gcVar;
        this.f112135e = bd5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.cc(this.f112134d, this.f112135e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.cc ccVar = (com.tencent.mm.plugin.finder.live.plugin.cc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ccVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = this.f112134d.f112677d;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = this.f112135e.getString(7);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
