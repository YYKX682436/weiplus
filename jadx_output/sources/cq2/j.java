package cq2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys5.e f221398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f221399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f221400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ws5.h f221401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f221402h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f221403i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f221404m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ys5.e eVar, boolean z17, kotlin.jvm.internal.f0 f0Var, ws5.h hVar, float f17, boolean z18, kotlin.jvm.internal.c0 c0Var) {
        super(0);
        this.f221398d = eVar;
        this.f221399e = z17;
        this.f221400f = f0Var;
        this.f221401g = hVar;
        this.f221402h = f17;
        this.f221403i = z18;
        this.f221404m = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        cq2.q qVar = cq2.q.f221428a;
        ys5.e eVar = this.f221398d;
        cq2.q.a(qVar, eVar);
        if (this.f221399e) {
            cq2.q.f221440m++;
        }
        int i17 = this.f221400f.f310116d;
        ws5.h hVar = this.f221401g;
        if (hVar == null || (str = hVar.f449214c) == null) {
            str = "";
        }
        kz5.p0 p0Var = kz5.p0.f313996d;
        int i18 = hVar != null ? hVar.f449213b : 135;
        int ordinal = eVar.ordinal();
        int i19 = ordinal != 2 ? ordinal != 3 ? 0 : 1 : 2;
        float f17 = this.f221402h;
        boolean z17 = eVar == ys5.e.f465257e;
        if (hVar == null || (str2 = hVar.f449212a) == null) {
            str2 = "default";
        }
        return new aq2.b(new aq2.a(i17, 0, null, str, p0Var, i18, 0L, null, null, i19, f17, z17, str2, hVar != null ? hVar.f449215d : null, this.f221403i ? qVar.c() : null, this.f221404m.f310112d, null, 65984, null), null, null, 6, null);
    }
}
