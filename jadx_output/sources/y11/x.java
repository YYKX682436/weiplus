package y11;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y11.b0 f458841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y11.b0 b0Var) {
        super(0);
        this.f458841d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.SequenceLifecycleScope("SendMsgService", this.f458841d);
    }
}
