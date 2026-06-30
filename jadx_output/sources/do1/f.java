package do1;

/* loaded from: classes12.dex */
public final class f implements do1.b {
    @Override // do1.b
    public boolean a(com.tencent.mm.storage.f9 msg, long j17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return false;
    }

    @Override // do1.b
    public boolean b(bw5.u0 msgItem, bw5.t0 mediaInfo, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgItem, "msgItem");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        return false;
    }

    @Override // do1.b
    public boolean d(com.tencent.mm.storage.f9 msg, bw5.u0 msgItem, bw5.t0 mediaInfo, co1.c cVar) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(msgItem, "msgItem");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        java.lang.String str = msgItem.f33672e;
        java.lang.String str2 = msgItem.f33673f;
        java.lang.Object l17 = tn1.f.f().e().b().l(2, null);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        if (kotlin.jvm.internal.o.b((java.lang.String) l17, str)) {
            str = str2;
        }
        java.lang.String content = msgItem.f33674g;
        kotlin.jvm.internal.o.f(content, "content");
        java.util.Map<java.lang.String, java.lang.String> d17 = com.tencent.mm.sdk.platformtools.aa.d(content, "msg", null);
        com.tencent.mm.storage.g5 O = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).O(content, str);
        if (O == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackupItemEmoji", "EmojiMsgInfo is null");
            fo1.m mVar = fo1.m.f264882a;
            java.lang.String Q0 = msg.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            mVar.g("Restore", 0L, Q0, fo1.e.f264869q, mVar.e(msg));
            return false;
        }
        com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(O.f193954d);
        if (N == null) {
            N = new com.tencent.mm.storage.emotion.EmojiInfo();
            n22.m.b(O, N);
            N.field_catalog = 65;
            kotlin.jvm.internal.o.d(cVar);
            cVar.f43752a = N;
        }
        if (d17.get(".msg.emoji.$androidmd5") == null) {
            java.lang.String a17 = kn1.j.a(O.f193954d);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                O.f193954d = a17;
            }
        }
        java.lang.String str3 = O.f193952b;
        if (tn1.e.h(msg.Q0()) && tn1.e.h(str3)) {
            java.lang.String content2 = msgItem.f33674g;
            kotlin.jvm.internal.o.f(content2, "content");
            int L = r26.n0.L(content2, ":", 0, false, 6, null);
            if (L != -1) {
                java.lang.String content3 = msgItem.f33674g;
                kotlin.jvm.internal.o.f(content3, "content");
                java.lang.String substring = content3.substring(0, L);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                str3 = r26.n0.u0(substring).toString();
            }
        }
        java.lang.String str4 = str3;
        msg.setType(47);
        if (!pt0.f0.f358209b1.e()) {
            msg.i1(O.f193954d);
        }
        r15.b bVar = new r15.b();
        try {
            bVar.fromXmlMap(d17, "msg");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RoamBackupItemEmoji", th6, "recover parse extCommonInfo err", new java.lang.Object[0]);
        }
        msg.d1(com.tencent.mm.storage.y4.e(str4, 0L, (N.k() || N.B1()) ? false : true, O.f193954d, false, bVar.n() != null ? bVar.toXml() : ""));
        return true;
    }

    @Override // do1.b
    public co1.h e(long j17, com.tencent.mm.storage.f9 msg, do1.a backupExtraInfo) {
        java.lang.String y07;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(backupExtraInfo, "backupExtraInfo");
        bw5.u0 u0Var = new bw5.u0();
        u0Var.f33671d = msg.getType();
        u0Var.f33672e = msg.y0();
        u0Var.f33673f = msg.T0();
        java.lang.String j18 = msg.j();
        if (j18 == null) {
            j18 = "";
        }
        u0Var.f33674g = j18;
        u0Var.f33675h = msg.getCreateTime();
        java.lang.String str = msg.G;
        u0Var.f33676i = str != null ? str : "";
        u0Var.f33677m = msg.I0();
        u0Var.f33678n = msg.F0();
        bw5.t0 t0Var = new bw5.t0();
        t0Var.f33202d = msg.I0();
        java.lang.String str2 = new com.tencent.mm.storage.y4(msg.j()).f196357e;
        kotlin.jvm.internal.o.f(str2, "getOriginalContent(...)");
        int length = str2.length() - 1;
        int i17 = 0;
        boolean z17 = false;
        while (i17 <= length) {
            boolean z18 = kotlin.jvm.internal.o.i(str2.charAt(!z17 ? i17 : length), 32) <= 0;
            if (z17) {
                if (!z18) {
                    break;
                }
                length--;
            } else if (z18) {
                i17++;
            } else {
                z17 = true;
            }
        }
        java.lang.String obj = str2.subSequence(i17, length + 1).toString();
        if (!kn1.k.g(obj)) {
            obj = com.tencent.mm.storage.y4.c(msg.j());
            if (kn1.k.g(obj)) {
                com.tencent.mm.sdk.platformtools.t8.G1(obj);
            } else {
                if (tn1.e.h(msg.Q0())) {
                    java.lang.String j19 = msg.j();
                    kotlin.jvm.internal.o.f(j19, "getContent(...)");
                    int K = r26.n0.K(j19, ':', 0, false, 6, null);
                    if (msg.A0() == 1 || K == -1) {
                        y07 = msg.y0();
                    } else {
                        java.lang.String j27 = msg.j();
                        kotlin.jvm.internal.o.f(j27, "getContent(...)");
                        java.lang.String substring = j27.substring(0, K);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        y07 = r26.n0.u0(substring).toString();
                    }
                } else {
                    y07 = msg.y0();
                }
                java.lang.String y08 = tn1.e.h(msg.Q0()) ? msg.A0() != 1 ? msg.y0() : msg.T0() : msg.T0();
                r45.ed edVar = new r45.ed();
                r45.du5 du5Var = new r45.du5();
                du5Var.f372756d = msg.y0();
                du5Var.f372757e = true;
                edVar.f373281f = du5Var;
                r45.du5 du5Var2 = new r45.du5();
                du5Var2.f372756d = msg.T0();
                du5Var2.f372757e = true;
                edVar.f373282g = du5Var2;
                java.lang.String b17 = kn1.j.b(msg, y07, y08, edVar);
                if (msg.A0() == 1 || !tn1.e.h(msg.Q0())) {
                    obj = b17;
                } else {
                    obj = r26.b0.b(y07 + " :\n                                    " + b17);
                }
            }
        }
        if (obj != null && kn1.k.f(obj)) {
            u0Var.f33674g = obj;
            return new co1.h(u0Var, t0Var);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackupItemEmoji", "emoji error:" + com.tencent.mm.sdk.platformtools.t8.G1(obj));
        fo1.m mVar = fo1.m.f264882a;
        java.lang.String Q0 = msg.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        mVar.g("Backup", j17, Q0, fo1.e.f264860e, mVar.e(msg));
        return null;
    }

    @Override // do1.b
    public long g(com.tencent.mm.storage.f9 msg, java.lang.String mediaId, int i17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        return 0L;
    }
}
