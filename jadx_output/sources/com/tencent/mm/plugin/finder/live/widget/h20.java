package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class h20 extends com.tencent.mm.plugin.finder.live.widget.c40 implements vm2.f {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f118508t;

    /* renamed from: u, reason: collision with root package name */
    public fg2.t1 f118509u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f118510v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f118511w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h20(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.d40 params) {
        super(context, params);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        this.f118508t = "FinderLiveVisitorKTVMicReplayWidget";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f118511w = arrayList;
        fg2.t1 t1Var = this.f118509u;
        if (t1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView finderLiveVisitorKtvMicReplayDetailRecyclerView = t1Var.f262319d;
        kotlin.jvm.internal.o.f(finderLiveVisitorKtvMicReplayDetailRecyclerView, "finderLiveVisitorKtvMicReplayDetailRecyclerView");
        finderLiveVisitorKtvMicReplayDetailRecyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context));
        finderLiveVisitorKtvMicReplayDetailRecyclerView.setAdapter(new vm2.e(arrayList, this));
    }

    public static /* synthetic */ void N(com.tencent.mm.plugin.finder.live.widget.h20 h20Var, java.lang.Integer num, ml2.k4 k4Var, java.lang.Integer num2, ml2.l4 l4Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        if ((i17 & 2) != 0) {
            k4Var = null;
        }
        if ((i17 & 4) != 0) {
            num2 = null;
        }
        if ((i17 & 8) != 0) {
            l4Var = null;
        }
        h20Var.M(num, k4Var, num2, l4Var);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public java.lang.String A() {
        return this.f118508t;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public dk2.na B(r45.jt1 res) {
        kotlin.jvm.internal.o.g(res, "res");
        r45.b54 b54Var = (r45.b54) res.getCustom(3);
        if (b54Var == null) {
            com.tencent.mars.xlog.Log.e(this.f118508t, "micReplayInfo is null");
            return dk2.na.f233811m;
        }
        dk2.qf qfVar = this.f117956i;
        qfVar.getClass();
        java.util.List list = qfVar.G;
        list.clear();
        java.util.LinkedList<r45.gl4> list2 = b54Var.getList(0);
        if (list2 != null) {
            for (r45.gl4 gl4Var : list2) {
                kotlin.jvm.internal.o.d(gl4Var);
                list.add(new dk2.rf(gl4Var));
            }
        }
        dk2.ma maVar = dk2.na.f233805d;
        r45.hl4 a17 = r45.hl4.a((int) b54Var.getLong(2));
        if (a17 == null) {
            a17 = r45.hl4.kMicReplayFailed;
        }
        dk2.na a18 = maVar.a(a17);
        P(a18);
        return a18;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public void C(dk2.na status) {
        kotlin.jvm.internal.o.g(status, "status");
        fg2.t1 t1Var = this.f118509u;
        if (t1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var.f262324i.setVisibility(0);
        fg2.t1 t1Var2 = this.f118509u;
        if (t1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var2.f262323h.setVisibility(8);
        fg2.t1 t1Var3 = this.f118509u;
        if (t1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var3.f262328m.setVisibility(8);
        fg2.t1 t1Var4 = this.f118509u;
        if (t1Var4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var4.f262326k.setVisibility(8);
        fg2.t1 t1Var5 = this.f118509u;
        if (t1Var5 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var5.f262325j.setVisibility(8);
        int ordinal = status.ordinal();
        android.content.Context context = this.f118381d;
        switch (ordinal) {
            case 0:
            case 8:
                fg2.t1 t1Var6 = this.f118509u;
                if (t1Var6 != null) {
                    t1Var6.f262324i.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
            case 1:
                fg2.t1 t1Var7 = this.f118509u;
                if (t1Var7 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var7.f262323h.setVisibility(0);
                fg2.t1 t1Var8 = this.f118509u;
                if (t1Var8 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var8.f262323h.setText(context.getResources().getString(com.tencent.mm.R.string.f493741ov3));
                M(null, ml2.k4.f327649e, 1, ml2.l4.f327699e);
                return;
            case 2:
            case 5:
                fg2.t1 t1Var9 = this.f118509u;
                if (t1Var9 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var9.f262328m.setVisibility(0);
                fg2.t1 t1Var10 = this.f118509u;
                if (t1Var10 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var10.f262328m.setText(context.getResources().getString(com.tencent.mm.R.string.f493743ov5));
                return;
            case 3:
                fg2.t1 t1Var11 = this.f118509u;
                if (t1Var11 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var11.f262328m.setVisibility(0);
                fg2.t1 t1Var12 = this.f118509u;
                if (t1Var12 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var12.f262326k.setVisibility(0);
                fg2.t1 t1Var13 = this.f118509u;
                if (t1Var13 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var13.f262328m.setText(context.getResources().getString(com.tencent.mm.R.string.ov9));
                M(null, ml2.k4.f327649e, 1, ml2.l4.f327700f);
                return;
            case 4:
                fg2.t1 t1Var14 = this.f118509u;
                if (t1Var14 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var14.f262328m.setVisibility(0);
                fg2.t1 t1Var15 = this.f118509u;
                if (t1Var15 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var15.f262326k.setVisibility(0);
                fg2.t1 t1Var16 = this.f118509u;
                if (t1Var16 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var16.f262328m.setText(context.getResources().getString(com.tencent.mm.R.string.ov8));
                M(null, ml2.k4.f327649e, 1, ml2.l4.f327701g);
                return;
            case 6:
                fg2.t1 t1Var17 = this.f118509u;
                if (t1Var17 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var17.f262328m.setVisibility(0);
                fg2.t1 t1Var18 = this.f118509u;
                if (t1Var18 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                t1Var18.f262328m.setText(context.getResources().getString(com.tencent.mm.R.string.f493742ov4));
                return;
            case 7:
                fg2.t1 t1Var19 = this.f118509u;
                if (t1Var19 != null) {
                    t1Var19.f262325j.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
            default:
                return;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public void G() {
        fg2.t1 t1Var = this.f118509u;
        if (t1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var.f262339x.setVisibility(8);
        fg2.t1 t1Var2 = this.f118509u;
        if (t1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var2.f262321f.setVisibility(8);
        fg2.t1 t1Var3 = this.f118509u;
        if (t1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var3.f262324i.setVisibility(8);
        fg2.t1 t1Var4 = this.f118509u;
        if (t1Var4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var4.f262332q.setVisibility(0);
        fg2.t1 t1Var5 = this.f118509u;
        if (t1Var5 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var5.f262333r.setVisibility(0);
        fg2.t1 t1Var6 = this.f118509u;
        if (t1Var6 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var6.f262334s.setVisibility(0);
        fg2.t1 t1Var7 = this.f118509u;
        if (t1Var7 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var7.f262322g.setVisibility(8);
        dk2.qf qfVar = this.f117956i;
        int i17 = qfVar.B;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (i17 == 3) {
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(qfVar.A, null, 2, null);
            fg2.t1 t1Var8 = this.f118509u;
            if (t1Var8 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.widget.ImageView finderLiveVisitorMicReplayAvatarIcon = t1Var8.f262320e;
            kotlin.jvm.internal.o.f(finderLiveVisitorMicReplayAvatarIcon, "finderLiveVisitorMicReplayAvatarIcon");
            a17.c(nVar, finderLiveVisitorMicReplayAvatarIcon, g1Var.h(mn2.f1.f329957h));
        } else {
            vo0.d l17 = g1Var.l();
            mn2.n nVar2 = new mn2.n(qfVar.A, null, 2, null);
            fg2.t1 t1Var9 = this.f118509u;
            if (t1Var9 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.widget.ImageView finderLiveVisitorMicReplayAvatarIcon2 = t1Var9.f262320e;
            kotlin.jvm.internal.o.f(finderLiveVisitorMicReplayAvatarIcon2, "finderLiveVisitorMicReplayAvatarIcon");
            l17.c(nVar2, finderLiveVisitorMicReplayAvatarIcon2, g1Var.h(mn2.f1.f329961o));
        }
        fg2.t1 t1Var10 = this.f118509u;
        if (t1Var10 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.content.res.Resources resources = this.f118381d.getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = qfVar.C;
        if (str == null) {
            str = " ";
        }
        objArr[0] = str;
        t1Var10.f262340y.setText(resources.getString(com.tencent.mm.R.string.owf, objArr));
        fg2.t1 t1Var11 = this.f118509u;
        if (t1Var11 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        if (t1Var11.f262316a.getWidth() != 0) {
            L(false);
            return;
        }
        fg2.t1 t1Var12 = this.f118509u;
        if (t1Var12 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.view.ViewTreeObserver viewTreeObserver = t1Var12.f262316a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.live.widget.g20(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public void I() {
        fg2.t1 t1Var = this.f118509u;
        if (t1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var.f262333r.setVisibility(8);
        fg2.t1 t1Var2 = this.f118509u;
        if (t1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        t1Var2.f262334s.setVisibility(8);
        fg2.t1 t1Var3 = this.f118509u;
        if (t1Var3 != null) {
            t1Var3.f262322g.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.h20.K():void");
    }

    public final void L(boolean z17) {
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withEndAction;
        com.tencent.mars.xlog.Log.i(this.f118508t, "closeReplayDetailPage: shouldAnimation = " + z17);
        this.f118510v = false;
        fg2.t1 t1Var = this.f118509u;
        if (t1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.LinearLayout finderLiveVisitorKtvMicReplayDetailContent = t1Var.f262318c;
        kotlin.jvm.internal.o.f(finderLiveVisitorKtvMicReplayDetailContent, "finderLiveVisitorKtvMicReplayDetailContent");
        fg2.t1 t1Var2 = this.f118509u;
        if (t1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        float width = t1Var2.f262316a.getWidth();
        if (!z17) {
            O(false);
            finderLiveVisitorKtvMicReplayDetailContent.setTranslationX(width);
            return;
        }
        O(true);
        android.view.ViewPropertyAnimator animate = finderLiveVisitorKtvMicReplayDetailContent.animate();
        if (animate == null || (translationX = animate.translationX(width)) == null || (duration = translationX.setDuration(300L)) == null || (withEndAction = duration.withEndAction(new com.tencent.mm.plugin.finder.live.widget.e20(this))) == null) {
            return;
        }
        withEndAction.start();
    }

    public final void M(java.lang.Integer num, ml2.k4 k4Var, java.lang.Integer num2, ml2.l4 l4Var) {
        com.tencent.mars.xlog.Log.i(this.f118508t, "reportKTVReplay: type = " + num + ", element = " + k4Var + ", subType = " + num2 + ", subElement = " + l4Var);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327217a3;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (num != null) {
            jSONObject.put("type", num.intValue());
        }
        if (k4Var != null) {
            jSONObject.put("element", k4Var.f327653d);
        }
        if (num2 != null) {
            jSONObject.put("subType", num2.intValue());
        }
        if (l4Var != null) {
            jSONObject.put("subElement", l4Var.f327703d);
        }
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void O(boolean z17) {
        fg2.t1 t1Var = this.f118509u;
        if (t1Var != null) {
            t1Var.f262316a.setNeedInterceptTouchEvent(z17);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void P(dk2.na naVar) {
        if (this.f118510v) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("oldSize = ");
            java.util.ArrayList arrayList = this.f118511w;
            sb6.append(arrayList.size());
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = this.f118508t;
            com.tencent.mars.xlog.Log.i(str, sb7);
            java.util.List S0 = kz5.n0.S0(arrayList);
            arrayList.clear();
            com.tencent.mars.xlog.Log.i(str, "status = " + naVar);
            if (naVar == dk2.na.f233810i) {
                arrayList.add(new vm2.k(3));
            } else {
                arrayList.add(new vm2.k(2));
            }
            int a17 = com.tencent.mm.ui.zk.a(this.f118381d, 24);
            for (dk2.rf rfVar : this.f117956i.G) {
                com.tencent.mars.xlog.Log.i(str, "add micReplayInfo = " + rfVar);
                arrayList.add(new vm2.n(rfVar, a17));
            }
            com.tencent.mars.xlog.Log.i(str, "newSize = " + arrayList.size());
            androidx.recyclerview.widget.c0 a18 = androidx.recyclerview.widget.h0.a(new vm2.g(S0, arrayList), true);
            fg2.t1 t1Var = this.f118509u;
            if (t1Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = t1Var.f262319d.getAdapter();
            if (adapter != null) {
                a18.b(adapter);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.ec9;
    }

    @Override // vm2.f
    public void m1(dk2.rf micReplayInfo, int i17) {
        kotlin.jvm.internal.o.g(micReplayInfo, "micReplayInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickItem: micReplayInfo = ");
        sb6.append(micReplayInfo);
        sb6.append(",status = ");
        int i18 = micReplayInfo.f234045m;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i(this.f118508t, sb6.toString());
        android.content.Context context = this.f118381d;
        if (i18 == 0 || i18 == 2) {
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.ow8);
            e4Var.c();
            return;
        }
        if (i18 == 3) {
            D(micReplayInfo, t40.d.f415479g, 111);
            return;
        }
        int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var2.d(com.tencent.mm.R.string.oum);
        e4Var2.c();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withEndAction;
        fg2.t1 t1Var = this.f118509u;
        if (t1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        boolean b17 = kotlin.jvm.internal.o.b(view, t1Var.f262336u);
        java.lang.String str = this.f118508t;
        if (b17) {
            com.tencent.mars.xlog.Log.i(str, "onClick: my heat icon");
            H();
            N(this, 1, ml2.k4.f327650f, null, null, 12, null);
            return;
        }
        fg2.t1 t1Var2 = this.f118509u;
        if (t1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        if (!kotlin.jvm.internal.o.b(view, t1Var2.f262327l)) {
            fg2.t1 t1Var3 = this.f118509u;
            if (t1Var3 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            if (kotlin.jvm.internal.o.b(view, t1Var3.f262317b)) {
                com.tencent.mars.xlog.Log.i(str, "onClick: back icon");
                L(true);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "onClick: gen status layout");
        dk2.qf qfVar = this.f117956i;
        dk2.na naVar = qfVar.f233986w;
        if (naVar == dk2.na.f233807f) {
            E(true);
            J(dk2.na.f233813o);
            M(null, ml2.k4.f327649e, 2, ml2.l4.f327699e);
            return;
        }
        dk2.na naVar2 = dk2.na.f233810i;
        if (naVar == naVar2 || naVar == dk2.na.f233809h) {
            com.tencent.mars.xlog.Log.i(str, "openReplayDetailPage: shouldAnimation = true");
            this.f118510v = true;
            fg2.t1 t1Var4 = this.f118509u;
            if (t1Var4 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.widget.LinearLayout finderLiveVisitorKtvMicReplayDetailContent = t1Var4.f262318c;
            kotlin.jvm.internal.o.f(finderLiveVisitorKtvMicReplayDetailContent, "finderLiveVisitorKtvMicReplayDetailContent");
            O(true);
            android.view.ViewPropertyAnimator animate = finderLiveVisitorKtvMicReplayDetailContent.animate();
            if (animate != null && (translationX = animate.translationX(0.0f)) != null && (duration = translationX.setDuration(300L)) != null && (withEndAction = duration.withEndAction(new com.tencent.mm.plugin.finder.live.widget.f20(this))) != null) {
                withEndAction.start();
            }
            N(this, 1, ml2.k4.f327651g, null, null, 12, null);
            P(qfVar.f233986w);
            dk2.na naVar3 = qfVar.f233986w;
            if (naVar3 == naVar2) {
                M(null, ml2.k4.f327649e, 2, ml2.l4.f327701g);
            } else if (naVar3 == dk2.na.f233809h) {
                M(null, ml2.k4.f327649e, 2, ml2.l4.f327700f);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.tp_;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tp_);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.tpa;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.tpa);
            if (weImageView != null) {
                i17 = com.tencent.mm.R.id.tpb;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tpb);
                if (linearLayout2 != null) {
                    i17 = com.tencent.mm.R.id.tpc;
                    androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(rootView, com.tencent.mm.R.id.tpc);
                    if (recyclerView != null) {
                        com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout = (com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout) rootView;
                        i17 = com.tencent.mm.R.id.tpz;
                        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.tencent.mm.R.id.tpz);
                        if (imageView != null) {
                            i17 = com.tencent.mm.R.id.f484847tq0;
                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.f484847tq0);
                            if (linearLayout3 != null) {
                                i17 = com.tencent.mm.R.id.f484848tq1;
                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f484848tq1);
                                if (textView != null) {
                                    i17 = com.tencent.mm.R.id.f484849tq2;
                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f484849tq2);
                                    if (textView2 != null) {
                                        i17 = com.tencent.mm.R.id.f484850tq3;
                                        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.f484850tq3);
                                        if (linearLayout4 != null) {
                                            i17 = com.tencent.mm.R.id.f484851tq4;
                                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.f484851tq4);
                                            if (frameLayout != null) {
                                                i17 = com.tencent.mm.R.id.f484852tq5;
                                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f484852tq5);
                                                if (weImageView2 != null) {
                                                    i17 = com.tencent.mm.R.id.tq6;
                                                    android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tq6);
                                                    if (linearLayout5 != null) {
                                                        i17 = com.tencent.mm.R.id.tq7;
                                                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tq7);
                                                        if (textView3 != null) {
                                                            i17 = com.tencent.mm.R.id.tq8;
                                                            android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tq8);
                                                            if (linearLayout6 != null) {
                                                                i17 = com.tencent.mm.R.id.tq9;
                                                                android.widget.Space space = (android.widget.Space) x4.b.a(rootView, com.tencent.mm.R.id.tq9);
                                                                if (space != null) {
                                                                    i17 = com.tencent.mm.R.id.tq_;
                                                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tq_);
                                                                    if (textView4 != null) {
                                                                        i17 = com.tencent.mm.R.id.tqa;
                                                                        android.widget.LinearLayout linearLayout7 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tqa);
                                                                        if (linearLayout7 != null) {
                                                                            i17 = com.tencent.mm.R.id.tqb;
                                                                            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.tencent.mm.R.id.tqb);
                                                                            if (progressBar != null) {
                                                                                i17 = com.tencent.mm.R.id.tqc;
                                                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tqc);
                                                                                if (textView5 != null) {
                                                                                    i17 = com.tencent.mm.R.id.tqd;
                                                                                    android.widget.LinearLayout linearLayout8 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tqd);
                                                                                    if (linearLayout8 != null) {
                                                                                        i17 = com.tencent.mm.R.id.tqe;
                                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.tqe);
                                                                                        if (weImageView3 != null) {
                                                                                            i17 = com.tencent.mm.R.id.tqf;
                                                                                            android.widget.Space space2 = (android.widget.Space) x4.b.a(rootView, com.tencent.mm.R.id.tqf);
                                                                                            if (space2 != null) {
                                                                                                i17 = com.tencent.mm.R.id.tqg;
                                                                                                android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tqg);
                                                                                                if (textView6 != null) {
                                                                                                    i17 = com.tencent.mm.R.id.tqm;
                                                                                                    android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tqm);
                                                                                                    if (textView7 != null) {
                                                                                                        i17 = com.tencent.mm.R.id.tqn;
                                                                                                        android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tqn);
                                                                                                        if (textView8 != null) {
                                                                                                            i17 = com.tencent.mm.R.id.tqo;
                                                                                                            android.widget.LinearLayout linearLayout9 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tqo);
                                                                                                            if (linearLayout9 != null) {
                                                                                                                i17 = com.tencent.mm.R.id.tqp;
                                                                                                                android.widget.Space space3 = (android.widget.Space) x4.b.a(rootView, com.tencent.mm.R.id.tqp);
                                                                                                                if (space3 != null) {
                                                                                                                    i17 = com.tencent.mm.R.id.tqq;
                                                                                                                    android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tqq);
                                                                                                                    if (textView9 != null) {
                                                                                                                        this.f118509u = new fg2.t1(finderLiveInterceptRelativeLayout, linearLayout, weImageView, linearLayout2, recyclerView, finderLiveInterceptRelativeLayout, imageView, linearLayout3, textView, textView2, linearLayout4, frameLayout, weImageView2, linearLayout5, textView3, linearLayout6, space, textView4, linearLayout7, progressBar, textView5, linearLayout8, weImageView3, space2, textView6, textView7, textView8, linearLayout9, space3, textView9);
                                                                                                                        weImageView3.setOnClickListener(this);
                                                                                                                        fg2.t1 t1Var = this.f118509u;
                                                                                                                        if (t1Var == null) {
                                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        t1Var.f262327l.setOnClickListener(this);
                                                                                                                        fg2.t1 t1Var2 = this.f118509u;
                                                                                                                        if (t1Var2 != null) {
                                                                                                                            t1Var2.f262317b.setOnClickListener(this);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40, com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        N(this, 1, ml2.k4.f327649e, null, null, 12, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public int y() {
        qs5.d dVar = qs5.d.f366426e;
        return 17;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public long z() {
        return 1L;
    }
}
