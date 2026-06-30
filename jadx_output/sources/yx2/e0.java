package yx2;

/* loaded from: classes14.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview f467841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
        super(1);
        this.f467841d = snsFinderVideoBackPreview;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView thumbView;
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout;
        java.lang.String str;
        com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview = this.f467841d;
        thumbView = snsFinderVideoBackPreview.getThumbView();
        thumbView.setVisibility(0);
        mMTPEffectVideoLayout = snsFinderVideoBackPreview.playView;
        if (mMTPEffectVideoLayout != null) {
            mMTPEffectVideoLayout.setOnFirstFrameAvailable(new yx2.d0(snsFinderVideoBackPreview));
        }
        str = snsFinderVideoBackPreview.TAG;
        com.tencent.mars.xlog.Log.i(str, "onSurfaceDestroyListener");
        return jz5.f0.f302826a;
    }
}
