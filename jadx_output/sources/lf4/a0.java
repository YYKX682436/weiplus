package lf4;

/* loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f318350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(lf4.b0 b0Var) {
        super(4);
        this.f318350d = b0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        int i18;
        nf4.j L0;
        long longValue = ((java.lang.Number) obj).longValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.String fromUser = (java.lang.String) obj3;
        java.lang.String storyOwner = (java.lang.String) obj4;
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        kotlin.jvm.internal.o.g(storyOwner, "storyOwner");
        lf4.b0 b0Var = this.f318350d;
        if (booleanValue) {
            b0Var.getClass();
        }
        java.util.List list = b0Var.f318361n;
        kotlin.jvm.internal.o.f(list, "access$getUserList$p(...)");
        java.util.Iterator it = list.iterator();
        int i19 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (com.tencent.mm.sdk.platformtools.t8.D0(((lf4.m) it.next()).f318438a, storyOwner)) {
                i17 = i19;
                break;
            }
            i19++;
        }
        if (i17 != -1) {
            java.util.ArrayList arrayList = ((lf4.m) b0Var.f318361n.get(i17)).f318440c;
            java.util.Iterator it6 = arrayList.iterator();
            int i27 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (((if4.f) it6.next()).f291246d == longValue) {
                    i18 = i27;
                    break;
                }
                i27++;
            }
            if (i18 != -1 && (L0 = ef4.w.f252468t.i().L0(longValue)) != null) {
                pm0.v.X(new lf4.z(booleanValue, this.f318350d, i17, i18, arrayList, new if4.f(L0, L0.y0(), if4.g.f291250d)));
            }
        }
        return jz5.f0.f302826a;
    }
}
