package es2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.g f256329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f256330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(es2.g gVar, int i17, int i18) {
        super(0);
        this.f256329d = gVar;
        this.f256330e = i17;
        this.f256331f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        es2.g gVar = this.f256329d;
        vr2.e eVar = gVar.f256348i;
        if (eVar != null && (i17 = gVar.f256346g) == eVar.a()) {
            com.tencent.mars.xlog.Log.i("FMTPScheduler", "onPreloadComplete " + i17);
            for (cs2.k kVar : eVar.b(eVar.a())) {
                cs2.j jVar = kVar.f222076d;
                if (jVar != null) {
                    jVar.p("FMTPScheduler.onPreloadComplete." + eVar.a());
                }
                cs2.j jVar2 = kVar.f222076d;
                if (jVar2 != null) {
                    jVar2.P("FMTPScheduler.onPreloadComplete." + eVar.a());
                }
            }
        }
        yz5.p pVar = gVar.f256362z;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(this.f256330e), java.lang.Integer.valueOf(this.f256331f));
        }
        cs2.a aVar = gVar.f256352p;
        if (aVar != null) {
            aVar.a(gVar.m());
        }
        return jz5.f0.f302826a;
    }
}
