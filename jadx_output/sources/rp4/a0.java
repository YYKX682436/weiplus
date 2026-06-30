package rp4;

/* loaded from: classes10.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp4.f0 f398610d;

    public a0(rp4.f0 f0Var) {
        this.f398610d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel remux job >> isActive: ");
        rp4.f0 f0Var = this.f398610d;
        kotlinx.coroutines.r2 r2Var = f0Var.f398642t;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var).a()) : null);
        sb6.append(" progress: ");
        com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading = f0Var.f398646x;
        sb6.append(mMProgressLoading != null ? java.lang.Integer.valueOf(mMProgressLoading.getProgress()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionRemuxPlugin", sb6.toString());
        kotlinx.coroutines.r2 r2Var2 = f0Var.f398642t;
        if (r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionRemuxPlugin", "initProgress cancel");
            m55.c cVar = f0Var.f398643u;
            if (cVar != null) {
                ((m55.b) cVar).a();
            }
            kotlinx.coroutines.r2 r2Var3 = f0Var.f398642t;
            if (r2Var3 != null) {
                kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
            }
            com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading2 = f0Var.f398646x;
            if (mMProgressLoading2 != null) {
                mMProgressLoading2.setProgress(0);
            }
            android.view.View view2 = f0Var.f398645w;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ju3.d0 d0Var = f0Var.f398630e;
            if (d0Var != null) {
                ju3.d0.k(d0Var, ju3.c0.M2, null, 2, null);
            }
            f0Var.f398634i = true;
            f0Var.a(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
