package i33;

/* loaded from: classes10.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.c0 f288160d;

    public b0(i33.c0 c0Var) {
        this.f288160d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC$checkBottomPermissionTipsForOnlyCanShowMediaPart$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i33.c0 c0Var = this.f288160d;
        androidx.appcompat.app.AppCompatActivity activity = c0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.e eVar = (i33.e) pf5.z.f353948a.a(activity).a(i33.e.class);
        com.tencent.mars.xlog.Log.i(eVar.f288174f, "markJumpingPermissionChange: ");
        eVar.f288178m = true;
        eVar.X6("set_allow_all_tips");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity activity2 = c0Var.getActivity();
        ((sb0.f) jVar).getClass();
        j35.u.g(activity2);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumQueryPermissionUIC$checkBottomPermissionTipsForOnlyCanShowMediaPart$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
