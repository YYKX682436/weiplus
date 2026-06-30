package pn2;

/* loaded from: classes3.dex */
public final class f extends ie2.b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f356991q;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f356992r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f356993s;

    /* renamed from: t, reason: collision with root package name */
    public final pn2.c0 f356994t;

    /* renamed from: u, reason: collision with root package name */
    public pn2.a f356995u;

    /* renamed from: v, reason: collision with root package name */
    public pn2.c0 f356996v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f356997w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f356991q = statusMonitor;
        this.f356992r = kotlinx.coroutines.z0.b();
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f356995u = new pn2.s(context, S0(), statusMonitor);
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290982p;
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        pn2.c0 c0Var = new pn2.c0(false, root, frameBubbleContentLayout, (com.tencent.mm.ui.MMActivity) context2, this.f356995u);
        this.f356994t = c0Var;
        this.f356996v = c0Var;
        pn2.a aVar = this.f356995u;
        if (aVar != null) {
            ((pn2.s) aVar).onAttach(c0Var);
        }
        if (statusMonitor.getLiveRole() == 0) {
            android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f484710f84);
            if (findViewById != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, "finder_live_lottery_bubble");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById, 40, 25561);
            }
            android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.cjn);
            if (findViewById2 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById2, "finder_live_lottery_bubble");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById2, 8, 25561);
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "enable :" + ((on2.z2) P0(on2.z2.class)).f347096q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (kotlin.jvm.internal.o.b(r3 != null ? r3.u() : null, r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0141, code lost:
    
        if (kotlin.jvm.internal.o.b(r0 != null ? r0.u() : null, r22.f365323d) == false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(java.util.LinkedHashMap r23) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.f.C0(java.util.LinkedHashMap):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (k()) {
            if (x1()) {
                pn2.c0 c0Var = this.f356996v;
                android.view.View u17 = c0Var != null ? c0Var.u() : null;
                if (u17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(u17, "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f113327i = i17;
                return;
            }
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                this.f365323d.setVisibility(8);
                com.tencent.mars.xlog.Log.w("FinderLiveLotteryBubblePlugin", "setVisible return for isTeenMode");
                return;
            }
            android.view.View t17 = t1();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(t17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        super.K0(i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 7) {
            if (ordinal == 27) {
                pn2.a aVar = this.f356995u;
                if (aVar != null) {
                    ((pn2.s) aVar).onDetach();
                    return;
                }
                return;
            }
            if (ordinal == 147) {
                y1("FINDER_LIVE_LOTTERY_UPDATE");
                z1();
                return;
            }
            if (ordinal == 149) {
                w1();
                return;
            }
            if (ordinal != 187) {
                switch (ordinal) {
                    case 141:
                        y1("FINDER_LIVE_CREATE_LOTTERY_SUCCESS");
                        z1();
                        return;
                    case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                        y1("FINDER_LIVE_CANCEL_LOTTERY_SUCCESS");
                        z1();
                        return;
                    case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                        km2.z zVar = ((on2.z2) P0(on2.z2.class)).f347092m;
                        boolean z17 = zVar != null && zVar.f309229a == 4;
                        com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "FINDER_LIVE_LOTTERY_BUBBLE_SHOW  isCancel: " + z17 + " getVisible: " + w0() + " cacheVisibility:false,screenclear:" + ((mm2.c1) P0(mm2.c1.class)).N1);
                        y1("FINDER_LIVE_LOTTERY_BUBBLE_SHOW cacheVisibility:false");
                        if (w0() != 0 && !z17) {
                            K0(0);
                            pn2.c0 c0Var = this.f356996v;
                            if (c0Var != null) {
                                c0Var.z();
                            }
                        }
                        if (this.f356991q.getLiveRole() == 0) {
                            km2.z zVar2 = ((on2.z2) P0(on2.z2.class)).f347092m;
                            r45.cz1 cz1Var = zVar2 != null ? zVar2.f309232d : null;
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            if (cz1Var == null || (str = cz1Var.getString(0)) == null) {
                                str = "";
                            }
                            jSONObject.put("lotteryid", str);
                            pn2.a aVar2 = this.f356995u;
                            jSONObject.put("is_flash_pic", (aVar2 == null || !((pn2.s) aVar2).i()) ? 0 : 1);
                            i95.m c17 = i95.n0.c(ml2.r0.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            ml2.r0.ek((ml2.r0) c17, ml2.p4.f327794e, "", null, 0, jSONObject, 12, null);
                            return;
                        }
                        return;
                    case 144:
                        com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "FINDER_LIVE_LOTTERY_BUBBLE_HIDE cacheVisibility:false,screenclear:" + ((mm2.c1) P0(mm2.c1.class)).N1);
                        y1("FINDER_LIVE_LOTTERY_BUBBLE_HIDE cacheVisibility:false");
                        K0(8);
                        pn2.c0 c0Var2 = this.f356996v;
                        if (c0Var2 != null) {
                            c0Var2.y();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
        if (((mm2.c1) P0(mm2.c1.class)).a8() && this.f356997w) {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "auto show lottery");
            pn2.a aVar3 = this.f356995u;
            if (aVar3 != null) {
                pn2.s sVar = (pn2.s) aVar3;
                zl2.r4 r4Var = zl2.r4.f473950a;
                gk2.e eVar = sVar.f357013e;
                android.content.Context context = sVar.f357012d;
                java.lang.String string = context.getString(com.tencent.mm.R.string.f491826ec5);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.f491824ec3);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                if (r4Var.B(context, eVar, string, string2, new pn2.l(sVar))) {
                    return;
                }
                sVar.f();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        android.content.Intent intent;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unMount ");
        sb6.append(hashCode());
        sb6.append(" presenter is empty:");
        sb6.append(this.f356995u == null);
        sb6.append(",viewCallback is empty:");
        sb6.append(this.f356996v == null);
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", sb6.toString());
        super.O0();
        pn2.a aVar = this.f356995u;
        if (aVar != null) {
            ((pn2.s) aVar).onDetach();
        }
        pn2.c0 c0Var = this.f356996v;
        if (c0Var != null) {
            c0Var.y();
        }
        K0(8);
        this.f356996v = null;
        gm0.j1.d().q(30, this);
        kotlinx.coroutines.r2 r2Var = this.f356993s;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        if (this.f356997w) {
            android.content.Context context = this.f365323d.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            this.f356997w = false;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void h1(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "#onSceneEnd MMFunc_FinderFollow,isFollow:" + z17);
        if (zl2.r4.f473950a.w1() || ((mm2.d) P0(mm2.d.class)).f328942f || !((mm2.d) P0(mm2.d.class)).N6()) {
            return;
        }
        w1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 30 && i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "#onSceneEnd MMFunc_VerifyUser");
            com.tencent.mm.network.v0 reqResp = m1Var.getReqResp();
            com.tencent.mm.modelbase.o oVar = reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null;
            java.lang.Object obj = oVar != null ? oVar.f70711b.f70700a : null;
            r45.my6 my6Var = obj instanceof r45.my6 ? (r45.my6) obj : null;
            if (my6Var != null && ((mm2.d) P0(mm2.d.class)).f328942f && kotlin.jvm.internal.o.b(my6Var.f380930d, ((mm2.d) P0(mm2.d.class)).f328943g)) {
                w1();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void u1() {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        if (zl2.r4.f473950a.w1() || !((mm2.c1) P0(mm2.c1.class)).a8()) {
            return;
        }
        km2.z zVar = ((on2.z2) P0(on2.z2.class)).f347098s;
        boolean z17 = false;
        java.lang.String string = (zVar == null || (cz1Var2 = zVar.f309232d) == null) ? null : cz1Var2.getString(0);
        km2.z zVar2 = ((on2.z2) P0(on2.z2.class)).f347092m;
        if (string == null || string.length() == 0) {
            return;
        }
        if (kotlin.jvm.internal.o.b(string, (zVar2 == null || (cz1Var = zVar2.f309232d) == null) ? null : cz1Var.getString(0))) {
            if (zVar2 != null && zVar2.f309229a == 1) {
                z17 = true;
            }
            if (z17) {
                v1();
                on2.z2 z2Var = (on2.z2) P0(on2.z2.class);
                z2Var.f347098s = null;
                com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "resetCacheLotteryInfo:" + z2Var.f347098s);
            }
        }
    }

    public final void v1() {
        com.tencent.mm.plugin.finder.live.view.k0 R0 = R0();
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dot);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        R0.showCenterCustomizeToast(string, com.tencent.mm.R.raw.icons_outlined_done);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.ek((ml2.r0) c17, ml2.p4.f327805s, null, null, 0, null, 28, null);
    }

    @Override // qo0.a
    public int w0() {
        android.view.View t17;
        if (!x1()) {
            return t1().getVisibility();
        }
        pn2.c0 c0Var = this.f356996v;
        if (c0Var == null || (t17 = c0Var.u()) == null) {
            t17 = t1();
        }
        return t17.getVisibility();
    }

    public final void w1() {
        r45.cz1 cz1Var;
        r45.xy1 xy1Var;
        km2.z zVar = ((on2.z2) P0(on2.z2.class)).f347092m;
        java.lang.Integer valueOf = (zVar == null || (cz1Var = zVar.f309232d) == null || (xy1Var = (r45.xy1) cz1Var.getCustom(5)) == null) ? null : java.lang.Integer.valueOf(xy1Var.getInteger(0));
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "#finallyRequestAttendLotteryWithFollowOrReserveCondition begin , lotteryAttendType: " + valueOf);
        if ((valueOf == null || valueOf.intValue() != 4) && ((valueOf == null || valueOf.intValue() != 5) && (valueOf == null || valueOf.intValue() != 6))) {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", "#finallyRequestAttendLotteryWithFollowOrReserveCondition Condition not invalid ");
            return;
        }
        kotlinx.coroutines.r2 r2Var = this.f356993s;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f356993s = kotlinx.coroutines.l.d(this.f356992r, null, null, new pn2.c(valueOf, this, null), 3, null);
    }

    public final boolean x1() {
        boolean z17;
        java.lang.Object obj;
        xh2.i iVar;
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.getValue();
        if (cVar != null && cVar.f454533c == 1) {
            java.util.Iterator it = cVar.f454531a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((xh2.a) obj).b(), ((mm2.e1) P0(mm2.e1.class)).f328987q.f380301n)) {
                    break;
                }
            }
            xh2.a aVar = (xh2.a) obj;
            if (aVar != null && (iVar = aVar.f454521b) != null && iVar.f454555g == 2) {
                z17 = true;
                return !z17 ? true : true;
            }
        }
        z17 = false;
        return !z17 ? true : true;
    }

    public final void y1(java.lang.String str) {
        km2.z zVar = ((on2.z2) P0(on2.z2.class)).f347092m;
        if ((zVar != null ? zVar.f309232d : null) == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", str + " lotteryInfo is empty!");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        android.content.Intent intent;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mount ");
        sb6.append(hashCode());
        sb6.append(" presenter is empty:");
        sb6.append(this.f356995u == null);
        sb6.append(",viewCallback is empty:");
        sb6.append(this.f356996v == null);
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryBubblePlugin", sb6.toString());
        super.z0();
        pn2.a aVar = this.f356995u;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (aVar == null || this.f356996v == null) {
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f356995u = new pn2.s(context, S0(), this.f356991q);
            android.view.ViewGroup viewGroup2 = this.f365323d;
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = this.f290982p;
            android.content.Context context2 = viewGroup2.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f356996v = new pn2.c0(false, viewGroup2, frameBubbleContentLayout, (com.tencent.mm.ui.MMActivity) context2, this.f356995u);
        }
        pn2.a aVar2 = this.f356995u;
        if (aVar2 != null) {
            pn2.c0 c0Var = this.f356996v;
            kotlin.jvm.internal.o.d(c0Var);
            ((pn2.s) aVar2).onAttach(c0Var);
        }
        gm0.j1.d().a(30, this);
        android.content.Context context3 = viewGroup.getContext();
        java.lang.Integer num = null;
        android.app.Activity activity = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            num = java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0));
        }
        if (num != null && num.intValue() == 12) {
            this.f356997w = true;
        }
    }

    public final void z1() {
        pm0.v.X(new pn2.e(this));
    }
}
