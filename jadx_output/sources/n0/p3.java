package n0;

/* loaded from: classes14.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f333671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(n0.b4 b4Var) {
        super(0);
        this.f333671d = b4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlinx.coroutines.q s17;
        n0.b4 b4Var = this.f333671d;
        synchronized (b4Var.f333447d) {
            s17 = b4Var.s();
            if (((n0.o3) ((kotlinx.coroutines.flow.h3) b4Var.f333458o).getValue()).compareTo(n0.o3.ShuttingDown) <= 0) {
                throw kotlinx.coroutines.e2.a("Recomposer shutdown; frame clock awaiter will never resume", b4Var.f333449f);
            }
        }
        if (s17 != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) s17).resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
        return jz5.f0.f302826a;
    }
}
