package hc2;

/* loaded from: classes.dex */
public final class g implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f280322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280324g;

    public g(android.view.View view, android.app.Activity activity, android.view.View view2, android.view.View view3) {
        this.f280321d = view;
        this.f280322e = activity;
        this.f280323f = view2;
        this.f280324g = view3;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f280321d.getViewTreeObserver().removeOnPreDrawListener(this);
        android.app.Activity activity = this.f280322e;
        float dimension = activity.getResources().getDimension(com.tencent.mm.R.dimen.f479623ay);
        int h17 = com.tencent.mm.ui.bl.h(activity);
        int b17 = a06.d.b(dimension + h17);
        android.view.View view = this.f280323f;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = b17;
            view.setLayoutParams(layoutParams);
            view.setPadding(0, h17, 0, 0);
        }
        android.view.View view2 = this.f280324g;
        if (view2 == null) {
            return true;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.height = b17;
        view2.setLayoutParams(layoutParams2);
        return true;
    }
}
