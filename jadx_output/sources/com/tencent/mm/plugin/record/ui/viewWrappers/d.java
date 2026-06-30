package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes12.dex */
public class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.i f155507d;

    public d(com.tencent.mm.plugin.record.ui.viewWrappers.i iVar) {
        this.f155507d = iVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent;
        g4Var.clear();
        com.tencent.mm.plugin.record.ui.viewWrappers.i iVar = this.f155507d;
        iVar.f155518i.f155539c.o(null);
        if (iVar.f155516g.X1 == 0) {
            if (iVar.f155515f.t0()) {
                g4Var.f(2, iVar.f155513d.getString(com.tencent.mm.R.string.ccw));
            }
            if (iVar.f155515f.u0()) {
                g4Var.f(1, iVar.f155513d.getString(com.tencent.mm.R.string.cbx));
            }
            g4Var.f(3, iVar.f155513d.getString(com.tencent.mm.R.string.ccr));
            com.tencent.mm.plugin.record.ui.viewWrappers.l lVar = (com.tencent.mm.plugin.record.ui.viewWrappers.l) ((java.util.HashMap) iVar.f155518i.f155541e).get(iVar.f155517h);
            if (lVar == null || (recogQBarOfImageFileResultEvent = lVar.f155535a) == null) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
                aqVar.f6174a = currentTimeMillis;
                aqVar.f6175b = iVar.f155517h;
                recogQBarOfImageFileEvent.e();
                return;
            }
            com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
            s6Var.e(recogQBarOfImageFileResultEvent);
            com.tencent.mm.plugin.record.ui.viewWrappers.m mVar = iVar.f155518i;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = mVar.f155539c;
            android.content.Context context = iVar.f155513d;
            mVar.getClass();
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = lVar.f155535a;
            java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent2);
            int c17 = s6Var.c(recogQBarOfImageFileResultEvent2);
            com.tencent.mm.plugin.record.ui.viewWrappers.j jVar = new com.tencent.mm.plugin.record.ui.viewWrappers.j(mVar, recogQBarOfImageFileResultEvent2, context, e17, c17, s6Var.d(recogQBarOfImageFileResultEvent2));
            boolean z17 = lVar.f155536b;
            kd0.p2 p2Var = mVar.f155542f;
            if (!z17) {
                lVar.f155536b = true;
                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).h(c17, e17);
            }
            k0Var.o(((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).b(jVar, c17, e17, 5));
        }
    }
}
