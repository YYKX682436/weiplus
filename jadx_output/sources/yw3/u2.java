package yw3;

/* loaded from: classes.dex */
public final class u2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI f466901d;

    public u2(com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI) {
        this.f466901d = repairerImageLoaderDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466901d.finish();
        return true;
    }
}
