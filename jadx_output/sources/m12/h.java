package m12;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f322843d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f322844e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f322845f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f322846g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f322847h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f322848i;

    /* renamed from: m, reason: collision with root package name */
    public int f322849m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322850n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ rm5.k f322851o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.List f322852p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.a f322853q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m12.i f322854r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f322855s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f322856t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rm5.k kVar, java.util.List list, com.tencent.mm.plugin.gif.a aVar, m12.i iVar, java.nio.ByteBuffer byteBuffer, java.util.Set set, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322851o = kVar;
        this.f322852p = list;
        this.f322853q = aVar;
        this.f322854r = iVar;
        this.f322855s = byteBuffer;
        this.f322856t = set;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        m12.h hVar = new m12.h(this.f322851o, this.f322852p, this.f322853q, this.f322854r, this.f322855s, this.f322856t, continuation);
        hVar.f322850n = obj;
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m12.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322849m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f322850n;
            java.util.List list = this.f322852p;
            com.tencent.mm.plugin.gif.a aVar2 = this.f322853q;
            m12.i iVar = this.f322854r;
            java.nio.ByteBuffer byteBuffer = this.f322855s;
            java.util.Set set = this.f322856t;
            this.f322850n = y0Var;
            rm5.k kVar = this.f322851o;
            this.f322843d = kVar;
            this.f322844e = list;
            this.f322845f = aVar2;
            this.f322846g = iVar;
            this.f322847h = byteBuffer;
            this.f322848i = set;
            this.f322849m = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            rVar.m(new m12.e(kVar, aVar2));
            kVar.a(list, new m12.g(iVar, byteBuffer, aVar2, y0Var, set, list, rVar));
            if (rVar.j() == aVar) {
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
