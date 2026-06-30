package y91;

/* loaded from: classes16.dex */
public class k implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa1.c f460293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z91.a f460294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y91.o f460295c;

    public k(y91.o oVar, aa1.c cVar, z91.a aVar) {
        this.f460295c = oVar;
        this.f460293a = cVar;
        this.f460294b = aVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        z91.a aVar = this.f460294b;
        if (aVar != null) {
            aVar.a(eVar);
        }
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        ((java.util.HashMap) this.f460295c.f460306d).remove(this.f460293a.f2484a);
        z91.a aVar = this.f460294b;
        if (aVar != null) {
            aVar.b(eVar);
        }
    }
}
