package jh;

/* loaded from: classes13.dex */
public class x extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jh.y f299761a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(jh.y yVar, android.os.Looper looper) {
        super(looper);
        this.f299761a = yVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.lang.Object obj = message.obj;
        if (obj instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            synchronized (this.f299761a.f299764c) {
                android.os.Bundle[] bundleArr = this.f299761a.f299764c;
                bundleArr[0] = bundle;
                bundleArr.notifyAll();
            }
        }
    }
}
