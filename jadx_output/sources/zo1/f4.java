package zo1;

/* loaded from: classes5.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.b4 f474609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f474610e;

    public f4(zo1.b4 b4Var, zo1.k4 k4Var) {
        this.f474609d = b4Var;
        this.f474610e = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zo1.k4 k4Var;
        zo1.a4 a4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f474609d.getAdapterPosition();
        int i17 = -1;
        if (adapterPosition != -1 && (a4Var = (k4Var = this.f474610e).f474673d) != null) {
            java.lang.Object obj = k4Var.f474674e.get(adapterPosition);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) obj;
            zo1.r4 r4Var = (zo1.r4) a4Var;
            com.tencent.mm.plugin.backup.roambackup.a2.a(com.tencent.mm.plugin.backup.roambackup.a2.f92567a, com.tencent.mm.plugin.backup.roambackup.y1.H, gVar, null, null, null, null, 60, null);
            com.tencent.wechat.aff.affroam.h hVar = gVar.f215837o;
            if (hVar.f215839e <= 0) {
                i17 = com.tencent.mm.R.string.mzt;
            } else if (hVar.f215838d <= 0) {
                i17 = com.tencent.mm.R.string.mzn;
            } else {
                qo1.j0 d17 = qo1.j1.f365523a.d(gVar.f215829d);
                if ((d17 instanceof qo1.v0) && d17.b()) {
                    i17 = com.tencent.mm.R.string.n0p;
                }
            }
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = r4Var.f474759a;
            if (i17 > 0) {
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(selectPackageUI);
                e4Var.d(i17);
                e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                e4Var.c();
            } else {
                android.content.Intent intent = new android.content.Intent(selectPackageUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartRestoringUI.class);
                intent.putExtra("packageId", gVar.f215829d);
                selectPackageUI.startActivityForResult(intent, 123);
                selectPackageUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477729q);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
