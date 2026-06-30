package fe;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe.g f261346d;

    public a(fe.g gVar) {
        this.f261346d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fe.g gVar = this.f261346d;
        gVar.f261353a = gVar.f261361i.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.MBNiReporter", "hy: onFirstFrameRendered picnum:%d", java.lang.Integer.valueOf(gVar.f261353a));
    }
}
