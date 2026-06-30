package u20;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f423913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f423914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u20.p f423915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f423917h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, u20.p pVar, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f423914e = context;
        this.f423915f = pVar;
        this.f423916g = str;
        this.f423917h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new u20.o(this.f423914e, this.f423915f, this.f423916g, this.f423917h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((u20.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f423913d;
        u20.p pVar = this.f423915f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            v20.n nVar = v20.n.f432786a;
            android.content.Context context = this.f423914e;
            u20.n nVar2 = pVar.f423918d;
            java.lang.String str = nVar2.f423912b;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = nVar2.f423911a;
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String str4 = this.f423916g;
            boolean z17 = this.f423917h;
            this.f423913d = 1;
            obj = nVar.a(context, str, str3, str4, z17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        java.lang.String str5 = (java.lang.String) lVar.f302834e;
        if (booleanValue) {
            pVar.d(com.tencent.mm.storage.z3.R4(str5));
        } else {
            pVar.a();
        }
        return jz5.f0.f302826a;
    }
}
