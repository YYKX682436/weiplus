package yn1;

/* loaded from: classes8.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.z f463932d = new yn1.z();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/migration/MigrationBanner$onInitializeView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationBanner", "on close icon clicked");
        ((yn1.s) ((mv.v) i95.n0.c(mv.v.class))).Di();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/migration/MigrationBanner$onInitializeView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
