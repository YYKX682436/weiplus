package yw3;

/* loaded from: classes.dex */
public final class d7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoUI f466723d;

    public d7(com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoUI repairerSvgDemoUI) {
        this.f466723d = repairerSvgDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466723d.finish();
        return true;
    }
}
