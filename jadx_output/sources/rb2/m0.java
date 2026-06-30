package rb2;

/* loaded from: classes10.dex */
public abstract class m0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f393686e;

    /* renamed from: f, reason: collision with root package name */
    public final long f393687f;

    /* renamed from: g, reason: collision with root package name */
    public da2.g f393688g;

    public m0(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter, long j17) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f393686e = presenter;
        this.f393687f = j17;
    }

    public static void y(rb2.m0 m0Var, in5.s0 holder, so2.y0 item, android.widget.ImageView authView, android.widget.ImageView imageView, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAuthIcon");
        }
        if ((i17 & 8) != 0) {
            imageView = null;
        }
        m0Var.getClass();
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(authView, "authView");
        rb2.n0 n0Var = rb2.n0.f393695a;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        n0Var.b(context, item, authView, imageView);
    }

    public final void A(java.lang.String str, in5.s0 s0Var, android.view.View view, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, int i17, int i18, int i19, yz5.l lVar) {
        java.lang.Object obj;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        java.lang.String str2;
        android.widget.TextView textView;
        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.sd) ((r45.wf6) obj).getCustom(33)) != null) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.sd sdVar = wf6Var != null ? (r45.sd) wf6Var.getCustom(33) : null;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483843c75)) != null) {
            java.lang.String string = sdVar != null ? sdVar.getString(1) : null;
            textView.setText(string == null || string.length() == 0 ? s0Var.f293121e.getResources().getString(i17) : sdVar != null ? sdVar.getString(1) : null);
        }
        if (view != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f483842c74)) != null) {
            if (sdVar == null || (str2 = sdVar.getString(0)) == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                d75.b.g(new rb2.d0(weImageView, i18, i19));
            } else {
                weImageView.setIconColor(s0Var.f293121e.getResources().getColor(i19, null));
                mn2.g1 g1Var = mn2.g1.f329975a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329964r));
                rb2.h0 h0Var = new rb2.h0(this, weImageView, i18, i19);
                b17.getClass();
                b17.f447879j = h0Var;
                b17.f447878i = new rb2.i0(this, weImageView, i18, i19);
                b17.c(weImageView);
            }
        }
        if (view != null) {
            view.setOnClickListener(new rb2.j0(str, finderJumpInfo, lVar));
        }
    }

    public final void n(in5.s0 holder, so2.y0 item, int i17, java.lang.String tag) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(tag, "tag");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.dz8);
        com.tencent.mars.xlog.Log.i(tag, "blinkView, " + i17 + ", blink:" + item.f410718v + ", hasBlink:" + item.f410720x + " isBlinking:" + item.f410721y);
        if (!item.f410721y) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!item.f410718v || item.f410720x || item.f410721y) {
            return;
        }
        com.tencent.mars.xlog.Log.i(tag, "begin blink animation " + i17 + ", duration:" + item.f410719w);
        item.f410720x = true;
        item.f410721y = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p17.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p17.animate().alpha(0.0f).setDuration(1000L).setStartDelay(item.f410719w).setListener(new rb2.w(p17, item, tag, i17)).start();
    }

    public final void o(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.view.FinderInterceptFrameLayout finderInterceptFrameLayout = (com.tencent.mm.plugin.finder.view.FinderInterceptFrameLayout) holder.p(com.tencent.mm.R.id.rrw);
        if (finderInterceptFrameLayout != null) {
            finderInterceptFrameLayout.setInterceptListener(new rb2.x(this));
        }
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
        finderCollapsibleTextView.setLimitLine(4);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.f(false, true);
        finderCollapsibleTextView.setExpandTextColor(holder.f293121e.getResources().getColor(com.tencent.mm.R.color.f479121qk, null));
        finderCollapsibleTextView.setOnCollapse(new rb2.y(holder, this));
    }

    public final java.lang.String p(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String str3 = null;
            try {
                boolean z17 = true;
                if (!jSONObject.has(str2)) {
                    z17 = false;
                }
                if (z17) {
                    str3 = jSONObject.getString(str2);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
            }
            return str3 == null ? "" : str3;
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("Finder.FinderCommentConvert", e18.getMessage());
            return "";
        }
    }

    public final void q(so2.y0 item, in5.s0 holder, boolean z17) {
        jz5.f0 f0Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.ky0 advertisement_info = item.f410703d.u0().getAdvertisement_info();
        java.lang.String str = (advertisement_info == null || (string = advertisement_info.getString(4)) == null) ? "" : string;
        r45.xk bizInfo = item.f410703d.getBizInfo();
        android.content.Context context = holder.f293121e;
        if (bizInfo != null) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string2 = bizInfo.getString(0);
            java.lang.String str2 = string2 != null ? string2 : "";
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f393686e;
            so2.g0.b(item, context, str2, nPresenter.getCommentScene(), nPresenter.z0(), str);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String Z0 = item.f410703d.Z0();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            so2.g0.d(item, Z0, context, str);
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        o3Var.Gk(context, item.f410703d.field_feedId, true, true, 1, z17);
    }

    public void r(in5.s0 holder, so2.y0 item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        holder.f293125i = item;
    }

    public final void s(in5.s0 holder, so2.y0 item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.s(com.tencent.mm.R.id.f483852c85, com.tencent.mm.plugin.finder.assist.w2.k(holder.f293121e, item.f410703d.y0() * 1000));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(so2.y0 r19, in5.s0 r20) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.m0.t(so2.y0, in5.s0):void");
    }

    public final void u(so2.y0 item, in5.s0 holder) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.h0().r()).booleanValue()) {
            holder.w(com.tencent.mm.R.id.f486383l23, 8);
            java.util.LinkedList<r45.zb1> interaction_label_list = item.f410703d.u0().getInteraction_label_list();
            kotlin.jvm.internal.o.f(interaction_label_list, "getInteraction_label_list(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = interaction_label_list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                int integer = ((r45.zb1) next).getInteger(1);
                com.tencent.mm.plugin.finder.assist.d3 d3Var = com.tencent.mm.plugin.finder.assist.d3.f102076e;
                if (integer == 1) {
                    arrayList.add(next);
                }
            }
            java.util.List V0 = kz5.n0.V0(arrayList);
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            boolean h17 = item.f410703d.h1();
            boolean f17 = item.f410703d.f1();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
            if (arrayList2.isEmpty()) {
                if (h17) {
                    r45.zb1 zb1Var = new r45.zb1();
                    com.tencent.mm.plugin.finder.assist.d3 d3Var2 = com.tencent.mm.plugin.finder.assist.d3.f102076e;
                    zb1Var.set(1, 1);
                    zb1Var.set(0, "<_wc_custom_link_ color=\"Brand_100\" backgroundenabled=\"0\">" + context.getString(com.tencent.mm.R.string.cpv) + "</_wc_custom_link_>");
                    arrayList2.add(zb1Var);
                } else if (f17) {
                    r45.zb1 zb1Var2 = new r45.zb1();
                    com.tencent.mm.plugin.finder.assist.d3 d3Var3 = com.tencent.mm.plugin.finder.assist.d3.f102076e;
                    zb1Var2.set(1, 1);
                    zb1Var2.set(0, "<_wc_custom_link_ color=\"#C5984C\" backgroundenabled=\"0\">" + context.getString(com.tencent.mm.R.string.cpt) + "</_wc_custom_link_>");
                    arrayList2.add(zb1Var2);
                }
            }
            com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView finderInteractionLabelGroupView = (com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView) holder.p(com.tencent.mm.R.id.ulp);
            if (finderInteractionLabelGroupView != null) {
                int i17 = V0.isEmpty() ^ true ? 0 : 8;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList3.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(finderInteractionLabelGroupView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "refreshInteractLabel", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderInteractionLabelGroupView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(finderInteractionLabelGroupView, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "refreshInteractLabel", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (finderInteractionLabelGroupView.getVisibility() == 0) {
                    finderInteractionLabelGroupView.a(V0);
                }
            }
            java.util.LinkedList<r45.zb1> interaction_label_list2 = item.f410703d.u0().getInteraction_label_list();
            kotlin.jvm.internal.o.f(interaction_label_list2, "getInteraction_label_list(...)");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj : interaction_label_list2) {
                int integer2 = ((r45.zb1) obj).getInteger(1);
                com.tencent.mm.plugin.finder.assist.d3 d3Var4 = com.tencent.mm.plugin.finder.assist.d3.f102076e;
                if (integer2 == 2) {
                    arrayList4.add(obj);
                }
            }
            com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView finderInteractionLabelGroupView2 = (com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView) holder.p(com.tencent.mm.R.id.skv);
            if (finderInteractionLabelGroupView2 != null) {
                int i18 = arrayList4.isEmpty() ^ true ? 0 : 8;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList5.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(finderInteractionLabelGroupView2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "refreshInteractLabel", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderInteractionLabelGroupView2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(finderInteractionLabelGroupView2, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "refreshInteractLabel", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (finderInteractionLabelGroupView2.getVisibility() == 0) {
                    finderInteractionLabelGroupView2.a(arrayList4);
                }
            }
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.ehq);
            java.util.Iterator it6 = V0.iterator();
            while (it6.hasNext()) {
                if (((r45.zb1) it6.next()).getInteger(3) == 8) {
                    imageView.setVisibility(8);
                }
            }
            java.util.Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                if (((r45.zb1) it7.next()).getInteger(3) == 8) {
                    imageView.setVisibility(8);
                }
            }
        }
    }

    public final void v(in5.s0 holder, so2.y0 item) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.hgh);
        if (textView == null) {
            return;
        }
        r45.dc1 ip_region_info = item.f410703d.u0().getIp_region_info();
        if (ip_region_info == null || (str = ip_region_info.getString(0)) == null) {
            str = "";
        }
        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.J0().r()).booleanValue() || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0437, code lost:
    
        if (r9 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x015f, code lost:
    
        if ((62 == r11.getBusiness_type()) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013e, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x079f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0172  */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(in5.s0 r47, so2.y0 r48, int r49) {
        /*
            Method dump skipped, instructions count: 2174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.m0.w(in5.s0, so2.y0, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if ((r6 == null || r6.length() == 0) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(in5.s0 r22, so2.y0 r23) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.m0.x(in5.s0, so2.y0):void");
    }

    public final void z(in5.s0 holder, android.view.View commentContent) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(commentContent, "commentContent");
        so2.y0 y0Var = (so2.y0) holder.f293125i;
        java.util.ArrayList arrayList = y0Var != null ? y0Var.A : null;
        if (arrayList == null || arrayList.isEmpty()) {
            ym5.a1.h(commentContent, null);
        } else {
            ym5.a1.h(commentContent, new rb2.g0(holder));
        }
    }
}
