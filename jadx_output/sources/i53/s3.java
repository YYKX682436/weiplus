package i53;

/* loaded from: classes.dex */
public class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.t3 f288712d;

    public s3(i53.t3 t3Var) {
        this.f288712d = t3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f288712d.f288740a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameVideoDownloadUI$5$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameVideoDownloadUI$5$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
