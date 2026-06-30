package rv0;

/* loaded from: classes5.dex */
public final class d6 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f399976d;

    public d6(rv0.z6 z6Var) {
        this.f399976d = z6Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.base.MJID mjid = (com.tencent.maas.base.MJID) obj;
        if (mjid == null) {
            return;
        }
        rv0.z6 z6Var = this.f399976d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = z6Var.p7().getLayoutManager();
        if ((layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null) != null) {
            z6Var.p7().post(new rv0.c6(z6Var, mjid));
        }
    }
}
