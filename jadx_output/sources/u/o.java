package u;

/* loaded from: classes16.dex */
public final class o extends u.n implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
    public final java.util.ArrayList B6;
    public com.tencent.mm.ui.vas.VASCommonFragment C6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.B6 = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.C6;
        boolean z17 = false;
        if (vASCommonFragment != null && (vASActivity = vASCommonFragment.f211121p) != null) {
            vASActivity.onBackPressed();
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CombineViewPagerUIC", "onBackPressed, consume result=" + z17);
        return z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [com.tencent.mm.ui.vas.VASCommonFragment] */
    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.combine.CombineVisibilityFragment combineVisibilityFragment;
        com.tencent.mars.xlog.Log.i("MicroMsg.CombineViewPagerUIC", "onCreate");
        android.content.Intent intent = getActivity().getIntent();
        int[] intArrayExtra = intent.getIntArrayExtra("visibility_tab_type_list");
        if (intArrayExtra == null) {
            intArrayExtra = new int[]{0, 1};
        }
        int length = intArrayExtra.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.B6;
            if (i17 >= length) {
                break;
            }
            int i19 = intArrayExtra[i17];
            int i27 = i18 + 1;
            android.content.Intent intent2 = new android.content.Intent();
            android.os.Bundle bundleExtra = intent.getBundleExtra("visibility_tab_type_list" + i19);
            if (bundleExtra == null) {
                bundleExtra = new android.os.Bundle();
            }
            intent2.putExtras(bundleExtra);
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            if (i19 == 0) {
                int i28 = com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.f143271p1;
                intent2.setClass(context, com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.class);
                com.tencent.mm.plugin.combine.CombineVisibilityFragment combineVisibilityFragment2 = (com.tencent.mm.plugin.combine.CombineVisibilityFragment) lk5.q0.a(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.class, intent2, false, false, false, com.tencent.mm.plugin.combine.CombineVisibilityFragment.class, 28, null);
                combineVisibilityFragment2.S1 = false;
                combineVisibilityFragment = combineVisibilityFragment2;
            } else if (i19 != 1) {
                combineVisibilityFragment = new com.tencent.mm.ui.vas.VASCommonFragment();
            } else {
                int i29 = com.tencent.mm.ui.mvvm.MvvmContactListUI.f209252h;
                intent2.setClass(context, com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
                com.tencent.mm.plugin.combine.CombineVisibilityFragment combineVisibilityFragment3 = (com.tencent.mm.plugin.combine.CombineVisibilityFragment) lk5.q0.a(com.tencent.mm.ui.mvvm.MvvmContactListUI.class, intent2, false, false, false, com.tencent.mm.plugin.combine.CombineVisibilityFragment.class, 28, null);
                combineVisibilityFragment3.S1 = false;
                combineVisibilityFragment = combineVisibilityFragment3;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CombineViewPagerUIC", "index:" + i18 + " type:" + i19 + " fragment:" + combineVisibilityFragment);
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(i19), combineVisibilityFragment));
            if (i18 == T6()) {
                this.C6 = combineVisibilityFragment;
            }
            i17++;
            i18 = i27;
        }
        androidx.viewpager.widget.ViewPager P6 = P6();
        androidx.fragment.app.FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        kotlin.jvm.internal.o.f(supportFragmentManager, "getSupportFragmentManager(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((com.tencent.mm.ui.vas.VASCommonFragment) ((jz5.l) it.next()).f302834e);
        }
        P6.setAdapter(new u.p(supportFragmentManager, arrayList2));
        P6().setOffscreenPageLimit(intArrayExtra.length - 1);
        P6().addOnPageChangeListener(this);
        P6().setCurrentItem(T6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CombineViewPagerUIC", "onDestroy");
        P6().removeOnPageChangeListener(this);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        java.lang.Object obj = this.B6.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        jz5.l lVar = (jz5.l) obj;
        this.C6 = (com.tencent.mm.ui.vas.VASCommonFragment) lVar.f302834e;
        com.tencent.mars.xlog.Log.i("MicroMsg.CombineViewPagerUIC", "onPageSelected position=" + i17 + " type=" + ((java.lang.Number) lVar.f302833d).intValue());
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        u.k kVar = (u.k) pf5.z.f353948a.a(activity).a(u.k.class);
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CombineTabBarUIC", "onPageSelected position=" + i17);
        oa.i k17 = kVar.a().k(i17);
        if (k17 == null || k17.a()) {
            return;
        }
        k17.b();
    }
}
