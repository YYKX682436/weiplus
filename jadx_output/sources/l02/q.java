package l02;

@j95.b
/* loaded from: classes.dex */
public class q extends i95.w implements m02.s {
    public static java.lang.String Di(java.lang.String str) {
        org.json.JSONObject jSONObject = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                str = java.net.URLDecoder.decode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.io.UnsupportedEncodingException unused) {
            }
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception unused2) {
            }
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (jSONObject.optInt("OpInWidget") == 1) {
            jSONObject.remove("OpInWidget");
        }
        try {
            jSONObject.put("DownloadInWidget", 1);
        } catch (org.json.JSONException unused3) {
        }
        try {
            return java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.io.UnsupportedEncodingException unused4) {
            return str;
        }
    }

    public java.util.LinkedList Ai() {
        com.tencent.mm.plugin.downloader_app.model.s0.d();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(com.tencent.mm.plugin.downloader_app.model.s0.f97329a);
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return null;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo downloadWidgetTaskInfo = new com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo();
            downloadWidgetTaskInfo.f97227d = str;
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(str);
            if (q17 != null) {
                downloadWidgetTaskInfo.f97228e = q17.f96961d;
                int i17 = q17.f96963f;
                downloadWidgetTaskInfo.f97233m = i17;
                if (i17 == 1) {
                    downloadWidgetTaskInfo.f97229f = "downloading";
                } else if (i17 == 2) {
                    downloadWidgetTaskInfo.f97229f = "download_pause";
                } else if (i17 == 3) {
                    downloadWidgetTaskInfo.f97229f = "download_succ";
                } else if (i17 != 4) {
                    downloadWidgetTaskInfo.f97229f = "default";
                } else {
                    downloadWidgetTaskInfo.f97229f = "download_fail";
                }
                long j17 = q17.f96968n;
                if (j17 > 0) {
                    long j18 = q17.f96967m;
                    downloadWidgetTaskInfo.f97230g = (int) ((100 * j18) / j17);
                    downloadWidgetTaskInfo.f97232i = (((float) j18) * 100.0f) / ((float) j17);
                }
                if (q17.f96972r) {
                    downloadWidgetTaskInfo.f97231h = true;
                }
                linkedList2.add(downloadWidgetTaskInfo);
            }
        }
        return linkedList2;
    }

    public void Bi(android.content.Context context, android.os.Bundle bundle) {
        if (context == null || bundle == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.game_luggage, true)) {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("rawUrl"))) {
                return;
            }
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public boolean Ni() {
        java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.l0.D;
        com.tencent.mm.plugin.downloader_app.model.j0.f97286a.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.M("download_app").getBoolean("show_red_dot", false);
        if (z17) {
            if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.o4.M("download_app").getLong("red_dot_create_time", 0L) > 86400) {
                com.tencent.mm.sdk.platformtools.o4.M("download_app").putBoolean("show_red_dot", false);
                com.tencent.mm.sdk.platformtools.o4.M("download_app").putLong("red_dot_create_time", 0L);
                return false;
            }
        }
        return z17;
    }

    public void Ri(android.content.Context context, android.content.Intent intent, m02.c cVar) {
        if (context == null) {
            if (cVar != null) {
                cVar.a();
                return;
            }
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.getExtras();
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        intent.setClass(context, com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/DownloaderAppDelegateImpl", "startDownloadManager", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader_app/api/DownloadAppCallback$StartDownloadManagerCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/downloader_app/DownloaderAppDelegateImpl", "startDownloadManager", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader_app/api/DownloadAppCallback$StartDownloadManagerCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (cVar != null) {
            cVar.a();
        }
    }

    public long wi(com.tencent.mm.plugin.downloader_app.model.a aVar, m02.b bVar) {
        aVar.f97243j = Di(aVar.f97243j);
        return com.tencent.mm.plugin.downloader_app.model.o.c(aVar, bVar);
    }
}
