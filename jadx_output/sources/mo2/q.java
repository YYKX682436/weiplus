package mo2;

/* loaded from: classes2.dex */
public abstract class q extends in5.r implements ko2.f, com.tencent.mm.plugin.finder.member.convert.d {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.member.question.c f330388e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f330389f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f330390g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f330391h;

    /* renamed from: i, reason: collision with root package name */
    public final int f330392i;

    /* renamed from: m, reason: collision with root package name */
    public final int f330393m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f330394n;

    /* renamed from: o, reason: collision with root package name */
    public final int f330395o;

    /* renamed from: p, reason: collision with root package name */
    public final int f330396p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f330397q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f330398r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.ValueAnimator f330399s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f330400t;

    public q(com.tencent.mm.plugin.finder.member.question.c cVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String authorFinderUsername, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        this.f330388e = cVar;
        this.f330389f = appCompatActivity;
        this.f330390g = authorFinderUsername;
        this.f330391h = z17;
        this.f330392i = i17;
        this.f330393m = com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.Link_100);
        this.f330394n = jz5.h.b(mo2.m.f330382d);
        this.f330395o = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        this.f330396p = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        this.f330397q = jz5.h.b(new mo2.a(this));
        this.f330398r = jz5.h.b(new mo2.o(this));
        jz5.h.b(new mo2.p(this));
        this.f330400t = new mo2.c();
    }

    public static final void n(mo2.q qVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, long j17) {
        boolean z17;
        qVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            return;
        }
        mo2.b bVar = new mo2.b(baseFinderFeed, s0Var, qVar);
        com.tencent.mm.plugin.finder.member.question.c cVar = qVar.f330388e;
        if (cVar != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            cVar.f(context, cVar.j2(), baseFinderFeed, qVar.f330390g, 0L, bVar, 11);
        }
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488812dc4;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee A[LOOP:1: B:36:0x00b7->B:44:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb A[SYNTHETIC] */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r42, in5.c r43, int r44, int r45, boolean r46, java.util.List r47) {
        /*
            Method dump skipped, instructions count: 2500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo2.q.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    public final void o(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        if (item.getFeedObject().isPostFailed() || !item.getFeedObject().isPostFinish()) {
            return;
        }
        if (i18 == 1) {
            android.content.Intent intent = new android.content.Intent();
            ya2.b2 contact = item.getContact();
            intent.putExtra("finder_username", contact != null ? contact.D0() : null);
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, item.getFeedObject().getId(), null, 0, i17, false, 0, item.w(), 192, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Avatar", item.n());
        intent2.putExtra("Nickname", item.getFeedObject().getNickName());
        intent2.putExtra("FeedId", item.getFeedObject().getId());
        intent2.putExtra("DupFlag", item.w());
        intent2.putExtra("memberProviderUsername", this.f330390g);
        intent2.putExtra("showInteraction", true);
        com.tencent.mm.protocal.protobuf.FinderContact contact2 = item.getFeedObject().getFeedObject().getContact();
        intent2.putExtra("V5UserName", contact2 != null ? contact2.getUsername() : null);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.assist.i0.sl((com.tencent.mm.plugin.finder.assist.i0) c17, context, item.getFeedObject().getUserName(), intent2, 11, null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e A[Catch: Exception -> 0x01e2, TryCatch #3 {Exception -> 0x01e2, blocks: (B:50:0x00ff, B:52:0x0112, B:57:0x011e, B:58:0x0123, B:60:0x0139, B:62:0x0148, B:63:0x0142, B:74:0x0168), top: B:49:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139 A[Catch: Exception -> 0x01e2, TryCatch #3 {Exception -> 0x01e2, blocks: (B:50:0x00ff, B:52:0x0112, B:57:0x011e, B:58:0x0123, B:60:0x0139, B:62:0x0148, B:63:0x0142, B:74:0x0168), top: B:49:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142 A[Catch: Exception -> 0x01e2, TryCatch #3 {Exception -> 0x01e2, blocks: (B:50:0x00ff, B:52:0x0112, B:57:0x011e, B:58:0x0123, B:60:0x0139, B:62:0x0148, B:63:0x0142, B:74:0x0168), top: B:49:0x00ff }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.tencent.mm.plugin.finder.model.BaseFinderFeed r25, in5.s0 r26) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo2.q.p(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0):void");
    }

    public final void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        com.tencent.mm.view.RingProgressView ringProgressView = (com.tencent.mm.view.RingProgressView) s0Var.p(com.tencent.mm.R.id.r86);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f485889r85);
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.f485879r81);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f486384q01);
        if (baseFinderFeed.getFeedObject().isPostFailed()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(8);
            return;
        }
        if (baseFinderFeed.getFeedObject().isPostFinish()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p17, arrayList6.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(8);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(ringProgressView.getProgress(), baseFinderFeed.getFeedObject().getPostInfo().getInteger(4));
        this.f330399s = ofInt;
        kotlin.jvm.internal.o.d(ofInt);
        ofInt.addUpdateListener(new mo2.h(ringProgressView));
        android.animation.ValueAnimator valueAnimator = this.f330399s;
        kotlin.jvm.internal.o.d(valueAnimator);
        android.animation.ValueAnimator duration = valueAnimator.setDuration(400L);
        if (duration != null) {
            duration.start();
        }
    }

    public final void r(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f486382q00);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.pzu);
        ya2.b2 contact = baseFinderFeed.getContact();
        int i17 = com.tencent.mm.storage.z3.S3(contact != null ? contact.D0() : null) ? 1 : 2;
        if (i17 == 1) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.pzz);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.pzz);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        imageView.setOnClickListener(new mo2.i(this, s0Var, baseFinderFeed, i17));
        textView.setOnClickListener(new mo2.j(this, s0Var, baseFinderFeed, i17));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        ya2.b2 contact2 = baseFinderFeed.getContact();
        if (kotlin.jvm.internal.o.b(contact2 != null ? contact2.D0() : null, this.f330390g)) {
            android.view.View p19 = s0Var.p(com.tencent.mm.R.id.pzy);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p27 = s0Var.p(com.tencent.mm.R.id.pzz);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p28 = s0Var.p(com.tencent.mm.R.id.pzy);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean isPostFailed = baseFinderFeed.getFeedObject().isPostFailed();
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (!isPostFailed && baseFinderFeed.getFeedObject().isPostFinish()) {
            java.lang.String n17 = baseFinderFeed.n();
            if (i17 == 1) {
                g1Var.a().c(new mn2.n(n17, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
            } else {
                g1Var.l().c(new mn2.n(n17, com.tencent.mm.plugin.finder.storage.y90.X), imageView, g1Var.h(mn2.f1.f329961o));
            }
            textView.setText(baseFinderFeed.getFeedObject().getNickNameSpan());
            return;
        }
        android.content.Context context = s0Var.f293121e;
        if (i17 == 2) {
            ng5.a.a(imageView, c01.z1.r());
        } else {
            ya2.g gVar = ya2.h.f460484a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ya2.b2 b17 = gVar.b(xy2.c.e(context));
            g1Var.a().c(new mn2.n(b17 != null ? b17.getAvatarUrl() : "", null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String b18 = hc2.t.b(context, i17);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, b18));
    }

    public abstract void s(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var);

    /* JADX WARN: Removed duplicated region for block: B:50:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(com.tencent.mm.plugin.finder.model.BaseFinderFeed r19, in5.s0 r20) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo2.q.t(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0):void");
    }

    public final void u(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("MemberCommonConvert.kt", "showAction id=%s", pm0.v.u(feed.getFeedObject().getId()));
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        com.tencent.mm.plugin.finder.member.question.c cVar = this.f330388e;
        k0Var.f211872n = cVar != null ? cVar.Y(feed, k0Var) : null;
        k0Var.f211881s = cVar != null ? cVar.c4(feed, holder) : null;
        k0Var.v();
    }

    public final void v(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, android.widget.TextView textView, android.view.View view, int i17) {
        int size = baseFinderFeed.getFeedObject().getFeedObject().getCommentList().size();
        int i18 = this.f330395o;
        if (i17 > size) {
            if (baseFinderFeed.getFeedObject().isQAFeed()) {
                textView.setText(s0Var.f293121e.getString(com.tencent.mm.R.string.lvx, java.lang.Integer.valueOf(i17)));
            } else {
                textView.setText(s0Var.f293121e.getString(com.tencent.mm.R.string.m9l, java.lang.Integer.valueOf(i17)));
            }
            textView.setVisibility(0);
            if (baseFinderFeed.getFeedObject().getFeedObject().getCommentList().isEmpty()) {
                textView.setPadding(textView.getPaddingLeft(), i18, textView.getPaddingRight(), textView.getPaddingBottom());
            } else {
                textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), textView.getPaddingBottom());
            }
            view.setPadding(textView.getPaddingLeft(), textView.getPaddingLeft(), textView.getPaddingRight(), this.f330396p);
        } else {
            view.setPadding(textView.getPaddingLeft(), textView.getPaddingLeft(), textView.getPaddingRight(), i18);
            textView.setVisibility(8);
        }
        textView.setOnClickListener(new mo2.n(this, baseFinderFeed, s0Var));
    }
}
