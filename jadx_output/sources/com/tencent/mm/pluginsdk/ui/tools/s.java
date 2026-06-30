package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class s implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191882a;

    public s(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191882a = appChooserUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public void onDismiss() {
        this.f191882a.finish();
    }
}
