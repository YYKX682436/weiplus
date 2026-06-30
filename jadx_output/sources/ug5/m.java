package ug5;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f427631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f427632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f427633f;

    public m(ug5.v vVar, android.view.Window window, android.widget.FrameLayout frameLayout) {
        this.f427631d = vVar;
        this.f427632e = window;
        this.f427633f = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.SurfaceView surfaceView;
        if (this.f427631d.f427658a.f427587a == ug5.b.f427582e) {
            android.content.Context context = this.f427632e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.windowIsTranslucent, typedValue, true);
            if (!(typedValue.data != 0) || (surfaceView = (android.view.SurfaceView) this.f427633f.findViewById(com.tencent.mm.R.id.r8u)) == null) {
                return;
            }
            surfaceView.setVisibility(8);
        }
    }
}
