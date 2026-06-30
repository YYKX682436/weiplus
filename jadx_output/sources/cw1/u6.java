package cw1;

/* loaded from: classes3.dex */
public final class u6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI f223356d;

    public u6(com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI) {
        this.f223356d = cleanOtherAccountUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f223356d.finish();
        return false;
    }
}
