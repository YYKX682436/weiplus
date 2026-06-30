package ww5;

/* loaded from: classes8.dex */
public final class d implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final long f450398d;

    /* renamed from: e, reason: collision with root package name */
    public final vw5.c f450399e;

    public d(long j17, vw5.c delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f450398d = j17;
        this.f450399e = delegate;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ((com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier) this.f450399e).a(this.f450398d, i17, i18, i19);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.Surface surface = holder.getSurface();
        kotlin.jvm.internal.o.f(surface, "getSurface(...)");
        ((com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier) this.f450399e).b(this.f450398d, surface);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ((com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier) this.f450399e).c(this.f450398d);
    }
}
