package md;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md.f f325675d;

    public b(md.f fVar) {
        this.f325675d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        md.f fVar = this.f325675d;
        android.view.View view = fVar.f325679d;
        if (view == null) {
            return;
        }
        kd.c.c("MicroMsg.AppBrandUIdRootFrameLayout", "hideInactivePanelView, mPanel %s", view.getClass().getSimpleName());
        for (int i17 = 0; i17 < fVar.getChildCount(); i17++) {
            android.view.View childAt = fVar.getChildAt(i17);
            if (childAt != null && childAt != fVar.f325680e && childAt != fVar.f325679d) {
                fVar.getClass();
                if (childAt != null && childAt.getVisibility() != 8) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "fast_setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "fast_setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }
}
