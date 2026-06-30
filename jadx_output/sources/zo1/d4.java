package zo1;

/* loaded from: classes5.dex */
public final class d4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.b4 f474582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f474583e;

    public d4(zo1.b4 b4Var, zo1.k4 k4Var) {
        this.f474582d = b4Var;
        this.f474583e = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f474582d.getAdapterPosition();
        int i17 = -1;
        if (adapterPosition != -1) {
            zo1.k4 k4Var = this.f474583e;
            if (k4Var.getItemCount() > 1) {
                if (k4Var.f474677h == ((com.tencent.wechat.aff.affroam.g) k4Var.f474674e.get(adapterPosition)).f215829d) {
                    k4Var.B(-1L);
                    k4Var.notifyItemChanged(adapterPosition);
                } else {
                    zo1.a4 a4Var = k4Var.f474673d;
                    if (a4Var != null) {
                        ((zo1.r4) a4Var).a(adapterPosition);
                    }
                    long j17 = k4Var.f474677h;
                    k4Var.B(((com.tencent.wechat.aff.affroam.g) k4Var.f474674e.get(adapterPosition)).f215829d);
                    k4Var.notifyItemChanged(adapterPosition);
                    if (j17 >= 0) {
                        java.util.Iterator it = k4Var.f474674e.iterator();
                        int i18 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((com.tencent.wechat.aff.affroam.g) it.next()).f215829d == j17) {
                                i17 = i18;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (i17 >= 0) {
                        k4Var.notifyItemChanged(i17);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
