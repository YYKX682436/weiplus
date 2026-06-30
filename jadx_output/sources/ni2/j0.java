package ni2;

/* loaded from: classes10.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.k0 f337343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ni2.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337343e = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ni2.j0(this.f337343e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xh2.a aVar;
        java.lang.Object obj2;
        java.lang.Integer num;
        java.lang.String str;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f337342d;
        ni2.k0 k0Var = this.f337343e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (((mm2.e1) k0Var.f337350h.a(mm2.e1.class)).g7() && (aVar = k0Var.f337355p) != null) {
                java.util.Set entrySet = k0Var.f337353n.entrySet();
                kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
                java.util.Iterator it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (kotlin.jvm.internal.o.b(((xh2.a) ((java.util.Map.Entry) obj2).getValue()).b(), aVar.b())) {
                        break;
                    }
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
                if (entry == null || (num = (java.lang.Integer) entry.getKey()) == null) {
                    num = 0;
                }
                int intValue = num.intValue();
                fj2.s sVar = fj2.s.f263183a;
                ml2.w4 w4Var = ml2.w4.f328196q;
                km2.q qVar = aVar.f454520a;
                if (qVar == null || (str = qVar.f309172c) == null) {
                    str = "";
                }
                sVar.g(w4Var, str, aVar.f454521b.f454553e, intValue);
            }
            lj2.x0 x0Var = k0Var.f337351i;
            java.util.HashMap hashMap = k0Var.f337353n;
            this.f337342d = 1;
            obj = x0Var.M(hashMap, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            k0Var.a();
        }
        return jz5.f0.f302826a;
    }
}
