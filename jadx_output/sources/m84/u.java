package m84;

/* loaded from: classes4.dex */
public abstract class u extends com.tencent.mm.plugin.sns.ui.widget.l {
    public final jz5.g A;
    public android.widget.FrameLayout B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f324789J;
    public final android.os.Handler K;
    public int L;
    public float M;
    public m84.a N;
    public final m84.o O;
    public final m84.m P;
    public final com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1 Q;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f324790o;

    /* renamed from: p, reason: collision with root package name */
    public final int f324791p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f324792q;

    /* renamed from: r, reason: collision with root package name */
    public final w64.n f324793r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.Context f324794s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f324795t;

    /* renamed from: u, reason: collision with root package name */
    public m84.w f324796u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f324797v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f324798w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f324799x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f324800y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f324801z;

    /* JADX WARN: Type inference failed for: r2v4, types: [com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1] */
    public u(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, boolean z17, i64.b1 b1Var, w64.n nVar, com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        super(str, yVar, view);
        this.f324790o = view;
        this.f324791p = i17;
        this.f324792q = z17;
        this.f324793r = nVar;
        this.f324798w = jz5.h.b(new m84.r(this));
        this.f324799x = jz5.h.b(new m84.i(this));
        this.f324800y = jz5.h.b(new m84.q(this));
        this.f324801z = jz5.h.b(new m84.j(this));
        this.A = jz5.h.b(new m84.t(this));
        this.C = jz5.h.b(new m84.l(this));
        this.D = jz5.h.b(new m84.p(this));
        this.E = jz5.h.b(new m84.f(this));
        this.F = jz5.h.b(new m84.e(this));
        this.G = jz5.h.b(new m84.g(this));
        this.H = jz5.h.b(new m84.s(this));
        this.I = jz5.h.b(new m84.k(this));
        this.K = new android.os.Handler(android.os.Looper.getMainLooper());
        this.M = 1.0f;
        this.N = m84.a.f324749d;
        this.O = new m84.o(this);
        this.P = new m84.m(this);
        android.content.Context context = view != null ? view.getContext() : null;
        final androidx.lifecycle.y yVar2 = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        yVar2 = yVar2 == null ? com.tencent.mm.app.a0.f53288d : yVar2;
        this.Q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdWorldCupAvatarUpdateEvent>(yVar2) { // from class: com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1
            {
                this.__eventId = 205742849;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsAdWorldCupAvatarUpdateEvent snsAdWorldCupAvatarUpdateEvent) {
                java.lang.String str2;
                java.lang.String str3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1");
                com.tencent.mm.autogen.events.SnsAdWorldCupAvatarUpdateEvent event = snsAdWorldCupAvatarUpdateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                m84.u uVar = m84.u.this;
                java.lang.String j17 = uVar.j();
                am.kv kvVar = event.f54802g;
                if (kvVar != null) {
                    try {
                        str2 = kvVar.f7183a;
                    } catch (java.lang.Throwable th6) {
                        ca4.q.c(j17, th6);
                    }
                } else {
                    str2 = null;
                }
                java.lang.String str4 = "";
                if (str2 == null) {
                    str2 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                m84.w wVar = uVar.f324796u;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                if (wVar == null || (str3 = wVar.f324818o) == null) {
                    str3 = "";
                }
                java.lang.String str5 = kvVar != null ? kvVar.f7184b : null;
                if (str5 != null) {
                    str4 = str5;
                }
                java.lang.String j18 = uVar.j();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEvent aid=");
                sb6.append(str2);
                sb6.append(", ownAid=");
                sb6.append(str3);
                sb6.append(", avatarUrlEmpty=");
                boolean z18 = true;
                sb6.append(str4.length() == 0);
                sb6.append(", stage=");
                sb6.append(m84.u.z(uVar));
                com.tencent.mars.xlog.Log.i(j18, sb6.toString());
                if (str2.length() != 0) {
                    z18 = false;
                }
                if (!z18 && kotlin.jvm.internal.o.b(str2, str3)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    android.os.Handler handler = uVar.K;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    handler.post(new m84.h(uVar, str4));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mEventListener$1");
                return false;
            }
        };
    }

    public static final /* synthetic */ android.widget.FrameLayout A(m84.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRoot$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.FrameLayout frameLayout = uVar.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRoot$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:16:0x0014, B:5:0x0022, B:6:0x002e, B:14:0x0028), top: B:15:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0022 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:16:0x0014, B:5:0x0022, B:6:0x002e, B:14:0x0028), top: B:15:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String B(m84.u r6, java.lang.String r7, int r8) {
        /*
            java.lang.String r0 = "access$mergeClickIndexInExtInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r6.getClass()
            java.lang.String r2 = "mergeClickIndexInExtInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            java.lang.String r3 = "click_index"
            if (r7 == 0) goto L1f
            int r4 = r7.length()     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L1b
            goto L1f
        L1b:
            r4 = 0
            goto L20
        L1d:
            r7 = move-exception
            goto L3d
        L1f:
            r4 = 1
        L20:
            if (r4 == 0) goto L28
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r7.<init>()     // Catch: java.lang.Throwable -> L1d
            goto L2e
        L28:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L1d
            r7 = r4
        L2e:
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L1d
            r7.put(r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1d
            kotlin.jvm.internal.o.d(r7)     // Catch: java.lang.Throwable -> L1d
            goto L6f
        L3d:
            java.lang.String r6 = r6.j()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "mergeClickIndexInExtInfo fail: "
            r4.<init>(r5)
            java.lang.String r7 = r7.getMessage()
            r4.append(r7)
            java.lang.String r7 = ", fallback"
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            com.tencent.mars.xlog.Log.w(r6, r7)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = java.lang.String.valueOf(r8)
            r6.put(r3, r7)
            java.lang.String r7 = r6.toString()
            kotlin.jvm.internal.o.d(r7)
        L6f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.u.B(m84.u, java.lang.String, int):java.lang.String");
    }

    public static void J(m84.u uVar, android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doLayoutView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            throw unsupportedOperationException;
        }
        if ((i37 & 8) != 0) {
            i19 = 0;
        }
        if ((i37 & 16) != 0) {
            i27 = 0;
        }
        if ((i37 & 32) != 0) {
            i28 = 0;
        }
        if ((i37 & 64) != 0) {
            i29 = 0;
        }
        uVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                layoutParams.width = i17;
                layoutParams.height = i18;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i19;
                marginLayoutParams.topMargin = i27;
                marginLayoutParams.rightMargin = i28;
                marginLayoutParams.bottomMargin = i29;
            } else if (layoutParams != null) {
                layoutParams.width = i17;
                layoutParams.height = i18;
            }
            view.requestLayout();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutView$default", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        if ((r6.length() > 0) == true) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m84.a y(m84.u r6) {
        /*
            java.lang.String r0 = "access$decideStageAfterStageOne"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r6.getClass()
            java.lang.String r2 = "decideStageAfterStageOne"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            m84.w r6 = r6.f324796u
            if (r6 != 0) goto L19
            m84.a r6 = m84.a.f324749d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L61
        L19:
            java.lang.String r3 = r6.f324818o
            boolean r3 = m84.a0.d(r3)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L40
            mb4.e r3 = r6.f324811h
            if (r3 == 0) goto L3a
            java.lang.String r3 = r3.c()
            if (r3 == 0) goto L3a
            int r3 = r3.length()
            if (r3 <= 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r5
        L36:
            if (r3 != r4) goto L3a
            r3 = r4
            goto L3b
        L3a:
            r3 = r5
        L3b:
            if (r3 == 0) goto L40
            m84.a r6 = m84.a.f324752g
            goto L5e
        L40:
            mb4.e r6 = r6.f324809f
            if (r6 == 0) goto L56
            java.lang.String r6 = r6.c()
            if (r6 == 0) goto L56
            int r6 = r6.length()
            if (r6 <= 0) goto L52
            r6 = r4
            goto L53
        L52:
            r6 = r5
        L53:
            if (r6 != r4) goto L56
            goto L57
        L56:
            r4 = r5
        L57:
            if (r4 == 0) goto L5c
            m84.a r6 = m84.a.f324751f
            goto L5e
        L5c:
            m84.a r6 = m84.a.f324749d
        L5e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L61:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.u.y(m84.u):m84.a");
    }

    public static final /* synthetic */ m84.a z(m84.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCurrentStage$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        m84.a aVar = uVar.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCurrentStage$p", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return aVar;
    }

    public final void C() {
        int i17 = this.f324791p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        java.lang.String j17 = j();
        try {
            int u17 = ca4.m0.u(j(), this.L);
            int v17 = ca4.m0.v(j(), i17, this.f324792q);
            java.lang.String j18 = j();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMNickNameTv", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            com.tencent.mm.plugin.sns.ui.AsyncTextView asyncTextView = (com.tencent.mm.plugin.sns.ui.AsyncTextView) ((jz5.n) this.f324801z).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMNickNameTv", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            int w17 = ca4.m0.w(j18, i17, asyncTextView);
            H(u17, v17, w17);
            c(new m84.b(this, u17, v17, w17));
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void D(android.view.View view, m84.c0 c0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyHotZone", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyHotZone", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        if (c0Var != null && c0Var.a()) {
            float f17 = c0Var.f324765a;
            float f18 = this.M;
            J(this, view, (int) (f17 * f18), (int) (c0Var.f324766b * f18), (int) (c0Var.f324767c * f18), (int) (c0Var.f324768d * f18), 0, 0, 96, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyHotZone", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "applyHotZone", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/HotZoneInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "applyHotZone", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/HotZoneInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyHotZone", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void E(m84.a aVar, m84.w wVar) {
        r45.jj4 b17;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        r45.jj4 b18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (aVar == m84.a.f324749d) {
            android.widget.ImageView R = R();
            if (R != null) {
                R.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        int ordinal = aVar.ordinal();
        mb4.e eVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : com.tencent.mm.ui.bk.C() ? wVar.f324812i : wVar.f324811h : com.tencent.mm.ui.bk.C() ? wVar.f324810g : wVar.f324809f : com.tencent.mm.ui.bk.C() ? wVar.f324808e : wVar.f324807d;
        int ordinal2 = aVar.ordinal();
        mb4.e eVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : wVar.f324811h : wVar.f324809f : wVar.f324807d;
        if (eVar == null || (b18 = eVar.b()) == null) {
            b17 = eVar2 != null ? eVar2.b() : null;
        } else {
            b17 = b18;
        }
        android.content.Context context = this.f324794s;
        int i17 = 0;
        if (b17 == null || context == null) {
            android.widget.ImageView R2 = R();
            if (R2 != null) {
                R2.setVisibility(0);
            }
            com.tencent.mars.xlog.Log.w(j(), "applyPagThumb, no thumb media for stage=" + aVar);
        } else {
            android.widget.ImageView R3 = R();
            if (R3 != null) {
                R3.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            android.widget.ImageView R4 = R();
            int hashCode = context.hashCode();
            com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f324795t;
            if (snsInfo != null && (timeLine = snsInfo.getTimeLine()) != null) {
                i17 = timeLine.CreateTime;
            }
            s7Var.f195313b = i17;
            hj6.W(b17, R4, com.tencent.mm.R.drawable.f482115d90, hashCode, s7Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void F(android.view.View view, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        } else {
            view.setOnClickListener(new m84.c(this, adClickActionInfo, i18, i17, snsInfo));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        }
    }

    public final void G(android.view.View view, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindIntroClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindIntroClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        if (adClickActionInfo != null && snsInfo != null) {
            view.setOnClickListener(new m84.d(this, adClickActionInfo, snsInfo));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindIntroClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        } else {
            com.tencent.mars.xlog.Log.w(j(), "bindIntroClickArea, clickActionInfo or model is null, target will be unclickable");
            view.setOnClickListener(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindIntroClickArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        }
    }

    public final void H(int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        java.lang.String j17 = j();
        try {
            m84.w wVar = this.f324796u;
            if (wVar != null) {
                int i27 = wVar.f324804a;
                int i28 = wVar.f324805b;
                int i29 = wVar.f324806c;
                if (i27 <= 0) {
                    com.tencent.mars.xlog.Log.e(j(), "calcPartContainerSize, containerWidth<=0");
                } else {
                    int i37 = this.L;
                    int i38 = (i28 * i37) / i27;
                    int i39 = (i37 * 8) / i27;
                    int i47 = (i29 * i37) / i27;
                    int i48 = (((i17 + i19) + i39) + i47) - i38;
                    com.tencent.mars.xlog.Log.i(j(), "calcPartContainerSize, imagesKeeperLayoutHeight=" + i17 + ", leftMargin=" + i18 + ", topMargin=" + i19 + ", totalTopMargin=" + i48 + ", realContainerWidth=" + i37 + ", realContainerHeight=" + i38 + ", realBottomMarginOffset=" + i39 + ", realBottomBarOffset=" + i47);
                    android.widget.FrameLayout frameLayout = this.B;
                    android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.width = i37;
                        marginLayoutParams.height = i38;
                        marginLayoutParams.leftMargin = i18;
                        marginLayoutParams.topMargin = i48;
                    }
                    android.widget.FrameLayout frameLayout2 = this.B;
                    if (frameLayout2 != null) {
                        frameLayout2.requestLayout();
                    }
                    J(this, Q(), i37, i38, 0, 0, 0, 0, 120, null);
                    D(M(), wVar.f324813j);
                    D(O(), wVar.f324814k);
                    for (int i49 = 0; i49 < 4; i49++) {
                        android.view.View view = (android.view.View) kz5.n0.a0(P(), i49);
                        m84.c0 c0Var = (m84.c0) kz5.n0.a0(wVar.f324815l, i49);
                        if (view != null) {
                            if (c0Var != null && c0Var.a()) {
                                D(view, c0Var);
                            }
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "calcPartContainerSize", "(III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "calcPartContainerSize", "(III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                    D(N(), wVar.f324813j);
                    U(i47 + i39);
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if ((r7.length() > 0) == true) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m84.a I(m84.w r7) {
        /*
            r6 = this;
            java.lang.String r0 = "decideInitialStage"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = r7.f324818o
            boolean r2 = m84.a0.d(r2)
            java.lang.String r3 = "hasStageOne"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            mb4.e r5 = r7.f324807d
            boolean r5 = r7.b(r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r5 == 0) goto L26
            m84.a r7 = m84.a.f324750e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        L26:
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4a
            mb4.e r2 = r7.f324811h
            if (r2 == 0) goto L41
            java.lang.String r2 = r2.c()
            if (r2 == 0) goto L41
            int r2 = r2.length()
            if (r2 <= 0) goto L3c
            r2 = r3
            goto L3d
        L3c:
            r2 = r4
        L3d:
            if (r2 != r3) goto L41
            r2 = r3
            goto L42
        L41:
            r2 = r4
        L42:
            if (r2 == 0) goto L4a
            m84.a r7 = m84.a.f324752g
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        L4a:
            mb4.e r7 = r7.f324809f
            if (r7 == 0) goto L60
            java.lang.String r7 = r7.c()
            if (r7 == 0) goto L60
            int r7 = r7.length()
            if (r7 <= 0) goto L5c
            r7 = r3
            goto L5d
        L5c:
            r7 = r4
        L5d:
            if (r7 != r3) goto L60
            goto L61
        L60:
            r3 = r4
        L61:
            if (r3 == 0) goto L69
            m84.a r7 = m84.a.f324751f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        L69:
            m84.a r7 = m84.a.f324749d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.u.I(m84.w):m84.a");
    }

    public final w64.n K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return this.f324793r;
    }

    public final android.view.View L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return this.f324790o;
    }

    public final android.view.View M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAvatarHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.F).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAvatarHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return view;
    }

    public final android.widget.ImageView N() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAvatarImage", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.E).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAvatarImage", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return imageView;
    }

    public final android.view.View O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDescHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.G).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDescHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return view;
    }

    public final java.util.List P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMOptionHotAreas", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        java.util.List list = (java.util.List) ((jz5.n) this.I).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMOptionHotAreas", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return list;
    }

    public final android.widget.FrameLayout Q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPagContainer", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.C).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPagContainer", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return frameLayout;
    }

    public final android.widget.ImageView R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.D).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPagThumb", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return imageView;
    }

    public final android.widget.FrameLayout S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdBlankView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f324800y).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdBlankView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return frameLayout;
    }

    public final android.view.View T() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStageOneHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.H).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStageOneHotArea", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        return view;
    }

    public final void U(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshSpaceView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.FrameLayout S = S();
        android.view.ViewGroup.LayoutParams layoutParams = S != null ? S.getLayoutParams() : null;
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshSpaceView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        int i18 = this.L;
        if (i18 <= 0 || i17 <= 0) {
            android.widget.FrameLayout S2 = S();
            if (S2 != null) {
                S2.setVisibility(8);
            }
        } else {
            layoutParams.width = i18;
            layoutParams.height = i17;
            android.widget.FrameLayout S3 = S();
            if (S3 != null) {
                S3.setLayoutParams(layoutParams);
            }
            android.widget.FrameLayout S4 = S();
            if (S4 != null) {
                S4.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshSpaceView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAllClickAreas", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        android.widget.FrameLayout frameLayout = this.B;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        android.view.View T = T();
        if (T != null) {
            T.setOnClickListener(null);
        }
        android.view.View M = M();
        if (M != null) {
            M.setOnClickListener(null);
        }
        android.view.View O = O();
        if (O != null) {
            O.setOnClickListener(null);
        }
        for (android.view.View view : P()) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        android.view.View T2 = T();
        if (T2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(T2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            T2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(T2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View M2 = M();
        if (M2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(M2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            M2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(M2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View O2 = O();
        if (O2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(O2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(O2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        for (android.view.View view2 : P()) {
            if (view2 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetAllClickAreas", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAllClickAreas", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetDataAndView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        this.K.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeListener", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        java.lang.String j17 = j();
        try {
            dead();
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeListener", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        X();
        android.widget.ImageView N = N();
        if (N != null) {
            N.setVisibility(8);
        }
        android.widget.ImageView R = R();
        if (R != null) {
            R.clearAnimation();
        }
        android.widget.ImageView R2 = R();
        if (R2 != null) {
            R2.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = this.B;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        android.view.View T = T();
        if (T != null) {
            T.setOnClickListener(null);
        }
        android.view.View T2 = T();
        if (T2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(T2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetDataAndView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            T2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(T2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "resetDataAndView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout2 = this.B;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        android.widget.FrameLayout S = S();
        if (S != null) {
            S.setVisibility(8);
        }
        this.N = m84.a.f324749d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDataAndView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void X() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetPagView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        java.lang.String j17 = j();
        try {
            com.tencent.mm.view.MMPAGView mMPAGView = this.f324789J;
            this.f324789J = null;
            if (mMPAGView != null) {
                a84.y0.i(mMPAGView);
                m84.o oVar = this.O;
                m84.m mVar = this.P;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
                try {
                    mMPAGView.i(oVar);
                    mMPAGView.j(mVar);
                    mMPAGView.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.b0(mMPAGView));
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            }
        } catch (java.lang.Throwable th7) {
            ca4.q.c(j17, th7);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetPagView", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    public final void Y(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickEvents", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        m84.w wVar = this.f324796u;
        if (wVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvents", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17 = wVar.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w(j(), "setClickEvents, clickActionInfo is null, hot areas will be unclickable");
            android.view.View M = M();
            if (M != null) {
                M.setOnClickListener(null);
            }
            android.view.View O = O();
            if (O != null) {
                O.setOnClickListener(null);
            }
            for (android.view.View view : P()) {
                if (view != null) {
                    view.setOnClickListener(null);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvents", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
            return;
        }
        F(M(), a17, snsInfo, 41, 0);
        F(O(), a17, snsInfo, 41, 99);
        for (int i17 = 0; i17 < 4; i17++) {
            android.view.View view2 = (android.view.View) kz5.n0.a0(P(), i17);
            if (view2 != null) {
                m84.c0 c0Var = (m84.c0) kz5.n0.a0(wVar.f324815l, i17);
                if (c0Var == null || !c0Var.a()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "setClickEvents", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "setClickEvents", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setOnClickListener(null);
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "setClickEvents", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent", "setClickEvents", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    F(view2, a17, snsInfo, 41, i17 + 1);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvents", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        r2 = N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        a84.m.b(r0, N());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fb, code lost:
    
        r2.setVisibility(0);
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025a A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028b A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0294 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0381 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0337 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ea A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029e A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0266 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c0 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f5 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ee A[Catch: all -> 0x0577, TryCatch #0 {all -> 0x0577, blocks: (B:171:0x0432, B:173:0x0490, B:174:0x0495, B:177:0x04e8, B:179:0x04ee, B:180:0x04f2, B:181:0x04a0, B:191:0x04ff, B:194:0x050c, B:197:0x0517, B:199:0x051b, B:200:0x0521, B:202:0x0527, B:203:0x052a, B:206:0x0531, B:208:0x0513, B:209:0x0509), top: B:16:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04a0 A[Catch: all -> 0x0577, TryCatch #0 {all -> 0x0577, blocks: (B:171:0x0432, B:173:0x0490, B:174:0x0495, B:177:0x04e8, B:179:0x04ee, B:180:0x04f2, B:181:0x04a0, B:191:0x04ff, B:194:0x050c, B:197:0x0517, B:199:0x051b, B:200:0x0521, B:202:0x0527, B:203:0x052a, B:206:0x0531, B:208:0x0513, B:209:0x0509), top: B:16:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03cc A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0214 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ca A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017d A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0117 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b9 A[Catch: all -> 0x0579, TryCatch #1 {all -> 0x0579, blocks: (B:3:0x0016, B:5:0x001a, B:8:0x001e, B:10:0x0022, B:12:0x0026, B:14:0x0042, B:24:0x007f, B:27:0x0089, B:29:0x008f, B:30:0x0094, B:32:0x0098, B:37:0x00ad, B:41:0x00c0, B:43:0x00e2, B:45:0x00ea, B:50:0x00f4, B:53:0x00fe, B:54:0x011a, B:56:0x011e, B:57:0x0121, B:59:0x0127, B:60:0x012a, B:63:0x0176, B:66:0x01c3, B:69:0x0210, B:71:0x0214, B:75:0x01ca, B:76:0x017d, B:77:0x0131, B:78:0x00fb, B:79:0x0106, B:82:0x0117, B:85:0x00b9, B:88:0x00a4, B:90:0x0092, B:91:0x0086, B:92:0x0219, B:93:0x0221, B:94:0x0222, B:97:0x022c, B:100:0x0236, B:102:0x023c, B:103:0x0241, B:105:0x0245, B:110:0x025a, B:114:0x026d, B:116:0x028b, B:117:0x028e, B:119:0x0294, B:120:0x0297, B:123:0x02e3, B:126:0x0330, B:129:0x037d, B:131:0x0381, B:132:0x0337, B:133:0x02ea, B:134:0x029e, B:136:0x0266, B:139:0x0251, B:141:0x023f, B:142:0x0233, B:143:0x0229, B:144:0x0388, B:147:0x0392, B:150:0x039c, B:152:0x03a2, B:153:0x03a7, B:155:0x03ab, B:160:0x03c0, B:164:0x03d3, B:166:0x03f5, B:169:0x03fd, B:183:0x03cc, B:186:0x03b7, B:188:0x03a5, B:189:0x0399, B:190:0x038f), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(m84.a r28) {
        /*
            Method dump skipped, instructions count: 1413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.u.Z(m84.a):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        android.content.Context context;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        m84.w wVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        kotlin.jvm.internal.o.g(model, "model");
        android.view.View view = this.f324790o;
        if (view == null || (context = view.getContext()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        } else {
            this.f324794s = context;
            java.lang.String j17 = j();
            try {
                if (!this.f324797v) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMViewStub", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.A).getValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMViewStub", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    android.view.View h17 = a84.y0.h(viewStub);
                    this.B = h17 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) h17 : null;
                    this.f324797v = true;
                }
                this.f324795t = model;
                adXml = model.getAdXml();
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            if (adXml != null && (wVar = adXml.adWorldCupAvatarInfo) != null) {
                this.f324796u = wVar;
                java.lang.String aid = model.getAid();
                if (aid == null) {
                    aid = "";
                }
                wVar.f324818o = aid;
                if (wVar.c()) {
                    int y17 = ca4.m0.y(j(), this.f324794s, this.f324791p, this.f324792q);
                    this.L = y17;
                    int i17 = wVar.f324804a;
                    int i18 = wVar.f324805b;
                    int i19 = wVar.f324806c;
                    this.M = i17 > 0 ? y17 / i17 : 1.0f;
                    com.tencent.mars.xlog.Log.i(j(), "bindComponentModel snsId=" + ca4.z0.t0(model.field_snsId) + " isSame=" + z17 + " containerWidth=" + i17 + " containerHeight=" + i18 + " bottomOffset=" + i19 + " available=" + this.L + " scale=" + this.M);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    com.tencent.mm.plugin.sns.ui.AdFrameLayout adFrameLayout = (com.tencent.mm.plugin.sns.ui.AdFrameLayout) ((jz5.n) this.f324798w).getValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    if (adFrameLayout != null) {
                        adFrameLayout.setVisibility(0);
                    }
                    android.widget.FrameLayout frameLayout = this.B;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                    android.widget.ImageView N = N();
                    if (N != null) {
                        N.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                    }
                    android.widget.ImageView N2 = N();
                    if (N2 != null) {
                        N2.setVisibility(8);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addListener", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    java.lang.String j18 = j();
                    try {
                        alive();
                    } catch (java.lang.Throwable th7) {
                        ca4.q.c(j18, th7);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    Z(I(wVar));
                    C();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                } else {
                    com.tencent.mars.xlog.Log.w(j(), "bindComponentModel, info invalid, snsId=" + ca4.z0.t0(model.field_snsId));
                    android.widget.FrameLayout frameLayout2 = this.B;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(8);
                    }
                    android.widget.FrameLayout S = S();
                    if (S != null) {
                        S.setVisibility(8);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        com.tencent.mars.xlog.Log.i(j(), "resetComponentState");
        W();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
    }
}
