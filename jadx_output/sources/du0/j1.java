package du0;

/* loaded from: classes5.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev0.c f243370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f243371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ev0.c cVar, du0.p1 p1Var) {
        super(1);
        this.f243370d = cVar;
        this.f243371e = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i(this.f243370d.f256838p, "[bindVolumeAdjustChannel] originVolume=" + intValue);
        this.f243371e.X6(((float) intValue) / ((float) 200));
        return jz5.f0.f302826a;
    }
}
