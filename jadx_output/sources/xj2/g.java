package xj2;

/* loaded from: classes10.dex */
public class g extends oj2.m {
    public android.view.ViewGroup W;

    /* renamed from: l1, reason: collision with root package name */
    public lj2.s0 f454837l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.ViewGroup f454838p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f454839x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.ImageView f454840y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
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
            lj2.s0 s0Var = this.f454837l1;
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

    @Override // wj2.w
    public void S(android.widget.TextView textView) {
        super.S(textView);
        a0();
    }

    @Override // oj2.m
    public void Z() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dkx, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.eop;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
        if (a17 != null) {
            fg2.r1 a18 = fg2.r1.a(a17);
            android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
            if (a19 != null) {
                fg2.a0 a27 = fg2.a0.a(a19);
                int i18 = com.tencent.mm.R.id.fa_;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                if (textView != null) {
                    i18 = com.tencent.mm.R.id.fag;
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag);
                    if (frameLayout != null) {
                        i18 = com.tencent.mm.R.id.fah;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah);
                        if (weImageView != null) {
                            i18 = com.tencent.mm.R.id.fak;
                            android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                            if (a28 != null) {
                                fg2.r0 a29 = fg2.r0.a(a28);
                                android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                if (a37 != null) {
                                    fg2.c1 a38 = fg2.c1.a(a37);
                                    int i19 = com.tencent.mm.R.id.faq;
                                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.faq);
                                    if (imageView != null) {
                                        i19 = com.tencent.mm.R.id.far;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.far);
                                        if (imageView2 != null) {
                                            i19 = com.tencent.mm.R.id.fay;
                                            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.fay);
                                            if (finderFixedTextView != null) {
                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                                                com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(inflate, com.tencent.mm.R.id.f484730fb0);
                                                if (mMPAGView != null) {
                                                    setFinderLiveMicStateAudioWaveIcon(mMPAGView);
                                                    setFinderLiveMicMuteIcon(frameLayout);
                                                    setFinderLiveMicMuteIconWe(weImageView);
                                                    kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
                                                    setRoot(constraintLayout);
                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = a29.f262282a;
                                                    kotlin.jvm.internal.o.f(constraintLayout2, "getRoot(...)");
                                                    setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout2);
                                                    setFinderLiveMicStateAudioAvatar(imageView);
                                                    setFinderLiveMicStateAudioName(finderFixedTextView);
                                                    setFinderLiveMicStateAudioBg(imageView2);
                                                    setFinderLiveMicHeartText(textView);
                                                    android.widget.RelativeLayout relativeLayout = a27.f261936a;
                                                    kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                                                    setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout);
                                                    android.widget.LinearLayout finderLiveMicHeartTeamLayout = a38.f261961d;
                                                    kotlin.jvm.internal.o.f(finderLiveMicHeartTeamLayout, "finderLiveMicHeartTeamLayout");
                                                    this.f454838p0 = finderLiveMicHeartTeamLayout;
                                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicTeamHeartText = a38.f261963f;
                                                    kotlin.jvm.internal.o.f(finderLiveMicTeamHeartText, "finderLiveMicTeamHeartText");
                                                    this.f454839x0 = finderLiveMicTeamHeartText;
                                                    android.widget.ImageView teamGiftIcon = a38.f261965h;
                                                    kotlin.jvm.internal.o.f(teamGiftIcon, "teamGiftIcon");
                                                    this.f454840y0 = teamGiftIcon;
                                                    android.widget.RelativeLayout relativeLayout2 = a38.f261958a;
                                                    kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
                                                    this.W = relativeLayout2;
                                                    a38.f261959b.setVisibility(8);
                                                    android.widget.RelativeLayout relativeLayout3 = a18.f262284a;
                                                    kotlin.jvm.internal.o.f(relativeLayout3, "getRoot(...)");
                                                    this.f454837l1 = new lj2.s0(relativeLayout3);
                                                    return;
                                                }
                                                i17 = com.tencent.mm.R.id.f484730fb0;
                                            }
                                        }
                                    }
                                    i17 = i19;
                                } else {
                                    i17 = com.tencent.mm.R.id.fal;
                                }
                            }
                        }
                    }
                }
                i17 = i18;
            } else {
                i17 = com.tencent.mm.R.id.f8q;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public final void a0() {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        android.view.ViewGroup root = getRoot();
        kotlin.jvm.internal.o.e(root, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        cVar.d((androidx.constraintlayout.widget.ConstraintLayout) root);
        if (n()) {
            android.view.ViewGroup viewGroup = this.W;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            cVar.c(viewGroup.getId(), 2);
            android.view.ViewGroup viewGroup2 = this.W;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            cVar.f(viewGroup2.getId(), 1, 0, 1, i65.a.b(getRoot().getContext(), 4));
            cVar.c(getMicHeartTextView().getId(), 2);
            cVar.f(getMicHeartTextView().getId(), 1, 0, 1, i65.a.b(getRoot().getContext(), 4));
        } else {
            android.view.ViewGroup viewGroup3 = this.W;
            if (viewGroup3 == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            cVar.c(viewGroup3.getId(), 1);
            android.view.ViewGroup viewGroup4 = this.W;
            if (viewGroup4 == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            cVar.f(viewGroup4.getId(), 2, 0, 2, i65.a.b(getRoot().getContext(), 4));
            cVar.c(getMicHeartTextView().getId(), 1);
            cVar.f(getMicHeartTextView().getId(), 2, 0, 2, i65.a.b(getRoot().getContext(), 4));
        }
        android.view.ViewGroup root2 = getRoot();
        kotlin.jvm.internal.o.e(root2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) root2;
        cVar.b(constraintLayout);
        constraintLayout.setConstraintSet(null);
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
            android.view.ViewGroup viewGroup = this.f454838p0;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("teamHeartLayout");
                throw null;
            }
            viewGroup.setOnClickListener(this);
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            android.view.ViewGroup viewGroup2 = this.f454838p0;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("teamHeartLayout");
                throw null;
            }
            viewGroup2.setOnClickListener(null);
        }
        lj2.t0 a08 = getPluginAbility().a0();
        if (a08 == null || (K = a08.K()) == null) {
            f0Var2 = null;
        } else if (K.h() || K.i()) {
            android.view.ViewGroup viewGroup3 = this.W;
            if (viewGroup3 == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            viewGroup3.setVisibility(0);
            getFinderLiveMicHeartText().setVisibility(8);
            a0();
            android.view.ViewGroup viewGroup4 = this.f454838p0;
            if (viewGroup4 == null) {
                kotlin.jvm.internal.o.o("teamHeartLayout");
                throw null;
            }
            viewGroup4.setVisibility(0);
            android.widget.ImageView imageView = this.f454840y0;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("teamGiftIcon");
                throw null;
            }
            imageView.setVisibility(8);
            android.widget.TextView textView = this.f454839x0;
            if (textView == null) {
                kotlin.jvm.internal.o.o("teamHeartText");
                throw null;
            }
            textView.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
            android.widget.TextView textView2 = this.f454839x0;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("teamHeartText");
                throw null;
            }
            textView2.setVisibility(8);
            if (K.f234161h == 1) {
                android.widget.TextView textView3 = this.f454839x0;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("teamHeartText");
                    throw null;
                }
                android.widget.ImageView imageView2 = this.f454840y0;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("teamGiftIcon");
                    throw null;
                }
                V(textView3, imageView2);
            } else {
                android.widget.TextView textView4 = this.f454839x0;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("teamHeartText");
                    throw null;
                }
                W(textView4);
            }
            p();
            if (n()) {
                android.view.ViewGroup viewGroup5 = this.f454838p0;
                if (viewGroup5 == null) {
                    kotlin.jvm.internal.o.o("teamHeartLayout");
                    throw null;
                }
                viewGroup5.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481798a93));
            } else {
                android.view.ViewGroup viewGroup6 = this.f454838p0;
                if (viewGroup6 == null) {
                    kotlin.jvm.internal.o.o("teamHeartLayout");
                    throw null;
                }
                viewGroup6.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481797a92));
            }
        } else {
            super.e();
            android.view.ViewGroup viewGroup7 = this.W;
            if (viewGroup7 == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            viewGroup7.setVisibility(8);
        }
        if (f0Var2 == null) {
            super.e();
            android.view.ViewGroup viewGroup8 = this.W;
            if (viewGroup8 != null) {
                viewGroup8.setVisibility(8);
            } else {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
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
        lj2.s0 s0Var = this.f454837l1;
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
        return "VisitorTeamPkCoverAudioWidget";
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorTeamPkCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f454838p0;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("teamHeartLayout");
            throw null;
        }
        int id6 = viewGroup.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            H();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveMicVisitorTeamPkCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
