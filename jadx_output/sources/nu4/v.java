package nu4;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f340289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f340289d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f340289d.resumeWith(kotlin.Result.m521constructorimpl((java.lang.String) obj));
        return jz5.f0.f302826a;
    }
}
