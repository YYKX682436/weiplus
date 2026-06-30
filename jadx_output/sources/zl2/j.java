package zl2;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473828d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f473829e;

    /* renamed from: f, reason: collision with root package name */
    public int f473830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473831g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473831g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zl2.j(this.f473831g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473830f;
        java.lang.String str2 = this.f473831g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mn2.n nVar = new mn2.n(str2, null, 2, null);
            com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
            java.lang.String str3 = com.tencent.mm.plugin.finder.assist.e9.f102141j + nVar.f330065m;
            if (com.tencent.mm.vfs.w6.j(str3)) {
                com.tencent.mars.xlog.Log.i("FinderLiveCoverEditHelper", "downloadProfileAvatarToLocal: use cache " + str3);
                return str3;
            }
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(str3);
            com.tencent.mm.vfs.w6.u(r17);
            com.tencent.mm.vfs.w6.t(r17);
            this.f473828d = str3;
            this.f473829e = str2;
            this.f473830f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f342082f = str3;
            fVar.f342078b = false;
            b17.d(str2, fVar.a(), new zl2.i(rVar));
            java.lang.Object j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
            str = str3;
            obj = j17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f473828d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue() && com.tencent.mm.vfs.w6.j(str)) {
            return str;
        }
        com.tencent.mars.xlog.Log.e("FinderLiveCoverEditHelper", "downloadProfileAvatarToLocal: failed " + str2);
        return null;
    }
}
