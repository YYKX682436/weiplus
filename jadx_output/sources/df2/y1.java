package df2;

/* loaded from: classes3.dex */
public final class y1 extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public int f231838m;

    /* renamed from: n, reason: collision with root package name */
    public int f231839n;

    /* renamed from: o, reason: collision with root package name */
    public long f231840o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f231841p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f231842q;

    /* renamed from: r, reason: collision with root package name */
    public final df2.x1 f231843r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        r45.q12 q12Var = ((mm2.e1) business(mm2.e1.class)).f328989s;
        this.f231838m = q12Var != null ? q12Var.getInteger(0) : 0;
        r45.q12 q12Var2 = ((mm2.e1) business(mm2.e1.class)).f328989s;
        this.f231839n = q12Var2 != null ? q12Var2.getInteger(1) : 0;
        this.f231843r = new df2.x1(store, this);
    }

    public static final void Z6(df2.y1 y1Var) {
        y1Var.getClass();
        if (zl2.r4.f473950a.x1() || !y1Var.f231842q) {
            return;
        }
        y1Var.f231842q = false;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store = y1Var.getStore();
        kotlin.jvm.internal.o.g(store, "<this>");
        if2.z.f291153a.i(store, new mf2.e(store));
        dk2.ef.f233372a.V(false);
    }

    public static void e7(df2.y1 y1Var, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            xh2.c cVar = (xh2.c) ((mm2.o4) y1Var.business(mm2.o4.class)).A.getValue();
            i17 = cVar != null ? cVar.f454534d : 0;
        }
        if ((i19 & 2) != 0) {
            xh2.c cVar2 = (xh2.c) ((mm2.o4) y1Var.business(mm2.o4.class)).A.getValue();
            i18 = cVar2 != null ? cVar2.f454535e : 0;
        }
        y1Var.d7(i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r4.X() == true) goto L16;
     */
    @Override // mf2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M2(xh2.b r7) {
        /*
            r6 = this;
            java.lang.String r0 = "micInfoData"
            kotlin.jvm.internal.o.g(r7, r0)
            int r0 = r7.f454527f
            if (r0 == 0) goto L60
            int r1 = r6.f231838m
            java.lang.Class<ml2.r0> r2 = ml2.r0.class
            int r7 = r7.f454528g
            if (r1 != r0) goto L15
            int r3 = r6.f231839n
            if (r3 == r7) goto L4b
        L15:
            int r3 = r6.f231839n
            java.lang.String r4 = "FinderLiveCommonController"
            java.lang.String r5 = "onLiveModeChange"
            com.tencent.mars.xlog.Log.i(r4, r5)
            zl2.r4 r4 = zl2.r4.f473950a
            boolean r4 = r4.x1()
            if (r4 != 0) goto L3e
            tn0.w0 r4 = r6.Q6()
            if (r4 == 0) goto L34
            boolean r4 = r4.X()
            r5 = 1
            if (r4 != r5) goto L34
            goto L35
        L34:
            r5 = 0
        L35:
            if (r5 != 0) goto L38
            goto L3e
        L38:
            r6.d7(r1, r3)
            r6.f7()
        L3e:
            r6.f231838m = r0
            r6.f231839n = r7
            i95.m r1 = i95.n0.c(r2)
            ml2.r0 r1 = (ml2.r0) r1
            r1.fj(r0, r7)
        L4b:
            zl2.r4 r7 = zl2.r4.f473950a
            boolean r7 = r7.x1()
            if (r7 != 0) goto L60
            i95.m r7 = i95.n0.c(r2)
            ml2.r0 r7 = (ml2.r0) r7
            org.json.JSONObject r0 = r6.b7()
            r7.Rk(r0)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.y1.M2(xh2.b):void");
    }

    public final org.json.JSONObject a7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.q12 q12Var = ((mm2.e1) business(mm2.e1.class)).f328989s;
        jSONObject.put("live_mode_type", q12Var != null ? q12Var.getInteger(0) : 0);
        r45.q12 q12Var2 = ((mm2.e1) business(mm2.e1.class)).f328989s;
        jSONObject.put("live_sub_mode_type", q12Var2 != null ? q12Var2.getInteger(1) : 0);
        return jSONObject;
    }

    public final org.json.JSONObject b7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        xh2.c cVar = (xh2.c) ((mm2.o4) business(mm2.o4.class)).A.getValue();
        jSONObject.put("live_mode_type", cVar != null ? cVar.f454534d : 0);
        xh2.c cVar2 = (xh2.c) ((mm2.o4) business(mm2.o4.class)).A.getValue();
        jSONObject.put("live_sub_mode_type", cVar2 != null ? cVar2.f454535e : 0);
        return jSONObject;
    }

    public final void c7() {
        if (zl2.r4.f473950a.x1()) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).ek(a7());
            return;
        }
        r45.q12 q12Var = ((mm2.e1) business(mm2.e1.class)).f328989s;
        this.f231838m = q12Var != null ? q12Var.getInteger(0) : 0;
        r45.q12 q12Var2 = ((mm2.e1) business(mm2.e1.class)).f328989s;
        this.f231839n = q12Var2 != null ? q12Var2.getInteger(1) : 0;
        ((ml2.r0) i95.n0.c(ml2.r0.class)).fj(this.f231838m, this.f231839n);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Rk(a7());
    }

    public final void d7(int i17, int i18) {
        if (zl2.r4.f473950a.x1() || !this.f231841p) {
            return;
        }
        this.f231841p = false;
        com.tencent.mars.xlog.Log.i("FinderLiveCommonController", "onMicEnd currentSubSessionId: " + this.f231840o + " liveMode: " + i17 + " liveSubMode: " + i18);
        g7(2, i17, i18);
    }

    public final void f7() {
        if (zl2.r4.f473950a.x1() || this.f231841p) {
            return;
        }
        this.f231841p = true;
        this.f231840o = c01.id.c();
        com.tencent.mars.xlog.Log.i("FinderLiveCommonController", "onMicStart currentSubSessionId: " + this.f231840o + " liveMode: " + b7());
        xh2.c cVar = (xh2.c) ((mm2.o4) business(mm2.o4.class)).A.getValue();
        int i17 = cVar != null ? cVar.f454534d : 0;
        xh2.c cVar2 = (xh2.c) ((mm2.o4) business(mm2.o4.class)).A.getValue();
        g7(1, i17, cVar2 != null ? cVar2.f454535e : 0);
    }

    public final void g7(int i17, int i18, int i19) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("apply_type", ((mm2.o4) business(mm2.o4.class)).f329331x1);
        jSONObject.put("live_mode_type", i18);
        jSONObject.put("live_sub_mode_type", i19);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("SubSessionId", this.f231840o);
        com.tencent.mars.xlog.Log.i("FinderLiveCommonController", "reportMic21084 type: " + i17 + " json: " + jSONObject + " currentSubSessionId: " + this.f231840o);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.mj((ml2.r0) c17, ml2.b4.f327267t2, t17, 0L, null, null, jSONObject3.toString(), null, null, 220, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        super.onLiveActivate();
        tn0.w0 Q6 = Q6();
        if (Q6 == null) {
            return;
        }
        Q6.f420763l1 = this.f231843r;
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        tn0.w0 Q6 = Q6();
        if (Q6 != null) {
            Q6.f420763l1 = null;
        }
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        j0Var.getClass();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "clearAnchorBaseChnlExtra");
        j0Var.f327587d = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        c7();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        c7();
    }
}
