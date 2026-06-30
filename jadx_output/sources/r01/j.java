package r01;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a */
    public static final r01.j f368119a = new r01.j();

    /* renamed from: b */
    public static final kk.j f368120b = new kk.l(20);

    public static /* synthetic */ void b(r01.j jVar, int i17, java.lang.String str, com.tencent.mm.storage.f9 f9Var, r01.f fVar, r01.g gVar, long j17, int i18, java.lang.Long l17, int i19, java.lang.Integer num, int i27, java.lang.Object obj) {
        jVar.a(i17, str, f9Var, fVar, gVar, j17, i18, l17, i19, (i27 & 512) != 0 ? 0 : num);
    }

    public static r01.g e(r01.j jVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        jVar.getClass();
        if (f9Var.t2()) {
            java.util.LinkedList linkedList = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.getMsgId(), f9Var.j()).f348581i;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList) && i17 < linkedList.size()) {
                ot0.s0 s0Var = (ot0.s0) linkedList.get(i17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348762e)) {
                    try {
                        android.net.Uri parse = android.net.Uri.parse(s0Var.f348762e);
                        long V = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("mid"), 0L);
                        int P = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("idx"), 0);
                        byte[] decode = android.util.Base64.decode(parse.getQueryParameter("__biz"), 2);
                        kotlin.jvm.internal.o.f(decode, "decode(...)");
                        return new r01.g(V, P, com.tencent.mm.sdk.platformtools.t8.V(new java.lang.String(decode, r26.c.f368865a), 0L));
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        }
        return null;
    }

    public final void a(int i17, java.lang.String str, com.tencent.mm.storage.f9 f9Var, r01.f fVar, r01.g gVar, long j17, int i18, java.lang.Long l17, int i19, java.lang.Integer num) {
        int i27;
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        if (i17 != 5 || f9Var == null) {
            i27 = -1;
        } else {
            int type = f9Var.getType();
            i27 = f9Var.getType() == 49 ? ot0.q.v(f9Var.j()).f348666i : -1;
            r4 = type;
        }
        long currentTimeMillis = i17 == 4 ? java.lang.System.currentTimeMillis() : -1L;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[20];
        objArr[0] = str;
        objArr[1] = fVar != null ? java.lang.Integer.valueOf(fVar.f368058a) : null;
        objArr[2] = fVar != null ? fVar.f368060c : null;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = num;
        objArr[5] = f9Var != null ? java.lang.Long.valueOf(f9Var.getCreateTime()) : null;
        objArr[6] = java.lang.Long.valueOf(j17);
        objArr[7] = fVar != null ? java.lang.Integer.valueOf(fVar.f368059b) : null;
        objArr[8] = f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null;
        objArr[9] = java.lang.Integer.valueOf(i18);
        objArr[10] = valueOf;
        objArr[11] = gVar != null ? java.lang.Long.valueOf(gVar.f368072c) : null;
        objArr[12] = gVar != null ? java.lang.Long.valueOf(gVar.f368070a) : null;
        objArr[13] = gVar != null ? java.lang.Integer.valueOf(gVar.f368071b) : null;
        objArr[14] = java.lang.Long.valueOf(currentTimeMillis);
        objArr[15] = fVar != null ? java.lang.Integer.valueOf(fVar.f368061d) : null;
        objArr[16] = java.lang.Integer.valueOf(r4);
        objArr[17] = java.lang.Integer.valueOf(i27);
        objArr[18] = l17;
        objArr[19] = java.lang.Integer.valueOf(i19);
        g0Var.d(19202, objArr);
    }

    public final void c(com.tencent.mm.storage.f9 f9Var, r01.f fVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.G)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChattingItemReportHelper", "fillReportMsgSendType msg source null");
            return;
        }
        if (f9Var.getType() == 318767153) {
            fVar.f368059b = 2;
        }
        c01.ea w17 = c01.w9.w(f9Var.G);
        if (w17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChattingItemReportHelper", "fillReportMsgSendType msg source value null");
            return;
        }
        int i17 = w17.f37145d;
        fVar.f368061d = i17;
        if (w17.f37143b == 3) {
            fVar.f368059b = 1;
        }
        if (i17 >= 4 && i17 <= 6) {
            fVar.f368059b = 5;
        }
        if (r01.a0.t0(f9Var)) {
            fVar.f368059b = 4;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.R1())) {
            return;
        }
        fVar.f368059b = 3;
    }

    public final void d(com.tencent.mm.storage.f9 f9Var, r01.f fVar) {
        ot0.q v17;
        f9Var.P1();
        fVar.getClass();
        f9Var.R1();
        if (f9Var.b3()) {
            fVar.f368058a = 1;
        } else if (f9Var.g3()) {
            fVar.f368058a = 9;
        } else if (f9Var.J2()) {
            fVar.f368058a = 2;
        } else if (f9Var.isVideo()) {
            fVar.f368058a = 5;
        } else if (f9Var.getType() == 452984881 || f9Var.getType() == 520093745) {
            fVar.f368058a = 6;
        } else {
            if (f9Var.t2()) {
                fVar.f368058a = 3;
                java.util.LinkedList linkedList = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.getMsgId(), f9Var.j()).f348581i;
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    java.lang.String str = ((ot0.s0) linkedList.get(0)).f348762e;
                    fVar.f368060c = str != null ? str : "";
                }
            } else if (f9Var.a3()) {
                fVar.f368058a = 10;
            } else if (f9Var.k2() && f9Var.j() != null && (v17 = ot0.q.v(f9Var.j())) != null) {
                int i17 = v17.f348666i;
                if (i17 == 33 || i17 == 36) {
                    fVar.f368058a = 4;
                    java.lang.String str2 = v17.f348674k;
                    fVar.f368060c = str2 != null ? str2 : "";
                    java.lang.String str3 = v17.f348677k2;
                    fVar.getClass();
                } else if (i17 == 5) {
                    fVar.f368058a = 7;
                } else if (i17 == 3) {
                    fVar.f368058a = 8;
                }
            }
        }
        if (fVar.f368060c.length() > 0) {
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.y9.a(fVar.f368060c);
            kotlin.jvm.internal.o.f(a17, "doUrlEncode(...)");
            fVar.f368060c = a17;
        }
    }
}
