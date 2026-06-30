package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class t implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191901a;

    public t(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191901a = appChooserUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public void onDismiss() {
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191901a;
        if (appChooserUI.f191344r) {
            appChooserUI.f191343q = appChooserUI.f191341p;
        }
    }
}
