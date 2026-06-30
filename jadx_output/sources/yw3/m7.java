package yw3;

/* loaded from: classes.dex */
public final class m7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerX2CDemoUI f466812d;

    public m7(com.tencent.mm.plugin.repairer.ui.demo.RepairerX2CDemoUI repairerX2CDemoUI) {
        this.f466812d = repairerX2CDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466812d.finish();
        return false;
    }
}
