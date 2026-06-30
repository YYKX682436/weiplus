package ek4;

/* loaded from: classes12.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.z f253682f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ek4.s sVar, java.lang.String str, ek4.z zVar) {
        super(0);
        this.f253680d = sVar;
        this.f253681e = str;
        this.f253682f = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        ek4.s sVar = this.f253680d;
        java.util.HashMap hashMap = sVar.f253685a;
        java.lang.String str = this.f253681e;
        dn.o oVar = (dn.o) hashMap.get(str);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        ek4.z zVar = this.f253682f;
        if (oVar != null) {
            dn.b bVar = new dn.b();
            int i17 = sVar.i(str, bVar);
            if (zVar != null) {
                zVar.a(i17, oVar, bVar);
            }
            if (oVar.f241809y0 <= 1) {
                ek4.s.c(sVar);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            dn.o oVar2 = (dn.o) sVar.f253687c.remove(str);
            dn.h hVar = (dn.h) sVar.f253688d.remove(str);
            if (zVar != null) {
                zVar.a(hVar != null ? hVar.field_retCode : 0, oVar2, hVar);
            }
            if (oVar2 != null && oVar2.f241809y0 == 1) {
                ek4.s.c(sVar);
            }
        }
        return f0Var2;
    }
}
