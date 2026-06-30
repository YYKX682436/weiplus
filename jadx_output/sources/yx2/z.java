package yx2;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview f467886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
        super(1);
        this.f467886d = snsFinderVideoBackPreview;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView thumbView;
        thumbView = this.f467886d.getThumbView();
        thumbView.setImageBitmap((android.graphics.Bitmap) obj);
        return jz5.f0.f302826a;
    }
}
