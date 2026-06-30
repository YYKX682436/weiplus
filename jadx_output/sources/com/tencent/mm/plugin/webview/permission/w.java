package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f183458a;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.protocal.JsapiPermissionWrapper f183460c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.GeneralControlWrapper f183461d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.permission.v f183462e;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f183459b = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.protocal.JsapiPermissionWrapper f183463f = new com.tencent.mm.protocal.JsapiPermissionWrapper(2);

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.protocal.GeneralControlWrapper f183464g = com.tencent.mm.protocal.GeneralControlWrapper.f192176f;

    public w(com.tencent.mm.plugin.webview.permission.v vVar) {
        this.f183462e = vVar == null ? new com.tencent.mm.plugin.webview.permission.t(this) : vVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermission", "edw <init> hardcodeJsPerm = " + this.f183460c + ", hardcodeGenCtrl = " + this.f183461d);
        this.f183458a = new java.util.HashMap();
    }

    public final java.lang.String a(java.lang.String str) {
        int indexOf = str.indexOf("#");
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public com.tencent.mm.protocal.GeneralControlWrapper b() {
        com.tencent.mm.plugin.webview.permission.u uVar;
        if (this.f183461d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermission", "getGenCtrl, return hardcodeGenCtrl = " + this.f183461d);
            return this.f183461d;
        }
        com.tencent.mm.plugin.webview.permission.v vVar = this.f183462e;
        if (vVar != null) {
            uVar = d(vVar.a());
            if (uVar == null) {
                uVar = d(vVar.b());
            }
        } else {
            uVar = null;
        }
        com.tencent.mm.protocal.GeneralControlWrapper generalControlWrapper = uVar != null ? uVar.f183457b : null;
        return generalControlWrapper == null ? this.f183464g : generalControlWrapper;
    }

    public com.tencent.mm.protocal.JsapiPermissionWrapper c() {
        java.lang.String str;
        com.tencent.mm.plugin.webview.permission.u uVar;
        if (this.f183460c != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermission", "getJsPerm, return hardcodeJsPerm = " + this.f183460c);
            return this.f183460c;
        }
        boolean z17 = true;
        com.tencent.mm.plugin.webview.permission.v vVar = this.f183462e;
        if (vVar != null) {
            uVar = d(vVar.a());
            str = vVar.b();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (uVar == null) {
                    uVar = d(str);
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (str == null) {
                    str = "";
                }
                objArr[0] = java.net.URLEncoder.encode(com.tencent.mm.pluginsdk.ui.tools.h9.a(str));
                str = java.lang.String.format("preverify://url=%s", objArr);
            }
        } else {
            str = null;
            uVar = null;
        }
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = uVar != null ? uVar.f183456a : null;
        if (str != null) {
            java.util.HashMap hashMap = (java.util.HashMap) this.f183459b;
            if (hashMap.containsKey(str)) {
                if (jsapiPermissionWrapper == null) {
                    jsapiPermissionWrapper = new com.tencent.mm.protocal.JsapiPermissionWrapper(new byte[0]);
                    z17 = false;
                } else {
                    jsapiPermissionWrapper = jsapiPermissionWrapper.clone();
                }
                java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(str);
                for (java.lang.String str2 : hashMap2.keySet()) {
                    ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
                    o45.m a17 = com.tencent.mm.plugin.webview.core.x3.f182012a.a(str2);
                    int i17 = a17 != null ? a17.f342978c : -1;
                    if (i17 > -1) {
                        int d17 = z17 ? jsapiPermissionWrapper.d(i17) : 2;
                        int i18 = ((r45.lx6) hashMap2.get(str2)).f379958e;
                        if (d17 == 0) {
                            jsapiPermissionWrapper.h(i17, (byte) 0);
                        } else if (d17 == 2) {
                            jsapiPermissionWrapper.h(i17, (byte) i18);
                        } else {
                            jsapiPermissionWrapper.h(i17, (byte) d17);
                        }
                    }
                }
            }
        }
        return jsapiPermissionWrapper == null ? this.f183463f : jsapiPermissionWrapper;
    }

    public final com.tencent.mm.plugin.webview.permission.u d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || this.f183458a == null) {
            return null;
        }
        java.lang.String a17 = a(str);
        if (this.f183458a.containsKey(a17)) {
            return (com.tencent.mm.plugin.webview.permission.u) this.f183458a.get(a17);
        }
        return null;
    }

    public boolean e(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewPermission", "has fail, url is null");
            return false;
        }
        java.lang.String a17 = a(str);
        java.util.Map map = this.f183458a;
        if (map == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewPermission", "has fail, permMap is null");
            return false;
        }
        com.tencent.mm.plugin.webview.permission.u uVar = (com.tencent.mm.plugin.webview.permission.u) ((java.util.HashMap) map).get(a17);
        return (uVar == null || uVar.f183456a == this.f183463f || uVar.f183457b == this.f183464g) ? false : true;
    }

    public boolean f(java.lang.String str) {
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewPermission", "hasJsPerm fail, url = " + str);
            return false;
        }
        java.lang.String a17 = a(str);
        java.util.Map map = this.f183458a;
        if (map == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewPermission", "hasJsPerm fail, permMap is null");
            return false;
        }
        com.tencent.mm.plugin.webview.permission.u uVar = (com.tencent.mm.plugin.webview.permission.u) ((java.util.HashMap) map).get(a17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("edw hasJsPerm, jsPerm = ");
        sb6.append(uVar == null ? null : uVar.f183456a);
        sb6.append(", url = ");
        sb6.append(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermission", sb6.toString());
        return (uVar == null || (jsapiPermissionWrapper = uVar.f183456a) == null || jsapiPermissionWrapper.equals(this.f183463f)) ? false : true;
    }

    public void g(java.lang.String str, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, com.tencent.mm.protocal.GeneralControlWrapper generalControlWrapper) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewPermission", "update fail, url is null");
            return;
        }
        boolean z17 = false;
        if (generalControlWrapper != null && (generalControlWrapper.f192177d & 524288) != 0) {
            z17 = true;
        }
        if (z17) {
            if (com.tencent.mm.plugin.webview.modeltools.i.f183286a == null) {
                com.tencent.mm.plugin.webview.modeltools.i.f183286a = new java.util.ArrayList();
            }
            if (!com.tencent.mm.plugin.webview.modeltools.i.f183286a.contains(str)) {
                com.tencent.mm.plugin.webview.modeltools.i.f183286a.add(str);
            }
        }
        java.lang.String a17 = a(str);
        if (jsapiPermissionWrapper == null) {
            jsapiPermissionWrapper = this.f183463f;
        }
        if (generalControlWrapper == null) {
            generalControlWrapper = this.f183464g;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermission", "edw update, jsPerm = " + jsapiPermissionWrapper + ", genCtrl = " + generalControlWrapper + ", url = " + a17);
        ((java.util.HashMap) this.f183458a).put(a17, new com.tencent.mm.plugin.webview.permission.u(jsapiPermissionWrapper, generalControlWrapper));
    }

    public void h(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, com.tencent.mm.protocal.GeneralControlWrapper generalControlWrapper) {
        int P;
        this.f183460c = jsapiPermissionWrapper;
        java.lang.String str = x51.o1.f452060m;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission is null");
        } else {
            try {
                P = com.tencent.mm.sdk.platformtools.t8.P(x51.o1.f452060m, 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewPermission", "setHardcodeJsPermission, parse jsapi fail, ex = " + e17.getMessage());
                this.f183460c = null;
            }
            if (P < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission wrong");
            } else {
                this.f183460c = new com.tencent.mm.protocal.JsapiPermissionWrapper(P);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, hardcodeJsPerm = " + this.f183460c);
            }
        }
        this.f183461d = generalControlWrapper;
        java.lang.String str2 = x51.o1.f452061n;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, Test.generalCtrl is null");
            return;
        }
        try {
            int P2 = com.tencent.mm.sdk.platformtools.t8.P(x51.o1.f452061n, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, permission = %d", java.lang.Integer.valueOf(P2));
            r45.y73 y73Var = new r45.y73();
            y73Var.f390838d = P2;
            this.f183461d = new com.tencent.mm.protocal.GeneralControlWrapper(y73Var);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl fail, ex = %s", e18.getMessage());
            this.f183461d = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, hardcodeGenCtrl = " + this.f183461d);
    }

    public void i(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("jsapi_preverify_commit_url");
        java.lang.String string2 = bundle.getString("jsapi_preverify_current_url");
        j(bundle, string);
        if (com.tencent.mm.sdk.platformtools.t8.D0(string, string2)) {
            return;
        }
        j(bundle, string2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(android.os.Bundle r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.WebViewPermission"
            java.lang.String r1 = "jsapi_preverify_fun_list"
            java.util.ArrayList r1 = r11.getStringArrayList(r1)
            java.lang.String r12 = com.tencent.mm.pluginsdk.ui.tools.h9.a(r12)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r12 != 0) goto L15
            java.lang.String r12 = ""
        L15:
            java.lang.String r12 = com.tencent.mm.pluginsdk.ui.tools.h9.a(r12)
            java.lang.String r12 = java.net.URLEncoder.encode(r12)
            r4 = 0
            r3[r4] = r12
            java.lang.String r12 = "preverify://url=%s"
            java.lang.String r12 = java.lang.String.format(r12, r3)
            java.util.Map r3 = r10.f183459b
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r5 = r3.containsKey(r12)
            if (r5 != 0) goto L38
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r3.put(r12, r5)
        L38:
            java.lang.Object r12 = r3.get(r12)
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La8
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r45.lx6 r5 = new r45.lx6     // Catch: java.lang.Exception -> L9f
            r5.<init>()     // Catch: java.lang.Exception -> L9f
            byte[] r6 = r11.getByteArray(r3)     // Catch: java.lang.Exception -> L9f
            r5.parseFrom(r6)     // Catch: java.lang.Exception -> L9f
            int r6 = r5.f379958e     // Catch: java.lang.Exception -> L9f
            r7 = 2
            if (r6 == 0) goto L64
            if (r6 != r7) goto L62
            goto L64
        L62:
            r8 = r4
            goto L65
        L64:
            r8 = r2
        L65:
            r9 = 3
            if (r8 == 0) goto L81
            java.lang.String r8 = "skip update control bytes by preverify, %s, %d, %d"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L9f
            r9[r4] = r3     // Catch: java.lang.Exception -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L9f
            r9[r2] = r3     // Catch: java.lang.Exception -> L9f
            int r3 = r5.f379959f     // Catch: java.lang.Exception -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L9f
            r9[r7] = r3     // Catch: java.lang.Exception -> L9f
            com.tencent.mars.xlog.Log.w(r0, r8, r9)     // Catch: java.lang.Exception -> L9f
            goto L42
        L81:
            r12.put(r3, r5)     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = "update control bytes by preverify, %s, %d, %d"
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L9f
            r8[r4] = r3     // Catch: java.lang.Exception -> L9f
            int r3 = r5.f379958e     // Catch: java.lang.Exception -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L9f
            r8[r2] = r3     // Catch: java.lang.Exception -> L9f
            int r3 = r5.f379959f     // Catch: java.lang.Exception -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L9f
            r8[r7] = r3     // Catch: java.lang.Exception -> L9f
            com.tencent.mars.xlog.Log.i(r0, r6, r8)     // Catch: java.lang.Exception -> L9f
            goto L42
        L9f:
            r3 = move-exception
            java.lang.String r5 = "parse preverify info"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r3, r5, r6)
            goto L42
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.permission.w.j(android.os.Bundle, java.lang.String):void");
    }
}
