package sd;

/* loaded from: classes8.dex */
public class i0 implements td.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.c f406606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od.g f406607b;

    public i0(sd.l0 l0Var, sd.c cVar, od.g gVar) {
        this.f406606a = cVar;
        this.f406607b = gVar;
    }

    @Override // td.e
    public void a(td.d dVar) {
        td.d dVar2 = td.d.PASS;
        od.g gVar = this.f406607b;
        if (dVar != dVar2) {
            gVar.a("system:access_denied", null);
            return;
        }
        sd.c cVar = this.f406606a;
        sd.b bVar = new sd.b(cVar);
        bVar.f406596a = cVar.f406598d;
        bVar.f406597b = gVar;
        cVar.a(bVar);
    }
}
