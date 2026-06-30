package un1;

/* loaded from: classes5.dex */
public class f implements com.tencent.mm.plugin.setting.ui.setting.b {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.LinearLayout f429437a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f429438b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f429439c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f429440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI f429441e;

    public f(com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI backupChooseBackupModeUI) {
        this.f429441e = backupChooseBackupModeUI;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.b
    public void a(android.graphics.drawable.Drawable drawable) {
        c();
        if (drawable == null) {
            this.f429437a.setVisibility(8);
            this.f429439c.setVisibility(8);
        } else {
            this.f429437a.setVisibility(0);
            this.f429439c.setVisibility(0);
            this.f429439c.setImageDrawable(drawable);
        }
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.b
    public void b(java.lang.String str, java.lang.Integer num) {
        c();
        this.f429438b.setText(str);
        if (str != null && !str.isEmpty()) {
            this.f429437a.setVisibility(0);
        }
        if (num != null) {
            this.f429438b.setTextColor(num.intValue());
        }
    }

    public final void c() {
        if (this.f429437a != null) {
            return;
        }
        com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI backupChooseBackupModeUI = this.f429441e;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) backupChooseBackupModeUI.findViewById(com.tencent.mm.R.id.rcx);
        this.f429437a = linearLayout;
        this.f429438b = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f487683sa0);
        this.f429439c = (android.widget.ImageView) this.f429437a.findViewById(com.tencent.mm.R.id.qc9);
        this.f429440d = (android.widget.TextView) backupChooseBackupModeUI.findViewById(com.tencent.mm.R.id.v3s);
        if (((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi()) {
            this.f429440d.setVisibility(0);
        } else {
            this.f429440d.setVisibility(8);
        }
        this.f429437a.setOnClickListener(new android.view.View.OnClickListener() { // from class: un1.f$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                un1.f fVar = un1.f.this;
                fVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", fVar, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", fVar, array2);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupChooseBackupModeUI", "BackupChooseBackupModeUI onViewClick");
                if (((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
                    un1.h hVar = new un1.h(fVar);
                    ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Zi(fVar.f429441e, hVar);
                }
                yj0.a.h(fVar, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(fVar, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }
}
