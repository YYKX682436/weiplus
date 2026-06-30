package tb2;

/* loaded from: classes2.dex */
public abstract class f extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final float f416967e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f416968f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f416969g;

    /* renamed from: h, reason: collision with root package name */
    public final float f416970h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.p f416971i;

    public f(float f17, boolean z17, boolean z18, float f18, yz5.p jumProfileCallback) {
        kotlin.jvm.internal.o.g(jumProfileCallback, "jumProfileCallback");
        this.f416967e = f17;
        this.f416968f = z17;
        this.f416969g = z18;
        this.f416970h = f18;
        this.f416971i = jumProfileCallback;
    }

    @Override // in5.r
    public int e() {
        return this.f416969g ? com.tencent.mm.R.layout.f489336c61 : this.f416968f ? com.tencent.mm.R.layout.f489337c62 : com.tencent.mm.R.layout.f489335c60;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        d92.f fVar = d92.f.f227470a;
        android.view.View p17 = holder.p(com.tencent.mm.R.id.e_e);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        d92.f.o(fVar, p17, false, false, false, 7, null);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.fuv);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        d92.f.o(fVar, p18, false, false, false, 7, null);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.f483299a85);
        kotlin.jvm.internal.o.f(p19, "getView(...)");
        d92.f.o(fVar, p19, false, false, false, 7, null);
        android.view.View p27 = holder.p(com.tencent.mm.R.id.f487684pg0);
        kotlin.jvm.internal.o.f(p27, "getView(...)");
        d92.f.o(fVar, p27, false, false, false, 7, null);
    }

    public final void n(in5.s0 s0Var, r45.mb4 mb4Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        java.lang.String str;
        java.lang.Class cls;
        java.lang.Class cls2;
        boolean z17;
        mn2.g1 g1Var;
        r45.co1 co1Var;
        java.lang.String string;
        r45.co1 co1Var2;
        int i17;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.f487295o70);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.icp);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.e_l);
        if (imageView == null) {
            com.tencent.mars.xlog.Log.w("Finder.Loader", "bindCover return for thumbIv is null.");
            return;
        }
        tb2.b bVar = new tb2.b(imageView, baseFinderFeed, this, mb4Var, p17);
        if (com.tencent.mm.ui.bk.Q()) {
            s0Var.itemView.getViewTreeObserver().addOnPreDrawListener(new tb2.a(s0Var, bVar));
        } else {
            com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.System.nanoTime();
            boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i18 = a17.f197135a;
            if (!z18 && i18 > (i17 = a17.f197136b)) {
                i18 = i17;
            }
            bVar.invoke(java.lang.Integer.valueOf((i18 - ((int) this.f416967e)) / 2));
        }
        java.lang.String y17 = zl2.q4.f473933a.y(mb4Var, 1);
        java.lang.String str3 = "";
        if (!(y17.length() > 0)) {
            java.lang.String string2 = mb4Var.getString(16);
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String string3 = mb4Var.getString(20);
            if (string3 == null) {
                string3 = "";
            }
            y17 = string2.concat(string3);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(y17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.getString(1));
            java.lang.String string4 = mb4Var.getString(19);
            if (string4 == null) {
                string4 = "";
            }
            sb6.append(string4);
            y17 = sb6.toString();
        }
        r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
        boolean z27 = liveInfo != null && liveInfo.getInteger(2) == 1;
        pf5.u uVar = pf5.u.f353936a;
        mn2.g1 g1Var2 = mn2.g1.f329975a;
        boolean z28 = this.f416968f;
        if (z27) {
            new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).c(new mn2.q3(y17, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, z28 ? g1Var2.h(mn2.f1.f329968v) : g1Var2.h(mn2.f1.f329953d));
            str = "getService(...)";
            cls = zy2.b6.class;
            cls2 = mn2.i4.class;
            z17 = z28;
            g1Var = g1Var2;
        } else {
            i95.m c17 = i95.n0.c(c61.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            str = "getService(...)";
            cls = zy2.b6.class;
            cls2 = mn2.i4.class;
            z17 = z28;
            g1Var = g1Var2;
            c61.zb.g7((c61.zb) c17, imageView, y17, 0, 4, null);
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = baseFinderFeed.getFeedObject().getFinderObject();
        r45.nw1 liveInfo2 = baseFinderFeed.getFeedObject().getLiveInfo();
        if (!(liveInfo2 != null && liveInfo2.getInteger(2) == 1)) {
            i95.m c18 = i95.n0.c(c61.zb.class);
            kotlin.jvm.internal.o.f(c18, str);
            c61.zb.g7((c61.zb) c18, imageView, y17, 0, 4, null);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        r45.nw1 liveInfo3 = finderObject.getLiveInfo();
        if (!((liveInfo3 == null || (co1Var2 = (r45.co1) liveInfo3.getCustom(43)) == null || co1Var2.getInteger(0) != 1) ? false : true)) {
            new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(cls).c(cls2))).H).getValue()).c(new mn2.q3(y17, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, z17 ? g1Var.h(mn2.f1.f329968v) : g1Var.h(mn2.f1.f329953d));
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        i95.m c19 = i95.n0.c(vd2.i5.class);
        kotlin.jvm.internal.o.f(c19, str);
        vd2.i5.l7((vd2.i5) c19, y17, imageView, null, 4, null);
        if (textView != null) {
            r45.nw1 liveInfo4 = finderObject.getLiveInfo();
            if (liveInfo4 != null && (co1Var = (r45.co1) liveInfo4.getCustom(43)) != null && (string = co1Var.getString(1)) != null) {
                str3 = string;
            }
            textView.setText(str3);
        }
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    public final void o(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
        if (com.tencent.mm.sdk.platformtools.t8.K0(item.getFeedObject().getDescription())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(item.getFeedObject().getDescriptionSpan());
        }
    }

    public final void p(in5.s0 s0Var, so2.h1 h1Var) {
        java.lang.Object obj;
        r45.an1 an1Var = h1Var.f410377d;
        if (an1Var == null) {
            obj = null;
        } else if (an1Var.getBoolean(5)) {
            ((android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f4p)).setVisibility(8);
            obj = jz5.f0.f302826a;
        } else {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f4p);
            viewGroup.setVisibility(0);
            com.tencent.mm.plugin.finder.live.util.a3 a3Var = com.tencent.mm.plugin.finder.live.util.a3.f115443a;
            a3Var.a(viewGroup, an1Var);
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f4q);
            textView.setText(an1Var.getString(0));
            java.util.LinkedList list = an1Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getWording_color(...)");
            com.tencent.mm.plugin.finder.live.util.a3.e(a3Var, textView, list, null, null, 6, null);
            java.lang.Object p17 = s0Var.p(com.tencent.mm.R.id.r6b);
            android.widget.ImageView imageView = (android.widget.ImageView) p17;
            kotlin.jvm.internal.o.d(imageView);
            a3Var.b(imageView, an1Var);
            obj = p17;
        }
        if (obj == null) {
            ((android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f4p)).setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0105, code lost:
    
        if (r11 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        if (r11 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
    
        r11 = r11.getAvatarUrl();
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(in5.s0 r21, com.tencent.mm.plugin.finder.model.BaseFinderFeed r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 1347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb2.f.q(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, int, boolean, java.util.List):void");
    }
}
