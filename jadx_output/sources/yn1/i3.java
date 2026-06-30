package yn1;

/* loaded from: classes11.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463707d;

    /* renamed from: e, reason: collision with root package name */
    public int f463708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f463710g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463711h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bw5.w0 f463712i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f463713m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(yn1.a4 a4Var, long j17, java.lang.String str, bw5.w0 w0Var, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463709f = a4Var;
        this.f463710g = j17;
        this.f463711h = str;
        this.f463712i = w0Var;
        this.f463713m = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.i3(this.f463709f, this.f463710g, this.f463711h, this.f463712i, this.f463713m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xn1.k kVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463708e;
        java.lang.String str = this.f463711h;
        yn1.a4 a4Var = this.f463709f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yn1.a4.a(a4Var);
            fo1.m.f264882a.f("Restore", "pkg = " + this.f463710g + ", conv = " + str + ", msg size = " + this.f463712i.f34546d.f34095d.size(), new java.lang.Object[0]);
            xn1.k kVar2 = new xn1.k();
            co1.g gVar = co1.g.f43768a;
            java.lang.String str2 = this.f463711h;
            bw5.w0 w0Var = this.f463712i;
            this.f463707d = kVar2;
            this.f463708e = 1;
            if (gVar.k(str2, w0Var, -1L, this) == aVar) {
                return aVar;
            }
            kVar = kVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (xn1.k) this.f463707d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        oo1.o.f347151a.f(str);
        java.lang.String str3 = a4Var.f463606a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[insertChatPackageAsync] taskId=");
        long j17 = this.f463713m;
        sb6.append(j17);
        sb6.append(", convId=");
        sb6.append(str);
        sb6.append(", scopeTime=");
        sb6.append(kVar);
        com.tencent.mars.xlog.Log.i(str3, sb6.toString());
        com.tencent.wechat.aff.migration.a aVar2 = a4Var.f463609d;
        if (aVar2 != null) {
            aVar2.v(j17);
        }
        return jz5.f0.f302826a;
    }
}
