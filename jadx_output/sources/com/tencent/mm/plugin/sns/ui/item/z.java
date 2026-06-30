package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class z extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        baseViewHolder.L.setImageResource(com.tencent.mm.R.drawable.alj);
        com.tencent.mm.plugin.sns.ui.AsyncTextView asyncTextView = baseViewHolder.f169276j;
        asyncTextView.setTextColor(asyncTextView.getContext().getResources().getColor(com.tencent.mm.R.color.f479482a31));
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.f489506cs2);
            if (!baseViewHolder.f169290q) {
                baseViewHolder.T = (com.tencent.mm.plugin.sns.ui.PhotosContent) com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                baseViewHolder.f169290q = true;
            }
        } else {
            baseViewHolder.T = (com.tencent.mm.plugin.sns.ui.PhotosContent) baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.gxb);
            baseViewHolder.f169290q = true;
        }
        com.tencent.mars.xlog.Log.i("MiroMsg.HBRewardTimeLineItem", "viewtype " + this.f169250g);
        com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView = (com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) baseViewHolder.T.findViewById(com.tencent.mm.plugin.sns.ui.tm.f170533h[0]);
        com.tencent.mm.plugin.sns.ui.MaskImageView imageView = maskImageWithLivePhotoTagView.getImageView();
        baseViewHolder.T.b(imageView);
        baseViewHolder.T.c(maskImageWithLivePhotoTagView.getLivePhotoTagView());
        baseViewHolder.T.a(maskImageWithLivePhotoTagView);
        imageView.setOnClickListener(this.f169251h.f168039e.f169813p);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        java.lang.String str;
        java.lang.String str2;
        r45.da6 da6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        java.lang.String str3 = nsVar.f170036h;
        android.view.View view = baseViewHolder.f169293r0;
        if (view != null) {
            if (!nsVar.f170054z || (da6Var = baseViewHolder.snsobj.SnsRedEnvelops) == null || da6Var.f372274d <= 0) {
                view.setBackgroundResource(com.tencent.mm.R.drawable.f481840c63);
            } else {
                view.setBackgroundResource(com.tencent.mm.R.drawable.f481841c64);
            }
        }
        com.tencent.mm.plugin.sns.ui.TagImageView g17 = baseViewHolder.T.g(0);
        new java.util.ArrayList().add(g17);
        com.tencent.mm.plugin.sns.ui.oj ojVar = new com.tencent.mm.plugin.sns.ui.oj();
        ojVar.f170102a = str3;
        ojVar.f170103b = 0;
        ojVar.f170105d = this.f169252i;
        if (g17 != null) {
            g17.setTag(ojVar);
        }
        r45.kj4 kj4Var = nsVar.Y;
        baseViewHolder.f169273h0 = kj4Var;
        if (kj4Var == null) {
            str = "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem";
            str2 = "fillItem";
            com.tencent.mars.xlog.Log.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo is null " + nsVar.f170036h);
        } else if (c01.z1.r().equals(timeLineObject.UserName)) {
            baseViewHolder.T.setVisibility(0);
            com.tencent.mm.plugin.sns.ui.tm tmVar = bsVar.f168044j;
            com.tencent.mm.plugin.sns.ui.PhotosContent photosContent = baseViewHolder.T;
            java.lang.String str4 = nsVar.f170036h;
            int hashCode = this.f169249f.hashCode();
            boolean z17 = nsVar.f170044p;
            boolean z18 = this.f169252i;
            com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
            d17.f195313b = timeLineObject.CreateTime;
            str = "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem";
            tmVar.c(photosContent, timeLineObject, str4, null, null, hashCode, i18, i17, z17, z18, d17, true);
            str2 = "fillItem";
        } else {
            str = "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem";
            if (nsVar.C) {
                baseViewHolder.T.setVisibility(0);
                com.tencent.mm.plugin.sns.ui.tm tmVar2 = bsVar.f168044j;
                com.tencent.mm.plugin.sns.ui.PhotosContent photosContent2 = baseViewHolder.T;
                java.lang.String str5 = nsVar.f170036h;
                int hashCode2 = this.f169249f.hashCode();
                boolean z19 = nsVar.f170044p;
                boolean z27 = this.f169252i;
                com.tencent.mm.storage.s7 d18 = com.tencent.mm.storage.s7.d();
                d18.f195313b = timeLineObject.CreateTime;
                str2 = "fillItem";
                tmVar2.c(photosContent2, timeLineObject, str5, null, null, hashCode2, i18, i17, z19, z27, d18, false);
            } else {
                str2 = "fillItem";
                if (kj4Var.D == 0) {
                    baseViewHolder.T.setVisibility(0);
                    com.tencent.mm.plugin.sns.ui.tm tmVar3 = bsVar.f168044j;
                    com.tencent.mm.plugin.sns.ui.PhotosContent photosContent3 = baseViewHolder.T;
                    java.lang.String str6 = nsVar.f170036h;
                    int hashCode3 = this.f169249f.hashCode();
                    boolean z28 = nsVar.f170044p;
                    boolean z29 = this.f169252i;
                    com.tencent.mm.storage.s7 d19 = com.tencent.mm.storage.s7.d();
                    d19.f195313b = timeLineObject.CreateTime;
                    tmVar3.c(photosContent3, timeLineObject, str6, null, null, hashCode3, i18, i17, z28, z29, d19, true);
                } else {
                    com.tencent.mars.xlog.Log.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo.hbStatus is " + kj4Var.D);
                }
            }
        }
        g(nsVar, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        return "HBRewardTimeLineItem";
    }
}
