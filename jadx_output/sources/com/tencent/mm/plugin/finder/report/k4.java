package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public class k4 extends com.tencent.mm.plugin.finder.report.r0 {
    public static final com.tencent.mm.plugin.finder.report.b4 E = new com.tencent.mm.plugin.finder.report.b4(null);
    public java.util.HashSet A;
    public java.util.HashMap B;
    public final java.util.concurrent.ConcurrentHashMap C;
    public long D;

    /* renamed from: u */
    public final java.util.concurrent.ConcurrentLinkedQueue f125103u;

    /* renamed from: v */
    public final java.util.concurrent.ConcurrentLinkedQueue f125104v;

    /* renamed from: w */
    public final com.tencent.mm.plugin.finder.report.h f125105w;

    /* renamed from: x */
    public final com.tencent.mm.plugin.finder.report.u0 f125106x;

    /* renamed from: y */
    public com.tencent.mm.plugin.finder.report.n4 f125107y;

    /* renamed from: z */
    public com.tencent.mm.plugin.finder.report.n4 f125108z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f125103u = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f125104v = new java.util.concurrent.ConcurrentLinkedQueue();
        com.tencent.mm.plugin.finder.report.h hVar = new com.tencent.mm.plugin.finder.report.h();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hVar.f125056a = 0;
        this.f125105w = hVar;
        this.f125106x = new com.tencent.mm.plugin.finder.report.u0(v65.m.b(activity), contextObj);
        this.A = new java.util.HashSet();
        this.B = new java.util.HashMap();
        this.C = new java.util.concurrent.ConcurrentHashMap();
    }

    public static void S0(com.tencent.mm.plugin.finder.report.k4 k4Var, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkEmptyToHotTabExpose");
        }
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        k4Var.getClass();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).yj(1, i17, i18, k4Var.f125284h);
    }

    public static /* synthetic */ void c1(com.tencent.mm.plugin.finder.report.k4 k4Var, com.tencent.mm.plugin.finder.report.n4 n4Var, r45.vd6 vd6Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportCenterRecord");
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        k4Var.b1(n4Var, vd6Var, z17);
    }

    public static /* synthetic */ void j1(com.tencent.mm.plugin.finder.report.k4 k4Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendExtStatsReport");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        k4Var.i1(str, z17);
    }

    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return super.F0(dispatcher, event) || (event instanceof com.tencent.mm.plugin.finder.report.y5) || (event instanceof fc2.w) || (event instanceof ec2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:373:0x099e, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0a82, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0be9, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0cc1, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0de7, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0e7c, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0eda, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0f6d, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0fcc, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x1059, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x10b8, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x1115, code lost:
    
        if ((r1.r() == r0.d()) != false) goto L1540;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:388:0x1219  */
    /* JADX WARN: Removed duplicated region for block: B:390:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:724:0x12d8  */
    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G0(fc2.a r52) {
        /*
            Method dump skipped, instructions count: 5551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.k4.G0(fc2.a):void");
    }

    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void H0() {
        Y0();
        super.H0();
    }

    @Override // com.tencent.mm.plugin.finder.report.r0
    public void I0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
        this.f125286m.f125229a = true;
    }

    @Override // com.tencent.mm.plugin.finder.report.r0
    public void O0() {
        this.f125289p = false;
        Y0();
    }

    @Override // com.tencent.mm.plugin.finder.report.r0
    public void Q0() {
        java.util.LinkedList linkedList;
        this.f125289p = true;
        com.tencent.mm.ui.MMFragmentActivity context = this.f125283g;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (linkedList = nyVar.I1) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((java.lang.ref.WeakReference) it.next()).get();
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.A0();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.report.r0
    public java.util.LinkedList R0() {
        java.util.LinkedList linkedList;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f125103u;
        int size = concurrentLinkedQueue.size();
        com.tencent.mm.ui.MMFragmentActivity activity = this.f125283g;
        if (size > 0) {
            linkedList = new java.util.LinkedList(concurrentLinkedQueue);
            concurrentLinkedQueue.clear();
            com.tencent.mm.plugin.finder.report.w4.f125422a.b(linkedList, this.f125284h, 0);
            if (activity.getIntent().getBooleanExtra("is_report_feed", false) || activity.getIntent().getBooleanExtra("is_report_feed_immediate", false)) {
                com.tencent.mm.plugin.finder.report.s3.f125345a.a(linkedList);
            }
        } else {
            linkedList = new java.util.LinkedList();
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar = (com.tencent.mm.plugin.finder.viewmodel.component.nc) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.nc.class);
        if (ncVar != null) {
            ncVar.T6(linkedList);
        }
        return linkedList;
    }

    public final void T0() {
        fc2.o Z6;
        java.lang.String str;
        int i17;
        int i18;
        java.lang.String str2;
        com.tencent.mm.ui.MMFragmentActivity context = this.f125283g;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            if (!nyVar.n7()) {
                nyVar = null;
            }
            if (nyVar == null || (Z6 = nyVar.Z6(-1)) == null || Z6.f260960e > 1) {
                return;
            }
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLWxBubble");
            if (L0 != null) {
                int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
                int r18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
                int r19 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
                int r27 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
                java.lang.String str3 = "2";
                if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1) {
                    int i19 = r18 > 0 ? 1 : 0;
                    if (r17 > 0) {
                        i19 |= 8;
                    }
                    if (r19 > 0) {
                        i19 |= 2;
                    }
                    if (r27 > 0) {
                        i19 |= 4;
                    }
                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).getClass();
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
                    int S6 = finderHomeUIC != null ? finderHomeUIC.S6() : 0;
                    if (S6 == 1) {
                        str2 = "7";
                    } else if (S6 == 2) {
                        str2 = "9";
                    } else if (S6 == 3) {
                        str2 = "6";
                    } else if (S6 != 4) {
                        if (S6 == 35) {
                            str2 = com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT;
                        }
                        i17 = 5;
                        i18 = i19;
                    } else {
                        str2 = "8";
                    }
                    str3 = str2;
                    i17 = 5;
                    i18 = i19;
                } else {
                    i17 = 1;
                    i18 = 1;
                }
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3.uj((com.tencent.mm.plugin.finder.report.o3) c17, str3, i17, 1, 2, i18, r17 + r18 + r19 + r27, L0.field_tipsId, null, 0L, this.f125284h, 0, 0, 3456, null);
                str = str3;
            } else {
                str = "";
            }
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLWxBubble");
            if (L0 == null || I0 == null) {
                return;
            }
            com.tencent.mm.plugin.finder.report.x2.i(com.tencent.mm.plugin.finder.report.x2.f125429a, str, L0, I0, 1, this.f125284h, 0, null, 0, 0, 480, null);
        }
    }

    public final void U0() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : this.B.entrySet()) {
            r45.vd6 f17 = f1((com.tencent.mm.plugin.finder.report.n4) entry.getValue());
            com.tencent.mm.plugin.finder.report.n4 n4Var = this.f125107y;
            boolean z17 = false;
            if (n4Var != null && ((java.lang.Number) entry.getKey()).longValue() == n4Var.f125153a) {
                z17 = true;
            }
            if (!z17) {
                linkedList.add(f17);
            }
        }
        com.tencent.mm.plugin.finder.report.n4 n4Var2 = this.f125107y;
        if (n4Var2 != null) {
            linkedList.add(f1(n4Var2));
        }
        com.tencent.mm.plugin.finder.report.s3.f125345a.a(linkedList);
    }

    public final java.util.Map V0(java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String input : map.keySet()) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("([A-Z])");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            kotlin.jvm.internal.o.g(input, "input");
            java.lang.String replaceAll = compile.matcher(input).replaceAll("_$1");
            kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
            java.lang.String lowerCase = replaceAll.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            java.lang.Object obj = map.get(input);
            if (obj instanceof java.util.Map) {
                obj = V0(kotlin.jvm.internal.m0.c(obj));
            } else if (obj instanceof byte[]) {
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
                kotlin.jvm.internal.o.f(forName, "forName(...)");
                obj = new java.lang.String((byte[]) obj, forName);
            }
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Any");
            hashMap.put(lowerCase, obj);
        }
        return hashMap;
    }

    public final int W0(java.lang.String str) {
        try {
            return new org.json.JSONObject(str).optInt("feedActionType", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderSingleFeedFlowReporter", "getActionTypeFromJson failed, error = " + e17.getMessage());
            return -1;
        }
    }

    public final boolean X0(int i17) {
        return i17 == 0 || i17 == 1 || i17 == 2 || i17 == 3 || i17 == 6 || i17 == 8 || i17 == 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y0() {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.report.i4 r0 = new com.tencent.mm.plugin.finder.report.i4
            r0.<init>(r4)
            java.lang.String r1 = "FinderReporterThread"
            pm0.v.O(r1, r0)
            com.tencent.mm.plugin.finder.report.n4 r0 = r4.f125107y
            if (r0 == 0) goto L1d
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r0.f125159d
            if (r1 == 0) goto L1d
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            if (r1 == 0) goto L1d
            int r1 = r1.getAdFlag()
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r2 = 1
            if (r1 != r2) goto L35
            com.tencent.mm.plugin.finder.feed.model.f r1 = com.tencent.mm.plugin.finder.feed.model.p.f108235a
            if (r0 == 0) goto L28
            long r2 = r0.f125153a
            goto L2a
        L28:
            r2 = 0
        L2a:
            com.tencent.mm.plugin.finder.feed.model.internal.a r0 = r1.c(r2)
            boolean r1 = r0 instanceof com.tencent.mm.plugin.finder.feed.model.a
            if (r1 == 0) goto L35
            com.tencent.mm.plugin.finder.feed.model.a r0 = (com.tencent.mm.plugin.finder.feed.model.a) r0
            goto L36
        L35:
            r0 = 0
        L36:
            if (r0 == 0) goto L42
            java.lang.String r0 = "Finder.AdMutualCache"
            java.lang.String r1 = "startExpose"
            com.tencent.mars.xlog.Log.i(r0, r1)
            c01.id.c()
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.k4.Y0():void");
    }

    public final void Z0(int i17) {
        java.util.Vector vector;
        com.tencent.mm.ui.MMFragmentActivity activity = this.f125283g;
        if ((activity instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) || i17 != 5) {
            com.tencent.mm.plugin.finder.report.n4 n4Var = this.f125107y;
            if (n4Var != null && (vector = n4Var.f125156b0) != null) {
                vector.add(java.lang.Integer.valueOf(i17));
            }
            kotlin.jvm.internal.o.g(activity, "activity");
            sc2.a8 a8Var = (sc2.a8) pf5.z.f353948a.a(activity).e(sc2.a8.class);
            if (a8Var != null) {
                a8Var.m7(i17, false);
            }
        }
    }

    public final void a1(com.tencent.mm.plugin.finder.report.n4 n4Var, int i17, boolean z17, long j17) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = n4Var.f125159d;
        if (finderItem != null && finderItem.getMediaType() == 2) {
            long j18 = j17 - n4Var.f125175l[n4Var.f125183p];
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordSinglePicStat index ");
            sb6.append(i17);
            sb6.append(" duration ");
            sb6.append(j18);
            sb6.append(" isManual ");
            sb6.append(!z17);
            sb6.append(" feedPos ");
            sb6.append(n4Var.f125169i);
            com.tencent.mars.xlog.Log.i("Finder.FinderSingleFeedFlowReporter", sb6.toString());
            java.util.LinkedList linkedList = n4Var.f125158c0;
            r45.p66 p66Var = new r45.p66();
            p66Var.set(0, java.lang.Integer.valueOf(i17));
            p66Var.set(1, java.lang.Integer.valueOf((int) j18));
            p66Var.set(2, java.lang.Boolean.valueOf(!z17));
            linkedList.add(p66Var);
        }
    }

    public final void b1(com.tencent.mm.plugin.finder.report.n4 n4Var, r45.vd6 vd6Var, boolean z17) {
        com.tencent.mm.plugin.finder.report.o0 o0Var;
        ec2.b bVar;
        com.tencent.mm.plugin.finder.report.m4 m4Var;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        r45.vx0 vx0Var;
        r45.nw1 liveInfo;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        ec2.b bVar2;
        r45.cl2 cl2Var;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = n4Var.f125159d;
        if ((finderItem == null || finderItem.isUrlValid()) ? false : true) {
            return;
        }
        int i17 = n4Var.f125185q;
        com.tencent.mm.plugin.finder.report.o0 o0Var2 = com.tencent.mm.plugin.finder.report.r0.f125279q;
        if (i17 > 0) {
            o0Var = o0Var2;
            com.tencent.mm.plugin.finder.report.o0.b(o0Var2, this.f125284h, n4Var.f125153a, n4Var.f125155b, 5, java.lang.String.valueOf(i17), n4Var.f125167h, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        } else {
            o0Var = o0Var2;
        }
        long j17 = n4Var.f125173k - n4Var.f125157c;
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        int integer = this.f125284h.getInteger(5);
        java.lang.String str = n4Var.f125155b;
        long j18 = n4Var.f125153a;
        java.lang.String t17 = r26.i0.t(o3Var.ek(j18, str, integer), ",", ";", false);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[10];
        lVarArr[0] = new jz5.l("feed_stay_time", java.lang.Long.valueOf(j17));
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(j18));
        lVarArr[2] = new jz5.l("session_buffer", t17);
        lVarArr[3] = new jz5.l("behaviour_session_id", this.f125284h.getString(0));
        lVarArr[4] = new jz5.l("finder_context_id", this.f125284h.getString(1));
        lVarArr[5] = new jz5.l("finder_tab_context_id", this.f125284h.getString(2));
        lVarArr[6] = new jz5.l("extra_info", this.f125284h.getString(11));
        lVarArr[7] = new jz5.l("enter_source_info", this.f125284h.getString(12));
        lVarArr[8] = new jz5.l("comment_scene", java.lang.Integer.valueOf(this.f125284h.getInteger(5)));
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = n4Var.f125159d;
        lVarArr[9] = new jz5.l("finder_username", finderItem2 != null ? finderItem2.getUserName() : null);
        ((cy1.a) rVar).Cj("finder_feed_stay", null, kz5.c1.k(lVarArr), 24617);
        if (finderItem2 == null || (feedObject2 = finderItem2.getFeedObject()) == null) {
            bVar = null;
        } else {
            if (hc2.o0.D(feedObject2, true)) {
                r45.dm2 object_extend2 = feedObject2.getObject_extend();
                bVar2 = new ec2.b(java.lang.Boolean.valueOf((object_extend2 == null || (cl2Var = (r45.cl2) object_extend2.getCustom(4)) == null) ? false : cl2Var.getBoolean(9)));
            } else {
                bVar2 = null;
            }
            bVar = bVar2;
        }
        int i18 = n4Var.f125180n0;
        com.tencent.mm.plugin.finder.report.o0.b(o0Var, this.f125284h, n4Var.f125153a, n4Var.f125155b, 2, java.lang.String.valueOf(j17), 0L, n4Var.f125154a0, i18 != 0 ? new ec2.c(0, false, false, 0, 0L, i18, 31, null) : null, bVar, 32, null);
        int i19 = n4Var.f125189t;
        if (i19 > 0) {
            com.tencent.mm.plugin.finder.report.o0.b(o0Var, this.f125284h, n4Var.f125153a, n4Var.f125155b, 11, java.lang.String.valueOf(i19), n4Var.f125167h, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        }
        r45.qt2 qt2Var = this.f125284h;
        long j19 = n4Var.f125153a;
        java.lang.String str2 = n4Var.f125155b;
        r45.oi oiVar = (r45.oi) vd6Var.getCustom(1);
        com.tencent.mm.plugin.finder.report.o0.b(o0Var, qt2Var, j19, str2, 3, java.lang.String.valueOf(oiVar != null ? java.lang.Long.valueOf(oiVar.getLong(0)) : ""), n4Var.f125167h, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, n4Var.V);
        jSONObject.put("isPause", n4Var.O);
        jSONObject.put("isSeek", n4Var.P);
        jSONObject.put("playProgressInfo", n4Var.Q);
        jSONObject.put("maxPlayPercent", n4Var.f125189t);
        jSONObject.put("maxPlayLength", n4Var.f125188s);
        jSONObject.put("videoDuration", n4Var.W);
        jSONObject.put("playTime", n4Var.L);
        jSONObject.put("realPlayTime", n4Var.f125152J);
        jSONObject.put("voiceInfo", n4Var.U);
        jSONObject.put("playFormat", n4Var.X);
        jSONObject.put("firstPlay", n4Var.f125160d0);
        jSONObject.put("playWaitingCount", n4Var.f125162e0);
        jSONObject.put("firstFrameTime", n4Var.f125164f0);
        jSONObject.put("firstLoadTime", n4Var.f125166g0);
        jSONObject.put("hitPreload", n4Var.f125168h0);
        jSONObject.put("hitPreloadPercent", n4Var.f125170i0);
        jSONObject.put("playFileFormat", n4Var.f125172j0);
        jSONObject.put("downloadSpeed", n4Var.f125174k0);
        jSONObject.put("videoBitrate", n4Var.f125176l0);
        r45.qt2 qt2Var2 = this.f125284h;
        long j27 = n4Var.f125153a;
        java.lang.String str3 = n4Var.f125155b;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.finder.report.o0.b(o0Var, qt2Var2, j27, str3, 17, r26.i0.t(jSONObject2, ",", ";", false), n4Var.f125167h, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr2 = new jz5.l[19];
        lVarArr2[0] = new jz5.l("is_Pause", java.lang.Integer.valueOf(n4Var.O));
        lVarArr2[1] = new jz5.l("is_Seek", java.lang.Integer.valueOf(n4Var.P));
        lVarArr2[2] = new jz5.l("play_progress_info", n4Var.Q);
        lVarArr2[3] = new jz5.l("max_play_percent", java.lang.Integer.valueOf(n4Var.f125189t));
        lVarArr2[4] = new jz5.l("max_play_length", java.lang.Integer.valueOf(n4Var.f125188s));
        lVarArr2[5] = new jz5.l("video_duration", java.lang.Integer.valueOf(n4Var.W));
        lVarArr2[6] = new jz5.l("play_time", java.lang.Long.valueOf(n4Var.L));
        lVarArr2[7] = new jz5.l("real_play_time", java.lang.Long.valueOf(n4Var.f125152J));
        lVarArr2[8] = new jz5.l("voice_info", n4Var.U);
        lVarArr2[9] = new jz5.l("play_format", n4Var.X);
        lVarArr2[10] = new jz5.l("feed_id", pm0.v.u(j18));
        lVarArr2[11] = new jz5.l("session_buffer", t17);
        lVarArr2[12] = new jz5.l("behaviour_session_id", this.f125284h.getString(0));
        lVarArr2[13] = new jz5.l("finder_context_id", this.f125284h.getString(1));
        lVarArr2[14] = new jz5.l("finder_tab_context_id", this.f125284h.getString(2));
        lVarArr2[15] = new jz5.l("extra_info", this.f125284h.getString(11));
        lVarArr2[16] = new jz5.l("enter_source_info", this.f125284h.getString(12));
        lVarArr2[17] = new jz5.l("comment_scene", java.lang.Integer.valueOf(this.f125284h.getInteger(5)));
        lVarArr2[18] = new jz5.l("finder_username", finderItem2 != null ? finderItem2.getUserName() : null);
        ((cy1.a) rVar2).Cj("finder_feed_video_play", null, kz5.c1.k(lVarArr2), 24617);
        com.tencent.mm.plugin.finder.report.o0 o0Var3 = o0Var;
        o0Var3.c(this.f125284h, n4Var, 1);
        o0Var3.f(this.f125284h, n4Var);
        java.util.Map V0 = V0(d75.b.e(vd6Var.toJSON(), new com.tencent.mm.plugin.finder.report.d4(this)));
        java.util.HashMap hashMap = (java.util.HashMap) V0;
        hashMap.put("feed_id", pm0.v.u(j18));
        java.lang.String string = this.f125284h.getString(1);
        kotlin.jvm.internal.o.e(string, "null cannot be cast to non-null type kotlin.String");
        hashMap.put("finder_context_id", string);
        java.lang.String string2 = this.f125284h.getString(2);
        kotlin.jvm.internal.o.e(string2, "null cannot be cast to non-null type kotlin.String");
        hashMap.put("finder_tab_context_id", string2);
        java.lang.String string3 = this.f125284h.getString(11);
        kotlin.jvm.internal.o.e(string3, "null cannot be cast to non-null type kotlin.String");
        hashMap.put("extra_info", string3);
        hashMap.put("comment_scene", java.lang.Integer.valueOf(this.f125284h.getInteger(5)));
        hashMap.put("media_type", java.lang.Integer.valueOf(finderItem2 != null ? finderItem2.getMediaType() : 10000));
        hashMap.put("live_id", java.lang.Long.valueOf((finderItem2 == null || (liveInfo = finderItem2.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0)));
        hashMap.put("collection_id", pm0.v.u((finderItem2 == null || (feedObject = finderItem2.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) ? 0L : vx0Var.getLong(0)));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("finder_feed_item_view", "view_unexp", V0, 1, false);
        if (z17) {
            e1();
        }
        if (finderItem2 != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = finderItem2.isImageFeed() ? finderItem2 : null;
            if (finderItem3 != null) {
                com.tencent.mm.plugin.finder.report.m4 m4Var2 = (com.tencent.mm.plugin.finder.report.m4) kz5.n0.k0(n4Var.f125184p0);
                if ((m4Var2 != null && m4Var2.f125136e == 0) && (m4Var = (com.tencent.mm.plugin.finder.report.m4) kz5.n0.k0(n4Var.f125184p0)) != null) {
                    m4Var.f125136e = (int) (android.os.SystemClock.elapsedRealtime() - m4Var.f125133b);
                }
                jz5.l[] lVarArr3 = new jz5.l[9];
                lVarArr3[0] = new jz5.l("finder_tab_context_id", this.f125284h.getString(2));
                lVarArr3[1] = new jz5.l("finder_context_id", this.f125284h.getString(1));
                lVarArr3[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(this.f125284h.getInteger(5)));
                lVarArr3[3] = new jz5.l("feed_id", pm0.v.u(finderItem3.getId()));
                lVarArr3[4] = new jz5.l("session_buffer", t17);
                lVarArr3[5] = new jz5.l("picture_num", java.lang.Integer.valueOf(finderItem3.getMediaList().size()));
                lVarArr3[6] = new jz5.l("view_picture_cnts", java.lang.Integer.valueOf(n4Var.f125184p0.size()));
                java.util.LinkedList<com.tencent.mm.plugin.finder.report.m4> linkedList = n4Var.f125184p0;
                kotlin.jvm.internal.o.g(linkedList, "<this>");
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.tencent.mm.plugin.finder.report.m4 m4Var3 : linkedList) {
                    m4Var3.getClass();
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("come_way", m4Var3.f125134c);
                    jSONObject3.put("view_idx", m4Var3.f125135d);
                    jSONObject3.put("stay_time_ms", m4Var3.f125136e);
                    jSONObject3.put("is_zoom_in", 0);
                    jSONObject3.put("is_pause", m4Var3.f125137f);
                    jSONObject3.put("is_speed_up", m4Var3.f125138g);
                    jSONArray.put(jSONObject3);
                }
                java.lang.String jSONArray2 = jSONArray.toString();
                kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
                lVarArr3[7] = new jz5.l("view_infos", jSONArray2);
                lVarArr3[8] = new jz5.l("all_stay_time_ms", java.lang.Long.valueOf(j17));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("finder_photo_feed_item", "view_unexp", kz5.c1.k(lVarArr3), 1, false);
            }
        }
        if (finderItem2 != null) {
            finderItem2.isImageFeed();
        }
    }

    public final r45.vd6 d1(com.tencent.mm.plugin.finder.report.n4 n4Var, boolean z17) {
        r45.n31 foldedLayout;
        r45.gm2 gm2Var;
        r45.gm2 gm2Var2;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        n4Var.K(null);
        com.tencent.mm.plugin.finder.report.h hVar = this.f125105w;
        boolean b17 = hVar.b(0);
        long j17 = n4Var.f125157c;
        if (!b17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String a17 = hVar.a(n4Var);
            if (n4Var.N < 0) {
                sb6.append("stayTime :" + n4Var.N + " startTime:" + j17 + " endTime:" + n4Var.f125173k + "\n obj:" + a17);
            }
            if (n4Var.f125152J < 0) {
                sb6.append("realPlayTime :" + n4Var.f125152J + " realPlayTimestamp:" + n4Var.K + " endTime:" + n4Var.f125173k + "\n obj:" + a17);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(sb6.toString())) {
                com.tencent.mars.xlog.Log.e("FeedReportWatcher", "vertify error:\n " + ((java.lang.Object) sb6));
            }
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = n4Var.f125159d;
        java.lang.Long valueOf = (finderItem == null || (feedObject = finderItem.getFeedObject()) == null) ? null : java.lang.Long.valueOf(feedObject.getId());
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.C;
            if (concurrentHashMap.containsKey(java.lang.Long.valueOf(longValue))) {
                gm2Var2 = (r45.gm2) concurrentHashMap.get(java.lang.Long.valueOf(longValue));
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("get from cache: ");
                sb7.append(gm2Var2 != null ? gm2Var2.getString(1) : null);
                com.tencent.mars.xlog.Log.i("Finder.FinderSingleFeedFlowReporter", sb7.toString());
            } else {
                if (finderItem != null) {
                    r45.hm2 hotTopics = finderItem.getFeedObject().getHotTopics();
                    java.util.LinkedList list = hotTopics != null ? hotTopics.getList(0) : null;
                    if (list != null) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            gm2Var = (r45.gm2) it.next();
                            if (gm2Var != null && gm2Var.getInteger(2) == 5) {
                                break;
                            }
                        }
                    }
                }
                gm2Var = null;
                if (gm2Var != null) {
                    concurrentHashMap.put(java.lang.Long.valueOf(longValue), gm2Var);
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("get from feed update map: ");
                sb8.append(gm2Var != null ? gm2Var.getString(1) : null);
                com.tencent.mars.xlog.Log.i("Finder.FinderSingleFeedFlowReporter", sb8.toString());
                gm2Var2 = gm2Var;
            }
            if (finderItem != null && gm2Var2 != null) {
                int i17 = gm2Var2.getInteger(3) > 0 ? 1 : 0;
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long id6 = finderItem.getFeedObject().getId();
                r45.dm2 object_extend = finderItem.getFeedObject().getObject_extend();
                java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
                long j18 = gm2Var2.getLong(0);
                java.lang.String string2 = gm2Var2.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                o3Var.Kk(id6, string, 1L, j18, string2, i17, this.f125284h.getInteger(5));
            }
        }
        r45.vd6 d17 = com.tencent.mm.plugin.finder.report.n4.f125151r0.d(n4Var, this.f125284h);
        com.tencent.mm.plugin.finder.report.o0 o0Var = com.tencent.mm.plugin.finder.report.r0.f125279q;
        long j19 = n4Var.f125153a;
        if (finderItem != null) {
            long j27 = n4Var.f125173k - j17;
            java.lang.String t17 = r26.i0.t(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j19, n4Var.f125155b, this.f125284h.getInteger(5)), ",", ";", false);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[10];
            lVarArr[0] = new jz5.l("feed_stay_time", java.lang.Long.valueOf(j27));
            lVarArr[1] = new jz5.l("feed_id", pm0.v.u(j19));
            lVarArr[2] = new jz5.l("session_buffer", t17);
            lVarArr[3] = new jz5.l("behaviour_session_id", this.f125284h.getString(0));
            lVarArr[4] = new jz5.l("finder_context_id", this.f125284h.getString(1));
            lVarArr[5] = new jz5.l("finder_tab_context_id", this.f125284h.getString(2));
            lVarArr[6] = new jz5.l("extra_info", this.f125284h.getString(11));
            lVarArr[7] = new jz5.l("enter_source_info", this.f125284h.getString(12));
            lVarArr[8] = new jz5.l("comment_scene", java.lang.Integer.valueOf(this.f125284h.getInteger(5)));
            lVarArr[9] = new jz5.l("finder_username", finderItem != null ? finderItem.getUserName() : null);
            ((cy1.a) rVar).Cj("finder_feed_out", null, kz5.c1.k(lVarArr), 24617);
            if (finderItem.isUrlValid()) {
                com.tencent.mm.plugin.finder.report.o0.b(o0Var, this.f125284h, n4Var.f125153a, n4Var.f125155b, 14, java.lang.String.valueOf(n4Var.f125173k - j17), 0L, null, null, null, 480, null);
            }
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderSingleFeedFlowReporter", "local feed ignore");
        }
        o0Var.c(this.f125284h, n4Var, 2);
        in5.v0 v0Var = n4Var.f125161e;
        if (z17) {
            if (finderItem != null && (foldedLayout = finderItem.getFoldedLayout()) != null && foldedLayout.getInteger(3) > 0) {
                if ((v0Var != null ? v0Var.f293147e : null) == null && v0Var != null) {
                    android.util.LongSparseArray longSparseArray = new android.util.LongSparseArray();
                    java.util.LinkedList list2 = foldedLayout.getList(1);
                    kotlin.jvm.internal.o.f(list2, "getObjects(...)");
                    int i18 = 0;
                    for (java.lang.Object obj : list2) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
                        if (i18 <= 2) {
                            in5.x0 x0Var = new in5.x0(new com.tencent.mm.plugin.finder.report.j4(finderObject), 0L, 2, null);
                            x0Var.f293160c = i18;
                            longSparseArray.put(finderObject.getId(), x0Var);
                        }
                        i18 = i19;
                    }
                    v0Var.f293147e = longSparseArray;
                }
                o0Var.e(this.f125284h, n4Var);
            }
        } else if (v0Var != null && v0Var.f293146d) {
            o0Var.e(this.f125284h, n4Var);
            v0Var.f293146d = false;
        }
        so2.j5 j5Var = n4Var.Y;
        if (j5Var != null && (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
        }
        if (j5Var != null && (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            if (hc2.f0.f(baseFinderFeed.getFeedObject())) {
                com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                r45.qt2 contextObj = this.f125284h;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(baseFinderFeed.getFeedObject().getFeedObject().getFollow_feed_count());
                o3Var2.getClass();
                kotlin.jvm.internal.o.g(contextObj, "contextObj");
                com.tencent.mm.autogen.mmdata.rpt.FinderBrowsePatMusicIconStruct finderBrowsePatMusicIconStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBrowsePatMusicIconStruct();
                finderBrowsePatMusicIconStruct.f56576d = finderBrowsePatMusicIconStruct.b("Feedid", pm0.v.u(j19), true);
                finderBrowsePatMusicIconStruct.f56577e = 0L;
                finderBrowsePatMusicIconStruct.f56578f = contextObj.getInteger(5);
                finderBrowsePatMusicIconStruct.f56579g = valueOf2 != null ? valueOf2.intValue() : 0L;
                finderBrowsePatMusicIconStruct.k();
            }
        }
        return d17;
    }

    public final void e1() {
        r45.jn0 jn0Var;
        com.tencent.mm.plugin.finder.report.n4 n4Var;
        com.tencent.mm.plugin.finder.report.n4 n4Var2 = this.f125107y;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f125104v;
        if (n4Var2 != null) {
            if (n4Var2.P > 0) {
                java.lang.String a17 = hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 13)));
                concurrentLinkedQueue.add(a17);
                Z0(W0(a17));
            }
            if (n4Var2.H > 0) {
                java.lang.String a18 = hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 14)));
                concurrentLinkedQueue.add(a18);
                Z0(W0(a18));
            }
        }
        com.tencent.mm.plugin.finder.report.p0 p0Var = this.f125286m;
        p0Var.getClass();
        if (p0Var.f125229a) {
            java.lang.String a19 = hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 12)));
            concurrentLinkedQueue.add(a19);
            Z0(W0(a19));
        }
        p0Var.f125229a = false;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (this.f125107y != null) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                com.tencent.mars.xlog.Log.i("Finder.FinderSingleFeedFlowReporter", "reportExtStatsInCenterSwitch action: " + str);
                kotlin.jvm.internal.o.d(str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (n4Var = this.f125107y) == null) {
                    jn0Var = null;
                } else {
                    jn0Var = new r45.jn0();
                    long j17 = n4Var.f125153a;
                    jn0Var.set(0, java.lang.Long.valueOf(j17));
                    java.lang.String str2 = n4Var.f125155b;
                    jn0Var.set(12, str2);
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = n4Var.f125159d;
                    if (finderItem != null) {
                        jn0Var.set(1, finderItem.getUserName());
                    }
                    jn0Var.set(2, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str2, this.f125284h.getInteger(5)));
                    jn0Var.set(3, str);
                    jn0Var.set(4, java.lang.Integer.valueOf(n4Var.W));
                    jn0Var.set(5, java.lang.Integer.valueOf(finderItem != null ? finderItem.getMediaType() : 0));
                }
                if (jn0Var != null) {
                    linkedList.add(jn0Var);
                }
            }
            concurrentLinkedQueue.clear();
            if (!linkedList.isEmpty()) {
                E.a(this.f125284h, linkedList);
            }
        }
    }

    public final r45.vd6 f1(com.tencent.mm.plugin.finder.report.n4 n4Var) {
        r45.vd6 vd6Var = new r45.vd6();
        vd6Var.set(0, java.lang.Long.valueOf(n4Var.f125153a));
        vd6Var.set(28, n4Var.f125155b);
        r45.yw6 yw6Var = new r45.yw6();
        yw6Var.set(6, java.lang.Long.valueOf(n4Var.f125157c));
        vd6Var.set(2, yw6Var);
        return vd6Var;
    }

    public final void g1(java.lang.String str, ec2.a aVar) {
        com.tencent.mm.plugin.finder.report.n4 n4Var;
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(0, java.lang.Long.valueOf(aVar.f250947e));
        java.lang.String str2 = aVar.f250948f;
        jn0Var.set(12, str2);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = aVar.f250949g;
        if (finderItem != null) {
            jn0Var.set(1, finderItem.getUserName());
        }
        jn0Var.set(2, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(aVar.f250947e, str2, this.f125284h.getInteger(5)));
        jn0Var.set(3, str);
        if (this.B.containsKey(java.lang.Long.valueOf(jn0Var.getLong(0))) && (n4Var = (com.tencent.mm.plugin.finder.report.n4) this.B.get(java.lang.Long.valueOf(jn0Var.getLong(0)))) != null) {
            jn0Var.set(4, java.lang.Integer.valueOf(n4Var.W));
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = n4Var.f125159d;
            jn0Var.set(5, java.lang.Integer.valueOf(finderItem2 != null ? finderItem2.getMediaType() : 0));
        }
        E.b(this.f125284h, jn0Var);
    }

    public final void h1(com.tencent.mm.plugin.finder.report.n4 n4Var, java.lang.String feedActionValue, boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        kotlin.jvm.internal.o.g(feedActionValue, "feedActionValue");
        if (n4Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSingleFeedFlowReporter", "sendExtStatsReport ".concat(feedActionValue));
            r45.jn0 jn0Var = new r45.jn0();
            long j17 = n4Var.f125153a;
            jn0Var.set(0, java.lang.Long.valueOf(j17));
            java.lang.String str = n4Var.f125155b;
            jn0Var.set(12, str);
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = n4Var.f125159d;
            if (finderItem != null) {
                jn0Var.set(1, finderItem.getUserName());
            }
            jn0Var.set(2, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, this.f125284h.getInteger(5)));
            jn0Var.set(3, feedActionValue);
            jn0Var.set(4, java.lang.Integer.valueOf(n4Var.W));
            jn0Var.set(5, java.lang.Integer.valueOf(finderItem != null ? finderItem.getMediaType() : 0));
            if (z17) {
                jn0Var.getList(9).clear();
                long id6 = finderItem != null ? finderItem.getId() : 0L;
                if (finderItem != null && (feedObject = finderItem.getFeedObject()) != null) {
                    feedObject.getAdFlag();
                }
                java.lang.Iterable iterable = (java.util.Set) ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).W6(id6, this.f125284h.getInteger(5), str).getValue();
                if (iterable == null) {
                    iterable = kz5.r0.f314002d;
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    java.util.Iterator it6 = ((xc2.t) it.next()).f453302d.iterator();
                    while (it6.hasNext()) {
                        hashSet.add((com.tencent.mm.protocal.protobuf.FinderJumpInfo) it6.next());
                    }
                }
                java.util.Iterator it7 = hashSet.iterator();
                while (it7.hasNext()) {
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) it7.next();
                    java.util.LinkedList list = jn0Var.getList(9);
                    r45.tc1 tc1Var = new r45.tc1();
                    tc1Var.set(0, finderJumpInfo);
                    tc1Var.set(1, 1);
                    com.tencent.mm.ui.MMFragmentActivity activity = this.f125283g;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    ((sc2.a8) pf5.z.f353948a.a(activity).a(sc2.a8.class)).U6(new com.tencent.mm.plugin.finder.report.e4(tc1Var));
                    list.add(tc1Var);
                }
            }
            E.b(this.f125284h, jn0Var);
            Z0(W0(feedActionValue));
        }
    }

    public final void i1(java.lang.String feedActionValue, boolean z17) {
        kotlin.jvm.internal.o.g(feedActionValue, "feedActionValue");
        h1(this.f125107y, feedActionValue, z17);
    }
}
