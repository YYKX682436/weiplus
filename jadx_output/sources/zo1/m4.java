package zo1;

/* loaded from: classes5.dex */
public final class m4 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474693d;

    public m4(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI) {
        this.f474693d = selectPackageUI;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) obj;
        com.tencent.wechat.aff.affroam.g gVar2 = (com.tencent.wechat.aff.affroam.g) obj2;
        qo1.j1 j1Var = qo1.j1.f365523a;
        qo1.j0 d17 = j1Var.d(gVar.f215829d);
        qo1.j0 d18 = j1Var.d(gVar2.f215829d);
        long startTime = d17.getStartTime();
        long startTime2 = d18.getStartTime();
        if (startTime > 0 && startTime2 > 0) {
            boolean z17 = d17 instanceof qo1.f0;
            com.tencent.wechat.aff.affroam.o0 o0Var = com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
            boolean z18 = false;
            boolean z19 = z17 && ((qo1.f0) d17).f365476b == o0Var;
            if ((d18 instanceof qo1.f0) && ((qo1.f0) d18).f365476b == o0Var) {
                z18 = true;
            }
            if (!z19 || z18) {
                if (z19 || !z18) {
                    return java.lang.Long.signum(startTime2 - startTime);
                }
                return -1;
            }
        } else {
            if (startTime > 0) {
                return -1;
            }
            if (startTime2 <= 0) {
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = this.f474693d;
                boolean contains = ((java.util.ArrayList) selectPackageUI.f92868g).contains(java.lang.Long.valueOf(gVar.f215829d));
                boolean contains2 = ((java.util.ArrayList) selectPackageUI.f92868g).contains(java.lang.Long.valueOf(gVar2.f215829d));
                if (contains && contains2) {
                    return java.lang.Long.signum(gVar2.f215829d - gVar.f215829d);
                }
                if (contains) {
                    return -1;
                }
                if (!contains2) {
                    int i17 = gVar.f215837o.f215839e;
                    int i18 = gVar2.f215837o.f215839e;
                    return i17 != i18 ? i18 - i17 : java.lang.Long.signum(gVar2.f215829d - gVar.f215829d);
                }
            }
        }
        return 1;
    }
}
