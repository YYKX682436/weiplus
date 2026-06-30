package ia2;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f289984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlinx.coroutines.q qVar) {
        super(1);
        this.f289984d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(value);
        kotlinx.coroutines.q qVar = this.f289984d;
        if (m528isSuccessimpl) {
            if ((kotlin.Result.m527isFailureimpl(value) ? null : value) != null) {
                if (kotlin.Result.m527isFailureimpl(value)) {
                    value = null;
                }
                kotlin.jvm.internal.o.d(value);
                com.tencent.pigeon.mm_foundation.MMUserLocationInfo mMUserLocationInfo = (com.tencent.pigeon.mm_foundation.MMUserLocationInfo) value;
                com.tencent.mm.plugin.location.model.LocationInfo locationInfo = new com.tencent.mm.plugin.location.model.LocationInfo();
                locationInfo.f144587f = mMUserLocationInfo.getLongitude();
                locationInfo.f144586e = mMUserLocationInfo.getLatitude();
                ((kotlinx.coroutines.r) qVar).s(locationInfo, ia2.x.f289982d);
                return jz5.f0.f302826a;
            }
        }
        ((kotlinx.coroutines.r) qVar).s(null, ia2.y.f289983d);
        return jz5.f0.f302826a;
    }
}
