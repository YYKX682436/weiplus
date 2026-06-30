package wo1;

/* loaded from: classes5.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager f447978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f447979e;

    public k1(android.view.WindowManager windowManager, android.view.View view) {
        this.f447978d = windowManager;
        this.f447979e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamFloatWindowHelper", "On button clicked, remove current float window");
        this.f447978d.removeView(this.f447979e);
        wo1.l1.f447987b = null;
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
