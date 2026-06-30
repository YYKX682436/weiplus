package h41;

/* loaded from: classes14.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.x f278846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h41.x xVar) {
        super(1);
        this.f278846d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String traceMsgId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(traceMsgId, "traceMsgId");
        com.tencent.wechat.aff.ovc.a aVar = this.f278846d.f278884a;
        if (aVar != null) {
            aVar.C1(traceMsgId);
        }
        return jz5.f0.f302826a;
    }
}
