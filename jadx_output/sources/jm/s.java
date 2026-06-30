package jm;

/* loaded from: classes9.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f300249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.e0 f300250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jm.y f300251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qi3.e0 e0Var, jm.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300250e = e0Var;
        this.f300251f = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        jm.s sVar = new jm.s(this.f300250e, this.f300251f, continuation);
        sVar.f300249d = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jm.s sVar = (jm.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qi3.e0 e0Var = this.f300250e;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = e0Var.f363697g;
        jm.y yVar = this.f300251f;
        if (msgIdTalker != null && e0Var.f363698h > 0.0d) {
            yVar.aj().put(msgIdTalker.toString(), new java.lang.Float(e0Var.f363698h));
        }
        java.util.Iterator it = ((java.util.HashSet) ((jz5.n) yVar.f300259n).getValue()).iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            qi3.a0 a0Var = (qi3.a0) ((d75.c) next).get();
            if (a0Var != null) {
                a0Var.L8(e0Var);
            } else {
                a0Var = null;
            }
            if (a0Var == null) {
                it.remove();
            }
        }
        return jz5.f0.f302826a;
    }
}
