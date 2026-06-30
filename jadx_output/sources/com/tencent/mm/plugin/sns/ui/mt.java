package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class mt implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUIAction f169948d;

    public mt(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        this.f169948d = snsUIAction;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x043d  */
    @Override // android.widget.AbsListView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScroll(android.widget.AbsListView r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.mt.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        n52.e eVar;
        com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUIAction$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = this.f169948d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.iv ivVar = (com.tencent.mm.plugin.sns.ui.iv) com.tencent.mm.plugin.sns.ui.SnsUIAction.c(this.f169948d);
        ivVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onListViewScoll", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onListViewScoll %s", java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            com.tencent.mm.hardcoder.WXHardCoderJNI wXHardCoderJNI = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance();
            boolean hcSNSUserScrollEnable = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSUserScrollEnable();
            com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = ivVar.f169448a;
            int i18 = com.tencent.mm.plugin.sns.ui.SnsUserUI.V;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            int i19 = snsUserUI.f167605q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            wXHardCoderJNI.stopPerformance(hcSNSUserScrollEnable, i19);
            int startPerformance = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSUserScrollEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSUserScrollDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSUserScrollCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSUserScrollIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSUserScrollThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSUserScrollTimeout(), 704, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSNSUserScrollAction(), "MicroMsg.SnsUserUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            snsUserUI.f167605q = startPerformance;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            int i27 = snsUserUI.f167605q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "summer hardcoder sns startPerformance [%s]", java.lang.Integer.valueOf(i27));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onListViewScoll", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f169948d.f167492p;
            if (snsHeader != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                com.tencent.mm.plugin.sns.ui.dj djVar = snsHeader.f167165d;
                if (djVar != null && (snsStoryHeaderView = djVar.f168188e) != null && !snsHeader.f167179u) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                    snsStoryHeaderView.a();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
            com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction2 = this.f169948d;
            snsUIAction2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadVideo", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            snsUIAction2.f167482J.b();
            snsUIAction2.I.clear();
            int lastVisiblePosition = snsUIAction2.f167483d.getLastVisiblePosition();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "currentPosition :%d count:%d", java.lang.Integer.valueOf(lastVisiblePosition), java.lang.Integer.valueOf(snsUIAction2.f167483d.getCount()));
            int count = snsUIAction2.f167483d.getCount();
            if (count - lastVisiblePosition > 15) {
                count = lastVisiblePosition + 15;
            }
            while (lastVisiblePosition < count) {
                java.lang.Object itemAtPosition = snsUIAction2.f167483d.getItemAtPosition(lastVisiblePosition);
                if (itemAtPosition instanceof com.tencent.mm.plugin.sns.storage.SnsInfo) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) itemAtPosition;
                    if (snsInfo.getTypeFlag() == 15 && (!snsInfo.isAd() || n74.l0.a(snsInfo))) {
                        snsUIAction2.I.add(snsInfo);
                    }
                }
                lastVisiblePosition++;
            }
            ((ku5.t0) ku5.t0.f312615d).g(snsUIAction2.f167482J);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadVideo", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            if (this.f169948d.f167483d.getLastVisiblePosition() == this.f169948d.f167483d.getCount() - 1) {
                this.f169948d.e();
            }
        }
        if (i17 == 2) {
            this.f169948d.m(true);
        } else {
            this.f169948d.m(false);
        }
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction3 = this.f169948d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOnScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        n30.v vVar = snsUIAction3.Q;
        if (vVar != null && (eVar = ((n52.c) vVar).f335121a) != null) {
            eVar.a(absListView, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOnScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsUIAction$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction$3");
    }
}
