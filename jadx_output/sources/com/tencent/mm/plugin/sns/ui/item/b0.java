package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class b0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
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
        textView.setMaxLines(2);
        ca4.z0.A0(baseViewHolder.f169300v, this.f169249f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        if (timeLineObject.ContentObj.f369846q != null) {
            baseViewHolder.f169300v.setPosition(i17);
            android.view.View view = baseViewHolder.f169298u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.jj4 jj4Var = new r45.jj4();
            java.lang.String str = timeLineObject.ContentObj.f369846q.f373343h;
            jj4Var.f377858g = str;
            jj4Var.f377860i = str;
            jj4Var.f377856e = 2;
            jj4Var.f377862m = 1;
            r45.lj4 lj4Var = new r45.lj4();
            jj4Var.f377865p = lj4Var;
            jj4Var.f377859h = 1;
            r45.ee eeVar = timeLineObject.ContentObj.f369846q;
            lj4Var.f379520d = eeVar.f373345m;
            lj4Var.f379521e = eeVar.f373346n;
            jj4Var.f377855d = timeLineObject.Id;
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            java.lang.String snsId = nsVar.f170025a.getSnsId();
            com.tencent.mm.plugin.sns.ui.TagImageView tagImageView = baseViewHolder.f169300v;
            int hashCode = this.f169249f.hashCode();
            com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
            d17.f195313b = timeLineObject.CreateTime;
            hj6.Z(snsId, jj4Var, tagImageView, hashCode, d17);
            baseViewHolder.f169302w.setPressed(false);
            android.widget.ImageView imageView = baseViewHolder.f169302w;
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_outlined_video_call, -1));
            baseViewHolder.f169298u.setTag(new com.tencent.mm.plugin.sns.ui.y5(timeLineObject, baseViewHolder.f169300v, nsVar.f170036h));
            baseViewHolder.f169304x.setVisibility(8);
            rl5.r d18 = bsVar.d();
            android.view.View view2 = baseViewHolder.f169298u;
            com.tencent.mm.plugin.sns.ui.listener.i iVar = bsVar.f168039e;
            d18.j(view2, iVar.F, iVar.f169809l);
            baseViewHolder.f169298u.setOnClickListener(bsVar.f168043i.f169656d);
            java.lang.String str2 = timeLineObject.ContentObj.f369846q.f373342g;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                baseViewHolder.f169306y.setVisibility(8);
            } else {
                baseViewHolder.f169306y.setVisibility(0);
                baseViewHolder.f169306y.setText(new android.text.SpannableString(str2), android.widget.TextView.BufferType.SPANNABLE);
            }
        } else {
            android.view.View view3 = baseViewHolder.f169298u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        g(nsVar, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        return "MPVideoTimeLineItem";
    }
}
