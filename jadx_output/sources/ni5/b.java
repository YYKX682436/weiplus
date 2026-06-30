package ni5;

/* loaded from: classes.dex */
public final class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.MvvmContactListUI f337786d;

    public b(com.tencent.mm.ui.mvvm.MvvmContactListUI mvvmContactListUI) {
        this.f337786d = mvvmContactListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f337786d.onBackPressed();
        return false;
    }
}
