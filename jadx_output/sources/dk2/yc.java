package dk2;

/* loaded from: classes3.dex */
public final class yc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f234389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(long j17) {
        super(0);
        this.f234389d = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId:");
        sb6.append(this.f234389d);
        sb6.append(", looperIsFinished:");
        dk2.xg xgVar = dk2.ef.f233393k0;
        sb6.append(xgVar != null ? java.lang.Boolean.valueOf(xgVar.f234358b) : null);
        return sb6.toString();
    }
}
