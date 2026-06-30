package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lurgen/ur_E2DE/URS_F857;", "", "()V", "UR_A95B", "", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class URS_F857 {
    public static final urgen.ur_E2DE.URS_F857 INSTANCE = new urgen.ur_E2DE.URS_F857();

    private URS_F857() {
    }

    public static final byte[] UR_A95B() {
        bw5.u9 u9Var = new bw5.u9();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        u9Var.f33808d = com.tencent.mm.sdk.platformtools.s9.f192975c;
        boolean[] zArr = u9Var.f33813i;
        zArr[1] = true;
        u9Var.f33812h = false;
        zArr[5] = true;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            u9Var.f33809e = c01.z1.r();
            zArr[2] = true;
        }
        if (((c00.a3) i95.n0.c(c00.a3.class)) != null) {
            h00.a aVar = h00.a.f277808a;
            bw5.i6 a17 = aVar.a();
            u9Var.f33810f = (a17 != null && a17.f28478i[3]) ? a17.f28475f : 0L;
            zArr[3] = true;
            java.util.LinkedList linkedList = u9Var.f33811g;
            bw5.i6 a18 = aVar.a();
            java.util.List list = kz5.p0.f313996d;
            if (a18 != null && a18.f28478i[4]) {
                list = a18.f28476g;
                kotlin.jvm.internal.o.f(list, "getSamplingPolicies(...)");
            }
            linkedList.addAll(list);
        }
        byte[] byteArray = u9Var.toByteArray();
        kotlin.jvm.internal.o.d(byteArray);
        return byteArray;
    }
}
