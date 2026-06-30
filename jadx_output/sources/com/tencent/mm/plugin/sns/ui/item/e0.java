package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class e0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.csp);
            android.view.ViewStub viewStub2 = (android.view.ViewStub) baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.f485318ha2);
            if (!baseViewHolder.f169263c0 && viewStub2 != null) {
                baseViewHolder.f169265d0 = viewStub2.inflate();
                baseViewHolder.f169263c0 = true;
            }
        } else {
            baseViewHolder.f169265d0 = baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.jdl);
            baseViewHolder.f169263c0 = true;
        }
        android.view.View view = baseViewHolder.f169265d0;
        baseViewHolder.f169298u = view;
        view.findViewById(com.tencent.mm.R.id.nh7).setOnTouchListener(this.f169251h.K);
        baseViewHolder.f169300v = (com.tencent.mm.plugin.sns.ui.TagImageView) baseViewHolder.f169298u.findViewById(com.tencent.mm.R.id.h9t);
        baseViewHolder.f169302w = (android.widget.ImageView) baseViewHolder.f169298u.findViewById(com.tencent.mm.R.id.nh7);
        baseViewHolder.f169304x = (android.widget.TextView) baseViewHolder.f169298u.findViewById(com.tencent.mm.R.id.m4o);
        android.widget.TextView textView = (android.widget.TextView) baseViewHolder.f169298u.findViewById(com.tencent.mm.R.id.odj);
        baseViewHolder.f169306y = textView;
        textView.setTextColor(this.f169249f.getResources().getColor(com.tencent.mm.R.color.f479515a62));
        baseViewHolder.f169306y.setMaxLines(1);
        ca4.z0.A0(baseViewHolder.f169300v, this.f169249f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
        java.lang.String str = nsVar.f170036h;
        if (timeLineObject.ContentObj.f369840h.isEmpty()) {
            android.view.View view = baseViewHolder.f169298u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/MusicTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/MusicTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            baseViewHolder.f169300v.setPosition(i17);
            android.view.View view2 = baseViewHolder.f169298u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/MusicTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/item/MusicTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.jj4 jj4Var = (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            com.tencent.mm.plugin.sns.ui.TagImageView tagImageView = baseViewHolder.f169300v;
            int hashCode = this.f169249f.hashCode();
            com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
            d17.f195313b = timeLineObject.CreateTime;
            hj6.c0(jj4Var, tagImageView, com.tencent.mm.R.raw.music_default, hashCode, d17);
            baseViewHolder.f169302w.setPressed(false);
            if (com.tencent.mm.plugin.sns.ui.wm.b(timeLineObject)) {
                baseViewHolder.f169302w.setImageResource(com.tencent.mm.R.drawable.as6);
            } else {
                baseViewHolder.f169302w.setImageResource(com.tencent.mm.R.drawable.as8);
            }
            baseViewHolder.f169300v.setTag(new com.tencent.mm.plugin.sns.ui.i2(timeLineObject, str));
            baseViewHolder.f169300v.setOnClickListener(bsVar.f168043i.f169671s);
            baseViewHolder.f169298u.setTag(new com.tencent.mm.plugin.sns.ui.i2(timeLineObject, str, nsVar.f170025a.getTypeFlag()));
            rl5.r d18 = bsVar.d();
            android.view.View view3 = baseViewHolder.f169298u;
            com.tencent.mm.plugin.sns.ui.listener.i iVar = bsVar.f168039e;
            d18.j(view3, iVar.A, iVar.f169809l);
            baseViewHolder.f169298u.setOnClickListener(com.tencent.mm.plugin.sns.ui.kw.D);
            java.lang.String str2 = jj4Var.f377857f;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                baseViewHolder.f169304x.setVisibility(4);
            } else {
                baseViewHolder.f169304x.setVisibility(0);
                baseViewHolder.f169304x.setText(str2);
            }
            java.lang.String str3 = jj4Var.f377864o;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                baseViewHolder.f169306y.setVisibility(8);
            } else {
                baseViewHolder.f169306y.setVisibility(0);
                baseViewHolder.f169306y.setText(new android.text.SpannableString(str3), android.widget.TextView.BufferType.SPANNABLE);
            }
            baseViewHolder.f169258a = this.f169249f.getString(com.tencent.mm.R.string.jcb) + jj4Var.f377864o + "," + jj4Var.f377857f;
        }
        g(nsVar, 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
        return "MusicTimeLineItem";
    }
}
