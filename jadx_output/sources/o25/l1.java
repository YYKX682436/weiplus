package o25;

/* loaded from: classes5.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f342554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f342555e;

    public l1(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, android.view.View view) {
        this.f342554d = mMFragmentActivity;
        this.f342555e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f342554d;
        mMFragmentActivity.getWindow().getDecorView().setSystemUiVisibility(mMFragmentActivity.getWindow().getDecorView().getSystemUiVisibility() | 256);
        int c17 = fp.a.c(mMFragmentActivity);
        com.tencent.mars.xlog.Log.i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to contentView, height: %s", java.lang.Integer.valueOf(c17));
        android.view.View view = this.f342555e;
        if (view != null) {
            view.setPadding(0, c17, 0, 0);
        }
    }
}
