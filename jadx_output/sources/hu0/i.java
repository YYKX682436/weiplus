package hu0;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f285033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.l f285034e;

    public i(boolean z17, hu0.l lVar) {
        this.f285033d = z17;
        this.f285034e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationControlUIC$onViewCreated$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f285033d;
        hu0.l lVar = this.f285034e;
        if (z17) {
            hu0.l.O6(lVar, "effect_modify_complete_continue_post");
        }
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MJCC.ControlUIC", "onPublishClicked");
        gu0.k2 k2Var = (gu0.k2) ((jz5.n) lVar.f285037d).getValue();
        if (k2Var != null) {
            k2Var.w();
            androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(hu0.o.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            hu0.o oVar = (hu0.o) a17;
            oVar.Q6();
            lVar.R6(false);
            boolean b17 = kotlin.jvm.internal.o.b(k2Var.f275725a.f256695a, "reedit");
            kotlinx.coroutines.y0 y0Var = k2Var.f275728d;
            if (b17) {
                com.tencent.mars.xlog.Log.i("MJCC.ControlUIC", "onPublishClicked: reedit scene");
                hu0.f fVar = new hu0.f(k2Var, oVar, lVar);
                com.tencent.mars.xlog.Log.i("MJCC.Session", "exportVideoForReedit: start");
                kotlinx.coroutines.l.d(y0Var, null, null, new gu0.q0(k2Var, fVar, null), 3, null);
            } else {
                hu0.h hVar = new hu0.h(k2Var, oVar, lVar);
                com.tencent.mars.xlog.Log.i("MJCC.Session", "exportVideoAndUploadTemplate: start");
                kotlinx.coroutines.l.d(y0Var, null, null, new gu0.p0(k2Var, hVar, null), 3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationControlUIC$onViewCreated$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
