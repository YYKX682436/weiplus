package v14;

/* loaded from: classes.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.k0 f432560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f432561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f432563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v14.p f432564h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432565i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f432566m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kv.k0 k0Var, boolean z17, java.lang.String str, android.graphics.Bitmap bitmap, v14.p pVar, java.lang.String str2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432560d = k0Var;
        this.f432561e = z17;
        this.f432562f = str;
        this.f432563g = bitmap;
        this.f432564h = pVar;
        this.f432565i = str2;
        this.f432566m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v14.m(this.f432560d, this.f432561e, this.f432562f, this.f432563g, this.f432564h, this.f432565i, this.f432566m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        v14.m mVar = (v14.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((com.tencent.mm.modelavatar.y0) this.f432560d).b(1, new v14.l(this.f432562f, this.f432563g, this.f432564h, this.f432565i, this.f432566m), this.f432561e);
        return jz5.f0.f302826a;
    }
}
