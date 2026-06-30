package sx5;

/* loaded from: classes3.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413752d;

    public q0(sx5.a1 a1Var) {
        this.f413752d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f413752d.f413677m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/xweb/extension/video/XWebNativeInterface$41", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/xweb/extension/video/XWebNativeInterface$41", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
