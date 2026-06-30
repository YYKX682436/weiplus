package df2;

/* loaded from: classes.dex */
public final class hq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f230349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq(df2.ar arVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230349d = arVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.hq(this.f230349d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.hq hqVar = (df2.hq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hqVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f230349d.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nuf);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            k0Var.showCenterCustomizeToast(string, com.tencent.mm.R.raw.icons_outlined_done);
        }
        return jz5.f0.f302826a;
    }
}
