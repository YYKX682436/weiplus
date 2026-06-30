package ex0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.o f257147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f257148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ex0.o oVar, com.tencent.maas.model.time.MJTimeRange mJTimeRange) {
        super(1);
        this.f257147d = oVar;
        this.f257148e = mJTimeRange;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float[] decibels = (float[]) obj;
        kotlin.jvm.internal.o.g(decibels, "decibels");
        ex0.o oVar = this.f257147d;
        oVar.f257157t = this.f257148e;
        oVar.f257156s = by0.w.a(decibels, 0.0f, 0.714f, 1, null);
        return jz5.f0.f302826a;
    }
}
