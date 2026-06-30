package h41;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.x f278827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h41.x xVar) {
        super(3);
        this.f278827d = xVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String content = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.wechat.aff.ovc.a aVar = this.f278827d.f278884a;
        if (aVar != null) {
            aVar.S0(content, booleanValue, booleanValue2);
        }
        return jz5.f0.f302826a;
    }
}
