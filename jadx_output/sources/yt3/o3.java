package yt3;

/* loaded from: classes3.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.r3 f465573d;

    public o3(yt3.r3 r3Var) {
        this.f465573d = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yt3.r3 r3Var = this.f465573d;
        r3Var.f465629g.setVisibility(4);
        android.view.View view = r3Var.f465630h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$showPermissionAfterHint$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$showPermissionAfterHint$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
