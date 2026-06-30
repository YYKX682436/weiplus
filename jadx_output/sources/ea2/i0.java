package ea2;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        super(0);
        this.f250559d = finderMusicTopicHeaderUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        android.view.View findViewById = this.f250559d.findViewById(com.tencent.mm.R.id.cg7);
        int i17 = com.tencent.mm.R.id.atr;
        androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) x4.b.a(findViewById, com.tencent.mm.R.id.atr);
        java.lang.String str2 = "Missing required view with ID: ";
        if (barrier != null) {
            i17 = com.tencent.mm.R.id.ssj;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(findViewById, com.tencent.mm.R.id.ssj);
            if (constraintLayout != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) findViewById;
                i17 = com.tencent.mm.R.id.ftt;
                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(findViewById, com.tencent.mm.R.id.ftt);
                if (imageView != null) {
                    i17 = com.tencent.mm.R.id.ftu;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.ftu);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.ftv;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.ftv);
                        if (linearLayout != null) {
                            i17 = com.tencent.mm.R.id.ftw;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.ftw);
                            if (linearLayout2 != null) {
                                i17 = com.tencent.mm.R.id.ftx;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.ftx);
                                if (textView2 != null) {
                                    i17 = com.tencent.mm.R.id.fty;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(findViewById, com.tencent.mm.R.id.fty);
                                    if (imageView2 != null) {
                                        i17 = com.tencent.mm.R.id.ftz;
                                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.ftz);
                                        if (textView3 != null) {
                                            i17 = com.tencent.mm.R.id.f484890ts0;
                                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f484890ts0);
                                            if (textView4 != null) {
                                                i17 = com.tencent.mm.R.id.f484891fu5;
                                                android.view.View a17 = x4.b.a(findViewById, com.tencent.mm.R.id.f484891fu5);
                                                if (a17 != null) {
                                                    int i18 = com.tencent.mm.R.id.k0n;
                                                    android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(a17, com.tencent.mm.R.id.k0n);
                                                    if (textView5 != null) {
                                                        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(a17, com.tencent.mm.R.id.k0p);
                                                        if (wxRecyclerView != null) {
                                                            android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(a17, com.tencent.mm.R.id.k0q);
                                                            if (textView6 != null) {
                                                                vb2.t tVar = new vb2.t((android.widget.LinearLayout) a17, textView5, wxRecyclerView, textView6);
                                                                int i19 = com.tencent.mm.R.id.f484919fx3;
                                                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f484919fx3);
                                                                if (frameLayout != null) {
                                                                    i19 = com.tencent.mm.R.id.f485285u33;
                                                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.f485285u33);
                                                                    if (weImageView != null) {
                                                                        i19 = com.tencent.mm.R.id.f485299u36;
                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.f485299u36);
                                                                        if (weImageView2 != null) {
                                                                            i19 = com.tencent.mm.R.id.f486053k06;
                                                                            android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(findViewById, com.tencent.mm.R.id.f486053k06);
                                                                            if (imageView3 != null) {
                                                                                i19 = com.tencent.mm.R.id.k07;
                                                                                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k07);
                                                                                if (relativeLayout != null) {
                                                                                    i19 = com.tencent.mm.R.id.k08;
                                                                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k08);
                                                                                    if (linearLayout3 != null) {
                                                                                        i19 = com.tencent.mm.R.id.k0_;
                                                                                        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k0_);
                                                                                        if (linearLayout4 != null) {
                                                                                            i19 = com.tencent.mm.R.id.k0a;
                                                                                            android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.k0a);
                                                                                            if (textView7 != null) {
                                                                                                i19 = com.tencent.mm.R.id.k0b;
                                                                                                android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k0b);
                                                                                                if (linearLayout5 != null) {
                                                                                                    i19 = com.tencent.mm.R.id.f486054uj1;
                                                                                                    android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f486054uj1);
                                                                                                    if (textView8 != null) {
                                                                                                        i19 = com.tencent.mm.R.id.f486055uj2;
                                                                                                        android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f486055uj2);
                                                                                                        if (textView9 != null) {
                                                                                                            i19 = com.tencent.mm.R.id.k0d;
                                                                                                            android.widget.TextView textView10 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.k0d);
                                                                                                            if (textView10 != null) {
                                                                                                                i19 = com.tencent.mm.R.id.k0e;
                                                                                                                android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k0e);
                                                                                                                if (linearLayout6 != null) {
                                                                                                                    i19 = com.tencent.mm.R.id.k0g;
                                                                                                                    android.widget.ImageView imageView4 = (android.widget.ImageView) x4.b.a(findViewById, com.tencent.mm.R.id.k0g);
                                                                                                                    if (imageView4 != null) {
                                                                                                                        i19 = com.tencent.mm.R.id.k0h;
                                                                                                                        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k0h);
                                                                                                                        if (roundedCornerFrameLayout != null) {
                                                                                                                            i19 = com.tencent.mm.R.id.k0i;
                                                                                                                            android.widget.TextView textView11 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.k0i);
                                                                                                                            if (textView11 != null) {
                                                                                                                                i19 = com.tencent.mm.R.id.k0j;
                                                                                                                                android.widget.ImageView imageView5 = (android.widget.ImageView) x4.b.a(findViewById, com.tencent.mm.R.id.k0j);
                                                                                                                                if (imageView5 != null) {
                                                                                                                                    return new vb2.s(constraintLayout2, barrier, constraintLayout, constraintLayout2, imageView, textView, linearLayout, linearLayout2, textView2, imageView2, textView3, textView4, tVar, frameLayout, weImageView, weImageView2, imageView3, relativeLayout, linearLayout3, linearLayout4, textView7, linearLayout5, textView8, textView9, textView10, linearLayout6, imageView4, roundedCornerFrameLayout, textView11, imageView5);
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
                                                                i17 = i19;
                                                                str2 = "Missing required view with ID: ";
                                                            } else {
                                                                str = "Missing required view with ID: ";
                                                                i18 = com.tencent.mm.R.id.k0q;
                                                            }
                                                        } else {
                                                            str = "Missing required view with ID: ";
                                                            i18 = com.tencent.mm.R.id.k0p;
                                                        }
                                                    } else {
                                                        str = "Missing required view with ID: ";
                                                    }
                                                    throw new java.lang.NullPointerException(str.concat(a17.getResources().getResourceName(i18)));
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
        throw new java.lang.NullPointerException(str2.concat(findViewById.getResources().getResourceName(i17)));
    }
}
