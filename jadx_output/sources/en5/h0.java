package en5;

/* loaded from: classes8.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f255424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f255426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f255428h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.lang.String str, java.lang.Long l17, java.lang.String str2, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255425e = str;
        this.f255426f = l17;
        this.f255427g = str2;
        this.f255428h = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new en5.h0(this.f255425e, this.f255426f, this.f255427g, this.f255428h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((en5.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f255424d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f255424d = 1;
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new bm5.u0(this.f255425e, this.f255426f, this.f255427g, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            this.f255428h.setValue(e1.e.b(bitmap));
        }
        return jz5.f0.f302826a;
    }
}
