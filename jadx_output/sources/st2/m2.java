package st2;

/* loaded from: classes3.dex */
public final class m2 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f412397a;

    /* renamed from: b, reason: collision with root package name */
    public final zy2.ec f412398b;

    public m2(gk2.e eVar, zy2.ec ecVar) {
        this.f412397a = eVar;
        this.f412398b = ecVar;
    }

    @Override // l81.e1
    public void a() {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live:");
        gk2.e eVar = this.f412397a;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        sb6.append(" onAppBrandProcessDied!");
        com.tencent.mars.xlog.Log.i("MiniProgramUICallback", sb6.toString());
        mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
        if (f6Var == null) {
            return;
        }
        f6Var.B = false;
    }

    @Override // l81.e1
    public void b() {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live:");
        gk2.e eVar = this.f412397a;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        sb6.append(" luanchMiniProgram error!");
        com.tencent.mars.xlog.Log.i("MiniProgramUICallback", sb6.toString());
        mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
        if (f6Var == null) {
            return;
        }
        f6Var.B = false;
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        r45.br2 e17;
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live:");
        gk2.e eVar = this.f412397a;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        sb6.append(" onTriggerHalfScreenShare ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MiniProgramUICallback", sb6.toString());
        if ((str == null || str.length() == 0) || (e17 = zl2.b0.f473663a.e(str)) == null) {
            return;
        }
        kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "getContext(...)");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new st2.l2(e17, null), 3, null);
    }

    @Override // l81.e1
    public void e() {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live:");
        gk2.e eVar = this.f412397a;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        sb6.append(" onAppBrandUIEnter!");
        com.tencent.mars.xlog.Log.i("MiniProgramUICallback", sb6.toString());
        mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
        if (f6Var == null) {
            return;
        }
        f6Var.B = true;
    }

    @Override // l81.e1
    public void f(boolean z17) {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live:");
        gk2.e eVar = this.f412397a;
        sb6.append((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        sb6.append(" onAppBrandUIExit isFinish:");
        sb6.append(z17);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("MiniProgramUICallback", sb6.toString());
        mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
        if (f6Var != null) {
            f6Var.B = false;
        }
        zy2.ec ecVar = this.f412398b;
        if (ecVar != null) {
            ecVar.a();
        }
    }
}
