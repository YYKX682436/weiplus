package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class n1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155457d;

    public n1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI) {
        this.f155457d = recordMsgImageUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155457d;
        if (itemId == 0) {
            int i18 = com.tencent.mm.plugin.record.ui.RecordMsgImageUI.f155309J;
            recordMsgImageUI.f155319p = recordMsgImageUI.W6();
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            jd5.a aVar = new jd5.a();
            java.lang.String str = recordMsgImageUI.f155319p;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            aVar.p(str != null ? str : "");
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(recordMsgImageUI, aVar, n13.r.a(1001));
            return;
        }
        if (itemId == 1) {
            recordMsgImageUI.T6();
            return;
        }
        if (itemId == 2) {
            int i19 = com.tencent.mm.plugin.record.ui.RecordMsgImageUI.f155309J;
            recordMsgImageUI.getClass();
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String W6 = recordMsgImageUI.W6();
            androidx.appcompat.app.AppCompatActivity context = recordMsgImageUI.getContext();
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.a(W6, context, null);
            return;
        }
        if (itemId == 4) {
            if (com.tencent.mm.sdk.platformtools.f9.ContextTranslate.k(recordMsgImageUI.getContext(), null)) {
                com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
                galleryTranslateReportStruct.f58317e = 3L;
                galleryTranslateReportStruct.f58318f = 5L;
                int selectedItemPosition = recordMsgImageUI.f155314h.getSelectedItemPosition();
                if (-1 != selectedItemPosition) {
                    com.tencent.mm.plugin.fav.ui.gallery.r item = recordMsgImageUI.f155315i.getItem(selectedItemPosition);
                    galleryTranslateReportStruct.q(item.f());
                    galleryTranslateReportStruct.p(item.e());
                }
                galleryTranslateReportStruct.k();
                recordMsgImageUI.f155325v.a();
                return;
            }
            return;
        }
        if (itemId != 5) {
            return;
        }
        int i27 = com.tencent.mm.plugin.record.ui.RecordMsgImageUI.f155309J;
        java.lang.String W62 = recordMsgImageUI.W6();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "edit image path:%s msgId:%s", W62, java.lang.Long.valueOf(recordMsgImageUI.f155317n));
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(W62, "");
        b17.F = 0;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("plugin_filter", bool);
        hashMap.put("plugin_poi", bool);
        hashMap.put("plugin_tip", bool);
        hashMap.put("plugin_menu", bool);
        b17.f155677o = uICustomParam;
        ut3.m.f431182a.f(recordMsgImageUI.getContext(), 4369, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 2);
    }
}
