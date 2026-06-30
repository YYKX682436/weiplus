package gl0;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static gl0.b f272794a;

    public static void a(java.util.List list, gl0.a aVar) {
        if (f272794a != null) {
            jl0.b bVar = jl0.b.f300193b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                fl0.b bVar2 = (fl0.b) it.next();
                if (bVar2 != null) {
                    java.lang.String str = null;
                    if (j62.e.g().a("clicfg_kara_sns_cache_switch_v2", "1", true, true).equals("1")) {
                        if (nl0.c.f338161c == null) {
                            nl0.c.b();
                        }
                        nl0.f fVar = nl0.c.f338161c;
                        fVar.getClass();
                        java.lang.String c17 = ((pl0.e) bVar2).c();
                        if (c17 != null) {
                            l75.k0 k0Var = fVar.f338167d;
                            kotlin.jvm.internal.o.d(k0Var);
                            android.database.Cursor B = k0Var.B("select * from PredictResultCache where uid=" + c17 + " and biz=MomentVideo", new java.lang.String[0]);
                            try {
                                if (B.moveToNext()) {
                                    dm.l9 l9Var = new dm.l9();
                                    l9Var.convertFrom(B);
                                    str = l9Var.field_ret;
                                }
                                B.close();
                            } catch (java.lang.Throwable th6) {
                                if (B != null) {
                                    B.close();
                                }
                                throw th6;
                            }
                        }
                    }
                    if (str == null) {
                        arrayList.add(bVar2);
                    } else if (str.equals("1")) {
                        aVar.a(bVar2, 0L, true, 1.0f);
                    } else {
                        aVar.a(bVar2, 0L, false, 0.0f);
                    }
                }
            }
            jl0.a aVar2 = new jl0.a(aVar);
            jl0.b bVar3 = jl0.b.f300193b;
            bVar3.getClass();
            ((ku5.t0) ku5.t0.f312615d).q(new hl0.c(bVar3, "MomentVideo", arrayList, aVar2, true));
        }
    }
}
