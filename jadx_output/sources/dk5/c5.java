package dk5;

/* loaded from: classes9.dex */
public class c5 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234569a;

    public c5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        this.f234569a = sendAppMessageWrapperUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        android.content.Intent putExtra = new android.content.Intent().putExtra("Select_back_to_app", true);
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234569a;
        putExtra.putExtra("scene_select_user_liast", sendAppMessageWrapperUI.f211020f);
        if (sendAppMessageWrapperUI.f211022h == 3) {
            sendAppMessageWrapperUI.setResult(-1);
            sendAppMessageWrapperUI.finish();
            com.tencent.mm.pluginsdk.model.app.m5.c(sendAppMessageWrapperUI, com.tencent.mm.pluginsdk.model.app.m5.a(sendAppMessageWrapperUI.getIntent().getExtras(), 0), true, false);
        } else {
            if (sendAppMessageWrapperUI.getIntent().getExtras() != null) {
                putExtra.putExtras(sendAppMessageWrapperUI.getIntent().getExtras());
            }
            sendAppMessageWrapperUI.setResult(-1, putExtra);
            sendAppMessageWrapperUI.finish();
        }
    }
}
