package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class s implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.VoipScoreDialog f177191d;

    public s(com.tencent.mm.plugin.voip.widget.VoipScoreDialog voipScoreDialog) {
        this.f177191d = voipScoreDialog;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f177191d.finish();
    }
}
