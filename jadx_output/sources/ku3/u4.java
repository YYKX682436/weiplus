package ku3;

/* loaded from: classes3.dex */
public final class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i5 f312425d;

    public u4(ku3.i5 i5Var) {
        this.f312425d = i5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View b17 = this.f312425d.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuRatioPlugin$initLogic$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuRatioPlugin$initLogic$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
