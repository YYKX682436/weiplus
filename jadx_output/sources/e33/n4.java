package e33;

/* loaded from: classes10.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247417d;

    public n4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, long j17) {
        this.f247417d = imagePreviewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.T6(this.f247417d, true);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
    }
}
