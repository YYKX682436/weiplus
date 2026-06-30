package li2;

/* loaded from: classes10.dex */
public final class h extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public final fg2.m0 f318765J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 4);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        fg2.m0 a17 = fg2.m0.a(com.tencent.mm.ui.id.b(context), this, false);
        this.f318765J = a17;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = a17.f262135b.f262063a;
        kotlin.jvm.internal.o.f(roundCornerRelativeLayout, "getRoot(...)");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262134a;
        addView(constraintLayout);
        if (pluginAbility.f() == lj2.w0.f318958d) {
            constraintLayout.setOnClickListener(this);
        }
        roundCornerRelativeLayout.setVisibility(4);
    }

    @Override // lj2.u0
    public void g() {
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.view.ViewGroup getGiftRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLuckyMoneyRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "GrabRequestWidget";
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005a, code lost:
    
        if (r5.X() == true) goto L12;
     */
    @Override // wj2.w, lj2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(pm2.a r4, xh2.a r5) {
        /*
            r3 = this;
            java.lang.String r0 = "widgetMode"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r5, r0)
            super.l(r4, r5)
            xh2.i r4 = r5.f454521b
            int r4 = r4.f454553e
            r3.K = r4
            fg2.m0 r4 = r3.f318765J
            android.widget.TextView r5 = r4.f262138e
            zl2.r4 r0 = zl2.r4.f473950a
            boolean r1 = r0.x1()
            if (r1 == 0) goto L30
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131764237(0x7f10240d, float:1.9159602E38)
            java.lang.String r1 = r1.getString(r2)
            goto L3f
        L30:
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131763596(0x7f10218c, float:1.9158302E38)
            java.lang.String r1 = r1.getString(r2)
        L3f:
            r5.setText(r1)
            android.view.View r5 = r4.f262137d
            r1 = 2131232997(0x7f0808e5, float:1.808212E38)
            r5.setBackgroundResource(r1)
            lj2.v0 r5 = r3.getPluginAbility()
            tn0.w0 r5 = r5.h()
            r1 = 0
            if (r5 == 0) goto L5d
            boolean r5 = r5.X()
            r2 = 1
            if (r5 != r2) goto L5d
            goto L5e
        L5d:
            r2 = r1
        L5e:
            if (r2 == 0) goto L75
            boolean r5 = r0.x1()
            if (r5 != 0) goto L75
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r4.f262136c
            r0 = 2131690939(0x7f0f05bb, float:1.9010936E38)
            r5.setImageResource(r0)
            android.widget.TextView r4 = r4.f262138e
            r5 = 4
            r4.setVisibility(r5)
            goto L82
        L75:
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r4.f262136c
            r0 = 2131691135(0x7f0f067f, float:1.9011333E38)
            r5.setImageResource(r0)
            android.widget.TextView r4 = r4.f262138e
            r4.setVisibility(r1)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: li2.h.l(pm2.a, xh2.a):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        lj2.x0 service;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveKTVRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pf5.u uVar = pf5.u.f353936a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (((pl2.x) uVar.b(context).a(pl2.x.class)).f356683f) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((pl2.x) uVar.b(context2).a(pl2.x.class)).f356687m.f356678h = 3;
            android.content.Context context3 = getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            pl2.s sVar = ((pl2.x) uVar.b(context3).a(pl2.x.class)).f356684g;
            if (sVar != null) {
                pl2.s.e(sVar, 0L, null, 3, null);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveKTVRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f318765J.f262134a.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            if (zl2.r4.f473950a.w1()) {
                xh2.a bindMicData = getBindMicData();
                if (bindMicData != null && (service = getService()) != null) {
                    service.e(bindMicData);
                }
            } else {
                lj2.x0 service2 = getService();
                if (service2 != null) {
                    service2.S(this.K);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveKTVRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
