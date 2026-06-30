package h41;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.x f278850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h41.x xVar) {
        super(1);
        this.f278850d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.wechat.aff.ovc.a aVar = this.f278850d.f278884a;
        if (aVar != null) {
            aVar.x0(longValue);
        }
        return jz5.f0.f302826a;
    }
}
