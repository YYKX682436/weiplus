package cw1;

/* loaded from: classes8.dex */
public final class f3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI f222934d;

    public f3(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI cleanChattingChooseConvUI) {
        this.f222934d = cleanChattingChooseConvUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f222934d.finish();
        return true;
    }
}
