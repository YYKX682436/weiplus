package dk5;

/* loaded from: classes9.dex */
public class l5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234725d;

    public l5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        this.f234725d = sendAppMessageWrapperUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.V6(this.f234725d);
    }
}
