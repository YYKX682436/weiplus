package u91;

/* loaded from: classes7.dex */
public final class b extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f425817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f425817d = runtime;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(0);
    }

    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime getRuntime() {
        return this.f425817d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }
}
