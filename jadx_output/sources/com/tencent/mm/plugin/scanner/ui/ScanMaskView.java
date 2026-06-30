package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes2.dex */
public class ScanMaskView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f159342d;

    public ScanMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Path();
        this.f159342d = 300;
    }

    public int getMaskAnimDuration() {
        return this.f159342d;
    }

    public android.graphics.Rect getMaskRect() {
        return null;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
    }

    public void setMaskAnimaListener(com.tencent.mm.plugin.scanner.ui.m1 m1Var) {
    }

    public void setMaskColorRsid(int i17) {
    }

    public void setMastAnimaDuration(int i17) {
        this.f159342d = i17;
    }
}
