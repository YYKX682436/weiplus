package ry4;

/* loaded from: classes.dex */
public final class p0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401671d;

    public p0(ry4.d1 d1Var) {
        this.f401671d = d1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f401671d.getActivity().finish();
        return true;
    }
}
