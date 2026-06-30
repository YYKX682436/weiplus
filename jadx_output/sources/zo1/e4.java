package zo1;

/* loaded from: classes5.dex */
public final class e4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.b4 f474593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f474594e;

    public e4(zo1.b4 b4Var, zo1.k4 k4Var) {
        this.f474593d = b4Var;
        this.f474594e = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zo1.k4 k4Var;
        zo1.a4 a4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f474593d.getAdapterPosition();
        if (adapterPosition != -1 && (a4Var = (k4Var = this.f474594e).f474673d) != null) {
            java.lang.Object obj = k4Var.f474674e.get(adapterPosition);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "onAutoBackupBtnClick, pkgId=" + gVar.f215829d);
            com.tencent.mm.plugin.backup.roambackup.a2.a(com.tencent.mm.plugin.backup.roambackup.a2.f92567a, com.tencent.mm.plugin.backup.roambackup.y1.G, gVar, null, null, null, null, 60, null);
            zo1.x3 x3Var = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.f92864q;
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = ((zo1.r4) a4Var).f474759a;
            selectPackageUI.getClass();
            uo1.w wVar = uo1.w.f429597a;
            int i17 = gVar.f215835m;
            po1.c cVar = po1.d.f357294i;
            com.tencent.wechat.aff.affroam.u uVar = gVar.f215832g;
            kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
            java.lang.String b17 = cVar.a(uVar).b();
            long j17 = gVar.f215829d;
            jz5.l lVar = new jz5.l(0L, 0L);
            if (gVar.f215834i.f215841d.size() >= 1) {
                com.tencent.wechat.aff.affroam.m mVar = (com.tencent.wechat.aff.affroam.m) gVar.f215834i.f215841d.get(0);
                if (mVar.f215900f.size() >= 1) {
                    com.tencent.wechat.aff.affroam.l lVar2 = (com.tencent.wechat.aff.affroam.l) mVar.f215900f.get(0);
                    lVar = new jz5.l(java.lang.Long.valueOf(lVar2.f215884d), java.lang.Long.valueOf(lVar2.f215885e));
                }
            }
            wVar.a(selectPackageUI, i17, b17, j17, ((java.lang.Number) lVar.f302834e).longValue() > 0, new zo1.g5(gVar, selectPackageUI));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
