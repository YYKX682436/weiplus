package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class ContactCountView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f206353d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f206354e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f206355f;

    /* renamed from: g, reason: collision with root package name */
    public int f206356g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f206357h;

    /* renamed from: i, reason: collision with root package name */
    public int f206358i;

    public ContactCountView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206355f = false;
        this.f206356g = 0;
        this.f206357h = true;
        this.f206358i = 1;
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.a0a, this);
    }

    public void a() {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.contact.f1(this));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f206353d == null) {
            this.f206353d = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.cak);
            this.f206354e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.caj);
        }
        a();
        super.onMeasure(i17, i18);
    }

    public void setContactType(int i17) {
        this.f206358i = i17;
    }

    public void setFixedContactCount(int i17) {
        this.f206355f = true;
        this.f206356g = i17;
        a();
    }

    public void setVisible(boolean z17) {
        this.f206357h = z17;
        android.view.View view = this.f206353d;
        if (view != null) {
            int i17 = (!z17 || this.f206356g <= 0) ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ContactCountView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/ContactCountView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public ContactCountView(android.content.Context context) {
        super(context);
        this.f206355f = false;
        this.f206356g = 0;
        this.f206357h = true;
        this.f206358i = 1;
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.a0a, this);
    }
}
