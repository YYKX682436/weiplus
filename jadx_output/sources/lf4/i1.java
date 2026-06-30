package lf4;

/* loaded from: classes4.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f318414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(lf4.j1 j1Var) {
        super(4);
        this.f318414d = j1Var;
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
        nf4.j L0 = ef4.w.f252468t.i().L0(longValue);
        if (L0 != null) {
            lf4.j1 j1Var = this.f318414d;
            java.util.Iterator it = j1Var.f318431u.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (com.tencent.mm.sdk.platformtools.t8.D0((java.lang.String) it.next(), df4.b.f232038a.a(java.lang.Integer.valueOf(L0.field_createTime)))) {
                    break;
                }
                i18++;
            }
            if (i18 != -1) {
                java.lang.Object obj5 = j1Var.f318422i.get(i18);
                kotlin.jvm.internal.o.f(obj5, "get(...)");
                java.util.ArrayList arrayList = (java.util.ArrayList) obj5;
                java.util.Iterator it6 = arrayList.iterator();
                int i19 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (((if4.f) it6.next()).f291246d == longValue) {
                        i17 = i19;
                        break;
                    }
                    i19++;
                }
                if (i17 != -1) {
                    pm0.v.X(new lf4.h1(booleanValue, j1Var, i18, i17, arrayList, new if4.f(L0, L0.y0(), if4.g.f291250d)));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
