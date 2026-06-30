package yg0;

/* loaded from: classes8.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f462147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(int i17) {
        super(2);
        this.f462147d = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String event = (java.lang.String) obj;
        java.lang.String _data = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(_data, "_data");
        if (event.length() > 0) {
            com.tencent.mm.autogen.events.WebSearchHalfScreenStatusChangeEvent webSearchHalfScreenStatusChangeEvent = new com.tencent.mm.autogen.events.WebSearchHalfScreenStatusChangeEvent();
            int i17 = this.f462147d;
            am.j20 j20Var = webSearchHalfScreenStatusChangeEvent.f54982g;
            j20Var.f7005a = i17;
            j20Var.f7006b = event;
            j20Var.f7007c = _data;
            webSearchHalfScreenStatusChangeEvent.e();
        }
        return jz5.f0.f302826a;
    }
}
