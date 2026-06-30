package qe;

/* loaded from: classes7.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.z0 f362007d;

    public y0(qe.z0 z0Var) {
        this.f362007d = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.websocket.libwcwss.WcwssNative wcwssNative = this.f362007d.f362011e.f361935h;
        if (wcwssNative != null) {
            wcwssNative.doOnRunningState();
        }
    }
}
