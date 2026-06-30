package tl1;

/* loaded from: classes15.dex */
public final class b extends tl1.v {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f420199w = 0;

    public b(android.content.Context context) {
        super(context);
        super.setId(com.tencent.mm.R.id.f483189z2);
        setBackgroundResource(com.tencent.mm.R.color.a9e);
        setOnClickListener(new tl1.a(this));
    }

    public void h() {
        d(true);
    }

    public void i() {
        if (this.f420229r) {
            clearAnimation();
            this.f420229r = false;
        }
        if (this.f420228q) {
            return;
        }
        if (this.f420218d == null) {
            setVisibility(8);
            return;
        }
        java.lang.Runnable runnable = this.f420231t;
        if (runnable != null) {
            ((tl1.s) runnable).run();
            this.f420231t = null;
        }
        this.f420218d.onShow(this);
        clearAnimation();
        setVisibility(0);
        this.f420228q = true;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477740a1);
        this.f420226o.startAnimation(loadAnimation);
        startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477738z));
        loadAnimation.setAnimationListener(new tl1.l(this));
    }

    @Override // tl1.v, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (!isShown()) {
            super.onMeasure(i17, i18);
            return;
        }
        int measuredHeight = (getParent() == null || !(getParent() instanceof android.view.ViewGroup)) ? 0 : ((android.view.ViewGroup) getParent()).getMeasuredHeight();
        if (measuredHeight > 0) {
            g(i17, android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            super.onMeasure(i17, i18);
        }
    }

    @Override // tl1.v
    public void setHeader(java.lang.String str) {
        super.setHeader(str);
    }

    @Override // android.view.View
    public void setId(int i17) {
    }
}
