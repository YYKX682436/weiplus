package du0;

/* loaded from: classes5.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev0.c f243366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f243367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ev0.c cVar, du0.p1 p1Var) {
        super(1);
        this.f243366d = cVar;
        this.f243367e = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i(this.f243366d.f256838p, "[bindVolumeAdjustChannel] bgmVolume=" + intValue);
        this.f243367e.W6(((float) intValue) / ((float) 200));
        return jz5.f0.f302826a;
    }
}
