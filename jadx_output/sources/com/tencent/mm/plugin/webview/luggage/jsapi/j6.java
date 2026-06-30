package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class j6 implements com.tencent.mm.plugin.webview.luggage.jsapi.f6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask f182374a;

    public j6(com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask luggageUploadMediaFileManager$UploadMediaFileTask) {
        this.f182374a = luggageUploadMediaFileManager$UploadMediaFileTask;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.f6
    public void a(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadMediaTask", "success = %b, mediaId = %s, mediaUrl = %s", java.lang.Boolean.valueOf(z17), str, str2);
        com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask luggageUploadMediaFileManager$UploadMediaFileTask = this.f182374a;
        luggageUploadMediaFileManager$UploadMediaFileTask.f182247n = z17;
        luggageUploadMediaFileManager$UploadMediaFileTask.f182245i = str;
        luggageUploadMediaFileManager$UploadMediaFileTask.f182246m = str2;
        luggageUploadMediaFileManager$UploadMediaFileTask.c();
    }
}
