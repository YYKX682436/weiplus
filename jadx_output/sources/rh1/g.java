package rh1;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh1.i f395631d;

    public g(rh1.i iVar) {
        this.f395631d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandMultiTaskLogic", "back release:" + this.f395631d.f395633d.f395634a);
        if (this.f395631d.f395633d.f395636c != null) {
            this.f395631d.f395633d.f395636c.getClass();
        }
        this.f395631d.f395633d.f395636c = null;
    }
}
