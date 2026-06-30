package jx0;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f302390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f302392f;

    public q(android.view.View view, int i17, android.view.View view2) {
        this.f302390d = view;
        this.f302391e = i17;
        this.f302392f = view2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view2 = this.f302390d;
        view2.getHitRect(rect);
        int i39 = rect.top;
        int i47 = this.f302391e;
        rect.top = i39 - i47;
        rect.left -= i47;
        rect.bottom += i47;
        rect.right += i47;
        this.f302392f.setTouchDelegate(new android.view.TouchDelegate(rect, view2));
    }
}
