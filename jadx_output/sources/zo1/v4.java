package zo1;

/* loaded from: classes5.dex */
public final class v4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f474800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f474803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(boolean z17, int i17, com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI, long j17) {
        super(0);
        this.f474800d = z17;
        this.f474801e = i17;
        this.f474802f = selectPackageUI;
        this.f474803g = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f474800d;
        int i17 = this.f474801e;
        long j17 = this.f474803g;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = this.f474802f;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "Delete backup record complete for pkgId=" + j17 + ", errorCode=" + i17);
            if (i17 != 0) {
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(selectPackageUI);
                e4Var.b(com.tencent.mm.R.raw.exclamation_mark_circle_regular);
                e4Var.d(com.tencent.mm.R.string.f492866my4);
                e4Var.c();
            }
        } else if (i17 == 0 || i17 == -2) {
            java.util.Iterator it = selectPackageUI.f92869h.f474674e.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((com.tencent.wechat.aff.affroam.g) it.next()).f215829d == j17) {
                    break;
                }
                i19++;
            }
            if (i19 == -1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SelectPackageUI", "Fail to get position by pkgId=" + j17);
            } else {
                androidx.recyclerview.widget.RecyclerView recyclerView = selectPackageUI.f92867f;
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("packageRecyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(i19);
                if (p07 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SelectPackageUI", "Fail to get viewHolder by position=" + i19 + ", pkgId=" + j17);
                    zo1.k4 k4Var = selectPackageUI.f92869h;
                    k4Var.z(j17);
                    if (k4Var.getItemCount() == 0) {
                        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.Z6(selectPackageUI, true);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "start delete animation for pkgId=" + j17);
                    android.view.View itemView = p07.itemView;
                    kotlin.jvm.internal.o.f(itemView, "itemView");
                    zo1.u4 u4Var = new zo1.u4(j17, p07, selectPackageUI);
                    int i27 = itemView.getLayoutParams().height;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(itemView, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/AnimUtils", "animCollapseGone", "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    itemView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(itemView, "com/tencent/mm/plugin/backup/roambackup/ui/anim/AnimUtils", "animCollapseGone", "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(itemView.getHeight(), 0);
                    ofInt.addUpdateListener(new vo1.a(itemView));
                    ofInt.addListener(new vo1.b(itemView, i27, u4Var));
                    ofInt.setDuration(600L);
                    ofInt.start();
                }
            }
        } else {
            int i28 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(selectPackageUI);
            e4Var2.b(com.tencent.mm.R.raw.exclamation_mark_circle_regular);
            e4Var2.d(com.tencent.mm.R.string.f492866my4);
            e4Var2.c();
        }
        return jz5.f0.f302826a;
    }
}
