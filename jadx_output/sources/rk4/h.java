package rk4;

/* loaded from: classes11.dex */
public final class h implements qk.j6 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f396683a = jz5.h.b(rk4.g.f396668d);

    public final qk.g9 A() {
        return (qk.g9) ((jz5.n) this.f396683a).getValue();
    }

    @Override // qk.j6
    public int a() {
        return ((rk4.z8) A()).Di();
    }

    @Override // qk.j6
    public bw5.lp0 b() {
        return ((rk4.z8) A()).uj();
    }

    @Override // qk.j6
    public void c(float f17) {
        ((rk4.z8) A()).yj(f17);
    }

    @Override // qk.j6
    public int d() {
        ((rk4.z8) A()).getClass();
        jm4.g3 g3Var = zk4.l.f473540c;
        if (g3Var != null) {
            return (int) ((jm4.h3) g3Var).s();
        }
        return 0;
    }

    @Override // qk.j6
    public boolean e(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        return ((rk4.z8) A()).oj(id6);
    }

    @Override // qk.j6
    public java.lang.String f(int i17) {
        return ((rk4.z8) A()).Vi(i17);
    }

    @Override // qk.j6
    public void g(bw5.o50 categoryItem) {
        jm4.z2 z2Var;
        com.tencent.unit_rc.BaseObjectDef baseObjectDef;
        kotlin.jvm.internal.o.g(categoryItem, "categoryItem");
        ((rk4.z8) A()).getClass();
        com.tencent.unit_rc.BaseObjectDef baseObjectDef2 = zk4.l.f473540c;
        bw5.dr0 a17 = (baseObjectDef2 == null || (z2Var = (jm4.z2) urgen.ur_0025.UR_C8FE.UR_97F8(((jm4.h3) baseObjectDef2).getCppPointer())) == null || (baseObjectDef = (jm4.k3) urgen.ur_0025.UR_2801.UR_9AFC(((jm4.a3) z2Var).getCppPointer())) == null) ? null : ((b66.c) baseObjectDef).a();
        if (a17 == null || !kotlin.jvm.internal.o.b(a17.b().b().c(), categoryItem.c()) || categoryItem.c().length() <= 0 || baseObjectDef2 == null) {
            return;
        }
        urgen.ur_2BA9.UR_C8FE.UR_1B62(((b66.q) baseObjectDef2).getCppPointer());
    }

    @Override // qk.j6
    public int getDuration() {
        return ((rk4.z8) A()).Ai();
    }

    @Override // qk.j6
    public qk.p9 getType() {
        return qk.p9.f364312d;
    }

    @Override // qk.j6
    public float h() {
        return ((rk4.z8) A()).h();
    }

    @Override // qk.j6
    public qk.ia i() {
        return ((rk4.z8) A()).Ri();
    }

    @Override // qk.j6
    public boolean isAvailable() {
        return ((rk4.z8) A()).fj();
    }

    @Override // qk.j6
    public b66.z j() {
        jm4.u2 a17 = jm4.w2.f300435d.a();
        if (a17 != null) {
            b66.g a18 = ((jm4.w2) a17).a(bw5.eq0.TingMusic);
            if (a18 != null) {
                return (b66.z) urgen.ur_2BA9.UR_882D.UR_375A(((b66.i) a18).getCppPointer());
            }
        }
        return null;
    }

    @Override // qk.j6
    public void k(java.lang.String taskId, bw5.lp0 item, il4.e ext) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ext, "ext");
        ((rk4.z8) A()).qj(taskId, item, ext);
    }

    @Override // qk.j6
    public b66.j l() {
        int i17 = jm4.k5.f300395d;
        return (jm4.i5) urgen.ur_0025.UR_1F2B.UR_1332();
    }

    @Override // qk.j6
    public boolean m(qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2) {
        return true;
    }

    @Override // qk.j6
    public void n(boolean z17) {
        ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(z17);
    }

    @Override // qk.j6
    public boolean next() {
        ((rk4.z8) A()).getClass();
        com.tencent.unit_rc.BaseObjectDef baseObjectDef = zk4.l.f473540c;
        if (baseObjectDef == null) {
            return false;
        }
        urgen.ur_2BA9.UR_C8FE.UR_D25D(((b66.q) baseObjectDef).getCppPointer());
        return true;
    }

    @Override // qk.j6
    public org.json.JSONObject o(bw5.lp0 playingItem, float f17) {
        kotlin.jvm.internal.o.g(playingItem, "playingItem");
        return ((rk4.z8) A()).Ui(playingItem, f17);
    }

    @Override // qk.j6
    public void p(boolean z17) {
        ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(z17);
    }

    @Override // qk.j6
    public boolean pause() {
        ((rk4.z8) A()).pj();
        return true;
    }

    @Override // qk.j6
    public boolean q(java.lang.String str) {
        return ((rk4.z8) A()).mj(str);
    }

    @Override // qk.j6
    public void r(android.content.Context context, boolean z17, bw5.lp0 lp0Var, il4.e eVar, bw5.o50 o50Var, android.os.Bundle bundle, bw5.ar0 enterScene, qk.a aVar, java.lang.Boolean bool, yz5.a aVar2) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        ((rk4.k8) ((rk4.z8) A()).aj()).z(context, z17, lp0Var, eVar, o50Var, bundle, enterScene, aVar2);
    }

    @Override // qk.j6
    public boolean resume() {
        return ((rk4.z8) A()).wj();
    }

    @Override // qk.j6
    public void s(boolean z17) {
        ((rk4.z8) A()).getClass();
        com.tencent.unit_rc.BaseObjectDef baseObjectDef = zk4.l.f473540c;
        if (baseObjectDef != null) {
            urgen.ur_2BA9.UR_C8FE.UR_51AB(((b66.q) baseObjectDef).getCppPointer(), z17, true);
        }
    }

    @Override // qk.j6
    public boolean seekTo(long j17) {
        return ((rk4.z8) A()).xj(j17);
    }

    @Override // qk.j6
    public boolean stop() {
        return ((rk4.z8) A()).zj();
    }

    @Override // qk.j6
    public void t(int i17) {
        ((rk4.z8) A()).getClass();
        com.tencent.unit_rc.BaseObjectDef baseObjectDef = zk4.l.f473540c;
        if (baseObjectDef != null) {
            urgen.ur_2BA9.UR_C8FE.UR_E81E(((b66.q) baseObjectDef).getCppPointer(), i17, true);
        }
    }

    @Override // qk.j6
    public boolean u() {
        return ((rk4.z8) A()).ij();
    }

    @Override // qk.j6
    public android.content.Context v() {
        return ((rk4.z8) A()).bj();
    }

    @Override // qk.j6
    public void w(bw5.lp0 lp0Var, java.util.List list, bw5.o50 o50Var, bw5.pp0 pp0Var, il4.e ext) {
        kotlin.jvm.internal.o.g(ext, "ext");
        ((rk4.z8) A()).rj(lp0Var, list, o50Var, pp0Var, ext);
    }

    @Override // qk.j6
    public bw5.cr0 x() {
        return ((rk4.z8) A()).vj();
    }

    @Override // qk.j6
    public boolean y() {
        ((rk4.z8) A()).getClass();
        com.tencent.unit_rc.BaseObjectDef baseObjectDef = zk4.l.f473540c;
        if (baseObjectDef == null) {
            return false;
        }
        urgen.ur_2BA9.UR_C8FE.UR_E80B(((b66.q) baseObjectDef).getCppPointer());
        return true;
    }

    @Override // qk.j6
    public void z(java.lang.String listenId, il4.e ext) {
        kotlin.jvm.internal.o.g(listenId, "listenId");
        kotlin.jvm.internal.o.g(ext, "ext");
        ((rk4.z8) A()).sj(listenId, ext);
    }
}
