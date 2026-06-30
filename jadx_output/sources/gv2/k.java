package gv2;

/* loaded from: classes10.dex */
public final class k extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.uniComments.d f276033e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f276034f;

    /* renamed from: g, reason: collision with root package name */
    public final int f276035g;

    public k(com.tencent.mm.plugin.finder.uniComments.d presenter, boolean z17) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f276033e = presenter;
        this.f276034f = z17;
        this.f276035g = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479722de);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487856w;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        android.content.Context context;
        java.util.List data;
        java.lang.Object obj;
        java.lang.String z07;
        jv2.d item = (jv2.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.f293125i = item;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.kbf);
        android.content.Context context2 = holder.f293121e;
        textView.setTextColor(context2.getResources().getColor(com.tencent.mm.R.color.FG_1));
        textView.setOnClickListener(null);
        holder.p(com.tencent.mm.R.id.a_4).setOnClickListener(null);
        holder.w(com.tencent.mm.R.id.f485064gf3, 8);
        holder.w(com.tencent.mm.R.id.f486383l23, 8);
        java.lang.CharSequence f17 = k35.m1.f(context2, item.f302207d.u0().getCreatetime() * 1000, true, false);
        holder.s(com.tencent.mm.R.id.f483852c85, f17);
        item.f302207d.D0();
        item.f302207d.y0();
        item.f302207d.j();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.a_4);
        java.lang.String D0 = item.f302207d.D0();
        imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, D0, null);
        imageView.setOnClickListener(new gv2.c(holder, D0, this));
        k12.r rVar = (k12.r) i95.n0.c(k12.r.class);
        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        textView.setText(((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ai(textView, D0, ((h12.b) rVar).Ai(context3, c01.a2.e(D0)), bi4.c.CONVERSATION_LIST, i65.a.h(context2, com.tencent.mm.R.dimen.f479897ia)));
        textView.setOnClickListener(new gv2.d(holder, D0, this));
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ehq);
        if (p17 != null) {
            item.f302207d.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView.setTextColor(context2.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        java.lang.Object obj2 = "";
        com.tencent.mm.plugin.finder.uniComments.d dVar = this.f276033e;
        if (!z17) {
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.f486643lz4);
            java.lang.Object obj3 = holder.f293125i;
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.TextStatusFeedComment");
            finderCollapsibleTextView.setCollapse(((jv2.d) obj3).f302211h);
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView2 = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
            java.lang.Object obj4 = holder.f293125i;
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.TextStatusFeedComment");
            finderCollapsibleTextView2.setCollapse(((jv2.d) obj4).f302210g);
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView3 = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String j17 = item.f302207d.j();
            ((ke0.e) xVar).getClass();
            finderCollapsibleTextView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, j17));
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
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentConvert", sb6.toString());
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView4 = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.f486643lz4);
            if (item.f302207d.u0().getReplyCommentId() == 0 || !this.f276034f) {
                holder.w(com.tencent.mm.R.id.f486644lz5, 8);
                finderCollapsibleTextView4.setText("");
            } else {
                holder.w(com.tencent.mm.R.id.f486644lz5, 0);
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                if (((com.tencent.mm.plugin.finder.uniComments.o0) dVar).f130329n == 2) {
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    c61.yb ybVar = (c61.yb) c17;
                    java.lang.String reply_username = item.f302207d.u0().getReply_username();
                    z07 = c61.yb.md(ybVar, reply_username == null ? "" : reply_username, item.f302207d.z0(), false, 4, null);
                } else {
                    z07 = item.f302207d.z0();
                }
                android.text.TextPaint paint = finderCollapsibleTextView4.getContentTextView().getPaint();
                kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                java.lang.String f18 = hc2.f1.f(paint, z07, hc2.t.a(context2, t70Var.p2()), hc2.t.a(context2, t70Var.p2() + 1));
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                spannableStringBuilder.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.i(context2, f18));
                spannableStringBuilder.append((java.lang.CharSequence) context2.getString(com.tencent.mm.R.string.cpa));
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String reply_content2 = item.f302207d.u0().getReply_content();
                if (reply_content2 == null) {
                    reply_content2 = "";
                }
                ((ke0.e) xVar2).getClass();
                spannableStringBuilder.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.i(context2, reply_content2));
                finderCollapsibleTextView4.setText(spannableStringBuilder);
            }
        }
        if (item.f302207d.field_state == -1) {
            holder.w(com.tencent.mm.R.id.c6y, 0);
            holder.w(com.tencent.mm.R.id.c6z, 0);
            if (item.f302207d.field_failedFlag == 1) {
                holder.r(com.tencent.mm.R.id.c6z, com.tencent.mm.R.string.cpe);
                holder.p(com.tencent.mm.R.id.f483838c70).setOnClickListener(null);
            } else {
                holder.r(com.tencent.mm.R.id.c6z, com.tencent.mm.R.string.cv8);
                holder.p(com.tencent.mm.R.id.f483838c70).setOnClickListener(gv2.e.f276003d);
            }
        } else {
            holder.w(com.tencent.mm.R.id.c6y, 8);
            holder.w(com.tencent.mm.R.id.c6z, 8);
        }
        if ((item.f302207d.u0().getDisplayFlag() & 1) != 0) {
            holder.w(com.tencent.mm.R.id.i1d, 0);
            i19 = 8;
        } else {
            i19 = 8;
            holder.w(com.tencent.mm.R.id.i1d, 8);
        }
        holder.w(com.tencent.mm.R.id.dz8, i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentConvert", "maskView gone " + i17 + ", blink " + item.f302212i + ", hasBlink " + item.f302213m);
        if (!item.f302212i || item.f302213m) {
            context = context2;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentConvert", "begin blink animation " + i17);
            item.f302213m = true;
            android.view.View p18 = holder.p(com.tencent.mm.R.id.dz8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p18.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            context = context2;
            p18.animate().alpha(0.0f).setDuration(1000L).setListener(new gv2.f(p18, i17)).start();
        }
        android.view.View p19 = holder.p(com.tencent.mm.R.id.c7p);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p19, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p27 = holder.p(com.tencent.mm.R.id.dz_);
        int v07 = item.f302207d.v0();
        android.view.View p28 = holder.p(com.tencent.mm.R.id.mvg);
        java.lang.String string = context.getString(com.tencent.mm.R.string.jzg, com.tencent.mm.plugin.finder.assist.w2.g(2, v07));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        boolean d17 = ((com.tencent.mm.plugin.finder.uniComments.o0) dVar).d(item, true);
        if (v07 <= 0 || !d17) {
            if (d17) {
                boolean z18 = item.f302209f;
                if (p27 != null) {
                    p27.setBackground(z18 ? p27.getResources().getDrawable(com.tencent.mm.R.drawable.b69) : p27.getResources().getDrawable(com.tencent.mm.R.drawable.b6_));
                }
            } else {
                n(p27, item.f302209f);
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p28, arrayList6.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) p28.findViewById(com.tencent.mm.R.id.mvi)).setText(string);
            android.view.View findViewById = p28.findViewById(com.tencent.mm.R.id.mvf);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById, arrayList7.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = p28.findViewById(com.tencent.mm.R.id.mvh);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById2, arrayList8.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setOnClickListener(new gv2.g(findViewById, findViewById2, this, item));
            n(p27, item.f302209f);
        }
        textView.setContentDescription(item.f302207d.y0());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.dz_);
        if (viewGroup != null) {
            viewGroup.setTag(com.tencent.mm.R.id.e79, "");
            viewGroup.setTag(com.tencent.mm.R.id.e5n, f17);
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView5 = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
            if (finderCollapsibleTextView5 != null && (obj = finderCollapsibleTextView5.getCom.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT java.lang.String()) != null) {
                obj2 = obj;
            }
            viewGroup.setTag(com.tencent.mm.R.id.e5l, obj2);
            viewGroup.setTag(com.tencent.mm.R.id.e5w, java.lang.Boolean.FALSE);
            viewGroup.setTag(com.tencent.mm.R.id.f484408e61, 0);
        }
        android.view.View p29 = holder.p(com.tencent.mm.R.id.dfg);
        if (dVar != null && (data = ((com.tencent.mm.plugin.finder.uniComments.o0) dVar).e(context).getData()) != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onBindViewHolder: position：");
            sb7.append(i17);
            sb7.append(" size - 1:");
            sb7.append(data.size() - 1);
            sb7.append(' ');
            sb7.append(p29 != null ? java.lang.Integer.valueOf(p29.getVisibility()) : null);
            sb7.append("item.showEmptyFooterView:");
            sb7.append(item.f302208e);
            sb7.append(' ');
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentConvert", sb7.toString());
            if (data.size() - 1 == i17) {
                if (data.size() - 1 == i17) {
                    if (item.f302208e) {
                        android.view.ViewGroup.LayoutParams layoutParams = p29.getLayoutParams();
                        layoutParams.height = this.f276035g;
                        p29.setLayoutParams(layoutParams);
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        arrayList9.add(0);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(p29, arrayList9.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p29.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(p29, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        if (p29 != null && p29.getVisibility() == 0) {
                            kotlin.jvm.internal.o.d(p29);
                            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(p29.getHeight(), 0);
                            ofInt.setDuration(150L);
                            ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                            ofInt.addUpdateListener(new gv2.a(p29));
                            ofInt.addListener(new gv2.b(p29));
                            ofInt.start();
                        } else if (p29 != null) {
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            arrayList10.add(8);
                            java.util.Collections.reverse(arrayList10);
                            yj0.a.d(p29, arrayList10.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            p29.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                            yj0.a.f(p29, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
            } else if (p29 != null) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(p29, arrayList11.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (item.f302209f) {
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(java.lang.Float.valueOf(0.15f));
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(p27, arrayList12.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p27.setAlpha(((java.lang.Float) arrayList12.get(0)).floatValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        arrayList13.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList13);
        yj0.a.d(p27, arrayList13.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p27.setAlpha(((java.lang.Float) arrayList13.get(0)).floatValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.nfg);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.tencent.mm.R.id.dz_);
        com.tencent.mm.ui.xj xjVar = new com.tencent.mm.ui.xj(p18);
        p18.setTouchDelegate(xjVar);
        android.content.Context context = holder.f293121e;
        int f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479688cn);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.c7p);
        if (p19 != null) {
            p19.post(new gv2.h(p19, f17, xjVar));
        }
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.f486643lz4);
        finderCollapsibleTextView.setLimitLine(2);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.f(false, true);
        finderCollapsibleTextView.setOnCollapse(new gv2.i(holder));
        finderCollapsibleTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView2 = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
        finderCollapsibleTextView2.setLimitLine(4);
        finderCollapsibleTextView2.setCollapse(true);
        finderCollapsibleTextView2.f(false, true);
        finderCollapsibleTextView2.setOnCollapse(new gv2.j(holder));
    }

    public final void n(android.view.View view, boolean z17) {
        if (view != null) {
            view.setBackground(z17 ? view.getResources().getDrawable(com.tencent.mm.R.drawable.b6a) : view.getResources().getDrawable(com.tencent.mm.R.drawable.b6b));
        }
    }
}
