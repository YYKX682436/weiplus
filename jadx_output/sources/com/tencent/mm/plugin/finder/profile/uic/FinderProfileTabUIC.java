package com.tencent.mm.plugin.finder.profile.uic;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC;", "Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderTabUIC;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "com/tencent/mm/plugin/finder/profile/uic/je", "com/tencent/mm/plugin/finder/profile/uic/ke", "com/tencent/mm/plugin/finder/profile/uic/re", "com/tencent/mm/plugin/finder/profile/uic/se", "com/tencent/mm/plugin/finder/profile/uic/te", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileTabUIC extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {
    public static int D;
    public java.lang.String A;
    public final java.lang.String B;
    public final java.util.HashMap C;

    /* renamed from: v, reason: collision with root package name */
    public boolean f123460v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f123461w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f123462x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f123463y;

    /* renamed from: z, reason: collision with root package name */
    public int f123464z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileTabUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f123461w = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.bg(this));
        this.f123462x = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.cg(this));
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f3r);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.A = string;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[Provider] username=");
        sb6.append(F7());
        sb6.append(" isSelf=");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            sb6.append(((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf());
            sb6.append(" isSelfFlag=");
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            if (context2 instanceof androidx.appcompat.app.AppCompatActivity) {
                sb6.append(((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelfFlag());
                sb6.append(" isPrivateAccount=");
                ya2.g gVar = ya2.h.f460484a;
                sb6.append(hc2.s.f(gVar.b(F7())));
                sb6.append(" profileContact=");
                sb6.append(gVar.b(F7()) != null);
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", sb6.toString());
                this.B = xy2.c.e(getContext());
                this.C = new java.util.HashMap();
                return;
            }
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A7(r45.c23 r13) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.A7(r45.c23):void");
    }

    public final void B7() {
        int intExtra = getIntent().getIntExtra("key_enter_profile_type", 0);
        java.lang.String F7 = F7();
        java.lang.String str = this.B;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        gm0.j1.d().g(new db2.e6(0, intExtra, F7, str, null, 0, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()));
    }

    public final void C7() {
        int intExtra = getIntent().getIntExtra("key_enter_profile_type", 0);
        java.lang.String F7 = F7();
        java.lang.String str = this.B;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        gm0.j1.d().g(new db2.f6(0, intExtra, F7, str, null, 0, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()));
    }

    public final com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment D7(java.lang.Class clazz) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.util.Iterator it = Y6().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj).getClass(), clazz)) {
                break;
            }
        }
        return (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj;
    }

    public final java.lang.String E7(int i17) {
        switch (i17) {
            case 1:
                return getContext().getResources().getString(com.tencent.mm.R.string.ey7);
            case 2:
                return getContext().getResources().getString(com.tencent.mm.R.string.f3r);
            case 3:
                return getContext().getResources().getString(com.tencent.mm.R.string.ezg);
            case 4:
                return getContext().getResources().getString(com.tencent.mm.R.string.f492025ez4);
            case 5:
                return getContext().getResources().getString(com.tencent.mm.R.string.f0g);
            case 6:
                return getContext().getResources().getString(com.tencent.mm.R.string.f0h);
            case 7:
                return getContext().getResources().getString(com.tencent.mm.R.string.f0d);
            case 8:
            case 11:
            default:
                return "";
            case 9:
                return getContext().getResources().getString(com.tencent.mm.R.string.eyu);
            case 10:
                return getContext().getResources().getString(com.tencent.mm.R.string.f492035f06);
            case 12:
                return getContext().getResources().getString(com.tencent.mm.R.string.f492032f03);
            case 13:
                return getContext().getResources().getString(com.tencent.mm.R.string.eyr);
            case 14:
                return getContext().getResources().getString(com.tencent.mm.R.string.f491318lq0);
            case 15:
                return getContext().getResources().getString(com.tencent.mm.R.string.f491976mr5);
            case 16:
                return getContext().getResources().getString(com.tencent.mm.R.string.nxr);
        }
    }

    public final java.lang.String F7() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final boolean G7() {
        r45.aw0 aw0Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        r45.uw2 uw2Var;
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.R8).getValue()).r()).intValue() == 1;
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "isEmojiEnabled: " + z17);
        if (z17) {
            this.f123464z = -1272779573;
        }
        ya2.b2 b17 = ya2.h.f460484a.b(F7());
        if (b17 != null && (aw0Var = b17.field_bindInfoList) != null && (list = aw0Var.getList(0)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.zv0) obj).getInteger(0) == 5) {
                    break;
                }
            }
            r45.zv0 zv0Var = (r45.zv0) obj;
            if (zv0Var != null && (uw2Var = (r45.uw2) zv0Var.getCustom(5)) != null) {
                this.f123464z = uw2Var.getInteger(0);
                return true;
            }
        }
        return z17;
    }

    public final void H7(boolean z17) {
        com.tencent.mm.plugin.finder.profile.uic.re reVar;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        this.f123460v = z17;
        int color = z17 ? getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9_Night_Mode) : getContext().getResources().getColor(com.tencent.mm.R.color.a0c);
        int color2 = z17 ? getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode) : getContext().getResources().getColor(com.tencent.mm.R.color.f478873jj);
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            tabLayout.t(color, color2);
        }
        com.google.android.material.tabs.TabLayout tabLayout2 = this.f133658g;
        if (tabLayout2 != null) {
            tabLayout2.setSelectedTabIndicatorColor(color);
        }
        for (androidx.lifecycle.m1 m1Var : Y6()) {
            if (m1Var instanceof com.tencent.mm.plugin.finder.profile.uic.je) {
                ((com.tencent.mm.plugin.finder.profile.uic.je) m1Var).k(z17);
            }
        }
        java.util.Iterator it = f7().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zx2.i iVar = (zx2.i) it.next();
            reVar = iVar instanceof com.tencent.mm.plugin.finder.profile.uic.re ? (com.tencent.mm.plugin.finder.profile.uic.re) iVar : null;
            if (reVar != null && (textView2 = reVar.f477052j) != null) {
                textView2.setTextColor(color2);
            }
        }
        com.google.android.material.tabs.TabLayout tabLayout3 = this.f133658g;
        if (tabLayout3 != null) {
            java.lang.Object a07 = kz5.n0.a0(f7(), tabLayout3.getSelectedTabPosition());
            reVar = a07 instanceof com.tencent.mm.plugin.finder.profile.uic.re ? (com.tencent.mm.plugin.finder.profile.uic.re) a07 : null;
            if (reVar == null || (textView = reVar.f477052j) == null) {
                return;
            }
            textView.setTextColor(color);
        }
    }

    public final void I7(int i17, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        java.util.Iterator it = f7().iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            zx2.i iVar = (zx2.i) it.next();
            com.tencent.mm.plugin.finder.profile.uic.re reVar = iVar instanceof com.tencent.mm.plugin.finder.profile.uic.re ? (com.tencent.mm.plugin.finder.profile.uic.re) iVar : null;
            if (reVar != null && reVar.f124186k == i17) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 == -1 || Y6().contains(fragment)) {
            return;
        }
        fragment.f129265p = i17;
        tw2.b bVar = this.f133661m;
        if (bVar != null) {
            java.util.Iterator it6 = bVar.f422458m.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) it6.next()).f129265p == i17) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            if (i19 != -1) {
                bVar.a(new tw2.a(1, i19), fragment);
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "error no fragment");
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void U6() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            tabLayout.a(new com.tencent.mm.plugin.finder.profile.uic.df(this, tabLayout));
            int i17 = 0;
            for (java.lang.Object obj : f7()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zx2.i iVar = (zx2.i) obj;
                iVar.f477040a = i17;
                O6(iVar, -1);
                i17 = i18;
            }
            S6();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        if (r2.intValue() != 2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V6() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.V6():void");
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new com.tencent.mm.plugin.finder.profile.uic.ke(this);
    }

    public final boolean isSelfFlag() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelfFlag();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = (com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager;
            finderViewPager.setOffscreenPageLimit(20);
            finderViewPager.setEnableViewPagerScroll(true);
        }
        V6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        android.content.Intent intent;
        int intExtra;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && (45 == (intExtra = intent.getIntExtra("key_enter_profile_type", 0)) || 46 == intExtra || 56 == intExtra || 55 == intExtra || 57 == intExtra)) {
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            ra0.x xVar = (ra0.x) i95.n0.c(ra0.x.class);
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            jz5.l[] lVarArr = new jz5.l[5];
            iy1.c cVar = iy1.c.MainUI;
            lVarArr[0] = new jz5.l("page_id", java.lang.String.valueOf(40004));
            lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            lVarArr[2] = new jz5.l("author_finder_name", F7());
            lVarArr[3] = new jz5.l("newlife_enter_profile_source", java.lang.Integer.valueOf(intExtra));
            java.lang.String stringExtra = getActivity().getIntent().getStringExtra("key_search_click_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            lVarArr[4] = new jz5.l("click_id", stringExtra);
            java.util.Map k17 = kz5.c1.k(lVarArr);
            nn3.f fVar = (nn3.f) xVar;
            fVar.getClass();
            if (activity2 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(activity2, 48, new nn3.e(fVar, k17));
            }
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.f127698fc;
        if (pm0.v.z(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue(), 1)) {
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).P6()) {
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.cf(this));
            }
        }
        if (pm0.v.z(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue(), 2)) {
            android.app.Activity context3 = getContext();
            kotlin.jvm.internal.o.g(context3, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!((com.tencent.mm.plugin.finder.profile.uic.p2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).P6()) {
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ye(this));
            }
        }
        android.app.Activity context4 = getContext();
        kotlin.jvm.internal.o.g(context4, "context");
        pf5.z zVar3 = pf5.z.f353948a;
        if (!(context4 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar3.a((androidx.appcompat.app.AppCompatActivity) context4).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf();
        int i17 = D;
        if (i17 <= 0) {
            i17 = getActivity().getIntent().getIntExtra("key_enter_profile_tab", 0);
        }
        if (i17 == 4) {
            int i18 = 0;
            for (java.lang.Object obj : Y6()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj) instanceof com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftFragment) {
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.t7(this, i18, false, 2, null);
                }
                i18 = i19;
            }
        }
        D = 0;
    }

    public final void w7(zx2.i tab, boolean z17) {
        kotlin.jvm.internal.o.g(tab, "tab");
        java.util.HashMap hashMap = this.C;
        int i17 = ((com.tencent.mm.plugin.finder.profile.uic.re) tab).f124186k;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
        if (num != null) {
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileEmptyLoadingFragment finderProfileEmptyLoadingFragment = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileEmptyLoadingFragment();
            finderProfileEmptyLoadingFragment.f129265p = i17;
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "addTabWithEmptyLoadingFragment, tabType: " + i17 + ", tabName: " + E7(i17));
            P6(num.intValue(), tab, finderProfileEmptyLoadingFragment, z17);
            java.lang.Integer num2 = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
            if ((num2 != null && num2.intValue() == 0) || hashMap.size() == 1) {
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.dg(tab, this));
            }
        }
    }

    public final void x7() {
        com.tencent.mm.view.HardTouchableLayout h17 = c7().h();
        if (h17 != null) {
            h17.setVisibility(8);
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = (com.tencent.mm.plugin.finder.profile.uic.ob) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.ob.class);
        android.view.View view = obVar != null ? (android.view.View) ((jz5.n) obVar.f124082x1).getValue() : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC", "changeTabLayoutToJustWatchedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC", "changeTabLayoutToJustWatchedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = (android.view.View) ((jz5.n) this.f123462x).getValue();
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC", "changeTabLayoutToJustWatchedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC", "changeTabLayoutToJustWatchedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
            ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager).setEnableSrollHorizontally(false);
        }
    }

    public boolean y7(int i17) {
        boolean z17;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        java.util.Iterator it = Y6().iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) it.next()).f129265p == i17) {
                z17 = true;
                break;
            }
        }
        if (!z17) {
            return false;
        }
        java.util.Iterator it6 = Y6().iterator();
        while (true) {
            if (!it6.hasNext()) {
                finderHomeTabFragment = null;
                break;
            }
            finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) it6.next();
            if (finderHomeTabFragment.f129265p == i17) {
                break;
            }
        }
        return (finderHomeTabFragment instanceof com.tencent.mm.plugin.finder.profile.uic.FinderProfileEmptyLoadingFragment) ^ true;
    }

    public final void z7() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127802l5).getValue()).r()).intValue() == 1)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkShopTab unSupport shop tab!");
        } else if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkShopTab isTeenMode!");
        } else {
            I7(12, new com.tencent.mm.plugin.finder.profile.FinderProfileProductFragment());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileTabUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123461w = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.bg(this));
        this.f123462x = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.cg(this));
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f3r);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.A = string;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[Provider] username=");
        sb6.append(F7());
        sb6.append(" isSelf=");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            sb6.append(((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf());
            sb6.append(" isSelfFlag=");
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            if (context2 instanceof androidx.appcompat.app.AppCompatActivity) {
                sb6.append(((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelfFlag());
                sb6.append(" isPrivateAccount=");
                ya2.g gVar = ya2.h.f460484a;
                sb6.append(hc2.s.f(gVar.b(F7())));
                sb6.append(" profileContact=");
                sb6.append(gVar.b(F7()) != null);
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", sb6.toString());
                this.B = xy2.c.e(getContext());
                this.C = new java.util.HashMap();
                return;
            }
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
