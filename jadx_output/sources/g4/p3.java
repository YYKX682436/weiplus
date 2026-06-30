package g4;

/* loaded from: classes5.dex */
public final class p3 implements g4.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g4.q3 f268490a;

    public p3(g4.q3 q3Var) {
        this.f268490a = q3Var;
    }

    public void a(int i17, int i18) {
        androidx.paging.compose.c cVar = (androidx.paging.compose.c) this.f268490a.f268520j;
        if (i18 > 0) {
            androidx.paging.compose.e.a(cVar.f11714a);
        } else {
            cVar.getClass();
        }
    }

    public void b(int i17, int i18) {
        androidx.paging.compose.c cVar = (androidx.paging.compose.c) this.f268490a.f268520j;
        if (i18 > 0) {
            androidx.paging.compose.e.a(cVar.f11714a);
        } else {
            cVar.getClass();
        }
    }

    public void c(int i17, int i18) {
        androidx.paging.compose.c cVar = (androidx.paging.compose.c) this.f268490a.f268520j;
        if (i18 > 0) {
            androidx.paging.compose.e.a(cVar.f11714a);
        } else {
            cVar.getClass();
        }
    }

    public void d(g4.a1 loadType, boolean z17, g4.y0 loadState) {
        kotlin.jvm.internal.o.g(loadType, "loadType");
        kotlin.jvm.internal.o.g(loadState, "loadState");
        g4.q3 q3Var = this.f268490a;
        g4.e1 e1Var = q3Var.f268513c;
        e1Var.getClass();
        g4.z0 z0Var = z17 ? e1Var.f268265e : e1Var.f268264d;
        if (kotlin.jvm.internal.o.b(z0Var != null ? z0Var.b(loadType) : null, loadState)) {
            return;
        }
        q3Var.f268513c.b(loadType, z17, loadState);
        g4.a0 c17 = q3Var.f268513c.c();
        java.util.Iterator it = q3Var.f268514d.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).invoke(c17);
        }
    }
}
