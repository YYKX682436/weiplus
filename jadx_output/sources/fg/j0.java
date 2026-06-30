package fg;

/* loaded from: classes7.dex */
public abstract class j0 {
    public static final java.lang.String a(fg.f fVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar, pl1.i iVar) {
        java.lang.String a17;
        java.lang.String b17;
        if (fVar == null || tVar == null || iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DelegateEditText", "getEncryptedData, this: " + fVar + ", env: " + tVar + ", inputParams: " + iVar);
            throw new java.lang.IllegalStateException("env error");
        }
        java.lang.String str = iVar.H;
        if (str == null) {
            throw new java.lang.IllegalStateException("need certPath");
        }
        java.lang.Long l17 = iVar.K;
        if (l17 == null) {
            throw new java.lang.IllegalStateException("need timeStamp");
        }
        long longValue = l17.longValue();
        java.lang.Long l18 = iVar.L;
        if (l18 == null) {
            throw new java.lang.IllegalStateException("need nonce");
        }
        long longValue2 = l18.longValue();
        java.lang.String str2 = iVar.f356615J;
        java.util.List safePasswordCompatList = iVar.M;
        kotlin.jvm.internal.o.f(safePasswordCompatList, "safePasswordCompatList");
        if (str2 == null && safePasswordCompatList.isEmpty()) {
            throw new java.lang.IllegalStateException("need salt or customHash");
        }
        java.lang.String a18 = com.tencent.mm.plugin.appbrand.widget.input.a6.a();
        if (a18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DelegateEditText", "getEncryptedData, rootPath is null");
            throw new java.lang.IllegalStateException("env error");
        }
        if (kotlin.jvm.internal.o.b(str, fVar.f261760y)) {
            a17 = fVar.f261761z;
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DelegateEditText", "readCertPem, cachedCertPem is null");
                throw new java.lang.IllegalStateException("certPath is illegal");
            }
        } else {
            try {
                a17 = com.tencent.mm.plugin.appbrand.widget.input.n4.f91556a.a(tVar, str);
                fVar.f261761z = a17;
                fVar.f261760y = str;
            } catch (com.tencent.mm.plugin.appbrand.widget.input.o4 e17) {
                throw new java.lang.IllegalStateException(e17.getMessage());
            }
        }
        wo.w0.g(true);
        if (!fVar.getSecureInputWidgetLogic$luggage_xweb_ext_release().setCertContext(a17, a18, wo.w0.g(true))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DelegateEditText", "getEncryptedData, setCertContext fail");
            throw new java.lang.IllegalStateException("sdk error:" + fVar.getSecureInputWidgetLogic$luggage_xweb_ext_release().getLastError());
        }
        if (safePasswordCompatList.isEmpty()) {
            com.tenpay.miniapp.MiniAppSecureEditText secureInputWidgetLogic$luggage_xweb_ext_release = fVar.getSecureInputWidgetLogic$luggage_xweb_ext_release();
            secureInputWidgetLogic$luggage_xweb_ext_release.setSalt(str2);
            secureInputWidgetLogic$luggage_xweb_ext_release.setTimeStamp(longValue);
            secureInputWidgetLogic$luggage_xweb_ext_release.setNonce(longValue2);
            b17 = secureInputWidgetLogic$luggage_xweb_ext_release.getEncryptedData();
        } else {
            b17 = com.tencent.mm.plugin.appbrand.widget.input.h6.f91482a.b(fVar.getSecureInputWidgetLogic$luggage_xweb_ext_release(), safePasswordCompatList, longValue, longValue2);
        }
        if (b17 != null) {
            return b17;
        }
        throw new java.lang.IllegalStateException("sdk error:" + fVar.getSecureInputWidgetLogic$luggage_xweb_ext_release().getLastError());
    }
}
