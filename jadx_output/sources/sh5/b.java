package sh5;

/* loaded from: classes12.dex */
public final class b extends lf3.n implements gg3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // gg3.b
    public void a5(mf3.k mediaInfo, gg3.f listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        gg3.c a17 = mediaInfo.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.DiskVideoStateManager", "updateState failed, param null");
        } else if (com.tencent.mm.vfs.w6.j(a17.f271728c)) {
            gg3.f.x(listener, a17, gg3.d.f271733e, null, 4, null);
            com.tencent.mars.xlog.Log.i("MediaGallery.DiskVideoStateManager", "updateState: onLoad");
        } else {
            gg3.f.x(listener, a17, gg3.d.f271734f, null, 4, null);
            com.tencent.mars.xlog.Log.i("MediaGallery.DiskVideoStateManager", "updateState: onVideoLoadFailed");
        }
    }
}
