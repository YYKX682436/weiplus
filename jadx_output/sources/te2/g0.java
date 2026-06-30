package te2;

/* loaded from: classes10.dex */
public final class g0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.i0 f418029a;

    public g0(te2.i0 i0Var) {
        this.f418029a = i0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        te2.w3 w3Var = this.f418029a.f418092i;
        if (w3Var == null) {
            return null;
        }
        java.lang.String f17 = ((te2.c4) w3Var).f();
        if (f17 == null) {
            f17 = "";
        }
        int i17 = 1;
        jz5.l[] lVarArr = new jz5.l[1];
        if (kotlin.jvm.internal.o.b(f17, "")) {
            ml2.e5 e5Var = ml2.e5.f327389e;
        } else {
            ml2.e5 e5Var2 = ml2.e5.f327389e;
            i17 = 2;
        }
        lVarArr[0] = new jz5.l("cur_red_packet_source", java.lang.Integer.valueOf(i17));
        return kz5.c1.l(lVarArr);
    }
}
