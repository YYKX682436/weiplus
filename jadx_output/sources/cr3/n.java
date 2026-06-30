package cr3;

/* loaded from: classes11.dex */
public class n implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f221958a;

    public n(cr3.d0 d0Var) {
        this.f221958a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "OpenLiteApp fail");
        this.f221958a.h();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "OpenLiteApp success");
    }
}
