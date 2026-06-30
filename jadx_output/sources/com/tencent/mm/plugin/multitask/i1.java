package com.tencent.mm.plugin.multitask;

@j95.b
/* loaded from: classes8.dex */
public final class i1 extends i95.w implements com.tencent.mm.plugin.multitask.j0, androidx.lifecycle.m1 {

    /* renamed from: w, reason: collision with root package name */
    public static com.tencent.mm.plugin.multitask.w0 f150443w;

    /* renamed from: e, reason: collision with root package name */
    public volatile lk3.b f150446e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f150447f;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitask.PluginMultiTask$multiTaskTabChangeListener$1 f150455q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f150456r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f150457s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150458t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.l1 f150459u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f150442v = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f150444x = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150445d = "MicroMsg.MultiTask.PluginMultiTask";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f150448g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f150449h = "multitask_star";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f150450i = "multitask_star_enable";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f150451m = "multitask_star_init_sync_enable";

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f150452n = "multi_task_storage";

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitask.MultiTaskCallBackBroadcast f150453o = new com.tencent.mm.plugin.multitask.MultiTaskCallBackBroadcast();

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitask.x0 f150454p = new com.tencent.mm.plugin.multitask.x0(this);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.multitask.PluginMultiTask$multiTaskTabChangeListener$1] */
    public i1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f150455q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MultiTaskTabChangedEvent>(a0Var) { // from class: com.tencent.mm.plugin.multitask.PluginMultiTask$multiTaskTabChangeListener$1
            {
                this.__eventId = 1772888173;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MultiTaskTabChangedEvent multiTaskTabChangedEvent) {
                com.tencent.mm.autogen.events.MultiTaskTabChangedEvent event = multiTaskTabChangedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = com.tencent.mm.plugin.multitask.i1.this.f150445d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MultiTaskTabChangedEvent callback, event.data.curIndex: ");
                am.ek ekVar = event.f54507g;
                sb6.append(ekVar.f6562a);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                if (ekVar.f6562a == 0) {
                    com.tencent.mm.plugin.multitask.m0.d(((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ni(), null, java.lang.Boolean.TRUE, 1, null);
                } else {
                    com.tencent.mm.plugin.multitask.m0.b(((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ni(), java.lang.Boolean.TRUE, null, 2, null);
                }
                return true;
            }
        };
        this.f150457s = jz5.h.b(com.tencent.mm.plugin.multitask.z0.f150619d);
        this.f150459u = new androidx.lifecycle.l1();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ai(java.lang.String r18, int r19, r45.lr4 r20, android.graphics.Bitmap r21, byte[] r22, mk3.a r23) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitask.i1.Ai(java.lang.String, int, r45.lr4, android.graphics.Bitmap, byte[], mk3.a):void");
    }

    public final boolean Bi(java.lang.String str, int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f150448g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ik3.r rVar = (ik3.r) obj;
            if (rVar.f291912b == i17 && kotlin.jvm.internal.o.b(rVar.f291911a, str)) {
                break;
            }
        }
        return obj != null;
    }

    public boolean Di() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return Ni();
        }
        return com.tencent.mm.sdk.platformtools.o4.M(this.f150452n).getBoolean(this.f150450i, j62.e.g().c(new com.tencent.mm.repairer.config.multitask.RepairerConfigGlobalDirectToMultiTask()) == 1);
    }

    public final boolean Ni() {
        return ((java.lang.Boolean) ((jz5.n) this.f150457s).getValue()).booleanValue();
    }

    public final java.lang.String Ri(java.lang.String id6, int i17, int i18, int i19) {
        java.lang.String str;
        pk3.h a17;
        zk3.g0 g0Var;
        int a76;
        androidx.recyclerview.widget.k3 p07;
        android.view.View view;
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mm.plugin.multitask.w0 w0Var = f150443w;
        android.view.View view2 = null;
        if (w0Var == null) {
            return null;
        }
        yk3.i iVar = ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) w0Var).f150593f;
        if (iVar != null && (a17 = iVar.a(0, "MultiTaskForMinusScreen")) != null && i18 != (a76 = (g0Var = (zk3.g0) a17).a7(id6, i17)) && a76 >= 0) {
            java.util.ArrayList arrayList = g0Var.f473452g;
            if (a76 < arrayList.size()) {
                if (i19 != 4) {
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = g0Var.f473454i;
                    androidx.recyclerview.widget.k3 p08 = wxRecyclerView != null ? wxRecyclerView.p0(a76 + 1) : null;
                    if (p08 != null) {
                        view2 = p08.itemView;
                    }
                } else if (arrayList.size() <= 2) {
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = g0Var.f473454i;
                    if (wxRecyclerView2 != null && (p07 = wxRecyclerView2.p0(1)) != null && (view = p07.itemView) != null) {
                        view2 = view.findViewById(com.tencent.mm.R.id.jvd);
                    }
                } else {
                    view2 = g0Var.getRootView().findViewById(com.tencent.mm.R.id.jv9);
                }
                str = al3.g.f5858a.a(view2);
                return str;
            }
        }
        str = "";
        return str;
    }

    public final com.tencent.mm.plugin.multitask.model.MultiTaskInfo Ui(java.lang.String id6, int i17) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo Zi;
        kotlin.jvm.internal.o.g(id6, "id");
        int i18 = com.tencent.mm.plugin.multitask.l0.f150465z0;
        com.tencent.mm.plugin.multitask.k0 k0Var = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? (com.tencent.mm.plugin.multitask.k0) i95.n0.c(com.tencent.mm.plugin.multitask.k0.class) : null;
        if (k0Var != null && (Zi = ((com.tencent.mm.plugin.multitask.j1) k0Var).Zi(id6, i17)) != null) {
            return Zi;
        }
        lk3.b aj6 = aj();
        if (aj6 != null) {
            return aj6.Y6(id6, i17);
        }
        return null;
    }

    public java.lang.String Vi() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.multitask.g0.class);
            java.lang.String str = iPCString != null ? iPCString.f68406d : null;
            return str == null ? "" : str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String valueOf = java.lang.String.valueOf(gm0.j1.b().h());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(valueOf != null ? valueOf : "");
        sb6.append(java.lang.System.currentTimeMillis());
        return com.tencent.mm.sdk.platformtools.w2.a(sb6.toString()).toString();
    }

    public void Zi(kk3.b bVar) {
        com.tencent.mars.xlog.Log.i(this.f150445d, "getMultiTaskInfoList");
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.ipcinvoker.extension.l.c(this.f150456r);
            com.tencent.mm.plugin.multitask.a1 a1Var = new com.tencent.mm.plugin.multitask.a1(bVar, this);
            this.f150456r = a1Var;
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.multitask.f0.class, a1Var);
            return;
        }
        int i17 = com.tencent.mm.plugin.multitask.l0.f150465z0;
        com.tencent.mm.plugin.multitask.k0 k0Var = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? (com.tencent.mm.plugin.multitask.k0) i95.n0.c(com.tencent.mm.plugin.multitask.k0.class) : null;
        if (k0Var != null) {
            ((com.tencent.mm.plugin.multitask.j1) k0Var).aj(bVar);
            return;
        }
        lk3.b aj6 = aj();
        if (aj6 != null) {
            aj6.Z6(bVar);
        }
    }

    public final lk3.b aj() {
        if (this.f150446e == null) {
            synchronized (this) {
                if (this.f150446e == null) {
                    this.f150446e = new lk3.b(new jm0.l());
                }
            }
        }
        return this.f150446e;
    }

    public com.tencent.mm.plugin.multitask.model.MultiTaskInfo bj(java.lang.String id6, int i17) {
        kotlin.jvm.internal.o.g(id6, "id");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return Ui(id6, i17);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.COL_ID, id6);
        bundle.putInt("type", i17);
        return (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.multitask.h0.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean cj(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2;
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        java.lang.String str = multiTaskInfo.field_id;
        boolean z17 = false;
        z17 = false;
        if ((str == null || str.length() == 0) == true) {
            return false;
        }
        java.lang.String field_id = multiTaskInfo.field_id;
        kotlin.jvm.internal.o.f(field_id, "field_id");
        int i17 = multiTaskInfo.field_type;
        if (gm0.j1.a()) {
            requireAccountInitialized();
        }
        java.lang.String t17 = com.tencent.mm.sdk.platformtools.o4.M(this.f150452n).t(this.f150449h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(t17) && !this.f150447f) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                return fj(field_id, i17);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.COL_ID, field_id);
            bundle.putInt("type", i17);
            com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.multitask.i0.class);
            if (iPCBoolean != null) {
                return iPCBoolean.f68400d;
            }
            return false;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(t17);
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                boolean z18 = false;
                for (int i18 = 0; i18 < length; i18++) {
                    try {
                        org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i18);
                        if (optJSONObject != null) {
                            l75.e0 e0Var = com.tencent.mm.plugin.multitask.model.MultiTaskInfo.A;
                            try {
                                java.lang.String string = optJSONObject.getString("field_id");
                                int i19 = optJSONObject.getInt("field_type");
                                multiTaskInfo2 = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
                                multiTaskInfo2.field_id = string;
                                multiTaskInfo2.field_type = i19;
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiTaskInfo", e17, "convertJSONObjectToMultiTaskInfo fail, exception:%s", e17);
                                multiTaskInfo2 = null;
                            }
                            if (multiTaskInfo2 != null && android.text.TextUtils.equals(multiTaskInfo2.field_id, field_id) && multiTaskInfo2.field_type == i17) {
                                z18 = true;
                            }
                        }
                    } catch (org.json.JSONException e18) {
                        e = e18;
                        z17 = z18;
                        com.tencent.mars.xlog.Log.printErrStackTrace(this.f150445d, e, "load fail, exception:%s", e);
                        com.tencent.mars.xlog.Log.i(this.f150445d, "load, hasTaskInfoByMMKV: " + z17);
                        return z17;
                    }
                }
                z17 = z18;
            }
        } catch (org.json.JSONException e19) {
            e = e19;
        }
        com.tencent.mars.xlog.Log.i(this.f150445d, "load, hasTaskInfoByMMKV: " + z17);
        return z17;
    }

    public final boolean fj(java.lang.String multiTaskId, int i17) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo Zi;
        pk3.h a17;
        kotlin.jvm.internal.o.g(multiTaskId, "multiTaskId");
        com.tencent.mm.plugin.multitask.w0 w0Var = f150443w;
        boolean z17 = false;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = null;
        if (w0Var != null) {
            com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC = (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) w0Var;
            if (multiTaskUIC.W6()) {
                yk3.i iVar = multiTaskUIC.f150593f;
                if (iVar != null && (a17 = iVar.a(0, "MultiTaskForMinusScreen")) != null) {
                    java.util.Iterator it = ((zk3.g0) a17).f473452g.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        if (((uk3.a) next).f428524d.field_id.equals(multiTaskId)) {
                            z17 = true;
                            break;
                        }
                        i18 = i19;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "hasCurrentMultiInfo, id:%s, ret:%b", multiTaskId, java.lang.Boolean.valueOf(z17));
                return z17;
            }
        }
        int i27 = com.tencent.mm.plugin.multitask.l0.f150465z0;
        com.tencent.mm.plugin.multitask.k0 k0Var = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? (com.tencent.mm.plugin.multitask.k0) i95.n0.c(com.tencent.mm.plugin.multitask.k0.class) : null;
        if (k0Var == null || (Zi = ((com.tencent.mm.plugin.multitask.j1) k0Var).Zi(multiTaskId, i17)) == null) {
            lk3.b aj6 = aj();
            if (aj6 != null) {
                multiTaskInfo = aj6.Y6(multiTaskId, i17);
            }
        } else {
            multiTaskInfo = Zi;
        }
        return multiTaskInfo != null;
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return this.f150459u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (com.tencent.mm.sdk.storage.mvvm.MvvmStorage.S6(r4, r1, false, false, 6, null) > 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hj(java.lang.String r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitask.i1.hj(java.lang.String, int, boolean):void");
    }

    public boolean ij() {
        pk3.h a17;
        if (gm0.j1.a()) {
            requireAccountInitialized();
        }
        if (this.f150447f) {
            return this.f150448g.isEmpty();
        }
        com.tencent.mm.plugin.multitask.w0 w0Var = f150443w;
        if (w0Var != null) {
            yk3.i iVar = ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) w0Var).f150593f;
            if ((iVar == null || (a17 = iVar.a(0, "MultiTaskForMinusScreen")) == null) ? false : ((zk3.g0) a17).f473451f) {
                return !r0.W6();
            }
        }
        java.lang.String t17 = com.tencent.mm.sdk.platformtools.o4.M(this.f150452n).t(this.f150449h);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(t17) || this.f150447f) {
            try {
                return new org.json.JSONArray(t17).length() <= 0;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f150445d, e17, "load fail, exception:%s", e17);
                return true;
            }
        }
        com.tencent.mm.plugin.multitask.k0 k0Var = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? (com.tencent.mm.plugin.multitask.k0) i95.n0.c(com.tencent.mm.plugin.multitask.k0.class) : null;
        if (k0Var != null) {
            com.tencent.mm.plugin.multitask.j1 j1Var = (com.tencent.mm.plugin.multitask.j1) k0Var;
            if (!jm0.g.class.isAssignableFrom(ik3.q.class)) {
                throw new java.lang.IllegalArgumentException(com.tencent.mm.plugin.multitask.j1.class.getName().concat(" must extends FeatureServiceComponent"));
            }
            androidx.lifecycle.c1 a18 = new androidx.lifecycle.j1(j1Var.getViewModel(), new jm0.e(j1Var)).a(ik3.q.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            lk3.b U6 = ((ik3.q) ((jm0.g) a18)).U6();
            if ((U6 != null ? U6.Z6(null).isEmpty() : false) && !com.tencent.wechat.aff.star.d.f217506b.d()) {
                return true;
            }
        } else {
            lk3.b aj6 = aj();
            java.util.List Z6 = aj6 != null ? aj6.Z6(null) : null;
            if (Z6 == null || Z6.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public void mj(int i17, java.lang.Class cls) {
        com.tencent.mars.xlog.Log.i(this.f150445d, "registerMultiTaskUIC type:" + i17 + " clazzUic:" + cls);
        f150442v.put(java.lang.Integer.valueOf(i17), cls);
    }

    public void nj(java.lang.String str, int i17, boolean z17) {
        if (str != null) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                hj(str, i17, z17);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.COL_ID, str);
            bundle.putInt("type", i17);
            bundle.putBoolean("starOpt", z17);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.multitask.i2.class, com.tencent.mm.plugin.multitask.c1.f150425d);
        }
    }

    public final void oj() {
        com.tencent.mars.xlog.Log.i(this.f150445d, "restore data from storage");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i(this.f150445d, "account not ready!");
            return;
        }
        if (this.f150447f) {
            com.tencent.mars.xlog.Log.i(this.f150445d, "restoreData already done!");
            return;
        }
        com.tencent.mm.plugin.multitask.d1 d1Var = new com.tencent.mm.plugin.multitask.d1(this);
        int i17 = com.tencent.mm.plugin.multitask.l0.f150465z0;
        com.tencent.mm.plugin.multitask.k0 k0Var = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? (com.tencent.mm.plugin.multitask.k0) i95.n0.c(com.tencent.mm.plugin.multitask.k0.class) : null;
        if (k0Var != null) {
            ((com.tencent.mm.plugin.multitask.j1) k0Var).aj(d1Var);
            return;
        }
        lk3.b aj6 = aj();
        if (aj6 != null) {
            aj6.Z6(d1Var);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f150445d, "onAccountInitialized");
        this.f150447f = false;
        oj();
        if ((this.f150458t || !Ni()) && !com.tencent.mm.sdk.platformtools.o4.M(this.f150452n).getBoolean(this.f150451m, false)) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.M(this.f150452n).putBoolean(this.f150451m, true);
        long nextInt = new java.util.Random().nextInt(300) * 1000;
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.multitask.f1 f1Var = new com.tencent.mm.plugin.multitask.f1(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(f1Var, nextInt, null);
        com.tencent.mars.xlog.Log.i(this.f150445d, "doStarSync delay: " + nextInt);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f150445d, "onAccountRelease");
        this.f150446e = null;
        f150443w = null;
        f150444x.clear();
        this.f150447f = false;
        dead();
        java.lang.String str = this.f150445d;
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this.f150453o);
            com.tencent.mars.xlog.Log.i(str, "unregisterMultiTaskBroadcastReceiver");
        } catch (java.lang.IllegalArgumentException unused) {
            com.tencent.mars.xlog.Log.e(str, "unregisterMultiTaskBroadcastReceiver error");
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e(str, "unregisterMultiTaskBroadcastReceiver error");
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context2).unregisterActivityLifecycleCallbacks(this.f150454p);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mm.plugin.multitask.MultiTaskCallBackBroadcast multiTaskCallBackBroadcast = this.f150453o;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String str = this.f150445d;
        com.tencent.mars.xlog.Log.i(str, "onCreate");
        super.onCreate(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.multitask");
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(multiTaskCallBackBroadcast);
            com.tencent.mars.xlog.Log.i(str, "unregisterMultiTaskBroadcastReceiver");
        } catch (java.lang.IllegalArgumentException unused) {
            com.tencent.mars.xlog.Log.e(str, "unregisterMultiTaskBroadcastReceiver error");
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e(str, "unregisterMultiTaskBroadcastReceiver error");
        }
        try {
            if (fp.h.a(33)) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(multiTaskCallBackBroadcast, intentFilter);
            } else {
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(multiTaskCallBackBroadcast, intentFilter, 4);
            }
        } catch (java.lang.Exception unused3) {
            com.tencent.mars.xlog.Log.e(str, "registerMultiTaskBroadcastReceiver error");
        }
        alive();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
            if (((i17 == 788529167 || i17 == 788529166) || z65.c.a()) || com.tencent.mm.sdk.platformtools.v8.b(com.tencent.mm.sdk.platformtools.z.f193112h)) {
                com.tencent.wechat.aff.star.e.f217508b.b(j62.e.g().c(new com.tencent.mm.repairer.config.multitask.RepairerConfigGlobalDirectToMultiTask()) == 1);
            }
            java.lang.String str2 = this.f150452n;
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(str2);
            java.lang.String str3 = this.f150450i;
            this.f150458t = M.getBoolean(str3, false);
            com.tencent.mm.sdk.platformtools.o4.M(str2).putBoolean(str3, Ni());
            com.tencent.mars.xlog.Log.i(str, "starModeEnable: " + Ni() + ", lastStarModeEnable: " + this.f150458t);
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context2).registerActivityLifecycleCallbacks(this.f150454p);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0017 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:28:0x000a, B:5:0x0017, B:6:0x001b, B:8:0x0021, B:11:0x0031), top: B:27:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pj() {
        /*
            r5 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.concurrent.CopyOnWriteArrayList r1 = r5.f150448g
            r2 = 0
            if (r1 == 0) goto L14
            boolean r3 = r1.isEmpty()     // Catch: org.json.JSONException -> L12
            if (r3 != 0) goto L14
            r3 = 1
            goto L15
        L12:
            r1 = move-exception
            goto L38
        L14:
            r3 = r2
        L15:
            if (r3 == 0) goto L43
            java.util.Iterator r1 = r1.iterator()     // Catch: org.json.JSONException -> L12
        L1b:
            boolean r3 = r1.hasNext()     // Catch: org.json.JSONException -> L12
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()     // Catch: org.json.JSONException -> L12
            ik3.r r3 = (ik3.r) r3     // Catch: org.json.JSONException -> L12
            java.lang.String r4 = r3.f291911a     // Catch: org.json.JSONException -> L12
            int r3 = r3.f291912b     // Catch: org.json.JSONException -> L12
            org.json.JSONObject r3 = com.tencent.mm.plugin.multitask.model.MultiTaskInfo.u0(r4, r3)     // Catch: org.json.JSONException -> L12
            if (r3 == 0) goto L1b
            int r4 = r2 + 1
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L12
            r2 = r4
            goto L1b
        L38:
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r3 = r5.f150445d
            java.lang.String r4 = "saveMultiTaskToMMKV fail, exception:%s"
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r1, r4, r2)
        L43:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            boolean r1 = gm0.j1.a()
            if (r1 == 0) goto L56
            r5.requireAccountInitialized()
        L56:
            java.lang.String r1 = r5.f150452n
            com.tencent.mm.sdk.platformtools.o4 r1 = com.tencent.mm.sdk.platformtools.o4.M(r1)
            java.lang.String r2 = r5.f150449h
            r1.D(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitask.i1.pj():void");
    }

    public void qj(int i17, java.lang.String id6, int i18) {
        kotlin.jvm.internal.o.g(id6, "id");
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.COL_ID, id6);
            bundle.putInt("type", i18);
            bundle.putInt("event_type", i17);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.multitask.p0.class, new com.tencent.mm.plugin.multitask.e1(this));
            return;
        }
        com.tencent.mm.autogen.events.MulitTaskEvent mulitTaskEvent = new com.tencent.mm.autogen.events.MulitTaskEvent();
        am.ak akVar = mulitTaskEvent.f54503g;
        akVar.f6161c = i17;
        akVar.f6160b = i18;
        akVar.f6159a = id6;
        mulitTaskEvent.e();
    }

    public final void rj(java.lang.String id6, int i17, r45.lr4 showData, byte[] bArr) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo Zi;
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(showData, "showData");
        int i18 = com.tencent.mm.plugin.multitask.l0.f150465z0;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = null;
        com.tencent.mm.plugin.multitask.k0 k0Var = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? (com.tencent.mm.plugin.multitask.k0) i95.n0.c(com.tencent.mm.plugin.multitask.k0.class) : null;
        if (k0Var == null || (Zi = ((com.tencent.mm.plugin.multitask.j1) k0Var).Zi(id6, i17)) == null) {
            lk3.b aj6 = aj();
            if (aj6 != null) {
                multiTaskInfo = aj6.Y6(id6, i17);
            }
        } else {
            multiTaskInfo = Zi;
        }
        if (multiTaskInfo != null) {
            multiTaskInfo.field_updateTime = c01.id.c();
            multiTaskInfo.field_type = i17;
            multiTaskInfo.field_showData = showData;
            if (bArr != null) {
                multiTaskInfo.field_data = bArr;
            }
            lk3.b aj7 = aj();
            if (aj7 != null) {
                com.tencent.mm.sdk.storage.mvvm.MvvmStorage.W6(aj7, multiTaskInfo, false, false, 6, null);
            }
            ((d73.i) i95.n0.c(d73.i.class)).hb(multiTaskInfo);
        }
    }

    public void wi(java.lang.String id6, int i17, r45.lr4 showData, byte[] bArr, mk3.a multiTaskAddExtarParams) {
        r45.er4 er4Var;
        r45.er4 er4Var2;
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(showData, "showData");
        kotlin.jvm.internal.o.g(multiTaskAddExtarParams, "multiTaskAddExtarParams");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.field_id = id6;
        multiTaskInfo.field_type = i17;
        multiTaskInfo.field_createTime = c01.id.c();
        multiTaskInfo.field_updateTime = c01.id.c();
        multiTaskInfo.field_showData = showData;
        multiTaskInfo.field_data = bArr;
        lk3.b aj6 = aj();
        java.lang.Boolean valueOf = aj6 != null ? java.lang.Boolean.valueOf(aj6.X6(multiTaskInfo)) : null;
        if (multiTaskAddExtarParams.f327141a == null && multiTaskAddExtarParams.f327143c) {
            r45.kr4 kr4Var = new r45.kr4();
            kr4Var.set(6, new r45.er4());
            boolean Ri = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo);
            r45.er4 er4Var3 = (r45.er4) kr4Var.getCustom(6);
            if (er4Var3 != null) {
                er4Var3.set(1, java.lang.Long.valueOf(Ri ? 1L : 2L));
            }
            kr4Var.set(3, java.lang.Integer.valueOf(multiTaskInfo.field_type));
            r45.er4 er4Var4 = (r45.er4) kr4Var.getCustom(6);
            if (er4Var4 != null) {
                er4Var4.set(0, 11L);
            }
            multiTaskAddExtarParams.f327141a = kr4Var;
        }
        nk3.f fVar = nk3.f.f338041a;
        r45.kr4 kr4Var2 = multiTaskAddExtarParams.f327141a;
        com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemAddStruct multiTaskItemAddStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemAddStruct();
        multiTaskItemAddStruct.f59378d = multiTaskItemAddStruct.b("ItemId", multiTaskInfo.field_id, true);
        multiTaskItemAddStruct.f59379e = fVar.a(multiTaskInfo.field_type);
        long j17 = 0;
        multiTaskItemAddStruct.f59380f = (kr4Var2 == null || (er4Var2 = (r45.er4) kr4Var2.getCustom(6)) == null) ? 0L : er4Var2.getLong(0);
        if (kr4Var2 != null && (er4Var = (r45.er4) kr4Var2.getCustom(6)) != null) {
            j17 = er4Var.getLong(1);
        }
        multiTaskItemAddStruct.f59381g = j17;
        multiTaskItemAddStruct.f59382h = multiTaskItemAddStruct.b("ContextId", kr4Var2 != null ? kr4Var2.getString(0) : null, true);
        multiTaskItemAddStruct.f59383i = multiTaskItemAddStruct.b("ItemSubId", kr4Var2 != null ? kr4Var2.getString(4) : null, true);
        multiTaskItemAddStruct.k();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = kotlin.jvm.internal.o.b(valueOf, bool);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f150448g;
        if (b17 && !Bi(id6, i17)) {
            copyOnWriteArrayList.add(0, new ik3.r(id6, i17));
            pj();
            ((d73.i) i95.n0.c(d73.i.class)).vg(multiTaskInfo);
        }
        if (multiTaskAddExtarParams.f327142b) {
            com.tencent.mm.plugin.multitask.k0 k0Var = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? (com.tencent.mm.plugin.multitask.k0) i95.n0.c(com.tencent.mm.plugin.multitask.k0.class) : null;
            j75.f Ai = k0Var != null ? ((com.tencent.mm.plugin.multitask.j1) k0Var).Ai() : null;
            if (Ai != null) {
                Ai.B3(new ik3.e(false, multiTaskInfo));
            }
        }
        boolean b18 = kotlin.jvm.internal.o.b(valueOf, bool);
        java.lang.String str = this.f150445d;
        if (b18) {
            boolean z17 = com.tencent.mm.sdk.platformtools.o4.M("multitask_tips_config").getBoolean("multitask_first_add_flag", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskTipsHelper", "isMultiTaskFirstAdd, flag: " + z17);
            if (!z17) {
                com.tencent.mars.xlog.Log.i(str, "[enterTips] first Add!");
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskFirstAdd, flag: true");
                com.tencent.mm.sdk.platformtools.o4.M("multitask_tips_config").putBoolean("multitask_first_add_flag", true);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskFirstAddTime, time: " + currentTimeMillis);
                com.tencent.mm.sdk.platformtools.o4.M("multitask_tips_config").putLong("multitask_first_add_time", currentTimeMillis);
            }
        }
        com.tencent.mars.xlog.Log.i(str, "addTaskInfo, starOpt:" + multiTaskAddExtarParams + ".starOpt, id:" + id6 + ", type:" + i17 + ", success:" + valueOf + ", multiTask: " + multiTaskInfo.toJSON() + ", size: " + copyOnWriteArrayList.size());
    }
}
