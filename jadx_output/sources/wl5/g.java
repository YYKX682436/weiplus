package wl5;

/* loaded from: classes15.dex */
public class g implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f447110d;

    public g(wl5.x xVar) {
        this.f447110d = xVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "onViewAttachedToWindow", new java.lang.Object[0]);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "onViewDetachedFromWindow", new java.lang.Object[0]);
        this.f447110d.c();
    }
}
