package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class u extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f173374e;

    /* renamed from: f, reason: collision with root package name */
    public final int f173375f;

    /* renamed from: g, reason: collision with root package name */
    public final int f173376g;

    /* renamed from: h, reason: collision with root package name */
    public final int f173377h;

    /* renamed from: i, reason: collision with root package name */
    public final int f173378i;

    /* renamed from: m, reason: collision with root package name */
    public final float f173379m;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f173380n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.textstatus.ui.m0 f173381o;

    public u(android.content.Context activity) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479688cn);
        int i19 = 0;
        if (valueOf != null) {
            i17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(valueOf.intValue());
        } else {
            i17 = 0;
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479720dd);
        if (valueOf2 != null) {
            i18 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(valueOf2.intValue());
        } else {
            i18 = 0;
        }
        this.f173375f = i18;
        this.f173376g = i17;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479738dv);
        if (valueOf3 != null) {
            i19 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(valueOf3.intValue());
        }
        this.f173377h = i19;
        this.f173378i = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f197135a;
        this.f173379m = 1.3f;
        this.f173380n = activity;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dop;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.textstatus.convert.topic.d item = (com.tencent.mm.plugin.textstatus.convert.topic.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindViewHolder] username = ");
        java.lang.String userName = item.f173265e;
        sb6.append(userName);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.SquareSameTopicFriendItemConvert", sb6.toString());
        boolean b17 = kotlin.jvm.internal.o.b(userName, "arrow@name");
        int i19 = this.f173375f;
        int i27 = this.f173378i;
        if (b17) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.itemView.findViewById(com.tencent.mm.R.id.hy7);
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
                android.content.Context context = relativeLayout.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.textstatus.ui.TextStatusExpandMoreFriendsView textStatusExpandMoreFriendsView = new com.tencent.mm.plugin.textstatus.ui.TextStatusExpandMoreFriendsView(context, null, 0, 6, null);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i27 - i19, -2);
                relativeLayout.addView(textStatusExpandMoreFriendsView, layoutParams);
                layoutParams.addRule(13, -1);
                relativeLayout.setLayoutParams(layoutParams);
                textStatusExpandMoreFriendsView.setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.topic.s(item, this));
                textStatusExpandMoreFriendsView.setUserNameList(item.f173268h);
                return;
            }
            return;
        }
        mj4.h hVar = item.f173267g;
        if (hVar != null) {
            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) holder.itemView.findViewById(com.tencent.mm.R.id.hy7);
            relativeLayout2.removeAllViews();
            android.content.Context context2 = holder.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            bi4.k1 k1Var = new bi4.k1();
            k1Var.e(true);
            k1Var.f(true);
            k1Var.q(true);
            int i28 = 0;
            k1Var.j(false);
            k1Var.f21065e = false;
            k1Var.f21067g = 12;
            k1Var.r(true);
            k1Var.d(false);
            k1Var.i(false);
            k1Var.c(true);
            k1Var.g(false);
            k1Var.h(true);
            k1Var.o(true);
            k1Var.n(true);
            k1Var.m(true);
            k1Var.f21064d |= 1024;
            kotlin.jvm.internal.o.g(userName, "userName");
            com.tencent.mm.plugin.textstatus.ui.m0 m0Var = this.f173381o;
            android.content.Context context3 = this.f173380n;
            if (m0Var == null) {
                com.tencent.mm.plugin.textstatus.ui.m0 m0Var2 = new com.tencent.mm.plugin.textstatus.ui.m0(context3, k1Var);
                this.f173381o = m0Var2;
                m0Var2.K = new com.tencent.mm.plugin.textstatus.convert.topic.r(context2);
            }
            com.tencent.mm.plugin.textstatus.ui.m0 m0Var3 = this.f173381o;
            kotlin.jvm.internal.o.d(m0Var3);
            kotlin.jvm.internal.o.g(context3, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.textstatus.ui.od odVar = (com.tencent.mm.plugin.textstatus.ui.od) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.textstatus.ui.od.class);
            odVar.getClass();
            ((java.util.HashSet) odVar.f174152d).add(m0Var3);
            int i29 = (((i27 - i19) - this.f173376g) - this.f173377h) / 2;
            relativeLayout2.setTag("status_avatar_".concat(userName));
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i29, (int) (i29 * this.f173379m));
            layoutParams2.addRule(13, -1);
            android.view.View view = m0Var3.f174066f;
            relativeLayout2.addView(view, layoutParams2);
            bi4.p0.U2(m0Var3, item.f173265e, item.f173267g, null, 4, null);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479738dv);
            if (valueOf != null) {
                i28 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(valueOf.intValue());
            }
            relativeLayout2.setOutlineProvider(new bk4.f2(i28));
            relativeLayout2.setClipToOutline(true);
            view.setTag("status_avatar_".concat(userName));
            m0Var3.f174063J = new com.tencent.mm.plugin.textstatus.convert.topic.t(holder, item, view, this);
            mj4.k kVar = (mj4.k) hVar;
            si4.a.k(ai4.m0.f5173a.G(), kVar.o(), kVar.l(), false, 4, null);
            qj4.s.m(qj4.s.f363958a, this.f173380n, 1L, null, item.f173267g, 0L, 0L, 0L, 0L, null, null, 12L, 1012, null);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
