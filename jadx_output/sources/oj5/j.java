package oj5;

/* loaded from: classes14.dex */
public final class j implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f345854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj5.o f345855e;

    public j(android.view.View view, oj5.o oVar) {
        this.f345854d = view;
        this.f345855e = oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        this.f345854d.removeOnAttachStateChangeListener(this);
        oj5.o oVar = this.f345855e;
        oj5.g gVar = oVar.f345873l;
        if (gVar != null && (atomicBoolean = gVar.f345850n) != null) {
            atomicBoolean.set(true);
        }
        oVar.f345867f.removeCallbacksAndMessages(null);
    }
}
