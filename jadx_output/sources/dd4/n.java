package dd4;

/* loaded from: classes4.dex */
public final class n implements com.tencent.mm.plugin.sns.model.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView f229028a;

    public n(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        this.f229028a = flexibleLivePhotoView;
    }

    @Override // com.tencent.mm.plugin.sns.model.c2
    public final void a(android.graphics.Bitmap bitmap) {
        r45.jj4 b17;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhoto$1");
        boolean f17 = ca4.z0.f(bitmap);
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = this.f229028a;
        if (!f17 && (b17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.b(flexibleLivePhotoView)) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRecordLoadImgCallback$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRecordLoadImgCallback$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            dd4.w0 w0Var = flexibleLivePhotoView.E;
            if (w0Var != null) {
                com.tencent.mm.plugin.sns.ui.bk$$a bk__a = (com.tencent.mm.plugin.sns.ui.bk$$a) w0Var;
                java.lang.String str2 = bk__a.f167928c;
                com.tencent.mm.plugin.sns.ui.bk bkVar = bk__a.f167926a;
                bkVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$fillViewLivePhotoView$0", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = bkVar.f167925r;
                if (!com.tencent.mm.plugin.sns.ui.SnsInfoFlip.H(snsInfoFlip) || snsInfoFlip.getSelectItem() == null) {
                    str = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                } else {
                    int i17 = snsInfoFlip.getSelectItem().f380112g == bk__a.f167927b ? 0 : 1;
                    int i18 = snsInfoFlip.getSelectItem().f380112g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    str = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter";
                    snsInfoFlip.g0(str2, b17, i18, 2, 1, i17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$fillViewLivePhotoView$0", str);
            }
        }
        if (!ca4.z0.f(bitmap)) {
            r45.jj4 b18 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.b(flexibleLivePhotoView);
            if ((b18 != null ? b18.f377855d : null) != null) {
                r45.jj4 b19 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.b(flexibleLivePhotoView);
                kotlin.jvm.internal.o.d(b19);
                java.lang.String Id = b19.f377855d;
                kotlin.jvm.internal.o.f(Id, "Id");
                if (!r26.i0.y(Id, "pre_temp_extend_pic", false)) {
                    com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.f(flexibleLivePhotoView).setVisibility(0);
                    android.view.View a17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.a(flexibleLivePhotoView);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView$prepareLivePhoto$1", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(a17, "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView$prepareLivePhoto$1", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View a18 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.a(flexibleLivePhotoView);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(0.1f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(a18, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView$prepareLivePhoto$1", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    a18.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(a18, "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView$prepareLivePhoto$1", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.a(flexibleLivePhotoView).animate().alpha(1.0f).setDuration(2000L).setListener(null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUseFixAnimation$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUseFixAnimation$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                    if (flexibleLivePhotoView.f169198p) {
                        flexibleLivePhotoView.m("big image not ready, set loading img on useFixAnimation");
                        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView).setVisibility(0);
                        dd4.v0 d17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.d(flexibleLivePhotoView);
                        if (d17 == null) {
                            kotlin.jvm.internal.o.o("snsInfoFlipCallback");
                            throw null;
                        }
                        ((com.tencent.mm.plugin.sns.ui.fk) d17).b(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView), com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.c(flexibleLivePhotoView));
                    } else {
                        flexibleLivePhotoView.m("big image not ready, set loading img on no use useFixAnimation");
                        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView).setVisibility(8);
                        com.tencent.mm.plugin.sns.model.l4.hj().P(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.f(flexibleLivePhotoView));
                        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
                        r45.jj4 b27 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.b(flexibleLivePhotoView);
                        android.widget.ImageView f18 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.f(flexibleLivePhotoView);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContextCode$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                        int i19 = flexibleLivePhotoView.f169199q;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContextCode$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFromScene$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                        com.tencent.mm.storage.s7 s7Var = flexibleLivePhotoView.f169200r;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFromScene$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                        hj6.l0(b27, f18, com.tencent.mm.R.drawable.bgn, i19, s7Var);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhoto$1");
                }
            }
        }
        if (ca4.z0.f(bitmap)) {
            dd4.v0 d18 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.d(flexibleLivePhotoView);
            if (d18 == null) {
                kotlin.jvm.internal.o.o("snsInfoFlipCallback");
                throw null;
            }
            ((com.tencent.mm.plugin.sns.ui.fk) d18).b(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView), com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.c(flexibleLivePhotoView));
            dd4.f fVar = dd4.f.f228998g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBigImageDownLoadState$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            flexibleLivePhotoView.f169205w = fVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBigImageDownLoadState$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            flexibleLivePhotoView.m("bigImage ready to show");
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView).setEnableHorLongBmpMode(true);
            com.tencent.mm.ui.base.MultiTouchImageView e17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            e17.f197651o = width;
            e17.f197652p = height;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("big image ratio: ");
            sb6.append(bitmap.getHeight() / bitmap.getWidth());
            sb6.append(" bmWidth: ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int i27 = flexibleLivePhotoView.f169208z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            sb6.append(i27);
            sb6.append(" bmHeight: ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int i28 = flexibleLivePhotoView.A;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            sb6.append(i28);
            flexibleLivePhotoView.m(sb6.toString());
            int width2 = bitmap.getWidth();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            flexibleLivePhotoView.f169208z = width2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int height2 = bitmap.getHeight();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            flexibleLivePhotoView.A = height2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView).setImageBitmap(bitmap);
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView).setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int i29 = flexibleLivePhotoView.f169208z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int i37 = flexibleLivePhotoView.A;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.q(flexibleLivePhotoView, i29, i37, false, null, 12, null);
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView).post(new dd4.m(flexibleLivePhotoView));
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.h(flexibleLivePhotoView);
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.o(flexibleLivePhotoView, false, 1, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$prepareLivePhoto$1");
    }
}
