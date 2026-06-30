package g80;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269477d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f269478e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f269479f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f269480g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f269481h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f269482i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f269483m;

    /* renamed from: n, reason: collision with root package name */
    public int f269484n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s70.d f269485o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s70.g f269486p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.List f269487q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s70.d f269488r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s70.d f269489s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f269490t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s70.d f269491u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j15.d f269492v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s70.d dVar, s70.g gVar, java.util.List list, s70.d dVar2, s70.d dVar3, boolean z17, s70.d dVar4, j15.d dVar5, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f269485o = dVar;
        this.f269486p = gVar;
        this.f269487q = list;
        this.f269488r = dVar2;
        this.f269489s = dVar3;
        this.f269490t = z17;
        this.f269491u = dVar4;
        this.f269492v = dVar5;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g80.k(this.f269485o, this.f269486p, this.f269487q, this.f269488r, this.f269489s, this.f269490t, this.f269491u, this.f269492v, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g80.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f269484n;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        s70.d dVar = this.f269485o;
        s70.g gVar = this.f269486p;
        java.util.List<s70.d> list = this.f269487q;
        s70.d dVar2 = this.f269488r;
        boolean z17 = this.f269490t;
        s70.d dVar3 = this.f269491u;
        j15.d dVar4 = this.f269492v;
        this.f269477d = dVar;
        this.f269478e = gVar;
        this.f269479f = list;
        this.f269480g = dVar2;
        s70.d dVar5 = this.f269489s;
        this.f269481h = dVar5;
        this.f269482i = dVar3;
        this.f269483m = dVar4;
        this.f269484n = 1;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        g80.j jVar = new g80.j(gVar, dVar3, dVar4, dVar, list, dVar2, z17, rVar);
        z25.f fVar = new z25.f();
        fVar.f469792c = jVar;
        fVar.f469791b = 1;
        fVar.f469794e = dVar.f403930g;
        if (gVar.f403949f == 1) {
            for (s70.d dVar6 : list) {
                if (dVar6.f403925b == s70.c.f403920h) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((s70.d) obj2).f403925b == s70.c.f403922m) {
                            break;
                        }
                    }
                    s70.d dVar7 = (s70.d) obj2;
                    fVar.f469790a = 1;
                    fVar.f469795f = dVar2.f403930g;
                    fVar.f469796g = dVar2.f403931h;
                    fVar.f469793d = dVar6.f403930g;
                    if (dVar5 != null && dVar7 != null) {
                        fVar.f469797h = dVar5.f403930g;
                        fVar.f469798i = dVar7.f403930g;
                        fVar.f469790a = 25;
                        fVar.f469806q = 2;
                    }
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        }
        fVar.f469790a = 2;
        java.lang.String str = dVar2.f403930g;
        fVar.f469795f = str;
        fVar.f469796g = dVar2.f403931h;
        fVar.f469793d = str;
        if (dVar5 != null) {
            fVar.f469797h = dVar5.f403930g;
            fVar.f469790a = 24;
            fVar.f469806q = 1;
        }
        fVar.f469805p = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        ((o25.t) ((p25.f) i95.n0.c(p25.f.class))).getClass();
        z25.d dVar8 = new z25.d();
        dVar8.f469788m = z17;
        dVar8.d(fVar);
        rVar.m(new g80.i(gVar, dVar8));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar2 = pz5.a.f359186d;
        return j17 == aVar ? aVar : j17;
    }
}
