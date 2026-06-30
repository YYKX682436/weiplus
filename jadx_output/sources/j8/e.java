package j8;

/* loaded from: classes15.dex */
public class e implements j8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.EventChannel.EventSink f298095a;

    public e(j8.f fVar, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        this.f298095a = eventSink;
    }

    @Override // j8.a
    public void a(j8.h hVar) {
        this.f298095a.success(hVar.name());
    }
}
