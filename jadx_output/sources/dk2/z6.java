package dk2;

/* loaded from: classes3.dex */
public final class z6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f234422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.yq4 f234423e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(r45.yq4 yq4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f234423e = yq4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.z6(this.f234423e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.z6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f234422d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(zy.u.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy.w p37 = zy.u.p3((zy.u) c17, null, 1, null);
            r45.yq4 yq4Var = this.f234423e;
            r45.gs5 gs5Var = (r45.gs5) yq4Var.getCustom(1);
            java.lang.String string = gs5Var != null ? gs5Var.getString(0) : null;
            r45.gs5 gs5Var2 = (r45.gs5) yq4Var.getCustom(1);
            java.lang.String string2 = gs5Var2 != null ? gs5Var2.getString(1) : null;
            this.f234422d = 1;
            if (zy.w.Lc(p37, string, true, string2, 0, 0, null, null, this, 120, null) == aVar) {
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
