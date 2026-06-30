package f12;

/* loaded from: classes4.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f258594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f258597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, java.lang.String str2, f12.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258595e = str;
        this.f258596f = str2;
        this.f258597g = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f12.d0(this.f258595e, this.f258596f, this.f258597g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f258594d;
        f12.j0 j0Var = this.f258597g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str = this.f258595e;
                java.lang.String str2 = this.f258596f;
                java.lang.String str3 = j0Var.f258620g;
                if (str3 == null) {
                    str3 = "";
                }
                c12.a aVar2 = new c12.a(str, str2, "CNY_EXPRESSION", str3);
                this.f258594d = 1;
                obj = b12.d.a(aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            uq.l lVar = (uq.l) obj;
            com.tencent.mars.xlog.Log.w("MicroMsg.SpringLuckyEggViewModel", "accept coupon result: " + lVar.f430156d);
            if (lVar.f430156d == 0) {
                j0Var.f258629s.setValue(java.lang.Boolean.TRUE);
                j0Var.f258623m.postValue(d12.a.f225708d);
            } else {
                j0Var.f258623m.postValue(d12.a.f225709e);
            }
        } catch (b12.a e17) {
            j0Var.getClass();
            androidx.lifecycle.j0 j0Var2 = j0Var.f258623m;
            if (e17.f17037d > 0) {
                j0Var2.postValue(d12.a.f225710f);
            } else {
                j0Var2.postValue(d12.a.f225709e);
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.SpringLuckyEggViewModel", "Unable to accept money");
        }
        return jz5.f0.f302826a;
    }
}
