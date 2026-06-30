package dk2;

/* loaded from: classes.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(dk2.r4 r4Var) {
        super(0);
        this.f233679d = r4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.r4 r4Var = this.f233679d;
        java.util.Iterator it = r4Var.f234011f.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            android.view.View view = (android.view.View) lVar.f302833d;
            int intValue = ((java.lang.Number) lVar.f302834e).intValue();
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant$resumeViewVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant$resumeViewVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, "resume view:" + view.getClass().getSimpleName() + " visibility:" + intValue);
        }
        r4Var.f234011f.clear();
        return jz5.f0.f302826a;
    }
}
