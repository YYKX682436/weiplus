package tc4;

/* loaded from: classes4.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.n0 f417311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(tc4.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417311d = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
        tc4.d0 d0Var = new tc4.d0(this.f417311d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
        return d0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
        java.lang.Object invokeSuspend = ((tc4.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xc4.p n17;
        java.lang.String string;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        tc4.n0 n0Var = this.f417311d;
        zc4.b data = n0Var.getData();
        if (data == null || (n17 = data.n()) == null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
            return bool;
        }
        r45.a90 a90Var = n17.h1().ContentObj;
        r45.kv2 kv2Var = a90Var != null ? a90Var.f369844o : null;
        if (kv2Var == null) {
            n0Var.w("MicroMsg.Improve.FinderMediaTimelineItem", "loadCustomItemInfo error");
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
            return bool2;
        }
        int i17 = tc4.n0.N1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getListenerStatusMap$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        java.util.HashMap hashMap = n0Var.C1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getListenerStatusMap$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        if (hashMap.get(n17.a1()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$viewExposeReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewExposeReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            android.view.View view = n0Var.f417413z1;
            if (view != null) {
                ym5.a1.h(view, new tc4.m0(n0Var, kv2Var, n17));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewExposeReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$viewExposeReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            if (!android.text.TextUtils.isEmpty(n17.a1())) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getListenerStatusMap$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getListenerStatusMap$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                hashMap.put(n17.a1(), java.lang.Boolean.TRUE);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(kv2Var.getList(7))) {
            r45.iv2 iv2Var = (r45.iv2) kv2Var.getList(7).get(0);
            if (iv2Var != null) {
                android.util.Pair k17 = m21.y.k((int) iv2Var.getFloat(3), (int) iv2Var.getFloat(4), n0Var.getContext(), false);
                if ((4 & kv2Var.getInteger(25)) > 0) {
                    android.view.View U = tc4.n0.U(n0Var);
                    if (U != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(U, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        U.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(U, "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    android.view.View U2 = tc4.n0.U(n0Var);
                    if (U2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(U2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        U2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(U2, "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem$loadCustomItemInfo$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                java.lang.Integer num = (java.lang.Integer) k17.first;
                java.lang.Integer num2 = (java.lang.Integer) k17.second;
                android.view.View T = tc4.n0.T(n0Var);
                android.view.ViewGroup.LayoutParams layoutParams = T != null ? T.getLayoutParams() : null;
                if (layoutParams != null) {
                    kotlin.jvm.internal.o.d(num);
                    layoutParams.width = num.intValue();
                }
                android.view.View T2 = tc4.n0.T(n0Var);
                android.view.ViewGroup.LayoutParams layoutParams2 = T2 != null ? T2.getLayoutParams() : null;
                if (layoutParams2 != null) {
                    kotlin.jvm.internal.o.d(num2);
                    layoutParams2.height = num2.intValue();
                }
                android.view.View T3 = tc4.n0.T(n0Var);
                if (T3 != null) {
                    T3.requestLayout();
                }
                java.lang.String r17 = i65.a.r(n0Var.getContext(), com.tencent.mm.R.string.f493208ja5);
                kotlin.jvm.internal.o.f(r17, "getString(...)");
                java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{ca4.z0.z(kv2Var)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                android.view.View T4 = tc4.n0.T(n0Var);
                if (T4 != null) {
                    T4.setContentDescription(format);
                }
                java.lang.String a17 = n17.a1();
                java.lang.String string2 = kv2Var.getString(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startLoad", "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil");
                if (string2 == null) {
                    string2 = "";
                }
                ta4.u0.p(a17, string2, -1, "timeline", false, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startLoad", "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil");
                tc4.c0 c0Var = new tc4.c0(kv2Var);
                if (iv2Var.getString(8) != null) {
                    java.lang.String string3 = iv2Var.getString(8);
                    kotlin.jvm.internal.o.d(string3);
                    if (!(string3.length() == 0)) {
                        string = iv2Var.getString(8);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        zy2.v8.a(ya2.l.f460502a, string, tc4.n0.X(n0Var), null, new java.lang.ref.WeakReference(c0Var), 4, null);
                    }
                }
                string = iv2Var.getString(2);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                zy2.v8.a(ya2.l.f460502a, string, tc4.n0.X(n0Var), null, new java.lang.ref.WeakReference(c0Var), 4, null);
            }
        }
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
        return bool3;
    }
}
