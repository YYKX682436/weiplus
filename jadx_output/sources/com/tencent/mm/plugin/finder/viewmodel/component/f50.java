package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class f50 extends com.tencent.mm.ui.component.UIComponent implements ya2.x1, zy2.xa {
    public static int A1;

    /* renamed from: y1, reason: collision with root package name */
    public static com.tencent.mm.protocal.protobuf.FinderJumpInfo f134335y1;

    /* renamed from: z1, reason: collision with root package name */
    public static int f134336z1;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public boolean E;
    public boolean F;
    public long G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f134337J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public boolean T;
    public boolean U;
    public boolean V;
    public java.lang.String W;
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo X;
    public boolean Y;
    public final boolean Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f134338d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lk2 f134339e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ProgressBar f134340f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f134341g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f134342h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f134343i;

    /* renamed from: l1, reason: collision with root package name */
    public final androidx.lifecycle.k0 f134344l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f134345m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f134346n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f134347o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f134348p;

    /* renamed from: p0, reason: collision with root package name */
    public final jz5.g f134349p0;

    /* renamed from: p1, reason: collision with root package name */
    public final androidx.lifecycle.k0 f134350p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f134351q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f134352r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f134353s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f134354t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f134355u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f134356v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f134357w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f134358x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f134359x0;

    /* renamed from: x1, reason: collision with root package name */
    public r45.nw6 f134360x1;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f134361y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f134362y0;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f134363z;

    static {
        g92.b bVar = g92.b.f269769e;
        m92.b j37 = g92.a.j3(bVar, bVar.T0(), false, 2, null);
        A1 = j37 != null ? j37.u0().getInteger(6) : 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f50(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134338d = "";
        this.f134346n = new java.util.HashMap();
        this.f134356v = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.v40(this));
        this.f134357w = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.u40(this));
        this.f134358x = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.w40(this));
        this.f134361y = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.d50(this));
        this.f134363z = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.e50(this));
        this.A = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.k20(this));
        this.B = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.l20(this));
        this.C = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.m20(this));
        this.D = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.o40(activity));
        this.f134337J = "";
        this.K = "";
        this.L = "";
        this.M = "";
        this.N = "";
        this.P = "";
        this.Q = "";
        this.R = "";
        this.S = "";
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c17).f221226g.f242285b;
        java.lang.String t17 = o4Var != null ? o4Var.t("kFinderSelfCreatorCenterUrlKey") : null;
        this.W = t17 == null ? "" : t17;
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = ((cq.k) c18).f221226g.f242285b;
        byte[] j17 = o4Var2 != null ? o4Var2.j("kFinderSelfCreatorCenterJumpInfoKey") : null;
        if (j17 == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderMMKVManager", "getSelfCreatorCenterJumpInfo: bytes is null");
        } else {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.tencent.mm.protocal.protobuf.FinderJumpInfo create = com.tencent.mm.protocal.protobuf.FinderJumpInfo.create();
                create.fromProtobuf(j17);
                finderJumpInfo = kotlin.Result.m521constructorimpl(create);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                finderJumpInfo = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(finderJumpInfo);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("Finder.FinderMMKVManager", "getSelfCreatorCenterJumpInfo: " + m524exceptionOrNullimpl.getMessage());
            }
            r4 = kotlin.Result.m527isFailureimpl(finderJumpInfo) ? null : finderJumpInfo;
        }
        this.X = r4;
        this.Z = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.G().r()).intValue() > 0;
        this.f134349p0 = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.d40(activity));
        this.f134362y0 = "";
        this.f134344l1 = new com.tencent.mm.plugin.finder.viewmodel.component.f40(this);
        this.f134350p1 = new com.tencent.mm.plugin.finder.viewmodel.component.g40(this);
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "click follow entry, source=" + str + ", jump to FinderFollowAggregationUI");
        f50Var.V6();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, f50Var.getActivity(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        intent.putExtra("key_is_aggregation_page", true);
        intent.setClass(f50Var.getActivity(), com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI.class);
        androidx.appcompat.app.AppCompatActivity activity = f50Var.getActivity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initView$jumpToFollowAggregation", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initView$jumpToFollowAggregation", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).Jj(f50Var.getActivity(), f50Var.G, f50Var.E, 2L, 1L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
    }

    public static final void P6(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        f50Var.V6();
        r45.lk2 lk2Var = f50Var.f134339e;
        r45.p85 p85Var = lk2Var != null ? (r45.p85) lk2Var.getCustom(34) : null;
        android.content.Intent intent = new android.content.Intent();
        boolean z17 = false;
        if (p85Var != null && p85Var.getInteger(0) == 1) {
            z17 = true;
        }
        if (z17) {
            intent.putExtra("intent_can_show_histroy_switch", true);
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.assist.i0.bk((com.tencent.mm.plugin.finder.assist.i0) c17, f50Var.getActivity(), null, null, 6, null);
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c18).Jj(f50Var.getActivity(), f50Var.G, f50Var.E, 2L, 13L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
    }

    public static final void Q6(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, boolean z17, com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var) {
        android.widget.TextView textView;
        r45.f03 f03Var;
        f50Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[SHOW NEW] red=");
        sb6.append(z9Var != null && z9Var.f105327a);
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", sb6.toString());
        java.lang.Integer valueOf = (z9Var == null || (f03Var = z9Var.f105328b) == null) ? null : java.lang.Integer.valueOf(f03Var.f373887d);
        if (valueOf != null && valueOf.intValue() == 6) {
            textView = f50Var.f134343i;
            if (textView == null) {
                kotlin.jvm.internal.o.o("finderCanPostNoContact");
                throw null;
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            textView = f50Var.f134345m;
            if (textView == null) {
                kotlin.jvm.internal.o.o("finderPostRedDot");
                throw null;
            }
        } else {
            textView = null;
        }
        if (z17) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLCamera");
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLCamera");
            if (I0 == null || L0 == null) {
                return;
            }
            com.tencent.mm.plugin.finder.report.x2.f125429a.e("4", L0, I0, 1, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
            return;
        }
        android.widget.TextView textView2 = f50Var.f134343i;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("finderCanPostNoContact");
            throw null;
        }
        textView2.setVisibility(8);
        android.widget.TextView textView3 = f50Var.f134345m;
        if (textView3 != null) {
            textView3.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("finderPostRedDot");
            throw null;
        }
    }

    public final void A7() {
        java.lang.String str;
        r45.vs2 vs2Var;
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "finder_private_msg_entrance", this.f134338d, false, false, 12, null);
        r45.f03 I0 = S0 != null ? S0.I0("finder_private_msg_entrance") : null;
        android.widget.TextView textView = (android.widget.TextView) d7().findViewById(com.tencent.mm.R.id.qci);
        android.view.View findViewById = d7().findViewById(com.tencent.mm.R.id.qch);
        int i17 = I0 != null ? I0.f373888e : 0;
        int i18 = I0 != null ? I0.f373887d : 0;
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "[updateFinderMsgRedDot] " + I0);
        if (i17 > 0 && i18 == 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updateFinderMsgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updateFinderMsgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.plugin.finder.assist.w2.a(i17));
            textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(getContext(), i17));
            textView.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(getContext()));
            if (S0 == null || (vs2Var = S0.field_ctrInfo) == null || (str = vs2Var.f388490h) == null) {
                str = "";
            }
            if (!kotlin.jvm.internal.o.b(str, this.f134337J) && I0 != null) {
                this.f134337J = str;
                com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                androidx.appcompat.app.AppCompatActivity context = getActivity();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", S0, I0, 1, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            }
        } else if (i18 == 1) {
            textView.setVisibility(8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updateFinderMsgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updateFinderMsgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView.setVisibility(8);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updateFinderMsgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updateFinderMsgRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView.getVisibility() == 0 || findViewById.getVisibility() == 0) {
            android.view.View d76 = d7();
            if (d76 != null) {
                d76.setTag(com.tencent.mm.R.id.e76, java.lang.Integer.valueOf(I0 != null ? I0.f373888e : 0));
                return;
            }
            return;
        }
        android.view.View d77 = d7();
        if (d77 != null) {
            d77.setTag(com.tencent.mm.R.id.e76, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B7(r45.nw6 r17) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.f50.B7(r45.nw6):void");
    }

    public final void C7(boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "PersonalCenterPurchasedContentEntry", this.f134338d, false, false, 12, null);
        r45.f03 I0 = S0 != null ? S0.I0("PersonalCenterPurchasedContentEntry") : null;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qfl);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qfm);
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "[updatePurchasedContentEntryRedDot] " + I0);
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updatePurchasedContentEntryRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updatePurchasedContentEntryRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(8);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updatePurchasedContentEntryRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updatePurchasedContentEntryRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(0);
        if (I0 == null || (str = I0.f373889f) == null) {
            str = "";
        }
        textView.setText(str);
    }

    public final void R6() {
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("CreatorCenter");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("CreatorCenter");
        if (L0 != null && I0 != null) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", L0, I0, 2, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).Jj(getContext(), this.G, this.E, 2L, 8L, (r30 & 32) != 0 ? false : I0 != null, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : xy2.c.e(getContext()));
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("FinderPosterEntrance");
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("CreatorCenter");
    }

    public final void S6(android.view.View view, android.view.View view2) {
        android.view.View view3;
        java.lang.String str;
        java.lang.String string;
        java.util.LinkedList list;
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButRevingUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButRevingUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButRevingUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButRevingUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.e_f);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.fuu);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g3e);
        android.view.View c76 = c7();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.jf9);
        ((android.widget.TextView) c7().findViewById(com.tencent.mm.R.id.qci)).setVisibility(8);
        ((android.widget.TextView) a7().findViewById(com.tencent.mm.R.id.qci)).setVisibility(8);
        ((android.widget.TextView) c7().findViewById(com.tencent.mm.R.id.qch)).setVisibility(8);
        ((android.widget.TextView) a7().findViewById(com.tencent.mm.R.id.qch)).setVisibility(8);
        ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().S()).d(xy2.c.e(getActivity()), zy2.y8.f477622r);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c76, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButRevingUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c76.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButRevingUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c76.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.d20(this));
        if (f7() == 1) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            view3 = findViewById;
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButRevingUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButRevingUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            view3 = findViewById;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButRevingUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButRevingUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        view3.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.e20(this));
        r45.lk2 lk2Var = this.f134339e;
        java.lang.String str2 = "";
        r45.nk2 nk2Var = null;
        if (lk2Var != null && (list = lk2Var.getList(20)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.ac5) obj).getCustom(1);
                if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, this.f134338d)) {
                    break;
                }
            }
            r45.ac5 ac5Var = (r45.ac5) obj;
            if (ac5Var != null) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) ac5Var.getCustom(1);
                str = finderContact2 != null ? finderContact2.getNickname() : null;
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    r45.nk2 nk2Var2 = (r45.nk2) ac5Var.getCustom(0);
                    java.lang.String string2 = nk2Var2 != null ? nk2Var2.getString(4) : null;
                    str = string2 == null ? "" : string2;
                }
                nk2Var = (r45.nk2) ac5Var.getCustom(0);
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d a17 = g1Var.a();
                if (nk2Var != null && (string = nk2Var.getString(5)) != null) {
                    str2 = string;
                }
                mn2.n nVar = new mn2.n(str2, com.tencent.mm.plugin.finder.storage.y90.V);
                kotlin.jvm.internal.o.d(imageView);
                a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, str));
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                textView2.setVisibility(0);
                textView2.setText(getResources().getString(com.tencent.mm.R.string.f3m));
                findViewById(com.tencent.mm.R.id.e7m).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.f20(this));
                if (getIntent().getBooleanExtra("key_from_sns_post", false) || this.f134339e == null) {
                }
                findViewById(com.tencent.mm.R.id.e7m).post(new com.tencent.mm.plugin.finder.viewmodel.component.g20(this));
                getIntent().removeExtra("key_from_sns_post");
                return;
            }
        }
        str = "";
        mn2.g1 g1Var2 = mn2.g1.f329975a;
        vo0.d a172 = g1Var2.a();
        if (nk2Var != null) {
            str2 = string;
        }
        mn2.n nVar2 = new mn2.n(str2, com.tencent.mm.plugin.finder.storage.y90.V);
        kotlin.jvm.internal.o.d(imageView);
        a172.c(nVar2, imageView, g1Var2.h(mn2.f1.f329957h));
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        ((ke0.e) xVar2).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity2, str));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView2.setVisibility(0);
        textView2.setText(getResources().getString(com.tencent.mm.R.string.f3m));
        findViewById(com.tencent.mm.R.id.e7m).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.f20(this));
        if (getIntent().getBooleanExtra("key_from_sns_post", false)) {
        }
    }

    public final boolean T6() {
        com.tencent.mm.plugin.finder.storage.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
        Kj.getClass();
        java.util.List i17 = kz5.c0.i(100, 200);
        p75.n0 n0Var = dm.a4.B;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m c17 = dm.a4.H.i(1).c(dm.a4.G.r(i17));
        p75.i0 g17 = dm.a4.B.g(linkedList);
        g17.f352657d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        java.util.ArrayList arrayList = (java.util.ArrayList) g17.a().k(Kj.f128069d, qb2.t.class);
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            qb2.t tVar = (qb2.t) next;
            com.tencent.mars.xlog.Log.i("Finder.ConversationStorage", "getConvCountByScene, index: " + i18 + ", nickname: " + tVar.F1 + ", type: " + tVar.field_type);
            i18 = i19;
        }
        int size = arrayList.size();
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_PRIVATE_SYS_MSG_TIME_INT_SYNC, 0);
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "canShowWxPrivateMsgLayout, count: " + size);
        return size > 0 || r17 > 0;
    }

    public final void U6() {
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484956g20);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.imd);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.hpq);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.hpo);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "checkTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void V6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.account.component.l lVar = (com.tencent.mm.plugin.finder.account.component.l) ((zy2.o5) pf5.z.f353948a.a(activity).c(zy2.o5.class));
        g92.b.f269769e.P0("", "needResetClear");
        lVar.f101719q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6() {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.f50.W6():void");
    }

    public void X6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127627bh).getValue()).r()).booleanValue()) {
            com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = (com.tencent.mm.plugin.finder.viewmodel.component.h00) ((jz5.n) this.D).getValue();
            kotlin.jvm.internal.o.f(h00Var, "<get-oftenReadAuthorUIC>(...)");
            h00Var.R6(com.tencent.mm.plugin.finder.viewmodel.component.oz.f135490d);
        }
        pf5.e.launchUI$default(this, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.j20(this, null), 3, null);
    }

    public final java.lang.String Y6(java.lang.String str) {
        return hc2.x0.d(str, 1, findViewById(com.tencent.mm.R.id.cmi).getVisibility() == 0, ((android.widget.TextView) findViewById(com.tencent.mm.R.id.cmm)).getText().toString());
    }

    public final int Z6() {
        if (s92.c.f404992a.a(null, 5)) {
            return 9;
        }
        if (this.U) {
            return 4;
        }
        return this.V ? 15 : 3;
    }

    public final android.view.View a7() {
        return (android.view.View) ((jz5.n) this.A).getValue();
    }

    public final java.lang.String b7(r45.f03 f03Var) {
        java.lang.String str;
        m92.b j37 = g92.a.j3(g92.b.f269769e, this.f134338d, false, 2, null);
        int i17 = j37 != null ? j37.field_systemMsgCount : 0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i18 = f03Var != null ? f03Var.f373888e : 0 - i17;
        if (i18 < 0) {
            i18 = 0;
        }
        jSONObject.put("personalCnt", i18);
        jSONObject.put("finderteamCnt", i17);
        jSONObject.put("totalCnt", f03Var != null ? f03Var.f373888e : 0);
        java.lang.String str2 = f03Var != null ? f03Var.f373889f : null;
        if (!(str2 == null || str2.length() == 0)) {
            if (f03Var == null || (str = f03Var.f373889f) == null) {
                str = "";
            }
            jSONObject.put("reddot_title", str);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    public final android.view.View c7() {
        return (android.view.View) ((jz5.n) this.B).getValue();
    }

    public final android.view.View d7() {
        return (android.view.View) ((jz5.n) this.C).getValue();
    }

    public final zy2.m8 e7() {
        return (zy2.m8) ((jz5.n) this.f134349p0).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f7() {
        /*
            r6 = this;
            r45.lk2 r0 = r6.f134339e
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L43
            r3 = 20
            java.util.LinkedList r0 = r0.getList(r3)
            if (r0 == 0) goto L43
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r0.next()
            r4 = r3
            r45.ac5 r4 = (r45.ac5) r4
            r5 = 1
            com.tencent.mm.protobuf.f r4 = r4.getCustom(r5)
            com.tencent.mm.protocal.protobuf.FinderContact r4 = (com.tencent.mm.protocal.protobuf.FinderContact) r4
            if (r4 == 0) goto L2d
            java.lang.String r4 = r4.getUsername()
            goto L2e
        L2d:
            r4 = r1
        L2e:
            java.lang.String r5 = r6.f134338d
            boolean r4 = kotlin.jvm.internal.o.b(r4, r5)
            if (r4 == 0) goto L12
            goto L38
        L37:
            r3 = r1
        L38:
            r45.ac5 r3 = (r45.ac5) r3
            if (r3 == 0) goto L43
            r0 = 35
            int r0 = r3.getInteger(r0)
            goto L44
        L43:
            r0 = r2
        L44:
            if (r0 != r2) goto L5e
            g92.b r0 = g92.b.f269769e
            java.lang.String r3 = r6.f134338d
            r4 = 0
            r5 = 2
            m92.b r0 = g92.a.j3(r0, r3, r4, r5, r1)
            if (r0 == 0) goto L5d
            r45.nc4 r0 = r0.u0()
            r1 = 34
            int r0 = r0.getInteger(r1)
            goto L5e
        L5d:
            r0 = r2
        L5e:
            com.tencent.mm.plugin.finder.storage.t70 r1 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            lb2.j r3 = r1.f2()
            java.lang.Object r3 = r3.r()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == r2) goto L7e
            lb2.j r0 = r1.f2()
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.f50.f7():int");
    }

    public final android.view.View g7() {
        return (android.view.View) ((jz5.n) this.f134356v).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b8x;
    }

    public final long h7() {
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("finder_wx_private_msg_entrance") != null) {
            return r0.f373888e;
        }
        return 0L;
    }

    public final android.view.View i7() {
        return (android.view.View) ((jz5.n) this.f134361y).getValue();
    }

    @Override // ya2.x1
    public void j7(r45.hx0 cmdItem, int i17, int i18) {
        kotlin.jvm.internal.o.g(cmdItem, "cmdItem");
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "cmdId " + cmdItem.getInteger(0));
        if (cmdItem.getInteger(0) == 111) {
            q7(false);
        }
    }

    public final android.view.View k7() {
        return (android.view.View) ((jz5.n) this.f134363z).getValue();
    }

    public final void l7() {
        java.lang.String wording;
        g92.b bVar = g92.b.f269769e;
        boolean z17 = false;
        m92.b j37 = g92.a.j3(bVar, this.f134338d, false, 2, null);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = j37 != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) j37.u0().getCustom(46) : null;
        boolean z18 = pm0.v.z(A1, 1);
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(getContext()));
        long j17 = b17 != null ? b17.field_liveSwitchFlag : 0L;
        ((b92.d1) zbVar).getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean z19 = pm0.v.z((int) j17, 1);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.i_u);
        boolean vk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk();
        i95.m c17 = i95.n0.c(l40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int dh6 = l40.e.dh((l40.e) c17, getContext(), null, 2, null);
        m92.b j38 = g92.a.j3(bVar, this.f134338d, false, 2, null);
        boolean w07 = j38 != null ? j38.w0() : false;
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "initLiveIncomeCell FinderLive.entrance,xLab enable live:" + ae2.in.f3688a.t() + ", hasAccount:" + vk6 + ", server flag:" + A1 + ", server enable live:" + z18 + " rewardGainEnable:" + z19 + "， accountState:" + dh6);
        if (isTeenMode || w07 || (vk6 && (dh6 == 3 || dh6 == 6))) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initLiveRewardGainCell", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initLiveRewardGainCell", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initLiveRewardGainCell", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initLiveRewardGainCell", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (finderJumpInfo != null && (wording = finderJumpInfo.getWording()) != null) {
            if (wording.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            ((android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.i_w)).setText(finderJumpInfo.getWording());
        }
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.q20(this, finderJumpInfo));
        pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.Q, getActivity(), new com.tencent.mm.plugin.finder.viewmodel.component.r20(this));
    }

    public final void m7(boolean z17) {
        boolean z18;
        r45.p85 p85Var;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127948t8).getValue()).r()).intValue() == 0) {
            return;
        }
        android.view.View g76 = g7();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g76, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initMergeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z19 = false;
        g76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(g76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initMergeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = (android.view.View) ((jz5.n) this.f134358x).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initMergeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initMergeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jz5.g gVar = this.f134357w;
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initMergeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initMergeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            z18 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, false);
        } else {
            r45.lk2 lk2Var = this.f134339e;
            if (lk2Var != null && (p85Var = (r45.p85) lk2Var.getCustom(34)) != null && p85Var.getInteger(0) == 1) {
                z19 = true;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z19));
            z18 = z19;
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.tr6)).setText(z18 ? getContext().getResources().getString(com.tencent.mm.R.string.o1e) : getContext().getResources().getString(com.tencent.mm.R.string.f491931lw1));
        android.view.View view3 = (android.view.View) ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(view3, "<get-selfAggregationLayout>(...)");
        hc2.v0.e(view3, "like_collect_recently_browse", 0, 29309, false, true, null, null, 106, null);
        ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.s20(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n7() {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.f50.n7():void");
    }

    public final void o7() {
        r45.ac5 ac5Var;
        java.lang.Object m521constructorimpl;
        boolean z17;
        java.lang.String str;
        boolean z18;
        r45.k74 lite_app_info;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        byte[] protobuf;
        java.lang.Object m521constructorimpl2;
        java.util.LinkedList list;
        java.lang.Object obj;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.fwm);
        if (this.T) {
            com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "initPosterEntrance isUserLimit=true hide view");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initPosterEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initPosterEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.lk2 lk2Var = this.f134339e;
        if (lk2Var == null || (list = lk2Var.getList(20)) == null) {
            ac5Var = null;
        } else {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.ac5) obj).getCustom(1);
                if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, this.f134338d)) {
                    break;
                }
            }
            ac5Var = (r45.ac5) obj;
        }
        if (this.f134339e != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = ac5Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ac5Var.getCustom(56) : null;
            if (!(finderJumpInfo2 != null && finderJumpInfo2.compareContent(this.X))) {
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c17).f221226g.f242285b;
                if (finderJumpInfo2 != null) {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        m521constructorimpl2 = kotlin.Result.m521constructorimpl(finderJumpInfo2.toProtobuf());
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                    java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl2);
                    if (m524exceptionOrNullimpl != null) {
                        com.tencent.mars.xlog.Log.e("Finder.FinderMMKVManager", "saveSelfCreatorCenterJumpInfo: " + m524exceptionOrNullimpl.getMessage());
                    }
                    if (kotlin.Result.m527isFailureimpl(m521constructorimpl2)) {
                        m521constructorimpl2 = null;
                    }
                    byte[] bArr = (byte[]) m521constructorimpl2;
                    if (bArr == null) {
                        com.tencent.mars.xlog.Log.e("Finder.FinderMMKVManager", "saveSelfCreatorCenterJumpInfo: bytes is null");
                    } else if (o4Var != null) {
                        o4Var.H("kFinderSelfCreatorCenterJumpInfoKey", bArr);
                    }
                } else if (o4Var != null) {
                    o4Var.W("kFinderSelfCreatorCenterJumpInfoKey");
                }
                this.X = finderJumpInfo2;
            }
        }
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = this.X;
            if (finderJumpInfo3 == null || (protobuf = finderJumpInfo3.toProtobuf()) == null) {
                finderJumpInfo = null;
            } else {
                finderJumpInfo = com.tencent.mm.protocal.protobuf.FinderJumpInfo.create();
                finderJumpInfo.fromProtobuf(protobuf);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(finderJumpInfo);
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        java.lang.Throwable m524exceptionOrNullimpl2 = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl2 != null) {
            com.tencent.mars.xlog.Log.e("Finder.SelfUIC", "copy creatorCenterJumpInfo error:" + m524exceptionOrNullimpl2.getMessage());
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo4 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) m521constructorimpl;
        java.lang.String string = (finderJumpInfo4 == null || (lite_app_info = finderJumpInfo4.getLite_app_info()) == null) ? null : lite_app_info.getString(0);
        if (string == null || string.length() == 0) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.Y3;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 2) {
                str = "https://channels.weixin.qq.com/mobile/creator_center.html";
                z17 = true;
            } else {
                z17 = true;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 1) {
                    str = "https://channels.weixin.qq.com/mobile-support/pages/creator/center";
                } else {
                    if (ac5Var == null || (str = ac5Var.getString(8)) == null) {
                        str = this.W;
                    }
                    kotlin.jvm.internal.o.d(str);
                }
            }
            if (str.length() > 0 ? z17 : false) {
                com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "initPosterEntrance use h5");
                if (!kotlin.jvm.internal.o.b(this.W, str)) {
                    i95.m c18 = i95.n0.c(cq.k.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    dq.b bVar = ((cq.k) c18).f221226g;
                    bVar.getClass();
                    boolean N = r26.n0.N(str);
                    com.tencent.mm.sdk.platformtools.o4 o4Var2 = bVar.f242285b;
                    if (N) {
                        if (o4Var2 != null) {
                            o4Var2.W("kFinderSelfCreatorCenterUrlKey");
                        }
                    } else if (o4Var2 != null) {
                        o4Var2.D("kFinderSelfCreatorCenterUrlKey", str);
                    }
                    this.W = str;
                }
                findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.z20(this, str));
                z18 = z17;
            } else {
                z18 = false;
            }
        } else {
            com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "initPosterEntrance use liteApp");
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.y20(finderJumpInfo4, this));
            z18 = true;
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.e("Finder.SelfUIC", "initPosterEntrance view gone");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initPosterEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initPosterEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        kotlin.jvm.internal.o.d(findViewById);
        com.tencent.mm.plugin.finder.report.d2.m(d2Var, findViewById, "creator_center", 0, 0, null, null, 60, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initPosterEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initPosterEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        s7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        boolean z18 = false;
        int intExtra = intent != null ? intent.getIntExtra("INNER_ITEM_COUNT", 0) : 0;
        boolean z19 = true;
        if (i17 == 1) {
            r45.lk2 lk2Var = this.f134339e;
            z19 = lk2Var != null && lk2Var.getInteger(9) == intExtra;
            z17 = true;
        } else if (i17 != 2) {
            if (i17 == 3) {
                m7(true);
            } else if (i17 == 31121) {
                z17 = true;
                z18 = true;
            }
            z17 = true;
        } else {
            r45.lk2 lk2Var2 = this.f134339e;
            if (lk2Var2 == null || lk2Var2.getInteger(8) != intExtra) {
                z17 = false;
            }
            z17 = true;
        }
        if (z19 && z17 && !z18) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "ifFavCountEquals = " + z19 + ",ifLikeCountEquals = " + z17 + ", isAccComplete=" + z18);
        X6();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0408  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r48) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.f50.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(101, this);
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(111, this);
        int i17 = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.a(xy2.c.e(getContext()))[3];
        m92.b j37 = g92.a.j3(g92.b.f269769e, this.f134338d, false, 2, null);
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "onDestroy : " + (i17 + (j37 != null ? j37.field_fansAddCount : 0)));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_MIX_CELL_TIPS_SHOWN_BOOLEAN, java.lang.Boolean.TRUE);
        ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) i95.n0.c(c61.l7.class)).nk().S()).h(xy2.c.e(getContext()), zy2.y8.f477624t);
        vb0.m mVar = (vb0.m) i95.n0.c(vb0.m.class);
        java.lang.String key = java.lang.String.valueOf(hashCode());
        ((i90.a) mVar).getClass();
        kotlin.jvm.internal.o.g(key, "key");
        yr0.c.f464626a.c(key);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.f50.onResume():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        this.H = false;
        this.I = false;
        this.f134337J = "";
        this.K = "";
        this.L = "";
        this.M = "";
        this.N = "";
        this.P = "";
        this.S = "";
        this.R = "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean p7() {
        r45.bc5 bc5Var;
        int i17;
        int i18;
        android.widget.TextView textView;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485211gx2);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f486142kc1);
        i95.m c17 = i95.n0.c(l40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int dh6 = l40.e.dh((l40.e) c17, getContext(), null, 2, null);
        mn2.g1 g1Var = mn2.g1.f329975a;
        switch (dh6) {
            case 1:
                kotlin.jvm.internal.o.d(findViewById);
                kotlin.jvm.internal.o.d(findViewById2);
                boolean a17 = hc2.j.a(g92.b.f269769e.k2());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "noPostQualityUI", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "noPostQualityUI", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "noPostQualityUI", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "noPostQualityUI", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (!a17) {
                    return false;
                }
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127927s5).getValue()).r()).intValue() != 0) {
                    return false;
                }
                ((android.widget.TextView) findViewById2).setText(getActivity().getString(com.tencent.mm.R.string.etc));
                return false;
            case 2:
                kotlin.jvm.internal.o.d(findViewById);
                kotlin.jvm.internal.o.d(findViewById2);
                boolean a18 = hc2.j.a(g92.b.f269769e.k2());
                r45.lk2 lk2Var = this.f134339e;
                if (lk2Var != null) {
                }
                r45.lk2 lk2Var2 = this.f134339e;
                if (lk2Var2 != null && (bc5Var = (r45.bc5) lk2Var2.getCustom(38)) != null) {
                    bc5Var.getInteger(0);
                }
                if (a18) {
                    com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127927s5).getValue()).r()).intValue() == 0) {
                        r45.lk2 lk2Var3 = this.f134339e;
                        if ((lk2Var3 != null ? (r45.bc5) lk2Var3.getCustom(38) : null) == null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList3.add(0);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            arrayList4.add(8);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            ((android.widget.TextView) findViewById2).setText(getActivity().getString(com.tencent.mm.R.string.etc));
                            return false;
                        }
                    }
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().S()).d(xy2.c.e(getActivity()), zy2.y8.f477622r);
                android.view.View c76 = c7();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(c76, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c76.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(c76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.jf9);
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(findViewById3, arrayList8.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.e7m);
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(findViewById4, arrayList9.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View d76 = d7();
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(8);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(d76, arrayList10.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                d76.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(d76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.fwm);
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(findViewById5, arrayList11.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "canPostButNoAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                boolean booleanExtra = getIntent().getBooleanExtra("key_from_sns_post", false);
                boolean z17 = (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLCamera") == null || ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLCamera") == null || !((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) ? false : true;
                android.view.View view = this.f134341g;
                if (view == null) {
                    kotlin.jvm.internal.o.o("finderPosBtn");
                    throw null;
                }
                view.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.x10(this, z17, booleanExtra));
                android.view.View view2 = this.f134341g;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("finderPosBtn");
                    throw null;
                }
                ym5.a1.h(view2, new com.tencent.mm.plugin.finder.viewmodel.component.y10(this, z17));
                if (booleanExtra && this.f134339e != null) {
                    android.view.View view3 = this.f134341g;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("finderPosBtn");
                        throw null;
                    }
                    view3.post(new com.tencent.mm.plugin.finder.viewmodel.component.z10(this));
                    getIntent().removeExtra("key_from_sns_post");
                }
                pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.f105361e, getActivity(), this.f134344l1);
                u7(true);
                pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.H, getActivity(), new com.tencent.mm.plugin.finder.viewmodel.component.c20(this));
                return false;
            case 3:
            case 6:
                kotlin.jvm.internal.o.d(findViewById);
                kotlin.jvm.internal.o.d(findViewById2);
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLCamera");
                if (L0 != null && L0.getType() == 1002) {
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLCamera");
                }
                pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.f105361e, getActivity(), this.f134350p1);
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList12.add(8);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(findViewById2, arrayList12.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(0);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(findViewById, arrayList13.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.e7m);
                android.view.View c77 = c7();
                android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.e_f);
                android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.fuu);
                ya2.g gVar = ya2.h.f460484a;
                java.lang.String str = this.f134338d;
                kotlin.jvm.internal.o.d(str);
                ya2.b2 b17 = gVar.b(str);
                android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483299a85);
                android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.jf9);
                g92.b bVar = g92.b.f269769e;
                m92.b j37 = g92.a.j3(bVar, this.f134338d, false, 2, null);
                r45.gx0 gx0Var = j37 != null ? (r45.gx0) j37.u0().getCustom(29) : null;
                if (this.Z && (gx0Var == null || gx0Var.getInteger(0) == 1)) {
                    android.view.View d77 = d7();
                    java.util.ArrayList arrayList14 = new java.util.ArrayList();
                    arrayList14.add(0);
                    java.util.Collections.reverse(arrayList14);
                    yj0.a.d(d77, arrayList14.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    d77.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                    yj0.a.f(d77, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    A7();
                } else {
                    android.view.View d78 = d7();
                    java.util.ArrayList arrayList15 = new java.util.ArrayList();
                    arrayList15.add(8);
                    java.util.Collections.reverse(arrayList15);
                    yj0.a.d(d78, arrayList15.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    d78.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                    yj0.a.f(d78, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (b17 != null) {
                    vo0.d a19 = g1Var.a();
                    mn2.n nVar = new mn2.n(b17.y0(), com.tencent.mm.plugin.finder.storage.y90.V);
                    kotlin.jvm.internal.o.d(imageView);
                    a19.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    java.lang.String z07 = b17.z0();
                    ((ke0.e) xVar).getClass();
                    textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, z07));
                    com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    ya2.m1 m1Var = ya2.m1.f460511a;
                    kotlin.jvm.internal.o.d(imageView2);
                    zy2.tb.a(m1Var, imageView2, b17.field_authInfo, 0, 4, null);
                    com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = b17.field_authInfo;
                    int authIconType = finderAuthInfo != null ? finderAuthInfo.getAuthIconType() : 0;
                    m92.b j38 = g92.a.j3(bVar, this.f134338d, false, 2, null);
                    int integer = j38 != null ? j38.u0().getInteger(20) : 0;
                    if (integer > 0) {
                        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.egm);
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            textView3.setText(getActivity().getResources().getString(com.tencent.mm.R.string.cue, java.lang.String.valueOf(integer)));
                        }
                    } else {
                        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.egm);
                        java.util.ArrayList arrayList16 = new java.util.ArrayList();
                        arrayList16.add(8);
                        java.util.Collections.reverse(arrayList16);
                        yj0.a.d(findViewById8, arrayList16.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById8.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                        yj0.a.f(findViewById8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    textView2.post(new com.tencent.mm.plugin.finder.viewmodel.component.h40(this, textView2, imageView2));
                    i18 = integer;
                    i17 = authIconType;
                } else {
                    i17 = 0;
                    i18 = 0;
                }
                java.util.ArrayList arrayList17 = new java.util.ArrayList();
                arrayList17.add(0);
                java.util.Collections.reverse(arrayList17);
                int i19 = i17;
                int i27 = i18;
                yj0.a.d(findViewById6, arrayList17.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
                yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList18 = new java.util.ArrayList();
                arrayList18.add(0);
                java.util.Collections.reverse(arrayList18);
                yj0.a.d(c77, arrayList18.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c77.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
                yj0.a.f(c77, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (f7() == 1) {
                    java.util.ArrayList arrayList19 = new java.util.ArrayList();
                    arrayList19.add(0);
                    java.util.Collections.reverse(arrayList19);
                    yj0.a.d(findViewById7, arrayList19.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById7.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                    yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.ArrayList arrayList20 = new java.util.ArrayList();
                    arrayList20.add(8);
                    java.util.Collections.reverse(arrayList20);
                    yj0.a.d(findViewById7, arrayList20.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById7.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                    yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                int[] a27 = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.a(xy2.c.e(getContext()));
                com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "redDot check likeCount :" + a27[0] + " commentCount " + a27[1] + " followCount " + a27[2] + ' ');
                com.tencent.mm.plugin.finder.viewmodel.component.l40 l40Var = new com.tencent.mm.plugin.finder.viewmodel.component.l40(this);
                findViewById6.setTag(com.tencent.mm.R.id.m7g, l40Var);
                findViewById6.setOnClickListener(l40Var);
                com.tencent.mm.plugin.finder.viewmodel.component.m40 m40Var = new com.tencent.mm.plugin.finder.viewmodel.component.m40(this);
                c77.setTag(com.tencent.mm.R.id.m7g, m40Var);
                c77.setOnClickListener(m40Var);
                m92.b j39 = g92.a.j3(bVar, this.f134338d, false, 2, null);
                boolean w07 = j39 != null ? j39.w0() : false;
                boolean z18 = (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLCamera") == null || ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLCamera") == null || !((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) ? false : true;
                com.tencent.mm.plugin.finder.viewmodel.component.n40 n40Var = new com.tencent.mm.plugin.finder.viewmodel.component.n40(this, z18, w07);
                android.view.View view4 = this.f134341g;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("finderPosBtn");
                    throw null;
                }
                ym5.a1.h(view4, new com.tencent.mm.plugin.finder.viewmodel.component.i40(this, z18, w07));
                android.view.View view5 = this.f134341g;
                if (view5 == null) {
                    kotlin.jvm.internal.o.o("finderPosBtn");
                    throw null;
                }
                view5.setTag(com.tencent.mm.R.id.m7g, n40Var);
                android.view.View view6 = this.f134341g;
                if (view6 == null) {
                    kotlin.jvm.internal.o.o("finderPosBtn");
                    throw null;
                }
                view6.setOnClickListener(n40Var);
                android.view.View view7 = this.f134341g;
                if (view7 == null) {
                    kotlin.jvm.internal.o.o("finderPosBtn");
                    throw null;
                }
                java.util.ArrayList arrayList21 = new java.util.ArrayList();
                arrayList21.add(0);
                java.util.Collections.reverse(arrayList21);
                yj0.a.d(view7, arrayList21.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                u7(true);
                if (getIntent().getBooleanExtra("key_from_sns_post", false)) {
                    android.view.View view8 = this.f134341g;
                    if (view8 == null) {
                        kotlin.jvm.internal.o.o("finderPosBtn");
                        throw null;
                    }
                    view8.post(new com.tencent.mm.plugin.finder.viewmodel.component.j40(this));
                    getIntent().removeExtra("key_from_sns_post");
                }
                java.lang.String str2 = this.f134338d;
                if (str2 != null) {
                    android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g29);
                    m92.i X4 = bVar.X4(str2);
                    if (X4 != null) {
                        if (X4.f324987a == 1) {
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
                            int childCount = linearLayout.getChildCount();
                            for (int i28 = 0; i28 < childCount; i28++) {
                                android.view.View childAt = linearLayout.getChildAt(i28);
                                if (childAt != null) {
                                    int id6 = childAt.getId();
                                    if (id6 == com.tencent.mm.R.id.e7m) {
                                        java.util.ArrayList arrayList22 = new java.util.ArrayList();
                                        arrayList22.add(0);
                                        java.util.Collections.reverse(arrayList22);
                                        yj0.a.d(childAt, arrayList22.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        childAt.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                                        yj0.a.f(childAt, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    } else if (id6 == com.tencent.mm.R.id.f486363l05) {
                                        java.util.ArrayList arrayList23 = new java.util.ArrayList();
                                        arrayList23.add(8);
                                        java.util.Collections.reverse(arrayList23);
                                        yj0.a.d(childAt, arrayList23.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        childAt.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
                                        yj0.a.f(childAt, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "normalOrAbNomalUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    } else {
                                        childAt.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.k40(this));
                                    }
                                }
                            }
                            textView4.setVisibility(0);
                            textView4.setText(getActivity().getString(com.tencent.mm.R.string.cho));
                        } else {
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) findViewById;
                            int childCount2 = linearLayout2.getChildCount();
                            for (int i29 = 0; i29 < childCount2; i29++) {
                                android.view.View childAt2 = linearLayout2.getChildAt(i29);
                                if (childAt2 != null) {
                                    java.lang.Object tag = childAt2.getTag(com.tencent.mm.R.id.m7g);
                                    android.view.View.OnClickListener onClickListener = tag instanceof android.view.View.OnClickListener ? (android.view.View.OnClickListener) tag : null;
                                    if (onClickListener != null) {
                                        childAt2.setOnClickListener(onClickListener);
                                    }
                                }
                            }
                            textView4.setText("");
                            textView4.setVisibility(8);
                        }
                    }
                }
                android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.e7m);
                if (findViewById9 != null) {
                    findViewById9.setTag(com.tencent.mm.R.id.e79, textView2.getText());
                    findViewById9.setTag(com.tencent.mm.R.id.e5t, java.lang.Integer.valueOf(i27));
                    findViewById9.setTag(com.tencent.mm.R.id.e5i, java.lang.Integer.valueOf(i19));
                }
                return true;
            case 4:
                kotlin.jvm.internal.o.d(findViewById);
                kotlin.jvm.internal.o.d(findViewById2);
                m92.b j310 = g92.a.j3(g92.b.f269769e, this.f134338d, false, 2, null);
                r45.nc4 u07 = j310 != null ? j310.u0() : null;
                if (u07 != null && (finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) u07.getCustom(45)) != null) {
                    finderJumpInfo2.getWording();
                }
                if (u07 != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) u07.getCustom(46)) != null) {
                    finderJumpInfo.getWording();
                }
                ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().S()).d(xy2.c.e(getActivity()), zy2.y8.f477622r);
                java.util.ArrayList arrayList24 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList24.add(8);
                java.util.Collections.reverse(arrayList24);
                yj0.a.d(findViewById2, arrayList24.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList25 = new java.util.ArrayList();
                arrayList25.add(0);
                java.util.Collections.reverse(arrayList25);
                r45.nc4 nc4Var = u07;
                yj0.a.d(findViewById, arrayList25.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View c78 = c7();
                java.util.ArrayList arrayList26 = new java.util.ArrayList();
                arrayList26.add(8);
                java.util.Collections.reverse(arrayList26);
                yj0.a.d(c78, arrayList26.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c78.setVisibility(((java.lang.Integer) arrayList26.get(0)).intValue());
                yj0.a.f(c78, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.jf9);
                java.util.ArrayList arrayList27 = new java.util.ArrayList();
                arrayList27.add(8);
                java.util.Collections.reverse(arrayList27);
                yj0.a.d(findViewById10, arrayList27.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById10.setVisibility(((java.lang.Integer) arrayList27.get(0)).intValue());
                yj0.a.f(findViewById10, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.fwm);
                java.util.ArrayList arrayList28 = new java.util.ArrayList();
                arrayList28.add(8);
                java.util.Collections.reverse(arrayList28);
                yj0.a.d(findViewById11, arrayList28.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById11.setVisibility(((java.lang.Integer) arrayList28.get(0)).intValue());
                yj0.a.f(findViewById11, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view9 = this.f134341g;
                if (view9 == null) {
                    kotlin.jvm.internal.o.o("finderPosBtn");
                    throw null;
                }
                java.util.ArrayList arrayList29 = new java.util.ArrayList();
                arrayList29.add(8);
                java.util.Collections.reverse(arrayList29);
                yj0.a.d(view9, arrayList29.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList29.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                u7(false);
                vo0.d a28 = g1Var.a();
                mn2.n nVar2 = new mn2.n("", null, 2, null);
                android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.e_f);
                kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
                a28.c(nVar2, (android.widget.ImageView) findViewById12, g1Var.h(mn2.f1.f329957h));
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.fuu)).setText(getResources().getString(com.tencent.mm.R.string.chi));
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = nc4Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) nc4Var.getCustom(45) : null;
                java.lang.String wording = finderJumpInfo3 != null ? finderJumpInfo3.getWording() : null;
                if (!(wording == null || wording.length() == 0) && (textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g3e)) != null) {
                    textView.setText(finderJumpInfo3 != null ? finderJumpInfo3.getWording() : null);
                    textView.setVisibility(0);
                }
                findViewById(com.tencent.mm.R.id.e7m).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.u10(this, finderJumpInfo3));
                if (getIntent().getBooleanExtra("key_from_sns_post", false)) {
                    findViewById(com.tencent.mm.R.id.e7m).post(new com.tencent.mm.plugin.finder.viewmodel.component.v10(this));
                    getIntent().removeExtra("key_from_sns_post");
                }
                android.view.View d79 = d7();
                java.util.ArrayList arrayList30 = new java.util.ArrayList();
                arrayList30.add(8);
                java.util.Collections.reverse(arrayList30);
                yj0.a.d(d79, arrayList30.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                d79.setVisibility(((java.lang.Integer) arrayList30.get(0)).intValue());
                yj0.a.f(d79, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "accountAbnormal", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return false;
            case 5:
                kotlin.jvm.internal.o.d(findViewById);
                kotlin.jvm.internal.o.d(findViewById2);
                S6(findViewById, findViewById2);
                return false;
            default:
                return false;
        }
    }

    public final void q7(boolean z17) {
        boolean z18;
        r45.p85 p85Var;
        boolean p76;
        java.lang.String str;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        r45.p85 p85Var2;
        java.lang.String e17 = xy2.c.e(getContext());
        this.f134338d = e17;
        g92.b bVar = g92.b.f269769e;
        m92.b j37 = g92.a.j3(bVar, e17, false, 2, null);
        this.T = j37 != null ? j37.v0() : false;
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "myFinderUser " + this.f134338d);
        n7();
        l7();
        o7();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context).addTextOptionMenu(0, getContext().getResources().getString(com.tencent.mm.R.string.mat), new com.tencent.mm.plugin.finder.viewmodel.component.x40(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.rax);
        int i17 = 8;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hpq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setSettingStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setSettingStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            z18 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, false);
        } else {
            r45.lk2 lk2Var = this.f134339e;
            z18 = (lk2Var == null || (p85Var = (r45.p85) lk2Var.getCustom(34)) == null || p85Var.getInteger(0) != 1) ? false : true;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z18));
        }
        if (z18) {
            android.view.View g76 = g7();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(g76, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initHistoryView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(g76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initHistoryView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View g77 = g7();
            kotlin.jvm.internal.o.f(g77, "<get-selfHistoryLayout>(...)");
            hc2.v0.e(g77, "recently_browse", 0, 29309, false, true, null, null, 106, null);
            g7().setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.p20(this));
        } else {
            android.view.View g78 = g7();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(g78, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initHistoryView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g78.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(g78, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "initHistoryView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        m7(z17);
        x7();
        z7();
        y7();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.account.component.c cVar = (com.tencent.mm.plugin.finder.account.component.c) ((zy2.n5) zVar.a(activity).c(zy2.n5.class));
        m92.b j38 = g92.a.j3(bVar, xy2.c.e(cVar.getContext()), false, 2, null);
        boolean v07 = j38 != null ? j38.v0() : false;
        android.view.View findViewById2 = cVar.findViewById(com.tencent.mm.R.id.e7o);
        if (findViewById2 != null) {
            int i18 = v07 ? 0 : 8;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC", "initAccCompleteTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/account/component/FinderAccCompleteTipsUIC", "initAccCompleteTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.account.component.a(cVar));
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.iz izVar = (com.tencent.mm.plugin.finder.viewmodel.component.iz) zVar.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.iz.class);
        r45.lk2 lk2Var2 = this.f134339e;
        int integer = (lk2Var2 == null || (p85Var2 = (r45.p85) lk2Var2.getCustom(34)) == null) ? 0 : p85Var2.getInteger(1);
        izVar.getClass();
        ot5.g.c(pf5.o.TAG, "fromResume " + z17 + " svrSwitch " + integer);
        if (z17) {
            integer = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_CONTINUE_WATCH_INT_SYNC, 0);
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_CONTINUE_WATCH_INT_SYNC, java.lang.Integer.valueOf(integer));
        }
        izVar.f134779o = integer;
        if (integer == 0) {
            java.util.ArrayList arrayList5 = izVar.f134774g;
            if (!arrayList5.isEmpty()) {
                arrayList5.clear();
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = izVar.f134775h;
                if (wxRecyclerAdapter == null) {
                    kotlin.jvm.internal.o.o("continueWatchAdapter");
                    throw null;
                }
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }
        if (izVar.f134779o == 1 && (!izVar.f134780p || z17)) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127930s8).getValue()).r()).booleanValue() && !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                izVar.f134780p = true;
                android.app.Activity context2 = izVar.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                pq5.g l17 = new db2.p0(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5), null).l();
                l17.I(izVar.getActivity());
                pm0.v.T(l17, new com.tencent.mm.plugin.finder.viewmodel.component.cz(izVar));
            }
        }
        izVar.O6();
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f485211gx2);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f486142kc1);
        r45.lk2 lk2Var3 = this.f134339e;
        if ((lk2Var3 == null || (list2 = lk2Var3.getList(23)) == null || !(list2.isEmpty() ^ true)) ? false : true) {
            kotlin.jvm.internal.o.d(findViewById3);
            kotlin.jvm.internal.o.d(findViewById4);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById3, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.e_f);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.fuu);
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g29);
            android.view.View c76 = c7();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(c76, arrayList8.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c76.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(c76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view = this.f134341g;
            if (view == null) {
                kotlin.jvm.internal.o.o("finderPosBtn");
                throw null;
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            u7(false);
            android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.fwm);
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(findViewById5, arrayList10.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View d76 = d7();
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(d76, arrayList11.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d76.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(d76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.e7x);
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(findViewById6, arrayList12.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f486363l05);
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(8);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(findViewById7, arrayList13.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.i_u);
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(8);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(findViewById8, arrayList14.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(findViewById8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().S()).d(xy2.c.e(getActivity()), zy2.y8.f477622r);
            r45.lk2 lk2Var4 = this.f134339e;
            r45.cr6 cr6Var = (lk2Var4 == null || (list = lk2Var4.getList(23)) == null) ? null : (r45.cr6) kz5.n0.Z(list);
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            if (cr6Var == null || (str = cr6Var.getString(1)) == null) {
                str = "";
            }
            mn2.n nVar = new mn2.n(str, com.tencent.mm.plugin.finder.storage.y90.V);
            kotlin.jvm.internal.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            java.lang.String string = cr6Var != null ? cr6Var.getString(0) : null;
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity3, string));
            com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
            textView3.setVisibility(0);
            textView3.setText(getResources().getString(com.tencent.mm.R.string.f3j));
            int integer2 = cr6Var != null ? cr6Var.getInteger(2) : 0;
            if (integer2 > 0) {
                android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.egm);
                if (textView4 != null) {
                    textView4.setVisibility(0);
                    textView4.setText(getActivity().getResources().getString(com.tencent.mm.R.string.cue, java.lang.String.valueOf(integer2)));
                }
            } else {
                android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.egm);
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                arrayList15.add(8);
                java.util.Collections.reverse(arrayList15);
                yj0.a.d(findViewById9, arrayList15.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById9.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                yj0.a.f(findViewById9, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "needCompleteAccountUi", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.e7m);
            findViewById10.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.e40(cr6Var, this));
            com.tencent.mm.plugin.finder.report.d2.m(com.tencent.mm.plugin.finder.report.d2.f124994a, findViewById10, "open_complete_function", 0, 0, null, null, 60, null);
            p76 = false;
        } else {
            p76 = p7();
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.Pb;
        ((lb2.j) ((jz5.n) gVar).getValue()).l();
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) gVar).getValue()).r()).booleanValue()) {
            com.tencent.mm.plugin.finder.assist.k8 k8Var = com.tencent.mm.plugin.finder.assist.k8.f102328a;
            android.app.Activity context3 = getContext();
            java.lang.String selfUsername = xy2.c.e(getContext());
            com.tencent.mm.plugin.finder.viewmodel.component.q40 q40Var = new com.tencent.mm.plugin.finder.viewmodel.component.q40(this);
            kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
            pq5.g l18 = new db2.a4(selfUsername, 13).l();
            if (context3 != null) {
                l18.f((com.tencent.mm.ui.MMActivity) context3);
            }
            k8Var.a(l18, selfUsername, q40Var, null);
            r45.nw6 b17 = k8Var.b(selfUsername);
            this.f134360x1 = b17;
            if (b17 != null) {
                B7(b17);
            }
        }
        r45.lk2 lk2Var5 = this.f134339e;
        if (lk2Var5 != null) {
            android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.hpk);
            android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.hpi);
            if (lk2Var5.getInteger(8) > 0) {
                android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i1l);
                if (textView5 != null) {
                    textView5.setText(com.tencent.mm.plugin.finder.assist.w2.h(lk2Var5.getInteger(8)));
                    textView5.setVisibility(0);
                }
            } else {
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.i1l)).setVisibility(8);
            }
            if (lk2Var5.getInteger(9) > 0) {
                android.widget.TextView textView6 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dub);
                if (textView6 != null) {
                    textView6.setText(com.tencent.mm.plugin.finder.assist.w2.h(lk2Var5.getInteger(9)));
                    textView6.setVisibility(0);
                }
                t7(true);
            } else {
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.dub)).setVisibility(8);
                t7(false);
            }
            com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "likeCount = " + lk2Var5.getInteger(8) + ",favCount = " + lk2Var5.getInteger(9) + "，purchased_total_count=" + lk2Var5.getInteger(12));
            findViewById11.setTag(com.tencent.mm.R.id.f484408e61, java.lang.Integer.valueOf(lk2Var5.getInteger(8)));
            findViewById12.setTag(com.tencent.mm.R.id.e7i, java.lang.Integer.valueOf(lk2Var5.getInteger(9)));
        }
        r45.lk2 lk2Var6 = this.f134339e;
        int integer3 = lk2Var6 != null ? lk2Var6.getInteger(12) : gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_LIVE_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var7 = this.f134339e;
        int integer4 = lk2Var7 != null ? lk2Var7.getInteger(29) : gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_MEMBER_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var8 = this.f134339e;
        int integer5 = lk2Var8 != null ? lk2Var8.getInteger(33) : gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_COURSE_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var9 = this.f134339e;
        int integer6 = lk2Var9 != null ? lk2Var9.getInteger(35) : gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_COLLECTION_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var10 = this.f134339e;
        int integer7 = lk2Var10 != null ? lk2Var10.getInteger(36) : f134336z1;
        r45.lk2 lk2Var11 = this.f134339e;
        if (lk2Var11 != null) {
            f134336z1 = lk2Var11.getInteger(36);
            f134335y1 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) lk2Var11.getCustom(37);
        }
        if (integer3 > 0 || integer4 > 0 || integer5 > 0 || integer6 > 0 || integer7 > 0) {
            android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.hpo);
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(0);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(findViewById13, arrayList16.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById13.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(findViewById13, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.hpo);
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            arrayList17.add(8);
            java.util.Collections.reverse(arrayList17);
            yj0.a.d(findViewById14, arrayList17.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById14.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
            yj0.a.f(findViewById14, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView7 = this.f134342h;
        if (textView7 == null) {
            kotlin.jvm.internal.o.o("finderPostNewFeed");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView7.getPaint(), 0.8f);
        android.widget.TextView textView8 = this.f134351q;
        com.tencent.mm.ui.bk.r0(textView8 != null ? textView8.getPaint() : null, 0.8f);
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.f484956g20);
        java.util.ArrayList arrayList18 = new java.util.ArrayList();
        arrayList18.add(0);
        java.util.Collections.reverse(arrayList18);
        yj0.a.d(findViewById15, arrayList18.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById15.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
        yj0.a.f(findViewById15, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (getIntent().getBooleanExtra("key_from_sns_post", false)) {
            android.view.View view2 = this.f134341g;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("finderPosBtn");
                throw null;
            }
            view2.post(new com.tencent.mm.plugin.finder.viewmodel.component.r40(view2));
            getIntent().removeExtra("key_from_sns_post");
        }
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "[checkAutoShowPost] autoShow" + this.f134359x0);
        i95.m c17 = i95.n0.c(l40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int dh6 = l40.e.dh((l40.e) c17, getContext(), null, 2, null);
        if (this.f134359x0 && (dh6 == 3 || dh6 == 6)) {
            W6();
            com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "[checkAutoShowPost] has autoShow post bottom sheet ,set false");
            this.f134359x0 = false;
        } else {
            com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "[checkAutoShowPost] not autoShow");
        }
        ya2.b2 b18 = ya2.h.f460484a.b(xy2.c.e(getContext()));
        r45.xk b19 = b18 != null ? ya2.d.b(b18, true) : null;
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.aki);
        if (findViewById16 != null) {
            if (b19 != null && p76) {
                i17 = 0;
            }
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            arrayList19.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList19);
            yj0.a.d(findViewById16, arrayList19.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById16.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
            yj0.a.f(findViewById16, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "refreshSelf", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ym5.a1.h(findViewById16, new com.tencent.mm.plugin.finder.viewmodel.component.s40(this));
            findViewById16.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.t40(this, b19));
        }
        U6();
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.X.getValue();
        if (z9Var != null) {
            v7(z9Var.f105327a, z9Var.f105330d);
        }
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var2 = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.f105367h.getValue();
        if (z9Var2 != null) {
            w7(z9Var2.f105327a, z9Var2.f105330d);
        }
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var3 = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.f105369i.getValue();
        if (z9Var3 != null) {
            C7(z9Var3.f105327a);
        }
    }

    public final void r7() {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).Jj(getActivity(), this.G, this.E, 1L, 1L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c18).Jj(getActivity(), this.G, this.E, 1L, 10L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c19).Jj(getActivity(), this.G, this.E, 1L, 2L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : this.f134339e != null ? r2.getInteger(8) : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        i95.m c27 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c27, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c27).Jj(getActivity(), this.G, this.E, 1L, 3L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : this.f134339e != null ? r2.getInteger(9) : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageEntry");
        r45.f03 I02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageEntryRight");
        i95.m c28 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c28, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c28).Jj(getActivity(), this.G, this.E, 1L, 4L, (r30 & 32) != 0 ? false : (I0 == null && I02 == null) ? false : true, (r30 & 64) != 0 ? 0L : I0 != null ? I0.f373888e : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "finder_private_msg_entrance", this.f134338d, false, false, 12, null);
        r45.f03 I03 = S0 != null ? S0.I0("finder_private_msg_entrance") : null;
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Jj(getActivity(), this.G, this.E, 1L, 6L, I03 != null, I03 != null ? I03.f373888e : 0, b7(I03), xy2.c.e(getContext()));
        long h76 = h7();
        i95.m c29 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c29, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c29).Jj(getActivity(), this.G, this.E, 1L, 7L, (r30 & 32) != 0 ? false : h76 > 0, (r30 & 64) != 0 ? 0L : h76, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        r45.f03 I04 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("CreatorCenter");
        i95.m c37 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c37, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c37).Jj(getActivity(), this.G, this.E, 1L, 8L, (r30 & 32) != 0 ? false : I04 != null, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.i_u);
        if ((findViewById.getVisibility() == 0 ? findViewById : null) != null) {
            i95.m c38 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c38, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c38).Jj(getActivity(), this.G, false, 1L, 9L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        }
    }

    public final void s7() {
        java.lang.String str;
        java.lang.String e17 = xy2.c.e(getContext());
        m92.b j37 = g92.a.j3(g92.b.f269769e, this.f134338d, false, 2, null);
        if (j37 == null || (str = j37.u0().getString(24)) == null) {
            str = "";
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cmm);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cmn);
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("CreatorCenter");
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "setCreatorCenterHint defaultUsername:" + e17 + " hint:" + str + " showInfo:" + I0);
        if (I0 != null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setCreatorCenterHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setCreatorCenterHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void t7(boolean z17) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        t70Var.E0().getClass();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_FAV_TIPS_BOOLEAN_SYNC;
        boolean o17 = c17.o(u3Var, true);
        if (((java.lang.Number) t70Var.D0().r()).intValue() == 1) {
            if (z17 && o17) {
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.duc)).setVisibility(0);
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.dud);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setFavTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setFavTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.duc)).setVisibility(8);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dud);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setFavTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setFavTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
        }
    }

    public final void u7(boolean z17) {
        ae2.in inVar = ae2.in.f3688a;
        boolean z18 = ((java.lang.Number) ae2.in.G5.r()).intValue() != 1 && com.tencent.mm.ui.bk.A();
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "setLivePostBtnVisible is pad:" + z18 + ",visible:" + z17);
        if (!z17 || z18) {
            android.view.View view = this.f134355u;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.f134347o;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view3 = this.f134347o;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = this.f134355u;
            if (view4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "setLivePostBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View view5 = this.f134347o;
        if (view5 != null) {
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view5, "start_live");
            aVar.ik(view5, 40, 25496);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
            lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
            lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            aVar.gk(view5, kz5.c1.k(lVarArr));
        }
    }

    public final void v7(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "[showAccountBannedRedDot] isShow=" + z17 + ' ' + str);
        if (!kotlin.jvm.internal.o.b(str, this.f134338d)) {
            if (this.f134338d.length() > 0) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.ktv);
                if (findViewById == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "showAccountBannedRedDot", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "showAccountBannedRedDot", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ktv);
        if (findViewById2 == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "showAccountBannedRedDot", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "showAccountBannedRedDot", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void w7(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "[showMemberPersonalAuthorProfileRedDot] isShow=" + z17 + ' ' + str);
        if (!kotlin.jvm.internal.o.b(str, this.f134338d)) {
            if (this.f134338d.length() > 0) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.q9n);
                if (findViewById == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "showPersonalAuthorProfileRedDot", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "showPersonalAuthorProfileRedDot", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q9n);
        if (findViewById2 == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "showPersonalAuthorProfileRedDot", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "showPersonalAuthorProfileRedDot", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void x7() {
        r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("FinderSwitchAccount", this.f134338d);
        android.view.View view = this.f134354t;
        if (view == null) {
            return;
        }
        int i17 = b07 != null ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updateAccountSwitchRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC", "updateAccountSwitchRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void y7() {
        android.view.View a76 = a7();
        android.widget.TextView textView = (android.widget.TextView) a7().findViewById(com.tencent.mm.R.id.qci);
        android.widget.TextView textView2 = (android.widget.TextView) a7().findViewById(com.tencent.mm.R.id.qch);
        int[] a17 = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.a(xy2.c.e(getContext()));
        int i17 = a17[4];
        int i18 = a17[5];
        int i19 = a17[6];
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "AuthorProfileMemberNotify", this.f134338d, false, false, 12, null);
        r45.f03 I0 = S0 != null ? S0.I0("AuthorProfileMemberNotify") : null;
        int i27 = I0 != null ? I0.f373888e : 0;
        int i28 = I0 != null ? I0.f373887d : 0;
        int i29 = i27;
        r45.f03 f03Var = I0;
        com.tencent.mm.plugin.finder.viewmodel.component.c50 c50Var = new com.tencent.mm.plugin.finder.viewmodel.component.c50(S0, I0, this, i27, i19, i18, i17);
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "[updateFinderMemberMentionRedDot] memberTotalCount=" + i29 + " memberShowType=" + i28 + " hasReportMemberMsg=" + this.I);
        if (!this.I) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("vipCnt", i19);
            jSONObject.put("commentCnt", i18);
            jSONObject.put("likeCnt", i17);
            jSONObject.put("totalCnt", i29);
            if (S0 != null && f03Var != null) {
                com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                androidx.appcompat.app.AppCompatActivity context = getActivity();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", S0, f03Var, 1, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            }
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            long j17 = this.G;
            boolean z17 = this.E;
            boolean z18 = i29 > 0;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            o3Var.Jj(activity, j17, z17, 1L, 12L, z18, i29, r26.i0.t(jSONObject2, ",", ";", false), this.f134338d);
            this.I = true;
        }
        a76.setOnClickListener(c50Var);
        if (i29 > 0) {
            textView2.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.plugin.finder.assist.w2.a(i29));
            textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(getContext(), i29));
            textView.setTextSize(0, i65.a.f(getActivity(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(getActivity()));
            a76.setTag(com.tencent.mm.R.id.e76, java.lang.Integer.valueOf(i29));
            return;
        }
        if (i29 == 0 && i28 == 1) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            a76.setTag(com.tencent.mm.R.id.e76, 0);
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            a76.setTag(com.tencent.mm.R.id.e76, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    public final void z7() {
        int i17;
        char c17;
        java.lang.String str;
        ?? r102;
        boolean z17;
        boolean z18;
        java.lang.String str2;
        java.lang.String str3;
        int i18;
        boolean z19;
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "AuthorProfileNotify", this.f134338d, false, false, 12, null);
        android.view.View c76 = c7();
        android.widget.TextView textView = (android.widget.TextView) c76.findViewById(com.tencent.mm.R.id.qci);
        android.widget.TextView textView2 = (android.widget.TextView) c76.findViewById(com.tencent.mm.R.id.qch);
        android.widget.TextView textView3 = (android.widget.TextView) c76.findViewById(com.tencent.mm.R.id.qcj);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        textView3.setVisibility(8);
        if (S0 != null) {
            r45.f03 I0 = S0.I0("AuthorProfileNotify");
            int i19 = I0 != null ? I0.f373888e : 0;
            int i27 = I0 != null ? I0.f373887d : 0;
            if (i19 <= 0 || i27 != 2) {
                c17 = 2;
                str = "context";
                r102 = 1;
                textView.setVisibility(8);
                i17 = 0;
                textView2.setVisibility(0);
                c76.setTag(com.tencent.mm.R.id.e76, 0);
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(com.tencent.mm.plugin.finder.assist.w2.a(i19));
                textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(getContext(), i19));
                textView.setTextSize(0, i65.a.f(getActivity(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(getActivity()));
                r45.vs2 vs2Var = S0.field_ctrInfo;
                if (vs2Var == null || (str3 = vs2Var.f388490h) == null) {
                    str3 = "";
                }
                if (kotlin.jvm.internal.o.b(str3, this.K)) {
                    i18 = i19;
                    c17 = 2;
                    str = "context";
                    z19 = true;
                } else {
                    this.K = str3;
                    int i28 = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1 ? 0 : 2;
                    i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c18;
                    androidx.appcompat.app.AppCompatActivity context = getActivity();
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    com.tencent.mm.plugin.finder.report.o3.uj(o3Var, "4", 1, 1, 5, i28, i19, null, null, 0L, nyVar != null ? nyVar.V6() : null, 0, 0, 3520, null);
                    if (I0 != null) {
                        com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                        androidx.appcompat.app.AppCompatActivity context2 = getActivity();
                        kotlin.jvm.internal.o.g(context2, "context");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                        i18 = i19;
                        z19 = true;
                        c17 = 2;
                        str = "context";
                        com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", S0, I0, 1, nyVar2 != null ? nyVar2.V6() : null, 0, null, 0, 0, 480, null);
                    } else {
                        z19 = true;
                        i18 = i19;
                        c17 = 2;
                        str = "context";
                    }
                }
                c76.setTag(com.tencent.mm.R.id.e76, java.lang.Integer.valueOf(i18));
                r102 = z19;
                i17 = 0;
            }
        } else {
            i17 = 0;
            c17 = 2;
            str = "context";
            r102 = 1;
            textView.setVisibility(8);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            c76.setTag(com.tencent.mm.R.id.e76, 0);
        }
        if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.p() == r102) {
            com.tencent.mm.plugin.finder.extension.reddot.jb S02 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "FinderMessageEntryRight", this.f134338d, false, false, 12, null);
            r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("FinderMessageEntryRight", this.f134338d);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderMessageEntryRight] msgRightShowInfo=");
            sb6.append(b07 != null ? b07.f373889f : null);
            sb6.append(" tipsId=");
            sb6.append(S02 != null ? S02.field_tipsId : null);
            sb6.append(",hasExposeFinderMentionRightMsgTips=");
            sb6.append(this.L);
            com.tencent.mars.xlog.Log.i("Finder.SelfUIC", sb6.toString());
            java.lang.String str4 = b07 != null ? b07.f373889f : null;
            if ((str4 == null || str4.length() == 0) ? r102 : i17) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(i17);
                i95.m c19 = i95.n0.c(zy2.s6.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                textView3.setText(zy2.s6.H3((zy2.s6) c19, (b07 == null || (str2 = b07.f373889f) == null) ? "" : str2, (int) textView3.getTextSize(), false, 4, null));
                if (S02 != null && b07 != null) {
                    java.lang.String str5 = S02.field_tipsId;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!kotlin.jvm.internal.o.b(str5, this.L)) {
                        this.L = str5;
                        com.tencent.mm.plugin.finder.report.x2 x2Var2 = com.tencent.mm.plugin.finder.report.x2.f125429a;
                        androidx.appcompat.app.AppCompatActivity activity = getActivity();
                        kotlin.jvm.internal.o.g(activity, str);
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                        com.tencent.mm.plugin.finder.report.x2.i(x2Var2, "4", S02, b07, 1, nyVar3 != null ? nyVar3.V6() : null, 0, null, 0, 0, 480, null);
                        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                            z17 = r102;
                        } else {
                            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            z17 = i17;
                        }
                        if (z17 || z65.c.a()) {
                            z18 = r102;
                        } else {
                            kb2.b bVar = kb2.b.f306225a;
                            z18 = i17;
                        }
                        if (z18) {
                            com.tencent.mm.sdk.platformtools.Log.c("Finder.SelfUIC", "report FinderMessageEntryRight expose uid=" + S02.field_tips_uuid, new java.lang.Object[i17]);
                        }
                    }
                }
            }
        }
        if (this.H) {
            return;
        }
        int[] a17 = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.a(xy2.c.e(getContext()));
        int i29 = a17[i17];
        int i37 = a17[r102];
        int i38 = a17[c17];
        int i39 = a17[3];
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "redDot check likeCount :" + i29 + " commentCount " + i37 + " followCount " + i38 + ' ');
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("followCnt", i38);
        jSONObject.put("commentCnt", i37);
        jSONObject.put("likeCnt", i29);
        jSONObject.put("totalCnt", i39);
        com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        long j17 = this.G;
        boolean z27 = this.E;
        boolean z28 = i39 > 0 ? r102 : i17;
        long j18 = i39;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        o3Var2.Jj(activity2, j17, z27, 1L, 5L, z28, j18, r26.i0.t(jSONObject2, ",", ";", i17), xy2.c.e(getContext()));
        this.H = r102;
    }
}
