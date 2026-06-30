package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class b1 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f169322q = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f169323r = false;

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.a1 a1Var = (com.tencent.mm.plugin.sns.ui.item.a1) baseViewHolder;
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) == null || com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).getParent() == null) {
            a1Var.E0 = (android.widget.LinearLayout) baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.ncw);
            a1Var.D0 = true;
        } else {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.f489531cv1);
            if (!a1Var.D0) {
                a1Var.E0 = (android.widget.LinearLayout) com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                a1Var.D0 = true;
            }
        }
        a1Var.F0 = (android.widget.TextView) a1Var.E0.findViewById(com.tencent.mm.R.id.f487062nd3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        int i19;
        r45.qb6 qb6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        final com.tencent.mm.plugin.sns.ui.item.a1 a1Var = (com.tencent.mm.plugin.sns.ui.item.a1) baseViewHolder;
        if (nsVar.f170026a0 == null || (qb6Var = nsVar.f170028b0) == null || com.tencent.mm.sdk.platformtools.t8.L0(qb6Var.f383810d)) {
            i19 = 1;
        } else {
            int size = nsVar.f170028b0.f383810d.size();
            ed4.c0 c0Var = ed4.c0.f251289a;
            final java.lang.String str = "";
            if (size == 1) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(nsVar.f170028b0.f383811e)) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(((java.lang.Long) nsVar.f170028b0.f383810d.get(0)).longValue());
                    if (W0 != null) {
                        str = c0Var.a(W0.getTimeLine().ContentObj.f369837e, nsVar.f170028b0.f383810d.size());
                    }
                } else {
                    str = nsVar.f170028b0.f383811e;
                }
            } else if (nsVar.f170028b0.f383810d.size() > 1) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(nsVar.f170028b0.f383811e)) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo W02 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(((java.lang.Long) nsVar.f170028b0.f383810d.get(0)).longValue());
                    if (W02 != null) {
                        str = c0Var.a(W02.getTimeLine().ContentObj.f369837e, nsVar.f170028b0.f383810d.size());
                    }
                } else {
                    str = nsVar.f170028b0.f383811e;
                    this.f169322q = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.jay, java.lang.Integer.valueOf(nsVar.f170028b0.f383810d.size()));
                    this.f169323r = true;
                }
            }
            if (!this.f169323r) {
                android.widget.TextView textView = a1Var.F0;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = a1Var.F0.getContext();
                float textSize = a1Var.F0.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
            }
            if (this.f169323r) {
                a1Var.F0.post(new java.lang.Runnable() { // from class: ed4.b0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.sns.ui.item.b1 b1Var = com.tencent.mm.plugin.sns.ui.item.b1.this;
                        b1Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$fillItem$0", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
                        com.tencent.mm.plugin.sns.ui.item.a1 a1Var2 = a1Var;
                        float textSize2 = a1Var2.F0.getTextSize();
                        int width = a1Var2.E0.getWidth() - (i65.a.h(a1Var2.F0.getContext(), com.tencent.mm.R.dimen.f479688cn) * 2);
                        int i27 = (int) (width / textSize2);
                        java.lang.String str2 = str;
                        int length = str2.length();
                        int length2 = b1Var.f169322q.length();
                        int i28 = i27 - length2;
                        int min = java.lang.Math.min(i28, length);
                        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLineItem", "finalDesc = " + str2 + ", suffix = " + b1Var.f169322q);
                        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLineItem", "textSize = " + textSize2 + ", width = " + width + ", textNumber = " + i27 + ", descLen = " + length + ", suffixLen = " + length2 + ", maxDescLen = " + i28);
                        if (min > 0) {
                            java.lang.String str3 = str2.substring(0, min) + b1Var.f169322q;
                            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                            android.content.Context context2 = a1Var2.F0.getContext();
                            float textSize3 = a1Var2.F0.getTextSize();
                            ((ke0.e) xVar2).getClass();
                            a1Var2.F0.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str3, textSize3));
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$fillItem$0", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
                    }
                });
            }
            a1Var.f169280l.setVisibility(8);
            a1Var.L.setVisibility(8);
            a1Var.H.setVisibility(8);
            a1Var.f169257J.setVisibility(8);
            android.view.View view = a1Var.K;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/WsFoldTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/WsFoldTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.py pyVar = new com.tencent.mm.plugin.sns.ui.py();
            pyVar.f170285a = timeLineObject.UserName;
            pyVar.f170287c = ((java.lang.Long) nsVar.f170028b0.f383810d.get(0)).longValue();
            java.util.LinkedList linkedList = nsVar.f170028b0.f383810d;
            pyVar.f170288d = ((java.lang.Long) linkedList.get(linkedList.size() - 1)).longValue();
            pyVar.f170286b = nsVar.f170026a0.field_groupId;
            ((java.util.ArrayList) pyVar.f170289e).addAll(nsVar.f170028b0.f383810d);
            a1Var.E0.setTag(pyVar);
            a1Var.E0.setOnClickListener(bsVar.f168043i.f169661i);
            nsVar.U = null;
            nsVar.V = null;
            nsVar.F = false;
            nsVar.D = null;
            nsVar.M = false;
            i19 = 1;
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.W(nsVar.f170038j, true, i17);
        }
        g(nsVar, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        return "WsFoldTimeLineItem";
    }
}
