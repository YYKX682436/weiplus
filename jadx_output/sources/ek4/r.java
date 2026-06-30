package ek4;

/* loaded from: classes12.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ek4.s sVar, java.lang.String str) {
        super(0);
        this.f253683d = sVar;
        this.f253684e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        ek4.s sVar = this.f253683d;
        java.util.HashMap hashMap = sVar.f253685a;
        java.lang.String str = this.f253684e;
        dn.o oVar = (dn.o) hashMap.get(str);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (oVar != null) {
            sVar.i(str, new dn.b());
            if (oVar.f241809y0 <= 1) {
                ek4.s.c(sVar);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            dn.o oVar2 = (dn.o) sVar.f253687c.remove(str);
            if (oVar2 != null && oVar2.f241809y0 == 1) {
                ek4.s.c(sVar);
            }
        }
        return f0Var2;
    }
}
