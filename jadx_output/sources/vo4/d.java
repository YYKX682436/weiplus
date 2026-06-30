package vo4;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.i f438622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vo4.i iVar) {
        super(0);
        this.f438622d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vo4.r rVar = this.f438622d.f438634e;
        p05.l4 l4Var = rVar.f438674c;
        if (l4Var != null) {
            l4Var.o();
        }
        rVar.c(false);
        rVar.f438676e.clear();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VLogRelease release clearCache, ");
        vo4.s sVar = rVar.f438677f;
        is0.c[] cVarArr = sVar.f438683a;
        sb6.append(cVarArr.length);
        sb6.append(", ");
        is0.c[] cVarArr2 = sVar.f438684b;
        sb6.append(cVarArr2.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptTexCache", sb6.toString());
        for (is0.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.close();
            }
        }
        for (is0.c cVar2 : cVarArr2) {
            if (cVar2 != null) {
                cVar2.close();
            }
        }
        return jz5.f0.f302826a;
    }
}
