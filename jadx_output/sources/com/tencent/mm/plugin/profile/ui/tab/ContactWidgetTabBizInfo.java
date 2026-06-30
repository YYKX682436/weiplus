package com.tencent.mm.plugin.profile.ui.tab;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0011\u0012B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo;", "Lt25/b;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/profile/ui/ContactInfoUI;", "context", "", "brandIconUrl", "Lr45/va0;", "customizedInfo", "", "enterTime", "", "bizFromScene", "Lsr3/g;", "config", "<init>", "(Lcom/tencent/mm/plugin/profile/ui/ContactInfoUI;Ljava/lang/String;Lr45/va0;JILsr3/g;)V", "com/tencent/mm/plugin/profile/ui/tab/t4", "com/tencent/mm/plugin/profile/ui/tab/u4", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ContactWidgetTabBizInfo implements t25.b, androidx.lifecycle.x {
    public androidx.viewpager.widget.ViewPager A;
    public com.tencent.mm.plugin.profile.ui.tab.t4 B;
    public com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout C;
    public boolean D;
    public java.lang.String E;
    public boolean F;
    public final kotlinx.coroutines.y0 G;
    public kotlinx.coroutines.r2 H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f154197J;
    public boolean K;
    public boolean L;
    public boolean M;
    public java.lang.String N;
    public java.lang.String P;
    public final jz5.g Q;
    public final jz5.g R;
    public final jz5.g S;
    public final jz5.g T;
    public final jz5.g U;
    public final jz5.g V;
    public final jz5.g W;
    public com.tencent.mm.plugin.profile.o X;
    public final com.tencent.mm.plugin.profile.ui.tab.y4 Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.profile.ui.ContactInfoUI f154198d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154199e;

    /* renamed from: f, reason: collision with root package name */
    public r45.va0 f154200f;

    /* renamed from: g, reason: collision with root package name */
    public long f154201g;

    /* renamed from: h, reason: collision with root package name */
    public int f154202h;

    /* renamed from: i, reason: collision with root package name */
    public final sr3.g f154203i;

    /* renamed from: l1, reason: collision with root package name */
    public androidx.fragment.app.Fragment f154204l1;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f154205m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f154206n;

    /* renamed from: o, reason: collision with root package name */
    public qk.o f154207o;

    /* renamed from: p, reason: collision with root package name */
    public int f154208p;

    /* renamed from: p0, reason: collision with root package name */
    public final java.lang.String f154209p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer f154210p1;

    /* renamed from: q, reason: collision with root package name */
    public r45.wl f154211q;

    /* renamed from: r, reason: collision with root package name */
    public qk.n f154212r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f154213s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f154214t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f154215u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f154216v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f154217w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f154218x;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f154219x0;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.m0 f154220y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f154221y0;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f154222z;

    public ContactWidgetTabBizInfo(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, java.lang.String str, r45.va0 va0Var, long j17, int i17, sr3.g config) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        this.f154198d = context;
        this.f154199e = str;
        this.f154200f = va0Var;
        this.f154201g = j17;
        this.f154202h = i17;
        this.f154203i = config;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f154205m = arrayList;
        this.f154215u = true;
        this.f154217w = "crashFlag";
        this.f154222z = new java.util.ArrayList();
        this.D = true;
        this.E = "";
        this.G = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.I = "ContactWidgetTabBizInfo_PhotoLogin";
        this.N = "";
        this.P = "";
        this.Q = jz5.h.b(new com.tencent.mm.plugin.profile.ui.tab.i6(this));
        this.R = jz5.h.b(new com.tencent.mm.plugin.profile.ui.tab.j6(this));
        this.S = jz5.h.b(new com.tencent.mm.plugin.profile.ui.tab.v5(this));
        this.T = jz5.h.b(new com.tencent.mm.plugin.profile.ui.tab.w4(this));
        this.U = jz5.h.b(new com.tencent.mm.plugin.profile.ui.tab.x4(this));
        this.V = jz5.h.b(new com.tencent.mm.plugin.profile.ui.tab.g5(this));
        this.W = jz5.h.b(new com.tencent.mm.plugin.profile.ui.tab.w5(this));
        this.Y = new com.tencent.mm.plugin.profile.ui.tab.y4(this);
        this.f154209p0 = "BizProfile_" + java.lang.System.identityHashCode(this);
        arrayList.add(new com.tencent.mm.plugin.profile.ui.tab.observer.BizProfileExtraOperateObserver());
        arrayList.add(new com.tencent.mm.plugin.profile.ui.tab.observer.BizProfileWidgetOperateObserver(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // t25.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(com.tencent.mm.ui.base.preference.r r30, com.tencent.mm.storage.z3 r31, boolean r32, int r33) {
        /*
            Method dump skipped, instructions count: 2035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo.Q(com.tencent.mm.ui.base.preference.r, com.tencent.mm.storage.z3, boolean, int):boolean");
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        return true;
    }

    public final int a(r45.wl wlVar, int i17) {
        java.util.LinkedList linkedList;
        if (wlVar == null) {
            return -1;
        }
        java.util.List list = this.f154222z;
        int i18 = 0;
        if (i17 == 1) {
            boolean z17 = wlVar.f389246t == 1;
            r45.gl glVar = wlVar.f389237h;
            boolean z18 = (glVar != null && (linkedList = glVar.f375323d) != null && (linkedList.isEmpty() ^ true)) && wlVar.f389246t == 0;
            if (!z17 && !z18) {
                return -1;
            }
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            int i19 = 0;
            while (it.hasNext()) {
                androidx.lifecycle.m1 m1Var = (androidx.fragment.app.Fragment) it.next();
                if ((m1Var instanceof zy2.h5) && ((zy2.h5) m1Var).O()) {
                    return i19;
                }
                i19++;
            }
            return -1;
        }
        if (i17 == 2) {
            r45.tj6 tj6Var = wlVar.C;
            if (!(tj6Var != null && tj6Var.f386508d)) {
                return -1;
            }
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                if (!(((androidx.fragment.app.Fragment) it6.next()) instanceof com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabArticleFragment)) {
                    i18++;
                }
            }
            return -1;
        }
        if (i17 == 3) {
            r45.tj6 tj6Var2 = wlVar.D;
            if (!(tj6Var2 != null && tj6Var2.f386508d)) {
                return -1;
            }
            java.util.Iterator it7 = ((java.util.ArrayList) list).iterator();
            while (it7.hasNext()) {
                if (!(((androidx.fragment.app.Fragment) it7.next()) instanceof com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment)) {
                    i18++;
                }
            }
            return -1;
        }
        if (i17 == 4) {
            r45.tj6 tj6Var3 = wlVar.E;
            if (!(tj6Var3 != null && tj6Var3.f386508d)) {
                return -1;
            }
            java.util.Iterator it8 = ((java.util.ArrayList) list).iterator();
            while (it8.hasNext()) {
                if (!(((androidx.fragment.app.Fragment) it8.next()) instanceof com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioFragment)) {
                    i18++;
                }
            }
            return -1;
        }
        return i18;
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) this.T).getValue()).intValue();
    }

    public final com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher c() {
        return (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher) ((jz5.n) this.S).getValue();
    }

    public final java.lang.String d() {
        return (java.lang.String) ((jz5.n) this.Q).getValue();
    }

    public final void e() {
        r45.td5 td5Var;
        com.tencent.mm.plugin.profile.o oVar = this.X;
        if (oVar == null) {
            this.X = new com.tencent.mm.plugin.profile.o(this.f154198d, this.f154206n, this.f154211q, this.f154203i, this.f154220y, this.f154207o, this.f154209p0);
        } else {
            if (oVar != null) {
                com.tencent.mm.plugin.profile.ui.ContactInfoUI context = this.f154198d;
                kotlin.jvm.internal.o.g(context, "context");
                oVar.f153541a = context;
            }
            com.tencent.mm.plugin.profile.o oVar2 = this.X;
            if (oVar2 != null) {
                oVar2.f153542b = this.f154206n;
            }
            if (oVar2 != null) {
                oVar2.f153543c = this.f154211q;
            }
            if (oVar2 != null) {
                sr3.g config = this.f154203i;
                kotlin.jvm.internal.o.g(config, "config");
                oVar2.f153544d = config;
            }
            com.tencent.mm.plugin.profile.o oVar3 = this.X;
            if (oVar3 != null) {
                oVar3.f153545e = this.f154220y;
            }
            if (oVar3 != null) {
                oVar3.f153546f = this.f154207o;
            }
        }
        com.tencent.mm.plugin.profile.o oVar4 = this.X;
        if (oVar4 != null) {
            oVar4.f153555o = this.D;
        }
        if (oVar4 != null) {
            oVar4.f153549i = com.tencent.mm.plugin.profile.ui.tab.b.d(this.f154211q);
        }
        com.tencent.mm.plugin.profile.o oVar5 = this.X;
        if (oVar5 != null) {
            r45.wl wlVar = this.f154211q;
            oVar5.f153554n = (wlVar == null || (td5Var = wlVar.f389249w) == null) ? 0 : td5Var.f386327d;
        }
        if (oVar5 != null) {
            oVar5.f153556p = this.f154214t;
        }
        if (oVar5 != null) {
            android.view.View view = this.f154219x0;
            if (view == null) {
                kotlin.jvm.internal.o.o("contentView");
                throw null;
            }
            oVar5.f153550j = view;
            oVar5.f153552l = true;
        }
        if (this.A == null || !(!this.f154222z.isEmpty())) {
            return;
        }
        androidx.viewpager.widget.ViewPager viewPager = this.A;
        if (viewPager != null) {
            i(viewPager.getCurrentItem());
        } else {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
    }

    public final boolean f() {
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f154198d;
        return contactInfoUI.isFragmentMode() || (contactInfoUI instanceof com.tencent.mm.plugin.profile.ui.DialogContactInfoUI);
    }

    public final void g() {
        qk.n nVar;
        com.tencent.mm.storage.z3 z3Var = this.f154206n;
        if (z3Var == null) {
            return;
        }
        qk.o b17 = r01.z.b(z3Var != null ? z3Var.d1() : null);
        this.f154212r = null;
        if ((b17 == null || b17.D0(false) == null) && this.f154200f != null) {
            b17 = new qk.o();
            com.tencent.mm.storage.z3 z3Var2 = this.f154206n;
            b17.field_username = z3Var2 != null ? z3Var2.d1() : null;
            r45.va0 va0Var = this.f154200f;
            b17.field_brandFlag = va0Var != null ? va0Var.f388021d : 0;
            b17.field_brandIconURL = va0Var != null ? va0Var.f388024g : null;
            b17.field_brandInfo = va0Var != null ? va0Var.f388023f : null;
            b17.field_extInfo = va0Var != null ? va0Var.f388022e : null;
            b17.field_type = b17.D0(false).j();
        }
        if (b17 == null) {
            return;
        }
        if (b17.field_brandInfo == null && b17.field_extInfo == null && this.f154200f != null) {
            com.tencent.mm.storage.z3 z3Var3 = this.f154206n;
            b17.field_username = z3Var3 != null ? z3Var3.d1() : null;
            r45.va0 va0Var2 = this.f154200f;
            b17.field_brandFlag = va0Var2 != null ? va0Var2.f388021d : 0;
            b17.field_brandIconURL = va0Var2 != null ? va0Var2.f388024g : null;
            b17.field_brandInfo = va0Var2 != null ? va0Var2.f388023f : null;
            b17.field_extInfo = va0Var2 != null ? va0Var2.f388022e : null;
            b17.field_type = b17.D0(false).j();
        }
        this.f154207o = b17;
        b17.v0();
        qk.n D0 = b17.D0(false);
        this.f154212r = D0;
        if ((D0 != null ? D0.l() : null) != null) {
            qk.n nVar2 = this.f154212r;
            java.lang.String l17 = nVar2 != null ? nVar2.l() : null;
            if (!(l17 == null || l17.length() == 0) || (nVar = this.f154212r) == null) {
                return;
            }
            nVar.l();
        }
    }

    public final void h() {
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154220y;
        if (m0Var == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = m0Var.f154464s;
        if (s4Var != null && s4Var.f154568l0) {
            return;
        }
        com.tencent.mm.storage.z3 z3Var = this.f154206n;
        if (z3Var == null || !((z3Var.n2() || z3Var.l2()) && z3Var.r2() && ((int) z3Var.E2) > 0)) {
            m0Var.h();
            return;
        }
        if (!this.F) {
            m0Var.h();
            return;
        }
        com.tencent.wechat.iam.biz.g gVar = com.tencent.wechat.iam.biz.g.f217742b;
        com.tencent.wechat.iam.biz.v1 v1Var = com.tencent.wechat.iam.biz.v1.INTERACTIVE_GUIDE_SCENE_AFTER_FOLLOW;
        kotlinx.coroutines.r2 r2Var = this.H;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.H = kotlinx.coroutines.l.d(this.G, null, null, new com.tencent.mm.plugin.profile.ui.tab.h6(gVar, v1Var, m0Var, this, null), 3, null);
    }

    public final void i(int i17) {
        as3.m0 m0Var;
        androidx.lifecycle.m1 m1Var;
        androidx.lifecycle.m1 m1Var2 = (androidx.fragment.app.Fragment) kz5.n0.a0(this.f154222z, i17);
        if (m1Var2 == null) {
            return;
        }
        if (m1Var2 instanceof com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment) {
            m0Var = as3.m0.f13530d;
        } else if (m1Var2 instanceof com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment) {
            m0Var = as3.m0.f13534h;
        } else if (m1Var2 instanceof com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabArticleFragment) {
            m0Var = as3.m0.f13535i;
        } else if (m1Var2 instanceof com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioFragment) {
            m0Var = as3.m0.f13532f;
        } else if (m1Var2 instanceof zy2.hb) {
            m0Var = as3.m0.f13531e;
        } else if (!(m1Var2 instanceof zy2.h5) || !((zy2.h5) m1Var2).O()) {
            return;
        } else {
            m0Var = as3.m0.f13531e;
        }
        boolean z17 = m0Var == as3.m0.f13531e && (m1Var = this.f154204l1) != null && m1Var2 == m1Var;
        com.tencent.mm.plugin.profile.o oVar = this.X;
        if (oVar != null) {
            oVar.h(m0Var, z17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(boolean r19) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo.j(boolean):void");
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        androidx.fragment.app.Fragment fragment;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "onActivityResult, requestCode = %d, resultCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1) {
            if (i17 == 10010 && (fragment = this.f154204l1) != null) {
                fragment.onActivityResult(i17, i18, intent);
                return;
            }
            return;
        }
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
        java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
        boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
        java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
        if (r01.z.m(stringExtra)) {
            tg3.a1 a17 = tg3.t1.a();
            r45.wl wlVar = this.f154211q;
            ((dk5.s5) a17).b(stringExtra, stringExtra2, booleanExtra, wlVar != null ? wlVar.f389250x : null);
        } else {
            tg3.a1 a18 = tg3.t1.a();
            r45.wl wlVar2 = this.f154211q;
            ((dk5.s5) a18).Di(stringExtra, stringExtra2, booleanExtra, wlVar2 != null ? wlVar2.f389250x : null);
        }
        ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, stringExtra2);
        if (com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "EnterChattingAfterTrans done config disabled");
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f154198d;
        com.tencent.mm.ui.widget.snackbar.j.c(contactInfoUI.getString(com.tencent.mm.R.string.f_p), null, contactInfoUI, null, null);
    }

    @Override // t25.b
    public boolean onBackPress() {
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f154198d;
        if (!contactInfoUI.getIntent().getBooleanExtra("key_is_from_slide", false) || contactInfoUI.getParentActivity() == null) {
            return false;
        }
        android.app.Activity parentActivity = contactInfoUI.getParentActivity();
        if (parentActivity == null) {
            return true;
        }
        parentActivity.onBackPressed();
        return true;
    }

    @Override // t25.b
    public boolean onCreate() {
        ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Ri(this.f154203i);
        if (this.f154203i.a()) {
            gr3.b.c(gr3.b.f274847a, 0L, 0L, 601L, 0L, 0L, null, this.f154208p, this.Z, 0, 304, null);
            if (this.N.length() == 0) {
                this.N = com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo.class.getName() + hashCode();
            }
            if (this.P.length() == 0) {
                this.P = com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo.class.getName() + hashCode() + "profile_update_msg";
            }
            if (!this.M) {
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.profile.ui.tab.l5(this));
                this.M = true;
            }
        } else {
            com.tencent.mm.storage.z3 z3Var = this.f154206n;
            if (z3Var == null || this.f154207o == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetTabBizInfo", "reportStart fail, err");
            } else {
                java.lang.String d17 = z3Var.d1();
                int i17 = this.f154208p;
                qk.o oVar = this.f154207o;
                kotlin.jvm.internal.o.d(oVar);
                int i18 = oVar.field_type;
                long j17 = this.f154201g;
                com.tencent.mm.storage.z3 z3Var2 = this.f154206n;
                kotlin.jvm.internal.o.d(z3Var2);
                boolean r27 = z3Var2.r2();
                java.lang.String str = this.E;
                tr3.c.c(d17, i17, i18 == 0 ? 1 : i18 == 1 ? 2 : 0, 1, j17, 0L, r27 ? 1 : 0, 0, 0, 0, "", "", "", str != null ? str : "", (java.lang.String) ((jz5.n) this.R).getValue(), d(), this.f154198d.getIntent(), f() ? 1 : 0);
            }
            if (this.f154198d.getIntent().getBooleanExtra("key_is_from_slide", false)) {
                android.view.ViewParent parent = this.f154198d.findViewById(com.tencent.mm.R.id.f482438el).getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                java.lang.Object layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
                android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.topMargin = com.tencent.mm.ui.bl.h(this.f154198d);
                }
                if (viewGroup != null) {
                    viewGroup.setLayoutParams(layoutParams2);
                }
            }
        }
        final com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154220y;
        if (m0Var != null) {
            if (m0Var.W == null) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.pluginsdk.model.b0.f189207k).getValue()).booleanValue()) {
                    com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent>(m0Var) { // from class: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$BizFinderLineStatusChangedEventListenerImpl

                        /* renamed from: d, reason: collision with root package name */
                        public final java.lang.ref.WeakReference f154196d;

                        {
                            super(com.tencent.mm.app.a0.f53288d);
                            this.f154196d = new java.lang.ref.WeakReference(m0Var);
                            this.__eventId = -1230141771;
                        }

                        @Override // com.tencent.mm.sdk.event.IListener
                        public boolean callback(com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent) {
                            java.lang.ref.WeakReference weakReference = this.f154196d;
                            if (weakReference == null || weakReference.get() == null) {
                                return false;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizHeaderController", "callback");
                            com.tencent.mm.plugin.profile.ui.tab.m0.a((com.tencent.mm.plugin.profile.ui.tab.m0) weakReference.get());
                            return false;
                        }
                    };
                    m0Var.W = iListener;
                    iListener.alive();
                }
            }
            tr3.a aVar = tr3.a.f421426a;
            tr3.a.f421427b = java.lang.System.currentTimeMillis();
            ((java.util.HashMap) tr3.a.f421428c).clear();
            tr3.a.f421429d.clear();
            m0Var.f154456h.setRequestedOrientation(1);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.concurrent.ConcurrentHashMap] */
    @Override // t25.b
    public boolean onDestroy() {
        r45.wl wlVar;
        r45.an anVar;
        r45.an anVar2;
        com.tencent.mm.sdk.event.IListener iListener;
        com.tencent.mm.storage.z3 z3Var = this.f154206n;
        if (z3Var != null) {
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String d17 = z3Var.d1();
            yq1.z zVar = (yq1.z) a0Var;
            zVar.getClass();
            zVar.k().B(("Biz_" + gm0.j1.b().j() + "_EnterProfileTime") + '_' + d17, currentTimeMillis);
            tr3.a aVar = tr3.a.f421426a;
            java.lang.String d18 = z3Var.d1();
            kotlin.jvm.internal.o.f(d18, "getUsername(...)");
            int i17 = this.f154208p;
            int i18 = this.Z;
            java.util.HashMap hashMap = (java.util.HashMap) tr3.a.f421428c;
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                gr3.e.d(d18, ((java.lang.Number) entry.getKey()).intValue(), tr3.a.f421427b, null, i18, i17, 0, ((tr3.b) entry.getValue()).f421432c, null, null, 0, 0, 3840, null);
                i18 = i18;
            }
            int i19 = i18;
            java.util.ArrayList arrayList = tr3.a.f421429d;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                tr3.b bVar = (tr3.b) it.next();
                gr3.e.d(d18, bVar.f421430a, tr3.a.f421427b, null, i19, i17, 0, bVar.f421432c, null, null, 0, 0, 3840, null);
            }
            hashMap.clear();
            arrayList.clear();
        }
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154220y;
        if (m0Var != null && (iListener = m0Var.W) != null) {
            iListener.dead();
            m0Var.W = null;
        }
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) ((kotlinx.coroutines.internal.h) this.G).f310496d.get(kotlinx.coroutines.q2.f310571d);
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        if (this.f154197J) {
            try {
                ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Bi(2).k(this.I);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactWidgetTabBizInfo", e17, "[PhotoAccountGuide] unsubscribe login event failed", new java.lang.Object[0]);
            }
            this.f154197J = false;
        }
        this.X = null;
        gr3.c.f274849b.clear();
        gr3.c.f274850c.clear();
        gr3.c.f274851d.clear();
        gr3.c.f274852e.set(0L);
        gr3.c.f274853f.set(0L);
        com.tencent.mm.plugin.profile.ui.tab.s sVar = (com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class);
        sVar.f154538g.set(null);
        com.tencent.mars.xlog.Log.i(sVar.f154535d, "clearCurrentConfig");
        if (this.f154203i.a()) {
            gr3.b.c(gr3.b.f274847a, 0L, 0L, 602L, 0L, 0L, null, this.f154208p, this.Z, 0, 304, null);
            if ((this.N.length() == 0) != false) {
                this.N = com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo.class.getName() + hashCode();
            }
            if ((this.P.length() == 0) != false) {
                this.P = com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo.class.getName() + hashCode() + "profile_update_msg";
            }
            if (this.M) {
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.profile.ui.tab.m5(this));
                this.M = false;
            }
        } else {
            if (this.f154206n != null && this.f154207o != null && (wlVar = this.f154211q) != null && wlVar.f389234e != null) {
                kotlin.jvm.internal.o.d(wlVar);
                if (wlVar.f389233d != null) {
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    com.tencent.mm.storage.z3 z3Var2 = this.f154206n;
                    kotlin.jvm.internal.o.d(z3Var2);
                    java.lang.String d19 = z3Var2.d1();
                    int i27 = this.f154208p;
                    qk.o oVar = this.f154207o;
                    kotlin.jvm.internal.o.d(oVar);
                    int i28 = oVar.field_type;
                    long j17 = this.f154201g;
                    com.tencent.mm.storage.z3 z3Var3 = this.f154206n;
                    kotlin.jvm.internal.o.d(z3Var3);
                    boolean r27 = z3Var3.r2();
                    r45.wl wlVar2 = this.f154211q;
                    kotlin.jvm.internal.o.d(wlVar2);
                    int i29 = wlVar2.f389234e.f379507d;
                    r45.wl wlVar3 = this.f154211q;
                    kotlin.jvm.internal.o.d(wlVar3);
                    r45.lj ljVar = wlVar3.f389234e;
                    int i37 = ljVar != null ? ljVar.f379508e : 0;
                    r45.wl wlVar4 = this.f154211q;
                    kotlin.jvm.internal.o.d(wlVar4);
                    java.lang.String b17 = tr3.c.b(wlVar4.f389235f);
                    r45.wl wlVar5 = this.f154211q;
                    kotlin.jvm.internal.o.d(wlVar5);
                    java.lang.String a17 = tr3.c.a(wlVar5.f389238i);
                    r45.wl wlVar6 = this.f154211q;
                    kotlin.jvm.internal.o.d(wlVar6);
                    r45.pi piVar = wlVar6.f389233d;
                    tr3.c.c(d19, i27, i28 == 0 ? 1 : i28 == 1 ? 2 : 0, 2, j17, currentTimeMillis2, r27 ? 1 : 0, i29, i37, 0, b17, a17, piVar != null ? piVar.f383065d : null, "", (java.lang.String) ((jz5.n) this.R).getValue(), d(), this.f154198d.getIntent(), f() ? 1 : 0);
                    gr3.f fVar = gr3.f.f274857a;
                    java.lang.String pageId = this.f154209p0;
                    r45.wl wlVar7 = this.f154211q;
                    kotlin.jvm.internal.o.d(wlVar7);
                    java.lang.String b18 = tr3.c.b(wlVar7.f389235f);
                    kotlin.jvm.internal.o.f(b18, "getShowArticleList(...)");
                    kotlin.jvm.internal.o.g(pageId, "pageId");
                    ?? r86 = gr3.f.f274858b;
                    a51.a aVar2 = (a51.a) r86.get(pageId);
                    if (aVar2 != null) {
                        com.tencent.wechat.aff.otel.b bVar2 = new com.tencent.wechat.aff.otel.b();
                        bVar2.f217413d = "read.article.number";
                        boolean[] zArr = bVar2.f217418i;
                        zArr[1] = true;
                        bVar2.f217414e = b18;
                        zArr[2] = true;
                        com.tencent.wechat.aff.otel.a aVar3 = aVar2.f1566c;
                        aVar3.f217408i.add(bVar2);
                        aVar3.f217412p[6] = true;
                    }
                    java.lang.String pageId2 = this.f154209p0;
                    kotlin.jvm.internal.o.g(pageId2, "pageId");
                    a51.a aVar4 = (a51.a) r86.remove(pageId2);
                    if (aVar4 != null) {
                        aVar4.b();
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileTracerMgr", "end pageId=" + pageId2 + ", remaining=" + r86.size());
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileTracerMgr", "end: span not found for pageId=".concat(pageId2));
                    }
                    if (r86.isEmpty()) {
                        gr3.f.f274859c = "";
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileTracerMgr", "end: all spans cleared, parentSpanId reset");
                    }
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetTabBizInfo", "reportEnd fail, err");
        }
        r45.wl wlVar8 = this.f154211q;
        java.lang.String b19 = x51.j1.b((wlVar8 == null || (anVar2 = wlVar8.f389245s) == null) ? null : anVar2.f370126d);
        r45.wl wlVar9 = this.f154211q;
        java.lang.String b27 = x51.j1.b((wlVar9 == null || (anVar = wlVar9.f389245s) == null) ? null : anVar.f370127e);
        if ((b19 == null || b19.length() == 0) == false) {
            if ((b27 == null || b27.length() == 0) == false) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = java.lang.Long.valueOf(this.f154201g);
                com.tencent.mm.storage.z3 z3Var4 = this.f154206n;
                java.lang.String d110 = z3Var4 != null ? z3Var4.d1() : null;
                objArr[1] = d110 != null ? d110 : "";
                objArr[2] = 1;
                objArr[3] = b19;
                objArr[4] = b27;
                g0Var.d(22118, objArr);
            }
        }
        return true;
    }

    @Override // t25.a
    public boolean onDetach() {
        return true;
    }

    @Override // t25.b
    public void onPause() {
        androidx.lifecycle.m1 m1Var;
        zq1.v vVar;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154220y;
        if (m0Var != null && (vVar = m0Var.V) != null) {
            ((com.tencent.mm.pluginsdk.model.h) vVar).b();
        }
        if (!this.f154198d.isFinishing() || (m1Var = this.f154204l1) == null) {
            return;
        }
        zy2.hb hbVar = m1Var instanceof zy2.hb ? (zy2.hb) m1Var : null;
        if (hbVar != null) {
            ((com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment) hbVar).P0();
        }
    }

    @Override // t25.b
    public void onResume() {
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154220y;
        if (m0Var != null) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.pluginsdk.model.b0.f189207k).getValue()).booleanValue()) {
                if (m0Var.V == null) {
                    ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                    m0Var.V = new com.tencent.mm.pluginsdk.model.h(8);
                }
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
                if (com.tencent.mm.pluginsdk.model.b0.f189212p && com.tencent.mm.pluginsdk.model.b0.f189213q != 2) {
                    b0Var.v(9L);
                    b0Var.a(com.tencent.mm.pluginsdk.model.b0.f189201e, true, 5, com.tencent.mm.pluginsdk.model.u.f189467d);
                }
                com.tencent.mm.pluginsdk.model.b0.f189212p = false;
                ((com.tencent.mm.pluginsdk.model.h) m0Var.V).a(m0Var.f154463r);
            }
            java.lang.String bizUser = m0Var.f154463r;
            java.util.Set set = qv.h.f366860a;
            kotlin.jvm.internal.o.g(bizUser, "bizUser");
            java.util.Set set2 = qv.h.f366860a;
            if (set2 != null && ((java.util.HashSet) set2).contains(bizUser)) {
                m0Var.f154464s.c();
            }
        }
    }
}
