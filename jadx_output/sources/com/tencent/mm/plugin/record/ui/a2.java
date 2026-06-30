package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class a2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.g2 f155347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155349g;

    public a2(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI, java.util.List list, com.tencent.mm.plugin.record.ui.g2 g2Var, java.util.List list2) {
        this.f155349g = recordMsgImageUI;
        this.f155346d = list;
        this.f155347e = g2Var;
        this.f155348f = list2;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155349g;
        recordMsgImageUI.f155321r.o(null);
        g4Var.clear();
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f155346d;
            if (i17 >= list.size()) {
                return;
            }
            if (((java.lang.Integer) list.get(i17)).intValue() == 3) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = recordMsgImageUI.f155321r;
                recordMsgImageUI.getClass();
                com.tencent.mm.plugin.record.ui.g2 g2Var = this.f155347e;
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = g2Var.f155395a;
                com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
                int c17 = s6Var.c(recogQBarOfImageFileResultEvent);
                int d17 = s6Var.d(recogQBarOfImageFileResultEvent);
                java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent);
                com.tencent.mm.plugin.record.ui.d2 d2Var = new com.tencent.mm.plugin.record.ui.d2(recordMsgImageUI, recogQBarOfImageFileResultEvent, e17, c17, d17);
                if (!g2Var.f155396b) {
                    g2Var.f155396b = true;
                    ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) recordMsgImageUI.f155326w).h(c17, e17);
                }
                k0Var.o(((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) recordMsgImageUI.f155326w).b(d2Var, c17, e17, 5));
            } else {
                g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f155348f.get(i17));
            }
            i17++;
        }
    }
}
