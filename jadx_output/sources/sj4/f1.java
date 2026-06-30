package sj4;

/* loaded from: classes11.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj4.h1 f408840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(sj4.h1 h1Var) {
        super(1);
        this.f408840d = h1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pj4.b0 extInfoOut = (pj4.b0) obj;
        kotlin.jvm.internal.o.g(extInfoOut, "extInfoOut");
        sj4.h1 h1Var = this.f408840d;
        if (!h1Var.f408850g) {
            h1Var.a(extInfoOut);
        }
        return jz5.f0.f302826a;
    }
}
