package hw2;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.t f285549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hw2.t tVar) {
        super(2);
        this.f285549d = tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        hw2.h hVar = hw2.t.f285554v;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderRecordBeautifyPlugin", "onSeekChanging key=" + intValue + " seek=" + intValue2);
        hw2.t tVar = this.f285549d;
        tVar.g(intValue, intValue2);
        tVar.f();
        tVar.b().putInt(tVar.d(tVar.f285569q, intValue), intValue2);
        if (intValue2 == tVar.c(tVar.f285569q, intValue)) {
            tVar.f285573u.vibrate(10L);
        }
        return jz5.f0.f302826a;
    }
}
