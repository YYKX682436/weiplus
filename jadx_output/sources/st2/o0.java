package st2;

/* loaded from: classes3.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f412404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f412405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.ui.MMActivity mMActivity, st2.h1 h1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f412405e = mMActivity;
        this.f412406f = h1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new st2.o0(this.f412405e, this.f412406f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        st2.h1 h1Var;
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f412404d;
        st2.h1 h1Var2 = this.f412406f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk2.q4 q4Var = dk2.q4.f233938a;
            com.tencent.mm.ui.MMActivity mMActivity = this.f412405e;
            gk2.e eVar = h1Var2.f412335f;
            boolean w17 = h1Var2.w();
            boolean z17 = ((mm2.f6) h1Var2.f412335f.a(mm2.f6.class)).f329033g;
            long j17 = ((mm2.e1) h1Var2.f412335f.a(mm2.e1.class)).f328988r.getLong(0);
            long j18 = ((mm2.e1) h1Var2.f412335f.a(mm2.e1.class)).f328983m;
            java.lang.String str = ((mm2.e1) h1Var2.f412335f.a(mm2.e1.class)).f328984n;
            java.lang.String str2 = ((mm2.c1) h1Var2.f412335f.a(mm2.c1.class)).f328852o;
            byte[] bArr = ((mm2.e1) h1Var2.f412335f.a(mm2.e1.class)).f328985o;
            java.lang.String str3 = ((mm2.c1) h1Var2.f412335f.a(mm2.c1.class)).P3;
            java.lang.String str4 = ((mm2.c1) h1Var2.f412335f.a(mm2.c1.class)).f328844m5;
            this.f412404d = 1;
            h1Var = h1Var2;
            g17 = q4Var.g(mMActivity, eVar, w17, z17, j17, j18, str, str2, bArr, str3, null, 3, str4, (r37 & 8192) != 0 ? java.lang.Boolean.TRUE : null, this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            h1Var = h1Var2;
        }
        h1Var.R();
        return jz5.f0.f302826a;
    }
}
