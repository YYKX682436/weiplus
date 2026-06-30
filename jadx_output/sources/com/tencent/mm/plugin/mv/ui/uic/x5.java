package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class x5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var) {
        super(0);
        this.f151529d = z5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f151529d.findViewById(com.tencent.mm.R.id.k1s);
        int i17 = com.tencent.mm.R.id.k1e;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k1e);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.k1f;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k1f);
            if (linearLayout2 != null) {
                i17 = com.tencent.mm.R.id.k1g;
                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(findViewById, com.tencent.mm.R.id.k1g);
                if (imageView != null) {
                    i17 = com.tencent.mm.R.id.k1h;
                    androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.k1h);
                    if (recyclerView != null) {
                        i17 = com.tencent.mm.R.id.k1i;
                        com.tencent.mm.plugin.mv.ui.view.MusicMvSliderSeekBar musicMvSliderSeekBar = (com.tencent.mm.plugin.mv.ui.view.MusicMvSliderSeekBar) x4.b.a(findViewById, com.tencent.mm.R.id.k1i);
                        if (musicMvSliderSeekBar != null) {
                            i17 = com.tencent.mm.R.id.k1r;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.k1r);
                            if (textView != null) {
                                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) findViewById;
                                i17 = com.tencent.mm.R.id.k1t;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k1t);
                                if (frameLayout != null) {
                                    i17 = com.tencent.mm.R.id.k1u;
                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.k1u);
                                    if (textView2 != null) {
                                        i17 = com.tencent.mm.R.id.k1v;
                                        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k1v);
                                        if (linearLayout4 != null) {
                                            i17 = com.tencent.mm.R.id.k1w;
                                            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.k1w);
                                            if (roundedCornerFrameLayout != null) {
                                                return new bm3.c(linearLayout3, linearLayout, linearLayout2, imageView, recyclerView, musicMvSliderSeekBar, textView, linearLayout3, frameLayout, textView2, linearLayout4, roundedCornerFrameLayout);
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
