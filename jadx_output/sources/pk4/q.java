package pk4;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout f356518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout) {
        super(1);
        this.f356518d = mMTPVideoLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).longValue();
        int i17 = com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout.f174542p;
        com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout = this.f356518d;
        com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView textureView = mMTPVideoLayout.getTextureView();
        if (textureView != null) {
            textureView.setAlpha(1.0f);
        }
        yz5.l onFrameAvailable = mMTPVideoLayout.getOnFrameAvailable();
        if (onFrameAvailable != null) {
            onFrameAvailable.invoke(mMTPVideoLayout.f174547h);
        }
        return jz5.f0.f302826a;
    }
}
