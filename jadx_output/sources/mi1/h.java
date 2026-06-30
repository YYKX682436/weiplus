package mi1;

/* loaded from: classes7.dex */
public final class h extends vj5.h {

    /* renamed from: w, reason: collision with root package name */
    public int f326563w;

    public h(android.content.Context context) {
        super(context);
        setClickable(false);
        this.f326563w = 0;
    }

    @Override // vj5.h, vj5.k
    public void n6(int i17) {
        q(i17);
        this.f326563w = i17;
    }

    @Override // android.view.View
    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        if (getChildCount() == 1) {
            getChildAt(0).cancelPendingInputEvents();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (view instanceof mi1.q0) {
            return;
        }
        iz5.a.h("Cant add non CapsuleBar instance here !");
        throw null;
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(h3.a.a(f17, 0.0f, 1.0f));
    }

    @Override // vj5.h
    public void v() {
        super.v();
        super.setWillNotDraw(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(-2, -2, 21);
    }
}
