package gm0;

/* loaded from: classes12.dex */
public class s implements z65.a {
    public s(gm0.y yVar) {
    }

    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "CallbackForReset errorStack %s ", str);
        gm0.j1.i();
        if (gm0.j1.f() != null) {
            gm0.j1.i();
            c01.kd f17 = gm0.j1.f();
            f17.f37290a = true;
            java.util.Iterator it = ((java.util.HashSet) f17.f37291b).iterator();
            while (it.hasNext()) {
                c01.jd jdVar = (c01.jd) it.next();
                if (jdVar != null) {
                    jdVar.a();
                }
            }
            f17.f37290a = false;
        }
        gm0.j1.i();
        if (gm0.j1.u() != null) {
            gm0.j1.i();
            gm0.b0 u17 = gm0.j1.u();
            l75.k0 k0Var = u17.f273153f;
            if (k0Var != null) {
                k0Var.close();
            }
            u17.f273158k = false;
        }
    }
}
