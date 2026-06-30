package zc3;

/* loaded from: classes7.dex */
public final class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.demo.ui.MagicBrushDemoActivity f471411d;

    public d(com.tencent.mm.plugin.magicbrush.demo.ui.MagicBrushDemoActivity magicBrushDemoActivity) {
        this.f471411d = magicBrushDemoActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f471411d.finish();
        return true;
    }
}
