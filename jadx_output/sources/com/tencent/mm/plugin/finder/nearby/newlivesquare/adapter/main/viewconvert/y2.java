package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class y2 extends in5.r {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.j2 f122043n = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.j2(null);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f122044e;

    /* renamed from: f, reason: collision with root package name */
    public final int f122045f;

    /* renamed from: g, reason: collision with root package name */
    public final float f122046g;

    /* renamed from: h, reason: collision with root package name */
    public final sp2.k f122047h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.p f122048i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f122049m;

    public y2(boolean z17, int i17, float f17, sp2.k kVar, yz5.p jumProfileCallback) {
        kotlin.jvm.internal.o.g(jumProfileCallback, "jumProfileCallback");
        this.f122044e = z17;
        this.f122045f = i17;
        this.f122046g = f17;
        this.f122047h = kVar;
        this.f122048i = jumProfileCallback;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489338c63;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.p(com.tencent.mm.R.id.f484870fs4).setBackground(m95.a.e(holder.f293121e.getResources(), com.tencent.mm.R.raw.nearby_living_card_btm_bg, 0.0f));
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "#onViewRecycled holder=" + holder);
        q(holder);
    }

    public final void n(in5.s0 s0Var, r45.mb4 mb4Var, wp2.b bVar) {
        java.lang.String str;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.f487295o70);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.icp);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.e_l);
        android.view.View findViewWithTag = viewGroup != null ? viewGroup.findViewWithTag("nearby-live-fluent-preview-view-tag") : null;
        if (findViewWithTag != null) {
            com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "bindCover remove fluentView");
            if (viewGroup != null) {
                viewGroup.removeView(findViewWithTag);
            }
        }
        if (imageView == null) {
            com.tencent.mars.xlog.Log.w("Finder.LivingConvert", "bindCover return for thumbIv is null.");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i17 = this.f122045f;
        layoutParams.width = i17;
        float f17 = i17;
        float f18 = this.f122046g;
        layoutParams.height = (int) (f18 * f17);
        imageView.setLayoutParams(layoutParams);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.k68);
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = i17;
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.k68);
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup3 != null ? viewGroup3.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (f18 * f17);
        }
        java.lang.String str2 = bVar.f448386r;
        if (str2 == null) {
            str2 = "";
        }
        boolean z17 = false;
        if (str2.length() == 0) {
            str2 = zl2.q4.f473933a.y(mb4Var, 1);
            if (!(str2.length() > 0) && (str2 = bVar.f448386r) == null) {
                java.lang.String string = mb4Var.getString(16);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = mb4Var.getString(20);
                if (string2 == null) {
                    string2 = "";
                }
                str2 = string.concat(string2);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.getString(1));
            java.lang.String string3 = mb4Var.getString(19);
            sb6.append(string3 != null ? string3 : "");
            str = sb6.toString();
        } else {
            str = str2;
        }
        ((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.f487295o70)).setTag(java.lang.Long.valueOf(bVar.getFeedObject().getFeedObject().getId()));
        r45.nw1 liveInfo = bVar.getFeedObject().getLiveInfo();
        if (liveInfo != null && liveInfo.getInteger(2) == 1) {
            z17 = true;
        }
        v(bVar, z17, str, imageView, textView, true);
    }

    public final void o(in5.s0 s0Var, wp2.b bVar) {
        java.lang.Object obj;
        r45.an1 an1Var = (r45.an1) bVar.f448383o.getCustom(11);
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

    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
    
        if (r7 == null) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p(wp2.b r13, in5.s0 r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2.p(wp2.b, in5.s0, java.util.List):boolean");
    }

    public final void q(in5.s0 s0Var) {
        java.lang.Object obj = s0Var.f293124h;
        if (obj != null && (obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l2)) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l2 l2Var = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l2) obj;
            kotlinx.coroutines.z0.e(l2Var.f121775a, null, 1, null);
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = l2Var.f121777c;
            if (activityLifecycleCallbacks != null) {
                android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
                android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        s0Var.f293124h = null;
    }

    public final java.lang.String r(wp2.b bVar) {
        java.lang.String str = bVar.f448385q;
        if (!(str == null || str.length() == 0)) {
            com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "cur live enable extDesc");
            return bVar.f448385q;
        }
        sp2.k kVar = this.f122047h;
        if (kVar != null && kVar.k()) {
            if (!(bVar.getFeedObject().getDescription().length() == 0)) {
                com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "cur live enable finderDesc");
                return bVar.getFeedObject().getDescription();
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("disable desc, ");
        sb6.append(kVar != null ? java.lang.Boolean.valueOf(kVar.k()) : null);
        com.tencent.mars.xlog.Log.i("Finder.LivingConvert", sb6.toString());
        return null;
    }

    public void s(wp2.b item, in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x01cf, code lost:
    
        if (r4 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a3, code lost:
    
        if (r4 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d6, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d1, code lost:
    
        r4 = r4.getHeadUrl();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0197  */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [int, boolean] */
    @Override // in5.r
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r34, wp2.b r35, int r36, int r37, boolean r38, java.util.List r39) {
        /*
            Method dump skipped, instructions count: 2539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2.h(in5.s0, wp2.b, int, int, boolean, java.util.List):void");
    }

    public final void u(wp2.b bVar, in5.s0 s0Var, boolean z17) {
        java.lang.String str;
        r45.mb4 mb4Var = bVar.getFeedObject().isLiveFeed() ? (r45.mb4) kz5.n0.Z(bVar.getFeedObject().getLiveMediaList()) : (r45.mb4) kz5.n0.Z(bVar.getFeedObject().getMediaList());
        if (mb4Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.LivingConvert", "refreshLiveStatus: mediaObj is null, feedId=" + bVar.getFeedObject().getFeedObject().getId());
            return;
        }
        java.lang.String str2 = bVar.f448386r;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str2 = zl2.q4.f473933a.y(mb4Var, 1);
            if (!(str2.length() > 0)) {
                java.lang.String string = mb4Var.getString(16);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = mb4Var.getString(20);
                if (string2 == null) {
                    string2 = "";
                }
                str2 = string.concat(string2);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.String string3 = mb4Var.getString(1);
            if (string3 == null) {
                string3 = "";
            }
            java.lang.String string4 = mb4Var.getString(19);
            str = string3.concat(string4 != null ? string4 : "");
        } else {
            str = str2;
        }
        com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) s0Var.p(com.tencent.mm.R.id.f98);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.ffb);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.f487295o70);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.e_l);
        if (z17) {
            if (finderLiveOnliveWidget != null) {
                finderLiveOnliveWidget.setVisibility(8);
            }
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert", "refreshLiveStatus", "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert", "refreshLiveStatus", "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (finderLiveOnliveWidget != null) {
                finderLiveOnliveWidget.setVisibility(0);
            }
            if (p17 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert", "refreshLiveStatus", "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert", "refreshLiveStatus", "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        s(bVar, s0Var, z17);
        v(bVar, z17, str, imageView, textView, false);
    }

    public final void v(wp2.b bVar, boolean z17, java.lang.String str, android.widget.ImageView imageView, android.widget.TextView textView, boolean z18) {
        java.lang.String str2;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        if (imageView == null) {
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = bVar.getFeedObject().getFeedObject();
        if (!z17) {
            i95.m c17 = i95.n0.c(c61.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.zb.g7((c61.zb) c17, imageView, str, 0, 4, null);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        r45.nw1 liveInfo = feedObject.getLiveInfo();
        if (!((liveInfo == null || (co1Var2 = (r45.co1) liveInfo.getCustom(43)) == null || co1Var2.getInteger(0) != 1) ? false : true)) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), this.f122044e ? g1Var.h(mn2.f1.f329968v) : g1Var.h(mn2.f1.f329953d));
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.v2 v2Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.v2(z18, feedObject, str, bVar);
            b17.getClass();
            b17.f447876g = v2Var;
            b17.f447875f = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w2(z18, feedObject, str, bVar);
            b17.c(imageView);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        i95.m c18 = i95.n0.c(vd2.i5.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        vd2.i5.l7((vd2.i5) c18, str, imageView, null, 4, null);
        if (textView != null) {
            r45.nw1 liveInfo2 = feedObject.getLiveInfo();
            if (liveInfo2 == null || (co1Var = (r45.co1) liveInfo2.getCustom(43)) == null || (str2 = co1Var.getString(1)) == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    public final void w(android.widget.TextView textView, java.lang.String str, int i17) {
        sp2.k kVar = this.f122047h;
        java.lang.Integer valueOf = kVar != null ? java.lang.Integer.valueOf(kVar.e()) : null;
        com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "renderWatchCountHistoryTv: bottomExtraInfo=" + valueOf);
        boolean z17 = true;
        if (valueOf != null && valueOf.intValue() == 1) {
            textView.setVisibility(8);
            return;
        }
        if ((str == null || str.length() == 0) && i17 > 0) {
            str = com.tencent.mm.plugin.finder.assist.w2.f(i17);
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }
}
