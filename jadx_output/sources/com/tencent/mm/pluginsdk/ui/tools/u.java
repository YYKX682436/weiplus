package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class u implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191935d;

    public u(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191935d = appChooserUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f191935d.finish();
    }
}
