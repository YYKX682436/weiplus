package ya2;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f460577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f460577d = weakReference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) this.f460577d.get();
        if (mMActivity != null && !mMActivity.isFinishing() && !mMActivity.isDestroyed()) {
            mMActivity.finish();
        }
        return jz5.f0.f302826a;
    }
}
