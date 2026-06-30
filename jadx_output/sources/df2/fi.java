package df2;

/* loaded from: classes3.dex */
public final class fi extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230143m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f230144n;

    /* renamed from: o, reason: collision with root package name */
    public r45.n73 f230145o;

    /* renamed from: p, reason: collision with root package name */
    public int f230146p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230143m = "LiveGameModePreviewController";
        this.f230146p = -1;
    }

    public final mn2.c1 Z6(java.lang.String str) {
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String str2 = str == null ? "" : str;
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(str2).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b(replaceAll.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(replaceAll);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        return new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
    }

    public final android.graphics.Bitmap a7() {
        return this.f230144n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if ((r0.length() > 0) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b7(r45.n73 r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getGameBgUrl live_cover_url="
            r0.<init>(r1)
            r1 = 3
            com.tencent.mm.protobuf.f r2 = r8.getCustom(r1)
            r45.s63 r2 = (r45.s63) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L17
            java.lang.String r2 = r2.getString(r4)
            goto L18
        L17:
            r2 = r3
        L18:
            r0.append(r2)
            java.lang.String r2 = ", default_live_cover_url = "
            r0.append(r2)
            com.tencent.mm.protobuf.f r2 = r8.getCustom(r4)
            r45.z53 r2 = (r45.z53) r2
            r5 = 9
            if (r2 == 0) goto L2f
            java.lang.String r2 = r2.getString(r5)
            goto L30
        L2f:
            r2 = r3
        L30:
            r0.append(r2)
            java.lang.String r2 = ", icon_url = "
            r0.append(r2)
            com.tencent.mm.protobuf.f r2 = r8.getCustom(r4)
            r45.z53 r2 = (r45.z53) r2
            r6 = 2
            if (r2 == 0) goto L46
            java.lang.String r2 = r2.getString(r6)
            goto L47
        L46:
            r2 = r3
        L47:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r7.f230143m
            com.tencent.mars.xlog.Log.i(r2, r0)
            com.tencent.mm.protobuf.f r0 = r8.getCustom(r1)
            r45.s63 r0 = (r45.s63) r0
            r1 = 0
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.getString(r4)
            if (r0 == 0) goto L71
            int r2 = r0.length()
            if (r2 <= 0) goto L6a
            r2 = r4
            goto L6b
        L6a:
            r2 = r1
        L6b:
            if (r2 == 0) goto L6e
            goto L6f
        L6e:
            r0 = r3
        L6f:
            if (r0 != 0) goto L99
        L71:
            com.tencent.mm.protobuf.f r0 = r8.getCustom(r4)
            r45.z53 r0 = (r45.z53) r0
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.getString(r5)
            if (r0 == 0) goto L89
            int r2 = r0.length()
            if (r2 <= 0) goto L86
            r1 = r4
        L86:
            if (r1 == 0) goto L89
            goto L8a
        L89:
            r0 = r3
        L8a:
            if (r0 != 0) goto L99
            com.tencent.mm.protobuf.f r8 = r8.getCustom(r4)
            r45.z53 r8 = (r45.z53) r8
            if (r8 == 0) goto L9a
            java.lang.String r3 = r8.getString(r6)
            goto L9a
        L99:
            r3 = r0
        L9a:
            if (r3 != 0) goto L9e
            java.lang.String r3 = ""
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.fi.b7(r45.n73):java.lang.String");
    }

    public final void c7(java.lang.String str) {
        wo0.c a17;
        com.tencent.mars.xlog.Log.i(this.f230143m, "onGameChange bitmapUrl=" + str);
        boolean f76 = ((mm2.e1) business(mm2.e1.class)).f7();
        pf5.u uVar = pf5.u.f353936a;
        if (f76) {
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).P).getValue());
            java.lang.String a18 = com.tencent.mm.ui.tools.qd.a(str, "andblur=true");
            kotlin.jvm.internal.o.f(a18, "safelyUrlConcatParam(...)");
            a17 = d1Var.a(Z6(a18));
        } else {
            a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(Z6(str));
        }
        df2.xh xhVar = new df2.xh(this);
        a17.getClass();
        a17.f447873d = xhVar;
        a17.f();
    }

    public final void d7(r45.q12 q12Var) {
        int i17;
        android.view.View S6 = S6(com.tencent.mm.R.id.opb);
        if (S6 == null) {
            return;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.T1(q12Var) || ((mm2.e1) business(mm2.e1.class)).f7()) {
            if (this.f230146p == -1) {
                this.f230146p = com.tencent.mm.ui.bl.c(O6());
            }
            android.view.View S62 = S6(com.tencent.mm.R.id.opb);
            if (S62 != null) {
                r4Var.f(this.f230143m, S62, false, false, this.f230146p);
            }
            i17 = 0;
        } else {
            i17 = 8;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGameModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(S6, "com/tencent/mm/plugin/finder/live/controller/LiveGameModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e7() {
        r45.q12 q12Var;
        java.lang.String string;
        boolean T7 = ((mm2.c1) business(mm2.c1.class)).T7();
        boolean f76 = ((mm2.e1) business(mm2.e1.class)).f7();
        com.tencent.mars.xlog.Log.i(this.f230143m, "#setupCoverForScreenCastGame isLiveBefore=" + T7 + " isScreenCastGameMode=" + f76);
        if (T7 || !f76 || (q12Var = ((mm2.e1) business(mm2.e1.class)).f328989s) == null) {
            return;
        }
        r45.n73 n73Var = this.f230145o;
        if (n73Var != null) {
            d7(q12Var);
            c7(b7(n73Var));
            return;
        }
        r45.xq1 xq1Var = ((mm2.c1) business(mm2.c1.class)).C2;
        if (xq1Var == null || (string = xq1Var.getString(2)) == null) {
            return;
        }
        if (!(string.length() > 0)) {
            string = null;
        }
        if (string != null) {
            pq5.g l17 = new ke2.y(string, 0, false, null, false, null, 60, null).l();
            l17.f((com.tencent.mm.ui.MMActivity) O6());
            l17.K(new df2.ei(this, string, q12Var));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        com.tencent.mars.xlog.Log.i(this.f230143m, "#onLiveStart");
        e7();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mars.xlog.Log.i(this.f230143m, "#onViewMount");
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.zh(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.bi(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.di(this, null), 3, null);
        e7();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
    }
}
