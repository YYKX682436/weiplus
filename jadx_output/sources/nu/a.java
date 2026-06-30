package nu;

/* loaded from: classes9.dex */
public final class a extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        w05.b bVar;
        w05.b bVar2;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        ((b00.r) ((c00.z2) i95.n0.c(c00.z2.class))).getClass();
        v05.b k17 = cVar.k();
        if (k17 == null || (bVar2 = (w05.b) k17.getCustom(k17.f432315e + 54)) == null || (str = bVar2.G()) == null) {
            str = "";
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492569oa2, str);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 0, string);
        recordDataItem.set(i17 + 2, 38);
        v05.b k18 = cVar.k();
        if (k18 != null && (bVar = (w05.b) k18.getCustom(k18.f432315e + 54)) != null) {
            s15.j jVar = new s15.j();
            jVar.l0(bVar.n());
            jVar.o0(bVar.getFinderUsername());
            jVar.n0(bVar.p());
            jVar.m0(bVar.o());
            jVar.u0(bVar.u());
            jVar.g0(bVar.getAppId());
            jVar.x0(bVar.y());
            jVar.F0(bVar.F());
            jVar.i0(bVar.getCoverUrl());
            jVar.G0(bVar.G());
            jVar.v0(bVar.w());
            jVar.O0(bVar.Q());
            jVar.z0(bVar.z());
            jVar.B0(bVar.B());
            jVar.Q0(bVar.S());
            jVar.k0(bVar.l());
            jVar.P0(bVar.R());
            jVar.A0(bVar.A());
            jVar.r0(bVar.s());
            jVar.q0(bVar.r());
            jVar.N0(bVar.P());
            jVar.M0(bVar.O());
            jVar.p0(bVar.q());
            jVar.L0(bVar.N());
            jVar.W0(bVar.Z());
            jVar.C0(bVar.e0());
            jVar.t0(bVar.t());
            jVar.j0(bVar.k());
            jVar.H0(bVar.H());
            jVar.R0(bVar.T());
            jVar.D0(bVar.C());
            jVar.E0(bVar.E());
            jVar.b1(bVar.f0());
            jVar.h0(bVar.j());
            jVar.I0(bVar.I());
            jVar.J0(bVar.J());
            jVar.Y0(bVar.b0());
            jVar.Z0(bVar.c0());
            jVar.T0(bVar.V());
            jVar.U0(bVar.W());
            jVar.a1(bVar.d0());
            jVar.X0(bVar.a0());
            jVar.V0(bVar.Y());
            jVar.S0(bVar.U());
            jVar.w0(bVar.x());
            jVar.K0(bVar.K());
            recordDataItem.x0(jVar);
        }
        return true;
    }
}
