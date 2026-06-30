package mm;

/* loaded from: classes12.dex */
public class a0 extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public rh.x2 f328464d = rh.x2.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public rh.x2 f328465e = rh.x2.b(0L);

    /* renamed from: f, reason: collision with root package name */
    public rh.x2 f328466f = rh.x2.b(0L);

    /* renamed from: g, reason: collision with root package name */
    public rh.x2 f328467g = rh.x2.b(0L);

    /* renamed from: h, reason: collision with root package name */
    public rh.x2 f328468h = rh.x2.b(0L);

    /* renamed from: i, reason: collision with root package name */
    public rh.x2 f328469i = rh.x2.b(0L);

    /* renamed from: j, reason: collision with root package name */
    public rh.x2 f328470j = rh.x2.b(0L);

    public static mm.a0 b() {
        mm.a0 a0Var = new mm.a0();
        mm.y yVar = mm.w.f328545d;
        a0Var.f328464d = rh.x2.b(java.lang.Long.valueOf(yVar.f328570c));
        a0Var.f328465e = rh.x2.b(java.lang.Long.valueOf(yVar.f328573f));
        mm.y yVar2 = mm.w.f328547f;
        a0Var.f328466f = rh.x2.b(java.lang.Long.valueOf(yVar2.f328570c));
        a0Var.f328467g = rh.x2.b(java.lang.Long.valueOf(yVar2.f328573f));
        mm.y yVar3 = mm.w.f328551j;
        a0Var.f328468h = rh.x2.b(java.lang.Long.valueOf(yVar3.f328570c));
        a0Var.f328469i = rh.x2.b(java.lang.Long.valueOf(yVar3.f328573f));
        a0Var.f328470j = rh.x2.b(java.lang.Long.valueOf(mm.w.f328544c));
        return a0Var;
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        return new mm.z(this, (mm.a0) d3Var, this);
    }
}
