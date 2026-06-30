package hx4;

/* loaded from: classes8.dex */
public final class q implements android.app.PendingIntent.OnFinished {

    /* renamed from: a, reason: collision with root package name */
    public static final hx4.q f285690a = new hx4.q();

    @Override // android.app.PendingIntent.OnFinished
    public final void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseDialogHelper", "onSendFinished resultCode: %d, , resultData: %s", java.lang.Integer.valueOf(i17), str);
    }
}
