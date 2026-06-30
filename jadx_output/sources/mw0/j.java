package mw0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView f331685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView replaceStyleView) {
        super(2);
        this.f331685d = replaceStyleView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        kw0.a data = (kw0.a) obj2;
        kotlin.jvm.internal.o.g(data, "data");
        mw0.h hVar = this.f331685d.selectedStickerStyleCallback;
        if (hVar != null) {
            hVar.e3(data);
        }
        return jz5.f0.f302826a;
    }
}
