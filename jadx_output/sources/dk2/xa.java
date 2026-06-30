package dk2;

/* loaded from: classes3.dex */
public final class xa {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.xa f234344a = new dk2.xa();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f234345b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f234346c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f234347d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f234348e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f234349f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f234350g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f234351h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f234352i;

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f234353j;

    static {
        ae2.in inVar = ae2.in.f3688a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", "saveMyselfCommentValue:" + ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.S1).getValue()).r()).intValue());
        f234345b = "LAW_MSG_CLIENT_ID";
        f234346c = "WELCOME_MSG_CLIENT_ID";
        f234347d = "BIZ_MSG_CLIENT_ID";
        f234348e = "LOC_MSG_CLIENT_ID";
        f234349f = "GAME_JUMP_MSG_CLIENT_ID";
        f234350g = "MIC_SYS_MSG_ID";
        f234351h = "HIGHLIGHT_COMMENT_MSG_CLIENT_ID";
        f234352i = new java.lang.String[]{"WELCOME_MSG_CLIENT_ID", "BIZ_MSG_CLIENT_ID", "LOC_MSG_CLIENT_ID", "GAME_JUMP_MSG_CLIENT_ID", "MIC_SYS_MSG_ID", "BEAUTY_SYS_MSG_ID", "HIGHLIGHT_COMMENT_MSG_CLIENT_ID"};
        f234353j = new int[]{1, 10007, 10008, 100000, 100004, 10006, 20001, 20002, 20013, 20014, 100001, 20019, 20020, 20031, 20035, 20031, 20032, 20034, 1000066, 20090, 20091, 20098, 20125, 20078, 20122};
    }

    public final void a(gk2.e eVar, int i17, java.lang.String str) {
        if (eVar != null) {
            java.lang.String string = i17 == 1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d47, str) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d5b, str);
            kotlin.jvm.internal.o.d(string);
            r45.t12 t12Var = new r45.t12();
            t12Var.set(3, 100001);
            t12Var.set(2, string);
            dk2.u uVar = new dk2.u(t12Var);
            uVar.f234137b = i17;
            uVar.f234138c = str;
            ((mm2.x4) eVar.a(mm2.x4.class)).f329528f.add(uVar);
        }
    }

    public final void b(gk2.e eVar, android.content.Intent intent) {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (eVar == null || intent == null || !intent.getBooleanExtra("key_insert_highlight_comment", false)) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_highlight_comment_txt");
        intent.removeExtra("key_insert_highlight_comment");
        intent.removeExtra("key_highlight_comment_txt");
        if (stringExtra == null || stringExtra.length() == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", "appendHighlightCommentTip skip, content empty.");
            return;
        }
        mm2.x4 x4Var = (mm2.x4) eVar.a(mm2.x4.class);
        java.util.List list = x4Var.f329528f;
        kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((dk2.zf) it.next()).getType() == 100004) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        if (i17 != -1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", "appendHighlightCommentTip skip, already inserted.");
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) eVar.a(mm2.c1.class)).f328846n;
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject != null ? finderObject.getContact() : null;
        r45.t12 t12Var = new r45.t12();
        r45.xn1 xn1Var = new r45.xn1();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        if (contact == null || (str = contact.getUsername()) == null) {
            str = "";
        }
        finderContact.setUsername(str);
        if (contact == null || (str2 = contact.getNickname()) == null) {
            str2 = "";
        }
        finderContact.setNickname(str2);
        if (contact == null || (str3 = contact.getHeadUrl()) == null) {
            str3 = "";
        }
        finderContact.setHeadUrl(str3);
        xn1Var.set(0, finderContact);
        t12Var.set(8, xn1Var);
        t12Var.set(2, stringExtra);
        t12Var.set(3, 100004);
        t12Var.set(6, f234351h);
        x4Var.f329528f.add(new dk2.mf(t12Var));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", "appendHighlightCommentTip inserted, content=".concat(r26.p0.E0(stringExtra, 50)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, java.lang.Boolean.TRUE) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, java.lang.Boolean.TRUE) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(gk2.e r12, r45.u63 r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.xa.c(gk2.e, r45.u63):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:17:0x0076->B:34:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(gk2.e r15) {
        /*
            r14 = this;
            if (r15 == 0) goto Le2
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r15.a(r0)
            mm2.c1 r0 = (mm2.c1) r0
            r45.ze2 r0 = r0.f328787c4
            if (r0 == 0) goto Le2
            r1 = 3
            java.lang.String r2 = r0.getString(r1)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L20
            int r2 = r2.length()
            if (r2 != 0) goto L1e
            goto L20
        L1e:
            r2 = r3
            goto L21
        L20:
            r2 = r4
        L21:
            r2 = r2 ^ r4
            r5 = 0
            if (r2 == 0) goto L26
            goto L27
        L26:
            r0 = r5
        L27:
            if (r0 == 0) goto Le2
            r45.t12 r2 = new r45.t12
            r2.<init>()
            r6 = 10018(0x2722, float:1.4038E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.set(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 2
            java.lang.String r9 = r0.getString(r8)
            r7.append(r9)
            java.lang.String r9 = " • "
            r7.append(r9)
            java.lang.String r9 = r0.getString(r1)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r2.set(r8, r7)
            java.lang.String r7 = dk2.xa.f234348e
            r9 = 6
            r2.set(r9, r7)
            dk2.ja r7 = new dk2.ja
            r7.<init>(r2, r0)
            java.lang.Class<mm2.x4> r2 = mm2.x4.class
            androidx.lifecycle.c1 r2 = r15.a(r2)
            mm2.x4 r2 = (mm2.x4) r2
            java.util.List r2 = r2.f329528f
            java.lang.String r9 = "<get-msgList>(...)"
            kotlin.jvm.internal.o.f(r2, r9)
            monitor-enter(r2)
            java.util.Iterator r9 = r2.iterator()     // Catch: java.lang.Throwable -> Ldf
        L76:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> Ldf
            if (r10 == 0) goto Lb5
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Ldf
            r11 = r10
            dk2.zf r11 = (dk2.zf) r11     // Catch: java.lang.Throwable -> Ldf
            int r12 = r11.getType()     // Catch: java.lang.Throwable -> Ldf
            if (r12 != r6) goto Lb1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldf
            r12.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r13 = r0.getString(r8)     // Catch: java.lang.Throwable -> Ldf
            r12.append(r13)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r13 = " • "
            r12.append(r13)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r13 = r0.getString(r1)     // Catch: java.lang.Throwable -> Ldf
            r12.append(r13)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r11 = r11.j()     // Catch: java.lang.Throwable -> Ldf
            boolean r11 = kotlin.jvm.internal.o.b(r12, r11)     // Catch: java.lang.Throwable -> Ldf
            if (r11 == 0) goto Lb1
            r11 = r4
            goto Lb2
        Lb1:
            r11 = r3
        Lb2:
            if (r11 == 0) goto L76
            r5 = r10
        Lb5:
            monitor-exit(r2)
            if (r5 != 0) goto Lc5
            java.lang.Class<mm2.x4> r0 = mm2.x4.class
            androidx.lifecycle.c1 r15 = r15.a(r0)
            mm2.x4 r15 = (mm2.x4) r15
            java.util.List r15 = r15.f329528f
            r15.add(r7)
        Lc5:
            java.lang.String r15 = "Finder.FinderLiveMsgManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "appendLocationTip:"
            r0.<init>(r1)
            r45.t12 r1 = r7.f233773a
            java.lang.String r1 = r1.getString(r8)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r15, r0)
            goto Le2
        Ldf:
            r15 = move-exception
            monitor-exit(r2)
            throw r15
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.xa.d(gk2.e):void");
    }

    public final void e(gk2.e eVar, int i17, boolean z17) {
        if (eVar != null) {
            java.lang.String string = i17 == 1 ? z17 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d2v) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d2w) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ead);
            kotlin.jvm.internal.o.d(string);
            r45.t12 t12Var = new r45.t12();
            t12Var.set(3, 10001);
            t12Var.set(2, string);
            ((mm2.x4) eVar.a(mm2.x4.class)).f329528f.add(new dk2.mf(t12Var));
        }
    }

    public final void f(gk2.e eVar) {
        java.lang.String string;
        if (eVar != null && ((mm2.e1) eVar.a(mm2.e1.class)).f7()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", "#appendMicSettingTip isScreenCastGameMode, ignore");
            return;
        }
        if (eVar != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            r45.il4 il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U;
            if (r4Var.x2(il4Var != null ? il4Var.f377129d : 0L)) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dvz);
            } else {
                r45.il4 il4Var2 = ((mm2.o4) eVar.a(mm2.o4.class)).U;
                if (r4Var.y2(il4Var2 != null ? il4Var2.f377129d : 0L)) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491671dw0);
                } else {
                    r45.il4 il4Var3 = ((mm2.o4) eVar.a(mm2.o4.class)).U;
                    if (r4Var.w2(il4Var3 != null ? il4Var3.f377129d : 0L)) {
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dvy);
                    } else {
                        r45.il4 il4Var4 = ((mm2.o4) eVar.a(mm2.o4.class)).U;
                        string = r4Var.z2(il4Var4 != null ? il4Var4.f377129d : 0L) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lzh) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dvx);
                    }
                }
            }
            kotlin.jvm.internal.o.d(string);
            if (!(string.length() == 0)) {
                r45.t12 t12Var = new r45.t12();
                t12Var.set(3, 10001);
                t12Var.set(2, string);
                t12Var.set(6, f234350g);
                ((mm2.x4) eVar.a(mm2.x4.class)).f329528f.add(new dk2.mf(t12Var));
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", "appendMicSettingTip:".concat(string));
        }
    }

    public final void g(gk2.e eVar) {
        int i17;
        if (eVar != null) {
            java.util.LinkedList linkedList = ((mm2.c1) eVar.a(mm2.c1.class)).R;
            java.util.List list = ((mm2.x4) eVar.a(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    dk2.zf zfVar = (dk2.zf) it.next();
                    if (zfVar.getType() == 10001 && zfVar.h() != 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if ((linkedList == null || linkedList.isEmpty()) || i17 != -1) {
                return;
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.nj1 nj1Var = (r45.nj1) it6.next();
                java.lang.String string = nj1Var.getString(1);
                if (!(string == null || string.length() == 0)) {
                    dk2.mf a17 = dk2.mf.f233772j.a(nj1Var, null);
                    if (a17.b()) {
                        ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
                        a17.q(b17 != null ? ya2.d.i(b17) : null, 3);
                    }
                    ((mm2.x4) eVar.a(mm2.x4.class)).f329528f.add(a17);
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", "appendNotificationInfo:" + nj1Var.getString(1));
                }
            }
        }
    }

    public final void h(gk2.e eVar, r45.gw0 gw0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#appendOfficialAccountTips nick=");
        sb6.append(gw0Var != null ? gw0Var.getString(0) : null);
        sb6.append(" user=");
        sb6.append(gw0Var != null ? gw0Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", sb6.toString());
        if (eVar == null || gw0Var == null) {
            return;
        }
        r45.t12 t12Var = new r45.t12();
        t12Var.set(3, 10019);
        t12Var.set(2, gw0Var.getString(0));
        t12Var.set(6, f234347d);
        ((mm2.x4) eVar.a(mm2.x4.class)).f329528f.add(new dk2.za(t12Var, gw0Var));
        ((ml2.r0) i95.n0.c(ml2.r0.class)).ck(false, gw0Var.getString(1), gw0Var.getString(0));
    }

    public final void i(gk2.e eVar) {
        r45.kc1 kc1Var;
        java.lang.String string;
        java.lang.Object obj;
        if (eVar == null || (kc1Var = ((mm2.c1) eVar.a(mm2.c1.class)).f328840m) == null || (string = kc1Var.getString(0)) == null) {
            return;
        }
        r45.t12 t12Var = new r45.t12();
        t12Var.set(3, 10001);
        t12Var.set(2, string);
        t12Var.set(6, f234345b);
        dk2.mf mfVar = new dk2.mf(t12Var);
        java.util.List list = ((mm2.x4) eVar.a(mm2.x4.class)).f329528f;
        kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                dk2.zf zfVar = (dk2.zf) obj;
                if (zfVar.getType() == 10001 && kotlin.jvm.internal.o.b(string, zfVar.j())) {
                    break;
                }
            }
        }
        if (obj == null) {
            ((mm2.x4) eVar.a(mm2.x4.class)).f329544y.add(f234345b);
            ((mm2.x4) eVar.a(mm2.x4.class)).f329528f.add(0, mfVar);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", "appendSysLawTip:" + mfVar.f233773a.getString(2));
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3864r5).getValue()).r()).booleanValue()) {
            r45.ch1 ch1Var = new r45.ch1();
            ch1Var.set(1, 20031);
            r45.qi1 qi1Var = new r45.qi1();
            qi1Var.set(0, 1);
            qi1Var.set(1, 65);
            qi1Var.set(2, 75);
            ch1Var.set(4, new com.tencent.mm.protobuf.g(qi1Var.toByteArray()));
            ch1Var.set(12, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            ((mm2.x4) eVar.a(mm2.x4.class)).f329528f.add(new dk2.w7(ch1Var));
            r45.ch1 ch1Var2 = new r45.ch1();
            ch1Var2.set(1, 20031);
            r45.qi1 qi1Var2 = new r45.qi1();
            qi1Var2.set(0, 1);
            qi1Var2.set(1, 45);
            qi1Var2.set(2, 55);
            ch1Var2.set(4, new com.tencent.mm.protobuf.g(qi1Var2.toByteArray()));
            ch1Var2.set(12, java.lang.Long.valueOf(ch1Var.getLong(12) + 3));
            ((mm2.x4) eVar.a(mm2.x4.class)).f329528f.add(new dk2.w7(ch1Var2));
        }
    }

    public final void j(gk2.e eVar, java.lang.String str, java.lang.String str2) {
        int i17;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        if (eVar != null) {
            boolean z17 = true;
            if (str == null || str.length() == 0) {
                java.lang.String str6 = ((mm2.c1) eVar.a(mm2.c1.class)).V1;
                if (!(str6 == null || str6.length() == 0)) {
                    str = ((mm2.c1) eVar.a(mm2.c1.class)).V1;
                } else if (((mm2.e1) eVar.a(mm2.e1.class)).f328991u == null) {
                    com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(((mm2.e1) eVar.a(mm2.e1.class)).f328983m);
                    if (h17 != null) {
                        str = h17.getDescription();
                    }
                    str = null;
                } else {
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = ((mm2.e1) eVar.a(mm2.e1.class)).f328991u;
                    if (finderObjectDesc != null) {
                        str = finderObjectDesc.getDescription();
                    }
                    str = null;
                }
            } else {
                ((mm2.c1) eVar.a(mm2.c1.class)).V1 = str;
            }
            ((mm2.c1) eVar.a(mm2.c1.class)).W1 = str2;
            java.util.List list = ((mm2.x4) eVar.a(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else {
                        if (((dk2.zf) it.next()).getType() == 100000) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[START_LIVE], desc is empty:");
            sb6.append(str == null || str.length() == 0);
            sb6.append(", containWelcomeMsg:");
            sb6.append(i17 != -1);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", sb6.toString());
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17 || i17 != -1 || (finderObject = ((mm2.c1) eVar.a(mm2.c1.class)).f328846n) == null) {
                return;
            }
            r45.t12 t12Var = new r45.t12();
            r45.xn1 xn1Var = new r45.xn1();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
            if (contact == null || (str3 = contact.getUsername()) == null) {
                str3 = "";
            }
            finderContact.setUsername(str3);
            com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
            if (contact2 == null || (str4 = contact2.getNickname()) == null) {
                str4 = "";
            }
            finderContact.setNickname(str4);
            com.tencent.mm.protocal.protobuf.FinderContact contact3 = finderObject.getContact();
            if (contact3 == null || (str5 = contact3.getHeadUrl()) == null) {
                str5 = "";
            }
            finderContact.setHeadUrl(str5);
            xn1Var.set(0, finderContact);
            t12Var.set(8, xn1Var);
            t12Var.set(2, str);
            t12Var.set(3, 100000);
            t12Var.set(6, f234346c);
            dk2.mf mfVar = new dk2.mf(t12Var);
            if (str2 == null) {
                str2 = "";
            }
            mfVar.f233774b = str2;
            ((mm2.x4) eVar.a(mm2.x4.class)).f329528f.add(mfVar);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", "#appendWelcomeTip title got it.");
            ((kotlinx.coroutines.flow.h3) ((mm2.c1) eVar.a(mm2.c1.class)).Z1).k(mfVar);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveMsgManager", "appendWelcomeTip:" + mfVar.f233773a.getString(2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList k(java.util.LinkedList r21, java.util.LinkedList r22) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.xa.k(java.util.LinkedList, java.util.LinkedList):java.util.ArrayList");
    }
}
