package k13;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.g f303204d;

    public e(k13.g gVar) {
        this.f303204d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k13.g gVar = this.f303204d;
        if (gVar.f303212f) {
            return;
        }
        gVar.f303213g = com.tencent.mm.ui.bk.C();
        android.view.View inflate = com.tencent.mm.ui.id.b(gVar.b()).inflate(com.tencent.mm.R.layout.bbj, (android.view.ViewGroup) null);
        gVar.f303211e = inflate;
        kotlin.jvm.internal.o.d(inflate);
        k13.l1 l1Var = (k13.l1) gVar;
        android.view.View view = l1Var.f303211e;
        l1Var.f303236n = (androidx.recyclerview.widget.RecyclerView) (view != null ? view.findViewById(com.tencent.mm.R.id.m8z) : null);
        android.view.View view2 = l1Var.f303211e;
        l1Var.f303237o = view2 != null ? view2.findViewById(com.tencent.mm.R.id.mqi) : null;
        android.view.View view3 = l1Var.f303211e;
        l1Var.f303238p = view3 != null ? view3.findViewById(com.tencent.mm.R.id.d0_) : null;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = fp.h.c(26) ? 2038 : 2002;
        layoutParams.format = -2;
        layoutParams.packageName = gVar.b().getPackageName();
        layoutParams.gravity = 48;
        layoutParams.flags = 1064;
        layoutParams.horizontalMargin = gVar.b().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        layoutParams.width = -1;
        layoutParams.height = -2;
        android.view.View view4 = gVar.f303211e;
        if (view4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$show$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$show$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        try {
            ((android.view.WindowManager) ((jz5.n) gVar.f303215i).getValue()).addView(gVar.f303211e, layoutParams);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("ForceNotify.BaseWindow", "attach to window failed!");
        }
        android.view.View view5 = l1Var.f303211e;
        if (view5 != null) {
            view5.setFocusableInTouchMode(true);
        }
        android.view.View view6 = l1Var.f303211e;
        if (view6 != null) {
            view6.setOnKeyListener(l1Var);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = l1Var.f303236n;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        java.util.ArrayList arrayList2 = l1Var.f303239q;
        i13.c cVar = (i13.c) kz5.n0.k0(arrayList2);
        if (cVar == null || cVar.h() != -1) {
            arrayList2.add(i13.i.f287294h);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((i13.c) next).h() != -1) {
                arrayList3.add(next);
            }
        }
        arrayList2.removeAll(arrayList3);
        com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager stackLayoutManager = new com.tencent.mm.plugin.forcenotify.ui.view.StackLayoutManager(2, i65.a.b(l1Var.b(), 8), 0.1f, true, new k13.w0(l1Var));
        l1Var.f303235m = stackLayoutManager;
        k13.t0 animator = l1Var.H;
        kotlin.jvm.internal.o.g(animator, "animator");
        java.util.ArrayList arrayList4 = (java.util.ArrayList) stackLayoutManager.f137366s;
        if (!arrayList4.contains(animator)) {
            arrayList4.add(animator);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = l1Var.f303236n;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(l1Var.f303235m);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = l1Var.f303236n;
        if (recyclerView3 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.forcenotify.ui.MsgWindow$onShowWindow$2
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return type != -1 ? type != 0 ? type != 1 ? type != 2 ? type != 3 ? type != 5 ? new g13.c() : new g13.h() : new g13.d() : new g13.c() : new g13.f() : new g13.g() : new g13.e();
                }
            }, arrayList2, false);
            wxRecyclerAdapter.f293105o = new k13.y0(wxRecyclerAdapter, l1Var);
            recyclerView3.setAdapter(wxRecyclerAdapter);
        }
        android.view.View view7 = l1Var.f303237o;
        if (view7 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "onShowWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "onShowWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.RecyclerView recyclerView4 = l1Var.f303236n;
        if (recyclerView4 != null) {
            recyclerView4.post(new k13.z0(arrayList3, l1Var));
        }
        gVar.f303212f = true;
    }
}
