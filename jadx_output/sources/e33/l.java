package e33;

/* loaded from: classes5.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f247313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f247314e;

    public l(e33.m mVar, android.view.View view, android.view.View view2) {
        this.f247313d = view;
        this.f247314e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f247313d;
        view.getHitRect(rect);
        rect.left -= i65.a.b(view.getContext(), 20);
        rect.top -= i65.a.b(view.getContext(), 20);
        rect.right += i65.a.b(view.getContext(), 20);
        rect.bottom += i65.a.b(view.getContext(), 20);
        this.f247314e.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
