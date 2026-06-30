package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class r implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.VoipScoreDialog f177190a;

    public r(com.tencent.mm.plugin.voip.widget.VoipScoreDialog voipScoreDialog) {
        this.f177190a = voipScoreDialog;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.voip.widget.VoipScoreDialog voipScoreDialog = this.f177190a;
        com.tencent.mm.plugin.voip.widget.VoipScoreDialog.T6(voipScoreDialog, 1);
        voipScoreDialog.finish();
    }
}
