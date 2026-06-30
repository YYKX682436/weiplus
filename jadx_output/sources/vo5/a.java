package vo5;

/* loaded from: classes13.dex */
public final class a implements uo5.n {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f438706a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f438707b;

    public a(boolean z17, android.os.Handler codecHandler) {
        kotlin.jvm.internal.o.g(codecHandler, "codecHandler");
        this.f438706a = codecHandler;
        this.f438707b = z17 ? "video/hevc" : "video/avc";
    }

    @Override // uo5.n
    public uo5.a a(boolean z17) {
        java.lang.String str = this.f438707b;
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(str, 640, 480);
        kotlin.jvm.internal.o.f(createVideoFormat, "createVideoFormat(...)");
        return new uo5.a(false, str, createVideoFormat);
    }

    @Override // uo5.n
    public android.os.Handler b() {
        return this.f438706a;
    }

    @Override // uo5.n
    public int c() {
        return 0;
    }
}
