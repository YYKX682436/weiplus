package com.tencent.mm.ui.blur.mask;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/blur/mask/BlurMaskView;", "Lcom/tencent/mm/ui/blur/mask/AbstractBlurMaskView;", "Landroid/graphics/RenderNode;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class BlurMaskView extends com.tencent.mm.ui.blur.mask.AbstractBlurMaskView<android.graphics.RenderNode> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.blur.mask.AbstractBlurMaskView
    public void b() {
        if (getBlurRenderer() != null || android.os.Build.VERSION.SDK_INT < 31) {
            return;
        }
        setBlurRenderer(new jb5.g());
    }

    @Override // com.tencent.mm.ui.blur.mask.AbstractBlurMaskView
    public void c(android.graphics.Canvas canvas, yz5.l drawOrigin) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(drawOrigin, "drawOrigin");
        jb5.f blurRenderer = getBlurRenderer();
        kotlin.jvm.internal.o.d(blurRenderer);
        jb5.e blurBackground = getBlurBackground();
        kotlin.jvm.internal.o.d(blurBackground);
        jb5.g gVar = (jb5.g) blurRenderer;
        if (gVar.f298864a == null) {
            gVar.f298864a = new android.graphics.RenderNode("Blur");
        }
        android.graphics.RenderNode renderNode = gVar.f298864a;
        kotlin.jvm.internal.o.d(renderNode);
        java.lang.Object renderCache = blurBackground.getRenderCache();
        kotlin.jvm.internal.o.d(renderCache);
        jb5.h viewPosition = getViewPosition();
        jb5.h viewPosition2 = blurBackground.getViewPosition();
        renderNode.setPosition(0, 0, viewPosition2.f298867c, viewPosition2.f298868d);
        int i17 = viewPosition.f298865a - viewPosition2.f298865a;
        int i18 = viewPosition.f298866b - viewPosition2.f298866b;
        float f17 = -i17;
        float f18 = -i18;
        renderNode.setPivotX((viewPosition.f298867c / 2.0f) - f17);
        renderNode.setPivotY((viewPosition.f298868d / 2.0f) - f18);
        renderNode.setTranslationX(f17);
        renderNode.setTranslationY(f18);
        android.graphics.RecordingCanvas beginRecording = renderNode.beginRecording();
        kotlin.jvm.internal.o.f(beginRecording, "beginRecording(...)");
        beginRecording.drawRenderNode((android.graphics.RenderNode) renderCache);
        float blurRadius = getBlurRadius();
        android.graphics.RenderEffect createBlurEffect = android.graphics.RenderEffect.createBlurEffect(blurRadius, blurRadius, android.graphics.Shader.TileMode.CLAMP);
        kotlin.jvm.internal.o.f(createBlurEffect, "createBlurEffect(...)");
        renderNode.setRenderEffect(createBlurEffect);
        renderNode.endRecording();
        int overlayColor = getOverlayColor();
        canvas.drawRenderNode(renderNode);
        if (overlayColor != 0) {
            canvas.drawColor(overlayColor);
        }
        drawOrigin.invoke(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurMaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BlurMaskView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r1 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            java.lang.String r6 = "context"
            kotlin.jvm.internal.o.g(r2, r6)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.blur.mask.BlurMaskView.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
    }
}
