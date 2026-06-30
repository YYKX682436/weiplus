package mo1;

/* loaded from: classes5.dex */
public final class k0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330297d;

    public k0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI) {
        this.f330297d = roamLiteTaskDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.f92712o;
        com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI = this.f330297d;
        roamLiteTaskDetailUI.V6();
        roamLiteTaskDetailUI.Y6(roamLiteTaskDetailUI.f92716g ? "roamLiteStartRestoreResult" : "roamLiteStartBackupResult", 1, roamLiteTaskDetailUI.f92713d);
        return true;
    }
}
