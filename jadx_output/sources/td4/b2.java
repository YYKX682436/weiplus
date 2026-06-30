package td4;

/* loaded from: classes4.dex */
public final class b2 implements p94.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417636d;

    public b2(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f417636d = snsAlbumPickerUI;
    }

    @Override // p94.m0
    public void B4(java.lang.String str, java.lang.String str2, boolean z17, int i17, p94.d0 d0Var, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        com.tencent.mm.sdk.platformtools.n3 Tj = com.tencent.mm.plugin.sns.model.l4.Tj();
        int i18 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        java.lang.Runnable runnable = this.f417636d.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        Tj.removeCallbacks(runnable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
    }

    @Override // p94.m0
    public void O0(java.lang.String respMinSeq, boolean z17, int i17, p94.d0 pullSns) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        kotlin.jvm.internal.o.g(respMinSeq, "respMinSeq");
        kotlin.jvm.internal.o.g(pullSns, "pullSns");
        int i18 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = this.f417636d;
        int i19 = snsAlbumPickerUI.f170233o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.f170233o = i19 + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).I(respMinSeq);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerUI", "onFpSetSize , respMinSeq=" + respMinSeq + " , currentLimitSeq=" + com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).x() + " pullSns.isDownAll = " + pullSns.h());
        td4.g0 a76 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI);
        java.lang.String m17 = pullSns.m();
        if (m17 == null) {
            m17 = "";
        }
        a76.B(true, m17);
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).K(respMinSeq);
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).S();
        if (z17 || !com.tencent.mm.sdk.platformtools.t8.K0(pullSns.m())) {
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).T(true);
        } else {
            if (pullSns.f() != 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, java.lang.Long.valueOf(pullSns.f()));
                com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).E(pullSns.f());
            }
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Y6(snsAlbumPickerUI).postDelayed(new td4.z1(snsAlbumPickerUI, pullSns), 1000L);
            boolean z18 = !pullSns.h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI.f170235q = z18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            if (com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Z6(snsAlbumPickerUI) && com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.b7(snsAlbumPickerUI)) {
                com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.X6(snsAlbumPickerUI);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
    }

    @Override // p94.m0
    public void S0(java.lang.String respMinSeq, boolean z17, int i17, p94.d0 pullSns) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        kotlin.jvm.internal.o.g(respMinSeq, "respMinSeq");
        kotlin.jvm.internal.o.g(pullSns, "pullSns");
        com.tencent.mm.sdk.platformtools.n3 Tj = com.tencent.mm.plugin.sns.model.l4.Tj();
        int i18 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = this.f417636d;
        java.lang.Runnable runnable = snsAlbumPickerUI.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        Tj.removeCallbacks(runnable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.f170229h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        int i19 = snsAlbumPickerUI.f170233o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.f170233o = i19 + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).I(respMinSeq);
        td4.g0 a76 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI);
        java.lang.String m17 = pullSns.m();
        if (m17 == null) {
            m17 = "";
        }
        a76.B(true, m17);
        java.lang.String x17 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).x();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerUI", "onNpAddSize , respMinSeq=" + respMinSeq + " , currentLimitSeq=" + x17 + " , isDownAll=" + pullSns.h());
        if (z17) {
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).T(true);
        } else {
            if (pullSns.f() != 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, java.lang.Long.valueOf(pullSns.f()));
                com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).E(pullSns.f());
            }
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Y6(snsAlbumPickerUI).postDelayed(new td4.a2(snsAlbumPickerUI, pullSns), 1000L);
            boolean z18 = !pullSns.h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI.f170235q = z18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            if (!com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Z6(snsAlbumPickerUI) || kotlin.jvm.internal.o.b(respMinSeq, x17)) {
                snsAlbumPickerUI.setBounceEnabled(true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                if (snsAlbumPickerUI.f7().getItemCount() > 0) {
                    snsAlbumPickerUI.c7().setVisibility(0);
                    snsAlbumPickerUI.g7().setVisibility(8);
                } else {
                    snsAlbumPickerUI.c7().setVisibility(4);
                    snsAlbumPickerUI.g7().setVisibility(0);
                    snsAlbumPickerUI.g7().setText(snsAlbumPickerUI.getString(com.tencent.mm.R.string.j96));
                    if (!snsAlbumPickerUI.f170235q) {
                        snsAlbumPickerUI.g7().setText(snsAlbumPickerUI.getString(com.tencent.mm.R.string.j98));
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            } else {
                com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).K(respMinSeq);
                com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).S();
                if (com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.b7(snsAlbumPickerUI)) {
                    com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.X6(snsAlbumPickerUI);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
    }

    @Override // p94.m0
    public void e6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
    }
}
