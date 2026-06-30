package dk2;

/* loaded from: classes3.dex */
public final class wc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f234287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(long j17) {
        super(0);
        this.f234287d = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId:");
        sb6.append(this.f234287d);
        sb6.append(", looperIsFinished:");
        dk2.xg xgVar = dk2.ef.f233391j0;
        sb6.append(xgVar != null ? java.lang.Boolean.valueOf(xgVar.f234358b) : null);
        return sb6.toString();
    }
}
