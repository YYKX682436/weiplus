package kp;

/* loaded from: classes7.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f310795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kotlinx.coroutines.q qVar) {
        super(1);
        this.f310795d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gz.b result = (gz.b) obj;
        kotlin.jvm.internal.o.g(result, "result");
        ((kotlinx.coroutines.r) this.f310795d).resumeWith(kotlin.Result.m521constructorimpl(result));
        return jz5.f0.f302826a;
    }
}
