package com.tencent.mm.ui.blur.mask;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/blur/mask/BlurMaskBackgroundView;", "Lcom/tencent/mm/ui/blur/mask/AbstractBlurMaskBackgroundView;", "Landroid/graphics/RenderNode;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class BlurMaskBackgroundView extends com.tencent.mm.ui.blur.mask.AbstractBlurMaskBackgroundView<android.graphics.RenderNode> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurMaskBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.blur.mask.AbstractBlurMaskBackgroundView
    public void b() {
        if (getRenderCache() != null || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        setRenderCache(new android.graphics.RenderNode("BlurMaskBackground"));
    }

    @Override // com.tencent.mm.ui.blur.mask.AbstractBlurMaskBackgroundView
    public void c() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.graphics.RenderNode renderCache = getRenderCache();
            if (renderCache != null) {
                renderCache.discardDisplayList();
            }
            setRenderCache(null);
        }
    }

    @Override // com.tencent.mm.ui.blur.mask.AbstractBlurMaskBackgroundView
    public void d(android.graphics.Canvas canvas, yz5.l drawOrigin) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(drawOrigin, "drawOrigin");
        if (!this.isCacheEnabled || !canvas.isHardwareAccelerated() || android.os.Build.VERSION.SDK_INT < 31) {
            drawOrigin.invoke(canvas);
            return;
        }
        if (getRenderCache() == null) {
            setRenderCache(new android.graphics.RenderNode("BlurMaskBackground"));
        }
        android.graphics.RenderNode renderCache = getRenderCache();
        kotlin.jvm.internal.o.d(renderCache);
        android.graphics.RenderNode renderNode = renderCache;
        jb5.h viewPosition = getViewPosition();
        renderNode.setPosition(0, 0, viewPosition.f298867c, viewPosition.f298868d);
        android.graphics.RecordingCanvas beginRecording = renderNode.beginRecording();
        kotlin.jvm.internal.o.f(beginRecording, "beginRecording(...)");
        drawOrigin.invoke(beginRecording);
        renderNode.endRecording();
        canvas.drawRenderNode(renderNode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurMaskBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BlurMaskBackgroundView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.blur.mask.BlurMaskBackgroundView.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
    }
}
