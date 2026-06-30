package zo1;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI f474615d;

    public g(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI) {
        this.f474615d = backupRangeManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI = this.f474615d;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = backupRangeManagerUI.f92787f;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        backupRangeInfo.f92730d = po1.b.f357290e;
        android.widget.LinearLayout linearLayout = backupRangeManagerUI.f92792n;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("specificConvSubMenu");
            throw null;
        }
        if (linearLayout.getVisibility() == 8) {
            android.widget.LinearLayout linearLayout2 = backupRangeManagerUI.f92792n;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("specificConvSubMenu");
                throw null;
            }
            linearLayout2.setVisibility(0);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = backupRangeManagerUI.f92791m;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("specificIndicatorIv");
                throw null;
            }
            weImageView.setImageResource(com.tencent.mm.R.raw.arrow_up);
        } else {
            android.widget.LinearLayout linearLayout3 = backupRangeManagerUI.f92792n;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.o.o("specificConvSubMenu");
                throw null;
            }
            linearLayout3.setVisibility(8);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = backupRangeManagerUI.f92791m;
            if (weImageView2 == null) {
                kotlin.jvm.internal.o.o("specificIndicatorIv");
                throw null;
            }
            weImageView2.setImageResource(com.tencent.mm.R.raw.arrow_down);
        }
        backupRangeManagerUI.X6();
        backupRangeManagerUI.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
