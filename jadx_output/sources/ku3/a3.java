package ku3;

/* loaded from: classes3.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.e3 f312164d;

    public a3(ku3.e3 e3Var) {
        this.f312164d = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View c17 = this.f312164d.c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initLogic$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initLogic$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
