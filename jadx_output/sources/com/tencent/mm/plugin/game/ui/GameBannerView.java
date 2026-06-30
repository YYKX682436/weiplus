package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameBannerView extends android.widget.LinearLayout implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f140655d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f140656e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.v f140657f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMDotView f140658g;

    /* renamed from: h, reason: collision with root package name */
    public int f140659h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f140660i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f140661m;

    /* renamed from: n, reason: collision with root package name */
    public float f140662n;

    /* renamed from: o, reason: collision with root package name */
    public float f140663o;

    public GameBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140659h = 0;
        this.f140661m = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.game.ui.t(this), true);
        this.f140662n = 0.0f;
        this.f140663o = 0.0f;
        this.f140655d = context;
        android.view.View.inflate(context, com.tencent.mm.R.layout.bdy, this);
        this.f140660i = new java.util.LinkedList();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.tencent.mm.plugin.game.ui.u)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.ui.u uVar = (com.tencent.mm.plugin.game.ui.u) view.getTag();
        com.tencent.mm.pluginsdk.model.app.m mVar = uVar.f141775a;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(uVar.f141777c);
        android.content.Context context = this.f140655d;
        if (K0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameBannerView", "null or nil url");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("game_app_id", mVar.field_appId);
            bundle.putInt("game_report_from_scene", 5);
            com.tencent.mm.game.report.l.c(this.f140655d, 11, 1101, 1, r53.f.o(context, mVar.field_appId, null, bundle, 0), this.f140659h, null);
        } else {
            com.tencent.mm.game.report.l.c(this.f140655d, 11, 1101, 1, r53.f.v(context, uVar.f141777c, null, null), this.f140659h, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140658g = (com.tencent.mm.ui.base.MMDotView) findViewById(com.tencent.mm.R.id.gik);
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) findViewById(com.tencent.mm.R.id.gil);
        this.f140656e = viewPager;
        viewPager.setOnPageChangeListener(this);
        this.f140657f = new com.tencent.mm.plugin.game.ui.v(this, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            float r1 = r7.getRawX()
            float r2 = r7.getRawY()
            r3 = 3
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 == r4) goto L34
            r5 = 2
            if (r0 == r5) goto L18
            if (r0 == r3) goto L34
            goto L48
        L18:
            float r0 = r6.f140662n
            float r1 = r1 - r0
            int r0 = (int) r1
            float r1 = r6.f140663o
            float r2 = r2 - r1
            int r1 = (int) r2
            int r0 = java.lang.Math.abs(r0)
            int r1 = java.lang.Math.abs(r1)
            if (r0 <= r1) goto L48
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L48
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L48
        L34:
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L3e
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
        L3e:
            r0 = 0
            r6.f140662n = r0
            r6.f140663o = r0
            goto L48
        L44:
            r6.f140662n = r1
            r6.f140663o = r2
        L48:
            int r0 = r7.getAction()
            com.tencent.mm.sdk.platformtools.b4 r1 = r6.f140661m
            if (r0 == 0) goto L5b
            if (r0 == r4) goto L55
            if (r0 == r3) goto L55
            goto L5e
        L55:
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.c(r2, r2)
            goto L5e
        L5b:
            r1.d()
        L5e:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.GameBannerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        java.util.LinkedList linkedList = this.f140660i;
        int size = i17 % linkedList.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameBannerView", "now selected page %d, now exactly positon : %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(size));
        if (((com.tencent.mm.plugin.game.ui.u) linkedList.get(size)).f141775a == null || !gm0.j1.a()) {
            return;
        }
        com.tencent.mm.game.report.l.c(this.f140655d, 11, 1101, size + 1, 1, this.f140659h, null);
    }

    public void setBannerList(java.util.LinkedList<com.tencent.mm.plugin.game.ui.u> linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameBannerView", "Empty banner list");
            setVisibility(8);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameBannerView", "bannerList size", java.lang.Integer.valueOf(linkedList.size()));
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f140661m;
        b4Var.d();
        java.util.LinkedList linkedList2 = this.f140660i;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        this.f140656e.setAdapter(this.f140657f);
        this.f140656e.setCurrentItem(linkedList.size() * 1000, false);
        if (linkedList2.size() > 1) {
            b4Var.c(5000L, 5000L);
        }
        this.f140658g.setVisibility(8);
        setVisibility(0);
    }

    public void setSourceScene(int i17) {
        this.f140659h = i17;
    }
}
