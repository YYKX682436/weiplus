package zo1;

/* loaded from: classes5.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f474707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f474708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI, java.util.ArrayList arrayList, yz5.l lVar) {
        super(0);
        this.f474706d = selectPackageUI;
        this.f474707e = arrayList;
        this.f474708f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = this.f474706d;
        if (!selectPackageUI.isFinishing() && !selectPackageUI.isDestroyed()) {
            zo1.m4 m4Var = new zo1.m4(selectPackageUI);
            java.util.ArrayList arrayList = this.f474707e;
            kz5.g0.t(arrayList, m4Var);
            zo1.k4 k4Var = selectPackageUI.f92869h;
            k4Var.getClass();
            int i17 = 0;
            if (arrayList.size() == 1) {
                k4Var.B(((com.tencent.wechat.aff.affroam.g) arrayList.get(0)).f215829d);
            }
            k4Var.f474674e = arrayList;
            k4Var.notifyDataSetChanged();
            if (selectPackageUI.f92871m.length() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((com.tencent.wechat.aff.affroam.g) it.next()).f215832g.f215989e, selectPackageUI.f92871m)) {
                        break;
                    }
                    i17++;
                }
                if (i17 != -1) {
                    k4Var.x(((com.tencent.wechat.aff.affroam.g) arrayList.get(i17)).f215829d);
                }
            } else {
                long j17 = selectPackageUI.f92872n;
                if (j17 >= 0) {
                    k4Var.x(j17);
                }
            }
            selectPackageUI.f92871m = "";
            selectPackageUI.f92872n = -1L;
            yz5.l lVar = this.f474708f;
            if (lVar != null) {
                lVar.invoke(arrayList);
            }
        }
        return jz5.f0.f302826a;
    }
}
