package cw1;

/* loaded from: classes9.dex */
public final class f5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingTabsUI f222936d;

    public f5(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingTabsUI cleanChattingTabsUI) {
        this.f222936d = cleanChattingTabsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f222936d.finish();
        return false;
    }
}
