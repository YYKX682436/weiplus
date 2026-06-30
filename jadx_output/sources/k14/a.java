package k14;

/* loaded from: classes7.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f303291d;

    /* renamed from: e, reason: collision with root package name */
    public int f303292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f303294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wd0.b f303295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.l lVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, wd0.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f303293f = lVar;
        this.f303294g = appCompatActivity;
        this.f303295h = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new k14.a(this.f303293f, this.f303294g, this.f303295h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((k14.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f303292e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
            if (str == null) {
                str = "";
            }
            boolean N = r26.n0.N(str);
            yz5.l lVar2 = this.f303293f;
            if (N) {
                wd0.i2 i2Var = new wd0.i2();
                i2Var.f444726a = 1;
                lVar2.invoke(i2Var);
                return f0Var;
            }
            k14.g gVar = k14.g.f303332a;
            this.f303291d = lVar2;
            this.f303292e = 1;
            obj = k14.g.a(gVar, this.f303294g, this.f303295h, this);
            if (obj == aVar) {
                return aVar;
            }
            lVar = lVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (yz5.l) this.f303291d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        lVar.invoke(obj);
        return f0Var;
    }
}
