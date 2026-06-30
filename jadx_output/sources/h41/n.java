package h41;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.x f278830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h41.x xVar) {
        super(2);
        this.f278830d = xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String text = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.wechat.aff.ovc.a aVar = this.f278830d.f278884a;
        if (aVar != null) {
            aVar.J1(text, intValue);
        }
        return jz5.f0.f302826a;
    }
}
