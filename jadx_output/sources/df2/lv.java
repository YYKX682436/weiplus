package df2;

/* loaded from: classes3.dex */
public final class lv extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230720m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f230721n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f230722o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230720m = "Finder.LiveVideoBannerController";
        this.f230721n = jz5.h.b(df2.cv.f229911d);
        this.f230722o = jz5.h.b(df2.bv.f229830d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if ((r1 != null && r1.w0() == 0) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(df2.lv r10, java.lang.String r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.si> r0 = com.tencent.mm.plugin.finder.live.plugin.si.class
            com.tencent.mm.plugin.finder.live.plugin.l r1 = r10.R6(r0)
            com.tencent.mm.plugin.finder.live.plugin.si r1 = (com.tencent.mm.plugin.finder.live.plugin.si) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            int r1 = r1.w0()
            if (r1 != 0) goto L14
            r1 = r2
            goto L15
        L14:
            r1 = r3
        L15:
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.wi> r4 = com.tencent.mm.plugin.finder.live.plugin.wi.class
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.ti> r5 = com.tencent.mm.plugin.finder.live.plugin.ti.class
            if (r1 != 0) goto L41
            com.tencent.mm.plugin.finder.live.plugin.l r1 = r10.R6(r5)
            com.tencent.mm.plugin.finder.live.plugin.ti r1 = (com.tencent.mm.plugin.finder.live.plugin.ti) r1
            if (r1 == 0) goto L2b
            int r1 = r1.w0()
            if (r1 != 0) goto L2b
            r1 = r2
            goto L2c
        L2b:
            r1 = r3
        L2c:
            if (r1 != 0) goto L41
            com.tencent.mm.plugin.finder.live.plugin.l r1 = r10.R6(r4)
            com.tencent.mm.plugin.finder.live.plugin.wi r1 = (com.tencent.mm.plugin.finder.live.plugin.wi) r1
            if (r1 == 0) goto L3e
            int r1 = r1.w0()
            if (r1 != 0) goto L3e
            r1 = r2
            goto L3f
        L3e:
            r1 = r3
        L3f:
            if (r1 == 0) goto L42
        L41:
            r3 = r2
        L42:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r11 = " gameDataBannerUpdate set to visible:"
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = ",gameDynamicVisible:"
            r1.append(r11)
            r1.append(r3)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = r10.f230720m
            com.tencent.mars.xlog.Log.i(r1, r11)
            jz5.f0 r11 = jz5.f0.f302826a
            if (r12 == 0) goto Ld3
            if (r3 == 0) goto L9d
            long r6 = android.os.SystemClock.elapsedRealtime()
            jz5.g r12 = r10.f230721n
            r1 = r12
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            df2.av r1 = (df2.av) r1
            long r8 = r1.f229753a
            long r6 = r6 - r8
            r8 = 5000(0x1388, double:2.4703E-320)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L9d
            r1 = r12
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            df2.av r1 = (df2.av) r1
            long r6 = android.os.SystemClock.elapsedRealtime()
            r1.f229753a = r6
            jz5.n r12 = (jz5.n) r12
            java.lang.Object r12 = r12.getValue()
            df2.av r12 = (df2.av) r12
            int r1 = r12.f229754b
            int r1 = r1 + r2
            r12.f229754b = r1
        L9d:
            com.tencent.mm.plugin.finder.live.plugin.l r12 = r10.R6(r0)
            com.tencent.mm.plugin.finder.live.plugin.si r12 = (com.tencent.mm.plugin.finder.live.plugin.si) r12
            r0 = 8
            if (r12 == 0) goto Laa
            r12.K0(r0)
        Laa:
            com.tencent.mm.plugin.finder.live.plugin.l r12 = r10.R6(r5)
            com.tencent.mm.plugin.finder.live.plugin.ti r12 = (com.tencent.mm.plugin.finder.live.plugin.ti) r12
            if (r12 == 0) goto Lb5
            r12.K0(r0)
        Lb5:
            com.tencent.mm.plugin.finder.live.plugin.l r12 = r10.R6(r4)
            com.tencent.mm.plugin.finder.live.plugin.wi r12 = (com.tencent.mm.plugin.finder.live.plugin.wi) r12
            if (r12 == 0) goto Lc0
            r12.K0(r0)
        Lc0:
            java.lang.Class<df2.vh> r12 = df2.vh.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r10 = r10.controller(r12)
            df2.vh r10 = (df2.vh) r10
            if (r10 == 0) goto Ld3
            java.lang.Object r10 = r10.g7(r13)
            pz5.a r12 = pz5.a.f359186d
            if (r10 != r12) goto Ld3
            r11 = r10
        Ld3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lv.Z6(df2.lv, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void a7(df2.lv lvVar, java.lang.String str, boolean z17) {
        java.lang.Boolean bool;
        df2.vh vhVar = (df2.vh) lvVar.controller(df2.vh.class);
        if (vhVar != null) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView = vhVar.f231604o;
            bool = java.lang.Boolean.valueOf(finderLiveGameDataView != null ? finderLiveGameDataView.isShown() : false);
        } else {
            bool = null;
        }
        com.tencent.mars.xlog.Log.i(lvVar.f230720m, str + " set gameDynamicVisible to " + z17 + ",gameDataCardVisible:" + bool);
        if (z17) {
            if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                jz5.g gVar = lvVar.f230722o;
                if (elapsedRealtime - ((df2.av) ((jz5.n) gVar).getValue()).f229753a < 5000) {
                    ((df2.av) ((jz5.n) gVar).getValue()).f229753a = android.os.SystemClock.elapsedRealtime();
                    ((df2.av) ((jz5.n) gVar).getValue()).f229754b++;
                }
            }
            df2.vh vhVar2 = (df2.vh) lvVar.controller(df2.vh.class);
            if (vhVar2 != null) {
                vhVar2.c7("gameDynamicVisible");
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.ev(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.gv(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.iv(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.kv(this, null), 3, null);
    }
}
