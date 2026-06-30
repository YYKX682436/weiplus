package g72;

/* loaded from: classes.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI f269232d;

    public g0(com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI settingsFacePrintManagerUI) {
        this.f269232d = settingsFacePrintManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI.f100091i;
        com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI settingsFacePrintManagerUI = this.f269232d;
        settingsFacePrintManagerUI.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11390, 3);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(settingsFacePrintManagerUI, com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.class);
        intent.putExtra("k_need_signature", true);
        intent.putExtra("k_user_name", c01.z1.b());
        intent.putExtra("k_purpose", 1);
        settingsFacePrintManagerUI.startActivityForResult(intent, 1);
        settingsFacePrintManagerUI.f100096h = false;
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
