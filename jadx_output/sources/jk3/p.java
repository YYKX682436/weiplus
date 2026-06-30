package jk3;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300101d;

    public p(jk3.v vVar) {
        this.f300101d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk3.v vVar = this.f300101d;
        ak3.c cVar = vVar.f300111d;
        if (cVar != null) {
            if ((cVar != null ? cVar.getContentView() : null) != null) {
                ak3.c cVar2 = vVar.f300111d;
                android.view.View contentView = cVar2 != null ? cVar2.getContentView() : null;
                if (contentView == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/helper/PageMultiTaskHelper$finishPage$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(contentView, "com/tencent/mm/plugin/multitask/helper/PageMultiTaskHelper$finishPage$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
