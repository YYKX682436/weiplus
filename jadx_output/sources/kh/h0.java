package kh;

/* loaded from: classes12.dex */
public final class h0 implements android.view.Choreographer.VsyncCallback {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Choreographer.VsyncCallback f307822a;

    public h0(android.view.Choreographer.VsyncCallback callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f307822a = callback;
    }

    public boolean equals(java.lang.Object obj) {
        return kotlin.jvm.internal.o.b(this.f307822a, obj);
    }

    public int hashCode() {
        return this.f307822a.hashCode();
    }

    @Override // android.view.Choreographer.VsyncCallback
    public void onVsync(android.view.Choreographer.FrameData data) {
        kotlin.jvm.internal.o.g(data, "data");
        kh.b0.f307756f.h(this.f307822a.getClass().getName(), this.f307822a.hashCode(), new kh.g0(this, data));
    }
}
