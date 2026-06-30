package ni2;

/* loaded from: classes3.dex */
public final class w extends com.tencent.mm.plugin.finder.live.widget.g implements ni2.v2 {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f337487h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.i0 f337488i;

    /* renamed from: m, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f337489m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f337490n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f337491o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f337492p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f337493q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f337494r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f337495s;

    /* renamed from: t, reason: collision with root package name */
    public final int f337496t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(context, false, zl2.u4.f473989e, false, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f337487h = basePlugin;
        this.f337495s = jz5.h.b(new ni2.s(this));
        int h07 = ((int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * (ae2.in.f3688a.h0() / 100.0f))) - com.tencent.mm.ui.bl.c(context);
        this.f337496t = h07;
        fg2.i0 i0Var = this.f337488i;
        if (i0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = i0Var.f262074a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = h07;
        }
        this.f118384g.c(null);
    }

    public final void A(km2.q qVar, java.util.List list, km2.q qVar2) {
        androidx.viewpager.widget.ViewPager viewPager = this.f337490n;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        viewPager.setAdapter(new ni2.k(this.f337487h, qVar, list, this));
        androidx.viewpager.widget.ViewPager viewPager2 = this.f337490n;
        if (viewPager2 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        viewPager2.setOffscreenPageLimit(list.size() - 1);
        com.google.android.material.tabs.TabLayout tabLayout = this.f337489m;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        androidx.viewpager.widget.ViewPager viewPager3 = this.f337490n;
        if (viewPager3 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        tabLayout.setupWithViewPager(viewPager3);
        if (qVar2 != null) {
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(((km2.q) it.next()).f309170a, qVar2.f309170a)) {
                    break;
                } else {
                    i17++;
                }
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                androidx.viewpager.widget.ViewPager viewPager4 = this.f337490n;
                if (viewPager4 == null) {
                    kotlin.jvm.internal.o.o("viewPager");
                    throw null;
                }
                viewPager4.setCurrentItem(intValue);
            }
        }
        androidx.viewpager.widget.ViewPager viewPager5 = this.f337490n;
        if (viewPager5 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        viewPager5.addOnPageChangeListener(new ni2.v(this));
        if (zl2.r4.f473950a.w1()) {
            ml2.q2 q2Var = ml2.q2.F;
            com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 33 ");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
            return;
        }
        ml2.n4 n4Var = ml2.n4.G;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 30");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void a() {
        yh2.h memberAdapter;
        super.a();
        androidx.viewpager.widget.ViewPager viewPager = this.f337490n;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        n3.t1 t1Var = new n3.t1(viewPager);
        while (t1Var.hasNext()) {
            android.view.View view = (android.view.View) t1Var.next();
            com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView finderLiveMicGiftMemberPanelTabView = view instanceof com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView ? (com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView) view : null;
            if (finderLiveMicGiftMemberPanelTabView != null && (memberAdapter = finderLiveMicGiftMemberPanelTabView.getMemberAdapter()) != null) {
                memberAdapter.f462394p.clear();
                memberAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.deu;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.f6b;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f6b);
        if (weImageView != null) {
            i17 = com.tencent.mm.R.id.f6c;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.f6c);
            if (frameLayout != null) {
                com.tencent.mm.ui.widget.TopRoundCornerConstraintLayout topRoundCornerConstraintLayout = (com.tencent.mm.ui.widget.TopRoundCornerConstraintLayout) rootView;
                i17 = com.tencent.mm.R.id.f8x;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f8x);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.f484821tp4;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f484821tp4);
                    if (textView2 != null) {
                        i17 = com.tencent.mm.R.id.qz6;
                        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.tencent.mm.R.id.qz6);
                        if (imageView != null) {
                            i17 = com.tencent.mm.R.id.r1b;
                            com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) x4.b.a(rootView, com.tencent.mm.R.id.r1b);
                            if (tabLayout != null) {
                                i17 = com.tencent.mm.R.id.r1p;
                                androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) x4.b.a(rootView, com.tencent.mm.R.id.r1p);
                                if (viewPager != null) {
                                    this.f337488i = new fg2.i0(topRoundCornerConstraintLayout, weImageView, frameLayout, topRoundCornerConstraintLayout, textView, textView2, imageView, tabLayout, viewPager);
                                    weImageView.setOnClickListener(new ni2.t(this));
                                    fg2.i0 i0Var = this.f337488i;
                                    if (i0Var == null) {
                                        kotlin.jvm.internal.o.o("uiBinding");
                                        throw null;
                                    }
                                    com.google.android.material.tabs.TabLayout tlLinkMicContributor = i0Var.f262078e;
                                    kotlin.jvm.internal.o.f(tlLinkMicContributor, "tlLinkMicContributor");
                                    this.f337489m = tlLinkMicContributor;
                                    fg2.i0 i0Var2 = this.f337488i;
                                    if (i0Var2 == null) {
                                        kotlin.jvm.internal.o.o("uiBinding");
                                        throw null;
                                    }
                                    androidx.viewpager.widget.ViewPager vpLinkMicContributor = i0Var2.f262079f;
                                    kotlin.jvm.internal.o.f(vpLinkMicContributor, "vpLinkMicContributor");
                                    this.f337490n = vpLinkMicContributor;
                                    fg2.i0 i0Var3 = this.f337488i;
                                    if (i0Var3 == null) {
                                        kotlin.jvm.internal.o.o("uiBinding");
                                        throw null;
                                    }
                                    android.widget.TextView finderLiveMainTitleText = i0Var3.f262075b;
                                    kotlin.jvm.internal.o.f(finderLiveMainTitleText, "finderLiveMainTitleText");
                                    this.f337491o = finderLiveMainTitleText;
                                    fg2.i0 i0Var4 = this.f337488i;
                                    if (i0Var4 == null) {
                                        kotlin.jvm.internal.o.o("uiBinding");
                                        throw null;
                                    }
                                    android.widget.ImageView ivBgPkRanklist = i0Var4.f262077d;
                                    kotlin.jvm.internal.o.f(ivBgPkRanklist, "ivBgPkRanklist");
                                    this.f337492p = ivBgPkRanklist;
                                    fg2.i0 i0Var5 = this.f337488i;
                                    if (i0Var5 == null) {
                                        kotlin.jvm.internal.o.o("uiBinding");
                                        throw null;
                                    }
                                    android.widget.TextView finderLiveSubtitleText = i0Var5.f262076c;
                                    kotlin.jvm.internal.o.f(finderLiveSubtitleText, "finderLiveSubtitleText");
                                    this.f337493q = finderLiveSubtitleText;
                                    android.widget.TextView textView3 = this.f337491o;
                                    if (textView3 != null) {
                                        com.tencent.mm.ui.fk.a(textView3);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.o.o("tvTitle");
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    public final void y(km2.q qVar, boolean z17) {
        java.lang.String str;
        java.lang.String str2 = qVar.f309173d;
        if (str2 == null) {
            str2 = "";
        }
        if (!(str2.length() > 10)) {
            str2 = null;
        }
        if (str2 == null || (str = r26.p0.E0(str2, 10).concat("...")) == null) {
            str = qVar.f309173d;
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.f337489m;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(tabLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "openPanelForSingleUser", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "openPanelForSingleUser", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = this.f337492p;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("ivBgPkRanklist");
            throw null;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "openPanelForSingleUser", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "openPanelForSingleUser", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Context context = this.f118381d;
        if (z17) {
            android.widget.TextView textView = this.f337491o;
            if (textView == null) {
                kotlin.jvm.internal.o.o("tvTitle");
                throw null;
            }
            textView.setText(context.getString(com.tencent.mm.R.string.m3f, str));
        } else {
            android.widget.TextView textView2 = this.f337491o;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("tvTitle");
                throw null;
            }
            textView2.setText(context.getString(com.tencent.mm.R.string.m3b, str));
        }
        this.f337494r = true;
        A(qVar, kz5.p0.f313996d, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0247, code lost:
    
        if ((!r8.isEmpty()) != false) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Type inference failed for: r12v10, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v15, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.tencent.mm.plugin.finder.live.widget.g, ni2.w] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v27, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [kz5.p0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(fj2.k r22, km2.q r23) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni2.w.z(fj2.k, km2.q):void");
    }
}
