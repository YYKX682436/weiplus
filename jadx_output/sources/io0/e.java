package io0;

/* loaded from: classes3.dex */
public final class e extends com.tencent.mm.ui.widget.RoundCornerRelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    public android.view.TextureView f293449f;

    /* renamed from: g, reason: collision with root package name */
    public final int f293450g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.TextureView textureView = new android.view.TextureView(context);
        this.f293449f = textureView;
        this.f293450g = -1;
        addView(textureView, new android.view.ViewGroup.LayoutParams(-1, -1));
        int hashCode = this.f293449f.hashCode();
        this.f293450g = hashCode;
        com.tencent.mars.xlog.Log.i("TRTCVideoRatioLayout", "init add cameraView:" + hashCode);
    }

    public final void d(boolean z17) {
        removeView(this.f293449f);
        if (this.f293449f.getParent() == null) {
            if (z17) {
                removeAllViews();
            }
            addView(this.f293449f, new android.view.ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.tencent.mars.xlog.Log.e("TRTCVideoRatioLayout", "refreshView fail,camera view have attach to " + this.f293449f.getParent());
        fn0.g gVar = fn0.g.f264195a;
        hn0.g gVar2 = fn0.g.f264196b;
        if (gVar2 != null) {
            ((vd2.l5) gVar2).wi("liveAnchorRefreshCameraFail", false);
        }
    }

    public final android.view.TextureView getCameraView() {
        return this.f293449f;
    }

    public final void setCameraView(android.view.TextureView cameraView) {
        kotlin.jvm.internal.o.g(cameraView, "cameraView");
        if (cameraView.getParent() != null) {
            android.view.ViewParent parent = cameraView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(cameraView);
            }
        }
        addView(cameraView, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f293449f = cameraView;
        com.tencent.mars.xlog.Log.i("TRTCVideoRatioLayout", "setCameraView cameraView:" + cameraView.hashCode());
        if (cameraView.hashCode() != this.f293450g) {
            fn0.g gVar = fn0.g.f264195a;
            hn0.g gVar2 = fn0.g.f264196b;
            if (gVar2 != null) {
                ((vd2.l5) gVar2).wi("liveSetAnchorCameraError", false);
            }
        }
    }
}
