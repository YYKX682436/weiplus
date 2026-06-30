package zv;

/* loaded from: classes8.dex */
public final class v2 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i11.e f476120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476121e;

    public v2(i11.e eVar, yz5.l lVar) {
        this.f476120d = eVar;
        this.f476121e = lVar;
    }

    @Override // i11.c
    public final boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        yz5.l lVar = this.f476121e;
        if (!z17) {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
            return false;
        }
        long d27 = ((i11.h) this.f476120d).d();
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.brand_service.BSPOIInfo(java.lang.Double.valueOf(f18), java.lang.Double.valueOf(f17), d27 > 0 ? java.lang.Double.valueOf(d27 / 1000.0d) : null))));
        return false;
    }
}
