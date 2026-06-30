package ea3;

/* loaded from: classes10.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f250671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ea3.r f250672e;

    public q(ea3.r rVar, java.util.Map map) {
        this.f250672e = rVar;
        this.f250671d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.media.album.LiteAppAlbumView liteAppAlbumView = (com.tencent.mm.plugin.lite.media.album.LiteAppAlbumView) this.f250672e.f250673d.F;
        liteAppAlbumView.getClass();
        java.util.Map map = this.f250671d;
        if (map != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onAlbumChange" + map);
            io.flutter.plugin.common.MethodChannel methodChannel = liteAppAlbumView.f144121e;
            if (methodChannel != null) {
                methodChannel.invokeMethod("onAlbumChange", map);
            }
        }
    }
}
