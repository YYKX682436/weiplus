package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class MultiTalkRoomPopupNav extends android.widget.LinearLayout {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f196994d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f196995e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f196996f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f196997g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f196998h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f196999i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f197000m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f197001n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f197002o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.kf f197003p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.jf f197004q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f197005r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f197006s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f197007t;

    /* renamed from: u, reason: collision with root package name */
    public dm.f8 f197008u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f197009v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f197010w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f197011x;

    /* renamed from: y, reason: collision with root package name */
    public yb5.d f197012y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.Cif f197013z;

    public MultiTalkRoomPopupNav(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197003p = com.tencent.mm.ui.kf.NotInTalking;
        this.f197008u = new p21.j();
        e();
    }

    private void setDefaultBannerStyle(java.lang.String str) {
        this.f196997g.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479451zo));
        this.f196997g.setText(str);
        android.widget.LinearLayout linearLayout = this.f197005r;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            this.f196997g.setVisibility(0);
            this.f196999i.setVisibility(8);
            this.f196998h.setVisibility(8);
            this.f197005r.setVisibility(8);
        }
    }

    private void setInvitingBannerStyle(java.lang.String str) {
        this.f196998h.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479451zo));
        this.f196998h.setText(str);
        this.f196997g.setVisibility(8);
        this.f196999i.setVisibility(0);
        this.f196998h.setVisibility(0);
        this.f197005r.setVisibility(8);
    }

    private void setInvitingBannerStyleWithText(java.lang.String str) {
        throw null;
    }

    private void setTalkingBannerStyle(java.lang.String str) {
        this.f196997g.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479452zp));
        this.f196997g.setText(str);
        this.f196997g.setVisibility(0);
        this.f196999i.setVisibility(8);
        this.f196998h.setVisibility(8);
    }

    public void a() {
        int i17;
        java.lang.String str = this.f197000m;
        if (str == null || this.f197001n == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomPopupNav", "groupUserName or currentSenderUserName is null! groupUserName:" + this.f197000m + ",currentSenderUserName:" + this.f197001n);
            return;
        }
        boolean R4 = com.tencent.mm.storage.z3.R4(str);
        com.tencent.mm.ui.kf kfVar = com.tencent.mm.ui.kf.Inviting;
        if (R4 && !this.f197002o) {
            db5.e1.s(getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h2p), null);
            d();
            ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).d(this.f197000m);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = 4;
            objArr[1] = java.lang.Integer.valueOf(this.f197003p == kfVar ? 1 : 0);
            objArr[2] = 0;
            objArr[3] = 1;
            objArr[4] = this.f197000m;
            objArr[5] = java.lang.Integer.valueOf(this.f197008u.field_roomId);
            objArr[6] = java.lang.Long.valueOf(this.f197008u.field_roomKey);
            g0Var.d(13945, objArr);
            return;
        }
        java.lang.String str2 = this.f197000m;
        if (!((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).q4(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomPopupNav", "dealWithMultiTalkroomClick multiTalkInfo is null!");
            db5.e1.s(getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492598h36), null);
            d();
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[7];
            objArr2[0] = 4;
            objArr2[1] = java.lang.Integer.valueOf(this.f197003p == kfVar ? 1 : 0);
            objArr2[2] = 0;
            objArr2[3] = 1;
            objArr2[4] = this.f197000m;
            objArr2[5] = java.lang.Integer.valueOf(this.f197008u.field_roomId);
            objArr2[6] = java.lang.Long.valueOf(this.f197008u.field_roomKey);
            g0Var2.d(13945, objArr2);
            return;
        }
        java.util.List P6 = ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).P6(str2);
        if (P6.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomPopupNav", "dealWithMultiTalkroomClick multiTalkMemberList is empty!");
            db5.e1.s(getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492598h36), null);
            d();
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr3 = new java.lang.Object[7];
            objArr3[0] = 4;
            objArr3[1] = java.lang.Integer.valueOf(this.f197003p == kfVar ? 1 : 0);
            objArr3[2] = 0;
            objArr3[3] = 1;
            objArr3[4] = this.f197000m;
            objArr3[5] = java.lang.Integer.valueOf(this.f197008u.field_roomId);
            objArr3[6] = java.lang.Long.valueOf(this.f197008u.field_roomKey);
            g0Var3.d(13945, objArr3);
            return;
        }
        if (P6.size() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomPopupNav", "just one now member now! wait for back service process!");
        }
        com.tencent.mm.ui.kf kfVar2 = this.f197003p;
        if (kfVar2 == com.tencent.mm.ui.kf.Talking) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enterMainUiSource", 2);
            intent.putExtra("enterMainUiWxGroupId", str2);
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "multitalk", ".ui.MultiTalkMainUI", intent, null);
            com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr4 = new java.lang.Object[7];
            objArr4[0] = 4;
            objArr4[1] = java.lang.Integer.valueOf(this.f197003p == kfVar ? 1 : 0);
            objArr4[2] = 0;
            objArr4[3] = 0;
            objArr4[4] = this.f197000m;
            objArr4[5] = java.lang.Integer.valueOf(this.f197008u.field_roomId);
            objArr4[6] = java.lang.Long.valueOf(this.f197008u.field_roomKey);
            g0Var4.d(13945, objArr4);
            return;
        }
        if (kfVar2 == kfVar) {
            java.lang.String De = ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).De(str2, this.f197001n);
            if (De != null) {
                i17 = 1;
                g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c0y, ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).getDisplayName(De)), b(P6, this.f197001n), str2, P6.size(), 300L);
            } else {
                i17 = 1;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var5 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr5 = new java.lang.Object[7];
            objArr5[0] = 4;
            objArr5[i17] = java.lang.Integer.valueOf(this.f197003p == kfVar ? i17 : 0);
            objArr5[2] = 0;
            objArr5[3] = 0;
            objArr5[4] = this.f197000m;
            objArr5[5] = java.lang.Integer.valueOf(this.f197008u.field_roomId);
            objArr5[6] = java.lang.Long.valueOf(this.f197008u.field_roomKey);
            g0Var5.d(13945, objArr5);
            return;
        }
        if (((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).ff()) {
            db5.e1.s(getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h1z), null);
            com.tencent.mm.plugin.report.service.g0 g0Var6 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr6 = new java.lang.Object[7];
            objArr6[0] = 4;
            objArr6[1] = java.lang.Integer.valueOf(this.f197003p == kfVar ? 1 : 0);
            objArr6[2] = 0;
            objArr6[3] = 1;
            objArr6[4] = this.f197000m;
            objArr6[5] = java.lang.Integer.valueOf(this.f197008u.field_roomId);
            objArr6[6] = java.lang.Long.valueOf(this.f197008u.field_roomKey);
            g0Var6.d(13945, objArr6);
            return;
        }
        if (P6.size() < zj3.j.e()) {
            g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h3e), b(P6, ""), str2, P6.size(), 300L);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13945, 4, 0, 0, 0, this.f197000m, java.lang.Integer.valueOf(this.f197008u.field_roomId), java.lang.Long.valueOf(this.f197008u.field_roomKey));
            return;
        }
        db5.e1.s(getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492592h26, zj3.j.e() + ""), null);
        com.tencent.mm.plugin.report.service.g0 g0Var7 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr7 = new java.lang.Object[7];
        objArr7[0] = 4;
        objArr7[1] = java.lang.Integer.valueOf(this.f197003p == kfVar ? 1 : 0);
        objArr7[2] = 1;
        objArr7[3] = 1;
        objArr7[4] = this.f197000m;
        objArr7[5] = java.lang.Integer.valueOf(this.f197008u.field_roomId);
        objArr7[6] = java.lang.Long.valueOf(this.f197008u.field_roomKey);
        g0Var7.d(13945, objArr7);
    }

    public java.util.List b(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (str != null && str != "") {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 != null && !str2.equals(str)) {
                    arrayList2.add(str2);
                }
            }
            list = arrayList2;
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList.add((java.lang.String) it6.next());
        }
        return arrayList;
    }

    public void c() {
        android.widget.LinearLayout linearLayout;
        com.tencent.mm.ui.jf jfVar = this.f197004q;
        if (jfVar == null || (linearLayout = jfVar.f209004a) == null || linearLayout.getVisibility() != 0) {
            return;
        }
        com.tencent.mm.ui.jf.a(this.f197004q);
        this.f197004q.f209004a.setVisibility(8);
    }

    public void d() {
        setVisibility(8);
        com.tencent.mm.ui.jf jfVar = this.f197004q;
        if (jfVar != null) {
            com.tencent.mm.ui.jf.a(jfVar);
        }
    }

    public final void e() {
        android.view.View.inflate(getContext(), getInitViewId(), this);
        this.f197009v = findViewById(com.tencent.mm.R.id.m7p);
        this.f197010w = findViewById(com.tencent.mm.R.id.aun);
        this.f196994d = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jws);
        this.f196997g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jx_);
        this.f196998h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jxa);
        this.f196999i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jxb);
        this.f197005r = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jwg);
        this.f197006s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jwf);
        this.f197007t = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jwe);
        this.f196995e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.a4f);
        this.f196996f = findViewById(com.tencent.mm.R.id.f486095k55);
        this.f196994d.setOnClickListener(new com.tencent.mm.ui.ef(this));
        ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        this.A = (int) java.lang.Math.floor((r0.widthPixels - com.tencent.mm.ui.zk.a(getContext(), 56)) / com.tencent.mm.ui.zk.a(getContext(), 48));
    }

    public boolean f(int i17) {
        return true;
    }

    public void g(java.lang.String str, java.util.List list, java.lang.String str2, int i17, long j17) {
        setNavBackgroundColor(0);
        this.f196995e.setVisibility(4);
        com.tencent.mm.ui.jf jfVar = new com.tencent.mm.ui.jf(this, this.f197003p == com.tencent.mm.ui.kf.Inviting, null);
        this.f197004q = jfVar;
        com.tencent.mm.ui.ff ffVar = new com.tencent.mm.ui.ff(this, str2);
        com.tencent.mm.ui.gf gfVar = new com.tencent.mm.ui.gf(this);
        jfVar.f209006c.setText(str);
        this.f197005r.setVisibility(0);
        this.f197005r.removeAllViews();
        if (list != null) {
            if (list.size() > this.A) {
                this.f197006s.setVisibility(0);
                this.f197006s.removeAllViews();
            }
            if (list.size() > this.A * 2) {
                this.f197007t.setVisibility(0);
                this.f197007t.removeAllViews();
            }
        }
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40));
            layoutParams.rightMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(layoutParams);
            int i19 = this.A;
            if (i18 < i19) {
                this.f197005r.addView(imageView);
            } else if (i18 >= i19 && i18 < i19 * 2) {
                this.f197006s.addView(imageView);
            } else if (i18 >= i19 * 2 && i18 < i19 * 3) {
                this.f197007t.addView(imageView);
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str3, null);
            i18++;
        }
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.jvy)).setOnClickListener(ffVar);
        jfVar.f209005b.setOnClickListener(gfVar);
        android.view.View view = this.f197011x;
        if (view != null) {
            view.setOnClickListener(gfVar);
        }
        android.widget.LinearLayout linearLayout = jfVar.f209004a;
        if (linearLayout.getVisibility() != 0) {
            linearLayout.setVisibility(0);
            j(linearLayout, j17);
            i(true);
            android.view.View view2 = this.f197011x;
            if (view2 != null) {
                view2.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477783bc));
            }
        }
    }

    public int getInitViewId() {
        return com.tencent.mm.R.layout.c3g;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(boolean r13) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.MultiTalkRoomPopupNav.h(boolean):void");
    }

    public final void i(boolean z17) {
        android.view.View view = this.f197011x;
        if (view != null) {
            if (!z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f197010w;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                setNavBackgroundResource(com.tencent.mm.R.drawable.b7a);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f196995e;
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                    return;
                }
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f197010w;
            if (view3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            setNavBackgroundColor(0);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f196995e;
            if (weImageView2 != null) {
                weImageView2.setVisibility(4);
            }
            yb5.d dVar = this.f197012y;
            if (dVar != null) {
                dVar.y();
            }
        }
    }

    public void j(android.widget.LinearLayout linearLayout, long j17) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477854dc);
        loadAnimation.setDuration(j17);
        linearLayout.startAnimation(loadAnimation);
    }

    public void k(android.widget.LinearLayout linearLayout, long j17) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477858dg);
        loadAnimation.setAnimationListener(new com.tencent.mm.ui.hf(this, linearLayout));
        linearLayout.startAnimation(loadAnimation);
    }

    public void setChattingContext(yb5.d dVar) {
        this.f197012y = dVar;
    }

    public void setCurrentSenderUserName(java.lang.String str) {
        this.f197001n = str;
    }

    public void setEnterMultiTalkListener(com.tencent.mm.ui.Cif cif) {
        this.f197013z = cif;
    }

    public void setGroupUserName(java.lang.String str) {
        this.f197000m = str;
    }

    public void setInChatRoom(boolean z17) {
        this.f197002o = z17;
    }

    public void setMultiTalkInfo(dm.f8 f8Var) {
        this.f197008u = f8Var;
    }

    public void setNavBackgroundColor(int i17) {
        android.widget.LinearLayout linearLayout = this.f196994d;
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(i17);
        }
    }

    public void setNavBackgroundResource(int i17) {
        android.widget.LinearLayout linearLayout = this.f196994d;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(i17);
        }
    }

    public void setRootTipsBarBackground(android.view.View view) {
        this.f197011x = view;
    }

    public void setUserTalkingStatus(com.tencent.mm.ui.kf kfVar) {
        this.f197003p = kfVar;
    }

    public MultiTalkRoomPopupNav(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197003p = com.tencent.mm.ui.kf.NotInTalking;
        this.f197008u = new p21.j();
        e();
    }
}
