package ev2;

/* loaded from: classes10.dex */
public final class q extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final ev2.e f256928f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f256929g;

    public q(ev2.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f256928f = action;
    }

    @Override // fp0.d
    public void a() {
        ev2.p pVar = new ev2.p(this);
        ev2.t tVar = (ev2.t) this.f256928f;
        tVar.getClass();
        tVar.f256906a++;
        fv2.f fVar = new fv2.f(tVar.f256933c);
        long t07 = tVar.f256934d.t0();
        int i17 = tVar.f256935e ? 3 : 4;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.a13 a13Var = new r45.a13();
        iv2.b bVar = fVar.f266974m;
        a13Var.f369632f = bVar.f295125a;
        a13Var.f369633g = bVar.f295126b;
        a13Var.f369639p = null;
        a13Var.f369630d = db2.t4.f228171a.a(6989);
        a13Var.f369635i = t07;
        a13Var.f369636m = i17;
        a13Var.f369637n = tVar.f256936f;
        a13Var.f369631e = java.lang.System.currentTimeMillis();
        lVar.f70664a = a13Var;
        lVar.f70665b = new r45.b13();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderunilike";
        lVar.f70667d = 6989;
        fVar.p(lVar.a());
        fVar.l().K(new ev2.s(tVar, pVar));
    }

    @Override // fp0.d
    public java.lang.String d() {
        ev2.t tVar = (ev2.t) this.f256928f;
        return "id_" + tVar.f256933c.f295130f + '_' + tVar.f256934d.t0() + '_' + tVar.f256935e + '_' + tVar.f256936f + '_' + tVar.f256907b;
    }
}
