package rb2;

/* loaded from: classes10.dex */
public final class z2 extends rb2.m0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter, long j17) {
        super(presenter, j17);
        kotlin.jvm.internal.o.g(presenter, "presenter");
    }

    public static final void B(rb2.z2 z2Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, boolean z17) {
        z2Var.getClass();
        pm0.v.X(new rb2.p1(z17, viewGroup, view2, view3, view, z2Var, s0Var, j17, j18, j60Var));
    }

    public final void C(android.view.View view, float f17, float f18) {
        view.clearAnimation();
        view.setTranslationX(f18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "animateViewMove", "(Landroid/view/View;FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "animateViewMove", "(Landroid/view/View;FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.animate().translationX(0.0f).alpha(1.0f).setDuration(300L).setListener(new rb2.n1(view)).start();
    }

    public final void D(in5.s0 s0Var, so2.y0 y0Var) {
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f393686e;
        boolean r17 = nPresenter.r();
        boolean x17 = nPresenter.x();
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.uca);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.v2_);
        if (!r17 || !y0Var.f410703d.d1()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (x17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if ((y0Var.f410703d.u0().getExtFlag() & 2) != 0) {
                kotlin.jvm.internal.o.d(weImageView);
                K(true, weImageView);
            } else {
                kotlin.jvm.internal.o.d(weImageView);
                K(false, weImageView);
            }
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        s0Var.p(com.tencent.mm.R.id.uca).setOnClickListener(new rb2.r1(y0Var, this, s0Var));
    }

    public final void E(android.view.View view, java.lang.String str, so2.y0 y0Var, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mvi)).setText(str);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.mvf);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.mvh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new rb2.s1(findViewById, findViewById2, this, y0Var, i17));
    }

    public final void F(in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, boolean z17) {
        android.widget.ImageView imageView;
        int i17;
        java.lang.String string;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.swj);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.u3z);
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.u3l);
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.u3m);
        android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.c7_);
        if (z17) {
            viewGroup.setVisibility(0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            imageView = imageView2;
            i17 = 0;
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            imageView = imageView2;
            i17 = 0;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = 1L;
        java.lang.String string2 = j60Var.getString(7);
        if (((string2 == null || string2.length() == 0) ? 1 : i17) != 0) {
            h0Var.f310123d = j60Var.getString(i17);
            string = j60Var.getString(1);
            g0Var.f310121d = 0L;
        } else {
            h0Var.f310123d = j60Var.getString(7);
            string = j60Var.getString(8);
        }
        java.lang.String str = string;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.f0().r()).booleanValue()) {
            h0Var.f310123d = "failedTest:" + ((java.lang.String) h0Var.f310123d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadCommentImage ");
        sb6.append((java.lang.String) h0Var.f310123d);
        sb6.append(str == null ? "" : str);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f460502a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append((java.lang.String) h0Var.f310123d);
        sb7.append(str != null ? str : "");
        wo0.c a17 = d1Var.a(lVar.e(sb7.toString(), com.tencent.mm.plugin.finder.storage.y90.f128356f));
        rb2.t1 t1Var = new rb2.t1(this, s0Var, j17, j18, j60Var, viewGroup, p17, p18, p19);
        a17.getClass();
        a17.f447873d = t1Var;
        a17.f447879j = new rb2.u1(this, s0Var, j17, j18, j60Var, viewGroup, p17, p18, p19, currentTimeMillis, h0Var, str, g0Var);
        a17.f447878i = new rb2.v1(this, s0Var, j17, j18, j60Var, viewGroup, p17, p18, p19);
        kotlin.jvm.internal.o.d(imageView);
        a17.b(imageView, z17);
    }

    public final void G(in5.s0 s0Var, so2.y0 y0Var, java.lang.Object obj, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter) {
        r45.j60 j60Var;
        java.util.LinkedList list;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.swi);
        if (viewGroup == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.c7_);
        r45.e60 v07 = y0Var.f410703d.v0();
        r45.j60 j60Var2 = (v07 == null || (list = v07.getList(1)) == null) ? null : (r45.j60) kz5.n0.Z(list);
        if (y0Var.f410703d.j1() || y0Var.f410703d.w0() != 2 || j60Var2 == null) {
            viewGroup.setOnClickListener(null);
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(1.0f);
        android.content.Context context = s0Var.f293121e;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479662c0);
        int min = java.lang.Math.min(j60Var2.getInteger(2), j60Var2.getInteger(3));
        float max = min == 0 ? 1.0f : java.lang.Math.max(j60Var2.getInteger(2), j60Var2.getInteger(3)) / min;
        if (max > 1.3333334f) {
            max = 1.3333334f;
        }
        if (j60Var2.getInteger(3) > j60Var2.getInteger(2)) {
            viewGroup.getLayoutParams().width = dimensionPixelSize;
            viewGroup.getLayoutParams().height = (int) (dimensionPixelSize * max);
        } else {
            viewGroup.getLayoutParams().width = (int) (dimensionPixelSize * max);
            viewGroup.getLayoutParams().height = dimensionPixelSize;
        }
        java.util.LinkedList Q0 = y0Var.f410703d.Q0();
        java.lang.String string = (Q0 == null || (j60Var = (r45.j60) kz5.n0.Z(Q0)) == null) ? null : j60Var.getString(0);
        if (string == null || string.length() == 0) {
            F(s0Var, y0Var.f410703d.t0(), y0Var.f410703d.field_feedId, j60Var2, !kotlin.jvm.internal.o.b(obj, 6));
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "use localImage");
            ((android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.swj)).setVisibility(8);
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            wo0.c d17 = d1Var.d(ya2.l.f460502a.e(string, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            kotlin.jvm.internal.o.d(imageView);
            d17.b(imageView, !kotlin.jvm.internal.o.b(obj, 5));
        }
        viewGroup.setOnClickListener(new rb2.o2(nPresenter, y0Var));
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(viewGroup, "image_comment");
        aVar.Tj(viewGroup, 40, 1, false);
        aVar.gk(viewGroup, kz5.c1.l(new jz5.l("comment_scene", java.lang.Integer.valueOf(nPresenter.getCommentScene())), new jz5.l("comment_id", pm0.v.u(y0Var.f410703d.t0())), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("feed_id", pm0.v.u(y0Var.f410703d.field_feedId))));
        L(s0Var, y0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(android.view.ViewGroup viewGroup, in5.s0 s0Var, so2.y0 y0Var, java.lang.Object obj, boolean z17) {
        int i17;
        int i18;
        r45.k60 friend_recommend_list = y0Var.f410703d.u0().getFriend_recommend_list();
        java.util.LinkedList list = friend_recommend_list != null ? friend_recommend_list.getList(0) : null;
        int i19 = 8;
        if ((list == null || list.isEmpty()) == true) {
            viewGroup.setVisibility(8);
            viewGroup.setOnClickListener(null);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.tyd);
        if (textView == null) {
            return;
        }
        int visibility = viewGroup.getVisibility();
        android.content.Context context = s0Var.f293121e;
        if (visibility == 8 && kotlin.jvm.internal.o.b(obj, 3)) {
            viewGroup.clearAnimation();
            viewGroup.setAlpha(0.0f);
            viewGroup.setTranslationY(-i65.a.h(context, com.tencent.mm.R.dimen.f479704cz));
            viewGroup.animate().alpha(1.0f).translationY(0.0f).setDuration(300L).setListener(new rb2.u2(viewGroup)).start();
        }
        viewGroup.setVisibility(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        n3.t1 t1Var = new n3.t1(viewGroup);
        while (t1Var.hasNext()) {
            android.view.View view = (android.view.View) t1Var.next();
            if (view instanceof android.widget.ImageView) {
                arrayList.add(view);
            }
        }
        int i27 = 0;
        int i28 = 0;
        for (java.lang.Object obj2 : arrayList) {
            int i29 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) obj2;
            if (i27 >= list.size()) {
                ((android.widget.ImageView) arrayList.get(i27)).setVisibility(i19);
            } else {
                ((android.widget.ImageView) arrayList.get(i27)).setVisibility(0);
                i28++;
                java.lang.String string = ((r45.h60) list.get(i27)).getString(0);
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(imageView, string, true);
                com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "[setLikeAvatar] " + i27 + ", " + string);
            }
            i27 = i29;
            i19 = 8;
        }
        r45.h60 h60Var = (r45.h60) kz5.n0.k0(list);
        java.lang.String string2 = h60Var != null ? h60Var.getString(0) : null;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(string2, true);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String P0 = n17.P0();
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(string2, P0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kotlin.jvm.internal.o.d(f17);
        sb6.append(hc2.x0.f(f17, 6));
        sb6.append(' ');
        java.lang.String sb7 = sb6.toString();
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.tyb);
        if (list.size() == 1) {
            java.lang.String string3 = textView2.getResources().getString(com.tencent.mm.R.string.d1r);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            android.content.Context context2 = textView2.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            textView2.setText(hc2.x0.k(string3, context2, '#', com.tencent.mm.R.raw.icons_outlined_like, com.tencent.mm.R.color.Brand_100, (int) textView2.getTextSize(), (int) textView2.getTextSize(), 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
            viewGroup.setTag(com.tencent.mm.R.id.f484405tb5, textView2.getContext().getString(com.tencent.mm.R.string.nnp));
            i17 = i28;
        } else {
            i17 = i28;
            java.lang.String h17 = com.tencent.mm.plugin.finder.assist.w2.h(list.size());
            java.lang.String string4 = textView2.getContext().getString(com.tencent.mm.R.string.f492037f10, h17);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            android.content.Context context3 = textView2.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            textView2.setText(hc2.x0.k(string4, context3, '#', com.tencent.mm.R.raw.icons_outlined_like, com.tencent.mm.R.color.Brand_100, (int) textView2.getTextSize(), (int) textView2.getTextSize(), 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
            viewGroup.setTag(com.tencent.mm.R.id.f484405tb5, textView2.getContext().getString(com.tencent.mm.R.string.o2o, h17));
        }
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i37 = a17.f197135a;
        if (!z18 && i37 > (i18 = a17.f197136b)) {
            i37 = i18;
        }
        int f18 = i37 - (y0Var.h() == 2 ? i65.a.f(context, com.tencent.mm.R.dimen.by) : i65.a.f(context, com.tencent.mm.R.dimen.f479649bo));
        float measureText = textView2.getPaint().measureText(textView2.getText().toString());
        float f19 = i17 * i65.a.f(context, com.tencent.mm.R.dimen.f479706d1);
        float f27 = f18;
        if (textView.getPaint().measureText(sb7) + measureText + f19 > f27) {
            sb7 = hc2.x0.f(f17, 3) + ' ';
            if (textView.getPaint().measureText(sb7) + measureText + f19 > f27) {
                sb7 = "";
            }
        }
        textView.setText(sb7);
        viewGroup.setTag(com.tencent.mm.R.id.tb6, sb7);
        viewGroup.setOnClickListener(new rb2.v2(list, s0Var));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(viewGroup, "friend_recommend_comment");
        aVar.Tj(viewGroup, 40, 1, false);
        aVar.gk(viewGroup, kz5.c1.l(new jz5.l("comment_id", pm0.v.u(y0Var.getItemId())), new jz5.l("feed_id", pm0.v.u(this.f393687f)), new jz5.l("is_my_recommend_comment", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("friend_recommend_cnt", java.lang.Integer.valueOf(y0Var.f410703d.I0()))));
    }

    public final boolean I(so2.y0 item, boolean z17, in5.s0 holder, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        nv2.h1 h1Var = nv2.n1.f340550g;
        boolean j17 = nv2.n1.f340551h.j(presenter.z0().field_id, item.f410703d);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.uc9);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.tyc);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.iht);
        boolean contains = presenter.w().contains(java.lang.Long.valueOf(item.getItemId()));
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean d17 = hc2.t.d(context);
        boolean g17 = so2.g0.g(item, contains, j17, z17, false);
        if (!g17 || d17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!d17 || !g17) {
                viewGroup.setVisibility(8);
                return false;
            }
            kotlin.jvm.internal.o.d(viewGroup);
            H(viewGroup, holder, item, obj, j17);
            return false;
        }
        if (!contains) {
            presenter.w().add(java.lang.Long.valueOf(item.getItemId()));
        }
        if (p17.getVisibility() == 8 && kotlin.jvm.internal.o.b(obj, 2)) {
            kotlin.jvm.internal.o.d(p18);
            C(p18, 0.0f, p18.getWidth());
            C(p17, 0.0f, p18.getWidth());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean h07 = presenter.h0();
        int color = j17 ? h07 ? context.getResources().getColor(com.tencent.mm.R.color.BW_90, null) : context.getResources().getColor(com.tencent.mm.R.color.Red_100, null) : h07 ? context.getResources().getColor(com.tencent.mm.R.color.BW_90, null) : context.getResources().getColor(com.tencent.mm.R.color.aju, null);
        if (hc2.l.g(presenter.z0().getUserName())) {
            p17.setPadding(p17.getPaddingLeft(), p17.getPaddingTop(), context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl), p17.getPaddingBottom());
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f486560lo4);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.uxf);
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        if (layoutParams != null) {
            int h17 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479688cn);
            layoutParams.width = h17;
            layoutParams.height = h17;
        }
        weImageView.setIconColor(color);
        weImageView.setImageResource(j17 ? com.tencent.mm.R.raw.icons_filled_like : com.tencent.mm.R.raw.heart_medium);
        textView.setTextColor(color);
        if (j17) {
            textView.setText(com.tencent.mm.R.string.nnp);
        } else {
            textView.setText(com.tencent.mm.R.string.nnh);
        }
        if (j17 && kotlin.jvm.internal.o.b(obj, 3)) {
            kotlin.jvm.internal.o.d(p18);
            C(p18, 1.0f, i65.a.h(context, com.tencent.mm.R.dimen.f479738dv));
        }
        p17.setOnClickListener(new rb2.w2(presenter, item, j17, weImageView));
        p17.post(new rb2.x2(obj, z17, this, holder, p17));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(p17, "recommend_comment_button");
        aVar.Tj(p17, 40, 1, false);
        aVar.gk(p17, kz5.c1.l(new jz5.l("comment_id", pm0.v.u(item.getItemId())), new jz5.l("feed_id", pm0.v.u(item.f410703d.field_feedId)), new jz5.l("is_my_like_comment", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("recommend_type", java.lang.Integer.valueOf(!j17 ? 1 : 0)), new jz5.l("friend_recommend_cnt", java.lang.Integer.valueOf(item.f410703d.I0()))));
        kotlin.jvm.internal.o.d(viewGroup);
        H(viewGroup, holder, item, obj, j17);
        return true;
    }

    public final void J(in5.s0 s0Var, so2.y0 y0Var, int i17, android.view.View view, boolean z17, android.view.View view2, java.lang.CharSequence charSequence) {
        java.lang.CharSequence charSequence2;
        ym5.a1.h(view, new rb2.y2(s0Var, y0Var, z17, i17));
        view2.setTag(com.tencent.mm.R.id.e79, charSequence);
        view2.setTag(com.tencent.mm.R.id.e5n, com.tencent.mm.plugin.finder.assist.w2.k(s0Var.f293121e, y0Var.f410703d.y0() * 1000));
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) s0Var.p(com.tencent.mm.R.id.c6d);
        if (finderCollapsibleTextView == null || (charSequence2 = finderCollapsibleTextView.getCom.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT java.lang.String()) == null) {
            charSequence2 = "";
        }
        view2.setTag(com.tencent.mm.R.id.e5l, charSequence2);
        if (y0Var.h() == 1) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(s0Var.itemView, "finder_comment_item_view");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            android.view.View view3 = s0Var.itemView;
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(y0Var.f410703d.field_feedId));
            lVarArr[1] = new jz5.l("comment_id", java.lang.Long.valueOf(y0Var.f410703d.t0()));
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
            lVarArr[2] = new jz5.l("behaviour_session_id", e17 != null ? e17.f135385q : null);
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context);
            lVarArr[3] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context);
            lVarArr[4] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
            lVarArr[5] = new jz5.l("finder_username", y0Var.f410703d.Z0());
            ((cy1.a) rVar).gk(view3, kz5.c1.k(lVarArr));
        }
    }

    public final void K(boolean z17, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        if (z17) {
            weImageView.s(com.tencent.mm.R.raw.star_filled, com.tencent.mm.R.color.f479206su);
        } else {
            weImageView.s(com.tencent.mm.R.raw.star_regular, com.tencent.mm.R.color.adg);
        }
    }

    public final void L(in5.s0 s0Var, so2.y0 y0Var) {
        android.widget.ImageView imageView;
        com.tencent.mm.view.RingProgressView ringProgressView = (com.tencent.mm.view.RingProgressView) s0Var.p(com.tencent.mm.R.id.swk);
        if (ringProgressView == null || (imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.c7_)) == null) {
            return;
        }
        if (y0Var.f410703d.field_state != 3) {
            ringProgressView.setVisibility(8);
            imageView.setForeground(null);
        } else {
            ringProgressView.setVisibility(0);
            ringProgressView.setProgress(y0Var.f410703d.f128399y1);
            imageView.setForeground(new android.graphics.drawable.ColorDrawable(s0Var.f293121e.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5)));
        }
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.drp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0889, code lost:
    
        if (((r2.f410703d.z0() & 16) != 0 ? r9 : false) != false) goto L149;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0ca7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0e84  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0cad  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x08db  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r56, in5.c r57, int r58, int r59, boolean r60, java.util.List r61) {
        /*
            Method dump skipped, instructions count: 3760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.z2.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        if (i17 == 1) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.tencent.mm.R.id.a_z), "finder_feed_first_comment_awesome_iv");
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.tencent.mm.R.id.a_z), "finder_feed_second_comment_awesome_iv");
        }
        com.tencent.mm.plugin.finder.view.FinderInterceptFrameLayout finderInterceptFrameLayout = (com.tencent.mm.plugin.finder.view.FinderInterceptFrameLayout) holder.p(com.tencent.mm.R.id.rrw);
        if (finderInterceptFrameLayout != null) {
            finderInterceptFrameLayout.setInterceptListener(new rb2.e2(this));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.v2_);
        if (weImageView != null) {
            java.lang.Object tag = weImageView.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (!kotlin.jvm.internal.o.b(tag, bool)) {
                weImageView.setTag(bool);
                weImageView.post(new d92.a(weImageView));
            }
        }
        o(holder);
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sc2.a8.class);
        a8Var.getClass();
        a8Var.f7(holder);
        da2.g gVar = this.f393688g;
        if (gVar != null) {
            gVar.j();
        }
        this.f393688g = null;
    }
}
