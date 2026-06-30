package nu;

/* loaded from: classes9.dex */
public final class b extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        java.lang.String str2;
        w05.a aVar;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        int i17 = simpleMsgInfo.f345617d;
        cVar.fromXml(simpleMsgInfo.getString(i17 + 13));
        b00.r rVar = (b00.r) ((c00.z2) i95.n0.c(c00.z2.class));
        rVar.getClass();
        v05.b k17 = cVar.k();
        w05.a aVar2 = k17 != null ? (w05.a) k17.getCustom(k17.f432315e + 56) : null;
        if (aVar2 == null || (str = aVar2.A()) == null) {
            str = "";
        }
        if (aVar2 == null || (str2 = aVar2.getNickname()) == null) {
            str2 = "";
        }
        java.lang.String cj6 = rVar.cj(str, str2);
        int i18 = recordDataItem.f303422d;
        recordDataItem.set(i18 + 0, cj6);
        recordDataItem.set(i18 + 2, java.lang.Integer.valueOf(simpleMsgInfo.getInteger(i17 + 5) == 111 ? 39 : 34));
        v05.b k18 = cVar.k();
        if (k18 == null || (aVar = (w05.a) k18.getCustom(k18.f432315e + 56)) == null) {
            return true;
        }
        s15.k kVar = new s15.k();
        java.lang.String k19 = aVar.k();
        if (k19 == null) {
            k19 = "";
        }
        kVar.V(k19);
        java.lang.String nickname = aVar.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        kVar.g0(nickname);
        java.lang.String o17 = aVar.o();
        if (o17 == null) {
            o17 = "";
        }
        kVar.Z(o17);
        java.lang.String appId = aVar.getAppId();
        if (appId == null) {
            appId = "";
        }
        kVar.T(appId);
        java.lang.String path = aVar.getPath();
        if (path == null) {
            path = "";
        }
        kVar.h0(path);
        java.lang.String j17 = aVar.j();
        if (j17 == null) {
            j17 = "";
        }
        kVar.U(j17);
        java.lang.String B = aVar.B();
        if (B == null) {
            B = "";
        }
        kVar.o0(B);
        java.lang.String r17 = aVar.r();
        if (r17 == null) {
            r17 = "";
        }
        kVar.d0(r17);
        java.lang.String s17 = aVar.s();
        if (s17 == null) {
            s17 = "";
        }
        kVar.e0(s17);
        java.lang.String t17 = aVar.t();
        if (t17 == null) {
            t17 = "";
        }
        kVar.f0(t17);
        java.lang.String finderUsername = aVar.getFinderUsername();
        if (finderUsername == null) {
            finderUsername = "";
        }
        kVar.b0(finderUsername);
        java.lang.String w17 = aVar.w();
        if (w17 == null) {
            w17 = "";
        }
        kVar.j0(w17);
        java.lang.String G = aVar.G();
        if (G == null) {
            G = "";
        }
        kVar.t0(G);
        kVar.k0(aVar.x());
        java.lang.String q17 = aVar.q();
        if (q17 == null) {
            q17 = "";
        }
        kVar.c0(q17);
        java.lang.String A = aVar.A();
        if (A == null) {
            A = "";
        }
        kVar.n0(A);
        java.lang.String H = aVar.H();
        if (H == null) {
            H = "";
        }
        kVar.u0(H);
        java.lang.String R = aVar.R();
        if (R == null) {
            R = "";
        }
        kVar.F0(R);
        java.lang.String u17 = aVar.u();
        if (u17 == null) {
            u17 = "";
        }
        kVar.i0(u17);
        java.lang.String n17 = aVar.n();
        if (n17 == null) {
            n17 = "";
        }
        kVar.Y(n17);
        java.lang.String l17 = aVar.l();
        if (l17 == null) {
            l17 = "";
        }
        kVar.W(l17);
        java.lang.String description = aVar.getDescription();
        if (description == null) {
            description = "";
        }
        kVar.v0(description);
        java.lang.String p17 = aVar.p();
        kVar.a0(p17 != null ? p17 : "");
        kVar.p0(aVar.C());
        kVar.q0(aVar.E());
        kVar.r0(aVar.F());
        kVar.C0(aVar.O());
        kVar.D0(aVar.P());
        kVar.x0(aVar.J());
        kVar.z0(aVar.K());
        kVar.E0(aVar.Q());
        kVar.B0(aVar.N());
        kVar.A0(aVar.L());
        kVar.w0(aVar.I());
        kVar.l0(aVar.y());
        kVar.m0(aVar.z());
        recordDataItem.A0(kVar);
        return true;
    }
}
