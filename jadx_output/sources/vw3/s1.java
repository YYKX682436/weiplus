package vw3;

/* loaded from: classes.dex */
public final class s1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerItemSettingUI f441104d;

    public s1(com.tencent.mm.plugin.repairer.ui.RepairerItemSettingUI repairerItemSettingUI) {
        this.f441104d = repairerItemSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f441104d.onBackPressed();
        return true;
    }
}
