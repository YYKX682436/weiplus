package x9;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f452607d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f452608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior f452609f;

    public c(com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior, android.view.View view, boolean z17) {
        this.f452609f = swipeDismissBehavior;
        this.f452607d = view;
        this.f452608e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior = this.f452609f;
        androidx.customview.widget.l lVar = swipeDismissBehavior.f44355d;
        if (lVar != null && lVar.h(true)) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.m(this.f452607d, this);
        } else if (this.f452608e) {
            swipeDismissBehavior.getClass();
        }
    }
}
