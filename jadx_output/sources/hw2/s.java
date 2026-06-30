package hw2;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os5.p f285551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw2.t f285552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ os5.o f285553f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(os5.p pVar, hw2.t tVar, os5.o oVar) {
        super(0);
        this.f285551d = pVar;
        this.f285552e = tVar;
        this.f285553f = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hw2.h hVar = hw2.t.f285554v;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#detailsView.onRequestReset suit=");
        os5.p pVar = this.f285551d;
        sb6.append(pVar != null ? java.lang.Integer.valueOf(pVar.getSuit()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderRecordBeautifyPlugin", sb6.toString());
        hw2.t tVar = this.f285552e;
        for (qs5.c cVar : (java.lang.Iterable) ((jz5.n) tVar.f285572t).getValue()) {
            tVar.b().remove(tVar.d(tVar.f285569q, cVar.f366423a));
            int i17 = tVar.f285569q;
            int i18 = cVar.f366423a;
            tVar.g(i18, tVar.c(i17, i18));
        }
        os5.o oVar = this.f285553f;
        if (oVar != null) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = (com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView) oVar;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#reload");
            finderLiveCameraOptBeautyPowerfulDetailsView.setSelectedEffect(finderLiveCameraOptBeautyPowerfulDetailsView.getSelectedEffect());
        }
        tVar.f();
        return jz5.f0.f302826a;
    }
}
