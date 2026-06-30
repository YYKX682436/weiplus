package m93;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f325028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m93.i f325029f;

    public e(m93.i iVar, java.lang.String str, int i17) {
        this.f325029f = iVar;
        this.f325027d = str;
        this.f325028e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        m93.i iVar = this.f325029f;
        ((java.util.concurrent.ConcurrentHashMap) iVar.f325039e).remove(this.f325027d + "_" + java.lang.Integer.toString(this.f325028e));
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) iVar.f325039e).entrySet().iterator();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (it.hasNext()) {
            long j17 = currentTimeMillis - ((m93.f) ((java.util.Map.Entry) it.next()).getValue()).f325031b;
            if (j17 < 0 || j17 > 3600000) {
                it.remove();
            }
        }
    }
}
