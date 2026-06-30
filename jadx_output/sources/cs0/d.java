package cs0;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView f222039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView) {
        super(0);
        this.f222039d = cameraFocusAndMeteringView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f222039d;
        java.lang.Object obj = cameraFocusAndMeteringView.f68885h;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$resetFocusView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$resetFocusView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        cs0.i iVar = cameraFocusAndMeteringView.f68885h;
        if (iVar != null) {
            iVar.reset();
        }
        kotlinx.coroutines.r2 r2Var = cameraFocusAndMeteringView.f68897w;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        cameraFocusAndMeteringView.f68897w = null;
        cameraFocusAndMeteringView.f68893s = false;
        cameraFocusAndMeteringView.f68892r = cameraFocusAndMeteringView.f68891q;
        cameraFocusAndMeteringView.f68889o = 0.0f;
        cameraFocusAndMeteringView.f68888n = 0.0f;
        cameraFocusAndMeteringView.f68894t = true;
        return jz5.f0.f302826a;
    }
}
