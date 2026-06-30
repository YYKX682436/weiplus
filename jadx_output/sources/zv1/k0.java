package zv1;

/* loaded from: classes10.dex */
public final class k0 implements zv1.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv1.m0 f476315a;

    public k0(zv1.m0 m0Var) {
        this.f476315a = m0Var;
    }

    @Override // zv1.w0
    public boolean a() {
        java.util.Iterator it = this.f476315a.f476319d.iterator();
        while (it.hasNext()) {
            zv1.w0 d17 = ((zv1.d) it.next()).d();
            boolean z17 = false;
            if (d17 != null && d17.a()) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        return true;
    }

    @Override // zv1.w0
    public boolean b() {
        boolean z17;
        java.util.Iterator it = this.f476315a.f476319d.iterator();
        do {
            z17 = false;
            if (!it.hasNext()) {
                return false;
            }
            zv1.w0 d17 = ((zv1.d) it.next()).d();
            if (d17 != null && d17.b()) {
                z17 = true;
            }
        } while (!z17);
        return true;
    }

    @Override // zv1.w0
    public jz5.l c(java.lang.String path) {
        jz5.l c17;
        kotlin.jvm.internal.o.g(path, "path");
        java.util.Iterator it = this.f476315a.f476319d.iterator();
        while (it.hasNext()) {
            zv1.w0 d17 = ((zv1.d) it.next()).d();
            if (d17 != null && (c17 = d17.c(path)) != null && ((java.lang.Boolean) c17.f302833d).booleanValue()) {
                return new jz5.l(java.lang.Boolean.TRUE, c17.f302834e);
            }
        }
        return new jz5.l(java.lang.Boolean.FALSE, "");
    }
}
