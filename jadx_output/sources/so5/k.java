package so5;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so5.m f410855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uo5.q f410856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(so5.m mVar, uo5.q qVar) {
        super(1);
        this.f410855d = mVar;
        this.f410856e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        to5.a aVar = (to5.a) this.f410855d.f410883p.remove(java.lang.Long.valueOf(longValue / 1000));
        int i17 = 0;
        uo5.q qVar = this.f410856e;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIP.DecoderManager", "getFrameInfo: get info for frame idx " + longValue + " error");
            uo5.l lVar = (uo5.l) qVar;
            return new so5.b(lVar.f429733j, lVar.f429734k, 270, false);
        }
        uo5.l lVar2 = (uo5.l) qVar;
        android.util.Size size = lVar2.f429734k;
        android.util.Size size2 = lVar2.f429733j;
        int i18 = aVar.f420998g;
        if (i18 == 2) {
            i17 = 90;
        } else if (i18 == 3) {
            i17 = 180;
        } else if (i18 == 4) {
            i17 = 270;
        }
        return new so5.b(size2, size, i17, aVar.f420999h);
    }
}
