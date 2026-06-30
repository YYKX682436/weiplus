package th5;

/* loaded from: classes12.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.w f419456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th5.o f419457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(th5.w wVar, th5.o oVar) {
        super(1);
        this.f419456d = wVar;
        this.f419457e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lg3.a aVar;
        float floatValue = ((java.lang.Number) obj).floatValue();
        th5.o oVar = this.f419457e;
        th5.w wVar = this.f419456d;
        if (floatValue >= 1.0f) {
            lg3.a aVar2 = wVar.f419472w;
            if (aVar2 != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(oVar, new vf3.f(vf3.e.f436381h, null, 0, 0.0f, 14, null));
            }
            wVar.g0();
        } else if (floatValue > 0.0f || oVar.f419421f != mf3.w.f326128d) {
            lg3.a aVar3 = wVar.f419472w;
            if (aVar3 != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar3).h(oVar, new vf3.f(vf3.e.f436380g, null, 0, floatValue, 6, null));
            }
        } else {
            lg3.a aVar4 = wVar.f419472w;
            if (aVar4 != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar4).h(oVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
            }
            long j17 = oVar.f419343b;
            if (j17 > 0 && (aVar = wVar.f419472w) != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).g(new vf3.b(0L, j17, 0L, 0L, 0L, false, 61, null));
            }
            wVar.g0();
        }
        return jz5.f0.f302826a;
    }
}
