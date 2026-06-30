package yt3;

/* loaded from: classes3.dex */
public final class e extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f465413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ju3.d0 status, java.lang.String str) {
        super(status, str);
        kotlin.jvm.internal.o.g(status, "status");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.View view = this.f465413f;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/ClickRegisterPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/ClickRegisterPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void z(int i17, ju3.c0 event) {
        kotlin.jvm.internal.o.g(event, "event");
        android.view.View y17 = y(i17);
        this.f465413f = y17;
        y17.setOnClickListener(new yt3.d(this, event));
    }
}
