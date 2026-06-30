package ub5;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ub5.h f426230d = new ub5.h();

    public h() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.storage.f9 it = (com.tencent.mm.storage.f9) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.k2()) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = it.U1();
            if (U1 == null) {
                U1 = "";
            }
            cVar.fromXml(U1);
            v05.b k17 = cVar.k();
            if (k17 != null) {
                int i18 = k17.f368365d;
                if (k17.getInteger(i18 + 6) == 5) {
                    i17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(k17.getString(i18 + 9)) ? 1 : 2;
                    return "{\"msgid\":" + it.I0() + ";\"msg_type\":" + g95.e0.e(it) + ";\"inner_msg_type\":" + g95.e0.b(it) + ";\"send_time\":" + it.getCreateTime() + ";\"url_type\":" + i17 + '}';
                }
            }
        }
        i17 = 0;
        return "{\"msgid\":" + it.I0() + ";\"msg_type\":" + g95.e0.e(it) + ";\"inner_msg_type\":" + g95.e0.b(it) + ";\"send_time\":" + it.getCreateTime() + ";\"url_type\":" + i17 + '}';
    }
}
