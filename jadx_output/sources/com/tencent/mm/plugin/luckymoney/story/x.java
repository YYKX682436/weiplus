package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class x implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public int f145925a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f145926b = 0;

    /* renamed from: c, reason: collision with root package name */
    public float f145927c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145928d;

    public x(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145928d = envelopeAppBarLayout;
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        int i18;
        in5.s0 s0Var;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager envelopeStoryViewPager;
        android.widget.TextView textView;
        android.widget.LinearLayout linearLayout;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager envelopeStoryViewPager2;
        android.view.View view;
        int i19;
        int abs = java.lang.Math.abs(i17);
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145928d;
        int i27 = (totalScrollRange - envelopeAppBarLayout.f145796z1) - abs;
        int totalScrollRange2 = appBarLayout.getTotalScrollRange();
        int i28 = envelopeAppBarLayout.f145796z1;
        float f17 = i27 / ((totalScrollRange2 - i28) * 1.0f);
        float f18 = 1.0f - f17;
        boolean z17 = envelopeAppBarLayout.L1;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (!z17) {
            float f19 = 1.0f - f18;
            envelopeAppBarLayout.f145795z.setAlpha(f19);
            if (abs <= envelopeAppBarLayout.f145782p1 || envelopeAppBarLayout.f145790x0 || envelopeAppBarLayout.K1 == 2) {
                envelopeAppBarLayout.f145784s.setAlpha(0.0f);
                envelopeAppBarLayout.f145785t.setAlpha(0.0f);
            } else {
                int totalScrollRange3 = appBarLayout.getTotalScrollRange() - i28;
                int i29 = envelopeAppBarLayout.f145782p1;
                float f27 = (abs - i29) / ((totalScrollRange3 - i29) * 1.0f);
                envelopeAppBarLayout.f145784s.setAlpha(f27);
                envelopeAppBarLayout.f145785t.setAlpha(f27);
            }
            envelopeAppBarLayout.N.setAlpha(f19);
        }
        if (envelopeAppBarLayout.f145790x0 && i27 >= 0 && i27 != (i19 = this.f145926b)) {
            java.lang.Math.max(0, i19);
            envelopeAppBarLayout.f145788w.setTranslationY((-i17) / 2.0f);
            envelopeAppBarLayout.f145788w.getTranslationY();
        }
        if (envelopeAppBarLayout.f145792y != null) {
            int i37 = envelopeAppBarLayout.K1;
            if (i37 == 2) {
                if (appBarLayout.getTotalScrollRange() - abs == 0 && this.f145925a != abs) {
                    envelopeAppBarLayout.f145792y.setAlpha(0.0f);
                    if (envelopeAppBarLayout.i()) {
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = envelopeAppBarLayout.U;
                        android.view.View view2 = luckyMoneyNewDetailUI.mToplinkArea;
                        if (view2 != null && luckyMoneyNewDetailUI.f146240z2 != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(valueOf);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            envelopeAppBarLayout.U.f146240z2.setVisibility(8);
                        }
                    } else {
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = envelopeAppBarLayout.V;
                        if (luckyMoneyDetailUI != null && (view = luckyMoneyDetailUI.f146111y2) != null && luckyMoneyDetailUI.f146114z2 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(valueOf);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            envelopeAppBarLayout.V.f146114z2.setVisibility(8);
                        }
                    }
                } else if (this.f145927c != f18) {
                    envelopeAppBarLayout.f145792y.setAlpha(f18);
                    if (envelopeAppBarLayout.i()) {
                        android.widget.LinearLayout linearLayout2 = envelopeAppBarLayout.U.X;
                        if (linearLayout2 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList3.add(java.lang.Float.valueOf(f18));
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(linearLayout2, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            linearLayout2.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                            yj0.a.f(linearLayout2, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                        android.view.View view3 = envelopeAppBarLayout.U.mToplinkArea;
                        if (view3 != null) {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                            arrayList4.add(java.lang.Float.valueOf(f18));
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view3.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                        android.widget.LinearLayout linearLayout3 = envelopeAppBarLayout.U.f146211p0;
                        if (linearLayout3 != null) {
                            linearLayout3.setAlpha(1.0f - f18);
                            if (f18 == 0.0f && (envelopeStoryViewPager2 = envelopeAppBarLayout.f145788w) != null && envelopeStoryViewPager2.h1(envelopeAppBarLayout.A1)) {
                                android.widget.LinearLayout linearLayout4 = envelopeAppBarLayout.U.f146211p0;
                                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) linearLayout4.getLayoutParams();
                                marginLayoutParams.rightMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40);
                                linearLayout4.setLayoutParams(marginLayoutParams);
                            }
                        }
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI2 = envelopeAppBarLayout.U;
                        if (luckyMoneyNewDetailUI2 != null && (linearLayout = luckyMoneyNewDetailUI2.f146198l1) != null) {
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                            arrayList5.add(java.lang.Float.valueOf(f18));
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(linearLayout, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            linearLayout.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                            yj0.a.f(linearLayout, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI3 = envelopeAppBarLayout.U;
                        if (luckyMoneyNewDetailUI3 != null && (textView = luckyMoneyNewDetailUI3.f146240z2) != null) {
                            if (f18 == 0.0f) {
                                textView.setVisibility(8);
                            } else {
                                textView.setVisibility(0);
                            }
                        }
                    } else {
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI2 = envelopeAppBarLayout.V;
                        if (luckyMoneyDetailUI2 != null) {
                            android.widget.LinearLayout linearLayout5 = luckyMoneyDetailUI2.X;
                            if (linearLayout5 != null) {
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                                arrayList6.add(java.lang.Float.valueOf(f18));
                                java.util.Collections.reverse(arrayList6);
                                yj0.a.d(linearLayout5, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                linearLayout5.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
                                yj0.a.f(linearLayout5, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            }
                            android.view.View view4 = envelopeAppBarLayout.V.f146111y2;
                            if (view4 != null) {
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                                arrayList7.add(java.lang.Float.valueOf(f18));
                                java.util.Collections.reverse(arrayList7);
                                yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                view4.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
                                yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            }
                            android.widget.LinearLayout linearLayout6 = envelopeAppBarLayout.V.f146087p0;
                            if (linearLayout6 != null) {
                                linearLayout6.setAlpha(1.0f - f18);
                                if (f18 == 0.0f && (envelopeStoryViewPager = envelopeAppBarLayout.f145788w) != null && envelopeStoryViewPager.h1(envelopeAppBarLayout.A1)) {
                                    android.widget.LinearLayout linearLayout7 = envelopeAppBarLayout.V.f146087p0;
                                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) linearLayout7.getLayoutParams();
                                    marginLayoutParams2.rightMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40);
                                    linearLayout7.setLayoutParams(marginLayoutParams2);
                                }
                            }
                            android.widget.LinearLayout linearLayout8 = envelopeAppBarLayout.V.f146074l1;
                            if (linearLayout8 != null) {
                                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                                arrayList8.add(java.lang.Float.valueOf(f18));
                                java.util.Collections.reverse(arrayList8);
                                yj0.a.d(linearLayout8, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                linearLayout8.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
                                yj0.a.f(linearLayout8, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            }
                            android.widget.TextView textView2 = envelopeAppBarLayout.V.f146114z2;
                            if (textView2 != null) {
                                if (f18 == 0.0f) {
                                    textView2.setVisibility(8);
                                } else {
                                    textView2.setVisibility(0);
                                }
                            }
                        }
                    }
                }
                this.f145927c = f18;
            } else if (i37 == 1) {
                int totalScrollRange4 = appBarLayout.getTotalScrollRange() - abs;
                if (totalScrollRange4 <= i28) {
                    envelopeAppBarLayout.f145792y.setAlpha(totalScrollRange4 / (i28 * 1.0f));
                } else {
                    envelopeAppBarLayout.f145792y.setAlpha(1.0f);
                }
            }
        }
        if (appBarLayout.getTotalScrollRange() - abs == 0 && this.f145925a != abs) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "story view collapse");
            envelopeAppBarLayout.P.setClickable(false);
            if (envelopeAppBarLayout.O1 || envelopeAppBarLayout.N1) {
                envelopeAppBarLayout.N1 = false;
                envelopeAppBarLayout.O1 = false;
                envelopeAppBarLayout.D1.f145805g = false;
                com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager envelopeStoryViewPager3 = envelopeAppBarLayout.f145788w;
                envelopeStoryViewPager3.needLoopPlay = false;
                envelopeStoryViewPager3.f145816o2.removeMessages(1);
                com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = envelopeStoryViewPager3.storyVideoManager;
                if (envelopeStoryVideoManager != null) {
                    envelopeStoryVideoManager.f145809n = null;
                }
                envelopeAppBarLayout.j(true);
                if (envelopeAppBarLayout.i()) {
                    ((com.tencent.mm.plugin.luckymoney.ui.j7) envelopeAppBarLayout.U.component(com.tencent.mm.plugin.luckymoney.ui.j7.class)).O6(false);
                } else {
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI3 = envelopeAppBarLayout.V;
                    if (luckyMoneyDetailUI3 != null) {
                        ((com.tencent.mm.plugin.luckymoney.ui.o3) luckyMoneyDetailUI3.component(com.tencent.mm.plugin.luckymoney.ui.o3.class)).O6(false);
                    }
                }
                if (envelopeAppBarLayout.K1 == 2) {
                    if (envelopeAppBarLayout.i()) {
                        envelopeAppBarLayout.U.o7(true);
                    } else {
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI4 = envelopeAppBarLayout.V;
                        if (luckyMoneyDetailUI4 != null) {
                            luckyMoneyDetailUI4.j7(true);
                        }
                    }
                    envelopeAppBarLayout.D1.d(envelopeAppBarLayout.A1);
                }
                envelopeAppBarLayout.m();
                if (envelopeAppBarLayout.V1) {
                    envelopeAppBarLayout.V1 = false;
                    int i38 = envelopeAppBarLayout.K1;
                    if (i38 == 1 || i38 == 2) {
                        com.tencent.mm.plugin.luckymoney.story.g1.a(2);
                    }
                    gb3.n.a(10);
                } else {
                    int i39 = envelopeAppBarLayout.K1;
                    if (i39 == 1 || i39 == 2) {
                        com.tencent.mm.plugin.luckymoney.story.g1.a(1);
                    }
                    gb3.n.a(9);
                }
            }
        } else if (abs == 0 && this.f145925a != abs) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "story view expand");
            envelopeAppBarLayout.P.setClickable(true);
            if (!envelopeAppBarLayout.N1) {
                envelopeAppBarLayout.N1 = true;
                envelopeAppBarLayout.O1 = false;
                envelopeAppBarLayout.D1.f145805g = true;
                com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryViewPager envelopeStoryViewPager4 = envelopeAppBarLayout.f145788w;
                envelopeStoryViewPager4.needLoopPlay = false;
                envelopeStoryViewPager4.f145816o2.removeMessages(1);
                com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager2 = envelopeStoryViewPager4.storyVideoManager;
                if (envelopeStoryVideoManager2 != null) {
                    envelopeStoryVideoManager2.f145809n = null;
                }
                if (envelopeAppBarLayout.i()) {
                    ((com.tencent.mm.plugin.luckymoney.ui.j7) envelopeAppBarLayout.U.component(com.tencent.mm.plugin.luckymoney.ui.j7.class)).O6(true);
                } else {
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI5 = envelopeAppBarLayout.V;
                    if (luckyMoneyDetailUI5 != null) {
                        ((com.tencent.mm.plugin.luckymoney.ui.o3) luckyMoneyDetailUI5.component(com.tencent.mm.plugin.luckymoney.ui.o3.class)).O6(true);
                    }
                }
                if (envelopeAppBarLayout.f145788w.h1(envelopeAppBarLayout.A1) && (s0Var = (in5.s0) envelopeAppBarLayout.f145788w.p0(envelopeAppBarLayout.A1)) != null) {
                    envelopeAppBarLayout.p(s0Var, envelopeAppBarLayout.A1, false);
                }
                gb3.n.f270034d = true;
                if (envelopeAppBarLayout.U1) {
                    envelopeAppBarLayout.U1 = false;
                    com.tencent.mm.plugin.luckymoney.story.g1.f145870k = 1;
                    i18 = 2;
                } else {
                    gb3.n.a(4);
                    gb3.m.a(7, envelopeAppBarLayout.G1);
                    i18 = 2;
                    com.tencent.mm.plugin.luckymoney.story.g1.f145870k = 2;
                }
                int i47 = envelopeAppBarLayout.K1;
                if (i47 == i18 || i47 == 1) {
                    java.lang.String str = gb3.m.f270020a;
                    java.lang.String str2 = envelopeAppBarLayout.F1;
                    int i48 = envelopeAppBarLayout.W1;
                    int i49 = envelopeAppBarLayout.X1;
                    com.tencent.mm.plugin.luckymoney.story.g1.f145868i = str;
                    com.tencent.mm.plugin.luckymoney.story.g1.f145860a = str2;
                    com.tencent.mm.plugin.luckymoney.story.g1.f145865f = i48;
                    com.tencent.mm.plugin.luckymoney.story.g1.f145866g = i49;
                    com.tencent.mm.plugin.luckymoney.story.g1.f145867h = java.util.UUID.randomUUID().toString();
                    com.tencent.mm.plugin.luckymoney.story.g1.f145869j = android.os.SystemClock.elapsedRealtime() / 1000;
                    if (envelopeAppBarLayout.K1 == 2) {
                        if (envelopeAppBarLayout.i()) {
                            envelopeAppBarLayout.U.o7(false);
                        } else {
                            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI6 = envelopeAppBarLayout.V;
                            if (luckyMoneyDetailUI6 != null) {
                                luckyMoneyDetailUI6.j7(false);
                            }
                        }
                        envelopeAppBarLayout.D1.d(envelopeAppBarLayout.A1);
                        gb3.m.a(5, envelopeAppBarLayout.G1);
                        com.tencent.mm.plugin.luckymoney.story.f1.a(2);
                    }
                }
                envelopeAppBarLayout.f145792y.setOnClickListener(null);
                envelopeAppBarLayout.f145792y.setClickable(false);
                envelopeAppBarLayout.f145784s.setOnClickListener(null);
                envelopeAppBarLayout.f145784s.setClickable(false);
                envelopeAppBarLayout.f145785t.setOnClickListener(null);
                envelopeAppBarLayout.f145785t.setClickable(false);
                r45.nm5 nm5Var = envelopeAppBarLayout.E1;
                if (nm5Var != null && nm5Var.f381504m == 4 && !envelopeAppBarLayout.Y1) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("red_cover_id", envelopeAppBarLayout.E1.f381508q);
                        jSONObject.put("finderusername", envelopeAppBarLayout.E1.f381506o);
                        jSONObject.put("red_cover_type", 1);
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopeAppBarLayout", "jump finder error, ", th6);
                    }
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).bj("red_cover_link_unfold", 0, jSONObject, null);
                    envelopeAppBarLayout.Y1 = true;
                }
                r45.nm5 nm5Var2 = envelopeAppBarLayout.E1;
                if (nm5Var2 != null) {
                    if (nm5Var2.f381504m == 1) {
                        gb3.m.a(95, envelopeAppBarLayout.G1);
                    }
                    if (envelopeAppBarLayout.E1.f381504m == 2) {
                        gb3.m.a(87, envelopeAppBarLayout.G1);
                    }
                    if (envelopeAppBarLayout.E1.f381504m == 3) {
                        gb3.m.a(89, envelopeAppBarLayout.G1);
                    }
                    if (envelopeAppBarLayout.E1.f381504m == 4) {
                        gb3.m.a(83, envelopeAppBarLayout.G1);
                    }
                    if (envelopeAppBarLayout.E1.f381504m == 5) {
                        gb3.m.a(93, envelopeAppBarLayout.G1);
                    }
                    if (envelopeAppBarLayout.E1.f381504m == 6) {
                        gb3.m.a(91, envelopeAppBarLayout.G1);
                    }
                    if (envelopeAppBarLayout.E1.f381504m == 7) {
                        gb3.m.a(97, envelopeAppBarLayout.G1);
                    }
                }
                if (envelopeAppBarLayout.Z1) {
                    if (envelopeAppBarLayout.f145775a2) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_STORY_PREVIEW_GUIDE_TIME_INT_SYNC, 3);
                    } else {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_STORY_GUIDE_TIME_INT_SYNC, 3);
                    }
                }
            }
        } else if (appBarLayout.getTotalScrollRange() - abs == i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 300) && this.f145925a != abs) {
            com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout.e(envelopeAppBarLayout);
        }
        if (envelopeAppBarLayout.K != null) {
            if (f17 > 1.0f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "mOffsetChangedListener warning！need reset currentPer：%s", java.lang.Float.valueOf(f17));
                f17 = 0.0f;
            }
            android.view.View view5 = envelopeAppBarLayout.K;
            float f28 = (float) (f17 * 0.7d);
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
            arrayList9.add(java.lang.Float.valueOf(f28));
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view5, arrayList9.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList9.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f145925a = abs;
        this.f145926b = i27;
    }
}
