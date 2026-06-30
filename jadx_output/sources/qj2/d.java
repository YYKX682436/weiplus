package qj2;

/* loaded from: classes10.dex */
public final class d extends wj2.y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // wj2.y, oj2.l
    public void a0() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488933do3, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.g9c;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.g9c);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.f1j;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.f1j);
            if (constraintLayout != null) {
                i17 = com.tencent.mm.R.id.afh;
                android.widget.Space space = (android.widget.Space) x4.b.a(inflate, com.tencent.mm.R.id.afh);
                if (space != null) {
                    i17 = com.tencent.mm.R.id.ejn;
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.ejn);
                    if (frameLayout != null) {
                        i17 = com.tencent.mm.R.id.eop;
                        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
                        if (a17 != null) {
                            fg2.j1 a18 = fg2.j1.a(a17);
                            android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f484566ep0);
                            if (a19 != null) {
                                fg2.k1 a27 = fg2.k1.a(a19);
                                int i18 = com.tencent.mm.R.id.f484572er0;
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.f484572er0);
                                if (constraintLayout2 != null) {
                                    i18 = com.tencent.mm.R.id.ewh;
                                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.ewh);
                                    if (frameLayout2 != null) {
                                        i18 = com.tencent.mm.R.id.f484711f85;
                                        android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.f484711f85);
                                        if (a28 != null) {
                                            fg2.u a29 = fg2.u.a(a28);
                                            android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                                            if (a37 != null) {
                                                fg2.y a38 = fg2.y.a(a37);
                                                int i19 = com.tencent.mm.R.id.f_i;
                                                android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f_i);
                                                if (frameLayout3 != null) {
                                                    i19 = com.tencent.mm.R.id.fa_;
                                                    com.tencent.mm.plugin.finder.live.mic.widget.VisibilityTextView visibilityTextView = (com.tencent.mm.plugin.finder.live.mic.widget.VisibilityTextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                                                    if (visibilityTextView != null) {
                                                        i19 = com.tencent.mm.R.id.fak;
                                                        android.view.View a39 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                                        if (a39 != null) {
                                                            fg2.r0 a47 = fg2.r0.a(a39);
                                                            android.view.View a48 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                                            if (a48 != null) {
                                                                fg2.y0 a49 = fg2.y0.a(a48);
                                                                com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
                                                                android.view.View a57 = x4.b.a(inflate, com.tencent.mm.R.id.fqg);
                                                                if (a57 != null) {
                                                                    fg2.v1 a58 = fg2.v1.a(a57);
                                                                    int i27 = com.tencent.mm.R.id.r78;
                                                                    if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.r78)) != null) {
                                                                        i27 = com.tencent.mm.R.id.f486317qn3;
                                                                        if (((android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486317qn3)) != null) {
                                                                            kotlin.jvm.internal.o.f(roundCornerConstraintLayout, "getRoot(...)");
                                                                            setRoot(roundCornerConstraintLayout);
                                                                            setAudioPkLayout(constraintLayout);
                                                                            setFinderLiveMicAnchorAudioLayout(frameLayout3);
                                                                            android.widget.RelativeLayout relativeLayout = a58.f262383a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                                                                            setFinderLiveVoteBubbleRoot(relativeLayout);
                                                                            android.widget.RelativeLayout relativeLayout2 = a38.f262396a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
                                                                            setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
                                                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = a47.f262282a;
                                                                            kotlin.jvm.internal.o.f(constraintLayout3, "getRoot(...)");
                                                                            setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout3);
                                                                            android.widget.RelativeLayout relativeLayout3 = a29.f262342a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout3, "getRoot(...)");
                                                                            setFinderLiveLotteryBubbleRoot(relativeLayout3);
                                                                            setFinderLiveMicHeartText(visibilityTextView);
                                                                            android.widget.RelativeLayout relativeLayout4 = a27.f262115a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout4, "getRoot(...)");
                                                                            setAnchorBattleTipWidget(new lj2.c0(relativeLayout4, getPluginAbility()));
                                                                            android.widget.RelativeLayout relativeLayout5 = a18.f262109a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout5, "getRoot(...)");
                                                                            setAnchorBattleResultWidget(new lj2.p(relativeLayout5));
                                                                            android.widget.RelativeLayout relativeLayout6 = a49.f262397a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout6, "getRoot(...)");
                                                                            setPkHearLayout(relativeLayout6);
                                                                            androidx.constraintlayout.widget.ConstraintLayout finderLiveMicHeartRangeLayout = a49.f262398b;
                                                                            kotlin.jvm.internal.o.f(finderLiveMicHeartRangeLayout, "finderLiveMicHeartRangeLayout");
                                                                            setSingleHeartLayout(finderLiveMicHeartRangeLayout);
                                                                            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicHeartRangeText = a49.f262399c;
                                                                            kotlin.jvm.internal.o.f(finderLiveMicHeartRangeText, "finderLiveMicHeartRangeText");
                                                                            setSingleRangeText(finderLiveMicHeartRangeText);
                                                                            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicSingleHeartText = a49.f262401e;
                                                                            kotlin.jvm.internal.o.f(finderLiveMicSingleHeartText, "finderLiveMicSingleHeartText");
                                                                            setSingleHeartText(finderLiveMicSingleHeartText);
                                                                            android.widget.ImageView soloGiftIcon = a49.f262403g;
                                                                            kotlin.jvm.internal.o.f(soloGiftIcon, "soloGiftIcon");
                                                                            setSoloGiftIcon(soloGiftIcon);
                                                                            android.widget.ImageView teamGiftIcon = a49.f262404h;
                                                                            kotlin.jvm.internal.o.f(teamGiftIcon, "teamGiftIcon");
                                                                            setTeamGiftIcon(teamGiftIcon);
                                                                            zl2.r4.f473950a.b3(getSingleRangeText());
                                                                            android.widget.LinearLayout finderLiveMicHeartTeamLayout = a49.f262400d;
                                                                            kotlin.jvm.internal.o.f(finderLiveMicHeartTeamLayout, "finderLiveMicHeartTeamLayout");
                                                                            setTeamHeartLayout(finderLiveMicHeartTeamLayout);
                                                                            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicTeamHeartText = a49.f262402f;
                                                                            kotlin.jvm.internal.o.f(finderLiveMicTeamHeartText, "finderLiveMicTeamHeartText");
                                                                            setTeamHeartText(finderLiveMicTeamHeartText);
                                                                            setBattleBarSpace(space);
                                                                            setBubbleLayout(constraintLayout2);
                                                                            setAnchorCriticalLayoutView(frameLayout);
                                                                            setAnchorCriticalGiftLayout(frameLayout2);
                                                                            setAnchorAudioCoverView(imageView);
                                                                            android.view.View findViewById = getRoot().findViewById(com.tencent.mm.R.id.f486317qn3);
                                                                            android.widget.TextView textView = (android.widget.TextView) findViewById;
                                                                            kotlin.jvm.internal.o.d(textView);
                                                                            com.tencent.mm.ui.fk.a(textView);
                                                                            kotlin.jvm.internal.o.f(findViewById, "also(...)");
                                                                            setPkExtraView((android.widget.TextView) findViewById);
                                                                            getBubbleLayout().addOnLayoutChangeListener(new qj2.c(this));
                                                                            return;
                                                                        }
                                                                    }
                                                                    i17 = i27;
                                                                } else {
                                                                    i17 = com.tencent.mm.R.id.fqg;
                                                                }
                                                            } else {
                                                                i17 = com.tencent.mm.R.id.fal;
                                                            }
                                                        }
                                                    }
                                                }
                                                i17 = i19;
                                            } else {
                                                i17 = com.tencent.mm.R.id.f8q;
                                            }
                                        }
                                    }
                                }
                                i17 = i18;
                            } else {
                                i17 = com.tencent.mm.R.id.f484566ep0;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // wj2.y
    public void b0() {
    }

    @Override // wj2.y, oj2.l, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        c0();
        dk2.u4 K = getPluginAbility().a0().K();
        if (K != null) {
            if (K.h() || K.i()) {
                android.view.ViewGroup pkHearLayout = getPkHearLayout();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(pkHearLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/cross/FinderLiveMicCrossRoomAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                pkHearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(pkHearLayout, "com/tencent/mm/plugin/finder/live/mic/widget/cross/FinderLiveMicCrossRoomAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView finderLiveMicHeartText = getFinderLiveMicHeartText();
                if (finderLiveMicHeartText != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(finderLiveMicHeartText, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/cross/FinderLiveMicCrossRoomAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveMicHeartText.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(finderLiveMicHeartText, "com/tencent/mm/plugin/finder/live/mic/widget/cross/FinderLiveMicCrossRoomAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (K.f234160g == 2) {
                    f0(K);
                } else {
                    e0(K);
                }
            } else {
                super.e();
                getPkHearLayout().setVisibility(8);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.e();
            getPkHearLayout().setVisibility(8);
        }
    }

    @Override // wj2.y, oj2.l, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.y, oj2.l, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // wj2.y, lj2.j
    public java.lang.String getTagString() {
        return "CrossRoomAnchorSelfWidget";
    }

    @Override // wj2.y, lj2.j
    public boolean n() {
        return true;
    }
}
