package u1;

/* loaded from: classes14.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.w f423597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(u1.w wVar) {
        super(0);
        this.f423597d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        u1.w wVar = this.f423597d;
        int i17 = 0;
        wVar.D = 0;
        o0.i r17 = wVar.r();
        int i18 = r17.f341852f;
        if (i18 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i19 = 0;
            do {
                u1.w wVar2 = (u1.w) objArr[i19];
                wVar2.C = wVar2.B;
                wVar2.B = Integer.MAX_VALUE;
                wVar2.f423702z.f423633d = false;
                if (wVar2.E == u1.e0.InLayoutBlock) {
                    wVar2.E = u1.e0.NotUsed;
                }
                i19++;
            } while (i19 < i18);
        }
        wVar.I.e0().e();
        o0.i r18 = wVar.r();
        int i27 = r18.f341852f;
        if (i27 > 0) {
            java.lang.Object[] objArr2 = r18.f341850d;
            do {
                u1.w wVar3 = (u1.w) objArr2[i17];
                if (wVar3.C != wVar3.B) {
                    wVar.D();
                    wVar.u();
                    if (wVar3.B == Integer.MAX_VALUE) {
                        wVar3.A();
                    }
                }
                u1.n0 n0Var = wVar3.f423702z;
                n0Var.f423634e = n0Var.f423633d;
                i17++;
            } while (i17 < i27);
        }
        return jz5.f0.f302826a;
    }
}
