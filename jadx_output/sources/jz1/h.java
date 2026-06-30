package jz1;

/* loaded from: classes5.dex */
public class h implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz1.e f302692d;

    public h(jz1.e eVar) {
        this.f302692d = eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f302692d.Vi(1, 0L);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f302692d.Vi(1, 0L);
    }
}
