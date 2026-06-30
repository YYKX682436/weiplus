package yn2;

/* loaded from: classes2.dex */
public final class m extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.e f463994e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f463995f = jz5.h.b(yn2.k.f463992d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f463996g = jz5.h.b(yn2.l.f463993d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f463997h = jz5.h.b(new yn2.f(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f463998i = jz5.h.b(new yn2.e(this));

    /* renamed from: m, reason: collision with root package name */
    public final boolean f463999m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f464000n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f464001o;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(com.tencent.mm.plugin.finder.megavideo.topstory.flow.e r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f463994e = r5
            yn2.k r0 = yn2.k.f463992d
            jz5.g r0 = jz5.h.b(r0)
            r4.f463995f = r0
            yn2.l r0 = yn2.l.f463993d
            jz5.g r0 = jz5.h.b(r0)
            r4.f463996g = r0
            yn2.f r0 = new yn2.f
            r0.<init>(r4)
            jz5.g r0 = jz5.h.b(r0)
            r4.f463997h = r0
            yn2.e r0 = new yn2.e
            r0.<init>(r4)
            jz5.g r0 = jz5.h.b(r0)
            r4.f463998i = r0
            r0 = 0
            if (r5 == 0) goto L5c
            r1 = r5
            xn2.p0 r1 = (xn2.p0) r1
            java.lang.Boolean r2 = r1.C
            if (r2 != 0) goto L57
            com.tencent.mm.plugin.finder.storage.t70 r2 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r2 = com.tencent.mm.plugin.finder.storage.t70.I7
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            lb2.j r2 = (lb2.j) r2
            java.lang.Object r2 = r2.r()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 2
            if (r2 != r3) goto L50
            r2 = 1
            goto L51
        L50:
            r2 = r0
        L51:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.C = r2
        L57:
            boolean r1 = r2.booleanValue()
            goto L5d
        L5c:
            r1 = r0
        L5d:
            r4.f463999m = r1
            if (r5 == 0) goto L68
            r0 = r5
            xn2.p0 r0 = (xn2.p0) r0
            boolean r0 = r0.h()
        L68:
            r4.f464000n = r0
            if (r5 == 0) goto La5
            xn2.p0 r5 = (xn2.p0) r5
            android.app.Activity r5 = r5.f455543a
            if (r5 == 0) goto La5
            pf5.z r0 = pf5.z.f353948a
            boolean r1 = r5 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L99
            androidx.appcompat.app.AppCompatActivity r5 = (androidx.appcompat.app.AppCompatActivity) r5
            pf5.v r5 = r0.a(r5)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r0 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r5 = r5.a(r0)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r5 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r5
            r0 = 9
            fc2.c r5 = r5.Y6(r0)
            if (r5 == 0) goto La5
            yn2.a r0 = new yn2.a
            r0.<init>(r4)
            r5.a(r0)
            jz5.f0 r5 = jz5.f0.f302826a
            goto La6
        L99:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        La5:
            r5 = 0
        La6:
            if (r5 != 0) goto Laf
            java.lang.String r5 = "init fail, context is null!"
            java.lang.String r0 = "Finder.MegaVideoCardConvert"
            com.tencent.mars.xlog.Log.e(r0, r5)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.m.<init>(com.tencent.mm.plugin.finder.megavideo.topstory.flow.e):void");
    }

    public static final void n(yn2.m mVar, in5.s0 s0Var, android.view.View view, zn2.a aVar, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.MegaVideoCardConvert", "[onMediaLongClick] feedId=".concat(pm0.v.u(aVar.getItemId())));
        if (aVar.getIsPreview() || (eVar = mVar.f463994e) == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(s0Var.f293121e, 1, false);
        xn2.p0 p0Var = (xn2.p0) eVar;
        k0Var.f211872n = new xn2.o(aVar, p0Var);
        k0Var.f211881s = new xn2.p(p0Var, aVar, s0Var);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(s0Var, aVar.getItemId(), aVar.getFeedObject());
        view.performHapticFeedback(0, 2);
        k0Var.v();
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dk9;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        this.f464001o = recyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x05a6, code lost:
    
        if (r2 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0311, code lost:
    
        if (pf5.e.launch$default((pf5.e) r5, kotlinx.coroutines.q1.f310570c, null, new vn2.h(r0, r3, r1, r40, r41, r2, 0.05f, null), 2, null) == null) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020a  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r51, in5.c r52, int r53, int r54, boolean r55, java.util.List r56) {
        /*
            Method dump skipped, instructions count: 2424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.m.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        android.widget.FrameLayout frameLayout;
        jz5.f0 f0Var;
        cw2.f8 f8Var;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        com.tencent.mm.plugin.finder.megavideo.topstory.DoubleLayerView doubleLayerView = (com.tencent.mm.plugin.finder.megavideo.topstory.DoubleLayerView) holder.p(com.tencent.mm.R.id.hqu);
        android.view.ViewGroup.LayoutParams layoutParams = doubleLayerView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.height = a06.d.b((o() / 16.0f) * 9.0f);
            marginLayoutParams.width = o();
        }
        vn2.u0 u0Var = vn2.u0.f438387a;
        if (u0Var.g() && (frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.iqf)) != null) {
            android.view.View inflate = com.tencent.mm.ui.id.b(holder.f293121e).inflate(com.tencent.mm.R.layout.b2j, (android.view.ViewGroup) null, false);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) inflate;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = this.f463994e;
            if (eVar == null || (f8Var = ((xn2.p0) eVar).f455550h) == null) {
                f0Var = null;
            } else {
                finderVideoLayout.setVideoCore(f8Var);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("Finder.MegaVideoCardConvert", "create video layout fail,video core is null!");
            }
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            frameLayout.addView(finderVideoLayout, 0, layoutParams2);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.hih);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(holder.hashCode());
        sb6.append(" MegaVideoCreateViewHolder screenWidth=");
        sb6.append(((java.lang.Number) ((jz5.n) this.f463995f).getValue()).intValue());
        sb6.append(",cover size=(");
        android.view.ViewGroup.LayoutParams layoutParams3 = doubleLayerView.getLayoutParams();
        sb6.append(layoutParams3 != null ? java.lang.Integer.valueOf(layoutParams3.width) : null);
        sb6.append(" * ");
        android.view.ViewGroup.LayoutParams layoutParams4 = doubleLayerView.getLayoutParams();
        sb6.append(layoutParams4 != null ? java.lang.Integer.valueOf(layoutParams4.height) : null);
        sb6.append(')');
        u0Var.l("Finder.MegaVideoCardConvert", sb6.toString());
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        this.f464001o = null;
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        boolean z17;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("Finder.MegaVideoCardConvert", "Debug " + holder.hashCode() + " onViewDetachedFromWindow");
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        boolean z17;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout != null) {
            finderVideoLayout.P();
            finderVideoLayout.setMuteListener(null);
            finderVideoLayout.S();
        }
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("Finder.MegaVideoCardConvert", "Debug " + holder.hashCode() + " onViewRecycled");
        }
    }

    public final int o() {
        return ((java.lang.Number) ((jz5.n) this.f463997h).getValue()).intValue();
    }

    public final float p(long j17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, r45.mb4 mb4Var) {
        float f17;
        java.lang.String str;
        boolean z17;
        if (j17 <= 0 || mb4Var.getLong(24) <= 0) {
            java.lang.String n17 = ds2.h.f242866a.c(baseFinderFeed.getItemId(), mb4Var, false).n();
            float f18 = cu2.x.c(cu2.x.f222449a, n17, false, false, false, 14, null).field_playProgress;
            if (f18 > 0.0f) {
                str = n17;
                f17 = f18;
            } else {
                r45.no2 playhistory_info = baseFinderFeed.getFeedObject().getFeedObject().getPlayhistory_info();
                int integer = playhistory_info != null ? playhistory_info.getInteger(0) : 0;
                f17 = (integer <= 0 || mb4Var.getLong(24) <= 0) ? 0.0f : (integer * 1.0f) / ((float) mb4Var.getLong(24));
                str = n17;
            }
        } else {
            f17 = (((float) j17) * 1.0f) / ((float) mb4Var.getLong(24));
            str = "";
        }
        boolean z18 = true;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Debug setPlayProgress lastPlayTimeMs=");
            sb6.append(j17);
            sb6.append(",cachePlayProgress=");
            sb6.append(cu2.x.c(cu2.x.f222449a, str, false, false, false, 14, null).field_playProgress);
            sb6.append(",breakPointTimeMs=");
            r45.no2 playhistory_info2 = baseFinderFeed.getFeedObject().getFeedObject().getPlayhistory_info();
            sb6.append(playhistory_info2 != null ? java.lang.Integer.valueOf(playhistory_info2.getInteger(0)) : null);
            sb6.append(",videoDuration=");
            sb6.append(mb4Var.getLong(24));
            com.tencent.mars.xlog.Log.i("Finder.MegaVideoCardConvert", sb6.toString());
        }
        return f17;
    }

    public final void q(in5.s0 s0Var, int i17, zn2.a aVar) {
        int i18;
        int i19;
        java.lang.String nickname;
        java.lang.String username;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        nv2.h1 h1Var = nv2.n1.f340550g;
        nv2.n1 n1Var = nv2.n1.f340551h;
        java.util.LinkedList h17 = n1Var.h(aVar.getFeedObject().getFeedObject());
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.qnz);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        int size = h17.size();
        android.content.Context context = s0Var.f293121e;
        if (size <= 0) {
            ((android.widget.RelativeLayout) s0Var.p(com.tencent.mm.R.id.qlo)).setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.lo8);
            if (textView == null) {
                return;
            }
            r45.ru2 flow_card_recommand_reason = aVar.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
            java.lang.String str2 = "";
            if (flow_card_recommand_reason != null) {
                java.lang.String string = flow_card_recommand_reason.getString(0);
                str2 = "";
                if (string != null) {
                    str2 = string;
                }
            }
            r45.ru2 flow_card_recommand_reason2 = aVar.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
            int integer = flow_card_recommand_reason2 != null ? flow_card_recommand_reason2.getInteger(1) : 0;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.qnz);
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
                textView.setVisibility(8);
                return;
            }
            android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.qnz);
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            textView.setVisibility(0);
            textView.setText(str2);
            if (integer != 3) {
                if (integer == 4) {
                    i18 = com.tencent.mm.R.color.Indigo_100;
                } else if (integer == 5) {
                    i18 = com.tencent.mm.R.color.Orange_100;
                }
                textView.setTextColor(context.getColor(i18));
                return;
            }
            i18 = com.tencent.mm.R.color.Brand_100;
            textView.setTextColor(context.getColor(i18));
            return;
        }
        ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.lo8)).setVisibility(8);
        java.util.LinkedList h18 = n1Var.h(aVar.getFeedObject().getFeedObject());
        int g17 = n1Var.g(aVar.getFeedObject().getFeedObject());
        ((android.widget.RelativeLayout) s0Var.p(com.tencent.mm.R.id.qlo)).setVisibility(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(s0Var.p(com.tencent.mm.R.id.f485060ge5));
        arrayList.add(s0Var.p(com.tencent.mm.R.id.ge7));
        arrayList.add(s0Var.p(com.tencent.mm.R.id.ge9));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.ge6);
        android.widget.FrameLayout frameLayout5 = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.ge8);
        android.widget.FrameLayout frameLayout6 = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.ge_);
        android.widget.FrameLayout frameLayout7 = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.gef);
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs));
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout4.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = intValue;
        layoutParams2.height = intValue;
        frameLayout4.setLayoutParams(layoutParams2);
        android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout5.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.leftMargin = intValue;
        layoutParams4.width = intValue;
        layoutParams4.height = intValue;
        frameLayout5.setLayoutParams(layoutParams4);
        android.view.ViewGroup.LayoutParams layoutParams5 = frameLayout6.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams6 = (android.widget.FrameLayout.LayoutParams) layoutParams5;
        layoutParams6.leftMargin = intValue * 2;
        layoutParams6.width = intValue;
        layoutParams6.height = intValue;
        frameLayout6.setLayoutParams(layoutParams6);
        android.view.ViewGroup.LayoutParams layoutParams7 = frameLayout7.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams8 = (android.widget.FrameLayout.LayoutParams) layoutParams7;
        layoutParams8.width = intValue;
        layoutParams8.height = intValue;
        frameLayout7.setLayoutParams(layoutParams8);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) it.next();
            android.view.ViewGroup.LayoutParams layoutParams9 = imageView != null ? imageView.getLayoutParams() : null;
            if (layoutParams9 != null) {
                layoutParams9.width = intValue2;
            }
            if (layoutParams9 != null) {
                layoutParams9.height = intValue2;
            }
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams9);
            }
        }
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.geb);
        android.view.ViewGroup.LayoutParams layoutParams10 = p17 != null ? p17.getLayoutParams() : null;
        if (layoutParams10 != null) {
            layoutParams10.width = intValue2;
        }
        if (layoutParams10 != null) {
            layoutParams10.height = intValue2;
        }
        if (p17 != null) {
            p17.setLayoutParams(layoutParams10);
        }
        arrayList2.add(frameLayout4);
        arrayList2.add(frameLayout5);
        arrayList2.add(frameLayout6);
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout = (com.tencent.mm.plugin.finder.feed.RoundLinearLayout) s0Var.p(com.tencent.mm.R.id.agf);
        if (roundLinearLayout != null) {
            roundLinearLayout.setRadius(0.1f);
            i19 = 0;
            roundLinearLayout.getChildAt(0).setBackground(null);
        } else {
            i19 = 0;
        }
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout2 = (com.tencent.mm.plugin.finder.feed.RoundLinearLayout) s0Var.p(com.tencent.mm.R.id.agg);
        if (roundLinearLayout2 != null) {
            roundLinearLayout2.setRadius(0.1f);
            roundLinearLayout2.getChildAt(i19).setBackground(null);
        }
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout3 = (com.tencent.mm.plugin.finder.feed.RoundLinearLayout) s0Var.p(com.tencent.mm.R.id.agh);
        if (roundLinearLayout3 != null) {
            roundLinearLayout3.setRadius(0.1f);
            roundLinearLayout3.getChildAt(i19).setBackground(null);
        }
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout4 = (com.tencent.mm.plugin.finder.feed.RoundLinearLayout) s0Var.p(com.tencent.mm.R.id.gec);
        if (roundLinearLayout4 != null) {
            roundLinearLayout4.setRadius(0.1f);
        }
        java.util.Iterator it6 = arrayList.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) next;
            if (imageView2 != null) {
                android.view.ViewParent parent = imageView2.getParent();
                com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout5 = parent instanceof com.tencent.mm.plugin.finder.feed.RoundLinearLayout ? (com.tencent.mm.plugin.finder.feed.RoundLinearLayout) parent : null;
                if (roundLinearLayout5 != null) {
                    roundLinearLayout5.setRadius(0.1f);
                }
                if (i27 >= h18.size()) {
                    android.view.View view = (android.view.View) arrayList2.get(i27);
                    if (view != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    android.view.View view2 = (android.view.View) arrayList2.get(i27);
                    if (view2 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    int size2 = h18.size();
                    if (size2 < 0) {
                        size2 = 0;
                    }
                    if (size2 > 3) {
                        size2 = 3;
                    }
                    int i29 = (size2 - i27) - 1;
                    java.lang.String headUrl = ((com.tencent.mm.protocal.protobuf.FinderCommentInfo) h18.get(i29)).getHeadUrl();
                    if (headUrl == null) {
                        headUrl = "";
                    }
                    java.lang.String username2 = ((com.tencent.mm.protocal.protobuf.FinderCommentInfo) h18.get(i29)).getUsername();
                    java.lang.String r17 = c01.z1.r();
                    imageView2.setImageDrawable(null);
                    boolean b17 = kotlin.jvm.internal.o.b(username2, r17);
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    if (b17) {
                        g1Var.i().c(new mn2.n("", null, 2, null), imageView2, g1Var.h(mn2.f1.f329960n));
                        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView2, r17, 0.0f);
                    } else {
                        g1Var.i().c(new mn2.n(headUrl, null, 2, null), imageView2, g1Var.h(mn2.f1.f329960n));
                    }
                }
            }
            i27 = i28;
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) kz5.n0.Z(h18);
        java.lang.String str3 = (finderCommentInfo == null || (username = finderCommentInfo.getUsername()) == null) ? "" : username;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2 = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) kz5.n0.Z(h18);
        java.lang.String f17 = hc2.x0.f(c61.yb.md(ybVar, str3, (finderCommentInfo2 == null || (nickname = finderCommentInfo2.getNickname()) == null) ? "" : nickname, false, 4, null), 7);
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.lkh);
        if (textView2 != null) {
            textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.adg, null));
            com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
            textView2.setTextSize(1, 12.0f);
            textView2.setText(f17);
        }
        android.widget.TextView textView3 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.lke);
        textView3.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.adg, null));
        com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        textView3.setTextSize(1, 12.0f);
        boolean isMsgLikeEvent = aVar.getFeedObject().isMsgLikeEvent();
        int incFriendLikeCount = aVar.getFeedObject().getFeedObject().getIncFriendLikeCount();
        int i37 = g17 - incFriendLikeCount;
        r45.bm2 e17 = cu2.f0.f222391a.e(aVar.getFeedObject().getFeedObject().getObjectType());
        java.lang.String string2 = g17 <= 1 ? context.getString(com.tencent.mm.R.string.ch8) : context.getString(com.tencent.mm.R.string.ch7, java.lang.String.valueOf(i37 + incFriendLikeCount));
        kotlin.jvm.internal.o.d(string2);
        zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
        zy2.m6 m6Var = new zy2.m6();
        m6Var.f477466a = e17;
        m6Var.f477467b = aVar.getFeedObject().getFeedObject();
        m6Var.f477468c = g17;
        m6Var.f477469d = false;
        m6Var.f477470e = isMsgLikeEvent;
        m6Var.f477471f = i17;
        m6Var.f477472g = "";
        m6Var.f477473h = new so2.m6();
        m6Var.f477474i = com.tencent.mm.R.color.adg;
        ((ht2.y0) s6Var).Ri(textView3, m6Var);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.lkg);
        java.lang.Object obj = "";
        obj = "";
        if (incFriendLikeCount > 0 && isMsgLikeEvent) {
            int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.f491948er0, java.lang.Integer.valueOf(incFriendLikeCount));
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            obj = hc2.x0.k(string3, context, '#', com.tencent.mm.R.raw.icons_filled_channels_like_bold, com.tencent.mm.R.color.f479254u6, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        }
        if (viewGroup != null) {
            viewGroup.setTag(com.tencent.mm.R.id.e79, f17);
            viewGroup.setTag(com.tencent.mm.R.id.e5o, string2);
            viewGroup.setTag(com.tencent.mm.R.id.e5p, obj);
        }
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.gan);
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "setLikeRecommendLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ILcom/tencent/mm/plugin/finder/megavideo/topstory/flow/feed/MegaVideoCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "setLikeRecommendLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ILcom/tencent/mm/plugin/finder/megavideo/topstory/flow/feed/MegaVideoCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
