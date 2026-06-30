package cw1;

/* loaded from: classes12.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI f223281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f223282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f223283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f223284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f223285h;

    public r1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI cleanCacheProgressUI, long j17, long j18, boolean z17, boolean z18) {
        this.f223281d = cleanCacheProgressUI;
        this.f223282e = j17;
        this.f223283f = j18;
        this.f223284g = z17;
        this.f223285h = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI cleanCacheProgressUI = this.f223281d;
        if (cleanCacheProgressUI.isDestroyed()) {
            return;
        }
        android.view.View view = cleanCacheProgressUI.f95678h;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        if (view.getVisibility() == 0) {
            long j17 = this.f223282e;
            cleanCacheProgressUI.f95681n = j17;
            long j18 = this.f223283f;
            cleanCacheProgressUI.f95682o = j18;
            android.widget.ProgressBar progressBar = cleanCacheProgressUI.f95676f;
            if (progressBar == null) {
                kotlin.jvm.internal.o.o("progressBar");
                throw null;
            }
            progressBar.setProgress(j18 > 0 ? (int) ((100 * j17) / j18) : 0);
            android.widget.TextView textView = cleanCacheProgressUI.f95677g;
            if (textView == null) {
                kotlin.jvm.internal.o.o("sizeTV");
                throw null;
            }
            textView.setText(cleanCacheProgressUI.getString(com.tencent.mm.R.string.n8o, fp.n0.a(j17), fp.n0.a(j18)));
            if (this.f223284g) {
                cleanCacheProgressUI.setBackBtnVisible(false);
                android.view.View view2 = cleanCacheProgressUI.f95678h;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("loadingLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onProgress$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onProgress$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById = cleanCacheProgressUI.findViewById(com.tencent.mm.R.id.t4q);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onProgress$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onProgress$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) cleanCacheProgressUI.findViewById(com.tencent.mm.R.id.m9e)).setText(cleanCacheProgressUI.getString(com.tencent.mm.R.string.n8r, fp.n0.a(j17)));
                ((android.widget.TextView) cleanCacheProgressUI.findViewById(com.tencent.mm.R.id.t4p)).setText(this.f223285h ? com.tencent.mm.R.string.n8p : com.tencent.mm.R.string.n8q);
                cleanCacheProgressUI.f95674d.bj();
                jz5.l Di = cleanCacheProgressUI.f95674d.Di();
                java.lang.String str = (java.lang.String) Di.f302833d;
                java.lang.String str2 = (java.lang.String) Di.f302834e;
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                iy1.c cVar = iy1.c.MainUI;
                jz5.l[] lVarArr = new jz5.l[9];
                lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(cleanCacheProgressUI.U6() ? 2 : 1));
                lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(cleanCacheProgressUI.f95683p));
                lVarArr[2] = new jz5.l("removed_size_byte", java.lang.Long.valueOf(j17));
                yv1.g1 a17 = yv1.g1.f466040p.a(cleanCacheProgressUI.f95679i);
                lVarArr[3] = new jz5.l("storage_manage_sessionid", a17 != null ? a17.f466043b : null);
                lVarArr[4] = new jz5.l("cache_remove_sessionid", cleanCacheProgressUI.f95680m);
                lVarArr[5] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(j17));
                lVarArr[6] = new jz5.l("cache_remove_size", java.lang.Long.valueOf(j18));
                lVarArr[7] = new jz5.l("cache_removed_content", str);
                lVarArr[8] = new jz5.l("cache_remove_content", str2);
                ((cy1.a) rVar).Gj(50162, "page_in", kz5.c1.k(lVarArr), 32903);
            }
        }
    }
}
