package vi0;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f437249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlinx.coroutines.q qVar) {
        super(1);
        this.f437249d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.nw6 resp = (r45.nw6) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        ((kotlinx.coroutines.r) this.f437249d).resumeWith(kotlin.Result.m521constructorimpl(resp));
        return jz5.f0.f302826a;
    }
}
