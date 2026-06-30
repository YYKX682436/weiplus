package y91;

/* loaded from: classes16.dex */
public class b0 implements r56.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w91.f f460260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z91.a f460261e;

    public b0(y91.i0 i0Var, w91.f fVar, z91.a aVar) {
        this.f460260d = fVar;
        this.f460261e = aVar;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        aa1.e eVar = (aa1.e) obj;
        int i17 = y91.i0.f460281h;
        v91.b.b("i0", "Send Tcp Custom:" + this.f460260d.b() + " response: code=" + eVar.f2487c);
        z91.a aVar = this.f460261e;
        if (aVar != null) {
            if (eVar.f2487c == 200) {
                aVar.b(eVar);
            } else {
                aVar.a(eVar);
            }
        }
    }
}
