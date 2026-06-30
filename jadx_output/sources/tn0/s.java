package tn0;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p05.r0 f420745f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(tn0.w0 w0Var, java.lang.String str, p05.r0 r0Var) {
        super(0);
        this.f420743d = w0Var;
        this.f420744e = str;
        this.f420745f = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p05.s0 s0Var = this.f420743d.H;
        java.lang.String str = this.f420744e;
        if (str == null) {
            str = "";
        }
        ((p05.d1) s0Var).c(str, this.f420745f);
        return jz5.f0.f302826a;
    }
}
