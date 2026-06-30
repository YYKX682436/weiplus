package cr3;

/* loaded from: classes11.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.x f221966d;

    public w(cr3.x xVar) {
        this.f221966d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "doClearData");
        c01.w9.h(this.f221966d.f221967d, new cr3.v(this));
    }
}
