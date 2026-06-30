package yx2;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView f467871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView snsFinderImageBackView) {
        super(0);
        this.f467871d = snsFinderImageBackView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView thumbView;
        thumbView = this.f467871d.getThumbView();
        thumbView.setVisibility(0);
        return jz5.f0.f302826a;
    }
}
