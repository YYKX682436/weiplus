package ku3;

/* loaded from: classes3.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m4 f312261d;

    public i4(ku3.m4 m4Var) {
        this.f312261d = m4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View a17 = this.f312261d.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuFilterPlugin$initLogic$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuFilterPlugin$initLogic$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
