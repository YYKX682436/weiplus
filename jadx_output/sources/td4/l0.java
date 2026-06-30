package td4;

/* loaded from: classes4.dex */
public final class l0 extends com.tencent.mm.plugin.sns.ui.o {

    /* renamed from: c, reason: collision with root package name */
    public final int f417698c;

    /* renamed from: d, reason: collision with root package name */
    public final td4.k0 f417699d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f417700e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f417701f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f417702g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f417703h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f417704i;

    public l0(int i17, td4.k0 k0Var, java.lang.String mUserName, boolean z17) {
        kotlin.jvm.internal.o.g(mUserName, "mUserName");
        this.f417698c = i17;
        this.f417699d = k0Var;
        this.f417700e = mUserName;
        this.f417701f = z17;
        this.f417702g = new java.util.LinkedList();
        this.f417703h = "";
        this.f417704i = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01cb, code lost:
    
        if (r1.moveToFirst() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01cd, code lost:
    
        r3 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        r3.convertFrom(r1);
        r5.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01dc, code lost:
    
        if (r1.moveToNext() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01de, code lost:
    
        r1.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsPicForCountByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b8, code lost:
    
        if (r4.moveToFirst() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ba, code lost:
    
        r6 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        r6.convertFrom(r4);
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c9, code lost:
    
        if (r4.moveToNext() != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00cb, code lost:
    
        r4.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsListForCountByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0253 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.sns.ui.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List b() {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: td4.l0.b():java.util.List");
    }

    @Override // com.tencent.mm.plugin.sns.ui.o
    public void c(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        kotlin.jvm.internal.o.g(list, "list");
        td4.k0 k0Var = this.f417699d;
        if (k0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$initSnsAlbumAdapterHelper$1");
            td4.g0 g0Var = ((td4.z) k0Var).f417755a;
            g0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAdapterData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateByDataSetChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if (list.isEmpty()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateByDataSetChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            } else {
                g0Var.R();
                int size = g0Var.N().size();
                g0Var.N().addAll(list);
                g0Var.notifyItemRangeInserted(size, g0Var.N().size() - size);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateByDataSetChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdapterData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLoadDataFinishCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            td4.k kVar = g0Var.f417674p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLoadDataFinishCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if (kVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$2");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerUI", "Adapter onLoadDataFinish callback to UI ，list count = " + list.size());
                boolean isEmpty = list.isEmpty();
                com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = ((td4.i1) kVar).f417693a;
                if (!isEmpty || com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI).getItemCount() > 0) {
                    com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Y6(snsAlbumPickerUI).setVisibility(0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    android.widget.TextView g76 = snsAlbumPickerUI.g7();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    g76.setVisibility(8);
                } else {
                    com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Y6(snsAlbumPickerUI).setVisibility(4);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    android.widget.TextView g77 = snsAlbumPickerUI.g7();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    g77.setVisibility(0);
                    if (!com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Z6(snsAlbumPickerUI)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                        android.widget.TextView g78 = snsAlbumPickerUI.g7();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                        g78.setText(snsAlbumPickerUI.getString(com.tencent.mm.R.string.j98));
                    }
                }
                if (list.isEmpty() && com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Z6(snsAlbumPickerUI)) {
                    com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.X6(snsAlbumPickerUI);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$2");
            }
            if (!td4.g0.L(g0Var).isEmpty()) {
                long j17 = ((td4.f2) kz5.n0.i0(td4.g0.L(g0Var))).a().field_snsId;
            }
            g0Var.x();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$initSnsAlbumAdapterHelper$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
    }

    public final boolean d(td4.f2 info) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        kotlin.jvm.internal.o.g(info, "info");
        boolean z17 = kotlin.jvm.internal.o.b(info.b().f377855d, "-4") && info.a().getCreateTime() == -4 && info.a().getTypeFlag() == -4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        return z17;
    }

    public final boolean e(td4.f2 info) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTimeInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        kotlin.jvm.internal.o.g(info, "info");
        boolean z17 = kotlin.jvm.internal.o.b(info.b().f377855d, "-1") && info.a().getCreateTime() == -1 && info.a().getTypeFlag() == -1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTimeInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        return z17;
    }
}
