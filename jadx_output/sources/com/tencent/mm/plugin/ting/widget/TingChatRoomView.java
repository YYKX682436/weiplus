package com.tencent.mm.plugin.ting.widget;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\r\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/ting/widget/TingChatRoomView;", "Landroid/widget/RelativeLayout;", "", "color", "Ljz5/f0;", "setContainerBackgroundColor", "d", "Ljz5/g;", "getCornerRadius", "()I", "cornerRadius", "e", "getCoverSize", "coverSize", "", "q", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "categoryId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ting-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class TingChatRoomView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cornerRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g coverSize;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f174873f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f174874g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f174875h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f174876i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f174877m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f174878n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f174879o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f174880p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public java.lang.String categoryId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingChatRoomView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCornerRadius() {
        return ((java.lang.Number) ((jz5.n) this.cornerRadius).getValue()).intValue();
    }

    private final int getCoverSize() {
        return ((java.lang.Number) ((jz5.n) this.coverSize).getValue()).intValue();
    }

    public final void b(nm4.m liveState) {
        kotlin.jvm.internal.o.g(liveState, "liveState");
        int ordinal = liveState.ordinal();
        if (ordinal == 0) {
            android.widget.FrameLayout frameLayout = this.f174876i;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
                return;
            } else {
                kotlin.jvm.internal.o.o("mTingChatRoomLiveContainer");
                throw null;
            }
        }
        if (ordinal == 1) {
            android.widget.FrameLayout frameLayout2 = this.f174876i;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.o.o("mTingChatRoomLiveContainer");
                throw null;
            }
            frameLayout2.setVisibility(0);
            android.widget.TextView textView = this.f174875h;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mTingChatRoomLiveText");
                throw null;
            }
            textView.setText(getResources().getString(com.tencent.mm.R.string.omi));
            android.widget.FrameLayout frameLayout3 = this.f174876i;
            if (frameLayout3 == null) {
                kotlin.jvm.internal.o.o("mTingChatRoomLiveContainer");
                throw null;
            }
            android.graphics.drawable.Drawable background = frameLayout3.getBackground();
            kotlin.jvm.internal.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) background;
            gradientDrawable.setColor(-1725618907);
            if (this.f174876i != null) {
                gradientDrawable.setCornerRadius(r2.getHeight() / 2.0f);
                return;
            } else {
                kotlin.jvm.internal.o.o("mTingChatRoomLiveContainer");
                throw null;
            }
        }
        if (ordinal != 2) {
            return;
        }
        android.widget.FrameLayout frameLayout4 = this.f174876i;
        if (frameLayout4 == null) {
            kotlin.jvm.internal.o.o("mTingChatRoomLiveContainer");
            throw null;
        }
        frameLayout4.setVisibility(0);
        android.widget.TextView textView2 = this.f174875h;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("mTingChatRoomLiveText");
            throw null;
        }
        textView2.setText(getResources().getString(com.tencent.mm.R.string.omj));
        android.widget.FrameLayout frameLayout5 = this.f174876i;
        if (frameLayout5 == null) {
            kotlin.jvm.internal.o.o("mTingChatRoomLiveContainer");
            throw null;
        }
        android.graphics.drawable.Drawable background2 = frameLayout5.getBackground();
        kotlin.jvm.internal.o.e(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        android.graphics.drawable.GradientDrawable gradientDrawable2 = (android.graphics.drawable.GradientDrawable) background2;
        gradientDrawable2.setColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac));
        if (this.f174876i != null) {
            gradientDrawable2.setCornerRadius(r2.getHeight() / 2.0f);
        } else {
            kotlin.jvm.internal.o.o("mTingChatRoomLiveContainer");
            throw null;
        }
    }

    public final void c(r45.lm6 tingCategoryViewData) {
        kotlin.jvm.internal.o.g(tingCategoryViewData, "tingCategoryViewData");
        android.widget.TextView textView = this.f174878n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mTingChatRoomTitle");
            throw null;
        }
        textView.setText(tingCategoryViewData.f379637d);
        if (tingCategoryViewData.f379639f != null) {
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            java.lang.String tingCategoryCoverUrl = tingCategoryViewData.f379639f;
            kotlin.jvm.internal.o.f(tingCategoryCoverUrl, "tingCategoryCoverUrl");
            android.widget.ImageView imageView = this.f174877m;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("mTingChatRoomHeadImage");
                throw null;
            }
            ((dl4.m0) tVar).bj(tingCategoryCoverUrl, imageView, null);
        }
        java.util.LinkedList covers = tingCategoryViewData.f379644n;
        kotlin.jvm.internal.o.f(covers, "covers");
        java.lang.String str = (java.lang.String) kz5.n0.Z(covers);
        if (str == null) {
            android.widget.ImageView imageView2 = this.f174880p;
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
                return;
            } else {
                kotlin.jvm.internal.o.o("mTingChatCoverImage");
                throw null;
            }
        }
        ff0.t tVar2 = (ff0.t) i95.n0.c(ff0.t.class);
        android.widget.ImageView imageView3 = this.f174880p;
        if (imageView3 != null) {
            ((dl4.m0) tVar2).bj(str, imageView3, null);
        } else {
            kotlin.jvm.internal.o.o("mTingChatCoverImage");
            throw null;
        }
    }

    public final java.lang.String getCategoryId() {
        return this.categoryId;
    }

    public final void setCategoryId(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.categoryId = str;
    }

    public final void setContainerBackgroundColor(int i17) {
        android.view.View view = this.f174873f;
        if (view != null) {
            view.setBackgroundColor(i17);
        } else {
            kotlin.jvm.internal.o.o("mTingChatRoomContainer");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingChatRoomView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.cornerRadius = jz5.h.b(new nm4.n(this));
        this.coverSize = jz5.h.b(new nm4.o(this));
        this.categoryId = "";
        nm4.m mVar = nm4.m.f338500d;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489574eq2, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f487317vf4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f174873f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f487316vf3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f174874g = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.vf8);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f174875h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.vf6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f174877m = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.vf_);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f174878n = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.vf9);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f174879o = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.f487318vf5);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f174880p = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.vf7);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f174876i = (android.widget.FrameLayout) findViewById8;
        android.widget.ImageView imageView = this.f174874g;
        if (imageView != null) {
            imageView.setImageResource(com.tencent.mm.R.drawable.d9y);
            android.widget.TextView textView = this.f174879o;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.omh);
                setClipToOutline(true);
                setOutlineProvider(new nm4.p(this));
                return;
            }
            kotlin.jvm.internal.o.o("mTingChatRoomSubtitle");
            throw null;
        }
        kotlin.jvm.internal.o.o("mTingChatRoomBackGround");
        throw null;
    }
}
