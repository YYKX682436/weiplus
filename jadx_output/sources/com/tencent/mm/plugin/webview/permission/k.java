package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.protocal.JsapiPermissionWrapper f183423b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.protocal.GeneralControlWrapper f183424c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f183422a = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protocal.JsapiPermissionWrapper f183425d = new com.tencent.mm.protocal.JsapiPermissionWrapper(2);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.protocal.GeneralControlWrapper f183426e = com.tencent.mm.protocal.GeneralControlWrapper.f192176f;

    public k(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, com.tencent.mm.protocal.GeneralControlWrapper generalControlWrapper) {
        int P;
        this.f183423b = jsapiPermissionWrapper;
        java.lang.String str = x51.o1.f452060m;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, Test.jsapiPermission is null");
        } else {
            try {
                P = com.tencent.mm.sdk.platformtools.t8.P(x51.o1.f452060m, 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, parse jsapi fail, ex = " + e17.getMessage());
                this.f183423b = null;
            }
            if (P < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, Test.jsapiPermission wrong");
            } else {
                this.f183423b = new com.tencent.mm.protocal.JsapiPermissionWrapper(P);
                com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, hardcodeJsPerm = " + this.f183423b);
            }
        }
        this.f183424c = generalControlWrapper;
        java.lang.String str2 = x51.o1.f452061n;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, Test.generalCtrl is null");
        } else {
            try {
                int P2 = com.tencent.mm.sdk.platformtools.t8.P(x51.o1.f452061n, 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, permission = %d", java.lang.Integer.valueOf(P2));
                r45.y73 y73Var = new r45.y73();
                y73Var.f390838d = P2;
                this.f183424c = new com.tencent.mm.protocal.GeneralControlWrapper(y73Var);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl fail, ex = %s", e18.getMessage());
                this.f183424c = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, hardcodeGenCtrl = " + this.f183424c);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyPermission", "hardcodeJsPerm = " + jsapiPermissionWrapper + ", hardcodeGenCtrl = " + generalControlWrapper);
    }

    public final java.lang.String a(java.lang.String str) {
        int indexOf = str.indexOf("#");
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public boolean b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyPermission", "has fail, url is null");
            return false;
        }
        com.tencent.mm.plugin.webview.permission.j jVar = (com.tencent.mm.plugin.webview.permission.j) ((java.util.HashMap) this.f183422a).get(a(str));
        return (jVar == null || jVar.f183420a == this.f183425d || jVar.f183421b == this.f183426e) ? false : true;
    }

    public void c(java.lang.String str, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, com.tencent.mm.protocal.GeneralControlWrapper generalControlWrapper) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyPermission", "update fail, url is null");
            return;
        }
        java.lang.String a17 = a(str);
        if (jsapiPermissionWrapper == null) {
            jsapiPermissionWrapper = this.f183425d;
        }
        if (generalControlWrapper == null) {
            generalControlWrapper = this.f183426e;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyPermission", "edw update, jsPerm = " + jsapiPermissionWrapper + ", genCtrl = " + generalControlWrapper + ", url = " + a17);
        ((java.util.HashMap) this.f183422a).put(a17, new com.tencent.mm.plugin.webview.permission.j(jsapiPermissionWrapper, generalControlWrapper));
    }
}
