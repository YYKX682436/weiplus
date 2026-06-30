package qm2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm2.k f364724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f364725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f364726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f364727g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f364728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f364729i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f364730m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qm2.k kVar, boolean z17, float f17, float f18, boolean z18, int i17, boolean z19, int i18) {
        super(0);
        this.f364724d = kVar;
        this.f364725e = f17;
        this.f364726f = f18;
        this.f364727g = z18;
        this.f364728h = i17;
        this.f364729i = z19;
        this.f364730m = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float f17 = this.f364725e;
        float f18 = this.f364726f;
        boolean z17 = this.f364727g;
        boolean z18 = this.f364729i;
        int i17 = this.f364730m;
        qm2.k kVar = this.f364724d;
        kVar.f364734f.set(false);
        kVar.f364732d = new qm2.f(!z17 ? 1 : 0, z17 ? this.f364728h : 0, f17, f18, z17, z18, i17);
        kVar.f364733e = java.lang.System.currentTimeMillis();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_NET_SPEED_TIMESTAMP_LONG_SYNC, java.lang.Long.valueOf(kVar.f364733e));
        java.util.Iterator it = ((java.util.ArrayList) kVar.f364735g).iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        if (kVar.f364732d.f364715a == 0) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            ml2.k3[] k3VarArr = ml2.k3.f327648d;
            zy2.zb.j5(zbVar, 26L, java.lang.String.valueOf(1), null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
