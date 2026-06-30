package u1;

/* loaded from: classes14.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.w f423600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(u1.w wVar) {
        super(2);
        this.f423600d = wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        z0.s mod = (z0.s) obj2;
        kotlin.jvm.internal.o.g((jz5.f0) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(mod, "mod");
        o0.i iVar = this.f423600d.f423692p;
        int i17 = iVar.f341852f;
        if (i17 > 0) {
            int i18 = i17 - 1;
            java.lang.Object[] objArr = iVar.f341850d;
            do {
                obj3 = objArr[i18];
                u1.e1 e1Var = (u1.e1) obj3;
                if (e1Var.G == mod && !e1Var.H) {
                    break;
                }
                i18--;
            } while (i18 >= 0);
        }
        obj3 = null;
        u1.e1 e1Var2 = (u1.e1) obj3;
        if (e1Var2 != null) {
            e1Var2.H = true;
        }
        return jz5.f0.f302826a;
    }
}
