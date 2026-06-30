package sb;

/* loaded from: classes13.dex */
public class d extends android.os.Handler {

    /* renamed from: b, reason: collision with root package name */
    public static sb.d f405393b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f405394c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f405395a = new java.util.HashMap();

    public static sb.d a() {
        synchronized (f405394c) {
            if (f405393b == null) {
                try {
                    if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread() && android.os.Looper.myLooper() == null) {
                        android.os.Looper.prepare();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.midas.comm.APLog.i("APHttpHandle", e17.toString());
                }
                f405393b = new sb.d();
            }
        }
        return f405393b;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        try {
            int i17 = message.what;
            sb.a aVar = (sb.a) message.obj;
            java.lang.String str = aVar.f405376a;
            java.util.HashMap hashMap = this.f405395a;
            sb.j jVar = (sb.j) hashMap.get(str);
            if (jVar != null) {
                hashMap.remove(str);
                if (i17 == 3) {
                    jVar.onFinish(aVar);
                } else if (i17 == 4) {
                    jVar.onError(aVar);
                } else if (i17 == 5) {
                    jVar.onStop(aVar);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
