package hw2;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os5.o f285543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw2.t f285544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(os5.o oVar, hw2.t tVar) {
        super(1);
        this.f285543d = oVar;
        this.f285544e = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        os5.o oVar = this.f285543d;
        if (oVar != null) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = (com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView) oVar;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#reload");
            finderLiveCameraOptBeautyPowerfulDetailsView.setSelectedEffect(finderLiveCameraOptBeautyPowerfulDetailsView.getSelectedEffect());
        }
        hw2.t tVar = this.f285544e;
        tVar.f285569q = intValue;
        tVar.b().putInt("beauty_suit", tVar.f285569q);
        java.util.Iterator it = ((java.lang.Iterable) ((jz5.n) tVar.f285572t).getValue()).iterator();
        while (it.hasNext()) {
            int i17 = ((qs5.c) it.next()).f366423a;
            tVar.g(i17, tVar.a(tVar.f285569q, i17));
        }
        tVar.f();
        return jz5.f0.f302826a;
    }
}
