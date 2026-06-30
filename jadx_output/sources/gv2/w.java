package gv2;

/* loaded from: classes10.dex */
public final class w extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.uniComments.d f276087e;

    /* renamed from: f, reason: collision with root package name */
    public final int f276088f;

    /* renamed from: g, reason: collision with root package name */
    public final int f276089g;

    public w(com.tencent.mm.plugin.finder.uniComments.d presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f276087e = presenter;
        this.f276088f = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        this.f276089g = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479722de);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487857x;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.text.Spanned i19;
        int i27;
        java.lang.String str;
        java.lang.String string;
        java.lang.String z07;
        java.util.List data;
        java.lang.CharSequence charSequence;
        int i28;
        jv2.a aVar;
        jv2.d item = (jv2.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.f293125i = item;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.dza);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f483838c70);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.kbf);
        android.content.Context context = holder.f293121e;
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_1));
        textView.setOnClickListener(null);
        holder.p(com.tencent.mm.R.id.a_4).setOnClickListener(null);
        holder.w(com.tencent.mm.R.id.f485064gf3, 8);
        com.tencent.mm.plugin.finder.uniComments.d dVar = this.f276087e;
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = (com.tencent.mm.plugin.finder.uniComments.o0) dVar;
        java.util.ArrayList arrayList = o0Var.f130326h.f130342a;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            jv2.d dVar2 = (jv2.d) kz5.n0.Z(arrayList);
            if (dVar2 != null && (aVar = dVar2.f302207d) != null) {
                if ((aVar.u0().getExtFlag() & 1) > 0) {
                }
            }
        }
        java.util.ArrayList arrayList2 = o0Var.f130326h.f130342a;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList2)) {
            java.util.Iterator it = arrayList2.iterator();
            int i29 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i37 = i29 + 1;
                if (i29 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                jv2.d dVar3 = (jv2.d) next;
                if (dVar3.f302207d.A0() == 0) {
                    if (!((dVar3.f302207d.u0().getExtFlag() & 1) > 0)) {
                        break;
                    }
                }
                i29 = i37;
            }
        }
        if (((com.tencent.mm.plugin.finder.uniComments.o0) dVar).f130329n == 2) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String md6 = c61.yb.md((c61.yb) c17, item.f302207d.D0(), item.f302207d.y0(), false, 4, null);
            ((ke0.e) xVar).getClass();
            android.text.Spanned spannableStringBuilder = new android.text.SpannableStringBuilder(com.tencent.mm.pluginsdk.ui.span.c0.i(context, md6));
            android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder().append((java.lang.CharSequence) spannableStringBuilder);
            if (((c61.l7) i95.n0.c(c61.l7.class)).Gk(item.f302207d.D0()) || hc2.l.i(item.f302207d.D0())) {
                i95.m c18 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                c61.yb ybVar = (c61.yb) c18;
                android.content.Context context2 = textView.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                android.text.TextPaint paint = textView.getPaint();
                kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                kotlin.jvm.internal.o.d(append);
                textView.setText(c61.yb.nf(ybVar, context2, paint, append, 0, 8, null));
                if (com.tencent.mm.plugin.finder.storage.t70.f127590a.q()) {
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479308vo));
                    textView.setOnClickListener(new gv2.o(item, holder));
                    holder.p(com.tencent.mm.R.id.a_4).setOnClickListener(new gv2.p(item, holder));
                    i19 = spannableStringBuilder;
                }
            } else {
                i95.m c19 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                c61.yb ybVar2 = (c61.yb) c19;
                android.content.Context context3 = textView.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                android.text.TextPaint paint2 = textView.getPaint();
                kotlin.jvm.internal.o.f(paint2, "getPaint(...)");
                kotlin.jvm.internal.o.d(append);
                textView.setText(c61.yb.nf(ybVar2, context3, paint2, append, 0, 8, null));
            }
            i19 = spannableStringBuilder;
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String y07 = item.f302207d.y0();
            ((ke0.e) xVar2).getClass();
            i19 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, y07);
            i95.m c27 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            c61.yb ybVar3 = (c61.yb) c27;
            android.content.Context context4 = textView.getContext();
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            android.text.TextPaint paint3 = textView.getPaint();
            kotlin.jvm.internal.o.f(paint3, "getPaint(...)");
            textView.setText(c61.yb.nf(ybVar3, context4, paint3, i19, 0, 8, null));
        }
        java.lang.CharSequence f17 = k35.m1.f(context, item.f302207d.u0().getCreatetime() * 1000, true, false);
        holder.s(com.tencent.mm.R.id.f483852c85, f17);
        item.f302207d.D0();
        item.f302207d.y0();
        item.f302207d.j();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.a_4);
        java.lang.String D0 = item.f302207d.D0();
        imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, D0, null);
        imageView.setOnClickListener(new gv2.q(holder, D0, this));
        k12.r rVar = (k12.r) i95.n0.c(k12.r.class);
        android.content.Context context5 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        android.text.Spanned spanned = i19;
        textView.setText(((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ai(textView, D0, ((h12.b) rVar).Ai(context5, c01.a2.e(D0)), bi4.c.CONVERSATION_LIST, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia)));
        textView.setOnClickListener(new gv2.r(holder, D0, this));
        android.view.View p18 = holder.p(com.tencent.mm.R.id.ehq);
        if (p18 != null) {
            item.f302207d.getClass();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        if (!z17) {
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
            java.lang.Object obj = holder.f293125i;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.TextStatusFeedComment");
            finderCollapsibleTextView.setCollapse(((jv2.d) obj).f302210g);
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String j17 = item.f302207d.j();
            ((ke0.e) xVar3).getClass();
            finderCollapsibleTextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, j17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder replyCommentId:");
            sb6.append(item.f302207d.u0().getReplyCommentId());
            sb6.append(", content:");
            java.lang.String reply_content = item.f302207d.u0().getReply_content();
            if (reply_content == null) {
                reply_content = "";
            }
            sb6.append(reply_content);
            sb6.append(", nickname:");
            sb6.append(item.f302207d.z0());
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentLevel2Convert", sb6.toString());
        }
        if ((item.f302207d.u0().getDisplayFlag() & 1) != 0) {
            i27 = 0;
            holder.w(com.tencent.mm.R.id.i1d, 0);
        } else {
            i27 = 0;
            holder.w(com.tencent.mm.R.id.i1d, 8);
        }
        if (item.f302207d.field_state == -1) {
            holder.w(com.tencent.mm.R.id.c6y, i27);
            holder.w(com.tencent.mm.R.id.c6z, i27);
            if (item.f302207d.field_failedFlag == 1) {
                holder.r(com.tencent.mm.R.id.c6z, com.tencent.mm.R.string.cpe);
                holder.p(com.tencent.mm.R.id.f483838c70).setOnClickListener(null);
            } else {
                holder.r(com.tencent.mm.R.id.c6z, com.tencent.mm.R.string.cv8);
                holder.p(com.tencent.mm.R.id.f483838c70).setOnClickListener(gv2.s.f276070d);
            }
        } else {
            holder.w(com.tencent.mm.R.id.c6y, 8);
            holder.w(com.tencent.mm.R.id.c6z, 8);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentLevel2Convert", "maskView gone " + i17 + ", blink " + item.f302212i + ", hasBlink " + item.f302213m);
        if (!item.f302212i || item.f302213m) {
            holder.w(com.tencent.mm.R.id.dz9, 8);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentLevel2Convert", "begin blink animation " + i17);
            item.f302213m = true;
            android.view.View p19 = holder.p(com.tencent.mm.R.id.dz9);
            p19.post(new gv2.u(p19, viewGroup, i17));
        }
        android.view.View p27 = holder.p(com.tencent.mm.R.id.i0p);
        p27.setPadding(p27.getPaddingLeft(), p27.getPaddingTop(), p27.getPaddingRight(), i65.a.b(context, 6));
        jv2.d h17 = o0Var.h(item.f302207d.A0());
        android.view.View p28 = holder.p(com.tencent.mm.R.id.i0r);
        android.view.View p29 = holder.p(com.tencent.mm.R.id.i0q);
        boolean d17 = o0Var.d(item, true);
        if (h17 == null) {
            if (d17) {
                o(viewGroup, p17, item.f302209f);
            } else {
                p(viewGroup, p17, item.f302209f);
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p28, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        boolean z18 = h17.f302207d.u0().getUpContinueFlag() == 1;
        boolean z19 = h17.f302207d.u0().getContinueFlag() == 1;
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.jzi);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        if (!item.f302215o || (i28 = h17.f302214n) <= 0) {
            str = string2;
            string = context.getString(com.tencent.mm.R.string.jzh);
        } else {
            str = string2;
            string = context.getString(com.tencent.mm.R.string.jzg, com.tencent.mm.plugin.finder.assist.w2.g(2, i28));
        }
        kotlin.jvm.internal.o.d(string);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentLevel2Convert", "onBindViewHolder: downContinue:" + z19 + " isLastLevel2Comment:" + d17);
        if (z19 && d17) {
            kotlin.jvm.internal.o.d(p29);
            n(p29, string, h17, true);
            o(viewGroup, p17, item.f302209f);
        } else {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p29, arrayList5.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (d17) {
                o(viewGroup, p17, item.f302209f);
            } else {
                p(viewGroup, p17, item.f302209f);
            }
        }
        if (z18 && o0Var.d(item, false)) {
            kotlin.jvm.internal.o.d(p28);
            n(p28, str, h17, false);
        } else {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p28, arrayList6.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView.setContentDescription(item.f302207d.y0());
        if (((com.tencent.mm.plugin.finder.uniComments.o0) dVar).f130329n == 2) {
            i95.m c28 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c28, "getService(...)");
            c61.yb ybVar4 = (c61.yb) c28;
            java.lang.String reply_username = item.f302207d.u0().getReply_username();
            z07 = c61.yb.md(ybVar4, reply_username == null ? "" : reply_username, item.f302207d.z0(), false, 4, null);
        } else {
            z07 = item.f302207d.z0();
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.dza);
        if (viewGroup2 != null) {
            viewGroup2.setTag(com.tencent.mm.R.id.e79, spanned);
            viewGroup2.setTag(com.tencent.mm.R.id.e5n, f17);
            viewGroup2.setTag(com.tencent.mm.R.id.e7f, z07);
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView2 = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
            viewGroup2.setTag(com.tencent.mm.R.id.e5l, (finderCollapsibleTextView2 == null || (charSequence = finderCollapsibleTextView2.getCom.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT java.lang.String()) == null) ? "" : charSequence);
        }
        android.view.View p37 = holder.p(com.tencent.mm.R.id.dfg);
        if (dVar != null && (data = ((com.tencent.mm.plugin.finder.uniComments.o0) dVar).e(context).getData()) != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onBindViewHolder: position：");
            sb7.append(i17);
            sb7.append(" size - 1:");
            sb7.append(data.size() - 1);
            sb7.append(' ');
            sb7.append(p37 != null ? java.lang.Integer.valueOf(p37.getVisibility()) : null);
            sb7.append("item.showEmptyFooterView:");
            sb7.append(item.f302208e);
            sb7.append(' ');
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentLevel2Convert", sb7.toString());
            if (data.size() - 1 != i17) {
                if (p37 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(p37, arrayList7.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p37.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(p37, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (data.size() - 1 == i17) {
                if (item.f302208e) {
                    android.view.ViewGroup.LayoutParams layoutParams = p37.getLayoutParams();
                    layoutParams.height = this.f276089g;
                    p37.setLayoutParams(layoutParams);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(p37, arrayList8.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p37.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(p37, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    if (p37 != null && p37.getVisibility() == 0) {
                        kotlin.jvm.internal.o.d(p37);
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(p37.getHeight(), 0);
                        ofInt.setDuration(150L);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        ofInt.addUpdateListener(new gv2.m(p37));
                        ofInt.addListener(new gv2.n(p37));
                        ofInt.start();
                    } else if (p37 != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                        arrayList9.add(8);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(p37, arrayList9.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p37.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(p37, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
        if (item.f302209f) {
            viewGroup.setAlpha(0.15f);
            viewGroup.setEnabled(false);
        } else {
            viewGroup.setAlpha(1.0f);
            viewGroup.setEnabled(true);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
        finderCollapsibleTextView.setLimitLine(4);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.f(false, true);
        finderCollapsibleTextView.setOnCollapse(new gv2.v(holder));
        android.view.View p17 = holder.p(com.tencent.mm.R.id.i0p);
        p17.setTouchDelegate(new com.tencent.mm.ui.xj(p17));
        i65.a.f(holder.f293121e, com.tencent.mm.R.dimen.f479688cn);
    }

    public final void n(android.view.View view, java.lang.String str, jv2.d dVar, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mvi)).setText(str);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.mvf);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.mvh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new gv2.l(findViewById, findViewById2, this, dVar, z17));
    }

    public final void o(android.view.View view, android.view.View view2, boolean z17) {
        if (view != null) {
            view.setBackground(z17 ? view.getResources().getDrawable(com.tencent.mm.R.drawable.b67) : view.getResources().getDrawable(com.tencent.mm.R.drawable.b68));
        }
        if (view2 != null) {
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), this.f276088f);
        }
    }

    public final void p(android.view.View view, android.view.View view2, boolean z17) {
        if (view != null) {
            view.setBackground(z17 ? view.getResources().getDrawable(com.tencent.mm.R.drawable.b6c) : view.getResources().getDrawable(com.tencent.mm.R.drawable.b6d));
        }
        if (view2 != null) {
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), this.f276088f);
        }
    }
}
