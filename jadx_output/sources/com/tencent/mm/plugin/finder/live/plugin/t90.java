package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class t90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f114363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f114364e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t90(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, so2.j5 j5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114363d = ea0Var;
        this.f114364e = j5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.t90(this.f114363d, this.f114364e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.t90 t90Var = (com.tencent.mm.plugin.finder.live.plugin.t90) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t90Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = this.f114363d.f365323d.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        r45.bd5 j17 = ((cm2.m0) this.f114364e).j();
        e4Var.f211776c = j17 != null ? j17.getString(7) : null;
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
