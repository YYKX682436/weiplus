package cw1;

/* loaded from: classes4.dex */
public final class l1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f223098d;

    public l1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI) {
        this.f223098d = cleanCacheNewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f223098d.finish();
        return false;
    }
}
