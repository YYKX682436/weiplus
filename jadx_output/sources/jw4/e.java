package jw4;

@j95.b
/* loaded from: classes.dex */
public class e extends i95.w implements zg0.l3 {
    public void Ai(int i17, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fts_key_json_data", str);
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
            if (z0Var != null) {
                z0Var.callback(128, bundle);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + e17.getMessage());
        }
    }

    public void Bi(int i17, boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("fts_key_interactivepopgesture_enabled", z17);
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
            if (z0Var != null) {
                z0Var.callback(161, bundle);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onGestrueOnPressBackControl exception" + e17.getMessage());
        }
    }

    public void Di(int i17, java.lang.String str, int i18) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fts_key_sns_id", str);
        bundle.putInt("fts_key_status", i18);
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
            if (z0Var != null) {
                z0Var.callback(125, bundle);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onMusicStatusChanged exception" + e17.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e A[Catch: RemoteException -> 0x0164, TRY_LEAVE, TryCatch #5 {RemoteException -> 0x0164, blocks: (B:80:0x015a, B:82:0x015e), top: B:79:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ni(int r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jw4.e.Ni(int, java.util.Map):void");
    }

    public void Ri(int i17, java.lang.String str, int i18, int i19, int i27) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fts_key_json_data", str);
        bundle.putInt("fts_key_is_cache_data", i18);
        bundle.putInt("fts_key_is_expired", i19);
        bundle.putInt("fts_key_is_preload", i27);
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
            if (z0Var != null) {
                z0Var.callback(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, bundle);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void Ui(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onSearchImageListReady ret %d data %s", java.lang.Integer.valueOf(i18), str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("fts_key_ret", i18);
        bundle.putString("fts_key_data", str);
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
            if (z0Var != null) {
                z0Var.callback(120, bundle);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onSearchImageListReady exception" + e17.getMessage());
        }
    }

    public void Vi(int i17, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fts_key_json_data", str);
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
            if (z0Var != null) {
                z0Var.callback(124, bundle);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + e17.getMessage());
        }
    }

    public void Zi(int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebViewMsgHandlerFeatureService", "onTeachSearchDataReady callback webviewId, %d", java.lang.Integer.valueOf(i17));
        qx4.d0 a17 = qx4.d0.f367392m.a(i17);
        qx4.f0 f0Var = qx4.g0.f367406a;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f0Var.a().get(java.lang.Integer.valueOf(i17));
        objArr[1] = weakReference != null ? (qx4.a) weakReference.get() : null;
        java.util.Collection values = f0Var.a().values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            if (((java.lang.ref.WeakReference) obj).get() != null) {
                arrayList.add(obj);
            }
        }
        objArr[2] = java.lang.Integer.valueOf(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NativeHandler", "yptest getNativeHandler %d %s, size:%d", objArr);
        java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) f0Var.a().get(java.lang.Integer.valueOf(i17));
        qx4.a aVar = weakReference2 != null ? (qx4.a) weakReference2.get() : null;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebViewMsgHandlerFeatureService", "onTeachSearchDataReady callback native, %d", java.lang.Integer.valueOf(i17));
            aVar.A5(i18, str, i19, str2);
            return;
        }
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebViewMsgHandlerFeatureService", "onTeachSearchDataReady callback websearchjsapi, %d", java.lang.Integer.valueOf(i17));
            pm0.v.X(new qx4.w(str, a17, i18, i19, str2));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebViewMsgHandlerFeatureService", "onTeachSearchDataReady callback jsbridge, %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a18 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a18.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("fts_key_teach_request_type", i18);
        bundle.putString("fts_key_json_data", str);
        bundle.putInt("fts_key_is_cache_data", i19);
        bundle.putString("requestId", str2);
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a18.f184998y;
            if (z0Var != null) {
                z0Var.callback(121, bundle);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onTeachSearchDataReady exception" + e17.getMessage());
        }
    }

    public void aj(int i17, int i18, int i19, float f17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("fts_key_data", i18);
        bundle.putInt("fts_key_cache", i19);
        bundle.putFloat("fts_key_custom_query", f17);
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
            if (z0Var != null) {
                z0Var.callback(155, bundle);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "showNavBarShadow exception" + e17.getMessage());
        }
    }

    public void wi(int i17, float f17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat("fts_key_custom_query", f17);
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
            if (z0Var != null) {
                z0Var.callback(156, bundle);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "hideNavBarShadow exception" + e17.getMessage());
        }
    }
}
