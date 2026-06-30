package dk5;

/* loaded from: classes9.dex */
public class j5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234690d;

    public j5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        this.f234690d = sendAppMessageWrapperUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.V6(this.f234690d);
    }
}
