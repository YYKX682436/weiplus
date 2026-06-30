package yt3;

/* loaded from: classes10.dex */
public final class m3 implements com.tencent.mm.plugin.mmsight.ui.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.r3 f465539a;

    public m3(yt3.r3 r3Var) {
        this.f465539a = r3Var;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.h0
    public void a() {
        yt3.r3 r3Var = this.f465539a;
        r3Var.f465639t = true;
        r3Var.getClass();
        r3Var.w();
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.h0
    public void b() {
        yt3.r3 r3Var = this.f465539a;
        java.util.concurrent.Future future = r3Var.f465643x;
        if (future != null) {
            future.cancel(false);
        }
        android.view.View view = r3Var.f465630h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$setEnableType$2", "onPressDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$setEnableType$2", "onPressDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int[] iArr = new int[2];
        r3Var.f465628f.getLocationOnScreen(iArr);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_LOCATION_INT", iArr[1]);
        r3Var.f465627e.w(ju3.c0.f301871d, bundle);
        r3Var.f465629g.animate().alpha(0.0f).withEndAction(new yt3.l3(r3Var)).start();
        nu3.i iVar = nu3.i.f340218a;
        iVar.d(2);
        iVar.b(2);
        nu3.i.f340224g.f60949i = 1L;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.h0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButtonPlugin", "onLongPressFinish");
        yt3.r3 r3Var = this.f465539a;
        if (r3Var.f465639t) {
            r3Var.f465639t = false;
            ju3.d0.k(r3Var.f465627e, ju3.c0.f301919z, null, 2, null);
        } else {
            r3Var.n(false);
        }
        dx1.g.f244489a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f36310e);
    }
}
