package ea3;

/* loaded from: classes5.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f250611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f250612e;

    public g(ea3.h hVar, android.view.View view, android.view.View view2) {
        this.f250611d = view;
        this.f250612e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f250611d;
        view.getHitRect(rect);
        rect.left -= i65.a.b(view.getContext(), 20);
        rect.top -= i65.a.b(view.getContext(), 20);
        rect.right += i65.a.b(view.getContext(), 20);
        rect.bottom += i65.a.b(view.getContext(), 20);
        this.f250612e.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
