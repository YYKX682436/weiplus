package kr3;

/* loaded from: classes.dex */
public final class j1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f311401d;

    public j1(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f311401d = mMActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(menuItem, "<anonymous parameter 0>");
        this.f311401d.finish();
        return true;
    }
}
