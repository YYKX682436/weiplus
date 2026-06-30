package rw;

/* loaded from: classes.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f400571d;

    public d(java.util.List list) {
        this.f400571d = list;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f400571d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            g4Var.t(i17, ((rw.a) obj).f400567a, false);
            i17 = i18;
        }
    }
}
