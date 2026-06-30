package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a50 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.a50 f133735d = new com.tencent.mm.plugin.finder.viewmodel.component.a50();

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.finder.report.p2.f125237a.C(6, null);
        ez0.i iVar = (ez0.i) ((uy0.h) i95.n0.c(uy0.h.class));
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", "enter destroyEngine");
        iVar.f257806d = null;
    }
}
