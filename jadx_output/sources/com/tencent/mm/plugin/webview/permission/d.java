package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public class d {
    public static final com.tencent.mm.ipcinvoker.wx_extension.w K = new com.tencent.mm.plugin.webview.permission.f();
    public static boolean L = false;
    public static java.lang.Integer M = null;
    public final r45.j83 D;
    public final r45.v83 E;
    public int F;
    public int G;
    public java.lang.String H;
    public final java.util.HashMap I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f183380J;

    /* renamed from: j, reason: collision with root package name */
    public int f183390j;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.permission.k f183401u;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f183381a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f183382b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public int f183383c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f183384d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f183385e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f183386f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f183387g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f183388h = "";

    /* renamed from: i, reason: collision with root package name */
    public byte[] f183389i = new byte[0];

    /* renamed from: k, reason: collision with root package name */
    public int f183391k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f183392l = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f183393m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f183394n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f183395o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f183396p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f183397q = null;

    /* renamed from: r, reason: collision with root package name */
    public r45.s83 f183398r = null;

    /* renamed from: s, reason: collision with root package name */
    public r45.r83 f183399s = null;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f183400t = null;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f183402v = "";

    /* renamed from: w, reason: collision with root package name */
    public int f183403w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f183404x = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f183405y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f183406z = "";
    public java.lang.String A = "";
    public r45.u83 B = null;
    public r45.w83 C = null;

    public d(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper) {
        r45.j83 j83Var = new r45.j83();
        this.D = j83Var;
        this.E = new r45.v83();
        this.I = new java.util.HashMap();
        this.f183380J = false;
        this.f183390j = o45.cg.a();
        this.f183401u = new com.tencent.mm.plugin.webview.permission.k(jsapiPermissionWrapper, null);
        j83Var.f377638d |= 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(final com.tencent.mm.plugin.webview.permission.d r18, java.lang.String r19, int r20, int r21, int r22, java.lang.String r23, r45.s83 r24, com.tencent.mm.plugin.webview.permission.a r25) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.permission.d.a(com.tencent.mm.plugin.webview.permission.d, java.lang.String, int, int, int, java.lang.String, r45.s83, com.tencent.mm.plugin.webview.permission.a):void");
    }

    public static java.util.Map g(java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (list == null) {
            return hashMap;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.rx3 rx3Var = (r45.rx3) it.next();
            hashMap.put(rx3Var.f385272d, rx3Var.f385273e);
        }
        return hashMap;
    }

    public int b() {
        return this.G;
    }

    public final synchronized com.tencent.mm.modelbase.o c(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.o b17;
        android.net.NetworkInfo activeNetworkInfo;
        java.lang.String string;
        long j17;
        ((v60.u) ((w60.i) i95.n0.c(w60.i.class))).getClass();
        b17 = com.tencent.mm.modelsimple.j0.b(str, i17);
        r45.r83 r83Var = (r45.r83) b17.f70710a.f70684a;
        r83Var.f384610d = 2;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        r83Var.f384615i = du5Var;
        r83Var.f384618o = this.f183383c;
        r83Var.f384619p = this.f183386f;
        r83Var.G = this.f183402v;
        r83Var.H = this.A;
        r83Var.f384622s = i17;
        r83Var.f384624u = this.f183385e;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        java.lang.String str2 = "no";
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (activeNetworkInfo.getType() == 1) {
                str2 = "WIFI";
            } else if (activeNetworkInfo.getExtraInfo() != null) {
                str2 = activeNetworkInfo.getExtraInfo().toLowerCase();
            }
        }
        r83Var.f384625v = str2;
        r83Var.f384628y = this.f183390j;
        r83Var.f384629z = this.f183388h;
        r83Var.A = this.f183395o;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = this.f183387g;
        du5Var2.f372757e = true;
        r83Var.f384612f = du5Var2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(this.f183389i);
        r83Var.B = cu5Var;
        r83Var.f384609J = this.C;
        r83Var.K = this.F;
        r83Var.L = this.G;
        r83Var.N = this.f183384d;
        if (5 == i17) {
            r83Var.C = this.f183400t;
        } else {
            this.f183400t = null;
        }
        r45.j83 j83Var = this.D;
        if (j83Var != null) {
            int i18 = this.f183391k;
            if (i18 == 0) {
                i18 = this.f183390j;
            }
            j83Var.f377640f = i18;
            j83Var.f377641g = this.f183403w;
            j83Var.f377643i = this.f183404x;
            j83Var.f377644m = this.f183405y;
            java.lang.String str3 = this.f183406z;
            if (str3 == null) {
                str3 = "";
            }
            j83Var.f377642h = str3;
            if (this.f183383c == 104) {
                j83Var.f377647p = this.f183387g;
            }
            if (((ct.s2) i95.n0.c(ct.s2.class)) != null) {
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    string = com.tencent.mm.ui.chatting.component.g3.f199076e;
                } else {
                    com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("normsg_last_resume_userinfo");
                    kotlin.jvm.internal.o.f(M2, "getMMKV(...)");
                    string = M2.getString("last_resume_user_string", "");
                    if (string == null) {
                        string = "";
                    }
                }
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    j17 = com.tencent.mm.ui.chatting.component.g3.f199077f;
                } else {
                    com.tencent.mm.sdk.platformtools.o4 M3 = com.tencent.mm.sdk.platformtools.o4.M("normsg_last_resume_userinfo");
                    kotlin.jvm.internal.o.f(M3, "getMMKV(...)");
                    j17 = M3.getLong("last_resume_user_ts_long", 0L);
                }
                this.D.f377645n = string;
                if (!android.text.TextUtils.isEmpty(string)) {
                    if (com.tencent.mm.sdk.platformtools.x2.n()) {
                        this.D.f377646o = (c01.id.c() / 1000) - j17;
                    } else {
                        this.D.f377646o = (c01.id.b() / 1000) - j17;
                    }
                }
            }
            try {
                r83Var.M = x51.j1.a(this.D.toByteArray());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuggageGetA8Key", e17, "GetA8KeyClientParam byteArrayToSKBuffer", new java.lang.Object[0]);
            }
        }
        r45.u83 u83Var = this.B;
        if (u83Var != null) {
            try {
                r83Var.P = x51.j1.a(u83Var.toByteArray());
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuggageGetA8Key", e18, "mGetA8KeySceneNote byteArrayToSKBuffer", new java.lang.Object[0]);
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[0] = str;
        objArr[1] = this.f183386f;
        objArr[2] = java.lang.Integer.valueOf(this.f183383c);
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(this.f183385e);
        objArr[5] = r83Var.f384625v;
        objArr[6] = java.lang.Integer.valueOf(this.f183390j);
        int i19 = this.f183391k;
        if (i19 == 0) {
            i19 = this.f183390j;
        }
        objArr[7] = java.lang.Integer.valueOf(i19);
        objArr[8] = this.f183387g;
        objArr[9] = this.f183388h;
        objArr[10] = java.lang.Integer.valueOf(this.f183395o);
        objArr[11] = com.tencent.mm.sdk.platformtools.t8.l(this.f183389i);
        objArr[12] = this.f183402v;
        objArr[13] = this.A;
        objArr[14] = java.lang.Integer.valueOf(this.F);
        objArr[15] = java.lang.Integer.valueOf(this.G);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key", "ipcGetA8Key reqUrl = %s, username = %s, scene = %d, reason = %d, flag = %d, netType = %s, requestId = %d, initReqId = %d appId = %s, functionId = %s, wallentRegion = %d, a8KeyCookie = %s,MsgUserName = %s, MsgID = %s, ContentType = %s, AppMsgInnerType = %s", objArr);
        return b17;
    }

    public int d() {
        r45.v83 v83Var = this.E;
        if (v83Var != null) {
            return v83Var.f387984d;
        }
        return 0;
    }

    public com.tencent.mm.protocal.GeneralControlWrapper e(java.lang.String str) {
        com.tencent.mm.plugin.webview.permission.k kVar = this.f183401u;
        if (kVar.f183424c != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyPermission", "getGenCtrl, return hardcodeGenCtrl = " + kVar.f183424c);
            return kVar.f183424c;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.protocal.GeneralControlWrapper generalControlWrapper = kVar.f183426e;
        if (K0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyPermission", "getGenCtrl fail, url = " + str);
        } else {
            java.lang.String a17 = kVar.a(str);
            com.tencent.mm.plugin.webview.permission.j jVar = (com.tencent.mm.plugin.webview.permission.j) ((java.util.HashMap) kVar.f183422a).get(a17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("edw getGenCtrl, genCtrl = ");
            sb6.append(jVar == null ? null : jVar.f183421b);
            sb6.append(", url = ");
            sb6.append(a17);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyPermission", sb6.toString());
            if (jVar != null) {
                return jVar.f183421b;
            }
        }
        return generalControlWrapper;
    }

    public r45.x83 f(java.lang.String str) {
        r45.x83 x83Var = new r45.x83();
        x83Var.f389857d = str;
        x83Var.f389858e = this.f183383c;
        x83Var.f389859f = this.f183390j;
        x83Var.f389860g = this.F;
        x83Var.f389861h = this.G;
        x83Var.f389862i = this.A;
        x83Var.f389863m = this.f183402v;
        x83Var.f389864n = this.f183386f;
        return x83Var;
    }

    public com.tencent.mm.protocal.JsapiPermissionWrapper h(java.lang.String str) {
        com.tencent.mm.plugin.webview.permission.k kVar = this.f183401u;
        if (kVar.f183423b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyPermission", "getJsPerm, return hardcodeJsPerm = " + kVar.f183423b);
            return kVar.f183423b;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = kVar.f183425d;
        if (K0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyPermission", "getJsPerm fail, url = " + str);
        } else {
            java.lang.String a17 = kVar.a(str);
            java.util.Map map = kVar.f183422a;
            if (map == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyPermission", "getJsPerm fail, permMap is null");
            } else {
                com.tencent.mm.plugin.webview.permission.j jVar = (com.tencent.mm.plugin.webview.permission.j) ((java.util.HashMap) map).get(a17);
                if (jVar != null) {
                    return jVar.f183420a;
                }
            }
        }
        return jsapiPermissionWrapper;
    }

    public java.lang.String i() {
        return this.A;
    }

    public int j() {
        return this.F;
    }

    public java.lang.String k() {
        return this.f183402v;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r8 = "MicroMsg.LuggageGetA8Key"
            java.lang.String r9 = "getReason fail, url is null"
            com.tencent.mars.xlog.Log.e(r8, r9)
            return r1
        Lf:
            boolean r0 = r7.f183392l
            if (r0 == 0) goto L14
            return r1
        L14:
            r0 = 35
            int r0 = r8.indexOf(r0)
            if (r0 < 0) goto L27
            java.lang.String r2 = "wechat_redirect"
            int r2 = r8.indexOf(r2, r0)
            if (r2 <= r0) goto L27
            r8 = 2
            return r8
        L27:
            r0 = 1
            if (r9 != 0) goto L6a
            java.util.LinkedList r9 = com.tencent.mm.plugin.webview.permission.c.f183378a
            java.util.LinkedList r9 = com.tencent.mm.plugin.webview.permission.c.f183378a
            boolean r2 = r9.contains(r8)
            if (r2 == 0) goto L36
        L34:
            r1 = r0
            goto L65
        L36:
            jz5.g r2 = com.tencent.mm.plugin.webview.permission.c.f183379b
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L44:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r4 = new java.lang.Object[]{r3}
            java.lang.String r5 = "MicroMsg.GetA8KeyReasonManager"
            java.lang.String r6 = "force geta8key path = %s"
            com.tencent.mars.xlog.Log.i(r5, r6, r4)
            boolean r3 = nf.e.c(r8, r3, r1)
            if (r3 == 0) goto L44
            r9.add(r8)
            goto L34
        L65:
            if (r1 == 0) goto L6a
            r8 = 8
            return r8
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.permission.d.l(java.lang.String, boolean):int");
    }

    public final int m() {
        if (M == null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_webview_geta8key_prevent_dead_loop, -1));
            M = valueOf;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key", "getRedirectUrlLimit :%d", valueOf);
        }
        return M.intValue();
    }

    public int n() {
        return this.f183383c;
    }

    public int o() {
        return this.f183390j;
    }

    public java.lang.String p(java.lang.String str) {
        java.lang.String substring;
        synchronized (this.I) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key", "getShareUrl, fullUrl = %s", str);
            for (java.lang.String str2 : this.I.keySet()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key", "getShareUrl, Key = %s, value = %s", str2, this.I.get(str2));
            }
            java.lang.String str3 = (java.lang.String) this.I.get(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    substring = "";
                } else {
                    int indexOf = str.indexOf("#");
                    substring = indexOf < 0 ? str : str.substring(0, indexOf);
                }
                java.lang.String str4 = (java.lang.String) this.I.get(substring);
                if (com.tencent.mm.sdk.platformtools.t8.D0(str4, substring)) {
                    return str;
                }
                str3 = str4;
            }
            if (str3 != null) {
                str = str3;
            }
            return str;
        }
    }

    public java.lang.String q() {
        return this.f183386f;
    }

    public synchronized void r(java.lang.String str, int i17, com.tencent.mm.ipcinvoker.wx_extension.v vVar) {
        com.tencent.mm.modelbase.o c17 = c(str, i17);
        com.tencent.mm.ipcinvoker.wx_extension.x xVar = (com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class);
        com.tencent.mm.ipcinvoker.wx_extension.w wVar = K;
        ((h80.i) xVar).getClass();
        com.tencent.mm.ipcinvoker.wx_extension.h0.b(c17, wVar, vVar, null);
    }

    public final void s(java.lang.String str, int i17, boolean z17, r45.s83 s83Var, com.tencent.mm.plugin.webview.permission.a aVar) {
        int i18 = s83Var.f385547f;
        java.lang.String str2 = s83Var.f385549h;
        if (i18 == 1) {
            if (str2 == null || str2.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8Key", "getA8key-text fail, invalid content");
                return;
            } else {
                aVar.a(i17, str, str2);
                return;
            }
        }
        if (i18 == 2 || i18 == 6 || i18 == 7 || i18 == 30 || i18 == 44) {
            aVar.h(i17, z17, str, s83Var.f385545d, s83Var);
        }
    }

    public synchronized com.tencent.mm.plugin.webview.permission.i t(java.lang.String str, boolean z17, int i17, com.tencent.mm.plugin.webview.permission.a aVar) {
        com.tencent.mm.plugin.webview.permission.i iVar;
        r45.s83 s83Var;
        if (!z17) {
            if (this.f183381a.contains(str)) {
                return com.tencent.mm.plugin.webview.permission.i.WILL_GET;
            }
        }
        if (!z17 && this.f183401u.b(str)) {
            return com.tencent.mm.plugin.webview.permission.i.NO_NEED;
        }
        if (i17 == 5 && this.f183394n) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuggageGetA8Key", "disable iframe request");
            return com.tencent.mm.plugin.webview.permission.i.NO_NEED;
        }
        if (!z17 && this.f183381a.contains(str)) {
            return com.tencent.mm.plugin.webview.permission.i.WILL_GET;
        }
        this.f183381a.add(str);
        if (aVar != null) {
            aVar.d(i17, str);
        }
        if (i17 == -1) {
            i17 = l(str, false);
        }
        boolean z18 = this.f183392l;
        this.f183392l = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key", "WebView-Trace startGetA8Key, url: %s, force=%b", str, java.lang.Boolean.valueOf(z17));
        if (z18 && (s83Var = this.f183398r) != null && str.equals(s83Var.f385545d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key", "WebView-Trace Use Outer GetA8key Result");
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.webview.permission.e(this, i17, aVar));
            return com.tencent.mm.plugin.webview.permission.i.WILL_GET;
        }
        synchronized (this) {
            r(str, i17, new com.tencent.mm.plugin.webview.permission.g(this, str, i17, aVar));
            iVar = com.tencent.mm.plugin.webview.permission.i.WILL_GET;
        }
        return iVar;
    }
}
