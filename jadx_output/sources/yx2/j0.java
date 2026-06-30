package yx2;

/* loaded from: classes14.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview f467859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
        super(0);
        this.f467859d = snsFinderVideoBackPreview;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView thumbView;
        thumbView = this.f467859d.getThumbView();
        thumbView.setVisibility(0);
        return jz5.f0.f302826a;
    }
}
