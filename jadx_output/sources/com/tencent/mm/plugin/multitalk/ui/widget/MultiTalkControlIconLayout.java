package com.tencent.mm.plugin.multitalk.ui.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/MultiTalkControlIconLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "", "isChecked", "setChecked", "enable", "setIconEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MultiTalkControlIconLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.widget.MMCheckBox f150327d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f150328e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f150329f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.FrameLayout f150330g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f150331h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f150332i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f150333m;

    /* renamed from: n, reason: collision with root package name */
    public final int f150334n;

    /* renamed from: o, reason: collision with root package name */
    public final int f150335o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f150336p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f150337q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTalkControlIconLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attributeSet, "attributeSet");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c3_, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f150337q = inflate;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xi3.a.f454733b);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        java.lang.String string = obtainStyledAttributes.getString(4);
        this.f150331h = string;
        java.lang.String string2 = obtainStyledAttributes.getString(1);
        string2 = string2 == null ? "" : string2;
        this.f150332i = string2;
        java.lang.String string3 = obtainStyledAttributes.getString(9);
        java.lang.String str = string3 != null ? string3 : "";
        this.f150333m = str;
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        this.f150334n = resourceId;
        int integer = obtainStyledAttributes.getInteger(5, -1);
        boolean z17 = obtainStyledAttributes.getBoolean(6, false);
        this.f150336p = z17;
        this.f150335o = obtainStyledAttributes.getResourceId(8, -1);
        float dimension = obtainStyledAttributes.getDimension(3, -1.0f);
        int resourceId2 = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.h67);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f150327d = (com.tencent.mm.plugin.voip.widget.MMCheckBox) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.h6y);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f150328e = imageView;
        if (resourceId != -1) {
            if (z17) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, resourceId, -16777216));
            } else {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, resourceId, -1));
            }
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.h7c);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f150329f = textView;
        textView.setText(string);
        textView.setTextColor(integer);
        if (android.text.TextUtils.isEmpty(string) && android.text.TextUtils.isEmpty(string2) && android.text.TextUtils.isEmpty(str)) {
            imageView.setVisibility(8);
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.h78);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById4;
        this.f150330g = frameLayout;
        if (!(dimension == -1.0f)) {
            int i17 = (int) dimension;
            frameLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(com.tencent.mm.ui.zk.a(context, i17), com.tencent.mm.ui.zk.a(context, i17)));
        }
        if (resourceId2 != -1) {
            frameLayout.setBackground(getResources().getDrawable(resourceId2));
        }
        if (string != null) {
            textView.setText(string2);
        }
    }

    public final boolean a() {
        return this.f150327d.isChecked();
    }

    public final void b() {
        int i17 = this.f150334n;
        if (i17 != -1) {
            boolean a17 = a();
            int i18 = this.f150335o;
            boolean z17 = this.f150336p;
            this.f150328e.setImageDrawable(a17 ? z17 ? com.tencent.mm.ui.uk.e(getContext(), i18, -1) : com.tencent.mm.ui.uk.e(getContext(), i17, -16777216) : z17 ? com.tencent.mm.ui.uk.e(getContext(), i17, -16777216) : com.tencent.mm.ui.uk.e(getContext(), i18, -1));
        }
        if (this.f150331h == null) {
            this.f150329f.setText(a() ? this.f150332i : this.f150333m);
        }
    }

    public final void c(boolean z17, boolean z18, java.lang.String str) {
        android.widget.FrameLayout frameLayout = this.f150330g;
        if (!z18) {
            this.f150327d.setChecked(z17);
            frameLayout.setSelected(z17);
            b();
        } else {
            frameLayout.setSelected(true);
            this.f150328e.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_multiple_volume, -16777216));
            this.f150329f.setText(str);
        }
    }

    public final void setChecked(boolean z17) {
        this.f150327d.setChecked(z17);
        this.f150330g.setSelected(z17);
        b();
    }

    public final void setIconEnabled(boolean z17) {
        this.f150327d.setEnabled(z17);
        if (z17) {
            android.view.View view = this.f150337q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view2 = this.f150337q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (this.f150331h == null) {
            this.f150329f.setText(a() ? this.f150332i : this.f150333m);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f150327d.setOnClickListener(onClickListener);
    }
}
