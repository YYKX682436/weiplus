package mz0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f332918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mz0.b2 b2Var, com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var) {
        super(0);
        this.f332917d = b2Var;
        this.f332918e = m5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = this.f332917d;
        kotlinx.coroutines.l.d(b2Var.getMainScope(), null, null, new mz0.c(b2Var, this.f332918e, null), 3, null);
        return jz5.f0.f302826a;
    }
}
