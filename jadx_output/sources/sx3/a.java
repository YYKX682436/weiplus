package sx3;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f413543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f413544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx3.b f413545f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z17, java.util.List list, sx3.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f413543d = z17;
        this.f413544e = list;
        this.f413545f = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sx3.a(this.f413543d, this.f413544e, this.f413545f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sx3.a aVar = (sx3.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f413543d;
        java.util.List<t45.s> list = this.f413544e;
        sx3.b bVar = this.f413545f;
        if (!z17 && list.isEmpty() && bVar.f413550h.isEmpty()) {
            bVar.f413546d.postValue(null);
        } else {
            for (t45.s sVar : list) {
                t45.n0 n0Var = sVar.f415638d;
                if (n0Var != null) {
                    long j17 = bVar.f413548f;
                    long j18 = sVar.f415640f;
                    if (j17 > j18) {
                        bVar.f413548f = j18;
                    }
                    vx3.i i17 = vx3.l.E.i(n0Var);
                    if (i17 != null) {
                        qx3.d.c(i17.f441298o, i17);
                        java.lang.String e17 = i17.e();
                        java.util.HashSet hashSet = bVar.f413549g;
                        if (!hashSet.contains(e17)) {
                            hashSet.add(e17);
                            bVar.f413550h.add(new ox3.g(n0Var));
                        }
                    }
                }
            }
            bVar.f413546d.postValue(bVar.f413550h);
        }
        return jz5.f0.f302826a;
    }
}
