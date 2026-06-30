package com.tencent.mm.plugin.setting.ui.widget;

/* loaded from: classes11.dex */
public class SwitchAccountGridView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f162050d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f162051e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f162052f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f162053g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162054h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f162055i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f162056m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f162057n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f162058o;

    /* renamed from: p, reason: collision with root package name */
    public w24.s f162059p;

    /* renamed from: q, reason: collision with root package name */
    public w24.t f162060q;

    public SwitchAccountGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162056m = new java.util.ArrayList();
        this.f162057n = new java.util.ArrayList();
        this.f162058o = new java.util.ArrayList();
        getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479564g);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.a(java.util.Map):void");
    }

    public void b() {
        java.util.List list;
        java.util.List list2;
        removeAllViews();
        java.util.List list3 = this.f162056m;
        int min = java.lang.Math.min(5, ((java.util.ArrayList) list3).size());
        int i17 = 0;
        while (true) {
            list = this.f162058o;
            list2 = this.f162057n;
            if (i17 >= min) {
                break;
            }
            if (!this.f162050d) {
                android.view.View view = (android.view.View) ((java.util.ArrayList) list).get(i17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442639b.setVisibility(4);
            } else if (((java.lang.String) ((java.util.ArrayList) list3).get(i17)).equals(this.f162054h)) {
                android.view.View view2 = (android.view.View) ((java.util.ArrayList) list).get(i17);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(0.5f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442639b.setVisibility(0);
            }
            android.view.View view3 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f162054h) && ((java.lang.String) ((java.util.ArrayList) list3).get(i17)).equals(this.f162054h)) {
                if (this.f162051e) {
                    ((android.widget.ImageView) ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d.findViewById(com.tencent.mm.R.id.cnz)).setImageResource(com.tencent.mm.R.drawable.afw);
                    ((android.widget.TextView) ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d.findViewById(com.tencent.mm.R.id.f484002co1)).setText(getContext().getResources().getString(com.tencent.mm.R.string.lbe));
                } else {
                    ((android.widget.ImageView) ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d.findViewById(com.tencent.mm.R.id.cnz)).setImageResource(com.tencent.mm.R.drawable.afs);
                    ((android.widget.TextView) ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d.findViewById(com.tencent.mm.R.id.f484002co1)).setText(getContext().getResources().getString(com.tencent.mm.R.string.iyz));
                }
                android.view.View findViewById = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d.findViewById(com.tencent.mm.R.id.f482399di);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d.findViewById(com.tencent.mm.R.id.cnz);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f162055i) && ((java.lang.String) ((java.util.ArrayList) list3).get(i17)).equals(this.f162055i)) {
                ((android.widget.TextView) ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d.findViewById(com.tencent.mm.R.id.f484002co1)).setText(getContext().getResources().getString(com.tencent.mm.R.string.gic));
                android.view.View findViewById3 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d.findViewById(com.tencent.mm.R.id.cnz);
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(findViewById3, arrayList7.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById4 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d.findViewById(com.tencent.mm.R.id.f482399di);
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(findViewById4, arrayList8.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f442641d;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view5, arrayList9.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f162051e) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f162054h) || !((java.lang.String) ((java.util.ArrayList) list3).get(i17)).equals(this.f162054h)) {
                    android.view.View view6 = (android.view.View) ((java.util.ArrayList) list).get(i17);
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    arrayList10.add(java.lang.Float.valueOf(0.5f));
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(view6, arrayList10.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view6.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    android.view.View view7 = (android.view.View) ((java.util.ArrayList) list).get(i17);
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    arrayList11.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(view7, arrayList11.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view7.setAlpha(((java.lang.Float) arrayList11.get(0)).floatValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f162055i)) {
                if (((java.lang.String) ((java.util.ArrayList) list3).get(i17)).equals(this.f162055i)) {
                    android.view.View view8 = (android.view.View) ((java.util.ArrayList) list).get(i17);
                    java.util.ArrayList arrayList12 = new java.util.ArrayList();
                    arrayList12.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList12);
                    yj0.a.d(view8, arrayList12.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view8.setAlpha(((java.lang.Float) arrayList12.get(0)).floatValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    android.view.View view9 = (android.view.View) ((java.util.ArrayList) list).get(i17);
                    java.util.ArrayList arrayList13 = new java.util.ArrayList();
                    arrayList13.add(java.lang.Float.valueOf(0.5f));
                    java.util.Collections.reverse(arrayList13);
                    yj0.a.d(view9, arrayList13.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view9.setAlpha(((java.lang.Float) arrayList13.get(0)).floatValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
            addView((android.view.View) ((java.util.ArrayList) list).get(i17), layoutParams);
            i17++;
        }
        if (getChildCount() >= 5 || this.f162050d || this.f162051e || !com.tencent.mm.sdk.platformtools.t8.K0(this.f162055i)) {
            return;
        }
        ((w24.u) ((java.util.ArrayList) list2).get(((java.util.ArrayList) list2).size() - 1)).f442639b.setVisibility(4);
        addView((android.view.View) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1), new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    public int getAccountCount() {
        return ((java.util.ArrayList) this.f162056m).size();
    }

    public void setDeleteState(boolean z17) {
        this.f162050d = z17;
    }

    public void setLastLoginWxUsername(java.lang.String str) {
        this.f162054h = str;
    }

    public void setLoginState(boolean z17) {
        this.f162052f = z17;
    }

    public void setLogoutState(boolean z17) {
        this.f162051e = z17;
    }

    public void setOnAnimatorEndListener(w24.r rVar) {
    }

    public void setOnClickAvatarListener(w24.s sVar) {
        this.f162059p = sVar;
    }

    public void setOnDeleteAvatarListener(w24.t tVar) {
        this.f162060q = tVar;
    }

    public void setSwitchToWxUsername(java.lang.String str) {
        this.f162055i = str;
    }

    public void setUseSystemDecoder(boolean z17) {
        this.f162053g = z17;
    }
}
