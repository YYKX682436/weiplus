package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public class j0 implements com.tencent.mm.plugin.sns.ad.widget.living.g0, com.tencent.mm.plugin.sns.ad.widget.living.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout f163727a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout f163728b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f163729c;

    /* renamed from: d, reason: collision with root package name */
    public s34.r0 f163730d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.w4 f163731e;

    /* renamed from: f, reason: collision with root package name */
    public int f163732f = 0;

    public j0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout, com.tencent.mm.plugin.sns.ui.w4 w4Var) {
        try {
            this.f163727a = (com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout) viewGroup;
            this.f163728b = livingDescBarLayout;
            this.f163731e = w4Var;
        } catch (java.lang.Throwable unused) {
        }
    }

    public static boolean f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLivingNow", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivingMainStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        int i18 = i17 & 127;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingMainStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        boolean z17 = i18 == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLivingNow", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ad.widget.living.h0
    public void a(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLiveStatusChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        if (this.f163729c.equals(str) && this.f163732f != i18) {
            h(i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLiveStatusChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    @Override // com.tencent.mm.plugin.sns.ad.widget.living.g0
    public java.lang.String b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        java.util.List c17 = c();
        if (c17 == null || i17 < 0 || i17 >= c17.size()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return "";
        }
        java.lang.String str = (java.lang.String) c17.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return str;
    }

    public java.util.List c() {
        java.util.List list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentStatusDescriptionList", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        int i17 = this.f163732f & 127;
        s34.r0 r0Var = this.f163730d;
        if (r0Var != null) {
            if (i17 == 1) {
                list = r0Var.f402749e;
            } else if (i17 == 2) {
                list = r0Var.f402750f;
            } else if (i17 == 3) {
                list = r0Var.f402751g;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentStatusDescriptionList", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return list;
        }
        list = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentStatusDescriptionList", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return list;
    }

    public java.lang.String d(int i17) {
        android.content.Context context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getString", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout = this.f163728b;
        if (livingDescBarLayout != null) {
            context = livingDescBarLayout.getContext();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            context = null;
        }
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getString", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return "";
        }
        java.lang.String string = context.getString(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getString", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return string;
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideAllLivingUI", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.tencent.mars.xlog.Log.i("SnsAd.LivingStatusController", "hideAllLivingUI");
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout = this.f163728b;
        if (livingDescBarLayout != null) {
            livingDescBarLayout.setVisibility(8);
            livingDescBarLayout.c();
        }
        com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout livingStatusLayout = this.f163727a;
        if (livingStatusLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(livingStatusLayout, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/living/SnsAdLivingStatusController", "hideAllLivingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            livingStatusLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(livingStatusLayout, "com/tencent/mm/plugin/sns/ad/widget/living/SnsAdLivingStatusController", "hideAllLivingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideAllLivingUI", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    public void finalize() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finalize", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        super.finalize();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finalize", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    public void g(java.lang.String str, s34.r0 r0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        this.f163729c = str;
        this.f163730d = r0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    @Override // com.tencent.mm.plugin.sns.ad.widget.living.g0
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        java.util.List c17 = c();
        int size = c17 != null ? c17.size() : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return size;
    }

    public void h(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        int i18 = this.f163732f;
        com.tencent.mars.xlog.Log.i("SnsAd.LivingStatusController", "setLiveStatus, oldStatus=" + i18 + ", newStatus=" + i17);
        if (i17 != i18) {
            this.f163732f = i17;
            if (i17 == 0) {
                e();
            } else {
                k(i17);
                i(i17);
                j();
            }
        } else if (i17 == 0) {
            e();
        } else {
            k(i17);
            i(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupLiveDescLayoutAdapterWhenStatusNotChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout = this.f163728b;
            if (livingDescBarLayout == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupLiveDescLayoutAdapterWhenStatusNotChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            } else {
                if (livingDescBarLayout.a()) {
                    j();
                } else {
                    livingDescBarLayout.b();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupLiveDescLayoutAdapterWhenStatusNotChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "setupActionButtonStateAndText"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.w4 r2 = r6.f163731e
            if (r2 == 0) goto L59
            r3 = r7 & 127(0x7f, float:1.78E-43)
            r4 = 65280(0xff00, float:9.1477E-41)
            r7 = r7 & r4
            int r7 = r7 >> 8
            r4 = 2
            r5 = 1
            if (r3 != r5) goto L2b
            if (r7 != r4) goto L23
            r7 = 2131776630(0x7f105476, float:1.9184738E38)
            java.lang.String r7 = r6.d(r7)
            r3 = 0
            goto L4d
        L23:
            r7 = 2131776657(0x7f105491, float:1.9184793E38)
            java.lang.String r7 = r6.d(r7)
            goto L4c
        L2b:
            if (r3 != r4) goto L35
            r7 = 2131776652(0x7f10548c, float:1.9184782E38)
            java.lang.String r7 = r6.d(r7)
            goto L4c
        L35:
            r4 = 3
            if (r3 != r4) goto L4a
            if (r7 != r4) goto L42
            r7 = 2131776654(0x7f10548e, float:1.9184786E38)
            java.lang.String r7 = r6.d(r7)
            goto L4c
        L42:
            r7 = 2131776656(0x7f105490, float:1.918479E38)
            java.lang.String r7 = r6.d(r7)
            goto L4c
        L4a:
            java.lang.String r7 = ""
        L4c:
            r3 = r5
        L4d:
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L59
            r2.b(r7)
            r2.a(r5, r3)
        L59:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.widget.living.j0.i(int):void");
    }

    public void j() {
        android.content.Context context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupLiveDescLayoutAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.tencent.mars.xlog.Log.i("SnsAd.LivingStatusController", "setupLiveDescLayoutAdapter");
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout = this.f163728b;
        if (livingDescBarLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupLiveDescLayoutAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return;
        }
        int count = getCount();
        com.tencent.mars.xlog.Log.i("SnsAd.LivingStatusController", "descCount=" + count);
        if (count == 0) {
            com.tencent.mars.xlog.Log.i("SnsAd.LivingStatusController", "hide liveDescLayout");
            livingDescBarLayout.setVisibility(4);
            livingDescBarLayout.c();
        } else {
            livingDescBarLayout.setVisibility(0);
            livingDescBarLayout.setSlideAdapter(this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            if (livingDescBarLayout != null) {
                context = livingDescBarLayout.getContext();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
                context = null;
            }
            if (ca4.m0.Z(context)) {
                com.tencent.mars.xlog.Log.i("SnsAd.LivingStatusController", "isAdapterElder, hide liveDescLayout");
                livingDescBarLayout.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupLiveDescLayoutAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    public void k(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupLiveStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout livingStatusLayout = this.f163727a;
        if (livingStatusLayout != null) {
            livingStatusLayout.setVisibility(0);
            livingStatusLayout.setLiveStatus(i17);
        }
        com.tencent.mars.xlog.Log.i("SnsAd.LivingStatusController", "setupLiveStatusContent, liveStatus=" + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupLiveStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }
}
