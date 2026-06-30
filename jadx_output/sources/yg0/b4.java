package yg0;

/* loaded from: classes8.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f462158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f462159e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(yz5.p pVar, int i17) {
        super(2);
        this.f462158d = pVar;
        this.f462159e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String status = (java.lang.String) obj;
        java.lang.String str = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(status, "status");
        java.lang.String str2 = kotlin.jvm.internal.o.b(status, "STATE_DRAGGING") ? "heightWillChange" : kotlin.jvm.internal.o.b(status, "STATE_IDLE") ? "heightDidChange" : "";
        if (str2.length() > 0) {
            com.tencent.mm.autogen.events.WebSearchHalfScreenStatusChangeEvent webSearchHalfScreenStatusChangeEvent = new com.tencent.mm.autogen.events.WebSearchHalfScreenStatusChangeEvent();
            int i17 = this.f462159e;
            am.j20 j20Var = webSearchHalfScreenStatusChangeEvent.f54982g;
            j20Var.f7005a = i17;
            j20Var.f7006b = str2;
            webSearchHalfScreenStatusChangeEvent.e();
        }
        yz5.p pVar = this.f462158d;
        if (pVar == null) {
            return null;
        }
        pVar.invoke(status, str);
        return jz5.f0.f302826a;
    }
}
