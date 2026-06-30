package sc2;

/* loaded from: classes2.dex */
public final class b3 extends ad2.h {
    public boolean A;
    public r45.nh C;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f405777x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f405778y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f405779z;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f405776w = "FeedJumperBigBtnObserver";
    public final java.lang.Runnable B = new sc2.z2(this);

    @Override // ad2.h
    public void B(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        boolean z17;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.xk bizInfo;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.B(holder, jumpView, infoEx, source);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        if (2 == finderJumpInfo.getBusiness_type() && 7 == finderJumpInfo.getJumpinfo_type()) {
            ya2.g gVar = ya2.h.f460484a;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
            java.lang.String str = (baseFinderFeed == null || (feedObject2 = baseFinderFeed.getFeedObject()) == null) ? null : feedObject2.field_username;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = infoEx.f453244f;
            z17 = !ya2.g.h(gVar, str, (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || (bizInfo = feedObject.getBizInfo()) == null) ? null : bizInfo.getString(0), false, false, 12, null);
        } else {
            z17 = true;
        }
        I(z17, true);
        this.A = true;
    }

    @Override // ad2.h
    public void C(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.C(holder);
        android.view.View view = this.f405777x;
        if (view != null) {
            view.removeCallbacks(this.B);
        }
    }

    public final java.lang.String G(android.content.Context context, java.lang.String str, int i17) {
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        java.lang.String string = context.getString(i17);
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    public final void H(xc2.p0 p0Var, in5.s0 s0Var) {
        java.lang.String str;
        java.lang.String string;
        android.view.View view = this.f405777x;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshCommon", "(Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshCommon", "(Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        xc2.y2 y2Var = xc2.y2.f453343a;
        r45.nh nhVar = this.C;
        boolean z17 = true;
        java.lang.String str2 = "";
        if (nhVar == null || (str = nhVar.getString(1)) == null) {
            str = "";
        }
        r45.nh nhVar2 = this.C;
        if (nhVar2 != null && (string = nhVar2.getString(0)) != null) {
            str2 = string;
        }
        java.lang.String q07 = y2Var.q0(str, str2);
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String l17 = l(q07, G(context, p0Var.f453234a.getWording(), com.tencent.mm.R.string.f491262ck4));
        android.widget.TextView textView = this.f405778y;
        if (textView != null) {
            textView.setText(l17);
        }
        r45.nh nhVar3 = this.C;
        java.lang.String string2 = nhVar3 != null ? nhVar3.getString(4) : null;
        if (string2 != null && string2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f405779z;
            if (weImageView == null) {
                return;
            }
            weImageView.setVisibility(8);
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f405779z;
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
        r45.nh nhVar4 = this.C;
        y2Var.p0(nhVar4 != null ? nhVar4.getString(4) : null, this.f405779z, null);
    }

    public final void I(boolean z17, boolean z18) {
        android.view.View view;
        if (!z17 && !this.A) {
            android.view.View view2 = this.f405777x;
            if (view2 != null) {
                view2.setBackgroundResource(com.tencent.mm.R.drawable.f481612xz);
                return;
            }
            return;
        }
        r45.nh nhVar = this.C;
        java.lang.String string = nhVar != null ? nhVar.getString(3) : null;
        if (!(string == null || string.length() == 0)) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                r45.nh nhVar2 = this.C;
                int parseColor = android.graphics.Color.parseColor(nhVar2 != null ? nhVar2.getString(3) : null);
                android.view.View view3 = this.f405777x;
                if (view3 != null) {
                    view3.setBackgroundColor(parseColor);
                    return;
                }
                return;
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
        }
        if (!z18 || (view = this.f405777x) == null) {
            return;
        }
        view.setBackgroundResource(com.tencent.mm.R.drawable.f481525vk);
    }

    public final void J(in5.s0 s0Var, boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3;
        xc2.p0 p0Var = this.f3147h;
        if ((p0Var == null || (finderJumpInfo3 = p0Var.f453234a) == null || 2 != finderJumpInfo3.getBusiness_type()) ? false : true) {
            xc2.p0 p0Var2 = this.f3147h;
            if ((p0Var2 == null || (finderJumpInfo2 = p0Var2.f453234a) == null || 7 != finderJumpInfo2.getJumpinfo_type()) ? false : true) {
                if (z17) {
                    android.view.View view = this.f405777x;
                    if (view != null && view.getVisibility() == 8) {
                        return;
                    }
                }
                int dimensionPixelSize = s0Var.f293121e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
                android.content.Context context = s0Var.f293121e;
                if (z17) {
                    android.widget.TextView textView = this.f405778y;
                    if (textView != null) {
                        textView.setText(com.tencent.mm.R.string.f492274fw4);
                    }
                    android.widget.TextView textView2 = this.f405778y;
                    if (textView2 != null) {
                        textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479250u2));
                    }
                    android.view.View view2 = this.f405777x;
                    if (view2 != null) {
                        view2.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481612xz));
                    }
                    android.view.View view3 = this.f405777x;
                    if (view3 != null) {
                        view3.postDelayed(new sc2.a3(this, dimensionPixelSize), 1000L);
                        return;
                    }
                    return;
                }
                android.widget.TextView textView3 = this.f405778y;
                if (textView3 != null) {
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    xc2.p0 p0Var3 = this.f3147h;
                    textView3.setText(G(context, (p0Var3 == null || (finderJumpInfo = p0Var3.f453234a) == null) ? null : finderJumpInfo.getWording(), com.tencent.mm.R.string.cxd));
                }
                android.widget.TextView textView4 = this.f405778y;
                if (textView4 != null) {
                    textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479254u6));
                }
                android.view.View view4 = this.f405777x;
                if (view4 == null || view4 == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "updateFollow", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "updateFollow", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f405776w;
    }

    @Override // ad2.h
    public void p(in5.s0 holder, xc2.t0 action) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(action, "action");
        int ordinal = action.f453306a.ordinal();
        if (ordinal == 0) {
            I(true, true);
        } else if (ordinal == 1) {
            J(holder, true);
        } else {
            if (ordinal != 2) {
                return;
            }
            J(holder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.Object] */
    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        android.view.View a17;
        r45.wf6 wf6Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        r45.wf6 wf6Var2 = this.f3149m;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                }
                wf6Var = it.next();
                r45.wf6 wf6Var3 = (r45.wf6) wf6Var;
                if (wf6Var3.getInteger(1) == infoEx.f453256r && wf6Var3.getInteger(2) == 3) {
                    break;
                }
            }
            wf6Var2 = wf6Var;
        }
        this.C = wf6Var2 != null ? (r45.nh) wf6Var2.getCustom(6) : null;
        com.tencent.mars.xlog.Log.i(this.f405776w, "[onBindView] hashCode:" + hashCode() + "holder: " + holder.hashCode() + " holder position: " + holder.getPosition() + " feedId=" + pm0.v.u(this.f3145f) + " showPosition=" + infoEx.f453256r + " showStyle=" + infoEx.f453257s + " businessType=" + finderJumpInfo.getBusiness_type() + " jumpType=" + finderJumpInfo.getJumpinfo_type() + " title=" + finderJumpInfo.getRecommend_reason() + '|' + finderJumpInfo.getWording() + " icon_url=" + finderJumpInfo.getIcon_url() + " ext_info=" + finderJumpInfo.getExt_info() + ' ');
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue()) {
            jz5.g gVar = bw2.s.f24887a;
            a17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.s.f24887a).getValue()).invoke(jumpView)).a();
        } else {
            a17 = jumpView.findViewById(com.tencent.mm.R.id.e9w);
        }
        this.f405777x = a17;
        this.f405778y = a17 != null ? (android.widget.TextView) a17.findViewById(com.tencent.mm.R.id.e9v) : null;
        android.view.View view = this.f405777x;
        this.f405779z = view != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.e9u) : null;
        if (2 != finderJumpInfo.getBusiness_type()) {
            jz5.l k17 = nv2.n1.f340551h.k(feed.getFeedObject().getFeedObject());
            boolean booleanValue = ((java.lang.Boolean) k17.f302833d).booleanValue();
            ((java.lang.Boolean) k17.f302834e).booleanValue();
            I(booleanValue, false);
            H(infoEx, holder);
            return;
        }
        if (7 == finderJumpInfo.getJumpinfo_type()) {
            android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.f484486ee3);
            if (findViewById != null) {
                findViewById.setTranslationY(0.0f);
            }
            android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.g1y);
            if (findViewById2 != null) {
                findViewById2.setTranslationY(0.0f);
            }
            android.view.View view2 = this.f405777x;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f405779z;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            ya2.g gVar2 = ya2.h.f460484a;
            java.lang.String str = feed.getFeedObject().field_username;
            r45.xk bizInfo = feed.getFeedObject().getBizInfo();
            if (ya2.g.h(gVar2, str, bizInfo != null ? bizInfo.getString(0) : null, false, false, 12, null)) {
                android.view.View view3 = this.f405777x;
                if (view3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                jz5.l k18 = nv2.n1.f340551h.k(feed.getFeedObject().getFeedObject());
                boolean booleanValue2 = ((java.lang.Boolean) k18.f302833d).booleanValue();
                ((java.lang.Boolean) k18.f302834e).booleanValue();
                I(booleanValue2, true);
                android.view.View view4 = this.f405777x;
                if (view4 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView = this.f405778y;
                android.content.Context context = holder.f293121e;
                if (textView != null) {
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    textView.setText(G(context, finderJumpInfo.getWording(), com.tencent.mm.R.string.cxd));
                }
                android.widget.TextView textView2 = this.f405778y;
                if (textView2 != null) {
                    textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479254u6));
                }
                android.view.View findViewById3 = holder.itemView.findViewById(com.tencent.mm.R.id.gac);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                holder.itemView.requestLayout();
            }
        } else {
            jz5.l k19 = nv2.n1.f340551h.k(feed.getFeedObject().getFeedObject());
            boolean booleanValue3 = ((java.lang.Boolean) k19.f302833d).booleanValue();
            ((java.lang.Boolean) k19.f302834e).booleanValue();
            I(booleanValue3, true);
            H(infoEx, holder);
        }
        android.view.View view5 = this.f405777x;
        if (view5 != null) {
            view5.postDelayed(this.B, 5000L);
        }
    }

    @Override // ad2.h
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        zu2.q qVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.r(holder, jumpView, infoEx);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        if (finderJumpInfo.getBusiness_type() != 2 || finderJumpInfo.getJumpinfo_type() == 7) {
            return;
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        zu2.a0 a0Var = (zu2.a0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(zu2.a0.class);
        if (a0Var == null || (qVar = a0Var.f475694f) == null) {
            return;
        }
        qVar.a();
        qVar.d("big_btn_click");
    }
}
