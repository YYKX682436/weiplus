package dk5;

/* loaded from: classes9.dex */
public class b5 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234529a;

    public b5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        this.f234529a = sendAppMessageWrapperUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_stay_in_wx", true);
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234529a;
        intent.putExtra("scene_select_user_liast", sendAppMessageWrapperUI.f211020f);
        sendAppMessageWrapperUI.setResult(-1, intent);
        sendAppMessageWrapperUI.finish();
    }
}
