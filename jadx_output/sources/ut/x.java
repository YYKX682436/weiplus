package ut;

/* loaded from: classes12.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430770e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f430771f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f430772g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f430773h;

    /* renamed from: i, reason: collision with root package name */
    public int f430774i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f430775m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v05.b f430776n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430777o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ oi3.g f430778p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430779q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f430780r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f430781s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z17, v05.b bVar, ut.q0 q0Var, oi3.g gVar, java.lang.String str, com.tencent.mm.pluginsdk.model.app.d dVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430775m = z17;
        this.f430776n = bVar;
        this.f430777o = q0Var;
        this.f430778p = gVar;
        this.f430779q = str;
        this.f430780r = dVar;
        this.f430781s = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ut.x(this.f430775m, this.f430776n, this.f430777o, this.f430778p, this.f430779q, this.f430780r, this.f430781s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        z25.d dVar;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f430774i;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        v05.b bVar = this.f430776n;
        ut.q0 q0Var = this.f430777o;
        oi3.g gVar = this.f430778p;
        java.lang.String str3 = this.f430779q;
        com.tencent.mm.pluginsdk.model.app.d dVar2 = this.f430780r;
        long j17 = this.f430781s;
        this.f430769d = bVar;
        this.f430770e = q0Var;
        this.f430771f = gVar;
        this.f430772g = str3;
        this.f430773h = dVar2;
        this.f430774i = 1;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        ((o25.t) ((p25.f) i95.n0.c(p25.f.class))).getClass();
        z25.d dVar3 = new z25.d();
        ut.w wVar = new ut.w(q0Var, gVar, rVar, str3, bVar, dVar2, dVar3, j17);
        if (this.f430775m) {
            v05.a aVar2 = (v05.a) bVar.getCustom(bVar.f432315e + 8);
            java.lang.String str4 = "";
            if (aVar2 == null || (str = aVar2.getString(aVar2.f368364d + 3)) == null) {
                str = "";
            }
            ut.j jVar = q0Var.f430712o.f430733q;
            if (jVar != null && (str2 = jVar.f430645a) != null) {
                str4 = str2;
            }
            dVar = dVar3;
            dVar.f469783h = str4;
            dVar.f469785j = str;
        } else {
            dVar = dVar3;
        }
        z25.f fVar = new z25.f();
        fVar.f469792c = wVar;
        fVar.f469799j = gVar.getLong(gVar.f345617d + 0);
        fVar.f469804o = gVar.getString(gVar.f345617d + 3);
        fVar.f469791b = 3;
        fVar.f469790a = 5;
        fVar.f469793d = str3;
        fVar.f469805p = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        dVar.d(fVar);
        rVar.m(new ut.v(q0Var, dVar));
        java.lang.Object j18 = rVar.j();
        return j18 == aVar ? aVar : j18;
    }
}
