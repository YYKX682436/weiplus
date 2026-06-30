package un1;

/* loaded from: classes12.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un1.d f429424d;

    public b(un1.d dVar) {
        this.f429424d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChatBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = kn1.f.f309601g;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupChatBanner", "backupbanner onclick, backupMode[%d]", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            kn1.g e17 = qn1.c.i().e();
            e17.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            int i18 = e17.f309609a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupChatBanner", "backupbanner onclick, backupPcState[%d]", java.lang.Integer.valueOf(i18));
            un1.d dVar = this.f429424d;
            if (i18 != -25 && i18 != -4 && i18 != 12 && i18 != 28) {
                if (i18 == 100) {
                    android.view.View view2 = dVar.f429426m;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (i18 != 4 && i18 != 5 && i18 != 14 && i18 != 15) {
                    switch (i18) {
                        case 22:
                        case 23:
                            break;
                        case 24:
                        case 25:
                            kn1.g e18 = qn1.c.i().e();
                            e18.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.BackupChatBanner", "click backup banner skipToBackupPcUI,BackupPcState[%d]", java.lang.Integer.valueOf(e18.f309609a));
                            dVar.l(true);
                            break;
                        default:
                            kn1.g e19 = qn1.c.i().e();
                            e19.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.BackupChatBanner", "click backup banner, BackupPcState[%d]", java.lang.Integer.valueOf(e19.f309609a));
                            break;
                    }
                }
            }
            kn1.g e27 = qn1.c.i().e();
            e27.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupChatBanner", "click backup banner skipToBackupPcUI,BackupPcState[%d]", java.lang.Integer.valueOf(e27.f309609a));
            dVar.l(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
