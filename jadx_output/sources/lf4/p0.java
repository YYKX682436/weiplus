package lf4;

/* loaded from: classes4.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f318458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(lf4.q0 q0Var) {
        super(4);
        this.f318458d = q0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        long longValue = ((java.lang.Number) obj).longValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.String fromUser = (java.lang.String) obj3;
        java.lang.String storyOwner = (java.lang.String) obj4;
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        kotlin.jvm.internal.o.g(storyOwner, "storyOwner");
        lf4.q0 q0Var = this.f318458d;
        java.util.Iterator it = q0Var.f318465i.iterator();
        boolean z17 = false;
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((if4.f) it.next()).f291248f.f291234b == longValue) {
                i17 = i18;
                break;
            }
            i18++;
        }
        java.util.ArrayList arrayList = q0Var.f318465i;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            ef4.v vVar = ef4.w.f252468t;
            if (com.tencent.mm.sdk.platformtools.t8.D0(storyOwner, vVar.e())) {
                java.lang.Object obj5 = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj5, "get(...)");
                nf4.j L0 = vVar.i().L0(longValue);
                if (L0 != null) {
                    pm0.v.X(new lf4.o0(booleanValue, L0, this.f318458d, i17, new if4.f(L0, L0.y0(), if4.g.f291250d)));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
