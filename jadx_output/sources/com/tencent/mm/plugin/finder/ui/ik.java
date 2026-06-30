package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ik extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f129371d = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f129371d.findViewById(com.tencent.mm.R.id.u2u);
        int i17 = com.tencent.mm.R.id.g2i;
        android.view.View a17 = x4.b.a(findViewById, com.tencent.mm.R.id.g2i);
        if (a17 != null) {
            int i18 = com.tencent.mm.R.id.hqw;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(a17, com.tencent.mm.R.id.hqw);
            if (weImageView != null) {
                i18 = com.tencent.mm.R.id.avy;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(a17, com.tencent.mm.R.id.avy);
                if (textView != null) {
                    i18 = com.tencent.mm.R.id.jeu;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(a17, com.tencent.mm.R.id.jeu);
                    if (imageView != null) {
                        i18 = com.tencent.mm.R.id.jew;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(a17, com.tencent.mm.R.id.jew);
                        if (imageView2 != null) {
                            i18 = com.tencent.mm.R.id.jex;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(a17, com.tencent.mm.R.id.jex);
                            if (linearLayout != null) {
                                i18 = com.tencent.mm.R.id.f485876jf3;
                                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(a17, com.tencent.mm.R.id.f485876jf3);
                                if (relativeLayout != null) {
                                    i18 = com.tencent.mm.R.id.jfb;
                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(a17, com.tencent.mm.R.id.jfb);
                                    if (textView2 != null) {
                                        i18 = com.tencent.mm.R.id.rwy;
                                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(a17, com.tencent.mm.R.id.rwy);
                                        if (linearLayout2 != null) {
                                            i18 = com.tencent.mm.R.id.jfv;
                                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(a17, com.tencent.mm.R.id.jfv);
                                            if (textView3 != null) {
                                                i18 = com.tencent.mm.R.id.kqg;
                                                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(a17, com.tencent.mm.R.id.kqg);
                                                if (linearLayout3 != null) {
                                                    vb2.h0 h0Var = new vb2.h0((android.widget.FrameLayout) a17, weImageView, textView, imageView, imageView2, linearLayout, relativeLayout, textView2, linearLayout2, textView3, linearLayout3);
                                                    i17 = com.tencent.mm.R.id.ght;
                                                    android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(findViewById, com.tencent.mm.R.id.ght);
                                                    if (imageView3 != null) {
                                                        com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView finderPagerView = (com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView) findViewById;
                                                        i17 = com.tencent.mm.R.id.jrp;
                                                        android.view.ViewStub viewStub = (android.view.ViewStub) x4.b.a(findViewById, com.tencent.mm.R.id.jrp);
                                                        if (viewStub != null) {
                                                            i17 = com.tencent.mm.R.id.l8l;
                                                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.l8l);
                                                            if (frameLayout != null) {
                                                                i17 = com.tencent.mm.R.id.f486458la3;
                                                                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.f486458la3);
                                                                if (finderRecyclerView != null) {
                                                                    i17 = com.tencent.mm.R.id.m2c;
                                                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.m2c);
                                                                    if (weImageView2 != null) {
                                                                        i17 = com.tencent.mm.R.id.m2d;
                                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m2d);
                                                                        if (constraintLayout != null) {
                                                                            i17 = com.tencent.mm.R.id.m2g;
                                                                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.m2g);
                                                                            if (textView4 != null) {
                                                                                i17 = com.tencent.mm.R.id.m6e;
                                                                                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6e);
                                                                                if (refreshLoadMoreLayout != null) {
                                                                                    i17 = com.tencent.mm.R.id.m7g;
                                                                                    com.tencent.mm.view.TouchableLayout touchableLayout = (com.tencent.mm.view.TouchableLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m7g);
                                                                                    if (touchableLayout != null) {
                                                                                        i17 = com.tencent.mm.R.id.msf;
                                                                                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.msf);
                                                                                        if (frameLayout2 != null) {
                                                                                            i17 = com.tencent.mm.R.id.mss;
                                                                                            android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.mss);
                                                                                            if (frameLayout3 != null) {
                                                                                                i17 = com.tencent.mm.R.id.mst;
                                                                                                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.mst);
                                                                                                if (progressBar != null) {
                                                                                                    i17 = com.tencent.mm.R.id.mta;
                                                                                                    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) x4.b.a(findViewById, com.tencent.mm.R.id.mta);
                                                                                                    if (coordinatorLayout != null) {
                                                                                                        i17 = com.tencent.mm.R.id.mto;
                                                                                                        android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.mto);
                                                                                                        if (frameLayout4 != null) {
                                                                                                            return new vb2.i0(finderPagerView, h0Var, imageView3, finderPagerView, viewStub, frameLayout, finderRecyclerView, weImageView2, constraintLayout, textView4, refreshLoadMoreLayout, touchableLayout, frameLayout2, frameLayout3, progressBar, coordinatorLayout, frameLayout4);
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
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(a17.getResources().getResourceName(i18)));
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
