package i71;

/* loaded from: classes8.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.test.MMAccountTestComponentUI f289409d;

    public a(com.tencent.mm.plugin.account.test.MMAccountTestComponentUI mMAccountTestComponentUI) {
        this.f289409d = mMAccountTestComponentUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f289409d.finish();
        return true;
    }
}
