package df2;

/* loaded from: classes3.dex */
public final class ge extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f230213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.qe f230214f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(java.util.LinkedList linkedList, df2.qe qeVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230213e = linkedList;
        this.f230214f = qeVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.ge geVar = new df2.ge(this.f230213e, this.f230214f, continuation);
        geVar.f230212d = obj;
        return geVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.ge geVar = (df2.ge) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        geVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f230212d;
        java.util.Iterator it = this.f230213e.iterator();
        while (it.hasNext()) {
            ((kotlinx.coroutines.c3) kotlinx.coroutines.l.b(y0Var, null, null, new df2.fe((r45.vm1) it.next(), this.f230214f, null), 3, null)).start();
        }
        return jz5.f0.f302826a;
    }
}
