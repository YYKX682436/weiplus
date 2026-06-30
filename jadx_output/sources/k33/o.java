package k33;

/* loaded from: classes13.dex */
public class o extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f303872a;

    /* renamed from: b, reason: collision with root package name */
    public long f303873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.view.MultiGestureImageView f303874c;

    public o(com.tencent.mm.plugin.gallery.view.MultiGestureImageView multiGestureImageView, java.lang.ref.WeakReference weakReference) {
        this.f303874c = multiGestureImageView;
        this.f303872a = weakReference;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.gallery.view.MultiGestureImageView multiGestureImageView;
        removeMessages(message.what);
        java.lang.ref.WeakReference weakReference = this.f303872a;
        if (weakReference == null || (multiGestureImageView = (com.tencent.mm.plugin.gallery.view.MultiGestureImageView) weakReference.get()) == null) {
            return;
        }
        int i17 = message.what;
        com.tencent.mm.plugin.gallery.view.MultiGestureImageView multiGestureImageView2 = this.f303874c;
        if (i17 == 0) {
            multiGestureImageView2.f138653e = 0;
        } else if (i17 == 1) {
            multiGestureImageView2.getClass();
            multiGestureImageView.f138666u.removeMessages(1);
        } else {
            removeMessages(2);
            int i18 = com.tencent.mm.plugin.gallery.view.MultiGestureImageView.f138651z;
        }
    }
}
