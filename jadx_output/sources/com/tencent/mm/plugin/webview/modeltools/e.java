package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class e implements android.app.PendingIntent.OnFinished {
    @Override // android.app.PendingIntent.OnFinished
    public void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooserHelper", "onSendFinished resultCode: %d, , resultData: %s", java.lang.Integer.valueOf(i17), str);
    }
}
