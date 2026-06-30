package zi0;

/* loaded from: classes13.dex */
public final class d implements io.flutter.plugin.common.EventChannel.EventSink {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f473084a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f473085b = false;

    public final void a() {
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public void endOfStream() {
        zi0.b bVar = new zi0.b(null);
        if (!this.f473085b) {
            this.f473084a.add(bVar);
        }
        a();
        this.f473085b = true;
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public void error(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        zi0.c cVar = new zi0.c(str, str2, obj);
        if (!this.f473085b) {
            this.f473084a.add(cVar);
        }
        a();
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public void success(java.lang.Object obj) {
        if (!this.f473085b) {
            this.f473084a.add(obj);
        }
        a();
    }
}
