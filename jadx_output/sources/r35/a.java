package r35;

/* loaded from: classes11.dex */
public class a implements com.tencent.mm.modelbase.u0 {
    public r45.dz3 E;
    public r45.hy6 F;
    public r35.d4 G;
    public java.util.Map I;

    /* renamed from: d, reason: collision with root package name */
    public ns.e f369006d;

    /* renamed from: e, reason: collision with root package name */
    public ns.f f369007e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f369008f;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f369011i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.feature.openim.impl.SpamInfo f369013n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f369015p;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f369019t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f369020u;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f369014o = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f369016q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f369017r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f369018s = "";

    /* renamed from: v, reason: collision with root package name */
    public boolean f369021v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f369022w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f369023x = true;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f369024y = "";

    /* renamed from: z, reason: collision with root package name */
    public boolean f369025z = false;
    public java.lang.String A = "";
    public int B = 0;
    public int C = 0;
    public java.lang.String D = "";
    public java.lang.String H = "";

    /* renamed from: J, reason: collision with root package name */
    public final java.util.List f369005J = new java.util.LinkedList();
    public boolean K = false;
    public java.lang.String L = "";
    public long M = 0;
    public long N = 0;
    public final java.lang.String P = "";
    public final java.lang.String Q = "";
    public final java.lang.String R = "";

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f369010h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f369012m = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f369009g = null;

    public a(android.content.Context context, ns.e eVar) {
        this.f369008f = context;
        this.f369006d = eVar;
    }

    public static boolean h(com.tencent.mm.pluginsdk.model.m3 m3Var, r45.ny6 ny6Var) {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_stranger_bad_man_error_dialog_show_switch, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "isSupportStrangerBadManDialogShow() swt:%s", java.lang.Integer.valueOf(Ni));
        if (!(Ni == 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "needShowDialog, isSupportStrangerBadManDialogShow is 0.");
            return false;
        }
        if (ny6Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "needShowDialog, verifyUserSpamInfo is null.");
            return false;
        }
        if (m3Var.f189380g != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "needShowDialog, is not MM_VERIFYUSER_ADDCONTACT.");
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ny6Var.f381769f) && !com.tencent.mm.sdk.platformtools.t8.K0(ny6Var.f381768e)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "needShowDialog, key word is null.");
        return false;
    }

    public static boolean i(com.tencent.mm.pluginsdk.model.m3 m3Var) {
        if (!(m3Var instanceof com.tencent.mm.pluginsdk.model.m3)) {
            return false;
        }
        r45.my6 my6Var = (r45.my6) m3Var.f189378e.f70711b.f70700a;
        if (my6Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "needShowErrorDialog, response is null.");
            return false;
        }
        if (m3Var.f189380g == 1) {
            return h(m3Var, my6Var.f380932f);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "needShowErrorDialog, MM_VERIFYUSER_ADDCONTACT is not.");
        return false;
    }

    public void a(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        this.f369018s = str2;
        b(str, linkedList, false, "");
    }

    public void b(java.lang.String str, java.util.LinkedList linkedList, boolean z17, java.lang.String str2) {
        iz5.a.g(null, str != null && str.length() > 0);
        iz5.a.g(null, linkedList != null);
        this.f369021v = z17;
        this.f369014o = str2;
        this.f369011i = linkedList;
        this.f369010h.add(str);
        this.f369017r = str;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(r4.f369008f, r5, r6, r7) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            android.content.Context r0 = r4.f369008f
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L1a
            java.lang.Class<en.k> r0 = en.k.class
            i95.m r0 = i95.n0.c(r0)
            en.k r0 = (en.k) r0
            android.content.Context r1 = r4.f369008f
            en.a r0 = (en.a) r0
            boolean r0 = r0.Zi(r1, r5, r6, r7)
            if (r0 == 0) goto L1a
            goto La8
        L1a:
            tm.a r0 = tm.a.b(r7)
            if (r0 == 0) goto L2a
            java.lang.String r1 = r0.f420399b
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto L2a
            java.lang.String r7 = r0.f420399b
        L2a:
            boolean r1 = r4.f369025z
            if (r1 == 0) goto L3d
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r1 != 0) goto L3d
            android.content.Context r5 = r4.f369008f
            java.lang.String r6 = ""
            db5.e1.s(r5, r7, r6)
            goto La8
        L3d:
            r1 = 4
            r2 = 1
            if (r5 != r1) goto L56
            r3 = -22
            if (r6 != r3) goto L56
            android.content.Context r5 = r4.f369008f
            r6 = 2131755232(0x7f1000e0, float:1.9141337E38)
            java.lang.String r6 = r5.getString(r6)
            android.widget.Toast r5 = dp.a.makeText(r5, r6, r2)
            r5.show()
            goto La8
        L56:
            if (r5 != r1) goto L98
            r5 = -24
            if (r6 == r5) goto L60
            r5 = -20604(0xffffffffffffaf84, float:NaN)
            if (r6 != r5) goto L98
        L60:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r5 != 0) goto L98
            if (r0 == 0) goto L8e
            java.lang.String r5 = r0.f420399b
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r6 != 0) goto La8
            int r6 = r0.f420400c
            if (r6 != r1) goto L84
            tm.j r6 = r0.f420404g
            if (r6 == 0) goto L84
            int r6 = r6.f420439d
            if (r6 != r2) goto L84
            cm5.c r5 = cm5.c.f43426a
            android.content.Context r6 = r4.f369008f
            r5.b(r6, r0)
            goto La8
        L84:
            android.content.Context r6 = r4.f369008f
            android.widget.Toast r5 = dp.a.makeText(r6, r5, r2)
            r5.show()
            goto La8
        L8e:
            android.content.Context r5 = r4.f369008f
            android.widget.Toast r5 = dp.a.makeText(r5, r7, r2)
            r5.show()
            goto La8
        L98:
            android.content.Context r5 = r4.f369008f
            r6 = 2131755231(0x7f1000df, float:1.9141335E38)
            java.lang.String r6 = r5.getString(r6)
            android.widget.Toast r5 = dp.a.makeText(r5, r6, r2)
            r5.show()
        La8:
            java.lang.String r5 = r4.f369017r
            java.lang.String r6 = r4.f369024y
            r7 = 0
            r4.f(r7, r7, r5, r6)
            r4.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r35.a.c(int, int, java.lang.String):void");
    }

    public final void d() {
        gm0.j1.n().f273288b.a(30, this);
        gm0.j1.n().f273288b.a(ma1.a.CTRL_INDEX, this);
        if (this.f369022w) {
            android.content.Context context = this.f369008f;
            this.f369009g = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f369008f.getString(com.tencent.mm.R.string.bbj), true, true, new r35.b(this));
        }
        if (!com.tencent.mm.storage.z3.m4((java.lang.String) this.f369010h.getFirst())) {
            com.tencent.mm.pluginsdk.model.m3 m3Var = new com.tencent.mm.pluginsdk.model.m3(1, this.f369010h, this.f369011i, this.f369012m, this.H, this.f369016q, this.I, this.f369018s, this.f369014o, this.L, this.f369005J);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f369019t)) {
                m3Var.U(this.f369019t, this.f369020u);
            }
            m3Var.T(this.A);
            m3Var.V(this.B);
            m3Var.P(this.F);
            int i17 = this.C;
            com.tencent.mm.modelbase.o oVar = m3Var.f189378e;
            java.util.Iterator it = ((r45.ly6) oVar.f70710a.f70684a).f379982f.iterator();
            while (it.hasNext()) {
                ((r45.gy6) it.next()).f375664u = i17;
            }
            java.lang.String str = this.D;
            java.util.Iterator it6 = ((r45.ly6) oVar.f70710a.f70684a).f379982f.iterator();
            while (it6.hasNext()) {
                ((r45.gy6) it6.next()).f375665v = str;
            }
            m3Var.S(this.f369023x);
            m3Var.R(this.E);
            m3Var.Q(this.M);
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "[AddFriendVerifyRecordToCloud] addContact: mClientMsgId=%d", java.lang.Long.valueOf(this.M));
            gm0.j1.n().f273288b.g(m3Var);
            return;
        }
        com.tencent.mm.feature.openim.impl.SpamInfo spamInfo = this.f369013n;
        l41.o oVar2 = new l41.o((java.lang.String) this.f369010h.getFirst(), this.f369012m.isEmpty() ? "" : (java.lang.String) this.f369012m.getFirst(), spamInfo == null ? null : spamInfo.f67320f);
        long j17 = this.M;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.String str2 = this.P;
        java.lang.String str3 = this.Q;
        java.lang.String str4 = this.R;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "setClientMsgIdWithExtInfo: clientMsgId=%s, openImCustomInfo=%s, openImAppId=%s, descWordingId=%s", valueOf, str2, str3, str4);
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "setClientMsgId: %s", java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.o oVar3 = oVar2.f315883e;
        ((r45.q4) oVar3.f70710a.f70684a).f383654h = java.lang.String.valueOf(j17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str2 != null && !str2.isEmpty()) {
            r45.k15 k15Var = new r45.k15();
            k15Var.f378312d = "openImCustomInfo";
            k15Var.f378313e = str2;
            arrayList.add(k15Var);
        }
        if (str3 != null && !str3.isEmpty()) {
            r45.k15 k15Var2 = new r45.k15();
            k15Var2.f378312d = "openImAppId";
            k15Var2.f378313e = str3;
            arrayList.add(k15Var2);
        }
        if (str4 != null && !str4.isEmpty()) {
            r45.k15 k15Var3 = new r45.k15();
            k15Var3.f378312d = "descWordingId";
            k15Var3.f378313e = str4;
            arrayList.add(k15Var3);
        }
        if (!arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "setMsgExtInfo: size=%s", java.lang.Integer.valueOf(arrayList.size()));
            r45.q4 q4Var = (r45.q4) oVar3.f70710a.f70684a;
            if (!arrayList.isEmpty()) {
                q4Var.f383655i = new java.util.LinkedList(arrayList);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "setClientMsgIdWithExtInfo: extInfo set, size=%s", java.lang.Integer.valueOf(arrayList.size()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "[AddFriendVerifyRecordToCloud] addContact isOpenIM: client msg id = %d, openImCustomInfo=%s openImAppId=%s descWordingId=%s", java.lang.Long.valueOf(this.M), str2, str3, str4);
        gm0.j1.n().f273288b.g(oVar2);
    }

    public final void e() {
        r35.d4 d4Var = this.G;
        if (d4Var != null) {
            d4Var.b();
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "errorFinishAddContact.");
        }
    }

    public final void f(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        ns.e eVar = this.f369006d;
        if (eVar != null) {
            eVar.a(z17, z18, str, str2);
        }
        if (z17) {
            com.tencent.mm.autogen.events.ModNewContactEvent modNewContactEvent = new com.tencent.mm.autogen.events.ModNewContactEvent();
            modNewContactEvent.f54497g.f8102a = str;
            modNewContactEvent.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r4 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.tencent.mm.storage.z3 r4, final java.lang.String r5, final java.lang.String r6, int r7) {
        /*
            r3 = this;
            if (r4 == 0) goto L8
            java.lang.String r4 = r4.F1
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r4 != 0) goto La
        L8:
            java.lang.String r4 = ""
        La:
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r6, r4}
            java.lang.String r1 = "MicroMsg.AddContact"
            java.lang.String r2 = "handleContactWithTicket userName:%s roomId:%s ticket:%s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L24
            r3.m(r4)
            java.util.LinkedList r4 = r3.f369011i
            r3.a(r5, r6, r4)
            goto L42
        L24:
            c01.p8 r4 = c01.n8.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r7 == 0) goto L38
            r7.intValue()
            int r7 = r7.intValue()
            int r0 = r0 + r7
        L38:
            r35.a$$c r7 = new r35.a$$c
            r7.<init>()
            c01.k7 r4 = (c01.k7) r4
            r4.g(r5, r6, r0, r7)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r35.a.g(com.tencent.mm.storage.z3, java.lang.String, java.lang.String, int):void");
    }

    public final void j(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, java.lang.String str2) {
        com.tencent.mm.modelbase.n nVar;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f369009g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f369009g = null;
        }
        gm0.j1.n().f273288b.q(30, this);
        gm0.j1.n().f273288b.q(ma1.a.CTRL_INDEX, this);
        this.K = false;
        tm.a b17 = tm.a.b(str);
        java.lang.String str3 = (b17 == null || com.tencent.mm.sdk.platformtools.t8.K0(b17.f420399b)) ? str : b17.f420399b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "onLocalSceneEnd errType=%d, errCode=%d, errMsg=%s, scene=%s, errorCtx=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()), str2);
        if (m1Var.getType() == 667) {
            com.tencent.mm.modelbase.o oVar = ((l41.o) m1Var).f315883e;
            this.N = (oVar == null || (nVar = oVar.f70711b) == null) ? 0L : ((r45.r4) nVar.f70700a).f384516d;
        } else if (m1Var.getType() == 30) {
            this.N = ((com.tencent.mm.pluginsdk.model.m3) m1Var).K();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "onLocalSceneEnd mServerMsgId = %d", java.lang.Long.valueOf(this.N));
        if (m1Var.getType() == 667) {
            boolean z17 = (i17 == 0 && i18 == 0) || i18 == -44;
            com.tencent.mm.feature.openim.impl.SpamInfo spamInfo = this.f369013n;
            int i19 = spamInfo != null && !android.text.TextUtils.isEmpty(spamInfo.f67319e) ? 4 : 3;
            int i27 = z17 ? 1 : 2;
            com.tencent.mm.feature.openim.impl.SpamInfo spamInfo2 = this.f369013n;
            cb0.a.a(i19, i27, spamInfo2 != null ? spamInfo2.f67318d : 0);
        }
        if (i17 == 0 && i18 == 0) {
            if (m1Var.getType() == 30) {
                this.f369017r = ((com.tencent.mm.pluginsdk.model.m3) m1Var).J();
            } else if (m1Var.getType() == 667) {
                this.f369017r = ((l41.o) m1Var).f315884f;
            }
            f(true, false, this.f369017r, this.f369024y);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = this.f369019t;
            objArr[1] = 1;
            objArr[2] = 0;
            objArr[3] = 0;
            objArr[4] = java.lang.Integer.valueOf(this.f369011i.size() > 0 ? ((java.lang.Integer) this.f369011i.getLast()).intValue() : 0);
            objArr[5] = 1;
            objArr[6] = 0;
            g0Var.d(18713, objArr);
            return;
        }
        if (i18 == -44) {
            java.lang.String str4 = this.f369024y;
            ns.f fVar = this.f369007e;
            if (fVar != null) {
                if (fVar.a(this.f369017r, str4, this.f369012m.isEmpty() ? "" : (java.lang.String) this.f369012m.getFirst(), i18, str2)) {
                    f(false, false, this.f369017r, str4);
                    return;
                }
            }
            l();
            return;
        }
        if (i18 == -4000) {
            java.lang.String str5 = this.f369024y;
            ns.f fVar2 = this.f369007e;
            if (fVar2 != null) {
                if (fVar2.a(this.f369017r, str5, this.f369012m.isEmpty() ? "" : (java.lang.String) this.f369012m.getFirst(), i18, str2)) {
                    f(false, false, this.f369017r, str5);
                    return;
                }
            }
            l();
            return;
        }
        if (i18 == -87) {
            android.content.Context context = this.f369008f;
            db5.e1.G(context, context.getString(com.tencent.mm.R.string.f490953bc5), "", false, new android.content.DialogInterface.OnClickListener() { // from class: r35.a$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i28) {
                    r35.a aVar = r35.a.this;
                    aVar.f(false, false, aVar.f369017r, aVar.f369024y);
                    aVar.e();
                }
            });
            return;
        }
        if (i18 == -101 && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            db5.e1.G(this.f369008f, str3, "", false, new r35.g(this));
            return;
        }
        if (i18 == -2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                c(i17, i18, null);
                return;
            } else {
                android.content.Context context2 = this.f369008f;
                db5.e1.E(context2, str3, context2.getString(com.tencent.mm.R.string.f490573yv), this.f369008f.getString(com.tencent.mm.R.string.f490507x1), false, new android.content.DialogInterface.OnClickListener() { // from class: r35.a$$b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i28) {
                        r35.a aVar = r35.a.this;
                        aVar.f(false, false, aVar.f369017r, aVar.f369024y);
                        aVar.e();
                    }
                });
                return;
            }
        }
        if (i18 != -160) {
            c(i17, i18, str);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            c(i17, i18, str);
        } else {
            android.content.Context context3 = this.f369008f;
            db5.e1.A(context3, str3, "", context3.getResources().getString(com.tencent.mm.R.string.f490358sq), this.f369008f.getResources().getString(com.tencent.mm.R.string.f490347sg), new r35.h(this), null);
        }
    }

    public void k(android.app.Activity activity, com.tencent.mm.storage.z3 z3Var, java.lang.String str, java.util.LinkedList linkedList) {
        this.f369011i = linkedList;
        if (this.f369012m == null) {
            this.f369012m = new java.util.LinkedList();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "sendRequestImmediateAddContact, userName: %s.", str);
        if (linkedList != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "sendRequestImmediateAddContact, lstScene.size: %s.", java.lang.Integer.valueOf(linkedList.size()));
        }
        if (z3Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "sendRequestImmediateAddContact, contact getUsername: %s, getAntiSpamTicket: %s.", z3Var.d1(), z3Var.F1);
        }
        java.lang.String stringExtra = activity.getIntent().getStringExtra("room_name");
        int intExtra = activity.getIntent().getIntExtra("Contact_Scene", 0);
        java.lang.String stringExtra2 = activity.getIntent().getStringExtra("AntispamTicket");
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "sendRequestImmediateAddContact, roomId = %s.", stringExtra);
        if (!android.text.TextUtils.isEmpty(stringExtra2)) {
            m(stringExtra2);
            a(str, stringExtra, linkedList);
        } else if (android.text.TextUtils.isEmpty(stringExtra)) {
            g(z3Var, str, stringExtra, intExtra);
        } else if (android.text.TextUtils.isEmpty(this.f369016q)) {
            g(z3Var, str, stringExtra, intExtra);
        } else {
            a(str, stringExtra, linkedList);
        }
    }

    public final void l() {
        r35.e4 e4Var = new r35.e4(this.f369008f, new r35.i(this));
        java.lang.String str = this.f369015p;
        if (str != null) {
            e4Var.f369099v = str;
        }
        if (this.f369021v) {
            e4Var.g(this.f369010h, this.f369011i);
        } else {
            e4Var.f(this.f369010h, this.f369011i, this.f369012m);
        }
    }

    public void m(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f369012m.add(str);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "onSceneEnd, errType = " + i17 + ", errCode = " + i18 + "," + str);
        if (m1Var.getType() != 30 && m1Var.getType() != 667) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AddContact", "not expected scene,  type = " + m1Var.getType());
            return;
        }
        boolean z17 = m1Var instanceof com.tencent.mm.pluginsdk.model.m3;
        if (z17 && ((com.tencent.mm.pluginsdk.model.m3) m1Var).f189380g != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddContact", "not opcode addcontact!");
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f369009g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f369009g = null;
        }
        if (z17) {
            com.tencent.mm.pluginsdk.model.m3 m3Var = (com.tencent.mm.pluginsdk.model.m3) m1Var;
            r45.my6 my6Var = (r45.my6) m3Var.f189378e.f70711b.f70700a;
            if (this.K) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "needShowDialog, isShowErrorDialog.");
                return;
            }
            if (my6Var != null && h(m3Var, my6Var.f380932f)) {
                java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
                android.app.Activity activity = j17 != null ? (android.app.Activity) j17.get() : null;
                if (activity != null) {
                    db5.i3 i3Var = new db5.i3(activity);
                    i3Var.L.setText(my6Var.f380932f.f381768e);
                    i3Var.M.setText(my6Var.f380932f.f381769f);
                    i3Var.N.setOnClickListener(new r35.e(this, i3Var, i17, i18, str, m1Var, my6Var));
                    r35.d dVar = new r35.d(this, i3Var);
                    i3Var.P.setOnClickListener(dVar);
                    android.view.View view = i3Var.G;
                    if (view != null) {
                        view.setOnClickListener(dVar);
                    }
                    r35.c cVar = new r35.c(this, my6Var);
                    android.widget.TextView textView = i3Var.Q;
                    textView.setOnClickListener(cVar);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(my6Var.f380932f.f381770g)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMHalfBottomDialog", "hideLinkTips");
                        textView.setVisibility(4);
                    }
                    i3Var.C();
                    this.K = true;
                    r35.d4 d4Var = this.G;
                    if (d4Var != null) {
                        d4Var.a();
                    }
                    i3Var.l(new r35.f(this));
                    return;
                }
            }
        }
        j(i17, i18, str, m1Var, null);
    }
}
