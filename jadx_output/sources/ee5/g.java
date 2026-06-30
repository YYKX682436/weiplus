package ee5;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f251881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.j f251882e;

    public g(com.tencent.mm.ui.widget.dialog.z2 z2Var, ee5.j jVar) {
        this.f251881d = z2Var;
        this.f251882e = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        de5.a.f229396a.g(102);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).bj(true);
        this.f251881d.B();
        ee5.j jVar = this.f251882e;
        androidx.appcompat.app.AppCompatActivity activity = jVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ee5.q3 q3Var = (ee5.q3) pf5.z.f353948a.a(activity).a(ee5.q3.class);
        q3Var.f252017r = true;
        q3Var.R6();
        android.view.View view2 = jVar.f251930d;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.appcompat.app.AppCompatActivity activity2 = jVar.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ee5.z zVar = (ee5.z) pf5.z.f353948a.a(activity2).a(ee5.z.class);
        android.view.View view3 = jVar.f251932f;
        kotlin.jvm.internal.o.d(view3);
        zVar.getClass();
        zVar.f252104n = true;
        zVar.f252108r = true;
        zVar.f252101h = com.tencent.mm.ui.widget.dialog.u3.f(zVar.getActivity(), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzr), false, 0, null);
        kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(zVar), kotlinx.coroutines.q1.f310570c, null, new ee5.l(zVar, view3, null), 2, null);
        zVar.W6();
        zVar.f252106p = kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(zVar), null, null, new ee5.m(zVar, view3, null), 3, null);
        androidx.appcompat.app.AppCompatActivity activity3 = jVar.getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        ee5.h0 h0Var = (ee5.h0) pf5.z.f353948a.a(activity3).a(ee5.h0.class);
        h0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "setIsFromOpen");
        h0Var.C = true;
        h0Var.f251908t = false;
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
