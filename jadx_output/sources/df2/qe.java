package df2;

/* loaded from: classes3.dex */
public final class qe extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f231158m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f231159n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.f1 f231160o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(java.util.List data) {
        android.widget.ImageView j17;
        xt2.m6 m6Var;
        android.widget.ImageView j18;
        android.view.View f17;
        android.view.View f18;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.live.plugin.g b76 = b7();
        if (b76 != null) {
            java.util.Iterator it = data.iterator();
            while (it.hasNext()) {
                r45.xm1 xm1Var = (r45.xm1) it.next();
                boolean z17 = ((xt2.m6) b76.u1().get(java.lang.Integer.valueOf(xm1Var.getInteger(0)))) != null;
                pf5.u uVar = pf5.u.f353936a;
                if (z17) {
                    java.lang.String string = xm1Var.getString(2);
                    if (string == null || string.length() == 0) {
                        xt2.m6 m6Var2 = (xt2.m6) b76.u1().get(java.lang.Integer.valueOf(xm1Var.getInteger(0)));
                        if (m6Var2 != null && (f18 = m6Var2.f()) != null) {
                            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.qf0(f18, b76.f112614r));
                        }
                    } else {
                        xt2.m6 m6Var3 = (xt2.m6) b76.u1().get(java.lang.Integer.valueOf(xm1Var.getInteger(0)));
                        if (m6Var3 != null && (f17 = m6Var3.f()) != null) {
                            java.lang.String string2 = xm1Var.getString(2);
                            if (string2 == null) {
                                string2 = "";
                            }
                            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).M).getValue()).a(new mn2.n(string2, null, 2, null));
                            a17.f447873d = new com.tencent.mm.plugin.finder.live.plugin.nf0(string2, f17);
                            a17.f();
                        }
                    }
                }
                java.lang.String string3 = xm1Var.getString(1);
                if (string3 == null || string3.length() == 0) {
                    if2.z zVar = if2.z.f291153a;
                    qo0.c cVar = b76.f113325g;
                    kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
                    int ordinal = zVar.c((com.tencent.mm.plugin.finder.live.view.k0) cVar).ordinal();
                    java.lang.Integer num = (java.lang.Integer) ((ordinal == 1 || ordinal == 2) ? b76.f112612p : b76.f112613q).get(java.lang.Integer.valueOf(xm1Var.getInteger(0)));
                    if (num != null && (m6Var = (xt2.m6) b76.u1().get(java.lang.Integer.valueOf(xm1Var.getInteger(0)))) != null && (j18 = m6Var.j()) != null) {
                        android.view.ViewGroup viewGroup = b76.f365323d;
                        android.graphics.drawable.Drawable drawable = viewGroup.getContext().getResources().getDrawable(num.intValue());
                        com.tencent.mm.ui.uk.f(drawable, viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                        j18.setImageDrawable(drawable);
                    }
                } else {
                    xt2.m6 m6Var4 = (xt2.m6) b76.u1().get(java.lang.Integer.valueOf(xm1Var.getInteger(0)));
                    if (m6Var4 != null && (j17 = m6Var4.j()) != null) {
                        java.lang.String string4 = xm1Var.getString(1);
                        wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(string4, com.tencent.mm.plugin.finder.storage.y90.f128356f));
                        a18.f447873d = new com.tencent.mm.plugin.finder.live.plugin.pf0(string4, j17);
                        a18.f();
                    }
                }
                ((mm2.c1) b76.P0(mm2.c1.class)).f328821i4.put(java.lang.Integer.valueOf(xm1Var.getInteger(0)), xm1Var);
                int integer = xm1Var.getInteger(0);
                if (integer == 15) {
                    ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                    ml2.h5 h5Var = ml2.h5.f327538v;
                    java.lang.String string5 = xm1Var.getString(1);
                    java.lang.String string6 = xm1Var.getString(2);
                    kotlin.jvm.internal.o.d(r0Var);
                    c50.c1.gb(r0Var, h5Var, "", 0, null, string6, string5, 8, null);
                } else if (integer == 16) {
                    ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
                    ml2.f4 f4Var = ml2.f4.F;
                    java.lang.String string7 = xm1Var.getString(1);
                    java.lang.String string8 = xm1Var.getString(2);
                    kotlin.jvm.internal.o.d(r0Var2);
                    ml2.r0.Dj(r0Var2, f4Var, null, null, null, null, null, 0, 0L, null, null, string8, string7, false, null, 13304, null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(java.util.LinkedList r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qe.a7(java.util.LinkedList, boolean):void");
    }

    public final com.tencent.mm.plugin.finder.live.plugin.g b7() {
        if2.z zVar = if2.z.f291153a;
        java.lang.Object obj = this.f291099e;
        int ordinal = zVar.c(obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null).ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return (com.tencent.mm.plugin.finder.live.plugin.g) R6(com.tencent.mm.plugin.finder.live.plugin.c4.class);
        }
        if (ordinal != 3) {
            return null;
        }
        return (com.tencent.mm.plugin.finder.live.plugin.g) R6(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c7(r45.xm1 r17, java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qe.c7(r45.xm1, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d5, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:5:0x000e, B:8:0x0019, B:10:0x0027, B:15:0x0033, B:19:0x00d9, B:61:0x0060, B:63:0x0066, B:65:0x0074, B:70:0x0080, B:74:0x00ac), top: B:4:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0080 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:5:0x000e, B:8:0x0019, B:10:0x0027, B:15:0x0033, B:19:0x00d9, B:61:0x0060, B:63:0x0066, B:65:0x0074, B:70:0x0080, B:74:0x00ac), top: B:4:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qe.d7():void");
    }

    public final void e7() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("LiveButtonChangeController", "startJob", null);
        kotlinx.coroutines.r2 r2Var = this.f231159n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f231159n = com.tencent.mm.plugin.finder.live.util.y.o(this, kotlinx.coroutines.q1.f310570c, null, new df2.pe(this, null), 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        java.util.LinkedList list;
        if (r71Var == null || (list = r71Var.getList(15)) == null) {
            return;
        }
        a7(list, false);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        java.util.LinkedList list;
        if (hc1Var == null || (list = hc1Var.getList(9)) == null) {
            return;
        }
        a7(list, true);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        for (java.util.Map.Entry entry : ((mm2.c1) business(mm2.c1.class)).f328826j4.entrySet()) {
            r45.vm1 vm1Var = (r45.vm1) ((jz5.l) entry.getValue()).f302833d;
            java.lang.Object obj = ((jz5.l) entry.getValue()).f302834e;
            com.tencent.mm.plugin.finder.live.plugin.g b76 = b7();
            if (b76 != null) {
                b76.A1(vm1Var, obj, false);
            }
        }
        e7();
        d7();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = ((mm2.c1) business(mm2.c1.class)).f328821i4;
        java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.size());
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((r45.xm1) ((java.util.Map.Entry) it.next()).getValue());
        }
        Z6(arrayList);
    }
}
