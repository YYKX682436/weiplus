package r51;

/* loaded from: classes15.dex */
public final class d extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.picker.base.view.WheelView f392624a;

    public d(com.tencent.mm.picker.base.view.WheelView wheelView) {
        this.f392624a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.picker.base.view.WheelView wheelView = this.f392624a;
        if (i17 == 1000) {
            wheelView.invalidate();
            return;
        }
        if (i17 == 2000) {
            wheelView.f(s51.b.FLING);
        } else {
            if (i17 != 3000) {
                return;
            }
            java.lang.Runnable runnable = wheelView.f72385m;
            wheelView.removeCallbacks(runnable);
            wheelView.postDelayed(runnable, 200L);
        }
    }
}
