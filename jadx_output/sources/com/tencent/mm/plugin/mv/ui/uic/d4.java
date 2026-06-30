package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 f151096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.tencent.mm.plugin.mv.ui.uic.h4 h4Var) {
        super(0);
        this.f151096d = h4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f151096d.findViewById(com.tencent.mm.R.id.hdb);
        int i17 = com.tencent.mm.R.id.f482800o6;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f482800o6);
        if (frameLayout != null) {
            i17 = com.tencent.mm.R.id.f482801o7;
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) x4.b.a(findViewById, com.tencent.mm.R.id.f482801o7);
            if (mMRoundCornerImageView != null) {
                i17 = com.tencent.mm.R.id.b5e;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.b5e);
                if (weImageView != null) {
                    i17 = com.tencent.mm.R.id.f484998g70;
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.f484998g70);
                    if (wxRecyclerView != null) {
                        i17 = com.tencent.mm.R.id.g7f;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.g7f);
                        if (textView != null) {
                            i17 = com.tencent.mm.R.id.g8c;
                            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.g8c);
                            if (wxRecyclerView2 != null) {
                                i17 = com.tencent.mm.R.id.g8f;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.g8f);
                                if (textView2 != null) {
                                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                                    i17 = com.tencent.mm.R.id.f486067k15;
                                    androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) x4.b.a(findViewById, com.tencent.mm.R.id.f486067k15);
                                    if (guideline != null) {
                                        i17 = com.tencent.mm.R.id.f486068k16;
                                        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = (com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView) x4.b.a(findViewById, com.tencent.mm.R.id.f486068k16);
                                        if (musicMVCardChooseView != null) {
                                            i17 = com.tencent.mm.R.id.k1d;
                                            androidx.constraintlayout.widget.Guideline guideline2 = (androidx.constraintlayout.widget.Guideline) x4.b.a(findViewById, com.tencent.mm.R.id.k1d);
                                            if (guideline2 != null) {
                                                i17 = com.tencent.mm.R.id.k1p;
                                                androidx.constraintlayout.widget.Guideline guideline3 = (androidx.constraintlayout.widget.Guideline) x4.b.a(findViewById, com.tencent.mm.R.id.k1p);
                                                if (guideline3 != null) {
                                                    i17 = com.tencent.mm.R.id.k1q;
                                                    android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k1q);
                                                    if (relativeLayout2 != null) {
                                                        i17 = com.tencent.mm.R.id.k1x;
                                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k1x);
                                                        if (linearLayout != null) {
                                                            i17 = com.tencent.mm.R.id.kam;
                                                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.kam);
                                                            if (linearLayout2 != null) {
                                                                i17 = com.tencent.mm.R.id.kax;
                                                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.kax);
                                                                if (weImageView2 != null) {
                                                                    return new bm3.d(relativeLayout, frameLayout, mMRoundCornerImageView, weImageView, wxRecyclerView, textView, wxRecyclerView2, textView2, relativeLayout, guideline, musicMVCardChooseView, guideline2, guideline3, relativeLayout2, linearLayout, linearLayout2, weImageView2);
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
