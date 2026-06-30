package dv2;

/* loaded from: classes2.dex */
public final class b0 extends zx2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new dv2.y(this);
    }

    @Override // zx2.h, com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
            ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager).setEnableSrollHorizontally(false);
        }
        this.f133656e = false;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qll);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.t7(this, 0, false, 2, null);
    }

    @Override // zx2.h, com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void s7(int i17, boolean z17) {
        super.s7(i17, z17);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        dv2.x xVar = (dv2.x) pf5.z.f353948a.a(activity).e(dv2.x.class);
        if (xVar != null) {
            boolean z18 = (i17 == 0 || i17 == 1 || i17 == 2 || i17 == 3) && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.R9).getValue()).r()).intValue() == 1;
            boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
            com.tencent.mars.xlog.Log.i("Finder.FinderMixCellSearchUIC", "enableSearch: isEnable=" + z18 + ", isInTeenMode=" + isTeenMode);
            android.view.View view = xVar.f243970d;
            if (view == null) {
                return;
            }
            int i18 = (!z18 || isTeenMode) ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uic/FinderMixCellSearchUIC", "enableSearch", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/uic/FinderMixCellSearchUIC", "enableSearch", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
