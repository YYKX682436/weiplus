package l45;

/* loaded from: classes10.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l45.d f316438d;

    public c(l45.d dVar) {
        this.f316438d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View actionBar = this.f316438d.f316439a.f316460a.getActionBar();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(actionBar, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        actionBar.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(actionBar, "com/tencent/mm/presenter/DrawingPresenter$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
