package on2;

/* loaded from: classes3.dex */
public final class n2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f346975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f346976b;

    public n2(on2.z2 z2Var, kotlin.coroutines.Continuation continuation) {
        this.f346975a = z2Var;
        this.f346976b = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        kotlin.coroutines.Continuation continuation = this.f346976b;
        if (i17 == 0 && fVar.f70616b == 0) {
            on2.z2 z2Var = this.f346975a;
            z2Var.getClass();
            pm0.v.X(new on2.m2(z2Var));
            r45.cz1 cz1Var = (r45.cz1) ((r45.go1) fVar.f70618d).getCustom(1);
            if (cz1Var != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(cz1Var);
                z2Var.b7(linkedList, false);
                z2Var.f347095p.postValue(java.lang.Boolean.TRUE);
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.TRUE, null)));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, (r45.qp1) ((r45.go1) fVar.f70618d).getCustom(2))));
        }
        return jz5.f0.f302826a;
    }
}
