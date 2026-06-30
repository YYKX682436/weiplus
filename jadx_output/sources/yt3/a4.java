package yt3;

/* loaded from: classes10.dex */
public final class a4 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f465345d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465346e;

    /* renamed from: f, reason: collision with root package name */
    public yt3.c f465347f;

    /* renamed from: g, reason: collision with root package name */
    public float f465348g;

    public a4(com.tencent.mm.ui.widget.imageview.WeImageView view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465345d = view;
        this.f465346e = status;
        this.f465347f = yt3.c.f465374e;
        view.s(com.tencent.mm.R.raw.icons_filled_camera_flash_off, com.tencent.mm.R.color.BW_100_Alpha_0_9);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchFlashPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordSwitchFlashPlugin", "onClick >> " + this.f465347f);
        yt3.c cVar = this.f465347f;
        yt3.c cVar2 = yt3.c.f465374e;
        if (cVar == cVar2) {
            cVar2 = yt3.c.f465373d;
        }
        this.f465347f = cVar2;
        yt3.c cVar3 = yt3.c.f465373d;
        this.f465345d.s(cVar2 == cVar3 ? com.tencent.mm.R.raw.icons_filled_camera_flash_on : com.tencent.mm.R.raw.icons_filled_camera_flash_off, com.tencent.mm.R.color.BW_100_Alpha_0_9);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", this.f465347f == cVar3);
        this.f465346e.w(ju3.c0.f301877g, bundle);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setClickFlashLightCount >> ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = nu3.f.f340211b;
        sb6.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f55519o : null);
        sb6.append(", ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = nu3.f.f340211b;
        sb6.append(cameraActionsLogStruct2 != null ? java.lang.Long.valueOf(cameraActionsLogStruct2.f55517m) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct3 = nu3.f.f340211b;
        if (cameraActionsLogStruct3 != null) {
            cameraActionsLogStruct3.f55517m++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchFlashPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465345d.setVisibility(i17);
    }
}
