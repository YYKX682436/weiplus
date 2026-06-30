package yj3;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj3.g f462673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yj3.g gVar) {
        super(3);
        this.f462673d = gVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.nio.ByteBuffer data = (java.nio.ByteBuffer) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(data, "data");
        data.position(0);
        yz5.q qVar = this.f462673d.f462682h;
        if (qVar != null) {
            qVar.invoke(data, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
        }
        return jz5.f0.f302826a;
    }
}
