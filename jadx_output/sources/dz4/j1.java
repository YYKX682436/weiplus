package dz4;

/* loaded from: classes5.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ib f245313d;

    public j1(com.tencent.mm.pluginsdk.ui.chat.ib ibVar) {
        this.f245313d = ibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View findViewById = this.f245313d.findViewById(com.tencent.mm.R.id.f487617p71);
        if (findViewById != null) {
            findViewById.setFocusable(true);
            findViewById.setFocusableInTouchMode(true);
            findViewById.sendAccessibilityEvent(128);
        }
    }
}
