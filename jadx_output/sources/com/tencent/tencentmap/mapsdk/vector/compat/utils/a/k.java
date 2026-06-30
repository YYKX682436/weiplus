package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes5.dex */
public class k extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f215405a;

    public k(android.content.Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        int i17 = this.f215405a;
        if (i17 == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i17 == 1) {
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, getWidth() / 2);
        } else if (i17 == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
        } else {
            canvas.translate(0.0f, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, (-getWidth()) / 2);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f215405a;
        if (i19 != 1 && i19 != 3) {
            super.onMeasure(i17, i18);
        } else {
            super.onMeasure(i17, i18);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void setViewRotation(int i17) {
        this.f215405a = ((i17 + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 90;
    }
}
