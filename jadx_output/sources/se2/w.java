package se2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static org.libpag.PAGFile f406896b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.rfx.RfxPagFile f406897c;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f406902h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f406903i;

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f406904j;

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f406905k;

    /* renamed from: a, reason: collision with root package name */
    public static final se2.w f406895a = new se2.w();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f406898d = jz5.h.b(se2.k.f406860d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f406899e = jz5.h.b(se2.v.f406894d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f406900f = jz5.h.b(se2.j.f406859d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f406901g = jz5.h.b(se2.u.f406893d);

    static {
        jz5.g b17 = jz5.h.b(se2.h.f406857d);
        f406902h = b17;
        f406903i = ((java.lang.Number) ((jz5.n) b17).getValue()).intValue();
        f406904j = jz5.h.b(se2.f.f406855d);
        f406905k = jz5.h.b(se2.i.f406858d);
    }

    public static final boolean a(se2.w wVar, android.content.Context context, lm2.c cVar) {
        wVar.getClass();
        return (kotlin.jvm.internal.o.b(cVar.c(), c01.z1.r()) || kotlin.jvm.internal.o.b(cVar.c(), xy2.c.e(context)) || kotlin.jvm.internal.o.b(cVar.c(), c01.z1.k())) ? false : true;
    }

    public final void b(android.content.Context context, gk2.e buContext, lm2.c msg) {
        km2.r rVar;
        km2.r rVar2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(msg, "msg");
        r45.qt2 qt2Var = new r45.qt2();
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f309151c) == null) ? 0 : rVar2.f309206k));
        km2.n nVar2 = dk2.ef.H;
        qt2Var.set(5, java.lang.Integer.valueOf((nVar2 == null || (rVar = nVar2.f309151c) == null) ? 0 : rVar.f309206k));
        ke2.p0 p0Var = ke2.q0.f306981w;
        long e17 = msg.e();
        java.lang.String a17 = msg.a();
        r45.qm1 qm1Var = new r45.qm1();
        int i17 = qs5.v.f366472a;
        qm1Var.set(0, 1);
        qm1Var.set(1, a17);
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(3, java.lang.Long.valueOf(e17));
        ch1Var.set(1, 20008);
        r45.ci1 ci1Var = new r45.ci1();
        ci1Var.set(0, qm1Var);
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(ci1Var.toByteArray()));
        ch1Var.set(2, zl2.q4.f473933a.m());
        new ke2.q0(ch1Var, buContext, qt2Var, null).l();
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.daj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        db5.t7.f(context, string, se2.l.f406861a);
    }

    public final java.lang.String c(java.lang.String usernameTag, java.lang.String content) {
        kotlin.jvm.internal.o.g(usernameTag, "usernameTag");
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.String str = " " + usernameTag + content;
        kotlin.jvm.internal.o.f(str, "toString(...)");
        return str;
    }

    public final boolean d(java.lang.String tag, gk2.e buContext, lm2.c msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean a17 = se2.e.f406847a.a(msg);
        if (!a17) {
            com.tencent.mars.xlog.Log.e(tag, "dislike failed,msg " + msg.h() + " seq:" + msg.e() + ",canLike:" + a17);
            return false;
        }
        com.tencent.mm.plugin.finder.live.util.x xVar = com.tencent.mm.plugin.finder.live.util.x.f115742a;
        r45.ch1 ch1Var = msg.f319372e;
        int i17 = msg.f319373f;
        int i18 = qs5.u.f366471a;
        r45.ch1 b17 = xVar.b(ch1Var, i17, 2);
        zl2.r4.f473950a.M2(tag, "boxCommentLikeTrack dislike msg seq:" + msg.e() + ",likeCount:" + msg.f319373f);
        if (b17 != null) {
            ((mm2.e0) buContext.a(mm2.e0.class)).R6(tag, b17);
            return true;
        }
        com.tencent.mars.xlog.Log.w(tag, "dislike failed, boxId is null");
        return false;
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) f406898d).getValue()).intValue();
    }

    public final java.lang.String f(android.content.Context context, android.text.TextPaint paint, lm2.c feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(paint, "paint");
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.plugin.finder.live.util.x xVar = com.tencent.mm.plugin.finder.live.util.x.f115742a;
        java.lang.String a17 = feed.a();
        java.lang.String c17 = feed.c();
        java.lang.String b17 = feed.b();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String e17 = xVar.e(a17, c17, b17, false);
        android.content.res.Resources resources = context.getResources();
        i95.m c18 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        java.lang.String string = resources.getString(com.tencent.mm.R.string.gc8, c61.yb.nf((c61.yb) c18, context, paint, e17, 0, 8, null));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void g(android.content.Context context, java.lang.String username) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public final boolean h(java.lang.String tag, gk2.e buContext, lm2.c msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean a17 = se2.e.f406847a.a(msg);
        if (!a17) {
            com.tencent.mars.xlog.Log.e(tag, "like failed,msg " + msg.h() + " seq:" + msg.e() + ",canLike:" + a17);
            return false;
        }
        com.tencent.mm.plugin.finder.live.util.x xVar = com.tencent.mm.plugin.finder.live.util.x.f115742a;
        r45.ch1 ch1Var = msg.f319372e;
        int i17 = msg.f319373f;
        int i18 = qs5.u.f366471a;
        r45.ch1 b17 = xVar.b(ch1Var, i17, 1);
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("boxCommentLikeTrack like msg seq:");
        sb6.append(msg.e());
        sb6.append(",localClientMsgId:");
        java.lang.String string = msg.f319372e.getString(14);
        if (string == null) {
            string = "";
        }
        sb6.append(string);
        sb6.append(",likeCount:");
        sb6.append(msg.f319373f);
        r4Var.M2(tag, sb6.toString());
        if (b17 != null) {
            ((mm2.e0) buContext.a(mm2.e0.class)).R6(tag, b17);
            return true;
        }
        com.tencent.mars.xlog.Log.w(tag, "like failed, boxId is null");
        return false;
    }

    public final void i(com.tencent.mm.plugin.finder.live.view.LiveNeat7extView contentTv, java.lang.String username, int i17, int i18, int i19, com.tencent.mm.pluginsdk.ui.span.f0 userMessage) {
        kotlin.jvm.internal.o.g(contentTv, "contentTv");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(userMessage, "userMessage");
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        com.tencent.mm.pluginsdk.ui.z zVar = new com.tencent.mm.pluginsdk.ui.z(username);
        zVar.setCallback(contentTv);
        zVar.setBounds(0, 0, i19, i19);
        int i27 = gm2.m.f273429e;
        gm2.l lVar = new gm2.l(null, 0, 0, 7, null);
        lVar.f273424a = zVar;
        lVar.f273426c = gm2.c1.f273320a.k();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = lVar.f273424a;
        jz5.f0 f0Var = null;
        gm2.m mVar = bitmapDrawable != null ? new gm2.m(bitmapDrawable) : null;
        if (mVar != null) {
            mVar.f273430d = lVar;
        }
        if (mVar != null) {
            userMessage.c(mVar, i17, i18, 33);
            contentTv.setInvalidateVerifyTag(username);
            contentTv.b(userMessage);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveGroupCommentHelper", "loadWxAvatar err create drawable fail!");
        }
    }

    public final boolean j(in5.s0 holder, lm2.c item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        boolean z18 = false;
        if (!(list == null || list.isEmpty())) {
            for (java.lang.Object obj : list) {
                if (obj instanceof java.lang.Integer) {
                    if (kotlin.jvm.internal.o.b(obj, 101)) {
                        f406895a.r(holder, item, (java.lang.Integer) obj);
                    } else if (kotlin.jvm.internal.o.b(obj, 102)) {
                    }
                    z18 = true;
                }
            }
        }
        return z18;
    }

    public final void k(kotlinx.coroutines.y0 y0Var, dk2.zf msg, android.view.View view, gk2.e buContext, android.content.Context context) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(context, "context");
        mm2.j2 j2Var = (mm2.j2) buContext.a(mm2.j2.class);
        java.lang.String f17 = msg.f();
        if (f17 == null) {
            f17 = "";
        }
        j2Var.a7(new jz5.l(f17, 1));
        l(y0Var, msg, view, buContext, context, true);
    }

    public final void l(kotlinx.coroutines.y0 y0Var, dk2.zf msg, android.view.View view, gk2.e buContext, android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(context, "context");
        if (!(msg instanceof dk2.cg)) {
            com.tencent.mars.xlog.Log.i("FinderLiveGroupCommentHelper", "processCommentLikeAction seq:" + msg.m() + " localClientMsgId:" + msg.f());
            return;
        }
        dk2.cg cgVar = (dk2.cg) msg;
        boolean o17 = cgVar.o();
        com.tencent.mm.plugin.finder.live.util.x xVar = com.tencent.mm.plugin.finder.live.util.x.f115742a;
        if (!o17) {
            if (!z17) {
                xVar.i(msg, true, buContext, context);
                return;
            }
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.c7g);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            t(y0Var, findViewById, new se2.n(msg, buContext, context));
            return;
        }
        xVar.i(msg, false, buContext, context);
        boolean o18 = cgVar.o();
        int s17 = cgVar.s();
        zl2.r4.f473950a.M2("FinderLiveGroupCommentHelper", "live CommentLikeTrack: setLike isLike:" + o18 + ",likeCnt:" + s17);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.c7g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        m(findViewById2, o18, s17, null);
    }

    public final void m(android.view.View likeRoot, boolean z17, int i17, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(likeRoot, "likeRoot");
        android.view.View findViewById = likeRoot.findViewById(com.tencent.mm.R.id.c7d);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = likeRoot.findViewById(com.tencent.mm.R.id.c7f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById2;
        android.view.View findViewById3 = likeRoot.findViewById(com.tencent.mm.R.id.c7e);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        textView.setText(i17 <= 0 ? "" : java.lang.String.valueOf(i17));
        int i18 = mm2.e0.f328965v;
        int i19 = 4;
        if (i17 <= i18) {
            if (i18 > 1) {
                zl2.r4 r4Var = zl2.r4.f473950a;
                android.content.Context context = likeRoot.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r4Var.f3(context, "(DEBUG)赞数达到" + mm2.e0.f328965v + "个才展示");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(likeRoot, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            likeRoot.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(likeRoot, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 > 0) {
            if (z17) {
                textView.setTextColor(likeRoot.getContext().getResources().getColor(com.tencent.mm.R.color.f479048oc));
                weImageView.setIconColor(likeRoot.getContext().getResources().getColor(com.tencent.mm.R.color.f479048oc));
            } else {
                textView.setTextColor(likeRoot.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
                weImageView.setIconColor(likeRoot.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            }
            if (!mMPAGView.f()) {
                weImageView.setVisibility(0);
                mMPAGView.setVisibility(8);
            } else if (num == null) {
                mMPAGView.n();
            }
            i19 = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(likeRoot, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        likeRoot.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(likeRoot, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean n(bm2.h1 holder, dk2.zf msg, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z17 = false;
        if (!(list == null || list.isEmpty())) {
            for (java.lang.Object obj : list) {
                if ((obj instanceof java.lang.Integer) && kotlin.jvm.internal.o.b(obj, 1)) {
                    dk2.cg cgVar = msg instanceof dk2.cg ? (dk2.cg) msg : null;
                    if (cgVar != null) {
                        f406895a.s(holder, cgVar, (java.lang.Integer) obj);
                    }
                    z17 = true;
                }
            }
        }
        return z17;
    }

    public final void o(java.lang.String tag, in5.s0 holder, boolean z17, lm2.c msg, android.view.View view) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(view, "view");
        if (holder.o().getTag() instanceof com.tencent.mm.plugin.finder.live.plugin.tb) {
            view.setOnClickListener(new se2.o(tag, msg, holder, z17));
        }
    }

    public final void p(java.lang.String tag, in5.s0 holder, lm2.c msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.c7g);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        if (holder.o().getTag() instanceof com.tencent.mm.plugin.finder.live.plugin.tb) {
            p17.setOnClickListener(new se2.q(holder, msg, tag, p17));
        }
    }

    public final void q(com.tencent.mm.ui.widget.MMNeat7extView contentTv) {
        kotlin.jvm.internal.o.g(contentTv, "contentTv");
        contentTv.setMaxWidth(contentTv.getContext().getResources().getConfiguration().orientation == 2 ? ((java.lang.Number) ((jz5.n) f406904j).getValue()).intValue() : ((java.lang.Number) ((jz5.n) f406905k).getValue()).intValue());
    }

    public final void r(in5.s0 holder, lm2.c item, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        boolean z17 = item.f319374g;
        int i17 = item.f319373f;
        zl2.r4.f473950a.M2("FinderLiveGroupCommentHelper", "boxCommentLikeTrack content:" + item.j() + " seq:" + item.e() + " setBoxLike isLike:" + z17 + ",likeCnt:" + i17 + ",textHeight:0");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.c7g);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        m(p17, z17, i17, num);
    }

    public final void s(bm2.h1 holder, dk2.cg msg, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean o17 = msg.o();
        int s17 = msg.s();
        zl2.r4.f473950a.M2("FinderLiveGroupCommentHelper", "live CommentLikeTrack: setLike isLike:" + o17 + ",likeCnt:" + s17);
        m(holder.f21931i, o17, s17, num);
    }

    public final void t(kotlinx.coroutines.y0 y0Var, android.view.View likeRoot, yz5.a postLikeCallback) {
        kotlin.jvm.internal.o.g(likeRoot, "likeRoot");
        kotlin.jvm.internal.o.g(postLikeCallback, "postLikeCallback");
        android.view.View findViewById = likeRoot.findViewById(com.tencent.mm.R.id.c7d);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = likeRoot.findViewById(com.tencent.mm.R.id.c7f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById2;
        android.view.View findViewById3 = likeRoot.findViewById(com.tencent.mm.R.id.c7e);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        if (y0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveGroupCommentHelper", "showLikeAnimAndPostLike scope is null");
        }
        if (y0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new se2.t(likeRoot, weImageView, mMPAGView, textView, postLikeCallback, null), 2, null);
        }
    }
}
