package l41;

/* loaded from: classes15.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f315927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(l41.j1 j1Var) {
        super(0);
        this.f315927d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.ResultReceiver resultReceiver;
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f315927d.f315844c;
        if (openIMKefuStartConversationRequest == null || (resultReceiver = openIMKefuStartConversationRequest.f72280o) == null) {
            return null;
        }
        return new ah5.b(resultReceiver);
    }
}
