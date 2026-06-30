package uf5;

/* loaded from: classes3.dex */
public final class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.x f427274d;

    public n(uf5.x xVar) {
        this.f427274d = xVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        j75.f Q6 = this.f427274d.Q6();
        if (Q6 == null) {
            return true;
        }
        Q6.B3(new uf5.x0());
        return true;
    }
}
