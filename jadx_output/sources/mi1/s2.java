package mi1;

/* loaded from: classes7.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.n2 f326688d;

    public s2(mi1.n2 n2Var) {
        this.f326688d = n2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("mountliTest", "dismiss");
        mi1.n2 n2Var = this.f326688d;
        n2Var.f326642o.f326693d.remove(n2Var);
    }
}
