package qf2;

/* loaded from: classes3.dex */
public final class z3 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.k8 f362679m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Z6() {
        /*
            r7 = this;
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r7.business(r0)
            mm2.o4 r1 = (mm2.o4) r1
            boolean r1 = r1.G
            r2 = 1
            if (r1 != 0) goto Le
            return r2
        Le:
            java.lang.Class<d85.m0> r1 = d85.m0.class
            i95.m r1 = i95.n0.c(r1)
            d85.m0 r1 = (d85.m0) r1
            d85.g0 r3 = d85.g0.LOCAION
            d85.f0 r4 = d85.f0.f227164o
            d85.d1 r1 = (d85.d1) r1
            boolean r1 = r1.Ri(r3, r4)
            java.lang.Class<tb0.j> r3 = tb0.j.class
            i95.m r4 = i95.n0.c(r3)
            tb0.j r4 = (tb0.j) r4
            android.content.Context r5 = com.tencent.mm.sdk.platformtools.x2.f193071a
            sb0.f r4 = (sb0.f) r4
            r4.getClass()
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            r6 = 0
            boolean r4 = j35.u.d(r5, r4, r6)
            if (r4 != 0) goto L50
            i95.m r3 = i95.n0.c(r3)
            tb0.j r3 = (tb0.j) r3
            android.content.Context r4 = com.tencent.mm.sdk.platformtools.x2.f193071a
            sb0.f r3 = (sb0.f) r3
            r3.getClass()
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r3 = j35.u.d(r4, r3, r6)
            if (r3 == 0) goto L4e
            goto L50
        L4e:
            r3 = r6
            goto L51
        L50:
            r3 = r2
        L51:
            if (r1 == 0) goto L57
            if (r3 == 0) goto L57
            r1 = r2
            goto L58
        L57:
            r1 = r6
        L58:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "checkLBSEnable hadPermission: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "VoiceRoomController"
            com.tencent.mars.xlog.Log.i(r4, r3)
            if (r1 != 0) goto L76
            androidx.lifecycle.c1 r0 = r7.business(r0)
            mm2.o4 r0 = (mm2.o4) r0
            r0.G = r6
            return r6
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.z3.Z6():boolean");
    }

    public final void a7(int i17, boolean z17, yz5.p pVar) {
        pk2.o9 o9Var;
        df2.ox oxVar = (df2.ox) controller(df2.ox.class);
        if (oxVar == null || (o9Var = oxVar.f231016q) == null) {
            return;
        }
        o9Var.i(i17, z17, ((mm2.c1) business(mm2.c1.class)).a8(), pVar);
    }

    public void b7(java.lang.String cityText, java.lang.String scene) {
        kotlin.jvm.internal.o.g(cityText, "cityText");
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("VoiceRoomController", "modifyCityShow cityText: " + cityText + " scene: " + scene);
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.w3(this, cityText, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.up1 up1Var;
        super.onLiveStart(hc1Var);
        ((mm2.c1) business(mm2.c1.class)).f328898v3 = pm0.v.A((hc1Var == null || (up1Var = (r45.up1) hc1Var.getCustom(68)) == null) ? 0L : up1Var.getLong(0), 16384);
        com.tencent.mars.xlog.Log.i("VoiceRoomController", "isMultiVoiceRoomLive: " + ((mm2.e1) business(mm2.e1.class)).c7() + " enableShowLiveLocationSwitch: " + ((mm2.c1) business(mm2.c1.class)).f328898v3);
        if (((mm2.e1) business(mm2.e1.class)).c7() && ((mm2.c1) business(mm2.c1.class)).f328898v3) {
            ((mm2.o4) business(mm2.o4.class)).G = pm0.v.z((int) ((mm2.c1) business(mm2.c1.class)).f328866q, 134217728);
            com.tencent.mars.xlog.Log.i("VoiceRoomController", "isAnchorEnableShowLbsLocation: " + ((mm2.o4) business(mm2.o4.class)).G + " getContext: " + O6());
            Z6();
            if (((mm2.o4) business(mm2.o4.class)).G) {
                if (this.f362679m == null) {
                    this.f362679m = new com.tencent.mm.plugin.finder.live.widget.k8(O6(), this);
                }
                com.tencent.mm.plugin.finder.live.widget.k8 k8Var = this.f362679m;
                if (k8Var != null) {
                    k8Var.h0(false);
                }
            } else {
                b7("", "LiveStartDefaultClose");
            }
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new qf2.y3(this, null), 3, null);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f362679m = null;
    }
}
