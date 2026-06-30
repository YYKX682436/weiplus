package th;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th.o f419233d;

    public b(th.o oVar) {
        this.f419233d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        th.o oVar = this.f419233d;
        if (oVar.f419268f == null) {
            android.view.View view = oVar.f419267e;
            if (view != null) {
                android.widget.Toast.makeText(view.getContext(), "Search TAG 'TOP_THREAD_DUMP' for detail report", 1).show();
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent(oVar.f419268f.d(), (java.lang.Class<?>) com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity.class);
        if (!(oVar.f419268f.d() instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        android.content.Context d17 = oVar.f419268f.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(d17, arrayList.toArray(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        d17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(d17, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
