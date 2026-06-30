package o;

/* loaded from: classes15.dex */
public class h implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.l f341716d;

    public h(o.l lVar) {
        this.f341716d = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        o.l lVar = this.f341716d;
        android.view.ViewTreeObserver viewTreeObserver = lVar.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                lVar.E = view.getViewTreeObserver();
            }
            lVar.E.removeGlobalOnLayoutListener(lVar.f341733p);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
