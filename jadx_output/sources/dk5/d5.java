package dk5;

/* loaded from: classes9.dex */
public class d5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f234592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234593e;

    public d5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, java.lang.Object obj) {
        this.f234593e = sendAppMessageWrapperUI;
        this.f234592d = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.pluginsdk.model.c3 c3Var = (com.tencent.mm.pluginsdk.model.c3) this.f234592d;
        c3Var.f189266t = true;
        c3Var.interrupt();
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234593e;
        sendAppMessageWrapperUI.setResult(-1);
        sendAppMessageWrapperUI.finish();
    }
}
