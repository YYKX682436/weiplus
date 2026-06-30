package s02;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s02.f f401949d;

    public e(s02.f fVar) {
        this.f401949d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s02.f fVar = this.f401949d;
        fVar.f401953g.b();
        fVar.f401951e.dismiss();
        if (fVar.f401950d) {
            ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).getClass();
            java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.s0.f97329a;
            android.os.Bundle bundleExtra = ((android.app.Activity) fVar.f401952f).getIntent().getBundleExtra("download_params");
            if (bundleExtra != null) {
                ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(fVar.f401952f, new android.content.Intent().putExtras(bundleExtra), null);
            }
        }
    }
}
