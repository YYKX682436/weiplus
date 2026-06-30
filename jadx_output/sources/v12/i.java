package v12;

@j95.b
/* loaded from: classes5.dex */
public final class i extends i95.w implements aq0.g, v12.e {

    /* renamed from: d, reason: collision with root package name */
    public v12.f f432507d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f432508e;

    /* renamed from: f, reason: collision with root package name */
    public aq0.i f432509f = aq0.i.f13025d;

    /* renamed from: g, reason: collision with root package name */
    public aq0.f f432510g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f432511h;

    /* renamed from: i, reason: collision with root package name */
    public int f432512i;

    public void Ai(aq0.h info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MagicSnsTimeline", "triggerFirework " + info);
        v12.f fVar = this.f432507d;
        if (fVar != null) {
            fVar.C0(new x12.b(info));
        }
    }

    public final void wi() {
        android.view.View view;
        android.widget.FrameLayout frameLayout = this.f432511h;
        if (frameLayout == null || (view = this.f432508e) == null || kotlin.jvm.internal.o.b(view.getParent(), frameLayout)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MagicSnsTimeline", "attach view " + view + " to holder " + frameLayout);
        android.view.ViewParent parent = view.getParent();
        android.widget.FrameLayout frameLayout2 = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
        if (frameLayout2 != null) {
            frameLayout2.removeView(view);
        }
        frameLayout.addView(view);
    }
}
