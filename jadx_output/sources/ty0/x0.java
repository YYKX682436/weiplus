package ty0;

/* loaded from: classes14.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJMusicInfo f423028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f423029e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.maas.model.MJMusicInfo mJMusicInfo, long j17) {
        super(2);
        this.f423028d = mJMusicInfo;
        this.f423029e = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        int i17 = z0.d.f468903a;
        z0.c cVar = z0.a.f468899k;
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        float f17 = 8;
        z0.t h17 = d0.a2.h(pVar, ((float) 1.5d) * f17, 0.0f, 2, null);
        long j17 = this.f423029e;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(693286680);
        s1.t0 a17 = d0.n2.a(d0.p.f225184b, cVar, y0Var2, 48);
        y0Var2.U(-1323940314);
        n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
        p2.f fVar = (p2.f) y0Var2.i(h3Var);
        n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10652k;
        p2.s sVar = (p2.s) y0Var2.i(h3Var2);
        n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10656o;
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var3);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(h17);
        boolean z17 = y0Var2.f333761b instanceof n0.e;
        if (!z17) {
            n0.l.a();
            throw null;
        }
        y0Var2.X();
        if (y0Var2.L) {
            y0Var2.j(aVar);
        } else {
            y0Var2.i0();
        }
        y0Var2.f333784y = false;
        yz5.p pVar2 = u1.f.f423590e;
        n0.i5.a(y0Var2, a17, pVar2);
        yz5.p pVar3 = u1.f.f423589d;
        n0.i5.a(y0Var2, fVar, pVar3);
        yz5.p pVar4 = u1.f.f423591f;
        n0.i5.a(y0Var2, sVar, pVar4);
        yz5.p pVar5 = u1.f.f423592g;
        n0.i5.a(y0Var2, k4Var, pVar5);
        y0Var2.n();
        ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-678309503);
        a0.q1.a(rz0.a.d(com.tencent.mm.R.raw.icons_filled_music, y0Var2, 0), null, d0.a3.h(pVar, ((float) 2.5d) * f17), null, null, 0.0f, null, y0Var2, com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.CTRL_INDEX, 120);
        float f18 = 1 * f17;
        z0.t h18 = d0.a2.h(pVar, f18, 0.0f, 2, null);
        y0Var2.U(733328855);
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar2 = (p2.f) y0Var2.i(h3Var);
        p2.s sVar2 = (p2.s) y0Var2.i(h3Var2);
        androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var3);
        yz5.q a19 = s1.g0.a(h18);
        if (!z17) {
            n0.l.a();
            throw null;
        }
        y0Var2.X();
        if (y0Var2.L) {
            y0Var2.j(aVar);
        } else {
            y0Var2.i0();
        }
        y0Var2.f333784y = false;
        n0.i5.a(y0Var2, c17, pVar2);
        n0.i5.a(y0Var2, fVar2, pVar3);
        n0.i5.a(y0Var2, sVar2, pVar4);
        n0.i5.a(y0Var2, k4Var2, pVar5);
        y0Var2.n();
        ((u0.i) a19).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        java.lang.String songName = this.f423028d.getSongName();
        if (songName == null) {
            songName = "";
        }
        java.lang.String str = songName;
        long z18 = ((p2.f) y0Var2.i(h3Var)).z(15);
        long j18 = ((ty0.a1) y0Var2.i(ty0.z0.f423042a)).f422780e;
        z0.t j19 = d0.a3.j(pVar, 13 * f17);
        z0.d dVar = z0.a.f468893e;
        kotlin.jvm.internal.o.g(j19, "<this>");
        boolean z19 = androidx.compose.ui.platform.f3.f10562a;
        ty0.x.b(str, true, j17, j19.k(new d0.q(dVar, false, androidx.compose.ui.platform.e3.f10553d)), true, j18, z18, null, null, null, 0L, null, 0, 0L, 0, false, null, null, y0Var2, 1597488, 0, 262016);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        a0.q1.a(rz0.a.d(com.tencent.mm.R.raw.arrow_right, y0Var2, 0), "music_icon", d0.a3.i(pVar, ((float) 0.5d) * f17, f18), null, null, 0.0f, null, y0Var2, com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.CTRL_INDEX, 120);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
