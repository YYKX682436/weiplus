package mx0;

/* loaded from: classes5.dex */
public abstract class a implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f331814d;

    /* renamed from: e, reason: collision with root package name */
    public volatile float f331815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f331816f;

    public a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f331814d = view;
        this.f331816f = true;
    }

    public void a(float f17) {
        if (this.f331816f) {
            if ((this.f331815e == f17) || !com.tencent.mm.app.w.INSTANCE.f53889n) {
                return;
            }
            this.f331815e = f17;
            this.f331814d.animate().cancel();
            this.f331814d.animate().rotation(f17).setDuration(100L).start();
        }
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.f331816f) {
            android.view.View view = this.f331814d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/BaseVisiblePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/BaseVisiblePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
