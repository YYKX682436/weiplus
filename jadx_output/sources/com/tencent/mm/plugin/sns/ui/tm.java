package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class tm {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f170529d = {0, 0, 1, 3, 6, 9};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f170530e = {com.tencent.mm.R.id.f482860q3};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f170531f = {com.tencent.mm.R.id.f482860q3, com.tencent.mm.R.id.f482861q4, com.tencent.mm.R.id.f482862q5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f170532g = {com.tencent.mm.R.id.f482860q3, com.tencent.mm.R.id.f482861q4, com.tencent.mm.R.id.f482862q5, com.tencent.mm.R.id.f482863q6, com.tencent.mm.R.id.f482864q7, com.tencent.mm.R.id.f482865q8};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f170533h = {com.tencent.mm.R.id.f482860q3, com.tencent.mm.R.id.f482861q4, com.tencent.mm.R.id.f482862q5, com.tencent.mm.R.id.f482863q6, com.tencent.mm.R.id.f482864q7, com.tencent.mm.R.id.f482865q8, com.tencent.mm.R.id.f482866q9, com.tencent.mm.R.id.q_, com.tencent.mm.R.id.f482867qa};

    /* renamed from: i, reason: collision with root package name */
    public static double f170534i = -1.0d;

    /* renamed from: j, reason: collision with root package name */
    public static double f170535j = -1.0d;

    /* renamed from: k, reason: collision with root package name */
    public static double f170536k = -1.0d;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f170537l;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f170538a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f170539b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f170540c;

    public tm(android.content.Context context) {
        new java.util.LinkedList();
        this.f170539b = l44.a0.a();
        this.f170540c = l44.a0.b();
        this.f170538a = context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateScreenSize", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        if (context instanceof android.app.Activity) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            android.graphics.Point point = new android.graphics.Point();
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
            com.tencent.mm.plugin.sns.model.l4.bk(point);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateScreenSize", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        f170537l = 1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_group_download, 0);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public static android.util.Pair a(r45.lj4 lj4Var, double d17, double d18, android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        double d19;
        double d27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCalculatedWH", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        if (f170534i < 0.0d) {
            f170534i = com.tencent.mm.sdk.platformtools.j.d(context, 160.0f);
            f170535j = com.tencent.mm.sdk.platformtools.j.d(context, 200.0f);
            f170536k = com.tencent.mm.sdk.platformtools.j.d(context, 44.0f);
            com.tencent.mm.sdk.platformtools.j.d(context, 66.0f);
            com.tencent.mm.sdk.platformtools.j.d(context, 300.0f);
        }
        if (z17 && snsInfo != null && snsInfo.isAd() && snsInfo.getAdXml().isShowPlayIconOnCover()) {
            android.util.Pair k17 = m21.y.k((int) d17, (int) d18, context, false);
            d19 = ((java.lang.Integer) k17.first).intValue();
            d27 = ((java.lang.Integer) k17.second).intValue();
        } else {
            if (d17 <= 0.0d || d18 <= 0.0d) {
                d19 = f170534i;
                d27 = d19;
            } else {
                double d28 = f170535j;
                double min = java.lang.Math.min(d28 / d17, d28 / d18);
                d19 = d17 * min;
                d27 = d18 * min;
                double d29 = f170536k;
                if (d19 < d29) {
                    double d37 = (d29 * 1.0d) / d19;
                    d19 *= d37;
                    d27 *= d37;
                }
                if (d27 < d29) {
                    double d38 = (d29 * 1.0d) / d27;
                    d19 *= d38;
                    d27 *= d38;
                }
                double d39 = f170535j;
                if (d19 > d39) {
                    d19 = d39;
                }
                if (d27 > d39) {
                    d27 = d39;
                }
            }
            if (d19 < 1.0d) {
                d19 = 1.0d;
            }
            if (d27 < 1.0d) {
                d27 = 1.0d;
            }
            if (lj4Var != null) {
                float f17 = lj4Var.f379520d;
                if (f17 > 0.0f) {
                    float f18 = lj4Var.f379521e;
                    if (f18 > 0.0f) {
                        d19 = f17;
                        d27 = f18;
                    }
                }
            }
        }
        android.util.Pair pair = new android.util.Pair(java.lang.Double.valueOf(d19), java.lang.Double.valueOf(d27));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCalculatedWH", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return pair;
    }

    public static boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class);
        if ((cdnManager != null ? cdnManager.allowBatchImageDownload() : false) && f170537l) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "groupDownloadDisable!!!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return false;
    }

    public void c(com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, java.lang.String str, android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener, int i17, int i18, int i19, boolean z17, boolean z18, com.tencent.mm.storage.s7 s7Var, boolean z19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        int[] iArr = (i18 == 2 || i18 == 10) ? f170530e : i18 == 3 ? f170531f : i18 == 4 ? f170532g : f170533h;
        java.util.LinkedList linkedList = timeLineObject.ContentObj.f369840h;
        if (f170534i < 0.0d) {
            android.content.Context context = this.f170538a;
            f170534i = com.tencent.mm.sdk.platformtools.j.d(context, 160.0f);
            f170535j = com.tencent.mm.sdk.platformtools.j.d(context, 200.0f);
            f170536k = com.tencent.mm.sdk.platformtools.j.d(context, 44.0f);
            com.tencent.mm.sdk.platformtools.j.d(context, 66.0f);
            com.tencent.mm.sdk.platformtools.j.d(context, 300.0f);
        }
        int size = linkedList.size();
        if (size == 0) {
            for (int i27 = 0; i27 < iArr.length; i27++) {
                com.tencent.mm.plugin.sns.model.l4.hj().P(photosContent.g(i27));
                photosContent.g(i27).setPosition(i19);
            }
            photosContent.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        photosContent.setVisibility(0);
        if (size != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        for (int i28 = 1; i28 < iArr.length; i28++) {
            com.tencent.mm.plugin.sns.ui.TagImageView g17 = photosContent.g(i28);
            g17.setVisibility(8);
            com.tencent.mm.plugin.sns.model.l4.hj().P(g17);
            photosContent.g(i28).setPosition(i19);
        }
        photosContent.g(0).setVisibility(0);
        e((r45.jj4) linkedList.get(0), photosContent.g(0), str, i17, i19, z18, s7Var, i18, z19, null, (com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) photosContent.f(0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }

    public void d(com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, java.lang.String str, android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener, int i17, int i18, int i19, boolean z17, boolean z18, com.tencent.mm.storage.s7 s7Var, java.util.List list, java.lang.String str2, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        int i27;
        com.tencent.mm.plugin.sns.model.k0 k0Var;
        com.tencent.mm.plugin.sns.ui.oj ojVar;
        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView;
        com.tencent.mm.plugin.sns.ui.oj ojVar2;
        int i28;
        boolean z19;
        int i29;
        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView2;
        boolean z27;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.sns.model.k0 k0Var2;
        java.util.LinkedList linkedList;
        android.util.SparseArray sparseArray;
        android.util.SparseArray sparseArray2;
        java.lang.String str3 = str;
        boolean z28 = z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        int[] iArr = (i18 == 2 || i18 == 10 || i18 == 13) ? f170530e : i18 == 3 ? f170531f : i18 == 4 ? f170532g : f170533h;
        java.util.LinkedList linkedList2 = timeLineObject.ContentObj.f369840h;
        if (f170534i < 0.0d) {
            android.content.Context context = this.f170538a;
            f170534i = com.tencent.mm.sdk.platformtools.j.d(context, 160.0f);
            f170535j = com.tencent.mm.sdk.platformtools.j.d(context, 200.0f);
            f170536k = com.tencent.mm.sdk.platformtools.j.d(context, 44.0f);
            com.tencent.mm.sdk.platformtools.j.d(context, 66.0f);
            com.tencent.mm.sdk.platformtools.j.d(context, 300.0f);
        }
        int size = linkedList2.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "snsid:%s  size:%d", snsInfo.getSnsId(), java.lang.Integer.valueOf(size));
        int i37 = 0;
        if (size == 0) {
            while (i37 < iArr.length) {
                com.tencent.mm.plugin.sns.model.l4.hj().P(photosContent.g(i37));
                photosContent.g(i37).setPosition(i19);
                i37++;
            }
            photosContent.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        photosContent.setParentImageViewWidth(com.tencent.mm.plugin.sns.model.l4.nj());
        photosContent.setVisibility(0);
        int i38 = 1;
        if (size == 1) {
            while (i38 < iArr.length) {
                com.tencent.mm.plugin.sns.ui.TagImageView g17 = photosContent.g(i38);
                android.view.View f17 = photosContent.f(i38);
                if (f17 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(f17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    f17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(f17, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                g17.setVisibility(8);
                com.tencent.mm.plugin.sns.model.l4.hj().P(g17);
                photosContent.g(i38).setPosition(i19);
                i38++;
                i37 = 0;
            }
            int i39 = i37;
            photosContent.g(i39).setVisibility(i39);
            android.view.View f18 = photosContent.f(i39);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i39));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(f18, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(f18, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (list == null || list.size() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSingle bitmap with with out size", "[image-flow]", snsInfo.getSnsId(), ((r45.jj4) linkedList2.get(0)).f377855d);
                e((r45.jj4) linkedList2.get(0), photosContent.g(0), str, i17, i19, z18, s7Var, i18, false, snsInfo, (com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) photosContent.f(0));
            } else {
                r45.lj4 lj4Var = (r45.lj4) list.get(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSingle bitmap with size:[%d %d],", "[image-flow]", snsInfo.getSnsId(), ((r45.jj4) linkedList2.get(0)).f377855d, java.lang.Float.valueOf(lj4Var.f379520d), java.lang.Float.valueOf(lj4Var.f379521e));
                f((r45.jj4) linkedList2.get(0), photosContent.g(0), str, i17, i19, z18, s7Var, i18, false, lj4Var, snsInfo, (com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) photosContent.f(0));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        com.tencent.mm.plugin.sns.model.k0 k0Var3 = !b() ? new com.tencent.mm.plugin.sns.model.k0(str2, size) : null;
        boolean z29 = this.f170539b;
        if (size != 4) {
            com.tencent.mm.plugin.sns.model.k0 k0Var4 = k0Var3;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            android.util.SparseArray sparseArray3 = new android.util.SparseArray();
            android.util.SparseArray sparseArray4 = new android.util.SparseArray();
            int length = iArr.length - 1;
            while (length >= 0) {
                com.tencent.mm.plugin.sns.ui.TagImageView g18 = photosContent.g(length);
                android.view.View f19 = photosContent.f(length);
                g18.setPosition(i19);
                if (length < linkedList2.size()) {
                    g18.setVisibility(0);
                    if (f19 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(f19, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        f19.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(f19, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    arrayList4.add(g18);
                    com.tencent.mm.plugin.sns.ui.oj ojVar3 = new com.tencent.mm.plugin.sns.ui.oj();
                    ojVar3.f170102a = str;
                    ojVar3.f170103b = length;
                    ojVar3.f170105d = z18;
                    ojVar3.f170104c = i19;
                    g18.setTag(ojVar3);
                    if (z17 || !b()) {
                        r45.jj4 jj4Var = (r45.jj4) linkedList2.get(ojVar3.f170103b);
                        com.tencent.mm.plugin.sns.model.k0 k0Var5 = k0Var4;
                        com.tencent.mm.plugin.sns.model.l4.Cj().k(jj4Var.f377855d, k0Var5);
                        com.tencent.mm.plugin.sns.model.l4.Cj().j(jj4Var.f377855d);
                        if (z17 && z29) {
                            k0Var = k0Var5;
                            if (!this.f170540c) {
                                ojVar = ojVar3;
                                tagImageView = g18;
                                com.tencent.mm.plugin.sns.model.l4.hj().W(jj4Var, g18, -1, i17, s7Var);
                                i27 = length;
                                ojVar2 = ojVar;
                            }
                        } else {
                            k0Var = k0Var5;
                        }
                        ojVar = ojVar3;
                        tagImageView = g18;
                        i27 = length;
                        g(str2, jj4Var, tagImageView, i17, i19, s7Var);
                        ojVar2 = ojVar;
                    } else {
                        ojVar2 = ojVar3;
                        tagImageView = g18;
                        i27 = length;
                        k0Var = k0Var4;
                    }
                    sparseArray3.put(ojVar2.f170103b, (r45.jj4) linkedList2.get(ojVar2.f170103b));
                    sparseArray4.put(ojVar2.f170103b, tagImageView);
                } else {
                    i27 = length;
                    k0Var = k0Var4;
                    g18.setVisibility(8);
                    if (f19 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(f19, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        f19.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(f19, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.tencent.mm.plugin.sns.model.l4.hj().P(g18);
                }
                length = i27 - 1;
                k0Var4 = k0Var;
            }
            if (!z17 && b() && sparseArray3.size() > 0) {
                h(str2, sparseArray3, sparseArray4, i17, s7Var, size);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        android.util.SparseArray sparseArray5 = new android.util.SparseArray();
        android.util.SparseArray sparseArray6 = new android.util.SparseArray();
        int length2 = iArr.length - 1;
        int i47 = 3;
        while (length2 >= 0) {
            com.tencent.mm.plugin.sns.ui.TagImageView g19 = photosContent.g(length2);
            g19.setPosition(i19);
            android.view.View f27 = photosContent.f(length2);
            android.util.SparseArray sparseArray7 = sparseArray5;
            if (length2 == 0 || length2 == 1 || length2 == 3 || length2 == 4) {
                g19.setVisibility(0);
                if (f27 != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    i28 = length2;
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(f27, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    f27.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(f27, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    i28 = length2;
                }
                arrayList7.add(g19);
                com.tencent.mm.plugin.sns.ui.oj ojVar4 = new com.tencent.mm.plugin.sns.ui.oj();
                ojVar4.f170102a = str3;
                int i48 = i47;
                i47 = i48 - 1;
                ojVar4.f170103b = i48;
                ojVar4.f170105d = z28;
                ojVar4.f170104c = i19;
                g19.setTag(ojVar4);
                if (z17 || !b()) {
                    r45.jj4 jj4Var2 = (r45.jj4) linkedList2.get(ojVar4.f170103b);
                    com.tencent.mm.plugin.sns.model.l4.Cj().k(jj4Var2.f377855d, k0Var3);
                    com.tencent.mm.plugin.sns.model.l4.Cj().j(jj4Var2.f377855d);
                    if (z17 && z29) {
                        com.tencent.mm.plugin.sns.model.l4.hj().W(jj4Var2, g19, -1, i17, s7Var);
                    } else {
                        z19 = z29;
                        i29 = i28;
                        android.util.SparseArray sparseArray8 = sparseArray6;
                        tagImageView2 = g19;
                        z27 = true;
                        arrayList = arrayList7;
                        k0Var2 = k0Var3;
                        linkedList = linkedList2;
                        sparseArray = sparseArray7;
                        sparseArray2 = sparseArray8;
                        g(str2, jj4Var2, tagImageView2, i17, i19, s7Var);
                        sparseArray.put(ojVar4.f170103b, (r45.jj4) linkedList.get(ojVar4.f170103b));
                        sparseArray2.put(ojVar4.f170103b, tagImageView2);
                    }
                }
                sparseArray2 = sparseArray6;
                sparseArray = sparseArray7;
                z19 = z29;
                tagImageView2 = g19;
                k0Var2 = k0Var3;
                arrayList = arrayList7;
                i29 = i28;
                z27 = true;
                linkedList = linkedList2;
                sparseArray.put(ojVar4.f170103b, (r45.jj4) linkedList.get(ojVar4.f170103b));
                sparseArray2.put(ojVar4.f170103b, tagImageView2);
            } else {
                g19.setVisibility(8);
                com.tencent.mm.plugin.sns.model.l4.hj().P(g19);
                if (f27 != null) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList9.add(8);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(f27, arrayList9.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    f27.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(f27, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                sparseArray2 = sparseArray6;
                sparseArray = sparseArray7;
                z19 = z29;
                i29 = length2;
                k0Var2 = k0Var3;
                arrayList = arrayList7;
                z27 = true;
                linkedList = linkedList2;
            }
            length2 = i29 - 1;
            sparseArray6 = sparseArray2;
            sparseArray5 = sparseArray;
            linkedList2 = linkedList;
            z29 = z19;
            k0Var3 = k0Var2;
            str3 = str;
            z28 = z18;
            arrayList7 = arrayList;
        }
        android.util.SparseArray sparseArray9 = sparseArray6;
        android.util.SparseArray sparseArray10 = sparseArray5;
        if (!z17 && b() && sparseArray10.size() > 0) {
            h(str2, sparseArray10, sparseArray9, i17, s7Var, size);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }

    public final boolean e(r45.jj4 jj4Var, com.tencent.mm.ui.widget.QFadeImageView qFadeImageView, java.lang.String str, int i17, int i18, boolean z17, com.tencent.mm.storage.s7 s7Var, int i19, boolean z18, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        boolean f17 = f(jj4Var, qFadeImageView, str, i17, i18, z17, s7Var, i19, z18, new r45.lj4(), snsInfo, view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return f17;
    }

    public final boolean f(r45.jj4 jj4Var, com.tencent.mm.ui.widget.QFadeImageView qFadeImageView, java.lang.String str, int i17, int i18, boolean z17, com.tencent.mm.storage.s7 s7Var, int i19, boolean z18, r45.lj4 lj4Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view) {
        java.lang.String str2;
        boolean z19;
        java.lang.String str3;
        boolean i07;
        double d17;
        double d18;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        boolean z27;
        java.lang.String str7;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        if (qFadeImageView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMultiLineImageLineMgr", "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.oj ojVar = new com.tencent.mm.plugin.sns.ui.oj();
        ojVar.f170102a = str;
        ojVar.f170103b = 0;
        new java.util.ArrayList().add(qFadeImageView);
        ojVar.f170105d = z17;
        ojVar.f170104c = i18;
        qFadeImageView.setTag(ojVar);
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        if (i19 == 10 && z18) {
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            hj6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsBlurThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsBlurThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            if (jj4Var == null || (str7 = jj4Var.f377855d) == null || str7.equals("")) {
                str2 = "setSingle";
                str5 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2";
                str6 = "setSnsBlurThumb";
                z27 = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str5);
            } else {
                java.lang.String x17 = ca4.z0.x(4, jj4Var.f377855d);
                str6 = "setSnsBlurThumb";
                str2 = "setSingle";
                str5 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2";
                hj6.M(t07, jj4Var, x17, s7Var, false);
                hj6.s0(qFadeImageView, x17, true, -1, i17);
                com.tencent.mm.memory.r k17 = hj6.k(x17, jj4Var.f377855d);
                if (ca4.z0.g(k17)) {
                    z27 = false;
                    hj6.R(qFadeImageView, x17, k17, false);
                    ta4.u0.m(jj4Var.f377855d);
                    ta4.u0.o(jj4Var.f377855d);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str5);
                } else {
                    hj6.q0(qFadeImageView);
                    if (((java.util.HashSet) hj6.f164274w).contains(x17)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str5);
                    } else {
                        hj6.I(4, jj4Var, s7Var, t07);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str5);
                    }
                    z27 = false;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str5);
            z19 = z27;
            i07 = true;
        } else {
            str2 = "setSingle";
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSnsThumb start", "[image-flow]", t07, jj4Var.f377855d);
            if (snsInfo.isAd() && this.f170539b) {
                z19 = false;
                i07 = com.tencent.mm.plugin.sns.model.l4.hj().W(jj4Var, qFadeImageView, -1, i17, s7Var);
                str3 = t07;
            } else {
                z19 = false;
                com.tencent.mm.plugin.sns.model.i1 hj7 = com.tencent.mm.plugin.sns.model.l4.hj();
                hj7.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                str3 = t07;
                i07 = hj7.i0(jj4Var, qFadeImageView, -1, i17, s7Var, 1, str3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSnsThumb finish with result:%b", "[image-flow]", str3, jj4Var.f377855d, java.lang.Boolean.valueOf(i07));
        }
        r45.lj4 lj4Var2 = jj4Var.f377865p;
        if (lj4Var2 != null) {
            d18 = lj4Var2.f379520d;
            d17 = lj4Var2.f379521e;
        } else {
            d17 = 0.0d;
            d18 = 0.0d;
        }
        android.util.Pair a17 = a(lj4Var, d18, d17, this.f170538a, snsInfo, i19 != 2 ? z19 : true);
        double doubleValue = ((java.lang.Double) a17.first).doubleValue();
        double doubleValue2 = ((java.lang.Double) a17.second).doubleValue();
        if (view.getLayoutParams() instanceof android.widget.FrameLayout.LayoutParams) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) qFadeImageView.getLayoutParams();
            if (layoutParams.width == doubleValue && layoutParams.height == doubleValue2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
                return i07;
            }
            str4 = str2;
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) doubleValue, (int) doubleValue2));
        } else {
            str4 = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return i07;
    }

    public final void g(java.lang.String str, r45.jj4 jj4Var, com.tencent.mm.ui.widget.QFadeImageView qFadeImageView, int i17, int i18, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        com.tencent.mm.plugin.sns.model.l4.hj().Z(str, jj4Var, qFadeImageView, i17, s7Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v4 */
    public void h(java.lang.String str, android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2, int i17, com.tencent.mm.storage.s7 s7Var, int i18) {
        android.util.SparseArray sparseArray3 = sparseArray;
        android.util.SparseArray sparseArray4 = sparseArray2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        hj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "enter group img download logic!");
        if (sparseArray3 == null || sparseArray.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, medias is invalid.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else if (sparseArray4 == null || sparseArray2.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, imageViews is invalid.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            int size = sparseArray.size();
            int size2 = sparseArray2.size();
            int i19 = size == size2 ? size : -1;
            if (-1 == i19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, mediaSize(%d) != imgViewSize(%d).", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            } else {
                android.util.SparseArray sparseArray5 = new android.util.SparseArray();
                android.util.SparseArray sparseArray6 = new android.util.SparseArray();
                android.util.SparseArray sparseArray7 = new android.util.SparseArray();
                ?? r102 = 0;
                int i27 = 0;
                while (i27 < i19) {
                    int keyAt = sparseArray3.keyAt(i27);
                    r45.jj4 jj4Var = (r45.jj4) sparseArray3.get(keyAt);
                    android.view.View view = (android.view.View) sparseArray4.get(keyAt);
                    view.setDrawingCacheEnabled(r102);
                    java.lang.String x17 = ca4.z0.x(r102, jj4Var.f377855d);
                    int i28 = i27;
                    hj6.M(str, jj4Var, x17, s7Var, true);
                    boolean z17 = r102;
                    hj6.v0(view, x17, true, -1, i17, com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_NONE);
                    com.tencent.mm.memory.r k17 = hj6.k(x17, jj4Var.f377855d);
                    if (ca4.z0.g(k17)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg, cache hit.");
                        ta4.u0.m(jj4Var.f377855d);
                        ta4.u0.o(jj4Var.f377855d);
                        hj6.R(view, x17, k17, z17);
                        if (!com.tencent.mm.plugin.sns.model.l4.hj().A(jj4Var) && pc4.d.f353410a.k()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] local file not exist,re download", "[image-flow]", str, jj4Var.f377855d);
                            sparseArray5.put(keyAt, jj4Var);
                            i27 = i28 + 1;
                            r102 = z17;
                            sparseArray3 = sparseArray;
                            sparseArray4 = sparseArray2;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg, cache miss.");
                        hj6.q0(view);
                        if (((java.util.HashSet) hj6.f164274w).contains(x17)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "%s in hashSet ignore", x17);
                        } else {
                            sparseArray5.put(keyAt, jj4Var);
                        }
                    }
                    i27 = i28 + 1;
                    r102 = z17;
                    sparseArray3 = sparseArray;
                    sparseArray4 = sparseArray2;
                }
                if (sparseArray5.size() != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "ok, let's download.");
                    com.tencent.mm.plugin.sns.model.l4.Sj().execute(new com.tencent.mm.plugin.sns.model.s1(hj6, sparseArray5, sparseArray6, sparseArray7, str, s7Var, i18));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }
}
