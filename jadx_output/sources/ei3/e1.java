package ei3;

/* loaded from: classes10.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public ei3.l f253039a = ei3.l.Stop;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f253040b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f253041c = new ei3.d1(this, android.os.Looper.getMainLooper());

    public void a(ei3.l lVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightMediaStatusHandler", "status change to %s", lVar.toString());
        this.f253039a = lVar;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f253041c;
        n3Var.sendMessage(n3Var.obtainMessage(257, lVar));
    }
}
