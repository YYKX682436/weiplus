package h41;

/* loaded from: classes14.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.x f278853d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h41.x xVar) {
        super(1);
        this.f278853d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.wechat.aff.ovc.c reason = (com.tencent.wechat.aff.ovc.c) obj;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.wechat.aff.ovc.a aVar = this.f278853d.f278884a;
        if (aVar != null) {
            aVar.N(reason);
        }
        return jz5.f0.f302826a;
    }
}
