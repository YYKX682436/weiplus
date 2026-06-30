package ww5;

/* loaded from: classes8.dex */
public final class b extends android.view.TextureView {

    /* renamed from: d, reason: collision with root package name */
    public final long f450394d;

    /* renamed from: e, reason: collision with root package name */
    public final vw5.c f450395e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, vw5.c delegate, android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(context, "context");
        this.f450394d = j17;
        this.f450395e = delegate;
        setSurfaceTextureListener(new ww5.e(j17, delegate));
        setOpaque(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return ((com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier) this.f450395e).d(this.f450394d, event);
    }
}
