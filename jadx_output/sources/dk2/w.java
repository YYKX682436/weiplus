package dk2;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f234260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(dk2.g0 g0Var) {
        super(1);
        this.f234260d = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        dk2.g0 g0Var = this.f234260d;
        if (g0Var.f233470c != 2 && (b4Var = g0Var.f233481n) != null) {
            b4Var.d();
        }
        dk2.g0.c(g0Var, booleanValue);
        return jz5.f0.f302826a;
    }
}
