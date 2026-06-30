package e33;

/* loaded from: classes10.dex */
public class p2 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f247433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(e33.v2 v2Var, android.os.Looper looper) {
        super(looper);
        this.f247433a = v2Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        if (message.what == 1) {
            e33.u2 u2Var = (e33.u2) message.obj;
            android.os.Handler handler = this.f247433a.f247514y;
            handler.sendMessageDelayed(handler.obtainMessage(1, u2Var), 500L);
        }
    }
}
