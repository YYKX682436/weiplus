package im2;

/* loaded from: classes3.dex */
public final class s2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292523d;

    public s2(im2.z3 z3Var) {
        this.f292523d = z3Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        im2.z3 z3Var = this.f292523d;
        for (r45.d32 d32Var : z3Var.E1) {
            if (d32Var.f372032d == menuItem.getItemId()) {
                int i18 = d32Var.f372032d;
                if (i18 == 1) {
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c17;
                    ml2.y2 y2Var = ml2.y2.f328267w;
                    cl0.g gVar = new cl0.g();
                    ml2.x2[] x2VarArr = ml2.x2.f328221d;
                    gVar.o("type", 10);
                    zy2.zb.qg(zbVar, y2Var, gVar.toString(), null, null, 12, null);
                } else if (i18 == 2) {
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    zy2.zb zbVar2 = (zy2.zb) c18;
                    ml2.y2 y2Var2 = ml2.y2.f328267w;
                    cl0.g gVar2 = new cl0.g();
                    ml2.x2[] x2VarArr2 = ml2.x2.f328221d;
                    gVar2.o("type", 11);
                    zy2.zb.qg(zbVar2, y2Var2, gVar2.toString(), null, null, 12, null);
                }
                z3Var.n7(d32Var);
                return;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
