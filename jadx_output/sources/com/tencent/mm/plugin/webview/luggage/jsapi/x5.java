package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask f182516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.l6 f182517e;

    public x5(com.tencent.mm.plugin.webview.luggage.jsapi.l6 l6Var, com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask luggageUploadMediaFileManager$UploadMediaFileTask) {
        this.f182517e = l6Var;
        this.f182516d = luggageUploadMediaFileManager$UploadMediaFileTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask luggageUploadMediaFileManager$UploadMediaFileTask = this.f182516d;
        luggageUploadMediaFileManager$UploadMediaFileTask.x();
        com.tencent.mm.plugin.webview.luggage.jsapi.l6 l6Var = this.f182517e;
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = l6Var.f182387b.f182186t;
        if (y1Var != null) {
            com.tencent.mm.ui.widget.dialog.j0 j0Var = y1Var.f182705t;
            if (j0Var != null) {
                j0Var.dismiss();
                y1Var.f182705t = null;
            }
            l6Var.f182387b.f182186t.setCloseWindowConfirmInfo(null);
        }
        if (!luggageUploadMediaFileManager$UploadMediaFileTask.f182247n) {
            ((com.tencent.mm.plugin.webview.luggage.jsapi.n5) l6Var.f182391f).a(false, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = luggageUploadMediaFileManager$UploadMediaFileTask.f182245i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        hashMap.put("serverId", str);
        java.lang.String str2 = luggageUploadMediaFileManager$UploadMediaFileTask.f182246m;
        hashMap.put("mediaUrl", str2 != null ? str2 : "");
        ((com.tencent.mm.plugin.webview.luggage.jsapi.n5) l6Var.f182391f).a(true, hashMap);
    }
}
