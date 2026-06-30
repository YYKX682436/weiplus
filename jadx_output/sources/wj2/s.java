package wj2;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446715d;

    public s(wj2.w wVar) {
        this.f446715d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        wj2.w wVar = this.f446715d;
        if (wVar.D > 0) {
            km2.q bindLinkMicUser = wVar.getBindLinkMicUser();
            if (bindLinkMicUser != null && (str = bindLinkMicUser.f309175f) != null) {
                dk2.xf z17 = wVar.f446719i.z();
                if (z17 != null) {
                    int i17 = wVar.D;
                    wj2.p pVar = new wj2.p(wVar);
                    dk2.r4 r4Var = (dk2.r4) z17;
                    pq5.g l17 = new ek2.m1(((mm2.e1) r4Var.m(mm2.e1.class)).f328985o, ((mm2.e1) r4Var.m(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) r4Var.m(mm2.e1.class)).f328983m, ((mm2.e1) r4Var.m(mm2.e1.class)).f328992v, xy2.c.f(r4Var.f234008c), str, i17).l();
                    l17.K(new dk2.q1(pVar));
                    if (r4Var.M() != null && (r4Var.M() instanceof com.tencent.mm.ui.MMActivity)) {
                        android.content.Context M = r4Var.M();
                        kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        l17.f((com.tencent.mm.ui.MMActivity) M);
                    }
                }
                if (wVar.E > 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", 2);
                    jSONObject.put("element", 2);
                    km2.q bindLinkMicUser2 = wVar.getBindLinkMicUser();
                    jSONObject.put("mic_finderusername", bindLinkMicUser2 != null ? bindLinkMicUser2.f309172c : null);
                    km2.q bindLinkMicUser3 = wVar.getBindLinkMicUser();
                    jSONObject.put("mic_id", bindLinkMicUser3 != null ? bindLinkMicUser3.f309175f : null);
                    jSONObject.put("like_cnt", wVar.E);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    if (wVar.F()) {
                        i95.m c17 = i95.n0.c(ml2.r0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327223d3, jSONObject2, 0L, null, null, null, null, null, 252, null);
                    } else {
                        i95.m c18 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        zy2.zb.y6((zy2.zb) c18, ml2.z4.E2, jSONObject2, null, 4, null);
                    }
                }
                int i18 = wVar.D - wVar.E;
                if (i18 > 0) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("type", 2);
                    jSONObject3.put("element", 1);
                    km2.q bindLinkMicUser4 = wVar.getBindLinkMicUser();
                    jSONObject3.put("mic_finderusername", bindLinkMicUser4 != null ? bindLinkMicUser4.f309172c : null);
                    km2.q bindLinkMicUser5 = wVar.getBindLinkMicUser();
                    jSONObject3.put("mic_id", bindLinkMicUser5 != null ? bindLinkMicUser5.f309175f : null);
                    jSONObject3.put("like_cnt", i18);
                    java.lang.String jSONObject4 = jSONObject3.toString();
                    kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                    if (wVar.F()) {
                        i95.m c19 = i95.n0.c(ml2.r0.class);
                        kotlin.jvm.internal.o.f(c19, "getService(...)");
                        ml2.r0.hj((ml2.r0) c19, ml2.b4.f327223d3, jSONObject4, 0L, null, null, null, null, null, 252, null);
                    } else {
                        i95.m c27 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c27, "getService(...)");
                        zy2.zb.y6((zy2.zb) c27, ml2.z4.E2, jSONObject4, null, 4, null);
                    }
                }
            }
            wVar.D = 0;
            wVar.E = 0;
        }
        wVar.A.postDelayed(this, wVar.C * 1000);
    }
}
