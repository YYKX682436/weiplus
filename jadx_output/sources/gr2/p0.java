package gr2;

/* loaded from: classes2.dex */
public class p0 implements cr2.z {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f274805a;

    /* renamed from: b, reason: collision with root package name */
    public final dr2.c f274806b;

    /* renamed from: c, reason: collision with root package name */
    public final int f274807c;

    /* renamed from: d, reason: collision with root package name */
    public final int f274808d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f274809e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderViewPager f274810f;

    /* renamed from: g, reason: collision with root package name */
    public zq2.c f274811g;

    /* renamed from: h, reason: collision with root package name */
    public int f274812h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.ui.special.view.ThemeLivingViewPagerWidget$themeTagChangEvent$1 f274813i;

    /* renamed from: j, reason: collision with root package name */
    public final gr2.n0 f274814j;

    /* JADX WARN: Type inference failed for: r3v5, types: [com.tencent.mm.plugin.finder.nearby.ui.special.view.ThemeLivingViewPagerWidget$themeTagChangEvent$1] */
    public p0(final com.tencent.mm.ui.MMActivity context, dr2.c outsideOperator, float f17, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        i18 = (i19 & 16) != 0 ? 0 : i18;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
        this.f274805a = context;
        this.f274806b = outsideOperator;
        this.f274807c = i17;
        this.f274808d = i18;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f274809e = linkedList;
        this.f274812h = -1;
        this.f274813i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiveThemeTagChangeEvent>(context) { // from class: com.tencent.mm.plugin.finder.nearby.ui.special.view.ThemeLivingViewPagerWidget$themeTagChangEvent$1
            {
                this.__eventId = 1093141053;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiveThemeTagChangeEvent liveThemeTagChangeEvent) {
                com.tencent.mm.autogen.events.LiveThemeTagChangeEvent event = liveThemeTagChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive themeTagChangEvent: ");
                am.bj bjVar = event.f54478g;
                sb6.append(bjVar != null ? java.lang.Integer.valueOf(bjVar.f6257a) : null);
                sb6.append(" pos: ");
                sb6.append(bjVar != null ? java.lang.Integer.valueOf(bjVar.f6258b) : null);
                com.tencent.mars.xlog.Log.i("Finder.ThemeLivingViewPagerConvert", sb6.toString());
                if (bjVar.f6257a != 1) {
                    return false;
                }
                int i27 = bjVar.f6258b;
                gr2.p0 p0Var = gr2.p0.this;
                p0Var.getClass();
                pm0.v.X(new gr2.o0(i27, p0Var));
                p0Var.f274812h = i27;
                com.tencent.mars.xlog.Log.i("Finder.ThemeLivingViewPagerConvert", "onSelectThemeTag pos: " + i27);
                return true;
            }
        };
        this.f274814j = new gr2.n0(this, context, linkedList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void a(android.app.Activity rootView, zq2.c item) {
        java.lang.String str;
        int i17;
        gr2.p0 p0Var;
        ?? r152;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager;
        int i18;
        r45.uz2 uz2Var;
        gr2.p0 p0Var2 = this;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(item, "item");
        p0Var2.f274811g = item;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int size = item.f475030f.size();
        java.lang.String str3 = "";
        int i19 = 2;
        int i27 = 0;
        int i28 = 1;
        r45.fa2 fa2Var = item.f475029e;
        if (size > 0) {
            int i29 = 0;
            for (java.lang.Object obj : item.f475030f) {
                int i37 = i29 + 1;
                if (i29 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zq2.e eVar = (zq2.e) obj;
                java.lang.String str4 = item.f475028d;
                java.lang.String string = eVar.f475032d.getString(i28);
                if (string == null) {
                    string = str3;
                }
                r45.id2 id2Var = eVar.f475032d;
                java.lang.String string2 = id2Var.getString(i27);
                if (string2 == null) {
                    string2 = str3;
                }
                int integer = id2Var.getInteger(i19);
                int i38 = fa2Var.f374125d;
                r45.u80 u80Var = new r45.u80();
                u80Var.set(i27, java.lang.Integer.valueOf(fa2Var.f374125d));
                u80Var.set(i28, fa2Var.f374132n);
                u80Var.getList(2).addAll(item.g());
                linkedList.add(new com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeTagFragment(new er2.a(i29, str4, string, string2, integer, i38, u80Var, this, p0Var2.f274807c, p0Var2.f274808d)));
                i28 = 1;
                i19 = 2;
                fa2Var = fa2Var;
                i27 = 0;
                i29 = i37;
                str3 = str3;
                p0Var2 = this;
            }
            str = str3;
            p0Var = this;
            r152 = i28;
            i17 = i19;
        } else {
            str = "";
            java.lang.String str5 = item.f475028d;
            r45.uz2 uz2Var2 = fa2Var.f374135q;
            java.lang.String str6 = (uz2Var2 == null || (str2 = uz2Var2.f387748e) == null) ? str : str2;
            int i39 = fa2Var.f374126e;
            int i47 = fa2Var.f374125d;
            r45.u80 u80Var2 = new r45.u80();
            u80Var2.set(0, java.lang.Integer.valueOf(fa2Var.f374125d));
            u80Var2.set(1, fa2Var.f374132n);
            i17 = 2;
            u80Var2.getList(2).addAll(item.g());
            p0Var = this;
            r152 = 1;
            linkedList.add(new com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeTagFragment(new er2.a(0, str5, str6, "", i39, i47, u80Var2, this, p0Var.f274807c, p0Var.f274808d)));
        }
        java.util.LinkedList linkedList2 = p0Var.f274809e;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager2 = (com.tencent.mm.plugin.finder.view.FinderViewPager) rootView.findViewById(com.tencent.mm.R.id.f487570p16);
        if (finderViewPager2 != 0) {
            finderViewPager2.setEnableViewPagerScroll(r152);
            finderViewPager2.setOffscreenPageLimit(i17);
            com.tencent.mm.ui.MMActivity mMActivity = p0Var.f274805a;
            androidx.fragment.app.FragmentManager supportFragmentManager = mMActivity.getSupportFragmentManager();
            kotlin.jvm.internal.o.f(supportFragmentManager, "getSupportFragmentManager(...)");
            finderViewPager2.setAdapter(new dq2.c(supportFragmentManager, linkedList2, 0));
            gr2.n0 n0Var = p0Var.f274814j;
            finderViewPager2.addOnPageChangeListener(n0Var);
            int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.D2().r()).intValue();
            if (intValue > 0) {
                try {
                    java.lang.reflect.Field declaredField = androidx.viewpager.widget.ViewPager.class.getDeclaredField("mScroller");
                    kotlin.jvm.internal.o.f(declaredField, "getDeclaredField(...)");
                    declaredField.setAccessible(r152);
                    declaredField.set(finderViewPager2, new hc2.h1(mMActivity, intValue));
                } catch (java.lang.Exception e17) {
                    i18 = 0;
                    com.tencent.mars.xlog.Log.printErrStackTrace("ViewPagerExt", e17, str, new java.lang.Object[0]);
                }
            }
            i18 = 0;
            androidx.viewpager.widget.a adapter = finderViewPager2.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            zq2.c cVar = p0Var.f274811g;
            if (cVar != null) {
                r45.fa2 fa2Var2 = cVar.f475029e;
                java.lang.String str7 = (fa2Var2 == null || (uz2Var = fa2Var2.f374135q) == null) ? null : uz2Var.f387748e;
                int i48 = i18;
                for (java.lang.Object obj2 : cVar.f475030f) {
                    int i49 = i48 + 1;
                    if (i48 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (kotlin.jvm.internal.o.b(((zq2.e) obj2).f475032d.getString(r152), str7)) {
                        f0Var.f310116d = i48;
                    }
                    i48 = i49;
                }
            }
            int i57 = f0Var.f310116d;
            if (i57 > 0) {
                pm0.v.V(50L, new gr2.m0(f0Var, p0Var));
                finderViewPager = finderViewPager2;
            } else {
                n0Var.onPageSelected(i57);
                finderViewPager = finderViewPager2;
            }
        } else {
            finderViewPager = null;
        }
        p0Var.f274810f = finderViewPager;
        p0Var.f274813i.alive();
    }
}
