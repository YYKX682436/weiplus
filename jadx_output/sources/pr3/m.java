package pr3;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f357982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr3.c f357983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMGridLayout f357984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(float f17, pr3.c cVar, com.tencent.mm.ui.base.MMGridLayout mMGridLayout) {
        super(3);
        this.f357982d = f17;
        this.f357983e = cVar;
        this.f357984f = mMGridLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.ui.widget.MMRoundCornerImageView imageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) obj2;
        java.lang.String str = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        com.tencent.mars.xlog.Log.i("MicroMsg.InfoItemConvert", "imageView: " + imageView + ", path: " + str);
        imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.j.a(str, this.f357982d));
        imageView.setVisibility(0);
        imageView.setOnClickListener(new pr3.l(this.f357983e, this.f357984f, intValue));
        return jz5.f0.f302826a;
    }
}
