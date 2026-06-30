package r81;

/* loaded from: classes4.dex */
public enum f {
    INSTANCE;


    /* renamed from: e, reason: collision with root package name */
    public static final r81.e f393298e = new r81.e() { // from class: r81.a
        {
            b(q81.f.class, 20);
            b(q81.c.class, 40);
            b(q81.l.class, 80);
            b(q81.o.class, 100);
            b(q81.n.class, 120);
            b(q81.s.class, 150);
            b(q81.b.class, 160);
            b(q81.q.class, 171);
            b(q81.j.class, 185);
            b(q81.k.class, 195);
            b(q81.r.class, 205);
            b(q81.g.class, 211);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final r81.e f393299f = new r81.e() { // from class: r81.b
        {
            b(q81.f.class, 21);
            b(q81.c.class, 41);
            b(q81.l.class, 81);
            b(q81.o.class, 101);
            b(q81.n.class, 121);
            b(q81.s.class, 151);
            b(q81.b.class, 161);
            b(q81.q.class, 172);
            b(q81.j.class, 186);
            b(q81.k.class, 196);
            b(q81.r.class, 206);
            b(q81.g.class, 212);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final r81.e f393300g = new r81.e() { // from class: r81.c
        {
            b(q81.f.class, 22);
            b(q81.c.class, 42);
            b(q81.l.class, 82);
            b(q81.o.class, 102);
            b(q81.n.class, 122);
            b(q81.s.class, 152);
            b(q81.b.class, 162);
            b(q81.q.class, ib1.t.CTRL_INDEX);
            b(q81.j.class, 187);
            b(q81.k.class, 197);
            b(q81.r.class, 207);
            b(q81.g.class, 213);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static final r81.e f393301h = new r81.e() { // from class: r81.d
        {
            b(q81.f.class, 23);
            b(q81.c.class, 43);
            b(q81.l.class, 83);
            b(q81.o.class, 103);
            b(q81.n.class, 123);
            b(q81.s.class, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS);
            b(q81.b.class, 163);
            b(q81.q.class, 174);
            b(q81.j.class, 188);
            b(q81.k.class, nd1.d1.CTRL_INDEX);
            b(q81.r.class, 208);
            b(q81.g.class, 214);
        }
    };

    public void b(int i17, int i18) {
        d(i17, i18);
    }

    public void d(long j17, long j18) {
        if (j18 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PredownloadReporter", "idkeyStat with invalid ID(%d), key (%d)", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        if (j17 > 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.B(j17, j18);
            g0Var.d(15272, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        if (843 != j17) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.B(843L, j18);
            g0Var2.d(15272, java.lang.Integer.valueOf(gd1.s.CTRL_INDEX), java.lang.Long.valueOf(j18));
        }
    }
}
