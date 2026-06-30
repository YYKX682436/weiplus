package n74;

/* loaded from: classes4.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewGroup f335379a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.j0 f335380b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper f335381c;

    public final void a(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        b(context, snsInfo, view, i17, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
    }

    public final void b(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view, int i17, boolean z17) {
        boolean z18;
        android.view.ViewStub viewStub;
        android.view.ViewStub viewStub2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            return;
        }
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            return;
        }
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper$Companion");
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        if ((adXml != null ? adXml.adLiveInfo : null) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper$Companion");
            z18 = false;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper$Companion");
            z18 = true;
        }
        if (z18) {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
            kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
            if (this.f335379a == null && (viewStub2 = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.f482656ke)) != null) {
                android.view.View h17 = a84.y0.h(viewStub2);
                this.f335379a = h17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) h17 : null;
            }
            if (this.f335379a == null) {
                com.tencent.mars.xlog.Log.e("SnsAdLivingStatusHelper", "livingStatusLayout is null, maybe inflateViewStub error");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleLivingStatusController", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            if (this.f335380b == null) {
                this.f335380b = new com.tencent.mm.plugin.sns.ad.widget.living.j0(this.f335379a, null, null);
            }
            if (this.f335380b != null) {
                s34.r0 r0Var = snsInfo.getAdXml().adLiveInfo;
                int c17 = com.tencent.mm.plugin.sns.ad.widget.living.i0.c(timeLine.Id, r0Var.f402745a);
                com.tencent.mm.plugin.sns.ad.widget.living.j0 j0Var = this.f335380b;
                if (j0Var != null) {
                    j0Var.g(timeLine.Id, r0Var);
                }
                com.tencent.mm.plugin.sns.ad.widget.living.j0 j0Var2 = this.f335380b;
                if (j0Var2 != null) {
                    j0Var2.h(c17);
                }
                com.tencent.mars.xlog.Log.i("SnsAdLivingStatusHelper", "snsId is " + timeLine.Id + ", current living status is " + c17 + ", liveInfo finderUsername is " + r0Var.f402747c + ", liveInfo id is " + r0Var.f402748d);
                com.tencent.mm.plugin.sns.ad.widget.living.i0.a(timeLine.Id, this.f335380b);
                if (!com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(snsInfo)) {
                    e74.i.f().d(i17, snsInfo);
                }
                if (z17) {
                    boolean f17 = com.tencent.mm.plugin.sns.ad.widget.living.j0.f(c17);
                    java.lang.String str = timeLine.Id;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
                    if (str == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
                    } else {
                        if (com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.e(r0Var, f17)) {
                            if (this.f335381c == null && (viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.f482648k6)) != null) {
                                android.view.View h18 = a84.y0.h(viewStub);
                                this.f335381c = h18 instanceof com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper ? (com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper) h18 : null;
                            }
                            int b17 = i65.a.b(context, 60);
                            int b18 = i65.a.b(context, 35);
                            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = this.f335381c;
                            if (finderLivingAnimWrapper != null) {
                                finderLivingAnimWrapper.d(r0Var, str, b17, b18);
                            }
                            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper2 = this.f335381c;
                            if (finderLivingAnimWrapper2 != null) {
                                finderLivingAnimWrapper2.setVisibility(0);
                            }
                        } else {
                            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper3 = this.f335381c;
                            if (finderLivingAnimWrapper3 != null) {
                                finderLivingAnimWrapper3.setVisibility(8);
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleLivingStatusController", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        } else {
            android.view.ViewGroup viewGroup = this.f335379a;
            if (viewGroup != null) {
                a84.y0.p(viewGroup, false);
            }
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper4 = this.f335381c;
            if (finderLivingAnimWrapper4 != null) {
                a84.y0.p(finderLivingAnimWrapper4, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
    }

    public final void c(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillLivingViewInfoForPhotoAd", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfoForPhotoAd", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            return;
        }
        if (snsInfo.isAd() && i18 == 2) {
            b(context, snsInfo, view, i17, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfoForPhotoAd", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            return;
        }
        android.view.ViewGroup viewGroup = this.f335379a;
        if (viewGroup != null) {
            a84.y0.p(viewGroup, false);
        }
        com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = this.f335381c;
        if (finderLivingAnimWrapper != null) {
            a84.y0.p(finderLivingAnimWrapper, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfoForPhotoAd", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
    }
}
