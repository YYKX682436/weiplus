package mx0;

/* loaded from: classes5.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.k3 f331988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f331989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(mx0.k3 k3Var, mx0.q2 q2Var) {
        super(1);
        this.f331988d = k3Var;
        this.f331989e = q2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i(this.f331988d.f332095p, "[bindVolumeAdjustChannel] bgmVolume=" + intValue);
        yx0.b8 b8Var = this.f331989e.f332236g;
        kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.n5(b8Var, ((float) intValue) / ((float) 200), null), 3, null);
        return jz5.f0.f302826a;
    }
}
