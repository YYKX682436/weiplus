package tc4;

/* loaded from: classes4.dex */
public final class k4 extends tc4.v0 implements xd4.d {
    public com.tencent.mm.plugin.sns.ui.MaskImageView A1;
    public android.view.View B1;
    public com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView C1;
    public boolean D1;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.ViewGroup f417392y1;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout f417393z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.D1 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
        if (r9 == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.k4.D(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.d2
    public java.lang.Object E(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new tc4.f4(null), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return g17;
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        android.view.ViewGroup viewGroup = this.f417392y1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return viewGroup;
    }

    public final java.util.List T(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        kotlin.jvm.internal.o.g(timeLineObject, "<this>");
        r45.a90 a90Var = timeLineObject.ContentObj;
        java.util.LinkedList linkedList = a90Var != null ? a90Var.f369840h : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return linkedList;
    }

    public final void U(android.view.ViewGroup.LayoutParams layoutParams) {
        xc4.p n17;
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null || (h17 = n17.h1()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        android.util.Pair l17 = m21.y.l(h17, getContext(), false);
        java.lang.Object first = l17.first;
        kotlin.jvm.internal.o.f(first, "first");
        layoutParams.width = ((java.lang.Number) first).intValue();
        java.lang.Object second = l17.second;
        kotlin.jvm.internal.o.f(second, "second");
        layoutParams.height = ((java.lang.Number) second).intValue();
        x("MicroMsg.Improve.VideoTimelineItem", "width:" + l17.first + " height:" + l17.second);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        xc4.p n17;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject;
        int i18;
        xc4.p n18;
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject h18 = n17.h1();
        java.util.List T = T(h18);
        if (T == null || T.isEmpty()) {
            w("MicroMsg.Improve.VideoTimelineItem", "play error, null media");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) kz5.n0.X(T);
        if (jj4Var.f377856e == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.VideoTimelineItem", "background video no auto play");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        android.view.View view = this.B1;
        if (view == null) {
            str = com.tencent.tav.core.AssetExtension.SCENE_PLAY;
            timeLineObject = h18;
            i18 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            java.lang.Object[] array = arrayList.toArray();
            str = com.tencent.tav.core.AssetExtension.SCENE_PLAY;
            timeLineObject = h18;
            i18 = 0;
            yj0.a.d(view, array, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout improveVideoFrameLayout = this.f417393z1;
        if (improveVideoFrameLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        } else {
            zc4.b data2 = getData();
            if (data2 == null || (n18 = data2.n()) == null || (h17 = n18.h1()) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            } else {
                if (improveVideoFrameLayout.getChildCount() == 0) {
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView b17 = xd4.o0.d().b(h17.Id);
                    if (b17 != null) {
                        if (b17.getParent() != null && b17.getParent() != improveVideoFrameLayout) {
                            b17.f170645q2 = true;
                            android.view.ViewParent parent = b17.getParent();
                            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                            ((android.view.ViewGroup) parent).removeView(b17);
                        }
                        if (b17.getParent() == null) {
                            improveVideoFrameLayout.addView(b17, new android.widget.FrameLayout.LayoutParams(-1, -1));
                            x("MicroMsg.Improve.VideoTimelineItem", "lxl reAttach succ");
                        }
                    } else {
                        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView c17 = xd4.o0.d().c(getContext());
                        if (c17.getParent() != null) {
                            c17.b0();
                            c17.f170645q2 = true;
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) c17.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(c17);
                            }
                        }
                        improveVideoFrameLayout.addView(c17, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        c17.setThumbViewScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                        x("MicroMsg.Improve.VideoTimelineItem", "SnsVideoViewMgr getAvailableVideoView:" + c17);
                    }
                }
                this.C1 = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) improveVideoFrameLayout.getChildAt(i18);
                x("MicroMsg.Improve.VideoTimelineItem", "setupVideoView video view:" + this.C1);
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.C1;
                if (snsTimelineVideoView != null) {
                    snsTimelineVideoView.setVisibility(i18);
                }
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView2 = this.C1;
                if (snsTimelineVideoView2 != null) {
                    snsTimelineVideoView2.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
                }
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView3 = this.C1;
                if (snsTimelineVideoView3 != null) {
                    snsTimelineVideoView3.setVideoCallback(null);
                }
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView4 = this.C1;
                if (snsTimelineVideoView4 != null) {
                    snsTimelineVideoView4.setWindowType(1);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            }
        }
        xd4.j0 j0Var = new xd4.j0();
        j0Var.f453659a = jj4Var;
        j0Var.f453660b = n17.W0();
        j0Var.f453662d = n17.a1();
        j0Var.f453661c = n17.getCreateTime();
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView5 = this.C1;
        if (snsTimelineVideoView5 != null) {
            snsTimelineVideoView5.setWindowType(1);
        }
        ka4.n.f306147a.c(n17.c1(), j0Var.f453659a, true);
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView6 = this.C1;
        if (snsTimelineVideoView6 != null) {
            snsTimelineVideoView6.setFirstFrameRenderCallback(new tc4.j4(this));
        }
        xd4.o0.d().k(this.C1, j0Var, "", 0, true, timeLineObject.Id);
        xd4.g.a().c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        int[] iArr = new int[2];
        com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout improveVideoFrameLayout = this.f417393z1;
        if (improveVideoFrameLayout != null) {
            improveVideoFrameLayout.getLocationOnScreen(iArr);
        }
        int i17 = iArr[0];
        int i18 = iArr[1];
        com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout improveVideoFrameLayout2 = this.f417393z1;
        int measuredWidth = improveVideoFrameLayout2 != null ? improveVideoFrameLayout2.getMeasuredWidth() : 0;
        com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout improveVideoFrameLayout3 = this.f417393z1;
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, measuredWidth + i17, (improveVideoFrameLayout3 != null ? improveVideoFrameLayout3.getMeasuredHeight() : 0) + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return rect;
    }

    @Override // tc4.d2
    public com.tencent.mm.memory.ui.QPictureView getTagImgView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = this.A1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return maskImageView;
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // tc4.v0, uc4.f1, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(in5.s0 r21, zc4.b r22, int r23, boolean r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.k4.h(in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(pc4.d.f353410a.x() ? com.tencent.mm.R.layout.ep6 : com.tencent.mm.R.layout.csr, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f417392y1 = viewGroup;
        com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout improveVideoFrameLayout = (com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.f485335hc0);
        this.f417393z1 = improveVideoFrameLayout;
        if (improveVideoFrameLayout != null) {
            improveVideoFrameLayout.setVideoRemoveCallback(new tc4.c4(this));
        }
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = (com.tencent.mm.plugin.sns.ui.MaskImageView) viewGroup.findViewById(com.tencent.mm.R.id.f485336hc1);
        this.A1 = maskImageView;
        if (maskImageView != null) {
            maskImageView.setScaleType(al5.q2.CENTER_CROP);
        }
        this.B1 = viewGroup.findViewById(com.tencent.mm.R.id.hbz);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, 0);
        U(layoutParams);
        jz5.l lVar = new jz5.l(viewGroup, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return "VideoImproveTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        super.o();
        android.view.ViewGroup viewGroup = this.f417392y1;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        U(layoutParams);
        android.view.ViewGroup viewGroup2 = this.f417392y1;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        super.onAttachedToWindow();
        android.view.View view = this.B1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem", "onAttachedToWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem", "onAttachedToWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = this.A1;
        if (maskImageView != null) {
            maskImageView.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }
}
