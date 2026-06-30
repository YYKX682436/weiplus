package xx1;

/* loaded from: classes7.dex */
public class a implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f457958d;

    /* renamed from: e, reason: collision with root package name */
    public final int f457959e;

    public a(xx1.c cVar, android.os.Handler handler, int i17) {
        this.f457958d = handler;
        this.f457959e = i17;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        android.os.Handler handler = this.f457958d;
        if (this.f457959e != i17) {
            handler.handleMessage(message);
            return true;
        }
        try {
            handler.handleMessage(message);
            return true;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GetTextBeforeCursorFix", "catch IndexOutOfBoundsException");
            return true;
        }
    }
}
