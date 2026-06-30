package d33;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f226260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226261e;

    public n(android.view.View view, com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        this.f226260d = view;
        this.f226261e = imageCropUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f226260d.setPadding(0, 0, 0, com.tencent.mm.ui.bl.c(this.f226261e.getContext()));
    }
}
