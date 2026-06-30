package ff;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f261579a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.systemchannels.PlatformChannel f261580b;

    /* renamed from: c, reason: collision with root package name */
    public final ff.d f261581c;

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler f261582d;

    public e(android.app.Activity activity, io.flutter.embedding.engine.systemchannels.PlatformChannel platformChannel, ff.d dVar) {
        ff.a aVar = new ff.a(this);
        this.f261582d = aVar;
        this.f261579a = activity;
        this.f261580b = platformChannel;
        platformChannel.setPlatformMessageHandler(aVar);
        this.f261581c = dVar;
    }
}
