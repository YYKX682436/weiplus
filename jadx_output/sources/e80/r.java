package e80;

/* loaded from: classes12.dex */
public final class r extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public static final e80.g f250075f = new e80.g(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    public static final r70.h T6(e80.r rVar, r70.g gVar, long j17, long j18, java.lang.String str) {
        rVar.getClass();
        gVar.getClass();
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(str, j17);
        if (k17 == null) {
            r70.h hVar = new r70.h(r70.i.f393114e, gVar);
            hVar.f393111c = j17;
            hVar.f393112d = j18;
            return hVar;
        }
        if (k17.I0() == 0 || k17.P0() != 2) {
            return null;
        }
        r70.h hVar2 = new r70.h(r70.i.f393121o, gVar);
        hVar2.f393111c = j17;
        hVar2.f393112d = j18;
        return hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U6(e80.r r23, r70.g r24, r70.e r25, o70.l r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e80.r.U6(e80.r, r70.g, r70.e, o70.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void V6(r70.c event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((v70.w) i95.n0.c(v70.w.class)).ij().put(event.f393074a.f393102d + '_' + event.f393076c, java.lang.Float.valueOf(event.f393078e));
        pm0.v.X(new e80.h(event));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W6(r70.g r10, r70.e r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e80.r.W6(r70.g, r70.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void X6(r70.g gVar, java.lang.String str) {
        zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str, 3, null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgSyncSendFSC", "imageCheckDup[" + gVar.f393104f + "] %s ret:%s hitCache:%s copyResult:%s replaceResult:%s", str, java.lang.Integer.valueOf(bj6.f477691a), java.lang.Boolean.valueOf(bj6.f477692b), java.lang.Boolean.valueOf(bj6.f477694d), java.lang.Long.valueOf(bj6.f477695e));
    }

    public final java.lang.Object Y6(s70.d dVar, s70.g gVar, r70.e eVar, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        j15.d dVar2 = dVar.f403926c;
        r45.lu6 lu6Var = new r45.lu6();
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = gVar.f403948e;
        du5Var.f372757e = true;
        lu6Var.set(1, du5Var);
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = gVar.f403946c;
        du5Var2.f372757e = true;
        lu6Var.set(2, du5Var2);
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f372756d = gVar.f403947d;
        du5Var3.f372757e = true;
        lu6Var.set(3, du5Var3);
        lu6Var.set(8, 3);
        k70.i0 i0Var = gVar.f403950g;
        lu6Var.set(9, i0Var.f304647f);
        lu6Var.set(28, java.lang.Integer.valueOf(i0Var.f304655n));
        lu6Var.set(23, java.lang.Integer.valueOf(dVar2.o().q()));
        lu6Var.set(22, java.lang.Integer.valueOf(dVar2.o().n()));
        lu6Var.set(20, dVar2.o().p());
        lu6Var.set(21, java.lang.Integer.valueOf((int) dVar2.o().o()));
        lu6Var.set(4, java.lang.Integer.valueOf((int) dVar2.o().o()));
        lu6Var.set(5, 0);
        lu6Var.set(6, java.lang.Integer.valueOf((int) dVar2.o().o()));
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(new byte[0]);
        lu6Var.set(7, cu5Var);
        j15.b j17 = dVar2.j();
        if (j17 == null || (str = j17.getAppId()) == null) {
            str = "";
        }
        lu6Var.set(30, str);
        j15.b j18 = dVar2.j();
        if (j18 == null || (str2 = j18.j()) == null) {
            str2 = "";
        }
        lu6Var.set(33, str2);
        j15.b j19 = dVar2.j();
        if (j19 == null || (str3 = j19.k()) == null) {
            str3 = "";
        }
        lu6Var.set(31, str3);
        j15.b j27 = dVar2.j();
        if (j27 == null || (str4 = j27.l()) == null) {
            str4 = "";
        }
        lu6Var.set(32, str4);
        lu6Var.set(17, 1);
        lu6Var.set(36, "");
        java.lang.String u17 = dVar2.o().u();
        if (u17 == null) {
            u17 = "";
        }
        lu6Var.set(39, u17);
        p15.x t17 = dVar2.t();
        if (t17 != null) {
            r45.hz3 hz3Var = new r45.hz3();
            hz3Var.f376563d = t17.getAppId();
            hz3Var.f376566g = t17.j();
            hz3Var.f376565f = t17.getIconUrl();
            hz3Var.f376564e = t17.getNickname();
            hz3Var.f376568i = java.lang.String.valueOf(t17.n());
            hz3Var.f376567h = t17.l();
            hz3Var.f376569m = t17.o();
            lu6Var.set(44, hz3Var);
        }
        p15.m q17 = dVar2.q();
        if (q17 != null) {
            r45.gz3 gz3Var = new r45.gz3();
            gz3Var.f375669d = q17.k();
            gz3Var.f375670e = q17.j();
            lu6Var.set(43, gz3Var);
        }
        p15.h k17 = dVar2.k();
        if (k17 != null) {
            r45.ez3 ez3Var = new r45.ez3();
            ez3Var.f373840e = k17.j();
            ez3Var.f373839d = k17.n();
            java.lang.Long o17 = k17.o();
            ez3Var.f373841f = o17 != null ? (int) o17.longValue() : -1;
            java.lang.Long k18 = k17.k();
            ez3Var.f373842g = k18 != null ? k18.longValue() : -1L;
            java.lang.Long p17 = k17.p();
            ez3Var.f373843h = p17 != null ? (int) p17.longValue() : -1;
            java.lang.Long l17 = k17.l();
            ez3Var.f373844i = l17 != null ? (int) l17.longValue() : -1;
            lu6Var.set(54, ez3Var);
        }
        if (dVar.f403928e == 1) {
            lu6Var.set(29, 1);
            lu6Var.set(16, "");
            lu6Var.set(24, "");
        } else {
            lu6Var.set(16, dVar2.o().getAeskey());
            lu6Var.set(24, dVar2.o().l());
        }
        lu6Var.set(10, java.lang.Integer.valueOf(gVar.f403949f));
        if (gVar.f403949f == 1) {
            lu6Var.set(18, java.lang.Integer.valueOf((int) dVar2.o().r()));
            lu6Var.set(19, java.lang.Integer.valueOf((int) dVar2.o().getLength()));
            lu6Var.set(14, dVar2.o().j());
            lu6Var.set(15, dVar2.o().k());
        } else {
            lu6Var.set(18, 0);
            lu6Var.set(19, java.lang.Integer.valueOf((int) dVar2.o().getLength()));
            lu6Var.set(14, "");
            lu6Var.set(15, dVar2.o().k());
        }
        lu6Var.set(27, java.lang.Integer.valueOf(dVar.f403929f));
        lu6Var.set(26, dVar2.o().getMd5());
        lu6Var.set(40, java.lang.Integer.valueOf((int) dVar2.o().s()));
        lu6Var.set(42, dVar2.o().w());
        lu6Var.set(45, dVar2.o().x());
        r15.b bVar = i0Var.f304661t;
        if (bVar == null || (str5 = bVar.toXml()) == null) {
            str5 = "";
        }
        lu6Var.set(53, str5);
        j15.c t18 = dVar2.o().t();
        if (t18 != null) {
            lu6Var.set(46, java.lang.Integer.valueOf(t18.j()));
            lu6Var.set(47, java.lang.Integer.valueOf((int) t18.getSize()));
            lu6Var.set(48, t18.getMd5());
            lu6Var.set(49, t18.k());
            lu6Var.set(50, java.lang.Integer.valueOf((int) t18.o()));
            lu6Var.set(51, t18.n());
            lu6Var.set(52, t18.l());
            lu6Var.set(55, java.lang.Integer.valueOf((int) t18.p()));
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 110;
        lVar.f70666c = "/cgi-bin/micromsg-bin/uploadmsgimg";
        lVar.f70664a = lu6Var;
        lVar.f70665b = new r45.mu6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(eVar.f393087a, eVar.f393088b);
        com.tencent.mm.modelbase.g gVar2 = iVar.f70644d;
        kotlin.jvm.internal.o.f(gVar2, "scene(...)");
        if (!w11.c1.a(msgIdTalker, gVar2)) {
            java.lang.Object b17 = rm0.h.b(iVar, continuation);
            return b17 == pz5.a.f359186d ? b17 : (com.tencent.mm.modelbase.f) b17;
        }
        com.tencent.mm.modelbase.f fVar = new com.tencent.mm.modelbase.f();
        fVar.f70615a = 3;
        fVar.f70616b = org.chromium.net.NetError.ERR_SSL_BAD_RECORD_MAC_ALERT;
        fVar.f70617c = "";
        fVar.f70618d = null;
        fVar.f70620f = iVar;
        fVar.f70619e = gVar2;
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z6(r70.g r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e80.r.Z6(r70.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b A[PHI: r11
  0x009b: PHI (r11v8 java.lang.Object) = (r11v7 java.lang.Object), (r11v1 java.lang.Object) binds: [B:17:0x0098, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(r70.g r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof e80.o
            if (r0 == 0) goto L13
            r0 = r11
            e80.o r0 = (e80.o) r0
            int r1 = r0.f250055i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f250055i = r1
            goto L18
        L13:
            e80.o r0 = new e80.o
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f250053g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f250055i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r11)
            goto L9b
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            java.lang.Object r10 = r0.f250052f
            p70.a r10 = (p70.a) r10
            java.lang.Object r2 = r0.f250051e
            r70.g r2 = (r70.g) r2
            java.lang.Object r4 = r0.f250050d
            e80.r r4 = (e80.r) r4
            kotlin.ResultKt.throwOnFailure(r11)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L80
        L47:
            kotlin.ResultKt.throwOnFailure(r11)
            r70.c r11 = new r70.c
            r70.d r2 = r70.d.f393083d
            r11.<init>(r10, r2)
            r9.V6(r11)
            p70.a r11 = new p70.a
            int r2 = r10.f393100b
            java.lang.String r5 = r10.f393102d
            k70.i0 r6 = r10.f393103e
            java.lang.String r7 = r10.f393099a
            r11.<init>(r7, r2, r5, r6)
            java.lang.String r2 = "<set-?>"
            java.lang.String r5 = r10.f393104f
            kotlin.jvm.internal.o.g(r5, r2)
            r11.f352460e = r5
            c80.b r2 = c80.e.f39653f
            c80.e r2 = r2.a()
            r0.f250050d = r9
            r0.f250051e = r10
            r0.f250052f = r11
            r0.f250055i = r4
            java.lang.Object r2 = r2.U6(r11, r0)
            if (r2 != r1) goto L7f
            return r1
        L7f:
            r4 = r9
        L80:
            p70.b r2 = (p70.b) r2
            java.util.Map r5 = r10.f393107i
            java.util.Map r11 = r11.f352461f
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.putAll(r11)
            r11 = 0
            r0.f250050d = r11
            r0.f250051e = r11
            r0.f250052f = r11
            r0.f250055i = r3
            java.lang.Object r11 = r4.b7(r10, r2, r0)
            if (r11 != r1) goto L9b
            return r1
        L9b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e80.r.a7(r70.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0209, code lost:
    
        if ((r6.f322633a == r0.f322649q) != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(r70.g r21, p70.b r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e80.r.b7(r70.g, p70.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
