package fn4;

/* loaded from: classes15.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f264550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn4.i1 f264551f;

    public h1(fn4.i1 i1Var, java.lang.String str, int i17) {
        this.f264551f = i1Var;
        this.f264549d = str;
        this.f264550e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.b bVar;
        fn4.i1 i1Var = this.f264551f;
        fn4.l1 l1Var = i1Var.f264557f;
        if (l1Var.f264573b == null || (bVar = l1Var.f264581j) == null) {
            return;
        }
        rm4.d dVar = bVar.o4().f264479f;
        if (dVar != null && dVar.f397464m == 0) {
            dVar.f397464m = java.lang.System.currentTimeMillis() - dVar.f397452a;
        }
        fn4.c1 c1Var = i1Var.f264557f.f264573b;
        java.lang.String str = this.f264549d;
        int i17 = this.f264550e;
        c1Var.o(str, i17);
        if (i17 != 0) {
            uu4.a.a(9);
        } else {
            uu4.a.a(27);
        }
    }
}
