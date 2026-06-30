package s72;

/* loaded from: classes12.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f404152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s72.j0 j0Var, java.util.LinkedList linkedList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404151d = j0Var;
        this.f404152e = linkedList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s72.t(this.f404151d, this.f404152e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = -1L;
        s72.j0 j0Var = this.f404151d;
        j0Var.f404072h = 0L;
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().b6(new s72.s(this.f404152e, j0Var, g0Var));
        return new java.lang.Long(g0Var.f310121d);
    }
}
