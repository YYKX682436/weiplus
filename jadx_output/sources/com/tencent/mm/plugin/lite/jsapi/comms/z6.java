package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class z6 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f143844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.c7 f143845e;

    public z6(com.tencent.mm.plugin.lite.jsapi.comms.c7 c7Var, android.app.Activity activity) {
        this.f143845e = c7Var;
        this.f143844d = activity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.lite.jsapi.comms.e8 e8Var = (com.tencent.mm.plugin.lite.jsapi.comms.e8) obj;
        if (e8Var == null) {
            com.tencent.mars.xlog.Log.w("LiteAppJsApiSendFileMessage", "invoke, shareResult is null");
            e8Var = com.tencent.mm.plugin.lite.jsapi.comms.e8.f143570f;
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiSendFileMessage", "invoke, shareResult: " + e8Var);
        int ordinal = e8Var.ordinal();
        com.tencent.mm.plugin.lite.jsapi.comms.c7 c7Var = this.f143845e;
        if (ordinal == 0) {
            android.app.Activity activity = this.f143844d;
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, c7Var.f143527g);
            hashMap.put(dm.i4.COL_LOCALID, c7Var.f143528h);
            hashMap.put("err_msg", "sendFileMessage:ok");
            c7Var.f143443f.b(hashMap);
        } else if (ordinal == 1) {
            c7Var.f143443f.a("sendFileMessage fail, cancel");
        } else if (ordinal == 2) {
            c7Var.f143443f.a("sendFileMessage fail");
        }
        return jz5.f0.f302826a;
    }
}
