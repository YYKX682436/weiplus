package h71;

/* loaded from: classes.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI f279386d;

    public e0(com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI securityAccountIntroUI) {
        this.f279386d = securityAccountIntroUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String e17 = com.tencent.mm.sdk.platformtools.x2.e();
        com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI securityAccountIntroUI = this.f279386d;
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(securityAccountIntroUI.getSharedPreferences(e17, 0), securityAccountIntroUI);
        android.content.Intent intent = new android.content.Intent();
        if (com.tencent.mm.sdk.platformtools.t8.K0(securityAccountIntroUI.f73228h)) {
            intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI.f73224p, o17));
        } else {
            intent.putExtra("rawUrl", securityAccountIntroUI.f73228h);
        }
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, securityAccountIntroUI.getString(com.tencent.mm.R.string.i7y));
        intent.putExtra("show_bottom", false);
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, securityAccountIntroUI);
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
