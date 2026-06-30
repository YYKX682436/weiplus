package it3;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI) {
        super(4);
        this.f294566d = finderRedPacketCoverEditUI;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.MotionEvent e27 = (android.view.MotionEvent) obj2;
        float floatValue = ((java.lang.Number) obj3).floatValue();
        float floatValue2 = ((java.lang.Number) obj4).floatValue();
        kotlin.jvm.internal.o.g(e27, "e2");
        it3.a aVar = this.f294566d.f155618m;
        if (aVar != null) {
            float f17 = -floatValue;
            float f18 = -floatValue2;
            vh3.b renderView = aVar.getRenderView();
            com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender mMTextureViewRender = renderView instanceof com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender ? (com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender) renderView : null;
            if (mMTextureViewRender != null) {
                android.graphics.Matrix transform = mMTextureViewRender.getTransform(null);
                kotlin.jvm.internal.o.f(transform, "getTransform(...)");
                vh3.b renderView2 = aVar.getRenderView();
                kotlin.jvm.internal.o.e(renderView2, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
                float width = ((com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender) renderView2).getWidth();
                vh3.b renderView3 = aVar.getRenderView();
                kotlin.jvm.internal.o.e(renderView3, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
                float height = ((com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender) renderView3).getHeight();
                android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width, height);
                transform.mapRect(rectF);
                float f19 = rectF.left;
                if (f19 + f17 > 0.0f) {
                    f17 = -f19;
                } else {
                    float f27 = rectF.right;
                    if (f27 + f17 < width) {
                        f17 = width - f27;
                    }
                }
                float f28 = rectF.top;
                if (f28 + f18 > 0.0f) {
                    f18 = -f28;
                } else {
                    float f29 = rectF.bottom;
                    if (f29 + f18 < height) {
                        f18 = height - f29;
                    }
                }
                transform.postTranslate(f17, f18);
                mMTextureViewRender.setTransform(transform);
            }
        }
        return jz5.f0.f302826a;
    }
}
