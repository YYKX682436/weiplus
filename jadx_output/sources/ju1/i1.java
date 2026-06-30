package ju1;

/* loaded from: classes9.dex */
public final class i1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f301739d;

    public i1(java.util.List list) {
        this.f301739d = list;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f301739d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            g4Var.add(0, i17, 1, ((r45.xt) obj).f390384d);
            i17 = i18;
        }
    }
}
