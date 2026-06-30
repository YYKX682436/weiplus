package ee4;

/* loaded from: classes4.dex */
public final class d1 extends com.tencent.mm.plugin.sns.ui.u4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ee4.e1 f251698a;

    public d1(ee4.e1 e1Var) {
        this.f251698a = e1Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.u4
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$previewImageClick$1");
        ee4.e1 e1Var = this.f251698a;
        e1Var.f("onItemClick : " + i17);
        if (i17 < 0) {
            ee4.e eVar = (ee4.e) e1Var.a(ee4.e.class);
            eVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClickAdd", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
            if (!gm0.j1.u().l()) {
                db5.t7.k(eVar.c(), null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickAdd", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
            } else if (eVar.m().v().f() >= 9) {
                db5.e1.i(eVar.c(), com.tencent.mm.R.string.jgz, com.tencent.mm.R.string.f490573yv);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickAdd", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
            } else {
                if (com.tencent.mm.plugin.sns.ui.ws.a()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGoAlbumPc", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicBasePc");
                    ee4.m0 m0Var = (ee4.m0) ((jz5.n) eVar.f251748h).getValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGoAlbumPc", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicBasePc");
                    m0Var.p();
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
                    eVar.f("showAddPicDialog: ");
                    try {
                        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) eVar.c(), 1, false);
                        k0Var.f211872n = new ee4.c(eVar);
                        k0Var.f211881s = new ee4.d(eVar);
                        k0Var.v();
                    } catch (java.lang.Exception e17) {
                        eVar.e("showAddPicDialog exception >> " + e17.getMessage());
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickAdd", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc");
            }
        } else {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            com.tencent.mm.ui.MMActivity c17 = e1Var.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            intent.setClass(c17, com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI.class);
            intent.putExtra("sns_gallery_position", i17);
            intent.putParcelableArrayListExtra("sns_temp_multi_pic_items", new java.util.ArrayList<>(e1Var.m().v().e()));
            intent.putExtra("key_from_scene", 7);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            com.tencent.mm.ui.MMActivity c18 = e1Var.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            c18.startActivityForResult(intent, 7);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$previewImageClick$1");
    }
}
