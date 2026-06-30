package ef0;

@j95.b
/* loaded from: classes8.dex */
public final class d4 extends i95.w implements qk.h9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f252196d;

    /* renamed from: e, reason: collision with root package name */
    public long f252197e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qb0 f252198f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f252199g = jz5.h.b(ef0.c4.f252185d);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bw5.qb0 Ai(com.tencent.mm.protobuf.g r8) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ef0.d4.Ai(com.tencent.mm.protobuf.g):bw5.qb0");
    }

    public final void Bi(java.lang.Long l17) {
        if (l17 == null) {
            this.f252197e = 0L;
            gm4.a.f273557a.f("key_sync_recommend");
            return;
        }
        this.f252197e = l17.longValue();
        gm4.a aVar = gm4.a.f273557a;
        long longValue = l17.longValue();
        if (!gm4.a.f273559c) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingLocalStorage", "not init");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = gm4.a.f273558b;
        if (o4Var != null) {
            o4Var.putLong("key_sync_recommend", longValue);
        }
    }

    public void Di(bw5.lp0 lp0Var) {
        if (lp0Var == null) {
            gm4.a.f273557a.f("key_task_bar_play_item");
        } else {
            gm4.a.f273557a.h("key_task_bar_play_item", lp0Var.toByteArray());
        }
    }

    public void Ni(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
        if (!ip1.e.f293584a.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingTaskBarRecommendService", "syncTaskBarRecommendData style not recommend, ignore");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new ef0.b4(this, source), "TingSyncRecommend");
    }

    public final java.lang.String wi(android.content.Context context) {
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.mc_);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
