package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class u1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.x1 f158496d;

    public u1(com.tencent.mm.plugin.ringtone.uic.x1 x1Var) {
        this.f158496d = x1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qx3.e eVar = (qx3.e) obj;
        int i17 = eVar.f367352b;
        if (i17 != 1) {
            if (i17 == 2) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.ringtone.uic.s1(eVar, this.f158496d));
            } else if (i17 == 3 && eVar.f367351a == c01.z1.r().hashCode()) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.ringtone.uic.t1(this.f158496d));
                if (by3.a.f36370b) {
                    b21.m.g();
                    ((ll3.j1) ((c21.i) i95.n0.c(c21.i.class))).getClass();
                    b21.r b17 = b21.m.b();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MusicFloatBallService", "resumeMusicFloatBall %s", b17);
                    if ((b17 == null || b17.N) ? false : true) {
                        b17.N = true;
                        b21.m.k(b17);
                    }
                    ll3.q0.d(b17);
                }
                by3.a.f36370b = false;
            }
        } else if (eVar.f367351a != c01.z1.r().hashCode()) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.ringtone.uic.r1(this.f158496d));
        }
        return jz5.f0.f302826a;
    }
}
