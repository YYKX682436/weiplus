package qf2;

/* loaded from: classes.dex */
public final class d2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.im1 f362332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(qf2.c3 c3Var, r45.im1 im1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362331e = c3Var;
        this.f362332f = im1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.d2(this.f362331e, this.f362332f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.d2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362330d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qf2.c3 c3Var = this.f362331e;
            r45.im1 im1Var = this.f362332f;
            int i18 = im1Var.getInteger(2) == 10 ? 5 : 4;
            java.lang.String string = im1Var.getString(0);
            if (string == null) {
                string = "";
            }
            qf2.c2 c2Var = qf2.c2.f362310d;
            this.f362330d = 1;
            if (qf2.c3.h7(c3Var, i18, string, false, c2Var, this, 4, null) == aVar) {
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
