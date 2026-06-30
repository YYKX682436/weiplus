package com.tencent.mm.plugin.ting.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/ting/widget/TingCategoryView;", "Landroid/widget/RelativeLayout;", "", "color", "Ljz5/f0;", "setContainerBackgroundColor", "", "getAccessibilityDesc", "d", "Ljz5/g;", "getCornerRadius", "()I", "cornerRadius", "e", "getCoverSize", "coverSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ting-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class TingCategoryView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cornerRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g coverSize;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f174864f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView f174865g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f174866h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f174867i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f174868m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f174869n;

    /* renamed from: o, reason: collision with root package name */
    public final int f174870o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingCategoryView(android.content.Context context, android.util.AttributeSet attributeSet) {
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

    public final void b(r45.lm6 tingCategoryViewData) {
        kotlin.jvm.internal.o.g(tingCategoryViewData, "tingCategoryViewData");
        android.widget.TextView textView = this.f174866h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mTingCategoryTitle");
            throw null;
        }
        textView.setText(tingCategoryViewData.f379637d);
        textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        java.lang.String str = tingCategoryViewData.f379638e;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f174868m;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("mTingDescIcon");
            throw null;
        }
        weImageView.setVisibility(8);
        boolean z17 = true;
        boolean z18 = str.length() > 0;
        android.widget.TextView textView2 = this.f174867i;
        if (z18) {
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mTingCategoryDesc");
                throw null;
            }
            textView2.setText(str);
            textView2.setVisibility(0);
        } else {
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mTingCategoryDesc");
                throw null;
            }
            textView2.setText("");
            textView2.setVisibility(8);
        }
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("mTingCategoryDesc");
            throw null;
        }
        textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
        com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView = this.f174865g;
        if (tingCategoryMvvmView == null) {
            kotlin.jvm.internal.o.o("mTingCategoryMvvmView");
            throw null;
        }
        tingCategoryMvvmView.g(tingCategoryViewData, null);
        java.lang.String str2 = tingCategoryViewData.f379642i;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        android.widget.ImageView imageView = this.f174869n;
        if (z17) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("mTingCategoryAuthorAvatar");
                throw null;
            }
        }
        if (imageView == null) {
            kotlin.jvm.internal.o.o("mTingCategoryAuthorAvatar");
            throw null;
        }
        imageView.setVisibility(0);
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        kotlin.jvm.internal.o.d(str2);
        ((dl4.m0) tVar).aj(str2, imageView, 0, null);
    }

    public final java.lang.String getAccessibilityDesc() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(",");
        android.widget.TextView textView = this.f174866h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mTingCategoryTitle");
            throw null;
        }
        java.lang.CharSequence text = textView.getText();
        if (!(text == null || text.length() == 0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (textView == null) {
                kotlin.jvm.internal.o.o("mTingCategoryTitle");
                throw null;
            }
            sb6.append((java.lang.Object) textView.getText());
            sb6.append(',');
            stringBuffer.append(sb6.toString());
        }
        android.widget.TextView textView2 = this.f174867i;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("mTingCategoryDesc");
            throw null;
        }
        java.lang.CharSequence text2 = textView2.getText();
        if (!(text2 == null || text2.length() == 0)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mTingCategoryDesc");
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

    public final void setContainerBackgroundColor(int i17) {
        android.view.View view = this.f174864f;
        if (view != null) {
            view.setBackgroundColor(i17);
        } else {
            kotlin.jvm.internal.o.o("mTingCategoryContainer");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingCategoryView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.cornerRadius = jz5.h.b(new nm4.k(context));
        this.coverSize = jz5.h.b(new nm4.l(context));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489573d10, (android.view.ViewGroup) this, true);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ji0.a.f299910a, i17, 0);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.f174870o = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f487312o95);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f174864f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.vez);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView = (com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView) findViewById2;
        this.f174865g = tingCategoryMvvmView;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.o9d);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f174866h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.o98);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f174867i = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.vex);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f174868m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.f487311o94);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f174869n = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.f487315vf2);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        tingCategoryMvvmView.setCoverSource(this.f174870o);
        setClipToOutline(true);
        setOutlineProvider(new nm4.j(this));
    }
}
