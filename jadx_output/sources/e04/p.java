package e04;

/* loaded from: classes15.dex */
public class p implements com.tencent.mm.modelbase.u0, com.tencent.mm.plugin.qrcode.model.n, e04.l {

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.String f246042J = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fye) + "/qr/";
    public static final java.lang.String K = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fye) + "/sjt/qr";
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public java.lang.String F;
    public wu5.c G;
    public java.util.TimerTask H;
    public boolean I;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f246043d;

    /* renamed from: e, reason: collision with root package name */
    public int f246044e;

    /* renamed from: f, reason: collision with root package name */
    public int f246045f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f246046g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f246047h;

    /* renamed from: i, reason: collision with root package name */
    public int f246048i;

    /* renamed from: m, reason: collision with root package name */
    public int f246049m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f246050n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f246051o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f246052p;

    /* renamed from: q, reason: collision with root package name */
    public int f246053q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f246054r;

    /* renamed from: s, reason: collision with root package name */
    public android.os.Bundle f246055s;

    /* renamed from: t, reason: collision with root package name */
    public r45.db0 f246056t;

    /* renamed from: u, reason: collision with root package name */
    public int f246057u;

    /* renamed from: v, reason: collision with root package name */
    public android.app.ProgressDialog f246058v;

    /* renamed from: w, reason: collision with root package name */
    public rz3.e f246059w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.s f246060x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Map f246061y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f246062z;

    public p() {
        this.f246045f = 0;
        this.f246052p = false;
        this.f246053q = -1;
        this.f246054r = false;
        this.f246058v = null;
        this.f246059w = null;
        this.f246060x = null;
        this.f246061y = new java.util.HashMap();
        this.f246062z = null;
        this.G = null;
        this.H = null;
        this.I = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "onResume");
        gm0.j1.d().a(106, this);
        gm0.j1.d().a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, this);
        gm0.j1.d().a(ma1.i.CTRL_INDEX, this);
        gm0.j1.d().a(vb1.e.CTRL_INDEX, this);
        gm0.j1.d().a(3512, this);
        gm0.j1.d().a(7424, this);
        gm0.j1.d().a(5900, this);
        gm0.j1.d().a(6277, this);
        gm0.j1.d().a(6963, this);
        this.f246045f = 0;
    }

    public static void c(e04.p pVar, com.tencent.mm.modelbase.m1 scene) {
        pVar.getClass();
        kotlin.jvm.internal.o.g(scene, "scene");
        if (scene.getType() == 233 || scene.getType() == 106 || scene.getType() == 1061) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "OfflineScan onCancelScene processOfflineScan: %b, offlineScanNetworkType: %d", java.lang.Boolean.valueOf(pVar.f246051o), java.lang.Integer.valueOf(pVar.f246053q));
            com.tencent.mm.plugin.scanner.model.j0 j0Var = com.tencent.mm.plugin.scanner.model.j0.f158937a;
            java.lang.String str = pVar.f246046g;
            java.lang.String str2 = pVar.f246050n;
            int i17 = pVar.f246052p ? 2 : 1;
            boolean z17 = pVar.f246051o;
            j0Var.a(str, str2, i17, z17 ? pVar.f246053q : 3, z17 ? 1 : 0, pVar.f246062z);
        }
    }

    public static int i(int i17) {
        if (i17 == 30 || i17 == 37 || i17 == 38 || i17 == 40) {
            return 13;
        }
        if (i17 == 4 || i17 == 47) {
            return 12;
        }
        return i17 == 34 ? 24 : 0;
    }

    public static boolean p(int i17) {
        boolean z17;
        if (((h0.n) i95.n0.c(h0.n.class)) == null) {
            return false;
        }
        switch (i17) {
            case -200460:
            case -200459:
            case -200458:
            case -200457:
            case -200456:
            case -200455:
            case -200453:
            case -200452:
            case -200447:
            case -200446:
            case -200231:
            case -200224:
            case -200030:
                z17 = true;
                break;
            default:
                z17 = false;
                break;
        }
        return z17;
    }

    public static boolean y(int i17) {
        return i17 == 2 || i17 == 4;
    }

    public final void A(int i17) {
        if (j() instanceof com.tencent.mm.plugin.scanner.ui.BaseScanUI) {
            int i18 = ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) j()).E1;
            if (i18 != 1) {
                i18 = 2;
            }
            com.tencent.mm.plugin.scanner.model.h2.p(i17, 1, i18, ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) j()).D1, ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) j()).S);
        }
    }

    public final void B(int i17) {
        java.lang.String str;
        android.os.Bundle bundle = this.f246055s;
        if (bundle != null) {
            java.lang.String string = bundle.getString("stat_url");
            int i18 = this.A;
            if ((i18 == 6 || i18 == 0) && !com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                java.lang.String str2 = "";
                if (string == null) {
                    string = "";
                }
                try {
                    str = java.net.URLEncoder.encode(string, com.tencent.mapsdk.internal.rv.f51270c);
                    try {
                        java.lang.String str3 = this.f246046g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        str2 = java.net.URLEncoder.encode(str3, com.tencent.mapsdk.internal.rv.f51270c);
                    } catch (java.io.UnsupportedEncodingException e17) {
                        e = e17;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QBarStringHandler", e, "", new java.lang.Object[0]);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13329, str, str2, java.lang.Integer.valueOf(i17));
                    }
                } catch (java.io.UnsupportedEncodingException e18) {
                    e = e18;
                    str = "";
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13329, str, str2, java.lang.Integer.valueOf(i17));
            }
        }
    }

    public final void C(android.app.Activity activity, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "search finder contact %s", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        db2.u5 u5Var = new db2.u5(arrayList);
        ((java.util.HashMap) this.f246061y).put(u5Var, 1);
        gm0.j1.d().g(u5Var);
        this.f246058v = db5.e1.R(activity, activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.i_b), true, true, new e04.y(this, u5Var));
    }

    public void D(boolean z17) {
        if (!z17) {
            t(true, null);
            return;
        }
        rz3.e eVar = this.f246059w;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(l90.l r12) {
        /*
            r11 = this;
            r0 = r12
            tg3.r1 r0 = (tg3.r1) r0
            boolean r0 = r0.f419215f
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.ref.WeakReference r0 = r11.f246043d
            if (r0 == 0) goto L14
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L18
            return r1
        L18:
            tg3.r1 r12 = (tg3.r1) r12
            r45.iw5 r12 = r12.H()
            int r2 = r12.f377366q
            boolean r2 = com.tencent.mm.storage.z3.D3(r2)
            if (r2 == 0) goto Lbe
            r45.va0 r2 = r12.C
            if (r2 == 0) goto Lbe
            java.lang.String r2 = r2.f388022e
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 != 0) goto Lbe
            r45.va0 r12 = r12.C
            java.lang.String r12 = r12.f388022e
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r12)
            r3 = 1
            if (r2 == 0) goto L3e
            goto L55
        L3e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L55
            r2.<init>(r12)     // Catch: org.json.JSONException -> L55
            java.lang.String r12 = "BindWxaInfo"
            org.json.JSONObject r12 = r2.optJSONObject(r12)     // Catch: org.json.JSONException -> L55
            if (r12 == 0) goto L55
            java.lang.String r2 = "openWxaByBizQRCode"
            int r12 = r12.optInt(r2, r1)     // Catch: org.json.JSONException -> L55
            if (r12 <= 0) goto L55
            r12 = r3
            goto L56
        L55:
            r12 = r1
        L56:
            if (r12 == 0) goto Lbe
            int r12 = r11.E
            if (r12 <= 0) goto L5d
            goto L63
        L5d:
            int r12 = r11.f246044e
            int r12 = r11.z(r12)
        L63:
            java.lang.String r2 = r11.f246046g
            int r4 = r11.f246044e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r2, r4, r12}
            java.lang.String r2 = "MicroMsg.QBarStringHandler"
            java.lang.String r4 = "getA8Key text:%s, mQBarStringSource: %s, sceneValue: %s"
            com.tencent.mars.xlog.Log.i(r2, r4, r12)
            java.lang.Class<w60.j> r12 = w60.j.class
            i95.m r12 = i95.n0.c(r12)
            w60.j r12 = (w60.j) r12
            java.lang.String r5 = r11.f246046g
            r6 = 0
            r7 = 43
            r8 = 0
            r9 = 0
            byte[] r10 = new byte[r1]
            r4 = r12
            v60.u r4 = (v60.u) r4
            w60.k r12 = r4.Ai(r5, r6, r7, r8, r9, r10)
            java.util.Map r1 = r11.f246061y
            r2 = r12
            com.tencent.mm.modelbase.m1 r2 = (com.tencent.mm.modelbase.m1) r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r2, r4)
            com.tencent.mm.modelbase.r1 r1 = gm0.j1.d()
            r1.g(r2)
            android.app.ProgressDialog r1 = r11.f246058v
            if (r1 == 0) goto Lae
            r1.dismiss()
        Lae:
            r1 = 2131773398(0x7f1047d6, float:1.9178182E38)
            java.lang.String r0 = r0.getString(r1)
            e04.p0 r1 = new e04.p0
            r1.<init>(r11, r12)
            r11.F(r0, r1)
            return r3
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.p.E(l90.l):boolean");
    }

    public final void F(java.lang.String str, com.tencent.mm.plugin.scanner.view.r rVar) {
        if (this.f246060x == null || !this.f246054r) {
            G(str, rVar);
            return;
        }
        e();
        this.H = new e04.o2(this.f246060x, new e04.a0(this), rVar);
        this.G = ((ku5.t0) ku5.t0.f312615d).k(this.H, 500L);
    }

    public final void G(java.lang.String str, com.tencent.mm.plugin.scanner.view.r rVar) {
        android.app.ProgressDialog progressDialog = this.f246058v;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        java.lang.ref.WeakReference weakReference = this.f246043d;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        if (context == null) {
            return;
        }
        this.f246058v = db5.e1.Q(context, "", str, true, true, new e04.m0(this, rVar));
    }

    public final void a(android.app.Activity activity, int i17, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "start search contact %s", str);
        l90.k kVar = (l90.k) i95.n0.c(l90.k.class);
        int i18 = y(i17) ? 2 : 1;
        ((k90.l) kVar).getClass();
        tg3.r1 r1Var = new tg3.r1(str, i18, 5, z17);
        ((java.util.HashMap) this.f246061y).put(r1Var, 1);
        gm0.j1.d().g(r1Var);
        e04.w wVar = new e04.w(this, r1Var);
        if (activity != null) {
            if (!z17 || !this.I) {
                F(activity.getString(com.tencent.mm.R.string.i_b), wVar);
                return;
            }
            java.lang.String string = activity.getString(com.tencent.mm.R.string.i_b);
            com.tencent.mm.plugin.scanner.view.s sVar = this.f246060x;
            if (sVar == null || !this.f246054r) {
                G(string, wVar);
            } else {
                this.I = true;
                ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) sVar).u7(true, false, wVar);
            }
        }
    }

    public final void b(android.app.Activity activity, java.lang.String str, w60.k kVar) {
        r45.bx5 bx5Var;
        int i17 = kVar != null ? ((r45.r83) ((com.tencent.mm.modelsimple.k0) kVar).f71356e.f70710a.f70684a).f384618o : 0;
        r45.db0 db0Var = this.f246056t;
        int i18 = (db0Var == null || (bx5Var = db0Var.f372281d) == null) ? 0 : bx5Var.f371132d;
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "start search contact %s, searchOpenIMContactScene: %d, getA8KeyScene: %s", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
        r45.db0 db0Var2 = this.f246056t;
        r45.bx5 bx5Var2 = db0Var2 != null ? db0Var2.f372281d : null;
        ((za0.k) b0Var).getClass();
        l41.e0 e0Var = new l41.e0(str, false, i18, i17, bx5Var2);
        ((java.util.HashMap) this.f246061y).put(e0Var, 1);
        gm0.j1.d().g(e0Var);
        e04.x xVar = new e04.x(this, e0Var);
        if (activity != null) {
            if (!this.I) {
                F(activity.getString(com.tencent.mm.R.string.i_b), xVar);
                return;
            }
            java.lang.String string = activity.getString(com.tencent.mm.R.string.i_b);
            com.tencent.mm.plugin.scanner.view.s sVar = this.f246060x;
            if (sVar == null || !this.f246054r) {
                G(string, xVar);
            } else {
                this.I = true;
                ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) sVar).u7(true, false, xVar);
            }
        }
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "cancel Deal");
        this.f246046g = null;
        java.lang.ref.WeakReference weakReference = this.f246043d;
        if (weakReference != null) {
            weakReference.clear();
            this.f246043d = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "onPause");
        gm0.j1.d().q(106, this);
        gm0.j1.d().q(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, this);
        gm0.j1.d().q(ma1.i.CTRL_INDEX, this);
        gm0.j1.d().q(vb1.e.CTRL_INDEX, this);
        gm0.j1.d().q(3512, this);
        gm0.j1.d().q(7424, this);
        gm0.j1.d().q(5900, this);
        gm0.j1.d().q(6277, this);
        gm0.j1.d().q(6963, this);
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "cancelLoading");
        com.tencent.mm.plugin.scanner.view.s sVar = this.f246060x;
        if (sVar != null) {
            ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) sVar).u7(false, false, null);
        }
        android.app.ProgressDialog progressDialog = this.f246058v;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f246058v.dismiss();
        }
        wu5.c cVar = this.G;
        if (cVar != null) {
            cVar.cancel(false);
        }
        java.util.TimerTask timerTask = this.H;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    public final void f(android.app.Activity activity, java.lang.String str, int i17, int i18, int i19, java.lang.String str2, boolean z17, int i27) {
        int i28;
        java.lang.String str3;
        int i29;
        int i37;
        int i38;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "continue get a8key");
        if (i19 > 0) {
            i28 = i19;
        } else {
            i28 = this.E;
            if (i28 <= 0) {
                i28 = z(this.f246044e);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "getA8Key text:%s, mQBarStringSource: %s, sceneValue: %s", str, java.lang.Integer.valueOf(this.f246044e), java.lang.Integer.valueOf(i28));
        android.os.Bundle bundle = this.f246055s;
        int i39 = 0;
        if (bundle != null) {
            int i47 = bundle.getInt("stat_geta8key_msg_scene", 0);
            java.lang.String string = this.f246055s.getString("stat_send_msg_user");
            java.lang.String string2 = this.f246055s.getString("stat_msg_id");
            int i48 = this.f246055s.getInt("stat_scene", 0);
            java.lang.String string3 = this.f246055s.getString("stat_scene_note");
            java.lang.String string4 = this.f246055s.getString("weapp_username");
            java.lang.String replace = !com.tencent.mm.sdk.platformtools.t8.K0(string2) ? string2.replace("msg_", "").replace("sns_", "") : "";
            java.lang.String string5 = this.f246055s.getString("stat_chat_talker_username");
            java.lang.String string6 = this.f246055s.getString("wxappPathWithQuery");
            java.lang.String string7 = this.f246055s.getString("stat_url");
            if (str2 == null) {
                str11 = string7;
                str12 = this.f246055s.getString("stat_app_id");
            } else {
                str11 = string7;
                str12 = str2;
            }
            str7 = string4;
            i39 = 0;
            str8 = string;
            str9 = replace;
            i38 = i48;
            str10 = string3;
            i29 = i47;
            str4 = string5;
            str6 = string6;
            str5 = str11;
            i37 = this.f246055s.getInt("geta8key_init_request_id", 0);
            str3 = str12;
        } else {
            str3 = str2;
            i29 = 0;
            i37 = 0;
            i38 = 0;
            str4 = "";
            str5 = str4;
            str6 = str5;
            str7 = str6;
            str8 = str7;
            str9 = str8;
            str10 = str9;
        }
        byte[] bArr = new byte[i39];
        ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).getClass();
        com.tencent.mm.modelsimple.k0 k0Var = new com.tencent.mm.modelsimple.k0(str, i39);
        com.tencent.mm.modelbase.o oVar = k0Var.f71356e;
        r45.r83 r83Var = (r45.r83) oVar.f70710a.f70684a;
        r83Var.f384610d = 2;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        r83Var.f384615i = du5Var;
        r83Var.f384618o = i28;
        r83Var.f384619p = str4;
        r83Var.G = str8;
        r83Var.H = str9;
        r83Var.f384622s = 0;
        r83Var.f384626w = i17;
        r83Var.f384627x = i18;
        r83Var.f384628y = i27;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = str3;
        du5Var2.f372757e = true;
        r83Var.f384612f = du5Var2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        r83Var.B = cu5Var;
        r45.j83 j83Var = new r45.j83();
        j83Var.f377641g = i29;
        j83Var.f377643i = i38;
        j83Var.f377644m = str10;
        j83Var.f377642h = str7 != null ? str7 : "";
        try {
            r83Var.M = x51.j1.a(j83Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetA8Key", e17, "GetA8KeyClientParam byteArrayToSKBuffer", new java.lang.Object[0]);
        }
        com.tencent.mm.sdk.platformtools.t8.l(bArr);
        int a17 = com.tencent.mm.ui.i2.a(this.f246044e);
        ((r45.r83) oVar.f70710a.f70684a).D = a17;
        if (str5 != null && str5.startsWith("http")) {
            ((r45.r83) oVar.f70710a.f70684a).C = str5;
        }
        com.tencent.mm.modelbase.m mVar = oVar.f70710a;
        ((r45.r83) mVar.f70684a).I = str6;
        if (i37 != 0) {
            r45.j83 j83Var2 = new r45.j83();
            j83Var2.f377640f = i37;
            try {
                ((r45.r83) mVar.f70684a).M = x51.j1.a(j83Var2.toByteArray());
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetA8Key", e18, "GetA8KeyClientParam byteArrayToSKBuffer", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "getA8Key currentUrl:%s, qBarScene: %d, wxaPathWithQuery: %s, appId=%s, initReqId=%d", str5, java.lang.Integer.valueOf(a17), str6, str3, java.lang.Integer.valueOf(i37));
        ((java.util.HashMap) this.f246061y).put(k0Var, 1);
        gm0.j1.d().g(k0Var);
        android.app.ProgressDialog progressDialog = this.f246058v;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        F(activity != null ? activity.getString(com.tencent.mm.R.string.hq_) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hq_), new e04.g0(this, k0Var));
        if (i19 == 4 || i19 == 34) {
            pz3.c.f359182a.b(str, i19, null);
        } else if (i19 != 0) {
            pz3.c cVar = pz3.c.f359182a;
            r45.db0 db0Var = this.f246056t;
            cVar.b(str, i19, db0Var != null ? db0Var.f372281d : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63, types: [nr4.a, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v65 */
    public void g(android.app.Activity context, java.lang.String str, int i17, int i18, int i19, java.lang.String str2, int i27, int i28, rz3.e eVar, com.tencent.mm.plugin.scanner.view.s sVar, android.os.Bundle bundle, boolean z17, int i29, boolean z18, com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo, r45.db0 db0Var) {
        java.lang.String str3;
        int i37;
        android.content.Context context2;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        int i38;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        boolean z19;
        java.lang.String str17;
        ?? r27;
        int i39;
        int i47;
        int i48;
        java.lang.String str18;
        int i49;
        android.os.Bundle bundle2;
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str19 = str == null ? "" : str;
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "[handleCode-dealQBarString] info ： dealQBarString %s, scanUIScene: %d, source:%d, codeType: %s, codeVersion: %s, getA8KeyScene: %d, processOfflineScan: %b, networkStatus: %d, isFromScanUI: %b", str19, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(gm0.j1.d().n()), java.lang.Boolean.valueOf(z18));
        this.f246043d = new java.lang.ref.WeakReference(context);
        this.f246044e = i18;
        this.f246045f = i17;
        this.f246046g = str19;
        this.f246048i = i27;
        this.f246049m = i28;
        this.f246050n = str2;
        this.f246059w = eVar;
        this.f246055s = bundle;
        this.f246056t = db0Var;
        this.f246051o = z17;
        this.f246054r = z18;
        this.f246052p = i18 == 1;
        this.f246053q = i29;
        this.f246060x = sVar;
        java.lang.String string = bundle != null ? bundle.getString("stat_url", "") : "";
        if (android.text.TextUtils.isEmpty(str19)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.QBarStringHandler", "qbarString is empty");
        }
        android.content.Context context3 = (android.content.Context) this.f246043d.get();
        int n17 = gm0.j1.d().n();
        com.tencent.mm.plugin.scanner.model.j0 j0Var = com.tencent.mm.plugin.scanner.model.j0.f158937a;
        if (n17 == 0) {
            boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(context3);
            if (this.f246059w != null) {
                if (q(str19)) {
                    bundle2 = new android.os.Bundle();
                    i39 = 0;
                    bundle2.putBoolean("key_offline_scan_show_tips", false);
                } else {
                    i39 = 0;
                    bundle2 = null;
                }
                this.f246059w.a(i39, bundle2);
                this.f246059w.a(6, bundle2);
            } else {
                i39 = 0;
            }
            int i57 = isConnected ? 2 : 1;
            boolean z28 = this.f246051o;
            if (z28 || !z18) {
                int i58 = i39;
                if (z28 && z18) {
                    java.lang.String showMsg = context3.getString(isConnected ? com.tencent.mm.R.string.i_t : com.tencent.mm.R.string.i_w);
                    kotlin.jvm.internal.o.g(context, "context");
                    kotlin.jvm.internal.o.g(showMsg, "showMsg");
                    db5.e1.y(context, showMsg, "", context.getString(com.tencent.mm.R.string.f490455vj), null);
                    i47 = i58;
                } else {
                    dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f490500wu), i58 == true ? 1 : 0).show();
                    i47 = i58;
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.QBarStringHandler", "dealQBarString network unavailable and deal with offline, isConnected: %b", java.lang.Boolean.valueOf(isConnected));
                if (q(str19)) {
                    i48 = i39;
                    str18 = str19;
                    i49 = 1;
                } else {
                    boolean z29 = i39;
                    i49 = 1;
                    str18 = str19;
                    e04.o.f246034a.b(new com.tencent.mm.plugin.scanner.model.OfflineScanContext(this.f246062z, context, i57, str18, i18, i27, i28, this.f246050n, this.f246052p, bundle), context3.getString(isConnected ? com.tencent.mm.R.string.i_t : com.tencent.mm.R.string.i_w), z29);
                    i48 = z29;
                }
                java.lang.String str20 = this.f246050n;
                if (this.f246052p) {
                    i49 = 2;
                }
                j0Var.a(str18, str20, i49, i57, 0, this.f246062z);
                i47 = i48;
            }
            A(i47);
            return;
        }
        if (str19.startsWith("weixin://qr/")) {
            str3 = str19.substring(12) + "@qr";
        } else {
            str3 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            a(context, i18, str3, false);
            A(0);
            return;
        }
        if (q(str19)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "dealQBarString isPayCode and report");
            if (!z17 && z18) {
                j0Var.a(str19, this.f246050n, this.f246052p ? 2 : 1, 4, 0, this.f246062z);
            }
        }
        int a17 = o45.cg.a();
        this.f246057u = a17;
        if (i19 > 0) {
            i37 = i19;
        } else {
            i37 = this.E;
            if (i37 <= 0) {
                i37 = z(this.f246044e);
            }
        }
        java.lang.String str21 = string;
        nz3.c.a(new oz3.e(i37, a17, str19, i27, i18, db0Var != null ? db0Var.f372282e : null, scanIdentifyReportInfo, oz3.f.f350265e));
        java.lang.String str22 = str19;
        if (str22.startsWith("weixin://wxpay/bizpayurl")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "do native pay");
            rz3.e eVar2 = this.f246059w;
            if (eVar2 != null) {
                eVar2.a(5, null);
            }
            int z37 = z(this.f246044e);
            int i59 = i(z37);
            com.tencent.mm.autogen.events.PayAuthNativeEvent payAuthNativeEvent = new com.tencent.mm.autogen.events.PayAuthNativeEvent();
            am.bo boVar = payAuthNativeEvent.f54608g;
            boVar.f6265a = str22;
            boVar.f6267c = i59;
            boVar.f6266b = z37;
            boVar.f6268d = context3;
            if (bundle != null) {
                java.lang.String string2 = bundle.getString("stat_chat_talker_username");
                java.lang.String string3 = bundle.getString("stat_send_msg_user");
                jz5.l b17 = com.tencent.mm.plugin.wallet_core.utils.v0.b(this.E, string2, string3);
                boVar.f6269e = ((java.lang.Integer) b17.f302833d).intValue();
                boVar.f6270f = ((java.lang.Integer) b17.f302834e).intValue();
                boVar.f6271g = bundle.getInt("pay_qrcode_session_type", 0);
                boVar.f6272h = bundle.getString("pay_qrcode_session_name");
                boVar.f6273i = bundle.getString("pay_qrcode_timeline_objid");
                boVar.f6274j = string3;
                boVar.f6275k = bundle.getString("stat_msg_id");
                java.lang.String string4 = bundle.getString("payInitRawUrl");
                long j17 = bundle.getLong("payInitTimestamp", 0L);
                if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "PayAuthNativeEvent initRawUrl is empty, use qbarString as fallback");
                    string4 = str22;
                }
                if (j17 == 0) {
                    j17 = c01.id.a() / 1000;
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "PayAuthNativeEvent initTimestamp is 0, use current timestamp as fallback");
                }
                boVar.f6276l = string4;
                boVar.f6277m = j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "PayAuthNativeEvent set initRawUrl: " + string4 + ", initTimestamp: " + j17);
            } else {
                boVar.f6276l = str22;
                boVar.f6277m = c01.id.a() / 1000;
                com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "PayAuthNativeEvent statObj is null, use qbarString and current timestamp");
            }
            payAuthNativeEvent.f192364d = new e04.q0(this, context3, payAuthNativeEvent);
            payAuthNativeEvent.b(android.os.Looper.myLooper());
            if (!((h45.q) i95.n0.c(h45.q.class)).TenPaySDKABTestKindaEnable()) {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new e04.r0(this, payAuthNativeEvent), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            }
            B(11);
            A(11);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16472, 2, str22, str21);
            return;
        }
        if (str22.startsWith("weixin://wxpay/pcpayurl")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "[do UniPcPay]");
            rz3.e eVar3 = this.f246059w;
            if (eVar3 != null) {
                eVar3.a(5, null);
            }
            com.tencent.mm.autogen.events.UniPcPayUseCaseEvent uniPcPayUseCaseEvent = new com.tencent.mm.autogen.events.UniPcPayUseCaseEvent();
            am.pz pzVar = uniPcPayUseCaseEvent.f54910g;
            pzVar.f7672a = str22;
            pzVar.f7673b = 12;
            pzVar.f7674c = 88;
            if (bundle != null) {
                java.lang.String string5 = bundle.getString("stat_chat_talker_username");
                java.lang.String string6 = bundle.getString("stat_send_msg_user");
                jz5.l b18 = com.tencent.mm.plugin.wallet_core.utils.v0.b(this.E, string5, string6);
                pzVar.f7675d = bundle.getInt("pay_qrcode_session_type");
                pzVar.f7676e = bundle.getString("pay_qrcode_session_name");
                pzVar.f7677f = string6;
                pzVar.f7678g = bundle.getString("pay_qrcode_timeline_objid");
                pzVar.f7679h = ((java.lang.Integer) b18.f302833d).intValue();
                pzVar.f7680i = ((java.lang.Integer) b18.f302834e).intValue();
                pzVar.f7681j = bundle.getString("stat_msg_id");
            }
            pzVar.f7682k = new java.lang.ref.WeakReference(context3);
            pzVar.f7683l = new e04.s0(this, uniPcPayUseCaseEvent);
            uniPcPayUseCaseEvent.e();
            return;
        }
        if (str22.startsWith("https://wx.tenpay.com/f2f")) {
            context2 = context3;
            str4 = "MicroMsg.QBarStringHandler";
            str5 = "payInitRawUrl";
            str6 = "pay_qrcode_sender_username";
            str7 = "stat_msg_id";
            str8 = str21;
            str9 = "payInitTimestamp";
            str10 = str22;
        } else {
            if (!str22.startsWith("wxp://f2f")) {
                if (str22.startsWith("wxp://wbf2f")) {
                    rz3.e eVar4 = this.f246059w;
                    if (eVar4 != null) {
                        r27 = 0;
                        eVar4.a(5, null);
                    } else {
                        r27 = 0;
                    }
                    int i66 = i(z(this.f246044e));
                    ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
                    h45.a0.i(context3, 6, str22, i66, r27);
                    t(true, r27);
                    B(11);
                    A(11);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16472, 3, str22, str21);
                    return;
                }
                if (i27 == 22 && str22.startsWith("m")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "go to reward");
                    rz3.e eVar5 = this.f246059w;
                    if (eVar5 != null) {
                        eVar5.a(5, null);
                    }
                    if (!com.tencent.mm.sdk.platformtools.f9.DiscoveryScanPayReward.k(context3, new e04.u0(this))) {
                        A(0);
                        return;
                    }
                    int i67 = i(z(this.f246044e));
                    int i68 = this.E;
                    int i69 = i68 == 37 ? 2 : i68 == 38 ? 3 : i68 == 40 ? 4 : 1;
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    if (bundle != null) {
                        jz5.l b19 = com.tencent.mm.plugin.wallet_core.utils.v0.b(this.E, bundle.getString("stat_chat_talker_username"), bundle.getString("stat_send_msg_user"));
                        bundle3.putInt("key_chat_type", ((java.lang.Integer) b19.f302833d).intValue());
                        bundle3.putInt("key_send_type", ((java.lang.Integer) b19.f302834e).intValue());
                    }
                    ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).Ni(context3, str22, i67, str21, i69, bundle3);
                    t(true, null);
                    B(11);
                    A(11);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16472, 6, str22, str21);
                    return;
                }
                if (str22.startsWith(f246042J) || str22.startsWith("https://payapp.wechatpay.cn/qr/")) {
                    rz3.e eVar6 = this.f246059w;
                    if (eVar6 != null) {
                        eVar6.a(5, null);
                    }
                    int i76 = i(z(this.f246044e));
                    ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
                    h45.a0.i(context3, 1, str22, i76, null);
                    t(true, null);
                    B(11);
                    A(11);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16472, 5, str22, str21);
                    if (scanIdentifyReportInfo == null || scanIdentifyReportInfo.f215248m) {
                        return;
                    }
                    ((ku5.t0) ku5.t0.f312615d).g(new zs5.o0(scanIdentifyReportInfo, str22));
                    return;
                }
                if (str22.startsWith(K) || str22.startsWith("https://payapp.wechatpay.cn/sjt/qr/")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "merchant pay");
                    rz3.e eVar7 = this.f246059w;
                    if (eVar7 != null) {
                        eVar7.a(5, null);
                    }
                    int i77 = i(z(this.f246044e));
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    bundle4.putString("qrcodeUrl", str22);
                    if (bundle != null) {
                        jz5.l b27 = com.tencent.mm.plugin.wallet_core.utils.v0.b(this.E, bundle.getString("stat_chat_talker_username"), bundle.getString("stat_send_msg_user"));
                        bundle4.putInt("chat_type", ((java.lang.Integer) b27.f302833d).intValue());
                        bundle4.putInt("send_type", ((java.lang.Integer) b27.f302834e).intValue());
                        bundle4.putInt("qrcodeSessionType", bundle.getInt("pay_qrcode_session_type", 0));
                        if (bundle.getInt("pay_qrcode_session_type", 0) == 2) {
                            bundle4.putString("qrcodeSessionName", bundle.getString("pay_qrcode_session_name"));
                        } else {
                            gm0.j1.i();
                            bundle4.putString("qrcodeSessionName", (java.lang.String) gm0.j1.u().c().l(2, null));
                        }
                        bundle4.putString("qrcodeTimelineObjId", bundle.getString("pay_qrcode_timeline_objid"));
                        bundle4.putString("msg_svr_id", bundle.getString("stat_msg_id"));
                        bundle4.putString("qrcode_sender_username", bundle.getString("pay_qrcode_sender_username"));
                        str16 = "payInitRawUrl";
                        java.lang.String string7 = bundle.getString(str16);
                        str15 = "payInitTimestamp";
                        long j18 = bundle.getLong(str15, 0L);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(string7)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "startMerchantPay initRawUrl is empty, use qbarString as fallback");
                        } else {
                            str22 = string7;
                        }
                        if (j18 == 0) {
                            j18 = c01.id.a() / 1000;
                            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "startMerchantPay initTimestamp is 0, use current timestamp as fallback");
                        }
                        if (str22 == null) {
                            str22 = "";
                        }
                        bundle4.putString(str16, str22);
                        bundle4.putLong(str15, j18);
                    } else {
                        str15 = "payInitTimestamp";
                        str16 = "payInitRawUrl";
                        bundle4.putString(str16, str22);
                        bundle4.putLong(str15, c01.id.a() / 1000);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "startMerchantPay initRawUrl: %s, initTimestamp: %d", bundle4.getString(str16, ""), java.lang.Long.valueOf(bundle4.getLong(str15, 0L)));
                    ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 7);
                    intent.putExtra("pay_channel", i77);
                    intent.putExtra("ScanScene", i19);
                    intent.putExtras(bundle4);
                    j45.l.j(context3, "remittance", ".ui.RemittanceAdapterUI", intent, null);
                    t(true, null);
                    A(0);
                    return;
                }
                if (i27 == 22 && str22.startsWith("n")) {
                    if (!com.tencent.mm.sdk.platformtools.f9.DiscoveryScanPayReward.k(context3, new e04.v0(this))) {
                        rz3.e eVar8 = this.f246059w;
                        if (eVar8 != null) {
                            eVar8.a(5, null);
                        }
                        A(0);
                        return;
                    }
                    rz3.e eVar9 = this.f246059w;
                    if (eVar9 != null) {
                        eVar9.a(5, null);
                    }
                    int z38 = z(this.f246044e);
                    int i78 = i(z38);
                    com.tencent.mm.autogen.events.ScanMaterialCodeEvent scanMaterialCodeEvent = new com.tencent.mm.autogen.events.ScanMaterialCodeEvent();
                    am.us usVar = scanMaterialCodeEvent.f54731g;
                    usVar.f8130a = str22;
                    usVar.f8131b = z38;
                    usVar.f8132c = 1;
                    usVar.f8133d = new java.lang.ref.WeakReference(context3);
                    scanMaterialCodeEvent.f54731g.f8134e = new e04.w0(this, scanMaterialCodeEvent, context3, i78, str21, z38);
                    scanMaterialCodeEvent.e();
                    B(11);
                    A(11);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16472, 7, str22, str21);
                    return;
                }
                if (str22.startsWith("weixin://wxpay/bindurl")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "fast bind card qrcode");
                    rz3.e eVar10 = this.f246059w;
                    if (eVar10 != null) {
                        eVar10.a(5, null);
                    }
                    ((h45.q) i95.n0.c(h45.q.class)).startFastBindUseCase(str22, i(z(this.f246044e)), new e04.q(this));
                    A(0);
                    return;
                }
                if (str22.startsWith("weixin://rtos_authcode")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "rtos watch prefix");
                    rz3.e eVar11 = this.f246059w;
                    if (eVar11 != null) {
                        eVar11.a(5, null);
                    }
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    java.lang.String i79 = com.tencent.mm.vfs.w6.i(com.tencent.mm.modelavatar.d1.Ai().j(gm0.j1.b().k(), false), false);
                    android.net.Uri parse = android.net.Uri.parse(this.f246046g);
                    java.lang.String queryParameter = parse.getQueryParameter(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC);
                    java.lang.String queryParameter2 = parse.getQueryParameter("nat");
                    java.lang.String queryParameter3 = parse.getQueryParameter("js");
                    java.lang.String queryParameter4 = parse.getQueryParameter("type");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("avatar", i79);
                    intent2.putExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, queryParameter);
                    if (queryParameter2 != null) {
                        intent2.putExtra("native_ver", queryParameter2);
                    }
                    if (queryParameter3 != null) {
                        intent2.putExtra("jsapp_ver", queryParameter3);
                    }
                    if (queryParameter4 != null) {
                        intent2.putExtra("channel_type", queryParameter4);
                    }
                    j45.l.j(context3, "exdevice", "com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI", intent2, null);
                    D(false);
                    A(0);
                    return;
                }
                java.lang.String str23 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (z65.c.a() && str22.startsWith("nirvana://")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "hy: debug enter scan nirvana url, content: %s", str22);
                    e();
                    dp.a.makeText(context3, str22, 1).show();
                    ((g10.v) ((c00.i4) i95.n0.c(c00.i4.class))).Ri(str22);
                    D(false);
                    return;
                }
                if (z65.c.a() && str22.startsWith("weixin://template")) {
                    o(context3, str22);
                    return;
                }
                if (!str22.startsWith("wedropf2fhb://")) {
                    if (!str22.startsWith("wxhb://f2f")) {
                        com.tencent.mm.plugin.scanner.EventScanCodeTryPreloadWxaAttrsBeforeA8Key eventScanCodeTryPreloadWxaAttrsBeforeA8Key = new com.tencent.mm.plugin.scanner.EventScanCodeTryPreloadWxaAttrsBeforeA8Key();
                        eventScanCodeTryPreloadWxaAttrsBeforeA8Key.f158616g = str22;
                        eventScanCodeTryPreloadWxaAttrsBeforeA8Key.f158617h = i27;
                        eventScanCodeTryPreloadWxaAttrsBeforeA8Key.f158618i = i28;
                        eventScanCodeTryPreloadWxaAttrsBeforeA8Key.e();
                        if (l(str22, i19, this.f246044e)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "WPHK handle HK wallet CGP url");
                            return;
                        }
                        f(context, str22, i27, i28, i19, this.D, z17, a17);
                        rz3.e eVar12 = this.f246059w;
                        if (eVar12 != null) {
                            eVar12.a(5, null);
                            return;
                        }
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "scan f2f hb url");
                    if (i27 != 19) {
                        A(0);
                        return;
                    }
                    if (!com.tencent.mm.sdk.platformtools.f9.DiscoveryScanFace2Face.k(context3, new e04.u(this))) {
                        rz3.e eVar13 = this.f246059w;
                        if (eVar13 != null) {
                            eVar13.a(5, null);
                        }
                        A(0);
                        return;
                    }
                    rz3.e eVar14 = this.f246059w;
                    if (eVar14 != null) {
                        eVar14.a(5, null);
                    }
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("key_share_url", str22);
                    j45.l.n(context3, "luckymoney", ".f2f.ui.LuckyMoneyF2FReceiveUI", intent3, 1001);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16472, 4, str22, str21);
                    B(11);
                    A(11);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "scan f2f hongbao 2026, open liteapp");
                rz3.e eVar15 = this.f246059w;
                if (eVar15 != null) {
                    eVar15.a(5, null);
                }
                com.tencent.mm.plugin.scanner.model.h2.l("scan_red_packet_code_handler");
                if (i19 == 4) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "scan f2f hongbao 2026, from scan, open liteapp");
                    try {
                        kd0.r2 r2Var = (kd0.r2) i95.n0.c(kd0.r2.class);
                        str17 = "url=" + java.net.URLEncoder.encode(str22, com.tencent.mapsdk.internal.rv.f51270c) + "&scan_entrance=" + com.tencent.mm.plugin.scanner.model.h2.f158926g + "&face2face_status=" + (r2Var != null ? ((yz3.m) r2Var).wi() : 0);
                    } catch (java.io.UnsupportedEncodingException unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.QBarStringHandler", "encode query fail, content: %s", str22);
                        str17 = "";
                    }
                    android.os.Bundle bundle5 = new android.os.Bundle();
                    bundle5.putString("appId", "wxalite70ed975435b06b901f7fcb14ef1a3f57@pay");
                    bundle5.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, "pages/redirect-entry/index");
                    bundle5.putString("query", str17);
                    com.tencent.mm.plugin.lite.s sVar2 = new com.tencent.mm.plugin.lite.s();
                    sVar2.f144167d = new e04.r(this, context3);
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "startLiteApp, appId = %s, path = %s, query = %s", "wxalite70ed975435b06b901f7fcb14ef1a3f57@pay", "pages/redirect-entry/index", str17);
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(context3, bundle5, true, false, sVar2, new e04.s(this));
                    z19 = false;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "scan f2f hongbao 2026, not from scan, show error , getA8KeyScene = %s", java.lang.Integer.valueOf(i19));
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    u1Var.g(j().getString(com.tencent.mm.R.string.njg));
                    u1Var.n(j().getString(com.tencent.mm.R.string.f490454vi));
                    u1Var.l(new e04.t(this));
                    z19 = false;
                    u1Var.q(false);
                }
                D(z19);
                return;
            }
            context2 = context3;
            str4 = "MicroMsg.QBarStringHandler";
            str10 = str22;
            str5 = "payInitRawUrl";
            str6 = "pay_qrcode_sender_username";
            str7 = "stat_msg_id";
            str8 = str21;
            str9 = "payInitTimestamp";
        }
        rz3.e eVar16 = this.f246059w;
        java.lang.String str24 = str4;
        java.lang.String str25 = str9;
        if (eVar16 != null) {
            eVar16.a(5, null);
        }
        if (!com.tencent.mm.sdk.platformtools.f9.DiscoveryScanPayCode.k(context2, new e04.t0(this))) {
            A(0);
            return;
        }
        int i86 = i(z(this.f246044e));
        android.os.Bundle bundle6 = new android.os.Bundle();
        if (bundle != null) {
            java.lang.String string8 = bundle.getString("stat_chat_talker_username");
            java.lang.String string9 = bundle.getString("stat_send_msg_user");
            i38 = i86;
            jz5.l b28 = com.tencent.mm.plugin.wallet_core.utils.v0.b(this.E, string8, string9);
            bundle6.putInt("chat_type", ((java.lang.Integer) b28.f302833d).intValue());
            bundle6.putInt("send_type", ((java.lang.Integer) b28.f302834e).intValue());
            bundle6.putString("qrcode_sender_username", bundle.getString(str6));
            bundle6.putString("msg_svr_id", bundle.getString(str7));
            bundle6.putInt("qrcodeSessionType", bundle.getInt("pay_qrcode_session_type", 0));
            if (bundle.getInt("pay_qrcode_session_type", 0) == 2) {
                bundle6.putString("qrcodeSessionName", bundle.getString("pay_qrcode_session_name"));
            } else {
                gm0.j1.i();
                bundle6.putString("qrcodeSessionName", (java.lang.String) gm0.j1.u().c().l(2, null));
            }
            bundle6.putString("stat_send_msg_user", string9);
            java.lang.String string10 = bundle.getString(str5);
            str11 = str25;
            long j19 = bundle.getLong(str11, 0L);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string10)) {
                str13 = str24;
                com.tencent.mars.xlog.Log.i(str13, "startF2FPay initRawUrl is empty, use qbarString as fallback");
                str14 = str10;
            } else {
                str13 = str24;
                str14 = string10;
            }
            if (j19 == 0) {
                j19 = c01.id.a() / 1000;
                com.tencent.mars.xlog.Log.i(str13, "startF2FPay initTimestamp is 0, use current timestamp as fallback");
            }
            if (str14 == null) {
                str14 = "";
            }
            bundle6.putString(str5, str14);
            bundle6.putLong(str11, j19);
            str12 = str10;
        } else {
            str11 = str25;
            i38 = i86;
            str12 = str10;
            str13 = str24;
            bundle6.putString(str5, str12);
            bundle6.putLong(str11, c01.id.a() / 1000);
        }
        com.tencent.mars.xlog.Log.i(str13, "startF2FPay initRawUrl: %s, initTimestamp: %d", bundle6.getString(str5, ""), java.lang.Long.valueOf(bundle6.getLong(str11, 0L)));
        ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
        h45.a0.j(context2, 1, str12, i38, null, bundle6);
        t(true, null);
        B(11);
        A(11);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16472, 1, str12, str8);
        if (scanIdentifyReportInfo == null || scanIdentifyReportInfo.f215248m) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new zs5.o0(scanIdentifyReportInfo, str12));
    }

    public void h(android.app.Activity activity, java.lang.String str, int i17, java.lang.String str2, int i18, int i19, rz3.e eVar, com.tencent.mm.plugin.scanner.view.s sVar, android.os.Bundle bundle, boolean z17, int i27, boolean z18) {
        g(activity, str, 0, i17, z(i17), str2, i18, i19, eVar, sVar, bundle, z17, i27, z18, null, null);
    }

    public android.content.Context j() {
        java.lang.ref.WeakReference weakReference = this.f246043d;
        if (weakReference != null) {
            return (android.content.Context) weakReference.get();
        }
        return null;
    }

    public boolean l(java.lang.String str, int i17, int i18) {
        boolean shouldHandleHKWalletCGPUrl = ((h45.q) i95.n0.c(h45.q.class)).shouldHandleHKWalletCGPUrl(str);
        if (shouldHandleHKWalletCGPUrl) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "WPHK start handle HK wallet CGP url");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1882, 115);
            ((h45.q) i95.n0.c(h45.q.class)).handleHKWalletScanCodeRoute(str, i18, new e04.v(this, i17));
            rz3.e eVar = this.f246059w;
            if (eVar != null) {
                eVar.a(5, null);
            }
        }
        return shouldHandleHKWalletCGPUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(r45.iw5 r21) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.p.m(r45.iw5):boolean");
    }

    public final boolean n(r45.cx5 cx5Var) {
        java.lang.String str = cx5Var.f371900d;
        e();
        java.lang.ref.WeakReference weakReference = this.f246043d;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            if (context != null) {
                dp.a.makeText(context, com.tencent.mm.R.string.iar, 0).show();
            }
            return false;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        int i17 = this.f246044e != 1 ? 30 : 45;
        android.content.Intent intent = new android.content.Intent();
        qk.p.b(intent, cx5Var, i17);
        if (n17 != null && !n17.r2()) {
            intent.putExtra("Contact_IsLBSFriend", true);
        }
        if (com.tencent.mm.storage.z3.m4(str)) {
            intent.putExtra("key_add_contact_desc_wording_id", cx5Var.f371913t);
            intent.putExtra("key_save_contact", true);
        }
        if (context != null) {
            ((com.tencent.mm.app.y7) com.tencent.mm.plugin.scanner.i1.a()).l(intent, context);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = 2;
            objArr[1] = java.lang.Integer.valueOf(this.A);
            objArr[2] = java.lang.Integer.valueOf(this.f246044e);
            objArr[3] = this.B;
            objArr[4] = this.f246046g;
            java.lang.String str2 = this.C;
            objArr[5] = str2 != null ? str2 : "";
            g0Var.d(14268, objArr);
        }
        return true;
    }

    public final void o(android.content.Context context, java.lang.String url) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "debug scan template url, content: %s", url);
        e();
        if (((su4.x0) i95.n0.c(su4.x0.class)) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.QBarStringHandler", "handleTemplateUrl: IPluginWebSearch not available");
            D(true);
            return;
        }
        D(false);
        uv4.z zVar = new uv4.z(context, new com.tencent.mm.plugin.websearch.w1$$a());
        android.os.Handler handler = uv4.c0.f431425a;
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateScanHandler", "handle: start, url=%s", url);
        android.net.Uri parse = android.net.Uri.parse(url);
        java.lang.String queryParameter = parse.getQueryParameter("type");
        java.lang.String queryParameter2 = parse.getQueryParameter("query");
        if (queryParameter2 != null) {
            try {
                queryParameter2 = java.net.URLDecoder.decode(queryParameter2, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchTemplateScanHandler", "handle: decode query failed: %s", e17.getMessage());
            }
        } else {
            queryParameter2 = null;
        }
        java.lang.String queryParameter3 = parse.getQueryParameter("url");
        if (!kotlin.jvm.internal.o.b("fts", queryParameter)) {
            java.lang.String errorMsg = "未识别模板类型: " + queryParameter;
            kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
            dp.a.makeText(zVar.f431467a, errorMsg, 1).show();
            return;
        }
        if (queryParameter3 == null || queryParameter3.length() == 0) {
            dp.a.makeText(zVar.f431467a, "模板 URL 为空", 1).show();
            return;
        }
        com.tencent.mm.plugin.websearch.l2.f181562a = queryParameter3;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateScanHandler", "handle: set sDebugRemoteUrl=%s", queryParameter3);
        uv4.c0.f431425a.post(new uv4.b0(zVar, queryParameter2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0854  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r44, int r45, java.lang.String r46, com.tencent.mm.modelbase.m1 r47) {
        /*
            Method dump skipped, instructions count: 4300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.p.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    public final boolean q(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "[isPayCode] check, qBarString：%s", str);
        return str.startsWith("weixin://wxpay/bizpayurl") || str.startsWith("https://wx.tenpay.com/f2f") || str.startsWith("wxp://f2f") || str.startsWith("https://payapp.wechatpay.cn/qr/") || str.startsWith("wxhb://f2f") || str.startsWith("wxp://wbf2f") || str.startsWith("m") || str.startsWith(f246042J) || str.startsWith("n") || str.startsWith(K) || str.startsWith("https://payapp.wechatpay.cn/sjt/qr/") || str.startsWith("weixin://wxpay/pcpayurl") || str.startsWith("wedropf2fhb://");
    }

    public final void r(android.app.Activity activity, java.lang.String str) {
        bi4.n1 n1Var = new bi4.n1(null);
        n1Var.f354964f = str;
        n1Var.f354965g = true;
        n1Var.f354966h = 11;
        int i17 = this.E;
        if (i17 <= 0) {
            i17 = z(this.f246044e);
        }
        n1Var.f354967i = i17;
        this.f246058v = db5.e1.R(activity, activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.i_b), true, true, new e04.f0(this, ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ui(activity, n1Var, new e04.e0(this, activity))));
    }

    public final void s(boolean z17) {
        t(z17, null);
    }

    public final void t(boolean z17, android.os.Bundle bundle) {
        if (this.f246059w != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean("key_scan_qr_code_result", z17);
            this.f246059w.a(3, bundle);
        }
    }

    public final void u(android.app.Activity activity, java.lang.String shortUrl) {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        kotlin.jvm.internal.o.g(shortUrl, "shortUrl");
        db2.s5 s5Var = new db2.s5(shortUrl);
        ((java.util.HashMap) this.f246061y).put(s5Var, 1);
        gm0.j1.d().g(s5Var);
        this.f246058v = db5.e1.R(activity, activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.i_b), true, true, new e04.b0(this, s5Var));
    }

    public final void v(android.app.Activity activity, java.lang.String qrUrl) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "openFinderProfileOrLive: qrcode_url=" + qrUrl);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        kotlin.jvm.internal.o.g(qrUrl, "qrUrl");
        zy2.rc rcVar = new zy2.rc(qrUrl);
        ((java.util.HashMap) this.f246061y).put(rcVar, 1);
        gm0.j1.d().g(rcVar);
        this.f246058v = db5.e1.R(activity, activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.i_b), true, true, new e04.z(this, rcVar));
    }

    public final void w(android.app.Activity activity, java.lang.String shortUrl) {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        kotlin.jvm.internal.o.g(shortUrl, "shortUrl");
        y92.c cVar = new y92.c(shortUrl);
        ((java.util.HashMap) this.f246061y).put(cVar, 1);
        gm0.j1.d().g(cVar);
        this.f246058v = db5.e1.R(activity, activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.i_b), true, true, new e04.c0(this, cVar));
    }

    public final boolean x(int i17, int i18, java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f246043d;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        if (i17 != 1) {
            if (i17 != 2) {
                return false;
            }
            if (context != null) {
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f490500wu), 1).show();
            }
            return true;
        }
        if (context != null) {
            if (gm0.j1.d().m()) {
                gm0.j1.d().l();
            } else if (com.tencent.mm.network.y2.a(context)) {
                com.tencent.mm.pluginsdk.ui.tools.l5.a(context);
            } else {
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.fcf, 1, java.lang.Integer.valueOf(i18)), 1).show();
            }
        }
        return true;
    }

    public final int z(int i17) {
        if (i17 == 1) {
            return 34;
        }
        if (i17 == 0) {
            return 4;
        }
        return i17 == 3 ? 42 : 30;
    }

    public p(java.lang.String str) {
        this();
        this.f246062z = str;
    }
}
