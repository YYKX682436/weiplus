package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class ProfileMobilePhoneView extends com.tencent.mm.pluginsdk.ui.ProfileItemView {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f189813n = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f189814e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f189815f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String[] f189816g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f189817h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f189818i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f189819m;

    public ProfileMobilePhoneView(android.content.Context context, android.view.View.OnClickListener onClickListener) {
        super(context, null);
        this.f189819m = onClickListener;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ProfileItemView
    public void a() {
        this.f189817h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ku7);
        this.f189818i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ku6);
        for (int i17 = 0; i17 < 5; i17++) {
            this.f189818i.getChildAt(i17).setOnClickListener(new com.tencent.mm.pluginsdk.ui.i2(this));
        }
    }

    public boolean b() {
        int i17;
        android.widget.TextView textView = this.f189817h;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479786f7);
            this.f189817h.setLayoutParams(layoutParams);
        }
        if (this.f189818i == null) {
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f189814e) || !com.tencent.mm.sdk.platformtools.t8.Q0(this.f189814e).booleanValue()) {
            java.lang.String str = this.f189814e;
            if (str != null && !com.tencent.mm.sdk.platformtools.t8.Q0(str).booleanValue()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ProfileMobilePhoneView", "mobile format is error----%s", this.f189814e);
            }
            i17 = 0;
        } else {
            android.view.View childAt = this.f189818i.getChildAt(0);
            if (childAt != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) childAt).setText(this.f189814e);
            }
            i17 = 1;
        }
        int i18 = i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f189815f)) {
            java.lang.String[] c17 = com.tencent.mm.contact.a.c(this.f189812d, this.f189815f);
            this.f189816g = c17;
            if (c17 != null) {
                setVisibility(0);
                while (i17 < this.f189816g.length + i18) {
                    android.view.View childAt2 = this.f189818i.getChildAt(i17);
                    if (childAt2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(childAt2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(childAt2, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ((android.widget.TextView) childAt2).setText(this.f189816g[i17 - i18]);
                    }
                    i17++;
                }
            }
        }
        while (i17 < 5) {
            android.view.View childAt3 = this.f189818i.getChildAt(i17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(childAt3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(childAt3, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i17++;
        }
        if (i18 != 1 && com.tencent.mm.sdk.platformtools.t8.K0(this.f189815f)) {
            setVisibility(8);
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ProfileItemView
    public int getLayout() {
        return com.tencent.mm.R.layout.f489366cb1;
    }

    public ProfileMobilePhoneView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileMobilePhoneView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
