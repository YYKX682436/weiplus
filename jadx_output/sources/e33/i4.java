package e33;

/* loaded from: classes10.dex */
public class i4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247287d;

    public i4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247287d = imagePreviewUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247287d;
        boolean z17 = !imagePreviewUI.f138573J;
        imagePreviewUI.f138573J = z17;
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.T6(imagePreviewUI, z17);
        imagePreviewUI.f138579e.l();
        return false;
    }
}
