package y91;

/* loaded from: classes16.dex */
public class j implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa1.c f460289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z91.a f460290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y91.o f460291c;

    public j(y91.o oVar, aa1.c cVar, z91.a aVar) {
        this.f460291c = oVar;
        this.f460289a = cVar;
        this.f460290b = aVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        z91.a aVar = this.f460290b;
        if (aVar != null) {
            aVar.a(eVar);
        }
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        ((java.util.HashMap) this.f460291c.f460305c).remove(this.f460289a.f2484a);
        z91.a aVar = this.f460290b;
        if (aVar != null) {
            aVar.b(eVar);
        }
    }
}
