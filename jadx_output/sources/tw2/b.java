package tw2;

/* loaded from: classes2.dex */
public final class b extends tw2.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f422458m;

    /* renamed from: n, reason: collision with root package name */
    public tw2.a f422459n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f422460o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f422461p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.viewpager.widget.ViewPager viewPager, androidx.fragment.app.FragmentManager manager, java.util.List pageFragments) {
        super(manager);
        kotlin.jvm.internal.o.g(viewPager, "viewPager");
        kotlin.jvm.internal.o.g(manager, "manager");
        kotlin.jvm.internal.o.g(pageFragments, "pageFragments");
        this.f422458m = pageFragments;
        this.f422460o = new java.util.ArrayList();
        this.f422461p = new java.util.ArrayList();
    }

    public final void a(tw2.a action, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f422459n = action;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyItemChange actionType:");
        int i17 = action.f422456a;
        sb6.append(i17);
        sb6.append(" position ");
        int i18 = action.f422457b;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", sb6.toString());
        java.util.List list = this.f422458m;
        if (i17 == 0) {
            if (obj != null) {
                if (i18 < 0 || i18 > list.size()) {
                    com.tencent.mars.xlog.Log.e("Finder.DynamicAdapter", "notifyAddItem index out of range");
                    return;
                }
                if (!(!list.contains(obj))) {
                    list = null;
                }
                if (list != null) {
                    list.add(i18, obj);
                }
                notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            if (i18 < 0 || i18 >= list.size()) {
                com.tencent.mars.xlog.Log.e("Finder.DynamicAdapter", "notifyRemoveItem index out of range");
                return;
            } else {
                list.remove(i18);
                notifyDataSetChanged();
                return;
            }
        }
        if (obj != null) {
            if (i18 < 0 || i18 > list.size()) {
                com.tencent.mars.xlog.Log.e("Finder.DynamicAdapter", "notifyAddItem index out of range");
            } else {
                list.set(i18, obj);
                notifyDataSetChanged();
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(android.view.ViewGroup container) {
        kotlin.jvm.internal.o.g(container, "container");
        androidx.fragment.app.i2 i2Var = this.f422475f;
        if (i2Var != null) {
            i2Var.g();
            this.f422475f = null;
        }
        com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", "finishUpdate");
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f422458m.size();
    }

    @Override // tw2.i
    public androidx.fragment.app.Fragment getItem(int i17) {
        java.lang.Object obj = this.f422458m.get(i17);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        if (fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getItem ");
            sb6.append(i17);
            sb6.append(" fragment:");
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment;
            sb6.append(finderHomeTabFragment.f129263n);
            sb6.append(" tabType:");
            sb6.append(finderHomeTabFragment.f129265p);
            com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", sb6.toString());
        }
        return fragment;
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object object) {
        tw2.a aVar;
        kotlin.jvm.internal.o.g(object, "object");
        int itemPosition = super.getItemPosition(object);
        com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", "getItemPosition : position " + itemPosition);
        if (!(object instanceof androidx.fragment.app.Fragment) || (aVar = this.f422459n) == null) {
            return itemPosition;
        }
        int indexOf = this.f422458m.indexOf(object);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getItemPosition : newPosition ");
        sb6.append(indexOf);
        sb6.append(" changePosition :");
        int i17 = aVar.f422457b;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", sb6.toString());
        if (indexOf == -1) {
            indexOf = -2;
        } else {
            if (indexOf < i17) {
                com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", "unchanged");
                return -1;
            }
            com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", "use new " + indexOf);
        }
        return indexOf;
    }

    @Override // tw2.i, androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        androidx.fragment.app.Fragment fragment;
        androidx.fragment.app.Fragment.SavedState savedState;
        kotlin.jvm.internal.o.g(container, "container");
        com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", "instantiateItem " + i17 + " action:" + this.f422459n);
        tw2.a aVar = this.f422459n;
        if (aVar == null || aVar.f422456a != 0) {
            return super.instantiateItem(container, i17);
        }
        java.util.ArrayList arrayList = this.f422477h;
        if (i17 == arrayList.size()) {
            return super.instantiateItem(container, i17);
        }
        if (i17 < arrayList.size()) {
            if (this.f422475f == null) {
                this.f422475f = this.f422473d.beginTransaction();
            }
            fragment = getItem(i17);
            java.util.ArrayList arrayList2 = this.f422476g;
            if (arrayList2.size() > i17 && (savedState = (androidx.fragment.app.Fragment.SavedState) arrayList2.get(i17)) != null) {
                fragment.setInitialSavedState(savedState);
            }
            fragment.setMenuVisibility(false);
            fragment.setUserVisibleHint(false);
            arrayList.add(i17, fragment);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("instantiateItemInner: title:");
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment;
            sb6.append(finderHomeTabFragment.f129263n);
            sb6.append(" tabType:");
            sb6.append(finderHomeTabFragment.f129265p);
            com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", sb6.toString());
            androidx.fragment.app.i2 i2Var = this.f422475f;
            if (i2Var != null) {
                i2Var.h(container.getId(), fragment, null, 1);
            }
        } else {
            fragment = null;
        }
        return fragment == null ? super.instantiateItem(container, i17) : fragment;
    }

    @Override // androidx.viewpager.widget.a
    public void notifyDataSetChanged() {
        com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", "notifyDataSetChanged");
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(android.view.ViewGroup container, int i17, java.lang.Object object) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(object, "object");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPrimaryItem ");
        sb6.append(i17);
        sb6.append("  changePosition ");
        tw2.a aVar = this.f422459n;
        sb6.append(aVar != null ? java.lang.Integer.valueOf(aVar.f422457b) : null);
        sb6.append(", obj:");
        sb6.append(object);
        sb6.append(" title:");
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) object;
        sb6.append(finderHomeTabFragment.f129263n);
        sb6.append(" tabType:");
        sb6.append(finderHomeTabFragment.f129265p);
        com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", sb6.toString());
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) object;
        androidx.fragment.app.Fragment fragment2 = this.f422478i;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                androidx.fragment.app.Fragment fragment3 = this.f422478i;
                kotlin.jvm.internal.o.d(fragment3);
                fragment3.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f422478i = fragment;
        }
        tw2.a aVar2 = this.f422459n;
        if (aVar2 == null || aVar2.f422457b != i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", "setPrimaryItem action null");
        this.f422459n = null;
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(android.view.ViewGroup container) {
        kotlin.jvm.internal.o.g(container, "container");
        if (container.getId() != -1) {
            com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", "startUpdate");
            return;
        }
        throw new java.lang.IllegalStateException(("ViewPager with adapter " + this + " requires a view id").toString());
    }
}
