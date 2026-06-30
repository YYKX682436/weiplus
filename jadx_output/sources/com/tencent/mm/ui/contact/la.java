package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class la {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.TextView f207014a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f207015b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f207016c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f207017d = false;

    public void a(android.app.Activity activity, int i17, int i18) {
        if (i18 <= 0 || i17 != i18 + 1 || this.f207017d) {
            if (i17 < i18) {
                b(activity);
                this.f207017d = false;
                return;
            }
            return;
        }
        if (this.f207014a == null) {
            this.f207014a = (android.widget.TextView) activity.findViewById(com.tencent.mm.R.id.mij);
        }
        if (this.f207014a.getVisibility() == 0) {
            return;
        }
        this.f207014a.setText(com.tencent.mm.R.string.i3o);
        this.f207014a.setOnClickListener(new com.tencent.mm.ui.contact.ja(this, activity));
        if (this.f207015b == null) {
            this.f207015b = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        }
        this.f207015b.setDuration(300L);
        android.view.animation.AlphaAnimation alphaAnimation = this.f207016c;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
        }
        this.f207014a.setVisibility(0);
        this.f207014a.startAnimation(this.f207015b);
    }

    public final void b(android.app.Activity activity) {
        if (this.f207014a == null) {
            this.f207014a = (android.widget.TextView) activity.findViewById(com.tencent.mm.R.id.mij);
        }
        if (this.f207014a.getVisibility() == 8) {
            return;
        }
        if (this.f207016c == null) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            this.f207016c = alphaAnimation;
            alphaAnimation.setAnimationListener(new com.tencent.mm.ui.contact.ka(this));
        }
        this.f207016c.setDuration(300L);
        android.view.animation.AlphaAnimation alphaAnimation2 = this.f207015b;
        if (alphaAnimation2 != null) {
            alphaAnimation2.cancel();
        }
        this.f207014a.startAnimation(this.f207016c);
    }
}
