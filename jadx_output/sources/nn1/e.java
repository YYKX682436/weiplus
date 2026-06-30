package nn1;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.ui.widget.dialog.n2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI f338659e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI, java.lang.String[] strArr, int i17) {
        super(strArr, i17);
        this.f338659e = backupMoveChooseUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public java.lang.CharSequence b(int i17) {
        if (i17 == 2) {
            return this.f338659e.f92526z;
        }
        return null;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public boolean d(int i17) {
        android.view.View view;
        final com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI = this.f338659e;
        if (i17 == 0) {
            com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI2 = this.f338659e;
            backupMoveChooseUI2.f7(0, 0L, 0L, backupMoveChooseUI2.f92522v);
        } else if (i17 == 1) {
            this.f338659e.f7(1, java.lang.System.currentTimeMillis() - 7862400000L, java.lang.System.currentTimeMillis(), backupMoveChooseUI.f92522v);
        } else if (i17 == 2) {
            final com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(backupMoveChooseUI.getContext());
            android.view.View inflate = android.view.LayoutInflater.from(backupMoveChooseUI.getContext()).inflate(com.tencent.mm.R.layout.f488172jc, (android.view.ViewGroup) null);
            inflate.findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.d$$c
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i18 = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.K;
                    java.lang.Object obj = new java.lang.Object();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.tencent.mm.ui.widget.dialog.y1 y1Var2 = com.tencent.mm.ui.widget.dialog.y1.this;
                    arrayList.add(y1Var2);
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                    y1Var2.q();
                    yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            backupMoveChooseUI.E = inflate.findViewById(com.tencent.mm.R.id.abp);
            backupMoveChooseUI.f92519s = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.abk);
            backupMoveChooseUI.E.setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.d$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i18 = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.K;
                    com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI3 = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.this;
                    backupMoveChooseUI3.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.tencent.mm.ui.widget.dialog.y1 y1Var2 = y1Var;
                    arrayList.add(y1Var2);
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupMoveChooseUI3, array);
                    long j17 = backupMoveChooseUI3.A;
                    long j18 = backupMoveChooseUI3.B;
                    if (j17 >= j18) {
                        backupMoveChooseUI3.f92519s.setVisibility(0);
                        yj0.a.h(backupMoveChooseUI3, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    backupMoveChooseUI3.f7(1, j17, j18, backupMoveChooseUI3.f92522v);
                    y1Var2.q();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.text.SimpleDateFormat simpleDateFormat = backupMoveChooseUI3.f92525y;
                    sb6.append(simpleDateFormat.format(new java.util.Date(backupMoveChooseUI3.f92523w)));
                    sb6.append("~");
                    sb6.append(simpleDateFormat.format(new java.util.Date(backupMoveChooseUI3.f92524x)));
                    backupMoveChooseUI3.f92526z = sb6.toString();
                    com.tencent.mm.ui.widget.dialog.p2 p2Var = backupMoveChooseUI3.H;
                    com.tencent.mm.ui.widget.dialog.w2 w2Var = p2Var.f211945a;
                    if (w2Var != null) {
                        w2Var.a(p2Var);
                    }
                    yj0.a.h(backupMoveChooseUI3, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            backupMoveChooseUI.E.setEnabled(false);
            backupMoveChooseUI.C = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.abm);
            backupMoveChooseUI.D = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ab8);
            long j17 = backupMoveChooseUI.A;
            if (j17 > 0) {
                backupMoveChooseUI.h7(backupMoveChooseUI.C, j17);
            }
            long j18 = backupMoveChooseUI.B;
            if (j18 > 0) {
                backupMoveChooseUI.h7(backupMoveChooseUI.D, j18);
            }
            if (backupMoveChooseUI.B != 0 && backupMoveChooseUI.A != 0 && (view = backupMoveChooseUI.E) != null) {
                view.setEnabled(true);
            }
            backupMoveChooseUI.C.setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.d$$e
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i18 = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.K;
                    com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI3 = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.this;
                    backupMoveChooseUI3.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupMoveChooseUI3, array);
                    backupMoveChooseUI3.e7(true);
                    if (backupMoveChooseUI3.B != 0 && backupMoveChooseUI3.A != 0) {
                        backupMoveChooseUI3.E.setEnabled(true);
                    }
                    yj0.a.h(backupMoveChooseUI3, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            backupMoveChooseUI.D.setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.d$$f
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i18 = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.K;
                    com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI3 = com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI.this;
                    backupMoveChooseUI3.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupMoveChooseUI3, array);
                    backupMoveChooseUI3.e7(false);
                    if (backupMoveChooseUI3.B != 0 && backupMoveChooseUI3.A != 0) {
                        backupMoveChooseUI3.E.setEnabled(true);
                    }
                    yj0.a.h(backupMoveChooseUI3, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            y1Var.k(inflate);
            y1Var.s();
        }
        long a76 = backupMoveChooseUI.a7(backupMoveChooseUI.f92508e.f338637e);
        if (backupMoveChooseUI.F && a76 > 0) {
            backupMoveChooseUI.f92518r.setVisibility(0);
            backupMoveChooseUI.g7(a76);
        } else if (a76 == 0) {
            backupMoveChooseUI.f92518r.setVisibility(8);
        }
        super.d(i17);
        return true;
    }
}
