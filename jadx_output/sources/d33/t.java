package d33;

/* loaded from: classes3.dex */
public final class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226272d;

    public t(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        this.f226272d = imageCropUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 9");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, (long) 9, 1L);
        this.f226272d.finish();
        return true;
    }
}
