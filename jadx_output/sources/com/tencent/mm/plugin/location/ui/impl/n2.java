package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes8.dex */
public class n2 extends android.os.AsyncTask {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f144856c = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxu) + "/tencentMapTouch/app/download/wx_android_download_ico.png";

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f144857a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f144858b;

    public n2(android.content.Context context, android.view.View view) {
        this.f144857a = new java.lang.ref.WeakReference(context);
        this.f144858b = new java.lang.ref.WeakReference(view);
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        java.lang.String[] strArr = (java.lang.String[]) objArr;
        android.content.Context context = (android.content.Context) this.f144857a.get();
        if (context == null) {
            return "";
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.location.ui.impl.l2(this, context));
            com.tencent.mars.xlog.Log.e("MicroMsg.TrackMapUI", "fail, network not ready");
            return "";
        }
        if (!fp.i.b()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.location.ui.impl.m2(this, context));
            com.tencent.mars.xlog.Log.e("MicroMsg.TrackMapUI", "fail, sdcard not ready");
            return "";
        }
        if (strArr.length != 1) {
            return "";
        }
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = new java.net.URL(strArr[0]).openStream();
                byte[] bArr = new byte[1024];
                inputStream.read(bArr);
                java.lang.String str = new java.lang.String(bArr);
                try {
                    inputStream.close();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TrackMapUI", "download json, close input stream failure, msg: %s.", e17.getMessage());
                }
                return str;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TrackMapUI", "download failure, msg: %s.", e18.getMessage());
                if (inputStream == null) {
                    return "";
                }
                try {
                    inputStream.close();
                    return "";
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TrackMapUI", "download json, close input stream failure, msg: %s.", e19.getMessage());
                    return "";
                }
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TrackMapUI", "download json, close input stream failure, msg: %s.", e27.getMessage());
                }
            }
            throw th6;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        android.view.View view = (android.view.View) this.f144858b.get();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPostExecute", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPostExecute", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.content.Context context = (android.content.Context) this.f144857a.get();
        if (context == null) {
            return;
        }
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("apkInfos");
            if (optJSONArray == null) {
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.ju8), 0).show();
                return;
            }
            int length = optJSONArray.length();
            android.content.Intent intent = new android.content.Intent();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                if (optJSONObject != null && optJSONObject.optString("cid").equals("00008")) {
                    java.lang.String optString = optJSONObject.optString("apkPath");
                    java.lang.String optString2 = optJSONObject.optString("size");
                    long longValue = android.text.TextUtils.isDigitsOnly(optString2) ? java.lang.Long.valueOf(optString2).longValue() : 0L;
                    java.lang.String optString3 = optJSONObject.optString("md5");
                    if (longValue > 0 && !fp.i.c(longValue)) {
                        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.ju_), 0).show();
                        com.tencent.mars.xlog.Log.e("MicroMsg.TrackMapUI", "fail, not enough space, require size = " + longValue);
                        return;
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.TrackMapUI", "doAddDownloadTask fail, url is null");
                        return;
                    }
                    intent.putExtra("task_name", "TencentMap");
                    intent.putExtra("task_url", optString);
                    intent.putExtra("task_size", longValue);
                    intent.putExtra("file_md5", optString3);
                    intent.putExtra("thumb_url", f144856c);
                    intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "腾讯地图");
                    intent.addFlags(268435456);
                    j45.l.j(context, "webview", ".ui.tools.WebViewDownloadUI", intent, null);
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TrackMapUI", "deal json string failure, msg: %s.", e17.getMessage());
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.ju8), 0).show();
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        android.view.View view = (android.view.View) this.f144858b.get();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPreExecute", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$GetTencentMapDownloadInfoTask", "onPreExecute", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
