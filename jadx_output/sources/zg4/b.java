package zg4;

/* loaded from: classes7.dex */
public final class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.surface.test.TestUI f472837d;

    public b(com.tencent.mm.plugin.surface.test.TestUI testUI) {
        this.f472837d = testUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f472837d.finish();
        return true;
    }
}
