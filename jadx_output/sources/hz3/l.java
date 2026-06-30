package hz3;

/* loaded from: classes12.dex */
public final class l extends hz3.p {
    @Override // hz3.p, hz3.a0
    public void a(ry3.p request, hz3.z zVar) {
        int i17;
        kotlin.jvm.internal.o.g(request, "request");
        long j17 = request.f401527a;
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(request.f401530d, request.f401529c);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        hz3.j jVar = new hz3.j(h0Var, c0Var, c0Var2);
        if (!n17.J2() && !n17.o2()) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            jVar.invoke(null, bool, bool);
            i17 = 1;
        } else if (n17.A0() == 1) {
            long msgId = n17.getMsgId();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 T1 = m11.b1.Di().T1(n17.Q0(), msgId);
            kotlin.jvm.internal.o.f(T1, "getByMsgLocalId(...)");
            if (T1.f322633a == 0) {
                long I0 = n17.I0();
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                T1 = m11.b1.Di().b2(n17.Q0(), I0);
            }
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            i17 = 1;
            java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(n17, bm5.f0.f22562g, m11.b1.Di().G2(n17.Q0(), T1), "", "");
            if (com.tencent.mm.sdk.platformtools.y1.g(aj6)) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                aj6 = m11.b1.Di().P0(aj6);
            }
            if (com.tencent.mm.vfs.w6.j(aj6)) {
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                jVar.invoke(aj6, bool2, bool2);
            } else {
                java.lang.String str = T1.f322637e;
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String y27 = m11.b1.Di().y2(n17, bm5.c0.f22550a.d(T1.l()), str, "", "");
                if (com.tencent.mm.vfs.w6.j(y27)) {
                    java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                    jVar.invoke(y27, bool3, bool3);
                }
            }
        } else {
            i17 = 1;
            long I02 = n17.I0();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(n17.Q0(), I02);
            if (b27.j()) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String G2 = m11.b1.Di().G2(n17.Q0(), b27);
                i95.m c17 = i95.n0.c(tg3.u0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.lang.String ob6 = tg3.u0.ob((tg3.u0) c17, n17, bm5.f0.f22562g, G2, "", "", false, false, 64, null);
                if (com.tencent.mm.sdk.platformtools.y1.g(ob6)) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    ob6 = m11.b1.Di().P0(ob6);
                }
                if (com.tencent.mm.vfs.w6.j(ob6)) {
                    java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
                    jVar.invoke(ob6, bool4, bool4);
                }
            }
            java.lang.String str2 = b27.f322637e;
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            java.lang.String y28 = m11.b1.Di().y2(n17, bm5.c0.f22550a.d(b27.l()), str2, "", "");
            if (com.tencent.mm.vfs.w6.j(y28)) {
                jVar.invoke(y28, java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(b27.j()));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanChatImageStrategy", "getCDNImageInfoList-chat msgId: %s, talker: %s, session: %s, isHdImageValid: %s, hasHd: %s", java.lang.Long.valueOf(request.f401529c), request.f401530d, java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(c0Var.f310112d), java.lang.Boolean.valueOf(c0Var2.f310112d));
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
        hz3.s sVar = new hz3.s(j17, 2);
        c(request.f401529c, request.f401530d, sVar, c0Var.f310112d);
        hz3.s sVar2 = new hz3.s(j17, i17);
        java.lang.String str3 = (java.lang.String) h0Var.f310123d;
        kotlin.jvm.internal.o.g(str3, "<set-?>");
        sVar2.f286355b = str3;
        c(request.f401529c, request.f401530d, sVar2, c0Var.f310112d);
        hz3.t a17 = hz3.v.a(sVar, hz3.i.a(request.f401528b));
        hz3.t a18 = hz3.v.a(sVar2, hz3.i.a(request.f401528b));
        java.lang.String str4 = request.f401531e;
        if (str4 == null || str4.length() == 0) {
            if (com.tencent.mm.vfs.w6.j(sVar2.f286355b)) {
                request.f401531e = sVar2.f286355b;
            } else if (com.tencent.mm.vfs.w6.j(sVar.f286355b)) {
                request.f401531e = sVar.f286355b;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanChatImageStrategy", "getCDNImageInfoList-chat result midImage fileId: %s, aesKey: %s, hdImage fileId: %s aesKey: %s", sVar.f286357d, com.tencent.mm.sdk.platformtools.t8.G1(sVar.f286358e), sVar2.f286357d, com.tencent.mm.sdk.platformtools.t8.G1(sVar2.f286358e));
        hz3.k kVar = new hz3.k(h0Var2, h0Var3, arrayList, c0Var, c0Var2, j17, request, sVar, sVar2, zVar);
        h0Var2.f310123d = sVar.a();
        h0Var3.f310123d = sVar2.a();
        int i18 = a17.f286361a;
        if (i18 == 1) {
            b(request, sVar, kVar);
            return;
        }
        int i19 = a18.f286361a;
        if (i19 == 1) {
            b(request, sVar2, kVar);
            return;
        }
        if (i19 == 2) {
            b(request, sVar2, kVar);
            return;
        }
        if (i18 == 2) {
            b(request, sVar, kVar);
            return;
        }
        hz3.t tVar = new hz3.t();
        tVar.f286363c = 3;
        tVar.f286364d = 401;
        kVar.b(tVar);
    }

    public final void c(long j17, java.lang.String str, hz3.s sVar, boolean z17) {
        int i17 = sVar.f286354a;
        if (i17 == 2) {
            sVar.f286359f = 0;
            java.lang.String b17 = hz3.m.f286348a.b(pt0.f0.f358209b1.n(str, j17));
            if (b17 == null) {
                b17 = "";
            }
            sVar.f286355b = b17;
        } else if (i17 == 1) {
            sVar.f286359f = z17 ? 1 : 0;
        }
        java.lang.String str2 = sVar.f286355b;
        android.graphics.Point point = null;
        if (!(str2 == null || str2.length() == 0) && com.tencent.mm.vfs.w6.j(str2)) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.tencent.mm.graphics.e.d(str2, options);
            point = new android.graphics.Point(options.outWidth, options.outHeight);
        }
        sVar.f286356c = point;
        hz3.m.a(sVar, j17, str, sVar.f286359f);
    }

    @Override // hz3.p, hz3.a0
    public java.lang.String name() {
        return "MicroMsg.AiScanChatImageStrategy";
    }
}
