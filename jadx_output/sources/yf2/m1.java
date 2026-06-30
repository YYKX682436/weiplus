package yf2;

/* loaded from: classes3.dex */
public final class m1 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f461748m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f461749n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.nq f461750o;

    /* renamed from: p, reason: collision with root package name */
    public final yf2.t f461751p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f461748m = "FinderStartLivePostModeController";
        this.f461751p = new yf2.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z6(yf2.m1 r6) {
        /*
            r6.getClass()
            zl2.r4 r0 = zl2.r4.f473950a
            java.lang.Class<mm2.g1> r1 = mm2.g1.class
            androidx.lifecycle.c1 r2 = r6.business(r1)
            mm2.g1 r2 = (mm2.g1) r2
            kotlinx.coroutines.flow.j2 r2 = r2.f329068f
            kotlinx.coroutines.flow.h3 r2 = (kotlinx.coroutines.flow.h3) r2
            java.lang.Object r2 = r2.getValue()
            r45.q12 r2 = (r45.q12) r2
            boolean r0 = r0.T1(r2)
            java.lang.String r2 = r6.f461748m
            r3 = 0
            if (r0 == 0) goto L82
            androidx.lifecycle.c1 r6 = r6.business(r1)
            mm2.g1 r6 = (mm2.g1) r6
            kotlinx.coroutines.flow.j2 r6 = r6.f329071i
            kotlinx.coroutines.flow.h3 r6 = (kotlinx.coroutines.flow.h3) r6
            java.lang.Object r6 = r6.getValue()
            r45.n73 r6 = (r45.n73) r6
            r0 = 1
            if (r6 == 0) goto L72
            com.tencent.mm.protobuf.f r6 = r6.getCustom(r0)
            r45.z53 r6 = (r45.z53) r6
            if (r6 == 0) goto L72
            r1 = 19
            java.util.LinkedList r6 = r6.getList(r1)
            if (r6 == 0) goto L72
            java.util.Iterator r6 = r6.iterator()
        L47:
            boolean r1 = r6.hasNext()
            r4 = 3
            if (r1 == 0) goto L64
            java.lang.Object r1 = r6.next()
            r5 = r1
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L58
            goto L60
        L58:
            int r5 = r5.intValue()
            if (r5 != r4) goto L60
            r5 = r0
            goto L61
        L60:
            r5 = r3
        L61:
            if (r5 == 0) goto L47
            goto L65
        L64:
            r1 = 0
        L65:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L6a
            goto L72
        L6a:
            int r6 = r1.intValue()
            if (r6 != r4) goto L72
            r6 = r0
            goto L73
        L72:
            r6 = r3
        L73:
            if (r6 == 0) goto L82
            java.lang.String r6 = "#modBlockPushingByScreenCastGame block=true"
            com.tencent.mars.xlog.Log.i(r2, r6)
            tn0.w0 r6 = dk2.ef.f233378d
            if (r6 != 0) goto L7f
            goto L8e
        L7f:
            r6.J1 = r0
            goto L8e
        L82:
            java.lang.String r6 = "#modBlockPushingByScreenCastGame block=false"
            com.tencent.mars.xlog.Log.i(r2, r6)
            tn0.w0 r6 = dk2.ef.f233378d
            if (r6 != 0) goto L8c
            goto L8e
        L8c:
            r6.J1 = r3
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yf2.m1.Z6(yf2.m1):void");
    }

    public final void a7() {
        in0.q liveCore;
        df2.te teVar = (df2.te) controller(df2.te.class);
        if (teVar != null) {
            teVar.a7();
        }
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = k0Var instanceof com.tencent.mm.plugin.finder.live.view.v1 ? (com.tencent.mm.plugin.finder.live.view.v1) k0Var : null;
        if (v1Var != null && (liveCore = v1Var.getLiveCore()) != null) {
            in0.q.d1(liveCore, null, false, 2, null);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLivePostUIC", "Orientatio reset blend but pluginLayout:" + dk2.ef.f233380e + " get liveCore fail!");
        }
    }

    public final r45.q12 b7() {
        return (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).getValue();
    }

    public final void c7() {
        byte[] byteArray;
        d7(9);
        r45.hv1 hv1Var = (r45.hv1) ((kotlinx.coroutines.flow.h3) ((mm2.s1) business(mm2.s1.class)).f329395r).getValue();
        if (hv1Var != null) {
            if (!((zl2.r4.f473950a.T1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).getValue()) || ((mm2.g1) business(mm2.g1.class)).C == null) ? false : true)) {
                com.tencent.mm.plugin.finder.live.widget.nq nqVar = this.f461750o;
                if (nqVar != null) {
                    nqVar.e0(hv1Var);
                    return;
                }
                return;
            }
            r45.q12 q12Var = new r45.q12();
            q12Var.set(0, 3);
            r45.n73 n73Var = new r45.n73();
            r45.n73 n73Var2 = ((mm2.g1) business(mm2.g1.class)).C;
            if (n73Var2 != null && (byteArray = n73Var2.toByteArray()) != null) {
                n73Var.parseFrom(byteArray);
            }
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).k(q12Var);
            ((mm2.o2) business(mm2.o2.class)).N6(n73Var);
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329071i).k(n73Var);
            mm2.s1 s1Var = (mm2.s1) dk2.ef.f233372a.i(mm2.s1.class);
            if (s1Var != null) {
                s1Var.S6(q12Var);
            }
        }
    }

    public final void d7(int i17) {
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.h("game_id", null);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 47L, gVar.toString(), null, 4, null);
    }

    public final void e7(r45.q12 modeInfo) {
        kotlin.jvm.internal.o.g(modeInfo, "modeInfo");
        ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).k(modeInfo);
        if (modeInfo.getInteger(0) == 1 && pm0.v.z(modeInfo.getInteger(1), 2)) {
            r45.q12 q12Var = new r45.q12();
            q12Var.set(0, java.lang.Integer.valueOf(modeInfo.getInteger(0)));
            q12Var.set(1, 1);
            modeInfo = q12Var;
        }
        mm2.s1 s1Var = (mm2.s1) dk2.ef.f233372a.i(mm2.s1.class);
        if (s1Var != null) {
            s1Var.S6(modeInfo);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        if (this.f461750o == null) {
            this.f461750o = new com.tencent.mm.plugin.finder.live.widget.nq(O6());
        }
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.f1(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.h1(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.j1(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.l1(this, pluginLayout, null), 3, null);
        if (zl2.r4.f473950a.G1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) getStore().business(mm2.g1.class)).f329068f).getValue())) {
            boolean Q6 = ((mm2.n0) business(mm2.n0.class)).Q6(xy2.c.e(O6()));
            mm2.c1 c1Var = (mm2.c1) business(mm2.c1.class);
            if (Q6 || !c1Var.l7()) {
                return;
            }
            com.tencent.mars.xlog.Log.i(this.f461748m, "[CoLive] onViewMount initial reset enableAudioModeFlag from 1 to 0 (anchor side)");
            int i17 = (int) c1Var.f328866q;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            c1Var.p8(i17 & (-257));
            c1Var.D8(0);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f461750o = null;
        ((java.util.ArrayList) this.f461751p.f461787a).clear();
    }
}
