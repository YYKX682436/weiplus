package wj2;

/* loaded from: classes10.dex */
public final class e0 extends oj2.o {
    public android.view.ViewGroup T;
    public android.widget.Space U;
    public android.widget.FrameLayout V;
    public boolean W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ImageView f446668l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.ViewGroup f446669p0;

    /* renamed from: p1, reason: collision with root package name */
    public wj2.j0 f446670p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f446671x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.TextView f446672y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    private final int getAvatarSize() {
        return (getCurWidgetMode() == pm2.a.f356854g || this.W) ? getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs) : getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r3.size() < 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479644bj);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
    
        if (r1.size() >= 2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int getGiftMargin() {
        /*
            r8 = this;
            pm2.a r0 = r8.getCurWidgetMode()
            pm2.a r1 = pm2.a.f356851d
            if (r0 != r1) goto Lb3
            km2.q r0 = r8.getBindLinkMicUser()
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.Boolean r0 = r0.f309189t
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.b(r0, r2)
            goto L19
        L18:
            r0 = r1
        L19:
            r2 = 2
            if (r0 == 0) goto L58
            lj2.v0 r0 = r8.getPluginAbility()
            lj2.t0 r0 = r0.a0()
            java.util.List r0 = r0.l()
            monitor-enter(r0)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L55
        L32:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L55
            r6 = r5
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> L55
            java.lang.Boolean r6 = r6.f309189t     // Catch: java.lang.Throwable -> L55
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L55
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L32
            r3.add(r5)     // Catch: java.lang.Throwable -> L55
            goto L32
        L4d:
            monitor-exit(r0)
            int r0 = r3.size()
            if (r0 >= r2) goto La0
            goto L58
        L55:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L58:
            km2.q r0 = r8.getBindLinkMicUser()
            if (r0 == 0) goto L66
            java.lang.Boolean r0 = r0.f309189t
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.jvm.internal.o.b(r0, r1)
        L66:
            if (r1 == 0) goto Lb3
            lj2.v0 r0 = r8.getPluginAbility()
            lj2.t0 r0 = r0.a0()
            java.util.List r0 = r0.l()
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb0
            r1.<init>()     // Catch: java.lang.Throwable -> Lb0
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> Lb0
        L7e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L99
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lb0
            r5 = r4
            km2.q r5 = (km2.q) r5     // Catch: java.lang.Throwable -> Lb0
            java.lang.Boolean r5 = r5.f309189t     // Catch: java.lang.Throwable -> Lb0
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = kotlin.jvm.internal.o.b(r5, r6)     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L7e
            r1.add(r4)     // Catch: java.lang.Throwable -> Lb0
            goto L7e
        L99:
            monitor-exit(r0)
            int r0 = r1.size()
            if (r0 < r2) goto Lb3
        La0:
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165386(0x7f0700ca, float:1.7944988E38)
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
        Lb0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lb3:
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165533(0x7f07015d, float:1.7945286E38)
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.e0.getGiftMargin():int");
    }

    private final int getMuteIconCircleSize() {
        return (getCurWidgetMode() == pm2.a.f356854g || this.W) ? getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9) : getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479673ca);
    }

    private final int getMuteIconSize() {
        return (getCurWidgetMode() == pm2.a.f356854g || this.W) ? getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) : getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
    }

    @Override // oj2.o, wj2.w
    public void R() {
        super.R();
        android.widget.Space space = this.U;
        if (space != null) {
            space.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("anchorCriticalLayoutSpace");
            throw null;
        }
    }

    @Override // oj2.o, sj2.m
    public void a() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationStart");
    }

    @Override // oj2.o
    public void a0() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.avc, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.che;
        if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.che)) != null) {
            i17 = com.tencent.mm.R.id.ejo;
            android.widget.Space space = (android.widget.Space) x4.b.a(inflate, com.tencent.mm.R.id.ejo);
            if (space != null) {
                i17 = com.tencent.mm.R.id.ewh;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.ewh);
                if (frameLayout != null) {
                    i17 = com.tencent.mm.R.id.tig;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.tig);
                    if (weImageView != null) {
                        i17 = com.tencent.mm.R.id.tka;
                        if (((com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer) x4.b.a(inflate, com.tencent.mm.R.id.tka)) != null) {
                            i17 = com.tencent.mm.R.id.f8p;
                            android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f8p);
                            if (a17 != null) {
                                fg2.a0 a18 = fg2.a0.a(a17);
                                android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                                if (a19 != null) {
                                    fg2.y a27 = fg2.y.a(a19);
                                    int i18 = com.tencent.mm.R.id.fa_;
                                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                                    if (textView != null) {
                                        i18 = com.tencent.mm.R.id.fag;
                                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag);
                                        if (frameLayout2 != null) {
                                            i18 = com.tencent.mm.R.id.fah;
                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah);
                                            if (weImageView2 != null) {
                                                i18 = com.tencent.mm.R.id.fak;
                                                android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                                if (a28 != null) {
                                                    fg2.r0 a29 = fg2.r0.a(a28);
                                                    android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.rmf);
                                                    if (a37 != null) {
                                                        fg2.t0 a38 = fg2.t0.a(a37);
                                                        android.view.View a39 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                                        if (a39 != null) {
                                                            fg2.x0 a47 = fg2.x0.a(a39);
                                                            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.f484836fo0);
                                                            if (finderFixedTextView != null) {
                                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                                                                setFinderLiveMicMuteIcon(frameLayout2);
                                                                setFinderLiveMicMuteIconWe(weImageView2);
                                                                kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
                                                                setRoot(constraintLayout);
                                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = a29.f262282a;
                                                                kotlin.jvm.internal.o.f(constraintLayout2, "getRoot(...)");
                                                                setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout2);
                                                                setFinderLiveVideoLinkBottomBarName(finderFixedTextView);
                                                                setFinderLiveFinderLogo(weImageView);
                                                                android.widget.RelativeLayout relativeLayout = a47.f262391a;
                                                                kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                                                                this.f446669p0 = relativeLayout;
                                                                android.widget.LinearLayout finderLiveMicHeartTeamLayout = a47.f262392b;
                                                                kotlin.jvm.internal.o.f(finderLiveMicHeartTeamLayout, "finderLiveMicHeartTeamLayout");
                                                                this.f446671x0 = finderLiveMicHeartTeamLayout;
                                                                com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicTeamHeartText = a47.f262393c;
                                                                kotlin.jvm.internal.o.f(finderLiveMicTeamHeartText, "finderLiveMicTeamHeartText");
                                                                this.f446672y0 = finderLiveMicTeamHeartText;
                                                                setFinderLiveMicHeartText(textView);
                                                                android.widget.ImageView teamGiftIcon = a47.f262394d;
                                                                kotlin.jvm.internal.o.f(teamGiftIcon, "teamGiftIcon");
                                                                this.f446668l1 = teamGiftIcon;
                                                                android.widget.RelativeLayout relativeLayout2 = a27.f262396a;
                                                                kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
                                                                setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
                                                                android.widget.RelativeLayout relativeLayout3 = a18.f261936a;
                                                                kotlin.jvm.internal.o.f(relativeLayout3, "getRoot(...)");
                                                                this.T = relativeLayout3;
                                                                this.U = space;
                                                                this.V = frameLayout;
                                                                android.widget.LinearLayout linearLayout = a38.f262315a;
                                                                kotlin.jvm.internal.o.f(linearLayout, "getRoot(...)");
                                                                this.f446670p1 = new wj2.j0(linearLayout, getPluginAbility(), getService());
                                                                return;
                                                            }
                                                            i17 = com.tencent.mm.R.id.f484836fo0;
                                                        } else {
                                                            i17 = com.tencent.mm.R.id.fal;
                                                        }
                                                    } else {
                                                        i17 = com.tencent.mm.R.id.rmf;
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
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // oj2.o, sj2.m
    public void d() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationEnd");
    }

    @Override // oj2.o, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        java.lang.Throwable th6;
        java.lang.String str;
        dk2.u4 K = getPluginAbility().a0().K();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (K != null) {
            android.view.ViewGroup viewGroup = this.f446671x0;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("teamHeartLayout");
                throw null;
            }
            viewGroup.setOnClickListener(this);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.view.ViewGroup viewGroup2 = this.f446671x0;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("teamHeartLayout");
                throw null;
            }
            viewGroup2.setOnClickListener(null);
        }
        boolean x17 = getPluginAbility().a0().x();
        dk2.u4 K2 = getPluginAbility().a0().K();
        if (K2 == null) {
            th6 = null;
            f0Var2 = null;
        } else if (K2.h() || K2.i()) {
            android.view.ViewGroup viewGroup3 = this.f446669p0;
            if (viewGroup3 == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewGroup3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverVideoWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(viewGroup3, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverVideoWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView finderLiveMicHeartText = getFinderLiveMicHeartText();
            if (finderLiveMicHeartText != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(finderLiveMicHeartText, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverVideoWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderLiveMicHeartText.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(finderLiveMicHeartText, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverVideoWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.util.List g17 = getPluginAbility().a0().g();
            if (x17 && g17.size() == 1 && (!getPluginAbility().a0().l().isEmpty())) {
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                android.view.ViewGroup root = getRoot();
                kotlin.jvm.internal.o.e(root, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                cVar.d((androidx.constraintlayout.widget.ConstraintLayout) root);
                if (m()) {
                    android.view.ViewGroup viewGroup4 = this.f446669p0;
                    if (viewGroup4 == null) {
                        kotlin.jvm.internal.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.c(viewGroup4.getId(), 1);
                    android.view.ViewGroup viewGroup5 = this.f446669p0;
                    if (viewGroup5 == null) {
                        kotlin.jvm.internal.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.c(viewGroup5.getId(), 2);
                    android.view.ViewGroup viewGroup6 = this.f446669p0;
                    if (viewGroup6 == null) {
                        kotlin.jvm.internal.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.f(viewGroup6.getId(), 1, 0, 1, i65.a.b(getRoot().getContext(), 8));
                } else {
                    android.view.ViewGroup viewGroup7 = this.f446669p0;
                    if (viewGroup7 == null) {
                        kotlin.jvm.internal.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.c(viewGroup7.getId(), 1);
                    android.view.ViewGroup viewGroup8 = this.f446669p0;
                    if (viewGroup8 == null) {
                        kotlin.jvm.internal.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.c(viewGroup8.getId(), 2);
                    android.view.ViewGroup viewGroup9 = this.f446669p0;
                    if (viewGroup9 == null) {
                        kotlin.jvm.internal.o.o("pkHearLayout");
                        throw null;
                    }
                    cVar.f(viewGroup9.getId(), 2, 0, 2, i65.a.b(getRoot().getContext(), 8));
                }
                android.view.ViewGroup root2 = getRoot();
                kotlin.jvm.internal.o.e(root2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) root2;
                cVar.b(constraintLayout);
                constraintLayout.setConstraintSet(null);
                android.view.ViewGroup viewGroup10 = this.f446671x0;
                if (viewGroup10 == null) {
                    kotlin.jvm.internal.o.o("teamHeartLayout");
                    throw null;
                }
                viewGroup10.setVisibility(0);
                android.widget.ImageView imageView = this.f446668l1;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("teamGiftIcon");
                    throw null;
                }
                imageView.setVisibility(8);
                android.widget.TextView textView = this.f446672y0;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("teamHeartText");
                    throw null;
                }
                textView.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
                android.widget.TextView textView2 = this.f446672y0;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("teamHeartText");
                    throw null;
                }
                textView2.setVisibility(8);
                if (K2.f234161h == 1) {
                    android.widget.TextView textView3 = this.f446672y0;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("teamHeartText");
                        throw null;
                    }
                    android.widget.ImageView imageView2 = this.f446668l1;
                    if (imageView2 == null) {
                        kotlin.jvm.internal.o.o("teamGiftIcon");
                        throw null;
                    }
                    V(textView3, imageView2);
                } else {
                    android.widget.TextView textView4 = this.f446672y0;
                    if (textView4 == null) {
                        kotlin.jvm.internal.o.o("teamHeartText");
                        throw null;
                    }
                    W(textView4);
                }
                lj2.t0 a07 = getPluginAbility().a0();
                km2.q bindLinkMicUser = getBindLinkMicUser();
                if (bindLinkMicUser == null || (str = bindLinkMicUser.f309170a) == null) {
                    str = "";
                }
                fj2.k m17 = a07.m(str);
                if ((m17 == null ? -1 : wj2.d0.f446666b[m17.ordinal()]) == 1) {
                    android.view.ViewGroup viewGroup11 = this.f446671x0;
                    if (viewGroup11 == null) {
                        kotlin.jvm.internal.o.o("teamHeartLayout");
                        throw null;
                    }
                    viewGroup11.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481798a93));
                } else {
                    android.view.ViewGroup viewGroup12 = this.f446671x0;
                    if (viewGroup12 == null) {
                        kotlin.jvm.internal.o.o("teamHeartLayout");
                        throw null;
                    }
                    viewGroup12.setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481797a92));
                }
            }
            th6 = null;
        } else {
            super.e();
            android.view.ViewGroup viewGroup13 = this.f446669p0;
            if (viewGroup13 == null) {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw null;
            }
            viewGroup13.setVisibility(8);
            th6 = null;
        }
        if (f0Var2 == null) {
            super.e();
            android.view.ViewGroup viewGroup14 = this.f446669p0;
            if (viewGroup14 != null) {
                viewGroup14.setVisibility(8);
            } else {
                kotlin.jvm.internal.o.o("pkHearLayout");
                throw th6;
            }
        }
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public android.widget.FrameLayout getCriticalGiftLayout() {
        android.widget.FrameLayout frameLayout = this.V;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("anchorCriticalGiftLayout");
        throw null;
    }

    @Override // oj2.o, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // oj2.o, wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        return getFinderLiveMicNewNormalMicGiftItemLayout();
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public android.view.ViewGroup getLuckyMoneyRootView() {
        com.tencent.mars.xlog.Log.i(getTAG(), "getLuckyMoneyRootView");
        if (wj2.d0.f446665a[getCurWidgetMode().ordinal()] != 1) {
            return getFinderLiveLuckyMoneyBubbleUiRoot();
        }
        android.view.ViewGroup viewGroup = this.T;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveLuckyMoneyBubbleSmallUiRoot");
        throw null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "CoverVideoWidget";
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // oj2.o, sj2.m
    public void h() {
        super.h();
        android.widget.FrameLayout criticalGiftLayout = getCriticalGiftLayout();
        if (criticalGiftLayout == null) {
            return;
        }
        criticalGiftLayout.setVisibility(8);
    }

    @Override // lj2.u0
    public void j(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.widget.Space space = this.U;
        if (space == null) {
            kotlin.jvm.internal.o.o("anchorCriticalLayoutSpace");
            throw null;
        }
        if (i17 != space.getVisibility()) {
            u4.g1.a(getRoot(), null);
            android.widget.Space space2 = this.U;
            if (space2 == null) {
                kotlin.jvm.internal.o.o("anchorCriticalLayoutSpace");
                throw null;
            }
            space2.setVisibility(i17);
            getRoot().requestLayout();
            com.tencent.mars.xlog.Log.i(getTAG(), "onNotifyCriticalLayoutShowChange: " + i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r1.size() >= 2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // wj2.w, lj2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(pm2.a r9, xh2.a r10) {
        /*
            r8 = this;
            java.lang.String r0 = "widgetMode"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r10, r0)
            lj2.v0 r0 = r8.getPluginAbility()
            lj2.t0 r0 = r0.a0()
            java.util.List r1 = r0.g()
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L87
            java.util.List r1 = r0.l()
            monitor-enter(r1)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r3.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Throwable -> L84
        L2c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L48
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L84
            r6 = r5
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r6 = r6.f309189t     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L84
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)     // Catch: java.lang.Throwable -> L84
            r6 = r6 ^ r2
            if (r6 == 0) goto L2c
            r3.add(r5)     // Catch: java.lang.Throwable -> L84
            goto L2c
        L48:
            monitor-exit(r1)
            int r1 = r3.size()
            r3 = 2
            if (r1 >= r3) goto L88
            java.util.List r0 = r0.l()
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81
            r1.<init>()     // Catch: java.lang.Throwable -> L81
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L81
        L5e:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L79
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L81
            r6 = r5
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> L81
            java.lang.Boolean r6 = r6.f309189t     // Catch: java.lang.Throwable -> L81
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L81
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)     // Catch: java.lang.Throwable -> L81
            if (r6 == 0) goto L5e
            r1.add(r5)     // Catch: java.lang.Throwable -> L81
            goto L5e
        L79:
            monitor-exit(r0)
            int r0 = r1.size()
            if (r0 < r3) goto L87
            goto L88
        L81:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L84:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        L87:
            r2 = 0
        L88:
            r8.W = r2
            super.l(r9, r10)
            wj2.j0 r9 = r8.f446670p1
            if (r9 == 0) goto L9d
            lj2.e0 r0 = new lj2.e0
            android.view.View r1 = r9.f446689a
            lj2.f0 r2 = lj2.f0.f318855d
            r0.<init>(r1, r2)
            r9.b(r10, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.e0.l(pm2.a, xh2.a):void");
    }

    @Override // oj2.o, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverVideoWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f446671x0;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("teamHeartLayout");
            throw null;
        }
        int id6 = viewGroup.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            H();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverVideoWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wj2.j0 j0Var = this.f446670p1;
        if (j0Var != null) {
            j0Var.c();
        }
    }

    @Override // wj2.w
    public void x() {
        android.view.ViewGroup.LayoutParams layoutParams = getFinderLiveMicNewNormalMicGiftItemLayout().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = getGiftMargin();
            marginLayoutParams.rightMargin = getGiftMargin();
            marginLayoutParams.bottomMargin = getGiftMargin();
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = getFinderLiveMicMuteIcon().getLayoutParams();
        if (layoutParams2 != null) {
            int muteIconSize = getMuteIconSize();
            layoutParams2.width = muteIconSize;
            layoutParams2.height = muteIconSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = getFinderLiveMicMuteIconWe().getLayoutParams();
        if (layoutParams3 != null) {
            int muteIconCircleSize = getMuteIconCircleSize();
            layoutParams3.width = muteIconCircleSize;
            layoutParams3.height = muteIconCircleSize;
        }
    }
}
