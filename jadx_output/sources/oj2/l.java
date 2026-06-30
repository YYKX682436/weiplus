package oj2;

/* loaded from: classes10.dex */
public abstract class l extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f345776J;
    public android.view.ViewGroup K;
    public android.view.ViewGroup L;
    public android.view.ViewGroup M;
    public android.view.ViewGroup N;
    public android.widget.TextView P;
    public android.view.ViewGroup Q;
    public android.widget.TextView R;
    public android.widget.ImageView S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 3);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        a0();
        if (pluginAbility.f() == lj2.w0.f318958d) {
            getClickView().setOnClickListener(new oj2.g(this));
        }
        addView(getRoot());
    }

    @Override // wj2.w
    public void R() {
        android.widget.TextView micHeartText;
        S(getMicHeartText());
        s(getMicTagText());
        Z(this.f318877h);
        if (!A() || (micHeartText = getMicHeartText()) == null) {
            return;
        }
        setTouchDelegate(micHeartText);
        micHeartText.setOnClickListener(this);
    }

    public final void Z(boolean z17) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.uo1 liveDesc;
        kotlinx.coroutines.flow.j2 j2Var;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4;
        r45.uo1 liveDesc2;
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAudioMode isAudioMode:");
        sb6.append(z17);
        sb6.append(" business(LiveCommonSlice::class.java).audioModeHolderBm:");
        sb6.append(getPluginAbility().a0().f());
        sb6.append(" liveDesc.cover:");
        com.tencent.mm.protocal.protobuf.FinderObject z18 = getPluginAbility().a0().z();
        java.lang.String str2 = null;
        sb6.append((z18 == null || (objectDesc4 = z18.getObjectDesc()) == null || (liveDesc2 = objectDesc4.getLiveDesc()) == null) ? null : liveDesc2.getString(0));
        sb6.append(" media.url:");
        com.tencent.mm.protocal.protobuf.FinderObject z19 = getPluginAbility().a0().z();
        sb6.append((z19 == null || (objectDesc3 = z19.getObjectDesc()) == null || (media2 = objectDesc3.getMedia()) == null || (finderMedia2 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media2)) == null) ? null : finderMedia2.getUrl());
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        if (D()) {
            android.widget.ImageView imageView = this.S;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(4);
            return;
        }
        if (zl2.r4.f473950a.x1()) {
            if (!z17) {
                android.widget.ImageView imageView2 = this.S;
                if (imageView2 == null) {
                    return;
                }
                imageView2.setVisibility(4);
                return;
            }
            lj2.t0 a07 = getPluginAbility().a0();
            mm2.g1 g1Var = (mm2.g1) dk2.ef.f233372a.i(mm2.g1.class);
            if (g1Var != null && (j2Var = g1Var.f329075p) != null) {
                str2 = (java.lang.String) ((kotlinx.coroutines.flow.h3) j2Var).getValue();
            }
            pm0.v.X(new oj2.j(this, a07.C(str2)));
            return;
        }
        if (!z17) {
            android.widget.ImageView imageView3 = this.S;
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(4);
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject z27 = getPluginAbility().a0().z();
        if (z27 != null && (objectDesc2 = z27.getObjectDesc()) != null && (liveDesc = objectDesc2.getLiveDesc()) != null) {
            str2 = liveDesc.getString(0);
        }
        if (str2 == null || str2.length() == 0) {
            com.tencent.mm.protocal.protobuf.FinderObject z28 = getPluginAbility().a0().z();
            if (z28 == null || (objectDesc = z28.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null || (str = finderMedia.getUrl()) == null) {
                str = "";
            }
            str2 = str;
        }
        pm0.v.X(new oj2.j(this, getPluginAbility().a0().C(str2)));
    }

    @Override // sj2.m
    public void a() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationStart");
    }

    public abstract void a0();

    @Override // lj2.u0
    public void b(boolean z17, boolean z18) {
        if (this.f318877h != z17 || z18) {
            setAnchorAudioMode(z17);
            com.tencent.mars.xlog.Log.i(getTAG(), "notifyAnchorAudioModeChange " + z17 + " isForce: " + z18);
            pm0.v.X(new oj2.k(this, z17));
        }
    }

    @Override // sj2.m
    public void d() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationEnd");
    }

    @Override // lj2.u0
    public void e() {
        S(getMicHeartText());
    }

    @Override // lj2.u0
    public void g() {
        s(getMicTagText());
    }

    public final android.widget.ImageView getAnchorAudioCoverView() {
        return this.S;
    }

    @Override // wj2.w, lj2.u0
    public android.view.ViewGroup getAnchorAudioModeLayout() {
        return getFinderLiveMicAnchorAudioLayout();
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    public android.view.View getClickView() {
        return getRoot();
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    public final android.view.ViewGroup getFinderLiveLotteryBubbleRoot() {
        android.view.ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveLotteryBubbleRoot");
        throw null;
    }

    public final android.view.ViewGroup getFinderLiveLuckyMoneyBubbleUiRoot() {
        android.view.ViewGroup viewGroup = this.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public final android.view.ViewGroup getFinderLiveMicAnchorAudioLayout() {
        android.view.ViewGroup viewGroup = this.f345776J;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveMicAnchorAudioLayout");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicHeartText() {
        android.widget.TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicHeartText");
        throw null;
    }

    public final android.view.ViewGroup getFinderLiveMicNewNormalMicGiftItemLayout() {
        android.view.ViewGroup viewGroup = this.K;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveMicNewNormalMicGiftItemLayout");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicTagText() {
        return this.R;
    }

    public final android.view.ViewGroup getFinderLiveVoteBubbleRoot() {
        android.view.ViewGroup viewGroup = this.M;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveVoteBubbleRoot");
        throw null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        return getFinderLiveMicNewNormalMicGiftItemLayout();
    }

    @Override // wj2.w, lj2.u0
    public android.view.ViewGroup getLotteryBubbleRootView() {
        return getFinderLiveLotteryBubbleRoot();
    }

    @Override // wj2.w, lj2.u0
    public android.view.ViewGroup getLuckyMoneyRootView() {
        return getFinderLiveLuckyMoneyBubbleUiRoot();
    }

    @Override // wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    public android.widget.TextView getMicHeartText() {
        return getFinderLiveMicHeartText();
    }

    public android.widget.TextView getMicTagText() {
        return this.R;
    }

    public final android.view.ViewGroup getRoot() {
        android.view.ViewGroup viewGroup = this.Q;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // wj2.w, lj2.u0
    public android.view.ViewGroup getVoteBubbleRootView() {
        return getFinderLiveVoteBubbleRoot();
    }

    @Override // sj2.m
    public void h() {
        android.view.ViewGroup giftRootView = getGiftRootView();
        if (giftRootView == null) {
            return;
        }
        giftRootView.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.TextView micHeartText = getMicHeartText();
        if (kotlin.jvm.internal.o.b(valueOf, micHeartText != null ? java.lang.Integer.valueOf(micHeartText.getId()) : null)) {
            android.widget.TextView micHeartText2 = getMicHeartText();
            boolean z17 = false;
            if (micHeartText2 != null) {
                if (micHeartText2.getVisibility() == 0) {
                    z17 = true;
                }
            }
            if (z17) {
                H();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setAnchorAudioCoverView(android.widget.ImageView imageView) {
        this.S = imageView;
    }

    public final void setFinderLiveLotteryBubbleRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }

    public final void setFinderLiveLuckyMoneyBubbleUiRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.L = viewGroup;
    }

    public final void setFinderLiveMicAnchorAudioLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.f345776J = viewGroup;
    }

    public final void setFinderLiveMicHeartText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.P = textView;
    }

    public final void setFinderLiveMicNewNormalMicGiftItemLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.K = viewGroup;
    }

    public final void setFinderLiveMicTagText(android.widget.TextView textView) {
        this.R = textView;
    }

    public final void setFinderLiveVoteBubbleRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.M = viewGroup;
    }

    public final void setRoot(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.Q = viewGroup;
    }
}
