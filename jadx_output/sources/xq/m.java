package xq;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public long f455991c;

    /* renamed from: d, reason: collision with root package name */
    public int f455992d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f455993e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.MMAnimateView f455994f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f455995g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.smiley.r0 f455996h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.u f455997i;

    /* renamed from: k, reason: collision with root package name */
    public xq.c f455999k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f456000l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f456001m;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct f456005q;

    /* renamed from: r, reason: collision with root package name */
    public xq.f f456006r;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f455989a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f455990b = "";

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.RectF f455998j = new android.graphics.RectF();

    /* renamed from: n, reason: collision with root package name */
    public int f456002n = -16777216;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f456003o = new xq.h(this);

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f456004p = new xq.g(this);

    public final boolean a(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView) {
        java.util.Objects.toString(mMNeat7extView);
        if (!kotlin.jvm.internal.o.b(this.f455995g, mMNeat7extView)) {
            c();
            this.f455995g = mMNeat7extView;
            int i17 = this.f455992d;
            if (i17 == 889192497 || i17 == 922746929) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "recordTextView: skip pat msg");
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f455995g;
                com.tencent.mm.smiley.r0 r0Var = null;
                java.lang.CharSequence a17 = mMNeat7extView2 != null ? mMNeat7extView2.a() : null;
                android.text.Spannable spannable = a17 instanceof android.text.Spannable ? (android.text.Spannable) a17 : null;
                if (spannable != null) {
                    com.tencent.mm.smiley.r0[] r0VarArr = (com.tencent.mm.smiley.r0[]) spannable.getSpans(0, spannable.length(), com.tencent.mm.smiley.r0.class);
                    kotlin.jvm.internal.o.d(r0VarArr);
                    int length = r0VarArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length) {
                            break;
                        }
                        com.tencent.mm.smiley.r0 r0Var2 = r0VarArr[i18];
                        if (r0Var2.f193352f) {
                            r0Var = r0Var2;
                            break;
                        }
                        i18++;
                    }
                    if (r0Var != null) {
                        this.f455996h = r0Var;
                        r0Var.f193356m = java.lang.Math.round(0.0f);
                        r0Var.f193357n = true;
                        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = this.f455995g;
                        if (mMNeat7extView3 != null) {
                            mMNeat7extView3.invalidate();
                        }
                    }
                }
            } else {
                this.f456002n = mMNeat7extView != null ? mMNeat7extView.getCurrentTextColor() : this.f456002n;
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView4 = this.f455995g;
                if (mMNeat7extView4 != null) {
                    mMNeat7extView4.setTextColor(0);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "recordTextView: " + this.f455995g + ", color:" + this.f456002n);
            }
        }
        if (this.f455995g == null) {
            if (this.f456000l) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "bindItemView: null");
                b();
                return true;
            }
            if (!this.f456001m) {
                pm0.v.U(200L, this.f456004p);
            }
        }
        this.f456001m = true;
        return false;
    }

    public final void b() {
        android.view.ViewPropertyAnimator animate;
        pm0.v.C(this.f456003o);
        pm0.v.C(this.f456004p);
        com.tencent.mm.plugin.gif.u uVar = this.f455997i;
        if (uVar != null) {
            uVar.b();
        }
        this.f455997i = null;
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = this.f455994f;
        if (mMAnimateView != null) {
            mMAnimateView.setVisibility(8);
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView2 = this.f455994f;
        if (mMAnimateView2 != null && (animate = mMAnimateView2.animate()) != null) {
            animate.cancel();
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView3 = this.f455994f;
        if (mMAnimateView3 != null) {
            mMAnimateView3.setScaleX(1.0f);
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView4 = this.f455994f;
        if (mMAnimateView4 != null) {
            mMAnimateView4.setScaleY(1.0f);
        }
        c();
        this.f456000l = false;
    }

    public final void c() {
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView;
        int i17 = this.f455992d;
        if (i17 == 889192497 || i17 == 922746929) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "recordTextView: skip pat msg");
            com.tencent.mm.smiley.r0 r0Var = this.f455996h;
            if (r0Var != null) {
                r0Var.f193356m = java.lang.Math.round(255.0f);
                r0Var.f193357n = false;
            }
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f455995g;
            if (mMNeat7extView2 != null) {
                mMNeat7extView2.invalidate();
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = this.f455995g;
        int currentTextColor = mMNeat7extView3 != null ? mMNeat7extView3.getCurrentTextColor() : 0;
        if (currentTextColor == 0 && (mMNeat7extView = this.f455995g) != null) {
            mMNeat7extView.setTextColor(this.f456002n);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "restoreTextView: " + this.f455995g + ", " + currentTextColor);
    }

    public final void d(float f17, float f18, int i17) {
        xq.d dVar;
        int i18;
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView;
        android.widget.FrameLayout frameLayout;
        if (this.f455997i == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "updateView: no drawable");
            return;
        }
        if (this.f455993e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "updateView: no rootView");
            return;
        }
        if (this.f455994f == null) {
            android.widget.FrameLayout frameLayout2 = this.f455993e;
            com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView2 = new com.tencent.mm.plugin.gif.MMAnimateView(frameLayout2 != null ? frameLayout2.getContext() : null, null);
            this.f455994f = mMAnimateView2;
            android.widget.FrameLayout frameLayout3 = this.f455993e;
            if (frameLayout3 != null) {
                frameLayout3.addView(mMAnimateView2, new android.widget.FrameLayout.LayoutParams(i17, i17));
            }
            com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView3 = this.f455994f;
            if (mMAnimateView3 != null) {
                mMAnimateView3.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView4 = this.f455994f;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) (mMAnimateView4 != null ? mMAnimateView4.getLayoutParams() : null);
        if (layoutParams == null) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i17, i17);
            com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView5 = this.f455994f;
            if (mMAnimateView5 != null) {
                mMAnimateView5.setLayoutParams(layoutParams2);
            }
        } else if (layoutParams.width != i17 || layoutParams.height != i17) {
            layoutParams.width = i17;
            layoutParams.height = i17;
            com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView6 = this.f455994f;
            if (mMAnimateView6 != null) {
                mMAnimateView6.setLayoutParams(layoutParams);
            }
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView7 = this.f455994f;
        if (mMAnimateView7 != null) {
            mMAnimateView7.setTranslationX(f17 - (i17 / 2));
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView8 = this.f455994f;
        if (mMAnimateView8 != null) {
            mMAnimateView8.setTranslationY(f18 - (i17 / 2));
        }
        if (this.f456000l) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct animateEmojiReportStruct = this.f456005q;
        if (animateEmojiReportStruct != null) {
            animateEmojiReportStruct.k();
        }
        android.widget.FrameLayout frameLayout4 = this.f455993e;
        if ((frameLayout4 != null && frameLayout4.getVisibility() == 8) && (frameLayout = this.f455993e) != null) {
            frameLayout.setVisibility(0);
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView9 = this.f455994f;
        if ((mMAnimateView9 != null && mMAnimateView9.getVisibility() == 8) && (mMAnimateView = this.f455994f) != null) {
            mMAnimateView.setVisibility(0);
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView10 = this.f455994f;
        if (mMAnimateView10 != null) {
            mMAnimateView10.setImageDrawable(this.f455997i);
        }
        xq.f fVar = this.f456006r;
        if (fVar != null) {
            xq.p pVar = ((xq.o) fVar).f456008a.f456014f;
        }
        java.lang.Runnable runnable = this.f456003o;
        pm0.v.C(runnable);
        xq.c cVar = this.f455999k;
        if (cVar != null && (dVar = cVar.f455973d) != null && (i18 = dVar.f455974b) >= 0) {
            pm0.v.U(i18, runnable);
        }
        this.f456000l = true;
        pm0.v.C(this.f456004p);
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView11 = this.f455994f;
        if (mMAnimateView11 != null) {
            mMAnimateView11.animate().scaleX(1.5f).scaleY(1.5f).setDuration(0L).withEndAction(new xq.l(this, mMAnimateView11));
        }
    }
}
