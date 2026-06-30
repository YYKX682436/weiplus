package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class v implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.VoipScoreDialog f177194d;

    public v(com.tencent.mm.plugin.voip.widget.VoipScoreDialog voipScoreDialog) {
        this.f177194d = voipScoreDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.voip.widget.VoipScoreDialog voipScoreDialog = this.f177194d;
        com.tencent.mm.plugin.voip.widget.VoipScoreDialog.T6(voipScoreDialog, 2);
        voipScoreDialog.finish();
    }
}
