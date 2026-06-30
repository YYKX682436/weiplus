package ey2;

/* loaded from: classes2.dex */
public final class i2 extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final ey2.h2 f257394e = new ey2.h2(1);

    /* renamed from: f, reason: collision with root package name */
    public final ey2.h2 f257395f = new ey2.h2(3);

    /* renamed from: g, reason: collision with root package name */
    public final ey2.h2 f257396g = new ey2.h2(4);

    /* renamed from: h, reason: collision with root package name */
    public final ey2.h2 f257397h = new ey2.h2(10000);

    /* renamed from: i, reason: collision with root package name */
    public final ey2.h2 f257398i = new ey2.h2(9);

    /* renamed from: m, reason: collision with root package name */
    public final ey2.h2 f257399m = new ey2.h2(104);

    public final void N6(int i17, java.util.List list) {
        if (list == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[collectReadFeeds] commentScene=");
        sb6.append(i17);
        sb6.append(" readList=");
        sb6.append(list.size());
        sb6.append(" first=");
        so2.j5 j5Var = (so2.j5) kz5.n0.Z(list);
        sb6.append(pm0.v.u(j5Var != null ? j5Var.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i("Finder.TabStreamUnreadVM", sb6.toString());
        if (i17 != 1) {
            if (i17 == 25) {
                this.f257397h.b(list);
                return;
            }
            if (i17 != 120) {
                if (i17 != 171 && i17 != 155 && i17 != 156) {
                    switch (i17) {
                        case 17:
                            break;
                        case 18:
                            ey2.h2 h2Var = this.f257394e;
                            h2Var.b(list);
                            h2Var.a();
                            return;
                        case 19:
                        case 20:
                            ey2.h2 h2Var2 = this.f257396g;
                            h2Var2.b(list);
                            h2Var2.a();
                            return;
                        default:
                            return;
                    }
                }
                ey2.h2 h2Var3 = this.f257395f;
                h2Var3.b(list);
                h2Var3.a();
                return;
            }
        }
        this.f257399m.b(list);
    }

    public final boolean O6(long j17) {
        return this.f257395f.c(j17) || this.f257394e.c(j17) || this.f257396g.c(j17);
    }

    public final boolean P6(int i17, long j17) {
        if (i17 == 1) {
            return this.f257394e.c(j17);
        }
        if (i17 == 9) {
            return this.f257398i.c(j17);
        }
        if (i17 == 104) {
            return this.f257399m.c(j17);
        }
        if (i17 == 10000) {
            return this.f257397h.c(j17);
        }
        if (i17 == 3) {
            return this.f257395f.c(j17);
        }
        if (i17 != 4) {
            return true;
        }
        return this.f257396g.c(j17);
    }
}
