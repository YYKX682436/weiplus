package y91;

/* loaded from: classes16.dex */
public class h implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x91.h f460274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z91.c f460275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y91.o f460276c;

    public h(y91.o oVar, x91.h hVar, z91.c cVar) {
        this.f460276c = oVar;
        this.f460274a = hVar;
        this.f460275b = cVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        z91.c cVar = this.f460275b;
        if (cVar != null) {
            cVar.a(eVar);
        }
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        java.lang.String a17 = eVar.f2488a.a("SID");
        aa1.c cVar = new aa1.c();
        aa1.b bVar = eVar.f2488a;
        cVar.f2484a = bVar.a("SID");
        bVar.a(com.google.android.gms.iid.InstanceID.ERROR_TIMEOUT);
        cVar.f2485b = this.f460274a;
        ((java.util.HashMap) this.f460276c.f460305c).put(a17, cVar);
        z91.c cVar2 = this.f460275b;
        if (cVar2 != null) {
            cVar2.b(cVar);
        }
    }
}
