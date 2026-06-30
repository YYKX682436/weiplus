package ww5;

/* loaded from: classes8.dex */
public final class a extends android.view.SurfaceView {

    /* renamed from: d, reason: collision with root package name */
    public final long f450392d;

    /* renamed from: e, reason: collision with root package name */
    public final vw5.c f450393e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, vw5.c delegate, android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(context, "context");
        this.f450392d = j17;
        this.f450393e = delegate;
        getHolder().addCallback(new ww5.d(j17, delegate));
    }

    public final long getCanvasId() {
        return this.f450392d;
    }

    public final vw5.c getDelegate() {
        return this.f450393e;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return ((com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier) this.f450393e).d(this.f450392d, event);
    }
}
