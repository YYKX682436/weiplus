package fn5;

/* loaded from: classes14.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f264650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264651f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.util.Pair pair, fn5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264650e = pair;
        this.f264651f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn5.c0(this.f264650e, this.f264651f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264649d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.util.Pair pair = this.f264650e;
            boolean isEmpty = ((java.util.ArrayList) pair.second).isEmpty();
            fn5.n0 n0Var = this.f264651f;
            if (isEmpty) {
                n0Var.f264723f.setValue(fn5.o0.f264745f);
                int size = n0Var.f264731q.size();
                fn5.p0 p0Var = (fn5.p0) n0Var.f264729o.getValue();
                int size2 = kotlin.jvm.internal.o.b(p0Var != null ? p0Var.name() : null, "PERSON") ? n0Var.f264732r.size() : 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchIfDone >> " + size + ", " + aq.o.f12920a + ", " + size2);
                if (!aq.o.f12920a) {
                    f65.o.f259919h = size;
                    f65.o oVar = f65.o.f259912a;
                    oVar.d(size2);
                    oVar.c(size > 0 ? 56 : 57);
                }
            } else {
                java.lang.Object first = pair.first;
                kotlin.jvm.internal.o.f(first, "first");
                n0Var.getClass();
                java.util.ArrayList arrayList = n0Var.f264734t;
                arrayList.clear();
                arrayList.addAll((java.util.ArrayList) first);
                java.lang.Object second = pair.second;
                kotlin.jvm.internal.o.f(second, "second");
                this.f264649d = 1;
                if (fn5.n0.N6(n0Var, (java.util.ArrayList) second, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
