package yx2;

/* loaded from: classes15.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview f467878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
        super(1);
        this.f467878d = snsFinderVideoBackPreview;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverNoFadeImageView foldThumbView;
        android.graphics.Bitmap it = (android.graphics.Bitmap) obj;
        kotlin.jvm.internal.o.g(it, "it");
        foldThumbView = this.f467878d.getFoldThumbView();
        foldThumbView.setImageBitmap(it);
        return jz5.f0.f302826a;
    }
}
