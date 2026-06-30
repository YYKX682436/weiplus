package com.tencent.mm.plugin.ting.widget;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/ting/widget/MusicView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getMusicMediaIcon", "Landroid/widget/ImageView;", "getMusicCover", "Landroid/view/View;", "getMusicContainer", "", "getAccessibilityDesc", "", "p", "Ljz5/g;", "getOtherWidth", "()I", "otherWidth", "q", "getMusicViewHeight", "musicViewHeight", "r", "getTwoDp", "twoDp", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ting-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MusicView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f174836d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f174837e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f174838f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f174839g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f174840h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f174841i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f174842m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f174843n;

    /* renamed from: o, reason: collision with root package name */
    public r45.zs4 f174844o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final jz5.g otherWidth;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final jz5.g musicViewHeight;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final jz5.g twoDp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicView(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getMusicViewHeight() {
        return ((java.lang.Number) ((jz5.n) this.musicViewHeight).getValue()).intValue();
    }

    private final int getOtherWidth() {
        return ((java.lang.Number) ((jz5.n) this.otherWidth).getValue()).intValue();
    }

    private final int getTwoDp() {
        return ((java.lang.Number) ((jz5.n) this.twoDp).getValue()).intValue();
    }

    public final void a(boolean z17, boolean z18) {
        if (!z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f174842m;
            if (weImageView != null) {
                weImageView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("mediaIcon");
                throw null;
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f174842m;
        if (weImageView2 == null) {
            kotlin.jvm.internal.o.o("mediaIcon");
            throw null;
        }
        boolean z19 = false;
        weImageView2.setVisibility(0);
        r45.zs4 zs4Var = this.f174844o;
        if (zs4Var != null && zs4Var.f392359q) {
            z19 = true;
        }
        if (z19) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f174842m;
            if (weImageView3 == null) {
                kotlin.jvm.internal.o.o("mediaIcon");
                throw null;
            }
            kotlin.jvm.internal.o.d(zs4Var);
            int i17 = zs4Var.f392360r;
            r45.zs4 zs4Var2 = this.f174844o;
            kotlin.jvm.internal.o.d(zs4Var2);
            weImageView3.s(i17, zs4Var2.f392361s);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f174842m;
            if (weImageView4 != null) {
                weImageView4.setImportantForAccessibility(2);
                return;
            } else {
                kotlin.jvm.internal.o.o("mediaIcon");
                throw null;
            }
        }
        int i18 = com.tencent.mm.R.color.FG_0;
        int i19 = com.tencent.mm.R.color.BW_100_Alpha_0_9;
        if (z18) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.f174842m;
            if (weImageView5 == null) {
                kotlin.jvm.internal.o.o("mediaIcon");
                throw null;
            }
            if (zs4Var != null) {
                if (!zs4Var.f392358p) {
                    i18 = com.tencent.mm.R.color.BW_100_Alpha_0_9;
                }
                i19 = i18;
            }
            weImageView5.s(com.tencent.mm.R.raw.icons_filled_pause, i19);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = this.f174842m;
            if (weImageView6 == null) {
                kotlin.jvm.internal.o.o("mediaIcon");
                throw null;
            }
            weImageView6.setImportantForAccessibility(1);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = this.f174842m;
            if (weImageView7 != null) {
                weImageView7.setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.lo6));
                return;
            } else {
                kotlin.jvm.internal.o.o("mediaIcon");
                throw null;
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView8 = this.f174842m;
        if (weImageView8 == null) {
            kotlin.jvm.internal.o.o("mediaIcon");
            throw null;
        }
        if (zs4Var != null) {
            if (!zs4Var.f392358p) {
                i18 = com.tencent.mm.R.color.BW_100_Alpha_0_9;
            }
            i19 = i18;
        }
        weImageView8.s(com.tencent.mm.R.raw.icons_filled_specialplay, i19);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView9 = this.f174842m;
        if (weImageView9 == null) {
            kotlin.jvm.internal.o.o("mediaIcon");
            throw null;
        }
        weImageView9.setImportantForAccessibility(1);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView10 = this.f174842m;
        if (weImageView10 != null) {
            weImageView10.setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.f493385lo5));
        } else {
            kotlin.jvm.internal.o.o("mediaIcon");
            throw null;
        }
    }

    public final void b(int i17, int i18) {
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f174841i;
        if (mMNeat7extView == null) {
            kotlin.jvm.internal.o.o("musicSongName");
            throw null;
        }
        if (mMNeat7extView == null) {
            kotlin.jvm.internal.o.o("musicSongName");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = mMNeat7extView.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i17;
        }
        mMNeat7extView.setLayoutParams(layoutParams);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f174841i;
        if (mMNeat7extView2 != null) {
            mMNeat7extView2.setMaxLines(i18);
        } else {
            kotlin.jvm.internal.o.o("musicSongName");
            throw null;
        }
    }

    public final void c(r45.zs4 musicViewData) {
        kotlin.jvm.internal.o.g(musicViewData, "musicViewData");
        this.f174844o = musicViewData;
        ff0.q qVar = (ff0.q) i95.n0.c(ff0.q.class);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f174839g;
        if (mMRoundCornerImageView == null) {
            kotlin.jvm.internal.o.o("musicCover");
            throw null;
        }
        android.view.View view = this.f174836d;
        if (view == null) {
            kotlin.jvm.internal.o.o("blurBg");
            throw null;
        }
        ((if0.w) qVar).Bi(context, mMRoundCornerImageView, view, musicViewData);
        java.lang.String str = musicViewData.f392350e;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            android.widget.TextView textView = this.f174840h;
            if (textView == null) {
                kotlin.jvm.internal.o.o("musicSinger");
                throw null;
            }
            textView.setText(str);
            android.widget.TextView textView2 = this.f174840h;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("musicSinger");
                throw null;
            }
            textView2.setVisibility(0);
        } else {
            android.widget.TextView textView3 = this.f174840h;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("musicSinger");
                throw null;
            }
            textView3.setText("");
            android.widget.TextView textView4 = this.f174840h;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("musicSinger");
                throw null;
            }
            textView4.setVisibility(8);
        }
        if (musicViewData.f392358p) {
            android.widget.TextView textView5 = this.f174840h;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("musicSinger");
                throw null;
            }
            textView5.setTextColor(getContext().getColor(com.tencent.mm.R.color.adg));
        } else {
            android.widget.TextView textView6 = this.f174840h;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("musicSinger");
                throw null;
            }
            textView6.setTextColor(getContext().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f174841i;
        if (mMNeat7extView == null) {
            kotlin.jvm.internal.o.o("musicSongName");
            throw null;
        }
        mMNeat7extView.b(musicViewData.f392349d);
        if (musicViewData.f392358p) {
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f174841i;
            if (mMNeat7extView2 == null) {
                kotlin.jvm.internal.o.o("musicSongName");
                throw null;
            }
            mMNeat7extView2.setTextColor(getContext().getColor(com.tencent.mm.R.color.abw));
        } else {
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = this.f174841i;
            if (mMNeat7extView3 == null) {
                kotlin.jvm.internal.o.o("musicSongName");
                throw null;
            }
            mMNeat7extView3.setTextColor(getContext().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
        }
        if (musicViewData.f392357o == 0) {
            musicViewData.f392357o = getMeasuredWidth();
        }
        int max = java.lang.Integer.max(musicViewData.f392357o - getOtherWidth(), 0);
        boolean z17 = i65.a.n(getContext()) > 1.0f;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView4 = this.f174841i;
        if (mMNeat7extView4 == null) {
            kotlin.jvm.internal.o.o("musicSongName");
            throw null;
        }
        ks5.a i17 = mMNeat7extView4.i(max, Integer.MAX_VALUE);
        if (i17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicMvView", "updateTitle layout null, isLargeFont: " + z17);
            b(0, z17 ? 2 : 3);
        } else {
            int i18 = ((com.tencent.neattextview.textview.layout.NeatLayout) i17).L;
            if (z17) {
                if (i18 >= 3) {
                    com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView5 = this.f174841i;
                    if (mMNeat7extView5 == null) {
                        kotlin.jvm.internal.o.o("musicSongName");
                        throw null;
                    }
                    int lineHeight = mMNeat7extView5.getLineHeight();
                    int musicViewHeight = getMusicViewHeight();
                    android.widget.TextView textView7 = this.f174840h;
                    if (textView7 == null) {
                        kotlin.jvm.internal.o.o("musicSinger");
                        throw null;
                    }
                    if ((lineHeight * 2) + ((ks5.c) i17).e(0) <= musicViewHeight - textView7.getLineHeight()) {
                        b(0, 3);
                    } else {
                        b(getTwoDp(), 2);
                    }
                } else {
                    b(getTwoDp(), 2);
                }
            } else if (i18 >= 3) {
                b(0, 3);
            } else {
                b(getTwoDp(), 2);
            }
        }
        a(musicViewData.f392355m, musicViewData.f392356n);
        if (!musicViewData.f392362t) {
            android.view.View view2 = this.f174843n;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ting/widget/MusicView", "updateReviewBadge", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ting/widget/MusicView", "updateReviewBadge", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f174843n == null) {
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView2 = this.f174839g;
            if (mMRoundCornerImageView2 == null) {
                kotlin.jvm.internal.o.o("musicCover");
                throw null;
            }
            android.view.ViewParent parent = mMRoundCornerImageView2.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup == null) {
                return;
            }
            android.view.View view3 = this.f174839g;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("musicCover");
                throw null;
            }
            int indexOfChild = viewGroup.indexOfChild(view3);
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView3 = this.f174839g;
            if (mMRoundCornerImageView3 == null) {
                kotlin.jvm.internal.o.o("musicCover");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = mMRoundCornerImageView3.getLayoutParams();
            viewGroup.removeViewAt(indexOfChild);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            frameLayout.setLayoutParams(layoutParams);
            android.view.View view4 = this.f174839g;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("musicCover");
                throw null;
            }
            frameLayout.addView(view4, new android.widget.FrameLayout.LayoutParams(-1, -1));
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
            int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn);
            android.graphics.drawable.Drawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, android.graphics.Color.argb(128, 0, 0, 0)});
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
            frameLayout2.setBackground(gradientDrawable);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, (dimensionPixelSize2 * 2) + dimensionPixelSize);
            layoutParams2.gravity = 80;
            frameLayout2.setLayoutParams(layoutParams2);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(getContext());
            weImageView.s(com.tencent.mm.R.raw.bubble_3_dot_filled, com.tencent.mm.R.color.f478553an);
            kotlin.jvm.internal.o.e(java.lang.Integer.valueOf(dimensionPixelSize), "null cannot be cast to non-null type kotlin.Int");
            kotlin.jvm.internal.o.e(java.lang.Integer.valueOf(dimensionPixelSize), "null cannot be cast to non-null type kotlin.Int");
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams3.gravity = 8388691;
            layoutParams3.setMargins(dimensionPixelSize2, 0, 0, dimensionPixelSize2);
            weImageView.setLayoutParams(layoutParams3);
            frameLayout2.addView(weImageView);
            frameLayout.addView(frameLayout2);
            viewGroup.addView(frameLayout, indexOfChild);
            this.f174843n = frameLayout2;
        }
        android.view.View view5 = this.f174843n;
        if (view5 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/ting/widget/MusicView", "updateReviewBadge", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/ting/widget/MusicView", "updateReviewBadge", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String getAccessibilityDesc() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(",");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f174841i;
        if (mMNeat7extView == null) {
            kotlin.jvm.internal.o.o("musicSongName");
            throw null;
        }
        java.lang.CharSequence a17 = mMNeat7extView.a();
        if (!(a17 == null || a17.length() == 0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f174841i;
            if (mMNeat7extView2 == null) {
                kotlin.jvm.internal.o.o("musicSongName");
                throw null;
            }
            sb6.append((java.lang.Object) mMNeat7extView2.a());
            sb6.append(',');
            stringBuffer.append(sb6.toString());
        }
        android.widget.TextView textView = this.f174840h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("musicSinger");
            throw null;
        }
        java.lang.CharSequence text = textView.getText();
        if (!(text == null || text.length() == 0)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            android.widget.TextView textView2 = this.f174840h;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("musicSinger");
                throw null;
            }
            sb7.append((java.lang.Object) textView2.getText());
            sb7.append(',');
            stringBuffer.append(sb7.toString());
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    public final android.view.View getMusicContainer() {
        android.view.View view = this.f174838f;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("container");
        throw null;
    }

    public final android.widget.ImageView getMusicCover() {
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f174839g;
        if (mMRoundCornerImageView != null) {
            return mMRoundCornerImageView;
        }
        kotlin.jvm.internal.o.o("musicCover");
        throw null;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView getMusicMediaIcon() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f174842m;
        if (weImageView != null) {
            return weImageView;
        }
        kotlin.jvm.internal.o.o("mediaIcon");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.otherWidth = jz5.h.b(new nm4.b(this));
        this.musicViewHeight = jz5.h.b(new nm4.a(this));
        this.twoDp = jz5.h.b(new nm4.c(this));
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c5h, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.asz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f174836d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f174837e = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.jyc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f174838f = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.bpn);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f174839g = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.bpq);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f174840h = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.bpr);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f174841i = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.bpo);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f174842m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById7;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f174841i;
        if (mMNeat7extView != null) {
            mMNeat7extView.setMaxLines(5);
            android.widget.TextView textView = this.f174840h;
            if (textView != null) {
                textView.setMaxLines(1);
                return;
            } else {
                kotlin.jvm.internal.o.o("musicSinger");
                throw null;
            }
        }
        kotlin.jvm.internal.o.o("musicSongName");
        throw null;
    }
}
