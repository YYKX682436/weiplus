package td4;

/* loaded from: classes4.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417751d;

    public x1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f417751d = snsAlbumPickerUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$showLoadingMoreFooter$1");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = this.f417751d;
        if (com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Z6(snsAlbumPickerUI)) {
            td4.g0 a76 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI);
            a76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if ((!a76.N().isEmpty()) && a76.P().d((td4.f2) kz5.n0.i0(a76.N()))) {
                yz5.a aVar = a76.f417678t;
                if (aVar != null) {
                    aVar.invoke();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            } else {
                if (!a76.N().isEmpty()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                    td4.h0 y17 = a76.y();
                    y17.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAllPageDataLoadFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                    boolean z17 = y17.f417690e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAllPageDataLoadFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                    if (!z17) {
                        java.util.List N = a76.N();
                        a76.P().getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsPickerLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                        snsInfo.setCreateTime(-4);
                        snsInfo.setTypeFlag(-4);
                        r45.jj4 jj4Var = new r45.jj4();
                        jj4Var.f377855d = "-4";
                        td4.f2 f2Var = new td4.f2(snsInfo, jj4Var);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsPickerLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                        N.add(f2Var);
                        a76.notifyItemInserted(a76.N().size() - 1);
                        yz5.a aVar2 = a76.f417678t;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$showLoadingMoreFooter$1");
    }
}
