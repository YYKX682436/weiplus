package com.tencent.mm.plugin.voip.video.camera.prev;

/* loaded from: classes14.dex */
public class CaptureView extends com.tencent.mm.plugin.video.ObservableSurfaceView {
    public CaptureView(android.content.Context context) {
        super(context);
        a();
    }

    private void a() {
        wo.e eVar = wo.v1.f447822b;
        if ((eVar.f447659d && eVar.f447658c == 8) ? false : true) {
            setNeedSetType(true);
        }
    }

    public CaptureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public CaptureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
