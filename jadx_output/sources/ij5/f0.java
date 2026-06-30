package ij5;

/* loaded from: classes.dex */
public final class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.n0 f291768d;

    public f0(ij5.n0 n0Var) {
        this.f291768d = n0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        j75.f stateCenter;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f291768d.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return false;
        }
        stateCenter.B3(new wi5.c());
        return false;
    }
}
