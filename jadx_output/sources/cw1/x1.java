package cw1;

/* loaded from: classes7.dex */
public final class x1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI f223485d;

    public x1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI cleanCacheSubListUI) {
        this.f223485d = cleanCacheSubListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f223485d.finish();
        return true;
    }
}
