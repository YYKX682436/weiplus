package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class l1 {
    public static final java.util.List A = new java.util.LinkedList();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f169700a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ListView f169701b;

    /* renamed from: c, reason: collision with root package name */
    public i64.b1 f169702c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.l7 f169703d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f169704e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f169707h;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.bs f169709j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsCommentFooter f169710k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.FrameLayout f169711l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.zx f169712m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.kj f169713n;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f169716q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.vx f169717r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.j f169718s;

    /* renamed from: t, reason: collision with root package name */
    public ra4.b f169719t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.m7 f169720u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.ay f169721v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f169722w;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f169724y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f169725z;

    /* renamed from: f, reason: collision with root package name */
    public boolean f169705f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f169706g = true;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f169708i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_timeline_item_mask, true);

    /* renamed from: o, reason: collision with root package name */
    public boolean f169714o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f169715p = "";

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f169723x = null;

    public l1(android.content.Context context, int i17, java.lang.String str, int i18, java.lang.String str2) {
        this.f169707h = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CloseSnsCommentViewEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CloseSnsCommentViewEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.BaseTimeLine$2
            {
                this.__eventId = -879166970;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CloseSnsCommentViewEvent closeSnsCommentViewEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$2");
                com.tencent.mm.plugin.sns.ui.vx vxVar = com.tencent.mm.plugin.sns.ui.l1.this.f169717r;
                if (vxVar != null) {
                    vxVar.d();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$2");
                return false;
            }
        };
        this.f169724y = iListener;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdListScrollEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdListScrollEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.BaseTimeLine$3
            {
                this.__eventId = 574649668;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsAdListScrollEvent snsAdListScrollEvent) {
                android.widget.ListView listView;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$3");
                com.tencent.mm.autogen.events.SnsAdListScrollEvent snsAdListScrollEvent2 = snsAdListScrollEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$3");
                if ((snsAdListScrollEvent2 instanceof com.tencent.mm.autogen.events.SnsAdListScrollEvent) && (listView = com.tencent.mm.plugin.sns.ui.l1.this.f169701b) != null) {
                    listView.requestDisallowInterceptTouchEvent(!snsAdListScrollEvent2.f54793g.f6290a);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$3");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$3");
                return false;
            }
        };
        this.f169725z = iListener2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNew", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_USE_NEW_GALLERY_FOOTER_INT_SYNC, 0);
        if (r17 == 0) {
            r17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_enhance_like_gallery, 2);
        }
        if (r17 == 1) {
            this.f169707h = false;
        } else {
            this.f169707h = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNew", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        this.f169700a = context;
        this.f169716q = c01.z1.r();
        com.tencent.mm.plugin.sns.model.l7 l7Var = new com.tencent.mm.plugin.sns.model.l7(1);
        this.f169703d = l7Var;
        com.tencent.mm.plugin.sns.statistics.l lVar = new com.tencent.mm.plugin.sns.statistics.l();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.TimelineContext");
        l7Var.f164433a = lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildBrowseInfoHelper", "com.tencent.mm.plugin.sns.model.TimelineContext");
        com.tencent.mm.plugin.sns.ui.c1 c1Var = new com.tencent.mm.plugin.sns.ui.c1(this, 0, (android.app.Activity) context, l7Var);
        this.f169722w = c1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        c1Var.f169809l.b();
        c1Var.V.alive();
        c1Var.W.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iListener.alive();
        iListener2.alive();
    }

    public static /* synthetic */ android.content.Context a(com.tencent.mm.plugin.sns.ui.l1 l1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        android.content.Context context = l1Var.f169700a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return context;
    }

    public final void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (snsInfo == null || snsInfo.getTimeLine() == null || snsInfo.getTimeLine().ContentObj == null) {
            this.f169710k.setFeedEmojiCommentEnable(false);
        } else if ((snsInfo.getTimeLine().ContentObj.f369841i & 128) != 0) {
            this.f169710k.setFeedEmojiCommentEnable(false);
        } else {
            this.f169710k.setFeedEmojiCommentEnable(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clean", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169722w;
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.f169809l.r();
        iVar.V.dead();
        iVar.W.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f169710k;
        if (snsCommentFooter != null) {
            snsCommentFooter.A();
        }
        this.f169724y.dead();
        this.f169725z.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clean", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    public final int d(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        java.util.Iterator it = A.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.sns.ui.t1 t1Var = (com.tencent.mm.plugin.sns.ui.t1) it.next();
            if (com.tencent.mm.sdk.platformtools.t8.D0(t1Var.f170493a, str)) {
                i17 = t1Var.f170495c;
                break;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return i17;
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (this.f169714o) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return;
        }
        this.f169714o = true;
        com.tencent.mm.plugin.sns.ui.zx zxVar = this.f169712m;
        if (zxVar != null) {
            this.f169710k.setAfterEditAction(zxVar.f171729j);
        }
        this.f169710k.setOnCommentSendImp(new com.tencent.mm.plugin.sns.ui.d1(this));
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f169710k;
        com.tencent.mm.plugin.sns.ui.e1 e1Var = new com.tencent.mm.plugin.sns.ui.e1(this);
        snsCommentFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackKeyListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        fl5.i iVar = snsCommentFooter.f167092i;
        if (iVar != null) {
            iVar.setBackListener(e1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackKeyListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackKeyListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    public final boolean f(r45.mo5 mo5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (mo5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseTimeLine", "isRemindInfoValid called with: remindInfo = [null]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return false;
        }
        if (mo5Var.f380713d == 0 && mo5Var.f380718i == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseTimeLine", "isRemindInfoValid called with: remindInfo.ADGroupId = [" + mo5Var.f380713d + "] remindInfo.ADGroupId64 = [" + mo5Var.f380718i + "]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return false;
        }
        r45.cu5 cu5Var = mo5Var.f380716g;
        if (cu5Var == null || !cu5Var.f371842g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseTimeLine", "isRemindInfoValid called with: paidInfo is blank!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return false;
        }
        r45.cu5 cu5Var2 = mo5Var.f380717h;
        if (cu5Var2 != null && cu5Var2.f371842g) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseTimeLine", "isRemindInfoValid called with: extraInfo is blank!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return false;
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchIdleArea", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (!this.f169714o) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchIdleArea", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            return;
        }
        if (this.f169710k.getVisibility() != 8) {
            this.f169710k.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169709j;
        bsVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideContainer", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        android.view.View view = bsVar.f168041g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter", "hideContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter", "hideContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bsVar.f168041g = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideContainer", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchIdleArea", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    public void h(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.e86 e86Var) {
        mb4.c cVar;
        mb4.r rVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performAdAtFriendClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        this.f169715p = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLine", "[performAdAtFriendClick] onCommentClick:  commentkey " + this.f169715p + " " + baseViewHolder.f169264d + " position:" + baseViewHolder.f169262c);
        b(snsInfo);
        this.f169710k.setTag(snsInfo);
        e();
        this.f169710k.setVisibility(0);
        this.f169710k.H(0);
        this.f169710k.setCommentHint("");
        if (snsInfo != null && snsInfo.isFireworkCheerAd() && (cVar = snsInfo.getAdXml().adSocialInfo) != null && (rVar = cVar.f325388m) != null && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.b())) {
            this.f169710k.setCommentHint(cVar.f325388m.b());
        }
        this.f169710k.setCommentInfo(e86Var);
        this.f169710k.setSnsInfo(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (p34.v.f351702d == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            r4 = true;
        } else if (snsInfo == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseTimeLine", "isAtBtnVisible called with: snsInfo = [null]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        } else {
            com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = snsInfo.getAdSnsInfo();
            if (adSnsInfo == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BaseTimeLine", "isAtBtnVisible called with: adSnsInfo = [null]");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            } else {
                r45.o3 remindInfoGroup = adSnsInfo.getRemindInfoGroup();
                if (remindInfoGroup == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BaseTimeLine", "isAtBtnVisible called with: remindInfoGroup = [null]");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                } else {
                    r4 = f(remindInfoGroup.f381861d) || f(remindInfoGroup.f381862e);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtBtnVisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                }
            }
        }
        this.f169710k.O(r4);
        this.f169710k.N(A, "");
        this.f169710k.post(new com.tencent.mm.plugin.sns.ui.f1(this));
        j(baseViewHolder);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performAdAtFriendClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    public void i(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.e86 e86Var) {
        mb4.c cVar;
        mb4.r rVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performCommentIconClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        java.lang.String str = baseViewHolder.f169264d;
        this.f169715p = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLine", "[performCommentIconClick] onCommentClick:  commentkey " + this.f169715p + " " + baseViewHolder.f169264d + " position:" + baseViewHolder.f169262c);
        b(snsInfo);
        this.f169710k.setTag(snsInfo);
        e();
        this.f169710k.setVisibility(0);
        this.f169710k.H(d(str, 0));
        this.f169710k.setCommentInfo(e86Var);
        this.f169710k.setSnsInfo(snsInfo);
        snsInfo.getTimeLine();
        java.lang.String string = this.f169700a.getString(com.tencent.mm.R.string.jgp);
        if (snsInfo.isFireworkCheerAd() && (cVar = snsInfo.getAdXml().adSocialInfo) != null && (rVar = cVar.f325388m) != null && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.b())) {
            string = cVar.f325388m.b();
        }
        this.f169710k.setCommentHint(string);
        this.f169710k.N(A, str);
        this.f169710k.post(new com.tencent.mm.plugin.sns.ui.g1(this));
        this.f169710k.O(false);
        j(baseViewHolder);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performCommentIconClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    public final void j(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollComment", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        android.content.Context context = this.f169700a;
        int b17 = i65.a.b(context, 8);
        if (baseViewHolder.M != null) {
            i17 = (baseViewHolder.Q.getHeight() - baseViewHolder.M.getBottom()) + b17;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLine", "comment item bottom = " + baseViewHolder.M.getBottom());
        } else {
            i17 = 0;
        }
        com.tencent.mm.plugin.sns.ui.zx zxVar = this.f169712m;
        if (zxVar != null) {
            zxVar.f171720a = baseViewHolder.f169262c;
            zxVar.f171721b = baseViewHolder.f169272h.getHeight() - i17;
            baseViewHolder.M = null;
            this.f169712m.f171722c = baseViewHolder.f169272h.getTop();
            this.f169712m.f171723d = this.f169701b.getBottom();
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseTimeLine", "originalTop:" + this.f169712m.f171722c);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToKeyBoard", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            com.tencent.mm.plugin.sns.ui.zx zxVar2 = this.f169712m;
            if (zxVar2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToKeyBoard", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            } else {
                if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
                    zxVar2.d();
                } else if (((com.tencent.mm.ui.MMActivity) context).keyboardState() == 1) {
                    this.f169712m.d();
                } else {
                    this.f169704e = true;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToKeyBoard", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            }
        } else {
            com.tencent.mm.autogen.events.SnsInputScrollEvent snsInputScrollEvent = new com.tencent.mm.autogen.events.SnsInputScrollEvent();
            android.view.View view = baseViewHolder.M;
            am.aw awVar = snsInputScrollEvent.f54818g;
            if (view != null) {
                awVar.f6191a = view;
                this.f169710k.setOutsideScrollView(null);
            } else {
                awVar.f6191a = baseViewHolder.f169272h;
                this.f169710k.setOutsideScrollView(null);
            }
            awVar.f6192b = this.f169710k;
            snsInputScrollEvent.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollComment", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    public int k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("timelineScene", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("timelineScene", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        return 0;
    }
}
