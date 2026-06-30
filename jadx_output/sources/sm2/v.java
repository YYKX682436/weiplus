package sm2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f409742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f409744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f409745g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.l01 f409746h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f409747i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409748m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f409749n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409750o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(sm2.o4 o4Var, boolean z17, int i17, r45.l01 l01Var, boolean z18, java.lang.String str, int i18, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f409743e = o4Var;
        this.f409744f = z17;
        this.f409745g = i17;
        this.f409746h = l01Var;
        this.f409747i = z18;
        this.f409748m = str;
        this.f409749n = i18;
        this.f409750o = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sm2.v(this.f409743e, this.f409744f, this.f409745g, this.f409746h, this.f409747i, this.f409748m, this.f409749n, this.f409750o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((sm2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f409742d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sm2.o4 o4Var = this.f409743e;
            com.tencent.mars.xlog.Log.i(o4Var.f409610f, "isReadyPluginCountDownOk startCollect");
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.c1) o4Var.c(mm2.c1.class)).G5;
            sm2.u uVar = new sm2.u(this.f409743e, this.f409744f, this.f409745g, this.f409746h, this.f409747i, this.f409748m, this.f409749n, this.f409750o);
            this.f409742d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(uVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
