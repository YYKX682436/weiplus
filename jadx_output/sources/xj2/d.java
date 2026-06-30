package xj2;

/* loaded from: classes10.dex */
public final class d extends oj2.m {
    public android.view.View W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ImageView f454830l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.ViewGroup f454831p0;

    /* renamed from: p1, reason: collision with root package name */
    public lj2.s0 f454832p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f454833x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.TextView f454834y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // oj2.m, wj2.w
    public void R() {
        java.lang.String str;
        java.lang.String str2;
        super.R();
        e();
        xh2.a bindMicData = getBindMicData();
        if (bindMicData != null) {
            lj2.s0 s0Var = this.f454832p1;
            if (s0Var == null) {
                kotlin.jvm.internal.o.o("battleResultWidget");
                throw null;
            }
            km2.q qVar = bindMicData.f454520a;
            java.lang.String str3 = "";
            if (qVar == null || (str = qVar.f309172c) == null) {
                str = "";
            }
            if (qVar != null && (str2 = qVar.f309170a) != null) {
                str3 = str2;
            }
            s0Var.a(str, str3);
        }
    }

    @Override // oj2.m
    public void Z() {
        fg2.r a17 = fg2.r.a(com.tencent.mm.ui.id.b(getContext()), this, false);
        com.tencent.mm.view.MMPAGView finderLiveMicStateAudioWaveIcon = a17.f262280l;
        kotlin.jvm.internal.o.f(finderLiveMicStateAudioWaveIcon, "finderLiveMicStateAudioWaveIcon");
        setFinderLiveMicStateAudioWaveIcon(finderLiveMicStateAudioWaveIcon);
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f262273e;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        setFinderLiveMicMuteIcon(finderLiveMicMuteIcon);
        com.tencent.mm.ui.widget.imageview.WeImageView finderLiveMicMuteIconWe = a17.f262274f;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIconWe, "finderLiveMicMuteIconWe");
        setFinderLiveMicMuteIconWe(finderLiveMicMuteIconWe);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262269a;
        kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
        setRoot(constraintLayout);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = a17.f262275g.f262282a;
        kotlin.jvm.internal.o.f(constraintLayout2, "getRoot(...)");
        setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout2);
        android.widget.ImageView finderLiveMicStateAudioAvatar = a17.f262277i;
        kotlin.jvm.internal.o.f(finderLiveMicStateAudioAvatar, "finderLiveMicStateAudioAvatar");
        setFinderLiveMicStateAudioAvatar(finderLiveMicStateAudioAvatar);
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicStateAudioName = a17.f262279k;
        kotlin.jvm.internal.o.f(finderLiveMicStateAudioName, "finderLiveMicStateAudioName");
        setFinderLiveMicStateAudioName(finderLiveMicStateAudioName);
        android.widget.ImageView finderLiveMicStateAudioBg = a17.f262278j;
        kotlin.jvm.internal.o.f(finderLiveMicStateAudioBg, "finderLiveMicStateAudioBg");
        setFinderLiveMicStateAudioBg(finderLiveMicStateAudioBg);
        android.widget.TextView finderLiveMicHeartText = a17.f262272d;
        kotlin.jvm.internal.o.f(finderLiveMicHeartText, "finderLiveMicHeartText");
        setFinderLiveMicHeartText(finderLiveMicHeartText);
        android.widget.RelativeLayout relativeLayout = a17.f262271c.f261936a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout);
        setFinderLiveMicTagText(a17.f262281m.f262294b);
        fg2.c1 c1Var = a17.f262276h;
        android.widget.RelativeLayout relativeLayout2 = c1Var.f261958a;
        kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
        this.W = relativeLayout2;
        androidx.constraintlayout.widget.ConstraintLayout finderLiveMicHeartRangeLayout = c1Var.f261959b;
        kotlin.jvm.internal.o.f(finderLiveMicHeartRangeLayout, "finderLiveMicHeartRangeLayout");
        this.f454831p0 = finderLiveMicHeartRangeLayout;
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicHeartRangeText = c1Var.f261960c;
        kotlin.jvm.internal.o.f(finderLiveMicHeartRangeText, "finderLiveMicHeartRangeText");
        this.f454833x0 = finderLiveMicHeartRangeText;
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicSingleHeartText = c1Var.f261962e;
        kotlin.jvm.internal.o.f(finderLiveMicSingleHeartText, "finderLiveMicSingleHeartText");
        this.f454834y0 = finderLiveMicSingleHeartText;
        android.widget.ImageView soloGiftIcon = c1Var.f261964g;
        kotlin.jvm.internal.o.f(soloGiftIcon, "soloGiftIcon");
        this.f454830l1 = soloGiftIcon;
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.widget.TextView textView = this.f454833x0;
        if (textView == null) {
            kotlin.jvm.internal.o.o("singleRangeText");
            throw null;
        }
        r4Var.b3(textView);
        c1Var.f261961d.setVisibility(8);
        android.widget.RelativeLayout relativeLayout3 = a17.f262270b.f262284a;
        kotlin.jvm.internal.o.f(relativeLayout3, "getRoot(...)");
        this.f454832p1 = new lj2.s0(relativeLayout3);
    }

    @Override // oj2.m, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        dk2.u4 K;
        lj2.t0 a07 = getPluginAbility().a0();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (a07 == null || a07.K() == null) {
            f0Var = null;
        } else {
            android.view.ViewGroup viewGroup = this.f454831p0;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("singleHeartLayout");
                throw null;
            }
            viewGroup.setOnClickListener(this);
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            android.view.ViewGroup viewGroup2 = this.f454831p0;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("singleHeartLayout");
                throw null;
            }
            viewGroup2.setOnClickListener(null);
        }
        lj2.t0 a08 = getPluginAbility().a0();
        if (a08 == null || (K = a08.K()) == null) {
            f0Var2 = null;
        } else if (K.h() || K.i()) {
            android.view.View view = this.W;
            if (view == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getFinderLiveMicHeartText().setVisibility(8);
            android.view.ViewGroup viewGroup3 = this.f454831p0;
            if (viewGroup3 == null) {
                kotlin.jvm.internal.o.o("singleHeartLayout");
                throw null;
            }
            viewGroup3.setVisibility(0);
            android.widget.ImageView imageView = this.f454830l1;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("soloGiftIcon");
                throw null;
            }
            imageView.setVisibility(8);
            android.widget.TextView textView = this.f454834y0;
            if (textView == null) {
                kotlin.jvm.internal.o.o("singleHeartText");
                throw null;
            }
            textView.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
            android.widget.TextView textView2 = this.f454834y0;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("singleHeartText");
                throw null;
            }
            textView2.setVisibility(8);
            android.widget.TextView textView3 = this.f454833x0;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("singleRangeText");
                throw null;
            }
            textView3.setVisibility(8);
            int h17 = getPluginAbility().a0().h(getBindLinkMicUser());
            android.widget.TextView textView4 = this.f454833x0;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("singleRangeText");
                throw null;
            }
            textView4.setText(java.lang.String.valueOf(h17));
            if (h17 == 1) {
                android.widget.TextView textView5 = this.f454833x0;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("singleRangeText");
                    throw null;
                }
                textView5.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479078pg));
                android.widget.TextView textView6 = this.f454833x0;
                if (textView6 == null) {
                    kotlin.jvm.internal.o.o("singleRangeText");
                    throw null;
                }
                textView6.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.ck_));
                android.view.ViewGroup viewGroup4 = this.f454831p0;
                if (viewGroup4 == null) {
                    kotlin.jvm.internal.o.o("singleHeartLayout");
                    throw null;
                }
                viewGroup4.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a8v));
            } else if (h17 == 2) {
                android.widget.TextView textView7 = this.f454833x0;
                if (textView7 == null) {
                    kotlin.jvm.internal.o.o("singleRangeText");
                    throw null;
                }
                textView7.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479106q5));
                android.widget.TextView textView8 = this.f454833x0;
                if (textView8 == null) {
                    kotlin.jvm.internal.o.o("singleRangeText");
                    throw null;
                }
                textView8.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cnp));
                android.view.ViewGroup viewGroup5 = this.f454831p0;
                if (viewGroup5 == null) {
                    kotlin.jvm.internal.o.o("singleHeartLayout");
                    throw null;
                }
                viewGroup5.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a8u));
            } else if (h17 != 3) {
                android.widget.TextView textView9 = this.f454833x0;
                if (textView9 == null) {
                    kotlin.jvm.internal.o.o("singleRangeText");
                    throw null;
                }
                textView9.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479105q4));
                android.widget.TextView textView10 = this.f454833x0;
                if (textView10 == null) {
                    kotlin.jvm.internal.o.o("singleRangeText");
                    throw null;
                }
                textView10.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cl6));
                android.view.ViewGroup viewGroup6 = this.f454831p0;
                if (viewGroup6 == null) {
                    kotlin.jvm.internal.o.o("singleHeartLayout");
                    throw null;
                }
                viewGroup6.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a8u));
            } else {
                android.widget.TextView textView11 = this.f454833x0;
                if (textView11 == null) {
                    kotlin.jvm.internal.o.o("singleRangeText");
                    throw null;
                }
                textView11.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479105q4));
                android.widget.TextView textView12 = this.f454833x0;
                if (textView12 == null) {
                    kotlin.jvm.internal.o.o("singleRangeText");
                    throw null;
                }
                textView12.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cnq));
                android.view.ViewGroup viewGroup7 = this.f454831p0;
                if (viewGroup7 == null) {
                    kotlin.jvm.internal.o.o("singleHeartLayout");
                    throw null;
                }
                viewGroup7.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a8u));
            }
            if (K.f234161h == 1) {
                if (K.j()) {
                    android.widget.TextView textView13 = this.f454833x0;
                    if (textView13 == null) {
                        kotlin.jvm.internal.o.o("singleRangeText");
                        throw null;
                    }
                    textView13.setVisibility(0);
                }
                android.widget.TextView textView14 = this.f454834y0;
                if (textView14 == null) {
                    kotlin.jvm.internal.o.o("singleHeartText");
                    throw null;
                }
                android.widget.ImageView imageView2 = this.f454830l1;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("soloGiftIcon");
                    throw null;
                }
                V(textView14, imageView2);
            } else {
                android.widget.TextView textView15 = this.f454833x0;
                if (textView15 == null) {
                    kotlin.jvm.internal.o.o("singleRangeText");
                    throw null;
                }
                textView15.setVisibility(0);
                android.widget.TextView textView16 = this.f454834y0;
                if (textView16 == null) {
                    kotlin.jvm.internal.o.o("singleHeartText");
                    throw null;
                }
                W(textView16);
            }
        } else {
            super.e();
            android.view.View view2 = this.W;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (f0Var2 == null) {
            super.e();
            android.view.View view3 = this.W;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public ai2.a getBattleResultWidget() {
        lj2.s0 s0Var = this.f454832p1;
        if (s0Var != null) {
            return s0Var;
        }
        kotlin.jvm.internal.o.o("battleResultWidget");
        throw null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // oj2.m, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "VisitorSinglePkCoverAudioWidget";
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // oj2.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f454831p0;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("singleHeartLayout");
            throw null;
        }
        int id6 = viewGroup.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            H();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorSinglePkCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
