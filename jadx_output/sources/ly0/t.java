package ly0;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f322242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlinx.coroutines.q qVar) {
        super(1);
        this.f322242d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ly0.y result = (ly0.y) obj;
        kotlin.jvm.internal.o.g(result, "result");
        ((kotlinx.coroutines.r) this.f322242d).resumeWith(kotlin.Result.m521constructorimpl(result));
        return jz5.f0.f302826a;
    }
}
