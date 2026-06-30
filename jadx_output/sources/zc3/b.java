package zc3;

/* loaded from: classes7.dex */
public final class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.demo.ui.MagicBaseDemoActivity f471410d;

    public b(com.tencent.mm.plugin.magicbrush.demo.ui.MagicBaseDemoActivity magicBaseDemoActivity) {
        this.f471410d = magicBaseDemoActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f471410d.finish();
        return true;
    }
}
