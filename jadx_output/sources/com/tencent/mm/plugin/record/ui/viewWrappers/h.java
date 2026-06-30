package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes12.dex */
public class h implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.i f155512d;

    public h(com.tencent.mm.plugin.record.ui.viewWrappers.i iVar) {
        this.f155512d = iVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) this.f155512d.f155518i.f155542f).n();
    }
}
