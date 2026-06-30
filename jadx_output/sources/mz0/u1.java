package mz0;

/* loaded from: classes5.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(mz0.b2 b2Var) {
        super(0);
        this.f333068d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = this.f333068d.o7().f70100r;
        if (m5Var instanceof com.tencent.mm.mj_template.sns.compose.widget.k5) {
            return (com.tencent.mm.mj_template.sns.compose.widget.k5) m5Var;
        }
        return null;
    }
}
