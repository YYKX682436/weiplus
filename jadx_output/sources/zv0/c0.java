package zv0;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f476163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(zv0.f0 f0Var) {
        super(2);
        this.f476163d = f0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        zv0.r data = (zv0.r) obj2;
        kotlin.jvm.internal.o.g(data, "data");
        zv0.f0.K(this.f476163d, intValue, data);
        return jz5.f0.f302826a;
    }
}
