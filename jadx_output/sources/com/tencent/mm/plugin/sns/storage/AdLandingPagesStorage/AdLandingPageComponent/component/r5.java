package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class r5 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f165453d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f165454e;

    /* renamed from: f, reason: collision with root package name */
    public ab4.r0 f165455f;

    /* renamed from: g, reason: collision with root package name */
    public final int f165456g;

    /* renamed from: h, reason: collision with root package name */
    public final int f165457h;

    /* renamed from: i, reason: collision with root package name */
    public final int f165458i = 600;

    /* renamed from: m, reason: collision with root package name */
    public final int f165459m = 700;

    /* renamed from: n, reason: collision with root package name */
    public final int f165460n = 250;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f165461o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f165462p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f165463q = new java.util.HashSet();

    /* renamed from: r, reason: collision with root package name */
    public final androidx.viewpager.widget.ViewPager f165464r;

    public r5(android.content.Context context, android.view.LayoutInflater layoutInflater, ab4.r0 r0Var, int i17, androidx.viewpager.widget.ViewPager viewPager) {
        this.f165453d = context;
        this.f165454e = layoutInflater;
        this.f165455f = r0Var;
        this.f165456g = i17;
        this.f165457h = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(context)[0];
        this.f165464r = viewPager;
    }

    public static /* synthetic */ int a(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r5 r5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        int i17 = r5Var.f165459m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        return i17;
    }

    public static void b(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r5 r5Var, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        r5Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startRightSecondAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, -5.0f, 0.0f, 0.0f);
        long j17 = r5Var.f165459m;
        translateAnimation.setDuration(j17);
        translateAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
        animationSet.addAnimation(translateAnimation);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.8f, 0.3f);
        alphaAnimation.setDuration(j17);
        alphaAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n5(r5Var, imageView));
        imageView.startAnimation(animationSet);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startRightSecondAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }

    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("didToPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        java.util.HashMap hashMap = this.f165462p;
        for (java.lang.Integer num : hashMap.keySet()) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q5 q5Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q5) hashMap.get(num);
            if (q5Var != null) {
                java.util.LinkedList linkedList = q5Var.f165428a;
                if (linkedList.size() != 0) {
                    int intValue = num.intValue();
                    int i18 = 0;
                    java.util.Set set = this.f165463q;
                    if (intValue == i17) {
                        while (i18 < linkedList.size()) {
                            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) linkedList.get(i18);
                            if (a2Var.A()) {
                                a2Var.K();
                                a2Var.J();
                                ((java.util.HashSet) set).add(a2Var.z());
                            } else {
                                if (((java.util.HashSet) set).contains(a2Var.z())) {
                                    a2Var.M();
                                    ((java.util.HashSet) set).remove(a2Var.z());
                                }
                            }
                            i18++;
                        }
                    } else {
                        while (i18 < linkedList.size()) {
                            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var2 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) linkedList.get(i18);
                            if (((java.util.HashSet) set).contains(a2Var2.z())) {
                                a2Var2.M();
                                ((java.util.HashSet) set).remove(a2Var2.z());
                            }
                            i18++;
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("didToPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }

    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        android.view.View view = (android.view.View) this.f165461o.get(java.lang.Integer.valueOf(i17));
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n4x);
        if (imageView != null && imageView.getVisibility() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            imageView.setAlpha(0.0f);
            imageView.setTag("1");
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 0.8f);
            alphaAnimation.setDuration(this.f165458i);
            alphaAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
            alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p5(this, imageView));
            imageView.startAnimation(alphaAnimation);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        viewGroup.removeView((android.view.View) obj);
        this.f165461o.remove(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        finishUpdate((android.view.View) viewGroup);
        androidx.viewpager.widget.ViewPager viewPager = this.f165464r;
        int currentItem = viewPager.getCurrentItem();
        if (currentItem == 0) {
            currentItem = getCount() - 2;
        } else if (currentItem >= getCount() - 1) {
            currentItem = 1;
        }
        viewPager.setCurrentItem(currentItem, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        int size = this.f165455f.F.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        return size;
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        java.util.HashMap hashMap = this.f165461o;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (hashMap.get(java.lang.Integer.valueOf(intValue)) == obj) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                return intValue;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        java.lang.String str;
        java.util.HashMap hashMap;
        int i18;
        int i19;
        java.lang.String str2 = "instantiateItem";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("instantiateItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        java.util.HashMap hashMap2 = this.f165461o;
        if (hashMap2.containsKey(java.lang.Integer.valueOf(i17))) {
            java.lang.Object obj = hashMap2.get(java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("instantiateItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            return obj;
        }
        int i27 = 0;
        android.view.View inflate = this.f165454e.inflate(com.tencent.mm.R.layout.f489491cq1, viewGroup, false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.n4v);
        int i28 = this.f165456g;
        linearLayout.setBackgroundColor(i28);
        java.util.HashMap hashMap3 = this.f165462p;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q5 q5Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q5) hashMap3.get(java.lang.Integer.valueOf(i17));
        java.util.LinkedList linkedList = ((ab4.v) this.f165455f.F.get(i17)).F;
        android.content.Context context = this.f165453d;
        if (q5Var == null || q5Var.f165428a.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateComponentsBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q5 q5Var2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q5(this);
            if (linkedList == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateComponentsBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                str = "instantiateItem";
                hashMap = hashMap2;
            } else {
                while (i27 < linkedList.size()) {
                    ab4.d0 d0Var = (ab4.d0) linkedList.get(i27);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageGroupListComponent", "gen component %s", d0Var.f2817d);
                    q5Var2.f165428a.add(com.tencent.mm.plugin.sns.ui.ta.a(context, d0Var, linearLayout, i28));
                    i27++;
                    linkedList = linkedList;
                    str2 = str2;
                    hashMap2 = hashMap2;
                }
                str = str2;
                hashMap = hashMap2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateComponentsBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            }
            if (i17 > 0 && i17 < getCount() - 1) {
                hashMap3.put(java.lang.Integer.valueOf(i17), q5Var2);
            }
            q5Var = q5Var2;
        } else {
            str = "instantiateItem";
            hashMap = hashMap2;
        }
        java.util.Iterator it = q5Var.f165428a.iterator();
        while (it.hasNext()) {
            android.view.View x17 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next()).x();
            if (x17.getParent() != null && (x17.getParent() instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) x17.getParent()).removeView(x17);
            }
            linearLayout.addView(x17);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n4x);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n4w);
        if (i28 - (-16777216) <= (-1) - i28) {
            imageView.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.ccj));
        } else {
            imageView.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.cck));
        }
        ab4.r0 r0Var = this.f165455f;
        if (r0Var.G == 1) {
            imageView.setVisibility(8);
            textView.setVisibility(8);
        } else {
            if (i17 == r0Var.F.size() - 1) {
                imageView.setVisibility(8);
                i18 = 0;
            } else {
                i18 = 0;
                imageView.setVisibility(0);
            }
            int count = getCount() - 2;
            if (i17 == 0) {
                imageView.setVisibility(8);
                i19 = count;
            } else if (i17 >= getCount() - 1) {
                imageView.setVisibility(i18);
                i19 = 1;
            } else {
                if (i17 == count) {
                    imageView.setVisibility(8);
                }
                i19 = i17;
            }
            textView.setText(i19 + "/" + count);
        }
        inflate.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(this.f165457h, linearLayout.getMeasuredHeight()));
        inflate.setBackgroundColor(i28);
        viewGroup.addView(inflate);
        viewGroup.setBackgroundColor(i28);
        hashMap.put(java.lang.Integer.valueOf(i17), inflate);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        return inflate;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isViewFromObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        boolean z17 = view == ((android.view.View) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isViewFromObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        return z17;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPrimaryItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        super.setPrimaryItem((android.view.View) viewGroup, i17, obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrimaryItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
    }
}
