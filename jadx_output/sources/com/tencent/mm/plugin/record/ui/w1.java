package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class w1 implements com.tencent.mm.ui.tools.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155596a;

    public w1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI) {
        this.f155596a = recordMsgImageUI;
    }

    @Override // com.tencent.mm.ui.tools.p5
    public void a() {
        int i17 = com.tencent.mm.plugin.record.ui.RecordMsgImageUI.f155309J;
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155596a;
        if (!recordMsgImageUI.X6()) {
            if (recordMsgImageUI.isFinishing() || recordMsgImageUI.activityHasDestroyed()) {
                return;
            }
            recordMsgImageUI.Y6(false);
            return;
        }
        if (recordMsgImageUI.f155325v.f101302d == 1) {
            return;
        }
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
        c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(recordMsgImageUI.f155314h.getXDown()));
        c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(recordMsgImageUI.f155314h.getYDown()));
        com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
        galleryTranslateReportStruct.f58317e = 1L;
        galleryTranslateReportStruct.f58318f = 5L;
        int selectedItemPosition = recordMsgImageUI.f155314h.getSelectedItemPosition();
        if (-1 != selectedItemPosition) {
            r45.gp0 n17 = recordMsgImageUI.f155315i.getItem(selectedItemPosition).n();
            galleryTranslateReportStruct.q(n17.f375434s);
            galleryTranslateReportStruct.p(n17.f375438u);
        }
        galleryTranslateReportStruct.k();
        int i18 = recordMsgImageUI.f155325v.f101302d;
        if (i18 == 0 || i18 == 2) {
            recordMsgImageUI.Y6(com.tencent.mm.plugin.scanner.k1.c());
        } else {
            recordMsgImageUI.Y6(false);
        }
    }
}
