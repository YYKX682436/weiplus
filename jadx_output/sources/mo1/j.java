package mo1;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po1.d f330292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI f330293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f330294f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(po1.d dVar, com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI createRoamLitePkgUI, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(1);
        this.f330292d = dVar;
        this.f330293e = createRoamLitePkgUI;
        this.f330294f = u3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        com.tencent.mm.plugin.backup.roambackup.a2 a2Var = com.tencent.mm.plugin.backup.roambackup.a2.f92567a;
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92946p;
        po1.d dVar = this.f330292d;
        com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI createRoamLitePkgUI = this.f330293e;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = createRoamLitePkgUI.f92704n;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        com.tencent.mm.plugin.backup.roambackup.a2.a(a2Var, y1Var, null, null, dVar, backupRangeInfo, new mo1.i(createRoamLitePkgUI), 6, null);
        if (!createRoamLitePkgUI.f92707q && (th6 instanceof java.util.concurrent.CancellationException)) {
            createRoamLitePkgUI.f92708r = 1;
        }
        this.f330294f.dismiss();
        android.widget.Button button = createRoamLitePkgUI.f92703m;
        if (button != null) {
            button.setEnabled(true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("createBtn");
        throw null;
    }
}
