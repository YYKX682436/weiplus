package ws2;

/* loaded from: classes3.dex */
public final class d implements zs2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f449021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ws2.h f449022b;

    public d(ws2.k1 k1Var, ws2.h hVar) {
        this.f449021a = k1Var;
        this.f449022b = hVar;
    }

    public void a(r45.r71 r71Var) {
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        r45.i72 i72Var;
        jz5.f0 f0Var = null;
        r0 = null;
        r45.o52 o52Var = null;
        if (r71Var != null) {
            ws2.k1 k1Var = this.f449021a;
            ws2.b0 b0Var = (ws2.b0) k1Var.e(ws2.b0.class);
            if (b0Var != null) {
                we2.c cVar = new we2.c();
                cVar.f445218a = cVar.f445218a;
                cVar.f445219b = cVar.f445219b;
                cVar.f445220c = new we2.b(r71Var, 0, 2, null);
                mm2.e1 e1Var = (mm2.e1) k1Var.e(mm2.e1.class);
                cVar.f445221d = e1Var != null ? e1Var.f328995y : null;
                b0Var.P6(cVar);
            }
            java.lang.String str = this.f449022b.f449044b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMsg,cur liveId:");
            ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
            sb6.append(jVar != null ? java.lang.Long.valueOf(jVar.O6()) : null);
            sb6.append(",uv:");
            mm2.e1 e1Var2 = (mm2.e1) k1Var.e(mm2.e1.class);
            sb6.append((e1Var2 == null || (nw1Var2 = e1Var2.f328988r) == null || (i72Var = (r45.i72) nw1Var2.getCustom(44)) == null) ? null : java.lang.Long.valueOf(i72Var.getLong(1)));
            sb6.append(",liveCharge:");
            cm2.a aVar = cm2.a.f43328a;
            mm2.e1 e1Var3 = (mm2.e1) k1Var.e(mm2.e1.class);
            if (e1Var3 != null && (nw1Var = e1Var3.f328988r) != null) {
                o52Var = (r45.o52) nw1Var.getCustom(28);
            }
            sb6.append(aVar.l(o52Var));
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            no0.h.f338720a.a();
        }
    }
}
