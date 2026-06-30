package qx5;

/* loaded from: classes11.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx5.y f367490d;

    public f0(qx5.y yVar) {
        this.f367490d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        qx5.y yVar = this.f367490d;
        android.view.View view2 = yVar.f367541g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/xweb/debug/XWebDebugView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/xweb/debug/XWebDebugView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        qx5.k kVar = yVar.f367538d;
        if (kVar != null) {
            ((qx5.n) kVar).f367505a.finish();
        }
    }
}
