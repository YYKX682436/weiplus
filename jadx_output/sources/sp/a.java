package sp;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp.b f410938d;

    public a(sp.b bVar) {
        this.f410938d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SafeDismissDialog", "run on hijack runnable");
            this.f410938d.f410939d.run();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SafeDismissDialog", "protect : " + e17.getMessage());
        }
    }
}
