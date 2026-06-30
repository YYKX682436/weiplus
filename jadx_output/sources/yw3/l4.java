package yw3;

/* loaded from: classes3.dex */
public final class l4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI f466797d;

    public l4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
        this.f466797d = repairerMvvmListDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466797d.finish();
        return true;
    }
}
