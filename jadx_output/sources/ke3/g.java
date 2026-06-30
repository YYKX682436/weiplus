package ke3;

/* loaded from: classes7.dex */
public final class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI f307012d;

    public g(com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI) {
        this.f307012d = magicSclCommonStarterDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI = this.f307012d;
        com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI.U6(magicSclCommonStarterDemoUI);
        magicSclCommonStarterDemoUI.finish();
        return true;
    }
}
