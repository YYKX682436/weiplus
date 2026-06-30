package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public class u3 implements android.app.PendingIntent.OnFinished {
    public u3(com.tencent.mm.pluginsdk.model.t3 t3Var) {
    }

    @Override // android.app.PendingIntent.OnFinished
    public void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QQBrowserHelper", "onSendFinished resultCode: %d, , resultData: %s", java.lang.Integer.valueOf(i17), str);
    }
}
