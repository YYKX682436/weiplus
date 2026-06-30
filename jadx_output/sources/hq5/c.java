package hq5;

/* loaded from: classes.dex */
public final class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f283220d;

    public c(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f283220d = mMActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f283220d.finish();
        return false;
    }
}
