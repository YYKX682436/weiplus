package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.VoipScoreDialog f177193d;

    public u(com.tencent.mm.plugin.voip.widget.VoipScoreDialog voipScoreDialog) {
        this.f177193d = voipScoreDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.voip.widget.VoipScoreDialog voipScoreDialog = this.f177193d;
        com.tencent.mm.plugin.voip.widget.VoipScoreDialog.T6(voipScoreDialog, 3);
        com.tencent.mm.ui.widget.snackbar.j.b(voipScoreDialog, null, voipScoreDialog.getString(com.tencent.mm.R.string.f493477kd4), new com.tencent.mm.plugin.voip.widget.t(this));
        com.tencent.mm.ui.widget.dialog.j0 j0Var = voipScoreDialog.f177127g;
        if (j0Var != null) {
            j0Var.dismiss();
        }
    }
}
