package eg2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f252551d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f252552e;

    /* renamed from: f, reason: collision with root package name */
    public int f252553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eg2.i0 f252554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252555h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252556i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252557m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(eg2.i0 i0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252554g = i0Var;
        this.f252555h = str;
        this.f252556i = str2;
        this.f252557m = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eg2.e0(this.f252554g, this.f252555h, this.f252556i, this.f252557m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((eg2.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252553f;
        java.lang.String str2 = this.f252557m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            eg2.i0 i0Var = this.f252554g;
            if (i0Var.f252577b.get()) {
                return null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f252555h);
            sb6.append(this.f252556i);
            byte[] bytes = str2.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            sb6.append(kk.k.g(bytes));
            java.lang.String sb7 = sb6.toString();
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(sb7);
            com.tencent.mm.vfs.w6.u(r17);
            com.tencent.mm.vfs.w6.t(r17);
            if (i0Var.f252577b.get()) {
                return null;
            }
            this.f252551d = sb7;
            this.f252552e = str2;
            this.f252553f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f342082f = sb7;
            fVar.f342078b = false;
            b17.d(str2, fVar.a(), new eg2.d0(rVar));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
            str = sb7;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f252551d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue() && com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHDBaseTask", "downloadImage success: " + str);
            return str;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveHDBaseTask", "downloadImage failed for: " + str2);
        return null;
    }
}
