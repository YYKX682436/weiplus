package tu2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final tu2.m f422146d = new tu2.m();

    public m() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        qb2.x1 x1Var = new qb2.x1();
        x1Var.field_talker = c01.z1.r();
        qb2.t a17 = com.tencent.mm.plugin.finder.storage.t80.f128066e.a();
        a17.field_talker = c01.z1.r();
        for (int i17 = 0; i17 < 50001; i17++) {
            x1Var.field_sessionId = c01.id.a() + '_' + i17 + "@findermsg";
            a17.field_sessionId = c01.id.a() + '_' + i17 + "@findermsg";
            if (i17 % 2 == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                g92.b bVar = g92.b.f269769e;
                sb6.append(bVar.T0());
                sb6.append('_');
                sb6.append(i17);
                x1Var.field_talker = sb6.toString();
                a17.field_talker = bVar.T0() + '_' + i17;
            } else {
                x1Var.field_talker = c01.z1.r() + '_' + i17;
                a17.field_talker = c01.z1.r() + '_' + i17;
            }
            boolean insert = ((c61.l7) i95.n0.c(c61.l7.class)).pk().insert(x1Var);
            boolean insert2 = ((c61.l7) i95.n0.c(c61.l7.class)).Kj().insert(a17);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(i17);
            sb7.append(',');
            sb7.append(insert);
            sb7.append(' ');
            sb7.append(insert2);
            com.tencent.mars.xlog.Log.i("FINDER_INSERT_10W_FAKE_SESSIONINFO", sb7.toString());
        }
        return jz5.f0.f302826a;
    }
}
