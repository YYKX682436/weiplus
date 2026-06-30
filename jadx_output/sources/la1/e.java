package la1;

/* loaded from: classes7.dex */
public final class e implements de.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.webrtc.IRenderer f317495a;

    public e(org.webrtc.IRenderer iRenderer) {
        this.f317495a = iRenderer;
    }

    @Override // de.a
    public void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, final yz5.l callback) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f317495a.requestCaptureOnce(new org.webrtc.IRenderer.OnCaptureListener(callback) { // from class: la1.f

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.l f317496a;

            {
                kotlin.jvm.internal.o.g(callback, "function");
                this.f317496a = callback;
            }

            @Override // org.webrtc.IRenderer.OnCaptureListener
            public final /* synthetic */ void onCapture(android.graphics.Bitmap bitmap) {
                this.f317496a.invoke(bitmap);
            }
        });
    }
}
