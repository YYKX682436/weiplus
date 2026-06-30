package nd1;

/* loaded from: classes7.dex */
public class q1 extends zl1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zl1.t f336385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nd1.s1 f336386b;

    public q1(nd1.s1 s1Var, zl1.t tVar) {
        this.f336386b = s1Var;
        this.f336385a = tVar;
    }

    @Override // zl1.w
    public void a(java.lang.String str, zl1.y yVar) {
        super.a(str, yVar);
        nd1.s1 s1Var = this.f336386b;
        int i17 = s1Var.f336392g;
        java.lang.String str2 = s1Var.f336393h;
        zl1.t tVar = this.f336385a;
        tVar.h(i17, str2, (zl1.y) ((android.util.Pair) tVar.f473621m.get(i17)).first, null, true);
    }
}
