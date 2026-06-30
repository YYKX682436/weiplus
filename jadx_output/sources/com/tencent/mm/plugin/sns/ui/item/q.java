package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class q extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f169403q = "FinderLiveTimeLineItem";

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f169404r = kotlinx.coroutines.z0.b();

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f169405s;

    public static final /* synthetic */ java.lang.String F(com.tencent.mm.plugin.sns.ui.item.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        java.lang.String str = qVar.f169403q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return str;
    }

    public static final boolean J(com.tencent.mm.plugin.sns.ui.item.n nVar, android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag$checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            return false;
        }
        android.widget.ImageView c17 = nVar.c();
        boolean b17 = kotlin.jvm.internal.o.b(c17 != null ? c17.getTag(com.tencent.mm.R.id.n8h) : null, str + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return b17;
    }

    public static final void K(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag$setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (imageView != null) {
            imageView.setTag(com.tencent.mm.R.id.n8h, str + i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    public static final void L(com.tencent.mm.plugin.sns.ui.item.n nVar, com.tencent.mm.plugin.sns.ui.item.n nVar2, r45.nw1 nw1Var, ed4.j jVar, int i17) {
        java.lang.String str;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag$showEndTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        android.view.View f17 = nVar2.f();
        if (f17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f17, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View e17 = nVar2.e();
        if (e17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.Gb((s40.w0) c17, nVar2.e(), true, i17, null, 8, null);
        if ((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.getCustom(43)) == null || co1Var2.getInteger(0) != 1) ? false : true) {
            if (!J(nVar, nVar2.c(), jVar.a(), 1)) {
                i95.m c18 = i95.n0.c(vd2.i5.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                vd2.i5.Fb((vd2.i5) c18, jVar.b(), nVar2.c(), jVar.a(), null, 8, null);
                K(nVar2.c(), jVar.a(), 1);
            }
            android.widget.TextView d17 = nVar2.d();
            if (d17 != null) {
                if (nw1Var == null || (co1Var = (r45.co1) nw1Var.getCustom(43)) == null || (str = co1Var.getString(1)) == null) {
                    str = "";
                }
                d17.setText(str);
            }
            android.widget.TextView d18 = nVar2.d();
            if (d18 != null) {
                d18.setVisibility(0);
            }
        } else {
            if (!J(nVar, nVar2.c(), jVar.a(), 0)) {
                i95.m c19 = i95.n0.c(vd2.i5.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                vd2.i5.Ac((vd2.i5) c19, jVar.b(), nVar2.c(), jVar.a(), null, 8, null);
                K(nVar2.c(), jVar.a(), 0);
            }
            android.widget.TextView d19 = nVar2.d();
            if (d19 != null) {
                d19.setVisibility(8);
            }
        }
        android.widget.ImageView c27 = nVar2.c();
        if (c27 != null) {
            c27.setVisibility(0);
        }
        android.view.View h17 = nVar2.h();
        if (h17 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(h17, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$showEndTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    public static final void M(r45.g92 g92Var, com.tencent.mm.plugin.sns.ui.item.n nVar, com.tencent.mm.plugin.sns.ui.item.n nVar2, r45.nw1 nw1Var, ed4.j jVar, int i17, r45.l71 l71Var) {
        java.lang.String str;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag$showLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        android.view.View f17 = nVar2.f();
        if (f17 != null) {
            f17.setContentDescription(nVar2.a());
        }
        if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk(nw1Var, "timelineold") && i17 == 4) {
            android.view.View f18 = nVar2.f();
            if (f18 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f18, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f18, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View e17 = nVar2.e();
            if (e17 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i95.m c17 = i95.n0.c(s40.w0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            s40.w0.Gb((s40.w0) c17, nVar2.e(), false, i17, null, 8, null);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).cj(l71Var != null ? (r45.nw1) l71Var.getCustom(1) : null, 37);
        } else {
            android.view.View f19 = nVar2.f();
            if (f19 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(f19, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(f19, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View e18 = nVar2.e();
            if (e18 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(e18, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(e18, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ik(nVar2.f(), false, i17, g92Var);
        }
        if ((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.getCustom(43)) == null || co1Var2.getInteger(0) != 1) ? false : true) {
            if (!J(nVar, nVar2.c(), jVar.a(), 1)) {
                i95.m c18 = i95.n0.c(vd2.i5.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                vd2.i5.Fb((vd2.i5) c18, jVar.b(), nVar2.c(), jVar.a(), null, 8, null);
                K(nVar2.c(), jVar.a(), 1);
            }
            android.widget.TextView d17 = nVar2.d();
            if (d17 != null) {
                if (nw1Var == null || (co1Var = (r45.co1) nw1Var.getCustom(43)) == null || (str = co1Var.getString(1)) == null) {
                    str = "";
                }
                d17.setText(str);
            }
            android.widget.TextView d18 = nVar2.d();
            if (d18 != null) {
                d18.setVisibility(0);
            }
        } else {
            if (!J(nVar, nVar2.c(), jVar.a(), 0)) {
                i95.m c19 = i95.n0.c(vd2.i5.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                vd2.i5.Ac((vd2.i5) c19, jVar.b(), nVar2.c(), jVar.a(), null, 8, null);
                K(nVar2.c(), jVar.a(), 0);
            }
            android.widget.TextView d19 = nVar2.d();
            if (d19 != null) {
                d19.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$showLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    public final boolean G(java.lang.String str, android.view.View view, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            return false;
        }
        boolean Zi = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(str, view.findViewById(com.tencent.mm.R.id.f4x), view.findViewById(com.tencent.mm.R.id.f7y), j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return Zi;
    }

    public final boolean H(r45.g92 shareObject, r45.nw1 nw1Var) {
        boolean Ni;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        if (nw1Var != null) {
            Ni = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(shareObject.getString(1), nw1Var);
        } else {
            Ni = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ni(shareObject);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return Ni;
    }

    public final boolean I(com.tencent.mm.plugin.sns.ui.item.n holder, com.tencent.mm.protocal.protobuf.TimeLineObject tlObj, r45.g92 shareObject, int i17, r45.nw1 nw1Var, r45.l71 l71Var) {
        r45.lw1 lw1Var;
        boolean z17;
        java.util.LinkedList list;
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(tlObj, "tlObj");
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag$getCoverUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        r45.d84 d84Var = l71Var != null ? (r45.d84) l71Var.getCustom(9) : null;
        if (l71Var == null || (list = l71Var.getList(15)) == null) {
            lw1Var = null;
        } else {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.lw1) obj).getInteger(5) == 2) {
                    break;
                }
            }
            lw1Var = (r45.lw1) obj;
        }
        ed4.j jVar = new ed4.j();
        java.lang.String string = lw1Var != null ? lw1Var.getString(0) : null;
        if (string == null || string.length() == 0) {
            java.lang.String string2 = d84Var != null ? d84Var.getString(0) : null;
            if (string2 == null || string2.length() == 0) {
                java.lang.String string3 = shareObject.getString(5);
                if (string3 == null || string3.length() == 0) {
                    java.lang.String string4 = shareObject.getString(11);
                    if (!(string4 == null || string4.length() == 0)) {
                        java.lang.String string5 = shareObject.getString(11);
                        jVar.d(string5 != null ? string5 : "");
                        jVar.c(jVar.b());
                    }
                } else {
                    java.lang.String string6 = shareObject.getString(5);
                    if (string6 == null) {
                        string6 = "";
                    }
                    jVar.d(string6);
                    java.lang.String input = jVar.b();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag$getCoverUrl$removeParam", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
                    kotlin.jvm.internal.o.f(compile, "compile(...)");
                    kotlin.jvm.internal.o.g(input, "input");
                    java.lang.String replaceAll = compile.matcher(input).replaceAll("");
                    kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$getCoverUrl$removeParam", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                    jVar.c(replaceAll);
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(d84Var != null ? d84Var.getString(0) : null);
                java.lang.String string7 = d84Var != null ? d84Var.getString(1) : null;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string7 == null) {
                    string7 = "";
                }
                sb6.append(string7);
                jVar.d(sb6.toString());
                java.lang.String string8 = d84Var != null ? d84Var.getString(0) : null;
                jVar.c(string8 != null ? string8 : "");
            }
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(lw1Var != null ? lw1Var.getString(0) : null);
            java.lang.String string9 = lw1Var != null ? lw1Var.getString(1) : null;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string9 == null) {
                string9 = "";
            }
            sb7.append(string9);
            jVar.d(sb7.toString());
            java.lang.String string10 = lw1Var != null ? lw1Var.getString(0) : null;
            jVar.c(string10 != null ? string10 : "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$getCoverUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag$isChargeLive", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (nw1Var != null) {
            z17 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(nw1Var);
        } else {
            int i18 = qs5.g.f366432a;
            int integer = shareObject.getInteger(22);
            z17 = integer == 2 || integer == 8 || integer == 16;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$isChargeLive", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        boolean bj6 = nw1Var != null ? ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(shareObject.getString(1), nw1Var) : ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ni(shareObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        boolean Ri = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ri(nw1Var);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("updateLiveTag live:");
        sb8.append(shareObject.getString(0));
        sb8.append('(');
        sb8.append(shareObject.getString(3));
        sb8.append("),liveStatus:");
        sb8.append(i17);
        sb8.append('(');
        sb8.append(nw1Var != null ? java.lang.Integer.valueOf(nw1Var.getInteger(2)) : null);
        sb8.append("),chargFlag:");
        sb8.append(shareObject.getInteger(22));
        sb8.append(",isChargeLive:");
        sb8.append(z17);
        sb8.append(",isLiveReplay:");
        sb8.append(bj6);
        sb8.append(",producingReplay:");
        sb8.append(Ri);
        sb8.append(",liveInfo null:");
        sb8.append(nw1Var == null);
        sb8.append(",purchaseInfo null:");
        sb8.append((nw1Var != null ? (r45.o52) nw1Var.getCustom(28) : null) == null);
        com.tencent.mars.xlog.Log.i(this.f169403q, sb8.toString());
        if (z17) {
            M(shareObject, holder, holder, nw1Var, jVar, 2, l71Var);
        } else if (bj6) {
            M(shareObject, holder, holder, nw1Var, jVar, 4, l71Var);
        } else if (Ri) {
            L(holder, holder, nw1Var, jVar, 3);
        } else if (i17 == 1) {
            M(shareObject, holder, holder, nw1Var, jVar, 0, l71Var);
        } else {
            L(holder, holder, nw1Var, jVar, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        kotlin.jvm.internal.o.e(baseViewHolder, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem.FinderLiveViewHolder");
        com.tencent.mm.plugin.sns.ui.item.n nVar = (com.tencent.mm.plugin.sns.ui.item.n) baseViewHolder;
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) == null || com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).getParent() == null) {
            android.view.View findViewById = nVar.f169272h.findViewById(com.tencent.mm.R.id.n8j);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            nVar.E0 = findViewById;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            nVar.D0 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        } else {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.crm);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            boolean z17 = nVar.D0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            if (!z17) {
                android.view.View inflate = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
                nVar.E0 = inflate;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
                nVar.D0 = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            }
        }
        android.view.View g17 = nVar.g();
        android.widget.ImageView imageView = g17 != null ? (android.widget.ImageView) g17.findViewById(com.tencent.mm.R.id.n8n) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCoverIv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.G0 = imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCoverIv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g18 = nVar.g();
        android.view.View findViewById2 = g18 != null ? g18.findViewById(com.tencent.mm.R.id.f4x) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.H0 = findViewById2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g19 = nVar.g();
        android.view.View findViewById3 = g19 != null ? g19.findViewById(com.tencent.mm.R.id.f7y) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderLiveFeedTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.M0 = findViewById3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderLiveFeedTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g27 = nVar.g();
        android.widget.ImageView imageView2 = g27 != null ? (android.widget.ImageView) g27.findViewById(com.tencent.mm.R.id.hmm) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActivityInfoIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.I0 = imageView2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActivityInfoIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g28 = nVar.g();
        android.widget.TextView textView = g28 != null ? (android.widget.TextView) g28.findViewById(com.tencent.mm.R.id.e_l) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderBansTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.J0 = textView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderBansTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g29 = nVar.g();
        android.widget.TextView textView2 = g29 != null ? (android.widget.TextView) g29.findViewById(com.tencent.mm.R.id.opa) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReasonTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.K0 = textView2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReasonTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g37 = nVar.g();
        android.view.View findViewById4 = g37 != null ? g37.findViewById(com.tencent.mm.R.id.fvb) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderOlympicView", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.L0 = findViewById4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderOlympicView", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.item.n nVar;
        android.widget.ImageView b17;
        r45.g92 g92Var;
        java.lang.String string;
        r45.g92 g92Var2;
        android.view.View g17;
        int i19;
        java.lang.Long j17;
        r45.g92 g92Var3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if ((timeLineObject != null ? timeLineObject.ContentObj : null) != null && timeLineObject.ContentObj.f369848s != null) {
            kotlin.jvm.internal.o.e(baseViewHolder, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem.FinderLiveViewHolder");
            com.tencent.mm.plugin.sns.ui.item.n nVar2 = (com.tencent.mm.plugin.sns.ui.item.n) baseViewHolder;
            r45.g92 g92Var4 = timeLineObject.ContentObj.f369848s;
            java.lang.String valueOf = java.lang.String.valueOf(g92Var4.getString(3));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNickName", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            nVar2.F0 = valueOf;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNickName", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            r45.a90 a90Var = timeLineObject.ContentObj;
            if (a90Var == null || (g92Var3 = a90Var.f369848s) == null || (str = g92Var3.getString(0)) == null) {
                str = "0";
            }
            long V = com.tencent.mm.sdk.platformtools.t8.V(str, 0L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLiveId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            nVar2.N0 = V;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLiveId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveStatus", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveStatus", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            android.view.View g18 = nVar2.g();
            android.util.Pair j18 = m21.y.j(g18 != null ? g18.getContext() : null);
            android.view.View g19 = nVar2.g();
            android.view.ViewGroup.LayoutParams layoutParams = g19 != null ? g19.getLayoutParams() : null;
            if (layoutParams != null) {
                java.lang.Object first = j18.first;
                kotlin.jvm.internal.o.f(first, "first");
                layoutParams.width = ((java.lang.Number) first).intValue();
            }
            if (layoutParams != null) {
                java.lang.Object second = j18.second;
                kotlin.jvm.internal.o.f(second, "second");
                layoutParams.height = ((java.lang.Number) second).intValue();
            }
            android.view.View g27 = nVar2.g();
            if (g27 != null) {
                g27.setLayoutParams(layoutParams);
            }
            android.view.View g28 = nVar2.g();
            if (g28 != null) {
                g28.requestLayout();
            }
            android.widget.ImageView b18 = nVar2.b();
            if (b18 != null) {
                b18.setVisibility(8);
            }
            android.widget.TextView j19 = nVar2.j();
            if (j19 != null) {
                j19.setVisibility(8);
            }
            java.lang.String Jj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Jj(nVar2.i());
            if (!(Jj.length() > 0)) {
                Jj = null;
            }
            if (Jj != null) {
                g92Var4.set(5, Jj);
            }
            I(nVar2, timeLineObject, g92Var4, g92Var4.getInteger(13), (r45.nw1) g92Var4.getCustom(24), null);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = nsVar != null ? nsVar.f170025a : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLiveStatus", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            r45.g92 g92Var5 = timeLineObject.ContentObj.f369848s;
            h0Var.f310123d = g92Var5;
            java.lang.String string2 = g92Var5.getString(0);
            long longValue = (string2 == null || (j17 = r26.h0.j(string2)) == null) ? 0L : j17.longValue();
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            f0Var.f310116d = ((r45.g92) h0Var.f310123d).getInteger(13);
            ed4.i iVar = new ed4.i(nVar2, this, h0Var, snsInfo, longValue, timeLineObject, f0Var);
            boolean z17 = ((r45.nw1) ((r45.g92) h0Var.f310123d).getCustom(24)) == null;
            i95.m c17 = i95.n0.c(s40.w0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            s40.w0 w0Var = (s40.w0) c17;
            qs5.d dVar = qs5.d.f366426e;
            s40.w0.u9(w0Var, longValue, z17, null, iVar, 2, null, null, null, 224, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLiveStatus", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            java.lang.String string3 = g92Var4.getString(28);
            if ((string3 == null || string3.length() == 0) || g92Var4.getInteger(13) == 2) {
                android.view.View h17 = nVar2.h();
                if (h17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.ImageView c18 = nVar2.c();
                if (c18 != null) {
                    c18.setVisibility(0);
                }
            } else {
                android.view.View h18 = nVar2.h();
                if (h18 != null) {
                    android.view.View findViewById = h18.findViewById(com.tencent.mm.R.id.fv8);
                    kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                    android.view.View findViewById2 = h18.findViewById(com.tencent.mm.R.id.fv9);
                    kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                    ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).tk((android.widget.ImageView) findViewById, qs5.y.f366475d, com.tencent.mm.R.drawable.c5e);
                    ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).tk((android.widget.ImageView) findViewById2, qs5.y.f366476e, com.tencent.mm.R.drawable.c5f);
                    android.view.View findViewById3 = h18.findViewById(com.tencent.mm.R.id.fva);
                    kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                    android.widget.TextView textView = (android.widget.TextView) findViewById3;
                    textView.setTextSize(1, 14.0f);
                    android.view.View findViewById4 = h18.findViewById(com.tencent.mm.R.id.fv_);
                    kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
                    android.widget.TextView textView2 = (android.widget.TextView) findViewById4;
                    textView2.setTextSize(1, 14.0f);
                    android.view.View findViewById5 = h18.findViewById(com.tencent.mm.R.id.fvc);
                    kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
                    android.widget.TextView textView3 = (android.widget.TextView) findViewById5;
                    textView3.setTextSize(1, 15.0f);
                    com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                    com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                    java.lang.String string4 = g92Var4.getString(29);
                    if (string4 == null || string4.length() == 0) {
                        i19 = 8;
                        textView2.setVisibility(8);
                    } else {
                        i19 = 8;
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        java.lang.String string5 = g92Var4.getString(29);
                        ((ke0.e) xVar).getClass();
                        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string5));
                        textView2.setVisibility(0);
                    }
                    java.lang.String string6 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.esj, g92Var4.getString(28));
                    kotlin.jvm.internal.o.f(string6, "getString(...)");
                    int intValue = ((java.lang.Number) j18.first).intValue() - (i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12) * 2);
                    java.lang.String t17 = r26.i0.t(string6, "\n", "", false);
                    if (new android.text.StaticLayout(t17, 0, t17.length(), textView.getPaint(), intValue, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
                        string6 = t17;
                    }
                    textView.setText(string6);
                } else {
                    i19 = 8;
                }
                android.view.View h19 = nVar2.h();
                if (h19 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(h19, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    h19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(h19, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.ImageView c19 = nVar2.c();
                if (c19 != null) {
                    c19.setVisibility(i19);
                }
            }
            android.view.View g29 = nVar2.g();
            if (g29 != null) {
                g29.setTag(timeLineObject);
            }
            android.view.View g37 = nVar2.g();
            if (g37 != null) {
                kotlin.jvm.internal.o.d(bsVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnClickListener", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                android.view.View.OnClickListener finderLiveListener = bsVar.f168043i.f169658f;
                kotlin.jvm.internal.o.f(finderLiveListener, "finderLiveListener");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnClickListener", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                g37.setOnClickListener(finderLiveListener);
            }
            if (H(g92Var4, (r45.nw1) g92Var4.getCustom(24)) || (g17 = nVar2.g()) == null) {
                nVar = nVar2;
            } else {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(g17);
                if (G(g92Var4.getString(1), g17, nVar2.i())) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                    return;
                }
                p52.h.f352016a.e(java.lang.String.valueOf(g92Var4.getString(0)), null);
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(g17, "live_room_card");
                nVar = nVar2;
                aVar.Vj(g17, 40, new com.tencent.mm.plugin.sns.ui.item.o(g92Var4, this, g17, nVar));
            }
            if (g92Var4.getInteger(13) == 1) {
                r45.a90 a90Var2 = timeLineObject.ContentObj;
                long Z = pm0.v.Z((a90Var2 == null || (g92Var2 = a90Var2.f369848s) == null) ? null : g92Var2.getString(2));
                r45.a90 a90Var3 = timeLineObject.ContentObj;
                java.lang.String str2 = (a90Var3 == null || (g92Var = a90Var3.f369848s) == null || (string = g92Var.getString(12)) == null) ? "" : string;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindActivityIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                com.tencent.mars.xlog.Log.i(this.f169403q, "#bindActivityIcon feedId=".concat(pm0.v.u(Z)));
                kotlinx.coroutines.r2 r2Var = this.f169405s;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ik() && (b17 = nVar.b()) != null) {
                    this.f169405s = kotlinx.coroutines.l.d(this.f169404r, null, null, new ed4.h(b17, Z, str2, null), 3, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindActivityIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            }
            android.view.View convertView = nVar.f169272h;
            kotlin.jvm.internal.o.f(convertView, "convertView");
            ym5.a1.h(convertView, new com.tencent.mm.plugin.sns.ui.item.p(g92Var4, this, nVar));
        }
        g(nsVar, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return "FinderLiveTimeLineItem";
    }
}
