package hq5;

/* loaded from: classes5.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.t0 f283252d;

    public n0(hq5.t0 t0Var) {
        this.f283252d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$onStateChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hq5.t0 t0Var = this.f283252d;
        com.tencent.mars.xlog.Log.i(t0Var.f283271d, "click selectImg");
        t0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        ((e60.k1) i95.n0.c(e60.k1.class)).getClass();
        pf5.j0.a(intent, i33.h.class);
        intent.putExtra("key_force_show_raw_iamge_size", true);
        intent.putExtra("key_wedrop_select_size_limit", t0Var.f283276i);
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        androidx.appcompat.app.AppCompatActivity activity = t0Var.getActivity();
        int i17 = t0Var.f283272e;
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.c(activity, i17, 99, 49, 3, false, intent);
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$onStateChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
