package cw1;

/* loaded from: classes.dex */
public final class g3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseUI f222948d;

    public g3(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseUI cleanChattingChooseUI) {
        this.f222948d = cleanChattingChooseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f222948d.finish();
        return false;
    }
}
