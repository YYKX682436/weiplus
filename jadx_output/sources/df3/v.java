package df3;

/* loaded from: classes8.dex */
public final class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI f232037d;

    public v(com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI weMagicSclCommonStarterDemoUI) {
        this.f232037d = weMagicSclCommonStarterDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI weMagicSclCommonStarterDemoUI = this.f232037d;
        com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI.U6(weMagicSclCommonStarterDemoUI);
        weMagicSclCommonStarterDemoUI.finish();
        return true;
    }
}
