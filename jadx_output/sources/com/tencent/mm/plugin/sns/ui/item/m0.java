package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class m0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements com.tencent.mm.plugin.sns.ui.y4 {
    public com.tencent.mm.plugin.sns.storage.ADInfo A;
    public n74.j1 B;
    public com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic C;

    /* renamed from: q, reason: collision with root package name */
    public int f169380q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.MaskImageView f169381r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f169382s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f169383t;

    /* renamed from: x, reason: collision with root package name */
    public a44.k f169387x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.item.l0 f169388y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f169389z;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f169384u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f169385v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f169386w = new java.util.ArrayList();
    public final boolean D = com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.e();

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.MaskImageView F(com.tencent.mm.plugin.sns.ui.item.m0 m0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = m0Var.f169381r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        return maskImageView;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public boolean D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.y4
    public void F3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = this.C;
        if (commonShakeLogic != null) {
            commonShakeLogic.F3();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
    }

    public final void G(com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addAdWeAppIcon", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        if (photosContent == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAdWeAppIcon", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
            return;
        }
        try {
            if (this.f169383t == null) {
                this.f169383t = new android.widget.ImageView(this.f169249f);
            }
            photosContent.removeView(this.f169383t);
            int b17 = i65.a.b(this.f169249f, 24);
            int b18 = i65.a.b(this.f169249f, 4);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(b17, b17);
            layoutParams.leftMargin = b18;
            layoutParams.topMargin = b18;
            this.f169383t.setImageResource(i17);
            this.f169383t.setLayoutParams(layoutParams);
            this.f169383t.setVisibility(0);
            photosContent.addView(this.f169383t);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAdWeAppIcon", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
    }

    public final void H(com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.ui.ns nsVar) {
        r45.a90 a90Var;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList;
        java.util.LinkedList linkedList;
        int i18;
        java.util.List list;
        android.view.View view;
        int i19;
        int i27;
        android.view.View view2;
        com.tencent.mm.plugin.sns.ui.item.m0 m0Var = this;
        int i28 = i17;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = timeLineObject;
        java.lang.String str3 = "addCollectedAdGameInfo";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        if (photosContent == null || i28 <= 1) {
            com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "addCollectedAdGameInfo, photosContent == null or imgNums <= 1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
            return;
        }
        if (timeLineObject2 == null || (a90Var = timeLineObject2.ContentObj) == null || a84.b0.b(a90Var.f369840h)) {
            com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "addCollectedAdGameInfo, mediaList is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
            return;
        }
        java.util.List a17 = snsInfo.getAdXml().collectedAdInfo.a();
        if (a17 != null) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) a17;
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() != i28) {
                    com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "addCollectedAdGameInfo, subAdInfo size != imgNums");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
                    return;
                }
                try {
                    java.util.LinkedList linkedList2 = timeLineObject2.ContentObj.f369840h;
                    java.lang.String t07 = ca4.z0.t0(nsVar.f170038j);
                    int hashCode = m0Var.f169249f.hashCode();
                    int i29 = 0;
                    int i37 = 0;
                    while (i37 < i28) {
                        android.view.View f17 = photosContent.f(i37);
                        if (f17 != null && f17.getVisibility() != 8) {
                            com.tencent.mm.plugin.sns.ui.TagImageView g17 = photosContent.g(i37);
                            if (g17 != null) {
                                g17.setVisibility(8);
                            }
                            s34.v1 v1Var = i29 < arrayList2.size() ? (s34.v1) arrayList2.get(i29) : null;
                            r45.jj4 jj4Var = i29 < linkedList2.size() ? (r45.jj4) linkedList2.get(i29) : null;
                            java.util.List list2 = m0Var.f169386w;
                            if (((java.util.ArrayList) list2).size() >= i28 || i29 < ((java.util.ArrayList) list2).size()) {
                                str = str3;
                                arrayList = arrayList2;
                                linkedList = linkedList2;
                                list = list2;
                                view = f17;
                                i19 = i29;
                                i18 = i37;
                                i27 = 0;
                                view2 = null;
                            } else if (v1Var != null) {
                                android.view.ViewGroup.LayoutParams layoutParams = f17.getLayoutParams();
                                int i38 = layoutParams != null ? layoutParams.width : 0;
                                if (i38 <= 0) {
                                    i38 = com.tencent.mm.plugin.sns.model.l4.nj();
                                    arrayList = arrayList2;
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    linkedList = linkedList2;
                                    sb6.append("addCollectedAdGameInfo, parentView width invalid, fallback to multiThumbDisplaySize=");
                                    sb6.append(i38);
                                    com.tencent.mars.xlog.Log.w("MiroMsg.PhotoTimeLineItem", sb6.toString());
                                } else {
                                    arrayList = arrayList2;
                                    linkedList = linkedList2;
                                }
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                sb7.append("addCollectedAdGameInfo, build gameView, i=");
                                sb7.append(i37);
                                sb7.append(", visibleIndex=");
                                sb7.append(i29);
                                sb7.append(", cellWidth=");
                                sb7.append(i38);
                                sb7.append(", parentView.width=");
                                sb7.append(layoutParams != null ? layoutParams.width : -1);
                                sb7.append(", parentView.measuredWidth=");
                                sb7.append(f17.getMeasuredWidth());
                                com.tencent.mars.xlog.Log.i("MiroMsg.PhotoTimeLineItem", sb7.toString());
                                android.app.Activity activity = m0Var.f169249f;
                                com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
                                d17.f195313b = timeLineObject2.CreateTime;
                                boolean z17 = m0Var.f169247d;
                                list = list2;
                                view = f17;
                                i19 = i29;
                                i18 = i37;
                                str = str3;
                                i27 = 0;
                                view2 = null;
                                try {
                                    ((java.util.ArrayList) list).add(b84.a.a(activity, v1Var, jj4Var, snsInfo, t07, hashCode, i38, d17, z17));
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "addCollectedAdGameInfo error: " + th.toString());
                                    str2 = str;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
                                    return;
                                }
                            } else {
                                str = str3;
                                arrayList = arrayList2;
                                linkedList = linkedList2;
                                list = list2;
                                view = f17;
                                i19 = i29;
                                i18 = i37;
                                i27 = 0;
                                view2 = null;
                                ((java.util.ArrayList) list).add(null);
                            }
                            if (i19 < ((java.util.ArrayList) list).size()) {
                                view2 = (android.view.View) ((java.util.ArrayList) list).get(i19);
                            }
                            if (view2 != null && (view instanceof android.widget.FrameLayout)) {
                                ((android.widget.FrameLayout) view).addView(view2);
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList3.add(java.lang.Integer.valueOf(i27));
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem", "addCollectedAdGameInfo", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((java.lang.Integer) arrayList3.get(i27)).intValue());
                                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem", "addCollectedAdGameInfo", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                final com.tencent.mm.plugin.sns.ui.TagImageView g18 = photosContent.g(i18);
                                view2.setOnClickListener(new android.view.View.OnClickListener() { // from class: ed4.q$$c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view3) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$addCollectedAdGameInfo$2", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
                                        java.lang.Object obj = new java.lang.Object();
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView = com.tencent.mm.plugin.sns.ui.TagImageView.this;
                                        arrayList4.add(tagImageView);
                                        arrayList4.add(view3);
                                        java.lang.Object[] array = arrayList4.toArray();
                                        arrayList4.clear();
                                        yj0.a.b("com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                                        if (tagImageView != null) {
                                            tagImageView.performClick();
                                        }
                                        yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$addCollectedAdGameInfo$2", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
                                    }
                                });
                            }
                            i29 = i19 + 1;
                            i37 = i18 + 1;
                            m0Var = this;
                            i28 = i17;
                            timeLineObject2 = timeLineObject;
                            arrayList2 = arrayList;
                            linkedList2 = linkedList;
                            str3 = str;
                        }
                        str = str3;
                        arrayList = arrayList2;
                        linkedList = linkedList2;
                        i18 = i37;
                        i29 = i29;
                        i37 = i18 + 1;
                        m0Var = this;
                        i28 = i17;
                        timeLineObject2 = timeLineObject;
                        arrayList2 = arrayList;
                        linkedList2 = linkedList;
                        str3 = str;
                    }
                    str2 = str3;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    str = str3;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "addCollectedAdGameInfo, subAdInfoList is null or empty");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
    }

    public final void I(com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        if (photosContent != null) {
            boolean z17 = true;
            if (i17 > 1) {
                java.util.List a17 = snsInfo.getAdXml().collectedAdInfo.a();
                if (a17 != null) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) a17;
                    if (!arrayList.isEmpty()) {
                        if (arrayList.size() != i17) {
                            com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "subAdInfo size != imgNums");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
                            return;
                        }
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < i17) {
                            try {
                                if (photosContent.g(i18).getVisibility() != 8) {
                                    s34.v1 v1Var = i19 < arrayList.size() ? (s34.v1) arrayList.get(i19) : null;
                                    boolean z18 = (v1Var == null || v1Var.b() == null || v1Var.b().isEmpty()) ? false : z17;
                                    java.util.List list = this.f169385v;
                                    if (((java.util.ArrayList) list).size() < i17 && i19 >= ((java.util.ArrayList) list).size()) {
                                        if (z18) {
                                            ((java.util.ArrayList) list).add(b84.a.b(this.f169249f, v1Var, photosContent));
                                        } else {
                                            ((java.util.ArrayList) list).add(null);
                                        }
                                    }
                                    android.view.View view = i19 < ((java.util.ArrayList) list).size() ? (android.view.View) ((java.util.ArrayList) list).get(i19) : null;
                                    if (view != null) {
                                        ((android.widget.FrameLayout) photosContent.f(i18)).addView(view);
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                        arrayList2.add(0);
                                        java.util.Collections.reverse(arrayList2);
                                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem", "addCollectedAdPrice", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem", "addCollectedAdPrice", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                    i19++;
                                }
                                i18++;
                                z17 = true;
                            } catch (java.lang.Throwable th6) {
                                com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "addCollectedAdPrice error: " + th6.toString());
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "subAdInfoList is null or empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "photosContent == null or imgNums <= 1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
    }

    public final void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.l0 l0Var = this.f169388y;
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "initCommonShakeLogic, holder==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
            return;
        }
        com.tencent.mm.plugin.sns.ui.PhotosContent photosContent = l0Var.T;
        android.view.View view = l0Var.f169301v0;
        android.app.Activity activity = this.f169249f;
        if (activity == null || photosContent == null || view == null) {
            com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "initCommonShakeLogic, params err");
        } else {
            this.C = new com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic(activity, photosContent, view, 0, new ed4.r(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        this.f169249f.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        com.tencent.mars.xlog.Log.i("MiroMsg.PhotoTimeLineItem", "viewtype" + this.f169250g);
        android.graphics.Point point = new android.graphics.Point();
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        com.tencent.mm.plugin.sns.model.l4.bk(point);
        this.f169380q = com.tencent.mm.plugin.sns.model.l4.nj();
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) == null || com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).getParent() == null || !(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).getParent() instanceof android.view.ViewGroup)) {
            baseViewHolder.T = (com.tencent.mm.plugin.sns.ui.PhotosContent) baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.f486309kv3);
            baseViewHolder.f169290q = true;
        } else {
            int i17 = this.f169250g;
            if (i17 == 2) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.cue);
            } else if (i17 == 3) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.cub);
            } else if (i17 == 4) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.cuc);
            } else if (i17 == 5) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.cud);
            } else {
                com.tencent.mars.xlog.Log.e("MiroMsg.PhotoTimeLineItem", "error viewtyoe in photo item  " + this.f169250g);
            }
            if (!baseViewHolder.f169290q) {
                baseViewHolder.T = (com.tencent.mm.plugin.sns.ui.PhotosContent) com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                baseViewHolder.f169290q = true;
            }
        }
        baseViewHolder.T.d();
        for (int i18 = 0; i18 < com.tencent.mm.plugin.sns.ui.tm.f170529d[this.f169250g]; i18++) {
            com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView = (com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) baseViewHolder.T.findViewById(com.tencent.mm.plugin.sns.ui.tm.f170533h[i18]);
            com.tencent.mm.plugin.sns.ui.MaskImageView imageView = maskImageWithLivePhotoTagView.getImageView();
            baseViewHolder.T.b(imageView);
            baseViewHolder.T.c(maskImageWithLivePhotoTagView.getLivePhotoTagView());
            baseViewHolder.T.a(maskImageWithLivePhotoTagView);
            imageView.setOnClickListener(this.f169251h.f168039e.f169813p);
            rl5.r d17 = this.f169251h.d();
            com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169251h.f168039e;
            d17.j(imageView, iVar.f169823z, iVar.f169809l);
        }
        baseViewHolder.T.setParentImageViewWidth(this.f169380q);
        if (baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.l0) {
            com.tencent.mm.plugin.sns.ui.item.l0 l0Var = (com.tencent.mm.plugin.sns.ui.item.l0) baseViewHolder;
            this.f169388y = l0Var;
            l0Var.D0 = (android.view.ViewStub) baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.g6y);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(53:6|(1:366)(5:9|(1:11)(1:365)|12|(1:364)(4:16|(4:19|(2:21|22)(2:24|25)|23|17)|26|27)|28)|29|(1:31)|32|(1:363)(1:35)|36|(1:38)|(1:353)|42|(3:44|(1:46)|47)(2:350|(1:352))|48|(1:50)|51|(2:54|52)|55|(7:57|(4:60|(2:62|63)(2:65|66)|64|58)|67|68|(4:71|(2:73|74)(2:76|77)|75|69)|78|79)(1:349)|80|(4:82|(1:84)(1:96)|85|(3:91|(2:94|92)|95))|97|(1:99)|100|(1:348)(8:104|(2:106|(2:110|(3:112|(1:114)|115)(2:116|(5:118|(1:120)|121|(1:123)|124)(2:125|(5:127|(1:129)|130|(1:132)|133)))))|(1:347)(4:137|(1:139)(1:346)|140|(1:142))|143|(1:145)(2:343|(3:345|147|(1:149)))|146|147|(0))|150|(1:342)(2:152|(28:341|158|(1:160)(4:323|(3:325|(2:327|328)(2:330|(2:332|(2:334|335)(2:336|337))(1:338))|329)|339|340)|161|(3:165|166|(4:170|(1:172)|173|(2:175|(1:179))))|322|186|(4:188|189|190|(18:194|195|196|197|198|(2:313|(1:315))(4:204|(1:206)|207|(1:209))|210|(2:216|(1:252)(5:220|221|(5:223|(2:227|(1:229))|230|(2:232|233)(4:235|(3:237|(1:239)(2:243|(1:245))|240)(1:246)|241|242)|234)|248|249))|253|(1:312)(1:266)|(2:269|(1:271)(2:272|(7:274|275|(3:279|(1:281)|282)|283|(4:292|(4:294|(1:296)|297|(1:305)(1:(1:304)))|306|(1:308))|309|310)))|311|275|(4:277|279|(0)|282)|283|(4:292|(0)|306|(0))|309|310))|321|196|197|198|(1:200)|313|(0)|210|(4:212|216|(1:218)|252)|253|(1:255)|312|(2:269|(0)(0))|311|275|(0)|283|(0)|309|310)(1:156))|157|158|(0)(0)|161|(4:163|165|166|(5:168|170|(0)|173|(0)))|322|186|(0)|321|196|197|198|(0)|313|(0)|210|(0)|253|(0)|312|(0)|311|275|(0)|283|(0)|309|310) */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x078c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x078d, code lost:
    
        com.tencent.mars.xlog.Log.e(r15, "refreshCommonShakeView, exp=" + r0);
        ca4.q.c("refreshCommonShakeView, photoAdItem", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06a6 A[Catch: all -> 0x06f9, TryCatch #3 {all -> 0x06f9, blocks: (B:166:0x0694, B:168:0x069c, B:170:0x06a2, B:172:0x06a6, B:173:0x06b3, B:175:0x06b7, B:177:0x06eb, B:179:0x06ef), top: B:165:0x0694 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06b7 A[Catch: all -> 0x06f9, TryCatch #3 {all -> 0x06f9, blocks: (B:166:0x0694, B:168:0x069c, B:170:0x06a2, B:172:0x06a6, B:173:0x06b3, B:175:0x06b7, B:177:0x06eb, B:179:0x06ef), top: B:165:0x0694 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x075f A[Catch: Exception -> 0x078c, TryCatch #0 {Exception -> 0x078c, blocks: (B:198:0x075b, B:200:0x075f, B:204:0x076a, B:206:0x076e, B:207:0x0771, B:209:0x0775, B:313:0x0781, B:315:0x0785), top: B:197:0x075b }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x08bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0925 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0785 A[Catch: Exception -> 0x078c, TRY_LEAVE, TryCatch #0 {Exception -> 0x078c, blocks: (B:198:0x075b, B:200:0x075f, B:204:0x076a, B:206:0x076e, B:207:0x0771, B:209:0x0775, B:313:0x0781, B:315:0x0785), top: B:197:0x075b }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0656  */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r46, int r47, com.tencent.mm.plugin.sns.ui.ns r48, com.tencent.mm.protocal.protobuf.TimeLineObject r49, int r50, final com.tencent.mm.plugin.sns.ui.bs r51) {
        /*
            Method dump skipped, instructions count: 2442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.m0.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        return "PhotoTimeLineItem";
    }
}
