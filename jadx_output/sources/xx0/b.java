package xx0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457853d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f457854e;

    /* renamed from: f, reason: collision with root package name */
    public int f457855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f457856g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xx0.c f457857h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xx0.j f457858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, xx0.c cVar, xx0.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457856g = context;
        this.f457857h = cVar;
        this.f457858i = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xx0.b(this.f457856g, this.f457857h, this.f457858i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.widget.ProgressBar progressBar;
        xx0.c cVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f457855f;
        android.content.Context context = this.f457856g;
        boolean z17 = true;
        xx0.c cVar2 = this.f457857h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            progressBar = new android.widget.ProgressBar(context);
            progressBar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            progressBar.setBackgroundColor(0);
            progressBar.setIndeterminateDrawable(progressBar.getResources().getDrawable(com.tencent.mm.R.drawable.avg));
            cVar2.addView(progressBar);
            xx0.i iVar = cVar2.f457862e;
            this.f457853d = progressBar;
            this.f457854e = cVar2;
            this.f457855f = 1;
            obj = iVar.b(true, this);
            if (obj == aVar) {
                return aVar;
            }
            cVar = cVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (xx0.c) this.f457854e;
            progressBar = (android.widget.ProgressBar) this.f457853d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        cVar.f457866i = kz5.n0.V0((java.util.Collection) obj);
        java.util.List list = cVar2.f457866i;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((vt3.r) it.next()).f440042d) {
                    break;
                }
            }
        }
        z17 = false;
        cVar2.f457867m = z17;
        cVar2.removeView(progressBar);
        cVar2.getClass();
        com.google.android.material.tabs.TabLayout tabLayout = new com.google.android.material.tabs.TabLayout(context, null);
        tabLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, tabLayout.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db)));
        tabLayout.setBackground(null);
        tabLayout.setTabGravity(0);
        tabLayout.setSelectedTabIndicatorColor(tabLayout.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        tabLayout.setTabIndicatorFullWidth(false);
        tabLayout.setSelectedTabIndicatorHeight(tabLayout.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh));
        tabLayout.setTabMode(0);
        tabLayout.setTabRippleColor(null);
        cVar2.f457863f = tabLayout;
        cVar2.addView(tabLayout);
        com.tencent.mm.mj_publisher.finder.widgets.NoScrollViewPager noScrollViewPager = new com.tencent.mm.mj_publisher.finder.widgets.NoScrollViewPager(context, null, 2, null);
        cVar2.getClass();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        noScrollViewPager.setLayoutParams(layoutParams);
        cVar2.addView(noScrollViewPager);
        tabLayout.a(new xx0.a(cVar2, noScrollViewPager));
        cVar2.f457864g = new xx0.f0(cVar2.f457861d, cVar2.f457866i, cVar2.f457862e, this.f457858i);
        noScrollViewPager.setAdapter(cVar2.f457864g);
        noScrollViewPager.setOffscreenPageLimit(3);
        for (vt3.r rVar : cVar2.f457866i) {
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489424dk2, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qoy)).setText(rVar.f440040b);
            inflate.setTag(new java.lang.Long(rVar.f440039a));
            oa.i l17 = tabLayout.l();
            l17.f343783f = inflate;
            l17.f();
            tabLayout.b(l17);
        }
        return jz5.f0.f302826a;
    }
}
