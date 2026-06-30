package kt1;

/* loaded from: classes4.dex */
public final class g0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f311940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kt1.h0 f311941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jo5 f311942f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(kt1.h0 h0Var, r45.jo5 jo5Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f311941e = h0Var;
        this.f311942f = jo5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new kt1.g0(this.f311941e, this.f311942f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((kt1.g0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f311940d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.jo5 rsp = this.f311942f;
            kotlin.jvm.internal.o.f(rsp, "$rsp");
            kt1.h0 h0Var = this.f311941e;
            h0Var.getClass();
            r45.ho5 ho5Var = new r45.ho5();
            java.util.LinkedList resp_continue_flag = rsp.f377991d;
            kotlin.jvm.internal.o.f(resp_continue_flag, "resp_continue_flag");
            java.util.Iterator it = resp_continue_flag.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                java.lang.Long l17 = (java.lang.Long) obj2;
                if (l17 == null || l17.longValue() != 0) {
                    break;
                }
            }
            java.lang.Long l18 = (java.lang.Long) obj2;
            ho5Var.f376332d = l18 != null ? l18.longValue() : 0L;
            kt1.h0 h0Var2 = new kt1.h0(ho5Var.toByteArray(), h0Var.f311944b, 4);
            this.f311940d = 1;
            if (h0Var2.a(this) == aVar) {
                return aVar;
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
