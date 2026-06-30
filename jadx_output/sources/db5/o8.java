package db5;

/* loaded from: classes15.dex */
public class o8 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f228461a;

    /* renamed from: b, reason: collision with root package name */
    public long f228462b;

    public o8(java.lang.ref.WeakReference weakReference) {
        this.f228461a = weakReference;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.ui.base.MMViewPager mMViewPager;
        removeMessages(message.what);
        java.lang.ref.WeakReference weakReference = this.f228461a;
        if (weakReference == null || (mMViewPager = (com.tencent.mm.ui.base.MMViewPager) weakReference.get()) == null || message.what != 1) {
            return;
        }
        db5.y7 y7Var = mMViewPager.E;
        if (y7Var == null || y7Var.f228583a) {
            mMViewPager.f197615m.removeMessages(1);
        } else {
            y7Var.a();
            sendEmptyMessageDelayed(message.what, this.f228462b);
        }
    }
}
