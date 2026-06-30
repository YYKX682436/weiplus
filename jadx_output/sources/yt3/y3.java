package yt3;

/* loaded from: classes10.dex */
public final class y3 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f465727d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465728e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f465729f;

    /* renamed from: g, reason: collision with root package name */
    public float f465730g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f465731h;

    public y3(android.widget.ImageView view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465727d = view;
        this.f465728e = status;
        this.f465729f = true;
        view.setOnClickListener(this);
        view.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_camera_switch, -1));
    }

    public final void a(boolean z17) {
        android.widget.ImageView imageView = this.f465727d;
        if (z17) {
            imageView.setContentDescription(imageView.getContext().getString(com.tencent.mm.R.string.hud));
        } else {
            imageView.setContentDescription(imageView.getContext().getString(com.tencent.mm.R.string.hue));
        }
        this.f465731h = z17;
    }

    public final void b(float f17) {
        if (this.f465729f) {
            if ((this.f465730g == f17) || !com.tencent.mm.app.w.INSTANCE.f53889n) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordSwitchCameraPlugin", "updateOrientation " + f17 + "  " + this.f465727d.getRotation());
            this.f465730g = f17;
            this.f465727d.animate().cancel();
            this.f465727d.animate().rotation(f17).setDuration(100L).start();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchCameraPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordSwitchCameraPlugin", "RecordSwitchCameraPlugin switch " + this.f465731h);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", this.f465731h);
        this.f465728e.w(ju3.c0.f301875f, bundle);
        nu3.i iVar = nu3.i.f340218a;
        iVar.d(1);
        iVar.b(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSwitchCameraByButtonCount >> ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = nu3.f.f340211b;
        sb6.append(cameraActionsLogStruct != null ? java.lang.Long.valueOf(cameraActionsLogStruct.f55515k) : null);
        sb6.append(", ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = nu3.f.f340211b;
        sb6.append(cameraActionsLogStruct2 != null ? cameraActionsLogStruct2.f55519o : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct3 = nu3.f.f340211b;
        if (cameraActionsLogStruct3 != null) {
            cameraActionsLogStruct3.f55515k++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchCameraPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordSwitchCameraPlugin", "onPause");
        this.f465729f = false;
    }

    @Override // yt3.r2
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordSwitchCameraPlugin", "onResume");
        this.f465729f = true;
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordSwitchCameraPlugin", "release");
        this.f465729f = false;
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465727d.setVisibility(i17);
    }
}
