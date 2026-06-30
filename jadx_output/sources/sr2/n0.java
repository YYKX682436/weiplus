package sr2;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(sr2.w0 w0Var) {
        super(2);
        this.f411641d = w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String topic = (java.lang.String) obj;
        java.lang.String inputTopicStr = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(topic, "topic");
        kotlin.jvm.internal.o.g(inputTopicStr, "inputTopicStr");
        this.f411641d.O6(topic, inputTopicStr);
        return jz5.f0.f302826a;
    }
}
