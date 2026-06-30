package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public abstract class i {
    public com.tencent.mm.plugin.sns.ui.listener.h1 A;
    public com.tencent.mm.plugin.sns.ui.listener.h1 B;
    public com.tencent.mm.plugin.sns.ui.listener.h1 C;
    public com.tencent.mm.plugin.sns.ui.listener.h1 D;
    public com.tencent.mm.plugin.sns.ui.listener.h1 E;
    public com.tencent.mm.plugin.sns.ui.listener.h1 F;
    public com.tencent.mm.plugin.sns.ui.listener.h1 G;
    public android.view.View.OnClickListener H;
    public android.view.View.OnClickListener I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View.OnClickListener f169797J;
    public android.view.View.OnClickListener K;
    public android.view.View.OnClickListener L;
    public android.view.View.OnClickListener M;
    public android.view.View.OnClickListener N;
    public android.view.View.OnClickListener O;
    public android.widget.AdapterView.OnItemClickListener P;
    public android.widget.AdapterView.OnItemClickListener Q;
    public final android.view.View.OnClickListener R = new com.tencent.mm.plugin.sns.ui.listener.u(this);
    public final android.view.View.OnClickListener S = new com.tencent.mm.plugin.sns.ui.listener.r0(this);
    public android.view.View.OnClickListener T;
    public int U;
    public final com.tencent.mm.sdk.event.IListener V;
    public final com.tencent.mm.sdk.event.IListener W;
    public final android.view.View.OnClickListener X;

    /* renamed from: a, reason: collision with root package name */
    public final int f169798a;

    /* renamed from: b, reason: collision with root package name */
    public final android.app.Activity f169799b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.k4 f169800c;

    /* renamed from: d, reason: collision with root package name */
    public volatile xb4.y f169801d;

    /* renamed from: e, reason: collision with root package name */
    public volatile xb4.w f169802e;

    /* renamed from: f, reason: collision with root package name */
    public volatile wb4.j f169803f;

    /* renamed from: g, reason: collision with root package name */
    public volatile wb4.i f169804g;

    /* renamed from: h, reason: collision with root package name */
    public i64.b1 f169805h;

    /* renamed from: i, reason: collision with root package name */
    public w64.n f169806i;

    /* renamed from: j, reason: collision with root package name */
    public int f169807j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f169808k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.c f169809l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View.OnClickListener f169810m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View.OnLongClickListener f169811n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.h1 f169812o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View.OnClickListener f169813p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View.OnClickListener f169814q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnClickListener f169815r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View.OnClickListener f169816s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View.OnClickListener f169817t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View.OnClickListener f169818u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View.OnClickListener f169819v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View.OnClickListener f169820w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View.OnClickListener f169821x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.h1 f169822y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.h1 f169823z;

    public i(int i17, android.app.Activity activity, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        this.f169798a = 0;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.V = new com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4(this, a0Var);
        this.W = new com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5(this, a0Var);
        this.X = new com.tencent.mm.plugin.sns.ui.listener.x0(this);
        this.f169798a = i17;
        this.f169799b = activity;
        this.f169800c = k4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsPOICommentFeedNewUrlSwitch"), 0);
        this.U = P;
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "init POIComment_FeedNewUrl_Switch:%d", java.lang.Integer.valueOf(P));
        this.f169809l = new com.tencent.mm.plugin.sns.ui.listener.c(activity, i17, k4Var);
        this.f169820w = new com.tencent.mm.plugin.sns.ui.listener.c1(this);
        this.I = new com.tencent.mm.plugin.sns.ui.listener.e1(this);
        this.M = new com.tencent.mm.plugin.sns.ui.listener.f1(this);
        this.f169810m = new com.tencent.mm.plugin.sns.ui.listener.g1(this);
        this.f169811n = new com.tencent.mm.plugin.sns.ui.listener.m(this);
        this.f169812o = new com.tencent.mm.plugin.sns.ui.listener.n(this);
        this.D = new com.tencent.mm.plugin.sns.ui.listener.o(this);
        this.A = new com.tencent.mm.plugin.sns.ui.listener.p(this);
        this.F = new com.tencent.mm.plugin.sns.ui.listener.q(this);
        this.f169823z = new com.tencent.mm.plugin.sns.ui.listener.r(this);
        this.C = new com.tencent.mm.plugin.sns.ui.listener.s(this);
        this.f169813p = new com.tencent.mm.plugin.sns.ui.listener.t(this);
        this.f169814q = new com.tencent.mm.plugin.sns.ui.listener.x(this);
        this.f169815r = new com.tencent.mm.plugin.sns.ui.listener.y(this);
        this.f169821x = new com.tencent.mm.plugin.sns.ui.listener.z(this);
        this.f169816s = new com.tencent.mm.plugin.sns.ui.listener.a0(this);
        this.f169817t = new com.tencent.mm.plugin.sns.ui.listener.b0(this);
        this.f169818u = new com.tencent.mm.plugin.sns.ui.listener.c0(this);
        this.f169819v = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.listener.i$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.listener.i iVar = com.tencent.mm.plugin.sns.ui.listener.i.this;
                iVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$init$0", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", iVar, array);
                gc4.k.f270459a.b(iVar.f169799b, com.tencent.mm.plugin.sns.storage.w2.m((java.lang.String) view.getTag()), 1, 2);
                yj0.a.h(iVar, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$init$0", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            }
        };
        this.f169822y = new com.tencent.mm.plugin.sns.ui.listener.d0(this);
        this.H = new com.tencent.mm.plugin.sns.ui.listener.e0(this);
        this.K = new com.tencent.mm.plugin.sns.ui.listener.f0(this);
        this.f169797J = new com.tencent.mm.plugin.sns.ui.listener.i0(this);
        this.B = new com.tencent.mm.plugin.sns.ui.listener.j0(this);
        this.L = new com.tencent.mm.plugin.sns.ui.listener.k0(this);
        this.P = new com.tencent.mm.plugin.sns.ui.listener.l0(this);
        this.Q = new com.tencent.mm.plugin.sns.ui.listener.m0(this);
        this.T = new com.tencent.mm.plugin.sns.ui.listener.n0(this);
        this.G = new com.tencent.mm.plugin.sns.ui.listener.o0(this);
        this.E = new com.tencent.mm.plugin.sns.ui.listener.p0(this);
        this.N = new com.tencent.mm.plugin.sns.ui.listener.q0(this);
        this.O = new com.tencent.mm.plugin.sns.ui.listener.w0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public static void Q(android.content.Context context, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        r45.q1 q1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportGameVideo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (timeLineObject != null && (q1Var = timeLineObject.actionInfo) != null && q1Var.f383556m != null) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str = timeLineObject.actionInfo.f383556m.f380054d;
            ((kt.c) i0Var).getClass();
            if (com.tencent.mm.pluginsdk.model.app.w.t(str)) {
                r45.q1 q1Var2 = timeLineObject.actionInfo;
                java.lang.String Ai = ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(q1Var2.f383556m.f380054d, false);
                o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                r45.m1 m1Var = q1Var2.f383556m;
                ((com.tencent.mm.app.o7) wi6).Ni(context, m1Var.f380054d, Ai, timeLineObject.UserName, 38, 19, 10, m1Var.f380055e, 0L, timeLineObject.Id);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGameVideo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public static com.tencent.mm.plugin.sns.storage.SnsInfo a(com.tencent.mm.plugin.sns.ui.listener.i iVar, android.view.View view) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfoFromTag", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj) {
            snsInfo = com.tencent.mm.plugin.sns.storage.l1.b(((com.tencent.mm.plugin.sns.ui.oj) view.getTag()).f170102a);
        } else if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.MaskImageView) {
            com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = (com.tencent.mm.plugin.sns.ui.MaskImageView) view.getTag();
            if (maskImageView.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj) {
                snsInfo = com.tencent.mm.plugin.sns.storage.l1.b(((com.tencent.mm.plugin.sns.ui.oj) maskImageView.getTag()).f170102a);
            }
            snsInfo = null;
        } else if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.g9) {
            snsInfo = com.tencent.mm.plugin.sns.model.l4.Fj().k1(((com.tencent.mm.plugin.sns.ui.g9) view.getTag()).f168412b);
        } else if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) {
            snsInfo = com.tencent.mm.plugin.sns.storage.l1.a(((com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag()).f169264d);
        } else {
            if (view.getTag() instanceof dc4.v) {
                snsInfo = ((dc4.v) view.getTag()).f228832e;
            }
            snsInfo = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoFromTag", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return snsInfo;
    }

    public static void b(com.tencent.mm.plugin.sns.ui.listener.i iVar, android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.ui.g9 g9Var = view.getTag() instanceof com.tencent.mm.plugin.sns.ui.g9 ? (com.tencent.mm.plugin.sns.ui.g9) view.getTag() : null;
        if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) {
            g9Var = ((com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag()).f169269f0;
        }
        if (view.getTag() instanceof dc4.v) {
            g9Var = ((dc4.v) view.getTag()).f228835h;
        }
        if (snsInfo == null || g9Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            com.tencent.mm.plugin.sns.model.k4 k4Var = iVar.f169800c;
            if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                k4Var.a().e(snsInfo);
            }
            boolean isAd = snsInfo.isAd();
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
            java.util.LinkedList linkedList = timeLine.ContentObj.f369840h;
            if (linkedList == null || linkedList.size() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            } else {
                r45.jj4 jj4Var = (r45.jj4) timeLine.ContentObj.f369840h.get(0);
                if (isAd && !com.tencent.mm.plugin.sns.model.l4.hj().D(jj4Var)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1910, 4);
                }
                if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(snsInfo)) {
                    com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent();
                    snsAdLivingStreamJumpEvent.f54794g.f6405a = ca4.z0.T(snsInfo);
                    snsAdLivingStreamJumpEvent.e();
                }
                boolean z18 = true;
                if (!(snsInfo.isAd() && snsInfo.getAdXml().isLandingPagesAd() && za4.z0.u(str)) && isAd && com.tencent.mm.plugin.sns.model.l4.hj().E(jj4Var)) {
                    com.tencent.mm.plugin.sns.model.l4.hj().p0(jj4Var);
                    g9Var.f168419i.setVisibility(8);
                    g9Var.f168420j.setVisibility(8);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1910, 7);
                }
                int[] iArr = new int[2];
                g9Var.f168418h.getLocationInWindow(iArr);
                int width = g9Var.f168418h.getWidth();
                int height = g9Var.f168418h.getHeight();
                w64.x i18 = w64.x.i(view);
                iVar.x(view, g9Var.f168418h, i18);
                if (iVar.v(snsInfo, i17)) {
                    iVar.R(view, snsInfo, i17, i18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                } else {
                    if (ca4.m0.R(iVar.f169799b, snsInfo, iVar.w(snsInfo), iVar.f169798a, iVar.f169805h, i17, 0)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                    } else {
                        if (i17 != 1001 ? !snsInfo.isAd() || !za4.z0.x(snsInfo.getAdXml(), str) : !snsInfo.isAd() || !za4.z0.w(snsInfo.getAdXml(), str)) {
                            z18 = false;
                        }
                        if (z18) {
                            iVar.S(view, snsInfo, i17, str, z17, 1, iArr, width, height);
                        } else {
                            iVar.R(view, snsInfo, i17, i18);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public static boolean c(com.tencent.mm.plugin.sns.ui.listener.i iVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canTagSupportClickActionInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canTagSupportClickActionInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            r2 = snsInfo.getAdXml().adActionLinkClickInfo != null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canTagSupportClickActionInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return r2;
    }

    public static void d(com.tencent.mm.plugin.sns.ui.listener.i iVar, android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, w64.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adActionLinkJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "adActionLinkJump, snsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adActionLinkJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else if (iVar.f169806i == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "adActionLinkJump, mAdClickActionHandler is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adActionLinkJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = snsInfo.getAdXml().adActionLinkClickInfo;
            if (adClickActionInfo != null) {
                adClickActionInfo.f162569a = 10;
                iVar.f169806i.n(adClickActionInfo, snsInfo);
                iVar.f169806i.x(xVar);
                iVar.U(xVar, snsInfo.getAdXml().forbiddenCustomAnimation);
                iVar.f169806i.k(view);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adActionLinkJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public static /* synthetic */ android.app.Activity e(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        android.app.Activity activity = iVar.f169799b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return activity;
    }

    public static void f(com.tencent.mm.plugin.sns.ui.listener.i iVar, android.content.Intent intent, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (iVar.f169805h == null || intent == null || snsInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "snsAdStatistic or intent or info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            if (com.tencent.mm.plugin.sns.ui.bs.j(snsInfo) != 9 && com.tencent.mm.plugin.sns.ui.bs.j(snsInfo) != 19) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "viewType is not TYPE_SIGHT and is not TYPE_AD_SIGHT");
            } else if (snsInfo.getAdXml().adVideoContinuePlay) {
                long g17 = iVar.f169805h.g(snsInfo.field_snsId);
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "snsId = " + snsInfo.field_snsId + ", adSightVideoSeekTime = " + g17);
                intent.putExtra("sns_landing_page_sight_video_seek_time", g17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public static boolean g(com.tencent.mm.plugin.sns.ui.listener.i iVar, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.storage.b bVar;
        boolean y17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (aDInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            y17 = false;
        } else {
            if (z17 && snsInfo.getAdXml().adTurnInfo.f166101a != null) {
                str = snsInfo.getAdXml().adTurnInfo.f166101a;
                str2 = snsInfo.getAdXml().adTurnInfo.f166102b;
                str3 = snsInfo.getAdXml().adTurnInfo.f166103c;
            } else if (z17 || aDInfo.adActionType != 4 || (bVar = aDInfo.actionExtWeApp) == null) {
                str = "";
                str2 = "";
                str3 = str2;
            } else {
                java.lang.String str4 = bVar.f165926a;
                java.lang.String str5 = bVar.f165927b;
                str3 = bVar.f165928c;
                str = str4;
                str2 = str5;
            }
            y17 = y(str, str2, str3, snsInfo, iVar.f169798a);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return y17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.model.k4 h(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.model.k4 k4Var = iVar.f169800c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return k4Var;
    }

    public static /* synthetic */ void i(com.tencent.mm.plugin.sns.ui.listener.i iVar, android.view.View view, android.view.View view2, w64.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.x(view, view2, xVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public static void j(com.tencent.mm.plugin.sns.ui.listener.i iVar, android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, int i17, int i18, w64.x xVar) {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "snsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else if (aDInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "adInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else if (a84.b0.b(aDInfo.adClickActionInfoList)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "adClickActionInfoList is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            try {
                adClickActionInfo = aDInfo.adClickActionInfoList.get(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", th6.toString());
            }
            if (adClickActionInfo != null && iVar.f169806i != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "clickActionIndexJump, clickType=" + adClickActionInfo.f162571b + ", scene=" + i18);
                l44.k4.f316220a.d(view, snsInfo, adClickActionInfo, i18);
                adClickActionInfo.f162569a = i18;
                iVar.f169806i.p(new w64.c(adClickActionInfo, snsInfo, i17, iVar.f169800c));
                iVar.f169806i.x(xVar);
                iVar.U(xVar, snsInfo.getAdXml().forbiddenCustomAnimation);
                iVar.f169806i.k(view);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "adClickActionInfo or adClickActionHandler is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public static void k(com.tencent.mm.plugin.sns.ui.listener.i iVar, android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cardSelectPicCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        android.view.ViewGroup viewGroup = null;
        if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
            if (baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.k) {
                tagImageView = ((com.tencent.mm.plugin.sns.ui.item.k) baseViewHolder).G0;
            } else if (baseViewHolder instanceof s74.p0) {
                viewGroup = ((s74.p0) baseViewHolder).b();
                tagImageView = null;
            } else {
                tagImageView = baseViewHolder.T.g(0);
            }
        } else {
            tagImageView = view.getTag() instanceof com.tencent.mm.plugin.sns.ui.MaskImageView ? (com.tencent.mm.plugin.sns.ui.MaskImageView) view.getTag() : view.getTag() instanceof dc4.d0 ? ((dc4.d0) view.getTag()).f228739y : (com.tencent.mm.plugin.sns.ui.TagImageView) view;
        }
        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView2 = tagImageView;
        android.view.ViewGroup viewGroup2 = viewGroup;
        w64.x i18 = w64.x.i(view);
        iVar.x(view, tagImageView2, i18);
        if (iVar.v(snsInfo, i17)) {
            iVar.R(view, snsInfo, i17, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardSelectPicCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            if (ca4.m0.R(iVar.f169799b, snsInfo, iVar.w(snsInfo), iVar.f169798a, iVar.f169805h, i17, 0)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardSelectPicCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            } else {
                android.view.View view2 = tagImageView2 == null ? viewGroup2 : tagImageView2;
                if (i17 != 1001 ? snsInfo.isAd() && za4.z0.x(snsInfo.getAdXml(), str) : snsInfo.isAd() && za4.z0.w(snsInfo.getAdXml(), str)) {
                    int[] iArr = new int[2];
                    if (com.tencent.mm.ui.bk.y()) {
                        view2.getLocationOnScreen(iArr);
                    } else {
                        view2.getLocationInWindow(iArr);
                    }
                    iVar.S(view, snsInfo, i17, str, z17, 2, iArr, view2.getWidth(), view2.getHeight());
                } else {
                    iVar.R(view, snsInfo, i17, i18);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardSelectPicCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public static android.view.View l(com.tencent.mm.plugin.sns.ui.listener.i iVar, boolean z17, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        android.view.View view2 = null;
        view2 = null;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder ? (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag() : null;
            if (baseViewHolder != null) {
                view = baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.y ? ((com.tencent.mm.plugin.sns.ui.item.y) baseViewHolder).D0.f425165z : baseViewHolder.f169269f0.f168418h;
            } else if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.g9) {
                view = ((com.tencent.mm.plugin.sns.ui.g9) view.getTag()).f168418h;
            }
            view2 = view;
        } else if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) {
            view2 = view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.k ? ((com.tencent.mm.plugin.sns.ui.item.k) view.getTag()).G0 : view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.y ? ((com.tencent.mm.plugin.sns.ui.item.y) view.getTag()).D0.f425151l : view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.p0 ? ((com.tencent.mm.plugin.sns.ui.item.p0) view.getTag()).G0 : view.getTag() instanceof s74.p0 ? ((s74.p0) view.getTag()).b() : ((com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag()).T.g(0);
        } else if (view.getTag() instanceof dc4.v) {
            if (view.getTag() instanceof dc4.d0) {
                view2 = ((dc4.d0) view.getTag()).f228739y;
            } else if (view.getTag() instanceof dc4.l0) {
                view2 = ((dc4.l0) view.getTag()).m().f425151l;
            } else if (view.getTag() instanceof dc4.v0) {
                view2 = ((dc4.v0) view.getTag()).f228833f;
            } else if (view.getTag() instanceof dc4.p) {
                view2 = ((dc4.p) view.getTag()).n();
            }
        } else if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.MaskImageView) {
            view2 = (com.tencent.mm.plugin.sns.ui.MaskImageView) view.getTag();
        } else if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.TagImageView) {
            view2 = (com.tencent.mm.plugin.sns.ui.TagImageView) view;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return view2;
    }

    public static void m(com.tencent.mm.plugin.sns.ui.listener.i iVar, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("intAdClickActionStateChangeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (view == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "intAdClickActionStateChangeListener, but clicked view is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("intAdClickActionStateChangeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            com.tencent.mm.plugin.sns.ui.pa paVar = view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.k ? ((com.tencent.mm.plugin.sns.ui.item.k) view.getTag()).f169367i1 : view.getTag() instanceof dc4.d0 ? ((dc4.d0) view.getTag()).H : null;
            if (paVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("intAdClickActionStateChangeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            } else {
                w64.k kVar = paVar.B;
                if (kVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "intAdClickActionStateChangeListener, but snsAdCardActionBtnCtrl mClickStateChangeListener is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("intAdClickActionStateChangeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                } else {
                    w64.n nVar = iVar.f169806i;
                    if (nVar != null) {
                        nVar.w(kVar);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("intAdClickActionStateChangeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public static /* synthetic */ int n(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        int i17 = iVar.f169798a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return i17;
    }

    public static /* synthetic */ xb4.y o(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        xb4.y yVar = iVar.f169801d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return yVar;
    }

    public static /* synthetic */ wb4.j p(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        wb4.j jVar = iVar.f169803f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return jVar;
    }

    public static /* synthetic */ xb4.w q(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        xb4.w wVar = iVar.f169802e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return wVar;
    }

    public static /* synthetic */ wb4.i r(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        wb4.i iVar2 = iVar.f169804g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return iVar2;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.ADInfo s(com.tencent.mm.plugin.sns.ui.listener.i iVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.storage.ADInfo w17 = iVar.w(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return w17;
    }

    public static /* synthetic */ w64.n t(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        w64.n nVar = iVar.f169806i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return nVar;
    }

    public static boolean y(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = i17 == 2 ? snsInfo.getAtAdInfo() : snsInfo.getAdInfo();
                if (atAdInfo == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "jumpWeApp adInfo==null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                    return false;
                }
                ca4.z0.r0(str, ca4.m0.d(str2, atAdInfo.addClickTimeToWeAppPath), str3, snsInfo.getAid(), snsInfo.getTraceid(), ca4.z0.t0(snsInfo.field_snsId) + ":" + atAdInfo.uxInfo + ":" + com.tencent.mm.plugin.sns.model.l4.sj() + ":" + java.lang.System.currentTimeMillis(), atAdInfo.uxInfo, i17 == 0 ? 1045 : 1046);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                return true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "jumpWeApp exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return false;
    }

    public abstract void A(android.view.View view);

    public abstract void B();

    public abstract void C(android.view.View view);

    public abstract void D(android.view.View view);

    public abstract void E(java.lang.Object obj);

    public abstract void F(android.view.View view);

    public abstract void G(android.view.View view);

    public abstract void H(android.view.View view);

    public abstract void I(android.view.View view);

    public void J(dc4.v vVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        K(vVar, null, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public void K(dc4.v vVar, android.os.Bundle bundle, w64.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (this.f169803f != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TimelineClickListener", "has already prepare detail click animation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        if (U(xVar, false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        if (vVar instanceof dc4.d0) {
            this.f169803f = new wb4.r((com.tencent.mm.ui.MMActivity) this.f169799b, vVar);
            this.f169804g = new wb4.n((com.tencent.mm.ui.MMActivity) this.f169799b, vVar);
        } else if (vVar instanceof dc4.l0) {
            M(((dc4.l0) vVar).m(), bundle);
        } else if (vVar instanceof dc4.v0) {
            this.f169803f = new wb4.h0((com.tencent.mm.ui.MMActivity) this.f169799b, vVar);
            this.f169804g = new wb4.c0((com.tencent.mm.ui.MMActivity) this.f169799b, vVar);
        } else if (vVar instanceof dc4.o0) {
            this.f169803f = new wb4.x((com.tencent.mm.ui.MMActivity) this.f169799b, vVar);
            this.f169804g = new wb4.u((com.tencent.mm.ui.MMActivity) this.f169799b, vVar);
        } else if (vVar instanceof dc4.p) {
            this.f169803f = new wb4.h((com.tencent.mm.ui.MMActivity) this.f169799b, vVar);
            this.f169804g = new wb4.d((com.tencent.mm.ui.MMActivity) this.f169799b, vVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public void L(dc4.v vVar, w64.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        K(vVar, null, xVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public void M(u74.d dVar, android.os.Bundle bundle) {
        boolean z17;
        boolean z18;
        boolean z19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (this.f169801d != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TimelineClickListener", "preapre FullCardAnim, timelineClickAnimation!=null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        boolean z27 = false;
        if (bundle != null) {
            z18 = bundle.getBoolean("ad_no_click_anim", false);
            z19 = bundle.getBoolean("ad_no_back_anim", false);
            boolean z28 = bundle.getBoolean("isSimpleTwistAnim", false);
            z17 = bundle.getBoolean("isTwistClockwise", false);
            z27 = z28;
        } else {
            z17 = false;
            z18 = false;
            z19 = false;
        }
        if (z27) {
            this.f169801d = new xb4.v0((com.tencent.mm.ui.MMActivity) this.f169799b, dVar, z17);
        } else if (!z18) {
            this.f169801d = new xb4.s0((com.tencent.mm.ui.MMActivity) this.f169799b, dVar);
        }
        if (!z19) {
            this.f169802e = new xb4.n0((com.tencent.mm.ui.MMActivity) this.f169799b, dVar);
        }
        dVar.T.f425132b = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public void N(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        O(baseViewHolder, null, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public void O(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, android.os.Bundle bundle, w64.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (this.f169801d != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TimelineClickListener", "has already prepare click animation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        if (U(xVar, false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        if (baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.k) {
            this.f169801d = new xb4.i0((com.tencent.mm.ui.MMActivity) this.f169799b, baseViewHolder);
            this.f169802e = new xb4.d0((com.tencent.mm.ui.MMActivity) this.f169799b, baseViewHolder);
            ((com.tencent.mm.plugin.sns.ui.item.k) baseViewHolder).W0 = true;
        } else if (baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.y) {
            M(((com.tencent.mm.plugin.sns.ui.item.y) baseViewHolder).D0, bundle);
        } else if (baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.p0) {
            this.f169801d = new xb4.n1((com.tencent.mm.ui.MMActivity) this.f169799b, baseViewHolder);
            this.f169802e = new xb4.i1((com.tencent.mm.ui.MMActivity) this.f169799b, baseViewHolder);
        } else if (baseViewHolder instanceof q74.d) {
            this.f169801d = new xb4.d1((com.tencent.mm.ui.MMActivity) this.f169799b, baseViewHolder);
            this.f169802e = new xb4.z0((com.tencent.mm.ui.MMActivity) this.f169799b, baseViewHolder);
        } else if (baseViewHolder instanceof s74.p0) {
            this.f169801d = new xb4.v((com.tencent.mm.ui.MMActivity) this.f169799b, baseViewHolder);
            this.f169802e = new xb4.q((com.tencent.mm.ui.MMActivity) this.f169799b, baseViewHolder);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public void P(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, w64.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        O(baseViewHolder, null, xVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public final void R(android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, w64.x xVar) {
        w64.n nVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "snsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        com.tencent.mm.plugin.sns.storage.o adSelectInfo = snsInfo.getAdXml().getAdSelectInfo();
        if (adSelectInfo == null || (nVar = this.f169806i) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "adSelectInfo or adClickActionHandler is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = i17 == 1001 ? adSelectInfo.adSelectCardClickInfoLeft : i17 == 1002 ? adSelectInfo.adSelectCardClickInfoRight : null;
        if (adClickActionInfo != null) {
            nVar.n(adClickActionInfo, snsInfo);
            this.f169806i.x(xVar);
            U(xVar, snsInfo.getAdXml().forbiddenCustomAnimation);
            this.f169806i.k(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public final void S(android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.String str, boolean z17, int i18, int[] iArr, int i19, int i27) {
        com.tencent.mm.plugin.sns.model.k4 k4Var = this.f169800c;
        android.app.Activity activity = this.f169799b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectCardBtnJumpCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        try {
            w64.x i28 = w64.x.i(view);
            if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) {
                P((com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag(), i28);
            } else if (view.getTag() instanceof dc4.v) {
                L((dc4.v) view.getTag(), i28);
            }
            java.lang.String a17 = za4.z0.a(snsInfo);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                snsInfo.getAdSnsInfo().field_adxml = a17;
            }
            int i29 = this.f169798a;
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i29, i29 == 0 ? 1 : 2, snsInfo.field_snsId, i17, z17 ? 22 : 21);
            ca4.m0.f(snsAdClick, this.f169805h, snsInfo, i17);
            ca4.z0.x0(snsAdClick);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("img_gallery_left", iArr[0]);
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", i19);
            intent.putExtra("img_gallery_height", i27);
            intent.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
            intent.putExtra("sns_landing_pages_rawSnsId", snsInfo.getTimeLine().Id);
            intent.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
            if (i18 == 2) {
                intent.putExtra("sns_landing_pages_aid", snsInfo.getAid());
                intent.putExtra("sns_landing_pages_traceid", snsInfo.getTraceid());
            } else if (i18 == 1) {
                intent.putExtra("sns_landing_is_native_sight_ad", true);
            }
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
            if (timeLine != null) {
                java.util.LinkedList linkedList = timeLine.ContentObj.f369840h;
                if (linkedList.size() > 0) {
                    intent.putExtra("sns_landing_pages_share_thumb_url", ((r45.jj4) linkedList.get(0)).f377860i);
                }
            }
            a54.g.b(activity, intent, str);
            int i37 = this.f169798a;
            intent.putExtra("sns_landig_pages_from_source", i37 == 2 ? 16 : i37 == 1 ? 2 : 1);
            intent.putExtra("sns_landing_pages_xml", str);
            intent.putExtra("sns_landing_pages_rec_src", snsInfo.getAdRecSrc());
            intent.putExtra("sns_landing_pages_xml_prefix", dm.n.COL_ADXML);
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
            intent.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
            w64.x.g(intent, i28, false);
            android.app.Activity activity2 = this.f169799b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "selectCardBtnJumpCanvas", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;ILjava/lang/String;ZI[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "selectCardBtnJumpCanvas", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;ILjava/lang/String;ZI[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (i28 == null || i28.l() == 0 || w64.x.h(i28)) {
                activity.overridePendingTransition(0, 0);
            }
            if (i18 == 2 && com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                k4Var.a().e(snsInfo);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectCardBtnJumpCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public void T(i64.b1 b1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAdStatic", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        this.f169805h = b1Var;
        com.tencent.mm.plugin.sns.ui.listener.c cVar = this.f169809l;
        if (cVar != null) {
            cVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAdStatic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            cVar.f169761o = b1Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAdStatic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initActionHandler", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        this.f169806i = new w64.n(this.f169799b, this.f169798a, this.f169805h, null, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initActionHandler", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAdStatic", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public boolean U(w64.x xVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("trySetJumpAnim", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (xVar != null) {
            if (xVar.l() == 1 || xVar.l() == 2 || z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("trySetJumpAnim", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                return true;
            }
            if (xVar.l() == 3) {
                if (this.f169798a == 0) {
                    this.f169801d = new xb4.l((com.tencent.mm.ui.MMActivity) this.f169799b, xVar);
                    this.f169802e = new xb4.f((com.tencent.mm.ui.MMActivity) this.f169799b, xVar);
                } else {
                    xb4.l lVar = new xb4.l((com.tencent.mm.ui.MMActivity) this.f169799b, xVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
                    xb4.k kVar = new xb4.k(lVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
                    this.f169803f = kVar;
                    xb4.f fVar = new xb4.f((com.tencent.mm.ui.MMActivity) this.f169799b, xVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toDetailBackAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
                    xb4.e eVar = new xb4.e(fVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toDetailBackAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
                    this.f169804g = eVar;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("trySetJumpAnim", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("trySetJumpAnim", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return false;
    }

    public void u(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendAdGetA8KeySceneExtra", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (this.f169798a == 0) {
            ca4.z0.a(intent, 81);
        } else {
            ca4.z0.a(intent, 82);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendAdGetA8KeySceneExtra", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public final boolean v(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSelectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "snsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSelectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.o adSelectInfo = snsInfo.getAdXml().getAdSelectInfo();
        if (adSelectInfo == null || this.f169806i == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "adSelectInfo or adClickActionHandler is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSelectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return false;
        }
        boolean z17 = (i17 == 1001 ? adSelectInfo.adSelectCardClickInfoLeft : i17 == 1002 ? adSelectInfo.adSelectCardClickInfoRight : null) != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSelectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return z17;
    }

    public final com.tencent.mm.plugin.sns.storage.ADInfo w(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "getAdInfo, snsInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return null;
        }
        if (this.f169798a == 2) {
            com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = snsInfo.getAtAdInfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return atAdInfo;
        }
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return adInfo;
    }

    public final void x(android.view.View view, android.view.View view2, w64.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (view == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "initCardAnimPrepareListener, but clicked view is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        com.tencent.mm.plugin.sns.ui.listener.g0 g0Var = new com.tencent.mm.plugin.sns.ui.listener.g0(this, view.getTag(), xVar, view2);
        w64.n nVar = this.f169806i;
        if (nVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            nVar.f443319l = g0Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    public abstract void z(android.view.View view);
}
