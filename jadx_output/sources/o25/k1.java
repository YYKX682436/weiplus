package o25;

/* loaded from: classes5.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f342549d;

    public k1(java.lang.ref.WeakReference weakReference) {
        this.f342549d = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) this.f342549d.get();
        if (mMActivity == null || mMActivity.isFinishing() || mMActivity.isDestroyed()) {
            return;
        }
        mMActivity.getWindow().getDecorView().setSystemUiVisibility(mMActivity.getWindow().getDecorView().getSystemUiVisibility() | 256);
        int c17 = fp.a.c(mMActivity);
        com.tencent.mars.xlog.Log.i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to bodyView, height: %d, %d", java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(i65.a.b(mMActivity, 2)));
        mMActivity.getBodyView().setPadding(0, c17 - i65.a.b(mMActivity, 2), 0, 0);
    }
}
