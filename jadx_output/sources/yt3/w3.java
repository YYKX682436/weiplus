package yt3;

/* loaded from: classes10.dex */
public final class w3 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f465708d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView f465709e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView f465710f;

    /* renamed from: g, reason: collision with root package name */
    public long f465711g;

    public w3(android.view.View view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465708d = view;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.b6q);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView cameraFrontSightView = (com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView) findViewById;
        this.f465709e = cameraFrontSightView;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.b6u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView mMSightCaptureTouchView = (com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView) findViewById2;
        this.f465710f = mMSightCaptureTouchView;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f465711g = android.os.SystemClock.elapsedRealtime();
        int b17 = i65.a.b(view.getContext(), 120);
        cameraFrontSightView.b(b17, b17);
        mMSightCaptureTouchView.setTouchCallback(new yt3.v3(this, status));
    }
}
