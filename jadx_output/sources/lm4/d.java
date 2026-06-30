package lm4;

/* loaded from: classes14.dex */
public final class d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f319547d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f319548e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f319549f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f319550g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.customview.widget.l f319551h;

    /* renamed from: i, reason: collision with root package name */
    public float f319552i;

    /* renamed from: m, reason: collision with root package name */
    public int f319553m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319554n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f319555o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, android.view.ViewGroup mDecorView, yz5.a dragEnableBlock, yz5.p pVar) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mDecorView, "mDecorView");
        kotlin.jvm.internal.o.g(dragEnableBlock, "dragEnableBlock");
        this.f319547d = mDecorView;
        this.f319548e = dragEnableBlock;
        this.f319549f = pVar;
        this.f319551h = new androidx.customview.widget.l(getContext(), this, new lm4.b(this));
    }

    @Override // android.view.View
    public void computeScroll() {
        androidx.customview.widget.l lVar = this.f319551h;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("mViewDragHelper");
            throw null;
        }
        if (lVar.h(true)) {
            invalidate();
        }
    }

    public final yz5.a getOnDragToClose() {
        return this.f319555o;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!((java.lang.Boolean) this.f319548e.invoke()).booleanValue()) {
            return false;
        }
        androidx.customview.widget.l lVar = this.f319551h;
        if (lVar != null) {
            return lVar.t(event);
        }
        kotlin.jvm.internal.o.o("mViewDragHelper");
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        androidx.customview.widget.l lVar = this.f319551h;
        if (lVar != null) {
            lVar.m(event);
            return true;
        }
        kotlin.jvm.internal.o.o("mViewDragHelper");
        throw null;
    }

    public final void setOnDragToClose(yz5.a aVar) {
        this.f319555o = aVar;
    }
}
