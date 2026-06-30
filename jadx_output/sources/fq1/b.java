package fq1;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f265499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f265500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f265501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f265502g;

    public b(android.view.View view, int i17, int i18, android.view.View view2) {
        this.f265499d = view;
        this.f265500e = i17;
        this.f265501f = i18;
        this.f265502g = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f265499d;
        view.getHitRect(rect);
        int b17 = i65.a.b(view.getContext(), this.f265500e);
        int b18 = i65.a.b(view.getContext(), this.f265501f);
        rect.left += b17;
        rect.top += b18;
        rect.right += b17;
        rect.bottom += b18;
        this.f265502g.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
