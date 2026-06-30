package t21;

/* loaded from: classes12.dex */
public class n1 implements m11.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dn.h f414842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t21.o1 f414843b;

    public n1(t21.o1 o1Var, dn.h hVar) {
        this.f414843b = o1Var;
        this.f414842a = hVar;
    }

    @Override // m11.a0
    public void a(int i17, int i18, long j17, java.lang.String str) {
        if (i17 == 4 && i18 == 102) {
            gm0.j1.e().j(new t21.m1(this));
            return;
        }
        t21.o1 o1Var = this.f414843b;
        t21.b.a(o1Var.f414848d.f415038n, 0);
        o1Var.f414848d.M(this.f414842a);
        t21.w0 w0Var = o1Var.f414848d;
        w0Var.f415031d.onSceneEnd(i17, i18, "", w0Var);
    }
}
