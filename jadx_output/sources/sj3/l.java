package sj3;

/* loaded from: classes5.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f408617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408618f;

    public l(android.view.View view, int i17, android.view.View view2) {
        this.f408616d = view;
        this.f408617e = i17;
        this.f408618f = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f408616d;
        view.getHitRect(rect);
        int i17 = rect.top;
        int i18 = this.f408617e;
        rect.top = i17 - i18;
        rect.bottom += i18;
        rect.left -= i18;
        rect.right += i18;
        this.f408618f.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
