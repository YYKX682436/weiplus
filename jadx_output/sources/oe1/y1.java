package oe1;

/* loaded from: classes12.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe1.e1 f344756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(oe1.e1 e1Var) {
        super(3);
        this.f344756d = e1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        int intValue = ((java.lang.Number) obj).intValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        long longValue2 = ((java.lang.Number) obj3).longValue();
        com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.i iVar = (com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.i) this.f344756d;
        iVar.getClass();
        java.util.Map k17 = kz5.c1.k(new jz5.l("totalSize", java.lang.Long.valueOf(longValue2)), new jz5.l("finishedSize", java.lang.Long.valueOf(longValue)), new jz5.l("result", java.lang.Integer.valueOf(intValue)));
        if (intValue >= 0) {
            str = "ok";
        } else {
            str = "fail:preDownload complete with result:" + intValue;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) iVar.f83623a.get();
        if (lVar != null) {
            lVar.a(iVar.f83624b, iVar.f83625c.p(str, k17));
        }
        return jz5.f0.f302826a;
    }
}
