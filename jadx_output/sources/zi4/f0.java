package zi4;

/* loaded from: classes.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.g0 f473209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f473210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(zi4.g0 g0Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473209d = g0Var;
        this.f473210e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zi4.f0(this.f473209d, this.f473210e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zi4.f0 f0Var = (zi4.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        f0Var.invokeSuspend(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.HashSet hashSet = (java.util.HashSet) ((jz5.n) this.f473209d.f473217c).getValue();
        java.util.List list = this.f473210e;
        hashSet.removeAll(list);
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusActionHost", "unRegisterCmdId success " + list);
        return jz5.f0.f302826a;
    }
}
