package it3;

/* loaded from: classes10.dex */
public final class a extends com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f294547t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.p f294548u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.l f294549v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final r45.bb4 getLocalCropRectModel() {
        vh3.b renderView = getRenderView();
        com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender mMTextureViewRender = renderView instanceof com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender ? (com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender) renderView : null;
        if (mMTextureViewRender == null) {
            return null;
        }
        android.graphics.Matrix transform = mMTextureViewRender.getTransform(null);
        kotlin.jvm.internal.o.f(transform, "getTransform(...)");
        vh3.b renderView2 = getRenderView();
        kotlin.jvm.internal.o.e(renderView2, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
        float width = ((com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender) renderView2).getWidth();
        vh3.b renderView3 = getRenderView();
        kotlin.jvm.internal.o.e(renderView3, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
        float height = ((com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender) renderView3).getHeight();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width, height);
        transform.mapRect(rectF);
        r45.bb4 bb4Var = new r45.bb4();
        bb4Var.set(0, java.lang.Float.valueOf(java.lang.Math.abs(rectF.top) / rectF.height()));
        bb4Var.set(1, java.lang.Float.valueOf(java.lang.Math.abs(rectF.left) / rectF.width()));
        bb4Var.set(2, java.lang.Float.valueOf(width / rectF.width()));
        bb4Var.set(3, java.lang.Float.valueOf(height / rectF.height()));
        return bb4Var;
    }

    public final yz5.l getOnPreparedListener() {
        return this.f294549v;
    }

    public final yz5.p getOnProgressChange() {
        return this.f294548u;
    }

    public final yz5.p getOnVideoSizeChange() {
        return this.f294547t;
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void k(rh3.o mp6, rh3.s mediaInfo) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        super.k(mp6, mediaInfo);
        yz5.l lVar = this.f294549v;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(mp6.getDurationMs()));
        }
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void l(rh3.o mp6, long j17, long j18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        yz5.p pVar = this.f294548u;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void n(int i17, int i18) {
        yz5.p pVar = this.f294547t;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    public final void setOnPreparedListener(yz5.l lVar) {
        this.f294549v = lVar;
    }

    public final void setOnProgressChange(yz5.p pVar) {
        this.f294548u = pVar;
    }

    public final void setOnVideoSizeChange(yz5.p pVar) {
        this.f294547t = pVar;
    }

    public final void u(long j17, long j18) {
        java.lang.Object m17 = getPlayer().m();
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type com.tencent.thumbplayer.tplayer.TPPlayer");
        ((com.tencent.thumbplayer.tplayer.TPPlayer) m17).setLoopback(true, j17, j18);
    }
}
