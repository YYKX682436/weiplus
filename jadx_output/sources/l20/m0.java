package l20;

/* loaded from: classes14.dex */
public final class m0 implements q20.k {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f315174a;

    /* renamed from: b, reason: collision with root package name */
    public l20.k0 f315175b;

    public m0(yz5.a baseParamsGetter) {
        kotlin.jvm.internal.o.g(baseParamsGetter, "baseParamsGetter");
        this.f315174a = baseParamsGetter;
    }

    @Override // q20.k
    public void c() {
        l20.l0 l0Var;
        l20.k0 k0Var = this.f315175b;
        if (k0Var == null || (l0Var = k0Var.f315165e) == null) {
            return;
        }
        this.f315175b = l20.k0.a(k0Var, 0L, null, kz5.n0.u0(k0Var.f315163c, new l20.l0(l0Var.f315169a, android.os.SystemClock.uptimeMillis())), null, null, null, 43, null);
    }

    @Override // q20.k
    public void d() {
        l20.k0 k0Var = this.f315175b;
        if (k0Var == null) {
            return;
        }
        java.util.Map t17 = kz5.c1.t((java.util.Map) this.f315174a.invoke());
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("element_id", "feeds_spu_card");
        lVarArr[1] = new jz5.l("action_type", "video_play_end");
        lVarArr[2] = new jz5.l("play_waitting_count", java.lang.String.valueOf(k0Var.f315163c.size() + (k0Var.f315165e != null ? 1 : 0)));
        long j17 = k0Var.f315161a;
        java.lang.Long l17 = k0Var.f315162b;
        lVarArr[3] = new jz5.l("first_loadtime", java.lang.String.valueOf(l17 != null ? l17.longValue() : android.os.SystemClock.uptimeMillis() - j17));
        lVarArr[4] = new jz5.l("total_waitting_time", java.lang.String.valueOf(k0Var.c()));
        lVarArr[5] = new jz5.l("real_play_time", java.lang.String.valueOf(k0Var.b()));
        lVarArr[6] = new jz5.l("play_time", java.lang.String.valueOf(android.os.SystemClock.uptimeMillis() - j17));
        java.util.Map l18 = kz5.c1.l(lVarArr);
        java.lang.String g07 = l18.isEmpty() ? null : kz5.n0.g0(((java.util.LinkedHashMap) l18).entrySet(), ";", "{", "}", 0, null, b30.d.f17560d, 24, null);
        if (g07 == null) {
            g07 = "";
        }
        t17.put("element_info", g07);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("feeds_spu_card", "video_play_end", kz5.c1.s(t17), 12, false);
    }

    @Override // q20.k
    public void e() {
        l20.k0 k0Var = this.f315175b;
        if (k0Var != null) {
            this.f315175b = l20.k0.a(k0Var, 0L, null, null, null, new l20.l0(android.os.SystemClock.uptimeMillis(), 0L, 2, null), null, 47, null);
        }
    }

    @Override // q20.k
    public void onPause() {
        l20.k0 k0Var = this.f315175b;
        if (k0Var != null) {
            this.f315175b = l20.k0.a(k0Var, 0L, null, null, null, null, new l20.l0(android.os.SystemClock.uptimeMillis(), 0L, 2, null), 31, null);
        }
        l20.k0 k0Var2 = this.f315175b;
        if (k0Var2 == null) {
            return;
        }
        java.util.Map t17 = kz5.c1.t((java.util.Map) this.f315174a.invoke());
        java.util.Map l17 = kz5.c1.l(new jz5.l("element_id", "feeds_spu_card"), new jz5.l("action_type", "video_play_stop"), new jz5.l("real_play_time", java.lang.String.valueOf(k0Var2.b())), new jz5.l("play_time", java.lang.String.valueOf(android.os.SystemClock.uptimeMillis() - k0Var2.f315161a)));
        java.lang.String g07 = l17.isEmpty() ? null : kz5.n0.g0(((java.util.LinkedHashMap) l17).entrySet(), ";", "{", "}", 0, null, b30.d.f17560d, 24, null);
        if (g07 == null) {
            g07 = "";
        }
        t17.put("element_info", g07);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("feeds_spu_card", "video_play_stop", kz5.c1.s(t17), 12, false);
    }

    @Override // q20.k
    public void onResume() {
        l20.k0 k0Var = this.f315175b;
        if (k0Var != null) {
            if (k0Var.f315162b != null) {
                l20.l0 l0Var = k0Var.f315166f;
                if (l0Var != null) {
                    this.f315175b = l20.k0.a(k0Var, 0L, null, null, kz5.n0.u0(k0Var.f315164d, new l20.l0(l0Var.f315169a, android.os.SystemClock.uptimeMillis())), null, null, 23, null);
                    return;
                }
                return;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - k0Var.f315161a;
            this.f315175b = l20.k0.a(k0Var, 0L, java.lang.Long.valueOf(uptimeMillis), null, null, null, null, 61, null);
            l20.l0 l0Var2 = k0Var.f315165e;
            if (l0Var2 != null) {
                l20.l0 l0Var3 = new l20.l0(l0Var2.f315169a, android.os.SystemClock.uptimeMillis());
                this.f315175b = l20.k0.a(k0Var, 0L, java.lang.Long.valueOf(uptimeMillis), kz5.n0.u0(k0Var.f315163c, l0Var3), null, new l20.l0(android.os.SystemClock.uptimeMillis(), 0L, 2, null), null, 41, null);
            }
        }
    }

    @Override // q20.k
    public void onStart() {
        if (this.f315175b == null) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            kz5.p0 p0Var = kz5.p0.f313996d;
            this.f315175b = new l20.k0(uptimeMillis, null, p0Var, p0Var, null, null);
        }
    }
}
