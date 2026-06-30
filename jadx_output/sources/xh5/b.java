package xh5;

/* loaded from: classes3.dex */
public final class b extends lf3.n implements cg3.a {

    /* renamed from: d, reason: collision with root package name */
    public cg3.c f454645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // cg3.a
    public void H1(mf3.k info, com.tencent.mm.ui.widget.dialog.k0 k0Var, db5.g4 g4Var) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // cg3.a
    public cg3.c U3() {
        return this.f454645d;
    }

    @Override // cg3.a
    public void cancel() {
    }

    @Override // cg3.a
    public void n5(cg3.d scanResult, com.tencent.mm.plugin.scanner.ImageQBarDataBean selectInfo, boolean z17) {
        kotlin.jvm.internal.o.g(scanResult, "scanResult");
        kotlin.jvm.internal.o.g(selectInfo, "selectInfo");
    }

    @Override // cg3.a
    public void o4(java.lang.String imgPath) {
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "preScanOCR imgPath: ".concat(imgPath));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = activity instanceof com.tencent.mm.ui.chatting.gallery.ImageGalleryUI ? (com.tencent.mm.ui.chatting.gallery.ImageGalleryUI) activity : null;
        if (imageGalleryUI != null) {
            imageGalleryUI.x9(imgPath, true, true);
        }
    }

    @Override // cg3.a
    public void u0(mf3.k mediaInfo, android.graphics.Bitmap bitmap, cg3.h hVar) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
    }

    @Override // cg3.a
    public void u3(cg3.c cVar) {
        this.f454645d = cVar;
    }
}
