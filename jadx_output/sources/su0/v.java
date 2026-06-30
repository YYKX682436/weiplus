package su0;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f412707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f412707d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f412707d.resumeWith(kotlin.Result.m521constructorimpl((r45.ne4) obj));
        return jz5.f0.f302826a;
    }
}
