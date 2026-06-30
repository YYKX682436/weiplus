package jq4;

/* loaded from: classes5.dex */
public final class e1 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog f301139a;

    public e1(com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog voipFloatCardPermissionDialog) {
        this.f301139a = voipFloatCardPermissionDialog;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        this.f301139a.finish();
    }
}
