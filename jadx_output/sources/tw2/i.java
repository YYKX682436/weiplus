package tw2;

/* loaded from: classes2.dex */
public abstract class i extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.fragment.app.FragmentManager f422473d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.fragment.app.FragmentManager f422474e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.fragment.app.i2 f422475f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f422476g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f422477h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.fragment.app.Fragment f422478i;

    public i(androidx.fragment.app.FragmentManager fm6) {
        kotlin.jvm.internal.o.g(fm6, "fm");
        this.f422473d = fm6;
        this.f422476g = new java.util.ArrayList();
        this.f422477h = new java.util.ArrayList();
        this.f422474e = fm6;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object object) {
        java.util.ArrayList arrayList;
        androidx.fragment.app.Fragment.SavedState savedState;
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(object, "object");
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) object;
        androidx.fragment.app.i2 i2Var = this.f422475f;
        androidx.fragment.app.FragmentManager fragmentManager = this.f422474e;
        if (i2Var == null) {
            kotlin.jvm.internal.o.d(fragmentManager);
            this.f422475f = fragmentManager.beginTransaction();
        }
        while (true) {
            arrayList = this.f422476g;
            if (arrayList.size() > i17) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        if (fragment.isAdded()) {
            kotlin.jvm.internal.o.d(fragmentManager);
            savedState = fragmentManager.saveFragmentInstanceState(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i17, savedState);
        this.f422477h.set(i17, null);
        androidx.fragment.app.i2 i2Var2 = this.f422475f;
        kotlin.jvm.internal.o.d(i2Var2);
        i2Var2.j(fragment);
    }

    public abstract androidx.fragment.app.Fragment getItem(int i17);

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        androidx.fragment.app.Fragment.SavedState savedState;
        androidx.fragment.app.Fragment fragment;
        kotlin.jvm.internal.o.g(container, "container");
        java.util.ArrayList arrayList = this.f422477h;
        if (arrayList.size() > i17 && (fragment = (androidx.fragment.app.Fragment) arrayList.get(i17)) != null) {
            return fragment;
        }
        if (this.f422475f == null) {
            androidx.fragment.app.FragmentManager fragmentManager = this.f422474e;
            kotlin.jvm.internal.o.d(fragmentManager);
            this.f422475f = fragmentManager.beginTransaction();
        }
        androidx.fragment.app.Fragment item = getItem(i17);
        java.util.ArrayList arrayList2 = this.f422476g;
        if (arrayList2.size() > i17 && (savedState = (androidx.fragment.app.Fragment.SavedState) arrayList2.get(i17)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (arrayList.size() <= i17) {
            arrayList.add(null);
        }
        item.setMenuVisibility(false);
        item.setUserVisibleHint(false);
        arrayList.set(i17, item);
        androidx.fragment.app.i2 i2Var = this.f422475f;
        kotlin.jvm.internal.o.d(i2Var);
        i2Var.h(container.getId(), item, null, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("instantiateItem: title:");
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) item;
        sb6.append(finderHomeTabFragment.f129263n);
        sb6.append(" tabType:");
        sb6.append(finderHomeTabFragment.f129265p);
        com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", sb6.toString());
        return item;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(object, "object");
        return ((androidx.fragment.app.Fragment) object).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
        if (parcelable != null) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            java.util.ArrayList arrayList = this.f422476g;
            arrayList.clear();
            java.util.ArrayList arrayList2 = this.f422477h;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (android.os.Parcelable parcelable2 : parcelableArray) {
                    kotlin.jvm.internal.o.e(parcelable2, "null cannot be cast to non-null type androidx.fragment.app.Fragment.SavedState");
                    arrayList.add((androidx.fragment.app.Fragment.SavedState) parcelable2);
                }
            }
            java.util.Set<java.lang.String> keySet = bundle.keySet();
            kotlin.jvm.internal.o.f(keySet, "keySet(...)");
            for (java.lang.Object obj : keySet) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str = (java.lang.String) obj;
                if (r26.i0.y(str, "f", false)) {
                    java.lang.String substring = str.substring(1);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    int parseInt = java.lang.Integer.parseInt(substring);
                    androidx.fragment.app.FragmentManager fragmentManager = this.f422474e;
                    kotlin.jvm.internal.o.d(fragmentManager);
                    androidx.fragment.app.Fragment fragment = fragmentManager.getFragment(bundle, str);
                    if (fragment != null) {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        arrayList2.set(parseInt, fragment);
                    } else {
                        com.tencent.mars.xlog.Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public android.os.Parcelable saveState() {
        android.os.Bundle bundle;
        java.util.ArrayList arrayList = this.f422476g;
        if (arrayList.size() > 0) {
            bundle = new android.os.Bundle();
            androidx.fragment.app.Fragment.SavedState[] savedStateArr = new androidx.fragment.app.Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        java.util.ArrayList arrayList2 = this.f422477h;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) arrayList2.get(i17);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                androidx.fragment.app.FragmentManager fragmentManager = this.f422474e;
                kotlin.jvm.internal.o.d(fragmentManager);
                fragmentManager.putFragment(bundle, "f" + i17, fragment);
            }
        }
        return bundle;
    }
}
