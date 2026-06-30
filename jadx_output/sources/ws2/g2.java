package ws2;

/* loaded from: classes3.dex */
public final class g2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.j2 f449041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f449042e;

    public g2(ws2.j2 j2Var, gk2.e eVar) {
        this.f449041d = j2Var;
        this.f449042e = eVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        dk2.xf k17;
        java.lang.String str;
        r45.nt2 nt2Var;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f449041d.f449062i);
        ws2.j2 j2Var = this.f449041d;
        gk2.e eVar = this.f449042e;
        synchronized (valueOf) {
            com.tencent.mars.xlog.Log.i(j2Var.f449059f, "count down looping");
            if (j2Var.f449062i) {
                com.tencent.mars.xlog.Log.i(j2Var.f449059f, "cgi going,return ");
                return false;
            }
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.f6 f6Var = (mm2.f6) efVar.i(mm2.f6.class);
            if ((f6Var == null || (nt2Var = f6Var.E) == null || nt2Var.getInteger(1) != 0) ? false : true) {
                return true;
            }
            mm2.i7 i7Var = ((mm2.h5) eVar.a(mm2.h5.class)).f329112g;
            r45.hd5 hd5Var = i7Var != null ? i7Var.f329148e : null;
            if (i7Var == null || hd5Var == null) {
                return false;
            }
            long longValue = ((java.lang.Number) ((jz5.n) j2Var.f449060g).getValue()).longValue() - (c01.id.e() - hd5Var.getInteger(2));
            if (!j2Var.f449061h.containsKey(java.lang.Long.valueOf(i7Var.f329147d))) {
                j2Var.f449061h.put(java.lang.Long.valueOf(i7Var.f329147d), new ws2.d2(false, false, false));
            }
            java.lang.Object obj = j2Var.f449061h.get(java.lang.Long.valueOf(i7Var.f329147d));
            kotlin.jvm.internal.o.d(obj);
            ws2.d2 d2Var = (ws2.d2) obj;
            if (longValue > 0) {
                return true;
            }
            if (!d2Var.f449025a) {
                pm0.v.X(new ws2.i2(com.tencent.mm.R.string.e6w));
            }
            d2Var.f449025a = true;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.j0.Qj((ml2.j0) c17, 7, 0, 0L, 0, 12, null);
            j2Var.f449062i = true;
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            if (e1Var != null && (k17 = efVar.k(eVar)) != null) {
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                android.content.Context context = k0Var != null ? k0Var.getContext() : null;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
                long j17 = e1Var.f328988r.getLong(0);
                long j18 = e1Var.f328983m;
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var == null || (str = c1Var.f328852o) == null) {
                    str = "";
                }
                java.lang.String str2 = str;
                r45.hx0 hx0Var = new r45.hx0();
                hx0Var.set(0, 106);
                r45.l12 l12Var = new r45.l12();
                l12Var.set(0, java.lang.Long.valueOf(i7Var.f329147d));
                hx0Var.set(1, hc2.b.a(l12Var));
                ((dk2.r4) k17).a0(mMActivity, j17, j18, str2, hx0Var, new ws2.f2(j2Var, i7Var, eVar));
            }
            return false;
        }
    }
}
