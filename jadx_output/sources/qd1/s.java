package qd1;

/* loaded from: classes5.dex */
public class s implements android.view.View.OnAttachStateChangeListener, android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.TouchDelegate f361674d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f361675e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f361676f;

    public s(qd1.w wVar, android.view.View view) {
        view.addOnAttachStateChangeListener(this);
        view.setOnTouchListener(new qd1.r(this, wVar));
        this.f361675e = view;
    }

    public final void a() {
        if (this.f361676f != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            android.view.View view = this.f361675e;
            if (n3.x0.b(view)) {
                android.graphics.Rect rect = new android.graphics.Rect(0, 0, this.f361676f.getWidth(), this.f361676f.getHeight());
                android.view.View view2 = this.f361676f;
                android.view.TouchDelegate touchDelegate = new android.view.TouchDelegate(rect, view);
                this.f361674d = touchDelegate;
                view2.setTouchDelegate(touchDelegate);
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f361676f = (android.view.View) view.getParent();
        a();
        this.f361676f.addOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        android.view.View view2 = this.f361676f;
        if (view2 != null && view2.getTouchDelegate() == this.f361674d) {
            this.f361676f.setTouchDelegate(null);
        }
        android.view.View view3 = this.f361676f;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
    }
}
