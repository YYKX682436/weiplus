package df5;

/* loaded from: classes14.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.n f232165d;

    public m(df5.n nVar) {
        this.f232165d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df5.n nVar = this.f232165d;
        if (nVar.f232171g) {
            return;
        }
        nVar.getClass();
        for (android.view.ViewParent parent = nVar.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof android.view.View) {
                android.view.View view = (android.view.View) parent;
                if (view.isLongClickable()) {
                    view.performLongClick();
                    return;
                }
            }
        }
    }
}
