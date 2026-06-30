package zi0;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry.SurfaceTextureEntry f473086a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.plugin.common.EventChannel f473087b;

    public e(zi0.f fVar, android.content.Context context, io.flutter.plugin.common.EventChannel eventChannel, io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, java.lang.String str, io.flutter.plugin.common.MethodChannel.Result result, java.lang.Class cls) {
        new zi0.d();
        this.f473087b = eventChannel;
        this.f473086a = surfaceTextureEntry;
        try {
            android.support.v4.media.f.a(cls.newInstance());
            throw null;
        } catch (java.lang.IllegalAccessException e17) {
            e17.toString();
            throw new java.lang.RuntimeException("video class is empty.");
        } catch (java.lang.InstantiationException e18) {
            e18.toString();
            throw new java.lang.RuntimeException("video class is empty.");
        }
    }

    public void a() {
        this.f473086a.release();
        this.f473087b.setStreamHandler(null);
    }
}
