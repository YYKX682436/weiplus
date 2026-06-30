package com.tencent.rtmp.ui;

/* loaded from: classes5.dex */
public class Dashboard extends android.widget.LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    final java.lang.StringBuilder f215270a;

    /* renamed from: b, reason: collision with root package name */
    android.widget.TextView f215271b;

    /* renamed from: c, reason: collision with root package name */
    android.widget.TextView f215272c;

    /* renamed from: d, reason: collision with root package name */
    private final java.text.SimpleDateFormat f215273d;

    /* renamed from: e, reason: collision with root package name */
    private android.widget.ScrollView f215274e;

    /* renamed from: f, reason: collision with root package name */
    private int f215275f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f215276g;

    public Dashboard(android.content.Context context) {
        this(context, null);
    }

    public final void a(int i17, int i18, int i19, int i27) {
        android.widget.TextView textView = this.f215271b;
        if (textView != null) {
            textView.setPadding(i17, i18, i19, 0);
        }
        android.widget.ScrollView scrollView = this.f215274e;
        if (scrollView != null) {
            scrollView.setPadding(i17, 0, i19, i27);
        }
    }

    public void setEventTextSize(float f17) {
        android.widget.TextView textView = this.f215272c;
        if (textView != null) {
            textView.setTextSize(f17);
        }
    }

    public void setMessageMaxLength(int i17) {
        this.f215275f = i17;
    }

    public void setShowLevel(int i17) {
        if (i17 == 0) {
            android.widget.TextView textView = this.f215271b;
            if (textView != null) {
                textView.setVisibility(4);
            }
            android.widget.ScrollView scrollView = this.f215274e;
            if (scrollView != null) {
                scrollView.setVisibility(4);
            }
            setVisibility(4);
            return;
        }
        if (i17 != 1) {
            a();
            this.f215271b.setVisibility(0);
            this.f215274e.setVisibility(0);
            setVisibility(0);
            return;
        }
        a();
        this.f215271b.setVisibility(0);
        this.f215274e.setVisibility(4);
        setVisibility(0);
    }

    public void setStatusText(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f215271b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setStatusTextSize(float f17) {
        android.widget.TextView textView = this.f215271b;
        if (textView != null) {
            textView.setTextSize(f17);
        }
    }

    public Dashboard(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f215270a = new java.lang.StringBuilder();
        this.f215273d = new java.text.SimpleDateFormat("HH:mm:ss.SSS", java.util.Locale.ENGLISH);
        this.f215275f = 3000;
        this.f215276g = false;
        setOrientation(1);
        setVisibility(8);
    }

    private void a() {
        if (this.f215271b != null) {
            return;
        }
        this.f215271b = new android.widget.TextView(getContext());
        this.f215272c = new android.widget.TextView(getContext());
        this.f215274e = new android.widget.ScrollView(getContext());
        this.f215271b.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f215271b.setTextColor(-49023);
        this.f215271b.setTypeface(android.graphics.Typeface.MONOSPACE);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        this.f215274e.setPadding(0, 10, 0, 0);
        this.f215274e.setLayoutParams(layoutParams);
        this.f215274e.setVerticalScrollBarEnabled(true);
        this.f215274e.setScrollbarFadingEnabled(true);
        this.f215272c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f215272c.setTextColor(-49023);
        this.f215274e.addView(this.f215272c);
        addView(this.f215271b);
        addView(this.f215274e);
        if (this.f215270a.length() <= 0) {
            this.f215270a.append("liteav sdk version:\n");
        }
        this.f215272c.setText(this.f215270a.toString());
    }
}
