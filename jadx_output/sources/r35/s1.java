package r35;

/* loaded from: classes11.dex */
public class s1 implements lz.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r35.u1 f369253a;

    public s1(r35.u1 u1Var) {
        this.f369253a = u1Var;
    }

    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        r35.v1 v1Var;
        r35.u1 u1Var = this.f369253a;
        r35.d2 d2Var = u1Var.f369277i;
        if (d2Var == null || (v1Var = u1Var.f369274f) == null) {
            return;
        }
        boolean z17 = v1Var.f369304w;
        if (!z17 ? v1Var.f369293i || i17 != v1Var.f369302u + 1 : v1Var.f369293i || i17 != v1Var.f369302u + 2) {
            d2Var.b(viewGroup, view, i17);
            return;
        }
        boolean z18 = v1Var.f369293i;
        if (!z18 && i17 == v1Var.f369302u) {
            if (v1Var.f369305x) {
                d2Var.c(viewGroup, view, i17);
                return;
            }
            return;
        }
        if (!z18 && i17 == v1Var.f369302u + 1) {
            if (z17) {
                if (com.tencent.mm.storage.z3.R4(u1Var.f369278j)) {
                    u1Var.f369277i.a(viewGroup, view, i17);
                    return;
                } else {
                    u1Var.f369274f.a(0);
                    return;
                }
            }
            return;
        }
        if (z18 && v1Var.g(i17)) {
            u1Var.f369277i.a(viewGroup, view, i17);
            return;
        }
        r35.v1 v1Var2 = u1Var.f369274f;
        if (v1Var2.f369293i && !v1Var2.g(i17)) {
            u1Var.f369277i.d(viewGroup, view, i17);
            return;
        }
        r35.v1 v1Var3 = u1Var.f369274f;
        if (v1Var3.f369293i || !v1Var3.g(i17)) {
            return;
        }
        u1Var.f369277i.e(viewGroup, view, i17);
    }
}
