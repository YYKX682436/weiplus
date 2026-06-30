package mo1;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI f330288d;

    public h(com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI createRoamLitePkgUI) {
        this.f330288d = createRoamLitePkgUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/CreateRoamLitePkgUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI createRoamLitePkgUI = this.f330288d;
        po1.d dVar = createRoamLitePkgUI.f92705o;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MM.Roam.CreateRoamLitePkgUI", "Notify user device is null");
        } else {
            android.widget.Button button = createRoamLitePkgUI.f92703m;
            if (button == null) {
                kotlin.jvm.internal.o.o("createBtn");
                throw null;
            }
            button.setEnabled(false);
            com.tencent.mars.xlog.Log.i("MM.Roam.CreateRoamLitePkgUI", "begin save new package");
            com.tencent.wechat.aff.affroam.h hVar = new com.tencent.wechat.aff.affroam.h();
            hVar.f215838d = 0L;
            hVar.f215839e = 0;
            java.lang.String str2 = dVar.f357295a;
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.g(false, new mo1.e(f0Var, countDownLatch, str2));
            countDownLatch.await();
            com.tencent.mars.xlog.Log.i("MM.Roam.CreateRoamLitePkgUI", "getMaxPackageNumberByDevice maxNumber = " + f0Var.f310116d + ", targetDeviceId=" + str2);
            int i17 = f0Var.f310116d + 1;
            if (i17 <= 1) {
                str = "WXGBACKUPPACKAGEPREFIX_" + createRoamLitePkgUI.getString(com.tencent.mm.R.string.mwy);
            } else {
                str = "WXGBACKUPPACKAGEPREFIX_" + createRoamLitePkgUI.getString(com.tencent.mm.R.string.mwz, java.lang.Integer.valueOf(i17));
            }
            com.tencent.wechat.aff.affroam.g gVar = new com.tencent.wechat.aff.affroam.g();
            gVar.f215830e = 0;
            gVar.f215831f = str;
            com.tencent.wechat.aff.affroam.u uVar = new com.tencent.wechat.aff.affroam.u();
            uVar.f215989e = dVar.f357295a;
            uVar.f215988d = dVar.f357296b.h();
            uVar.f215991g = dVar.b();
            uVar.f215990f = dVar.f357299e;
            gVar.f215832g = uVar;
            gVar.f215833h = oo1.o.f347151a.d();
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = createRoamLitePkgUI.f92704n;
            if (backupRangeInfo == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            gVar.f215834i = backupRangeInfo.b();
            gVar.f215835m = 0;
            gVar.f215837o = hVar;
            com.tencent.mars.xlog.Log.i("MM.Roam.CreateRoamLitePkgUI", "Try save package to SDK and backend");
            ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(androidx.lifecycle.z.a(createRoamLitePkgUI), null, null, new mo1.m(gVar, createRoamLitePkgUI, null), 3, null)).p(new mo1.j(dVar, createRoamLitePkgUI, com.tencent.mm.ui.widget.dialog.u3.f(createRoamLitePkgUI, createRoamLitePkgUI.getString(com.tencent.mm.R.string.mwv), false, 3, mo1.n.f330307d)));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/CreateRoamLitePkgUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
