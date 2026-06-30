package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class ProfileEditPhoneNumberView extends com.tencent.mm.pluginsdk.ui.ProfileItemView implements com.tencent.mm.pluginsdk.ui.r1 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f189804e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f189805f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String[] f189806g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f189807h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f189808i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.h2 f189809m;

    public ProfileEditPhoneNumberView(android.content.Context context) {
        super(context, null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ProfileItemView
    public void a() {
        this.f189807h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j8u);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.caw, (android.view.ViewGroup) null);
        this.f189808i = inflate;
        android.view.View findViewById = this.f189808i.findViewById(com.tencent.mm.R.id.kua);
        findViewById.setPadding(findViewById.getPaddingLeft(), 0, findViewById.getPaddingRight(), 0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        findViewById.setOnClickListener(new com.tencent.mm.pluginsdk.ui.g2(this));
        this.f189807h.addView(this.f189808i, layoutParams);
    }

    public void b(java.lang.String str, boolean z17, boolean z18) {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cax, (android.view.ViewGroup) null);
        com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText = (com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText) inflate.findViewById(com.tencent.mm.R.id.kuc);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.csb);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f485546i22);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.pluginsdk.ui.e2(this, inflate));
        }
        mMPhoneNumberEditText.setHint(getResources().getString(com.tencent.mm.R.string.f489835d3));
        if (z17) {
            mMPhoneNumberEditText.f189779f = true;
            android.graphics.drawable.Drawable drawable = mMPhoneNumberEditText.getResources().getDrawable(com.tencent.mm.R.raw.info_icon);
            mMPhoneNumberEditText.f189777d = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), mMPhoneNumberEditText.f189777d.getIntrinsicHeight());
            mMPhoneNumberEditText.setFocusable(false);
            mMPhoneNumberEditText.setCompoundDrawablesWithIntrinsicBounds(mMPhoneNumberEditText.getCompoundDrawables()[0], mMPhoneNumberEditText.getCompoundDrawables()[1], mMPhoneNumberEditText.f189777d, mMPhoneNumberEditText.getCompoundDrawables()[3]);
        }
        mMPhoneNumberEditText.setCallback(this);
        mMPhoneNumberEditText.setText(str);
        mMPhoneNumberEditText.setSelection(mMPhoneNumberEditText.getText().length());
        mMPhoneNumberEditText.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.kud);
        findViewById3.setPadding(findViewById3.getPaddingLeft(), 0, findViewById3.getPaddingRight(), 0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        android.widget.LinearLayout linearLayout = this.f189807h;
        linearLayout.addView(inflate, linearLayout.getChildCount() - 1, layoutParams);
        mMPhoneNumberEditText.setPadding(0, 0, 0, 0);
        if (z18) {
            mMPhoneNumberEditText.requestFocus();
            mMPhoneNumberEditText.postDelayed(new com.tencent.mm.pluginsdk.ui.f2(this, mMPhoneNumberEditText), 100L);
        }
        com.tencent.mm.pluginsdk.ui.h2 h2Var = this.f189809m;
        if (h2Var != null) {
            h2Var.a(mMPhoneNumberEditText);
        }
        if (findViewById2 != null) {
            if (this.f189807h.getChildCount() > 5) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void c(java.lang.String str, boolean z17, boolean z18) {
        b(str, z17, z18);
        if (this.f189807h.getChildCount() > 5) {
            d();
        } else {
            g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        for (int i17 = 1; i17 < this.f189807h.getChildCount(); i17++) {
            this.f189807h.getChildAt(i17).clearFocus();
        }
    }

    public final void d() {
        android.view.View view = this.f189808i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "hideBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "hideBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.pluginsdk.ui.h2 h2Var = this.f189809m;
        if (h2Var != null) {
            h2Var.c();
        }
    }

    public boolean e() {
        java.util.ArrayList<java.lang.String> phoneNumberList = getPhoneNumberList();
        if (phoneNumberList == null || phoneNumberList.isEmpty()) {
            return this.f189806g != null;
        }
        if (this.f189806g == null || phoneNumberList.size() != this.f189806g.length) {
            return true;
        }
        java.util.Iterator<java.lang.String> it = phoneNumberList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (!it.next().equals(this.f189806g[i17])) {
                return true;
            }
            i17++;
        }
        return false;
    }

    public boolean f() {
        android.view.View view = this.f189808i;
        return view != null && view.getVisibility() == 0;
    }

    public final void g() {
        android.view.View view = this.f189808i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "showBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "showBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.pluginsdk.ui.h2 h2Var = this.f189809m;
        if (h2Var != null) {
            h2Var.c();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ProfileItemView
    public int getLayout() {
        return com.tencent.mm.R.layout.cay;
    }

    public java.util.ArrayList<java.lang.String> getPhoneNumberList() {
        int childCount = this.f189807h.getChildCount();
        if (childCount == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(childCount);
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View findViewById = this.f189807h.getChildAt(i17).findViewById(com.tencent.mm.R.id.kuc);
            if (findViewById instanceof com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText) {
                java.lang.String obj = ((com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText) findViewById).getText().toString();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(obj) && !obj.trim().equals("")) {
                    arrayList.add(obj);
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f189804e) && arrayList.size() > 0) {
            arrayList.remove(0);
        }
        return arrayList;
    }

    public ProfileEditPhoneNumberView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileEditPhoneNumberView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
