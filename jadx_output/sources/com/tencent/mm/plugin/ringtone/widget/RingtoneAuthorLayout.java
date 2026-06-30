package com.tencent.mm.plugin.ringtone.widget;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\n8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/widget/RingtoneAuthorLayout;", "Landroid/widget/LinearLayout;", "", "d", "Z", "getShowAuthProfession", "()Z", "setShowAuthProfession", "(Z)V", "showAuthProfession", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getAuthor", "()Landroid/widget/TextView;", "setAuthor", "(Landroid/widget/TextView;)V", "author", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "getAuthIcon", "()Landroid/widget/ImageView;", "setAuthIcon", "(Landroid/widget/ImageView;)V", "authIcon", "g", "getAuthProfession", "setAuthProfession", "authProfession", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ringtone-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RingtoneAuthorLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean showAuthProfession;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView author;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.ImageView authIcon;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView authProfession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RingtoneAuthorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.showAuthProfession = true;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cgu, (android.view.ViewGroup) this, true);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gi0.a.f272232a);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(2, i65.a.h(context, com.tencent.mm.R.dimen.f479925j4));
        android.content.res.ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList == null) {
            colorStateList = i65.a.e(context, com.tencent.mm.R.color.FG_1);
            kotlin.jvm.internal.o.f(colorStateList, "getColorStateList(...)");
        }
        setShowAuthProfession(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m4v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setAuthor((android.widget.TextView) findViewById);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.m4t);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setAuthIcon((android.widget.ImageView) findViewById2);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.m4u);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setAuthProfession((android.widget.TextView) findViewById3);
        getAuthor().setTextSize(0, dimension);
        getAuthor().setTextColor(colorStateList);
        getAuthProfession().setTextSize(0, dimension);
        getAuthProfession().setTextColor(colorStateList);
    }

    public android.widget.ImageView getAuthIcon() {
        android.widget.ImageView imageView = this.authIcon;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("authIcon");
        throw null;
    }

    public android.widget.TextView getAuthProfession() {
        android.widget.TextView textView = this.authProfession;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("authProfession");
        throw null;
    }

    public android.widget.TextView getAuthor() {
        android.widget.TextView textView = this.author;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("author");
        throw null;
    }

    public boolean getShowAuthProfession() {
        return this.showAuthProfession;
    }

    public void setAuthIcon(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.authIcon = imageView;
    }

    public void setAuthProfession(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.authProfession = textView;
    }

    public void setAuthor(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.author = textView;
    }

    public void setShowAuthProfession(boolean z17) {
        this.showAuthProfession = z17;
    }
}
