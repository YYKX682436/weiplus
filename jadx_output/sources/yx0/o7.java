package yx0;

/* loaded from: classes5.dex */
public final class o7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f467518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f467520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f467521i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f467522m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f467523n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f467524o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ bs0.h f467525p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f467526q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f467527r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.List f467528s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(yx0.b8 b8Var, pp0.p0 p0Var, java.lang.String str, long j17, int i17, long j18, com.tencent.mm.protobuf.g gVar, int i18, bs0.h hVar, boolean z17, boolean z18, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467517e = b8Var;
        this.f467518f = p0Var;
        this.f467519g = str;
        this.f467520h = j17;
        this.f467521i = i17;
        this.f467522m = j18;
        this.f467523n = gVar;
        this.f467524o = i18;
        this.f467525p = hVar;
        this.f467526q = z17;
        this.f467527r = z18;
        this.f467528s = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.o7(this.f467517e, this.f467518f, this.f467519g, this.f467520h, this.f467521i, this.f467522m, this.f467523n, this.f467524o, this.f467525p, this.f467526q, this.f467527r, this.f467528s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.o7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467516d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yx0.b8 b8Var = this.f467517e;
            pp0.p0 p0Var = this.f467518f;
            java.lang.String str = this.f467519g;
            long j17 = this.f467520h;
            int i18 = this.f467521i;
            long j18 = this.f467522m;
            com.tencent.mm.protobuf.g gVar = this.f467523n;
            int i19 = this.f467524o;
            bs0.h hVar = this.f467525p;
            boolean z17 = this.f467526q;
            boolean z18 = this.f467527r;
            java.util.List list = this.f467528s;
            this.f467516d = 1;
            if (yx0.b8.e(b8Var, p0Var, str, j17, i18, j18, gVar, i19, hVar, z17, z18, list, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
