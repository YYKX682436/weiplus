package id2;

/* loaded from: classes3.dex */
public final class b2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: g, reason: collision with root package name */
    public static r45.lk2 f290490g;

    /* renamed from: d, reason: collision with root package name */
    public fg2.i1 f290491d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f290492e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f290493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f290492e = new java.util.ArrayList();
        this.f290493f = jz5.h.b(new id2.x1(this));
    }

    public final void O6(java.util.ArrayList arrayList, android.view.View view) {
        java.util.Iterator it = this.f290492e.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            if (((yk2.g) it.next()).f462791d.getVisibility() == 0) {
                z17 = true;
            }
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveMoreOptionSettingUIC", "checkLayoutVisibility", "(Ljava/util/ArrayList;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveMoreOptionSettingUIC", "checkLayoutVisibility", "(Ljava/util/ArrayList;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void P6(r45.lk2 lk2Var) {
        java.util.ArrayList arrayList = this.f290492e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yk2.g) it.next()).a(lk2Var);
        }
        fg2.i1 i1Var = this.f290491d;
        if (i1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.LinearLayout moreOptionSettingLayout = i1Var.f262086g;
        kotlin.jvm.internal.o.f(moreOptionSettingLayout, "moreOptionSettingLayout");
        O6(arrayList, moreOptionSettingLayout);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.avm;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        r45.lk2 lk2Var = f290490g;
        if (lk2Var != null) {
            P6(lk2Var);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.tmm);
        int i17 = com.tencent.mm.R.id.f6b;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.f6b);
        if (weImageView != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
            i17 = com.tencent.mm.R.id.fjl;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.fjl);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.g9b;
                com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(findViewById, com.tencent.mm.R.id.g9b);
                if (mMSwitchBtn != null) {
                    i17 = com.tencent.mm.R.id.g9d;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.g9d);
                    if (textView2 != null) {
                        i17 = com.tencent.mm.R.id.r_c;
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.r_c);
                        if (relativeLayout != null) {
                            i17 = com.tencent.mm.R.id.f485246h10;
                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f485246h10);
                            if (textView3 != null) {
                                i17 = com.tencent.mm.R.id.f485247h11;
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f485247h11);
                                if (linearLayout != null) {
                                    i17 = com.tencent.mm.R.id.hpl;
                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hpl);
                                    if (linearLayout2 != null) {
                                        i17 = com.tencent.mm.R.id.hpn;
                                        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hpn);
                                        if (linearLayout3 != null) {
                                            i17 = com.tencent.mm.R.id.hpo;
                                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hpo);
                                            if (linearLayout4 != null) {
                                                i17 = com.tencent.mm.R.id.hpp;
                                                android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hpp);
                                                if (linearLayout5 != null) {
                                                    i17 = com.tencent.mm.R.id.ru7;
                                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.ru7);
                                                    if (weImageView2 != null) {
                                                        i17 = com.tencent.mm.R.id.ru8;
                                                        android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.ru8);
                                                        if (linearLayout6 != null) {
                                                            i17 = com.tencent.mm.R.id.ru9;
                                                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.ru9);
                                                            if (textView4 != null) {
                                                                i17 = com.tencent.mm.R.id.ru_;
                                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.ru_);
                                                                if (textView5 != null) {
                                                                    i17 = com.tencent.mm.R.id.rug;
                                                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.rug);
                                                                    if (weImageView3 != null) {
                                                                        i17 = com.tencent.mm.R.id.ruh;
                                                                        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.ruh);
                                                                        if (relativeLayout2 != null) {
                                                                            i17 = com.tencent.mm.R.id.rui;
                                                                            android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.rui);
                                                                            if (textView6 != null) {
                                                                                i17 = com.tencent.mm.R.id.ruj;
                                                                                android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.ruj);
                                                                                if (textView7 != null) {
                                                                                    i17 = com.tencent.mm.R.id.qfy;
                                                                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.qfy);
                                                                                    if (weImageView4 != null) {
                                                                                        i17 = com.tencent.mm.R.id.qfz;
                                                                                        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.qfz);
                                                                                        if (relativeLayout3 != null) {
                                                                                            i17 = com.tencent.mm.R.id.ruv;
                                                                                            android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.ruv);
                                                                                            if (textView8 != null) {
                                                                                                i17 = com.tencent.mm.R.id.f485625qg0;
                                                                                                android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f485625qg0);
                                                                                                if (textView9 != null) {
                                                                                                    i17 = com.tencent.mm.R.id.imc;
                                                                                                    android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.imc);
                                                                                                    if (progressBar != null) {
                                                                                                        i17 = com.tencent.mm.R.id.uh_;
                                                                                                        android.widget.LinearLayout linearLayout7 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.uh_);
                                                                                                        if (linearLayout7 != null) {
                                                                                                            i17 = com.tencent.mm.R.id.uha;
                                                                                                            android.widget.LinearLayout linearLayout8 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.uha);
                                                                                                            if (linearLayout8 != null) {
                                                                                                                i17 = com.tencent.mm.R.id.l7d;
                                                                                                                android.widget.TextView textView10 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.l7d);
                                                                                                                if (textView10 != null) {
                                                                                                                    i17 = com.tencent.mm.R.id.l7e;
                                                                                                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.l7e);
                                                                                                                    if (weImageView5 != null) {
                                                                                                                        i17 = com.tencent.mm.R.id.l7f;
                                                                                                                        android.widget.TextView textView11 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.l7f);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i17 = com.tencent.mm.R.id.f486543ux1;
                                                                                                                            android.widget.LinearLayout linearLayout9 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f486543ux1);
                                                                                                                            if (linearLayout9 != null) {
                                                                                                                                i17 = com.tencent.mm.R.id.f486544ux2;
                                                                                                                                android.widget.TextView textView12 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f486544ux2);
                                                                                                                                if (textView12 != null) {
                                                                                                                                    i17 = com.tencent.mm.R.id.f486545ux3;
                                                                                                                                    android.widget.TextView textView13 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f486545ux3);
                                                                                                                                    if (textView13 != null) {
                                                                                                                                        i17 = com.tencent.mm.R.id.f486546ux4;
                                                                                                                                        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(findViewById, com.tencent.mm.R.id.f486546ux4);
                                                                                                                                        if (mMSwitchBtn2 != null) {
                                                                                                                                            i17 = com.tencent.mm.R.id.m1p;
                                                                                                                                            android.widget.LinearLayout linearLayout10 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m1p);
                                                                                                                                            if (linearLayout10 != null) {
                                                                                                                                                i17 = com.tencent.mm.R.id.m1q;
                                                                                                                                                com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(findViewById, com.tencent.mm.R.id.m1q);
                                                                                                                                                if (mMSwitchBtn3 != null) {
                                                                                                                                                    i17 = com.tencent.mm.R.id.nto;
                                                                                                                                                    com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn4 = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(findViewById, com.tencent.mm.R.id.nto);
                                                                                                                                                    if (mMSwitchBtn4 != null) {
                                                                                                                                                        i17 = com.tencent.mm.R.id.qgp;
                                                                                                                                                        android.widget.TextView textView14 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.qgp);
                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                            i17 = com.tencent.mm.R.id.rbb;
                                                                                                                                                            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn5 = (com.tencent.mm.ui.widget.MMSwitchBtn) x4.b.a(findViewById, com.tencent.mm.R.id.rbb);
                                                                                                                                                            if (mMSwitchBtn5 != null) {
                                                                                                                                                                i17 = com.tencent.mm.R.id.oah;
                                                                                                                                                                android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.oah);
                                                                                                                                                                if (relativeLayout4 != null) {
                                                                                                                                                                    i17 = com.tencent.mm.R.id.oak;
                                                                                                                                                                    android.widget.TextView textView15 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.oak);
                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                        i17 = com.tencent.mm.R.id.oap;
                                                                                                                                                                        android.widget.TextView textView16 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.oap);
                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                            i17 = com.tencent.mm.R.id.oaw;
                                                                                                                                                                            android.widget.TextView textView17 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.oaw);
                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                i17 = com.tencent.mm.R.id.oax;
                                                                                                                                                                                android.widget.RelativeLayout relativeLayout5 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.oax);
                                                                                                                                                                                if (relativeLayout5 != null) {
                                                                                                                                                                                    i17 = com.tencent.mm.R.id.oaz;
                                                                                                                                                                                    android.widget.LinearLayout linearLayout11 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.oaz);
                                                                                                                                                                                    if (linearLayout11 != null) {
                                                                                                                                                                                        i17 = com.tencent.mm.R.id.f487766pr5;
                                                                                                                                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.f487766pr5);
                                                                                                                                                                                        if (weImageView6 != null) {
                                                                                                                                                                                            i17 = com.tencent.mm.R.id.pr9;
                                                                                                                                                                                            android.widget.TextView textView18 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.pr9);
                                                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                                                i17 = com.tencent.mm.R.id.pre;
                                                                                                                                                                                                android.widget.TextView textView19 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.pre);
                                                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                                                    i17 = com.tencent.mm.R.id.prf;
                                                                                                                                                                                                    android.widget.TextView textView20 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.prf);
                                                                                                                                                                                                    if (textView20 != null) {
                                                                                                                                                                                                        i17 = com.tencent.mm.R.id.prk;
                                                                                                                                                                                                        android.widget.TextView textView21 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.prk);
                                                                                                                                                                                                        if (textView21 != null) {
                                                                                                                                                                                                            this.f290491d = new fg2.i1(frameLayout, weImageView, frameLayout, textView, mMSwitchBtn, textView2, relativeLayout, textView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, weImageView2, linearLayout6, textView4, textView5, weImageView3, relativeLayout2, textView6, textView7, weImageView4, relativeLayout3, textView8, textView9, progressBar, linearLayout7, linearLayout8, textView10, weImageView5, textView11, linearLayout9, textView12, textView13, mMSwitchBtn2, linearLayout10, mMSwitchBtn3, mMSwitchBtn4, textView14, mMSwitchBtn5, relativeLayout4, textView15, textView16, textView17, relativeLayout5, linearLayout11, weImageView6, textView18, textView19, textView20, textView21);
                                                                                                                                                                                                            ae2.in inVar = ae2.in.f3688a;
                                                                                                                                                                                                            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.B).getValue()).r()).intValue();
                                                                                                                                                                                                            java.util.ArrayList arrayList = this.f290492e;
                                                                                                                                                                                                            if (intValue == 1) {
                                                                                                                                                                                                                fg2.i1 i1Var = this.f290491d;
                                                                                                                                                                                                                if (i1Var == null) {
                                                                                                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                android.widget.LinearLayout jumpFinderLiveProductOrderCenter = i1Var.f262082c;
                                                                                                                                                                                                                kotlin.jvm.internal.o.f(jumpFinderLiveProductOrderCenter, "jumpFinderLiveProductOrderCenter");
                                                                                                                                                                                                                arrayList.add(new yk2.i(jumpFinderLiveProductOrderCenter));
                                                                                                                                                                                                            }
                                                                                                                                                                                                            fg2.i1 i1Var2 = this.f290491d;
                                                                                                                                                                                                            if (i1Var2 == null) {
                                                                                                                                                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            android.widget.LinearLayout jumpFinderLivePurchase = i1Var2.f262083d;
                                                                                                                                                                                                            kotlin.jvm.internal.o.f(jumpFinderLivePurchase, "jumpFinderLivePurchase");
                                                                                                                                                                                                            arrayList.add(new yk2.j(jumpFinderLivePurchase));
                                                                                                                                                                                                            fg2.i1 i1Var3 = this.f290491d;
                                                                                                                                                                                                            if (i1Var3 == null) {
                                                                                                                                                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            android.widget.LinearLayout jumpFinderLiveLotteryResultRecord = i1Var3.f262081b;
                                                                                                                                                                                                            kotlin.jvm.internal.o.f(jumpFinderLiveLotteryResultRecord, "jumpFinderLiveLotteryResultRecord");
                                                                                                                                                                                                            arrayList.add(new yk2.a(jumpFinderLiveLotteryResultRecord));
                                                                                                                                                                                                            fg2.i1 i1Var4 = this.f290491d;
                                                                                                                                                                                                            if (i1Var4 == null) {
                                                                                                                                                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            android.widget.LinearLayout jumpFinderLiveRewardLevel = i1Var4.f262084e;
                                                                                                                                                                                                            kotlin.jvm.internal.o.f(jumpFinderLiveRewardLevel, "jumpFinderLiveRewardLevel");
                                                                                                                                                                                                            arrayList.add(new yk2.n(jumpFinderLiveRewardLevel));
                                                                                                                                                                                                            fg2.i1 i1Var5 = this.f290491d;
                                                                                                                                                                                                            if (i1Var5 == null) {
                                                                                                                                                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            android.widget.RelativeLayout liveIdRoot = i1Var5.f262085f;
                                                                                                                                                                                                            kotlin.jvm.internal.o.f(liveIdRoot, "liveIdRoot");
                                                                                                                                                                                                            arrayList.add(new yk2.b(liveIdRoot));
                                                                                                                                                                                                            fg2.i1 i1Var6 = this.f290491d;
                                                                                                                                                                                                            if (i1Var6 == null) {
                                                                                                                                                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            android.widget.LinearLayout moreOptionSettingLayout = i1Var6.f262086g;
                                                                                                                                                                                                            kotlin.jvm.internal.o.f(moreOptionSettingLayout, "moreOptionSettingLayout");
                                                                                                                                                                                                            O6(arrayList, moreOptionSettingLayout);
                                                                                                                                                                                                            kotlinx.coroutines.l.d(v65.m.b(getActivity()), null, null, new id2.a2(this, null), 3, null);
                                                                                                                                                                                                            return;
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
