package l41;

/* loaded from: classes15.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f315777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(l41.j1 j1Var) {
        super(0);
        this.f315777d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f315777d.f315844c;
        return java.lang.Long.valueOf(openIMKefuStartConversationRequest != null ? openIMKefuStartConversationRequest.f72273e : 0L);
    }
}
