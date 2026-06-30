package un1;

/* loaded from: classes12.dex */
public class c implements kn1.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f429425a;

    public c(un1.d dVar) {
        this.f429425a = new java.lang.ref.WeakReference(dVar);
    }

    public void a(int i17) {
        boolean n17;
        un1.d dVar = (un1.d) this.f429425a.get();
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupChatBanner", "BackupChatBanner WeakReference is null!");
            return;
        }
        int i18 = kn1.f.f309601g;
        if (i18 != 1) {
            if (i18 == 22) {
                int i19 = dVar.f429430q;
                if (i17 != -100 || i17 != i19) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupChatBanner", "refreshMoveRecoverState backupMode[%d], backupMoveState[%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                }
                if (i17 != 4 && i17 != 5 && i17 != 23 && i17 != i19 && i17 != -4 && i17 != 22 && i17 != 52) {
                    switch (i17) {
                    }
                }
                n17 = true;
            }
            n17 = false;
        } else {
            n17 = dVar.n(i17);
        }
        if (n17) {
            dVar.f();
        } else if (!dVar.f402844i) {
            return;
        }
        if (i18 == 1) {
            dVar.m(i17);
            return;
        }
        if (i18 != 22) {
            android.view.View view = dVar.f429426m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
