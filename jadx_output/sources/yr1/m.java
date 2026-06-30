package yr1;

/* loaded from: classes14.dex */
public final class m extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f464650d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f464651e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f464652f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f464653g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.customview.widget.l f464654h;

    /* renamed from: i, reason: collision with root package name */
    public float f464655i;

    /* renamed from: m, reason: collision with root package name */
    public int f464656m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f464657n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f464658o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, android.view.ViewGroup mDecorView, yz5.a dragEnableBlock, yz5.p pVar) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mDecorView, "mDecorView");
        kotlin.jvm.internal.o.g(dragEnableBlock, "dragEnableBlock");
        this.f464650d = mDecorView;
        this.f464651e = dragEnableBlock;
        this.f464652f = pVar;
        this.f464654h = new androidx.customview.widget.l(getContext(), this, new yr1.l(this));
    }

    @Override // android.view.View
    public void computeScroll() {
        androidx.customview.widget.l lVar = this.f464654h;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("mViewDragHelper");
            throw null;
        }
        if (lVar.h(true)) {
            invalidate();
        }
    }

    public final yz5.a getOnDragToClose() {
        return this.f464658o;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!((java.lang.Boolean) this.f464651e.invoke()).booleanValue()) {
            return false;
        }
        androidx.customview.widget.l lVar = this.f464654h;
        if (lVar != null) {
            return lVar.t(event);
        }
        kotlin.jvm.internal.o.o("mViewDragHelper");
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        androidx.customview.widget.l lVar = this.f464654h;
        if (lVar != null) {
            lVar.m(event);
            return true;
        }
        kotlin.jvm.internal.o.o("mViewDragHelper");
        throw null;
    }

    public final void setOnDragToClose(yz5.a aVar) {
        this.f464658o = aVar;
    }
}
