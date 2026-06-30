package fr4;

/* loaded from: classes11.dex */
public final class i implements hr4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kr4.g f265835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kr4.g f265836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr4.l f265837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265838d;

    public i(kr4.g gVar, kr4.g gVar2, fr4.l lVar, int i17) {
        this.f265835a = gVar;
        this.f265836b = gVar2;
        this.f265837c = lVar;
        this.f265838d = i17;
    }

    @Override // hr4.q
    public void a(boolean z17, kr4.e eVar) {
        if (!z17 || eVar == null) {
            return;
        }
        com.tencent.mm.storage.z3 t07 = eVar.t0();
        kr4.g gVar = this.f265835a;
        gVar.Z = t07;
        com.tencent.mm.storage.z3 z3Var = gVar.Z;
        gVar.f311507x0 = z3Var != null ? z3Var.g2() : null;
        java.lang.String str = gVar.f311507x0 + ':' + gVar.field_digest;
        kr4.g gVar2 = this.f265836b;
        gVar2.field_digest = str;
        this.f265837c.t(gVar2, gVar, this.f265838d);
    }

    @Override // hr4.q
    public void b() {
    }
}
