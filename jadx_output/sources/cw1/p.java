package cw1;

/* loaded from: classes3.dex */
public final class p implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223210d;

    public p(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI) {
        this.f223210d = cleanAllMessagesUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f223210d.finish();
        return false;
    }
}
