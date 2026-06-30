package hr3;

/* loaded from: classes11.dex */
public final class lc extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f283758d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f283759e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f283760f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f283761g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.customview.widget.l f283762h;

    /* renamed from: i, reason: collision with root package name */
    public float f283763i;

    /* renamed from: m, reason: collision with root package name */
    public int f283764m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f283765n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(android.app.Activity context, yz5.a dragEnableBlock) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dragEnableBlock, "dragEnableBlock");
        this.f283758d = dragEnableBlock;
        this.f283761g = context;
        this.f283762h = new androidx.customview.widget.l(getContext(), this, new hr3.kc(this));
    }

    @Override // android.view.View
    public void computeScroll() {
        androidx.customview.widget.l lVar = this.f283762h;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("mViewDragHelper");
            throw null;
        }
        if (lVar.h(true)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!((java.lang.Boolean) this.f283758d.invoke()).booleanValue()) {
            return false;
        }
        androidx.customview.widget.l lVar = this.f283762h;
        if (lVar != null) {
            return lVar.t(event);
        }
        kotlin.jvm.internal.o.o("mViewDragHelper");
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        androidx.customview.widget.l lVar = this.f283762h;
        if (lVar != null) {
            lVar.m(event);
            return true;
        }
        kotlin.jvm.internal.o.o("mViewDragHelper");
        throw null;
    }
}
