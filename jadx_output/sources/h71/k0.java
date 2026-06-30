package h71;

/* loaded from: classes.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI f279398d;

    public k0(com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI) {
        this.f279398d = securityAccountVerifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(h71.k0.class.getName());
        sb6.append(",L600_300,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L600_300"));
        sb6.append(",1");
        n71.a.b(10645, sb6.toString());
        java.lang.String e17 = com.tencent.mm.sdk.platformtools.x2.e();
        com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI = this.f279398d;
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(securityAccountVerifyUI.getSharedPreferences(e17, 0), securityAccountVerifyUI);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI.f73233s, o17));
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, securityAccountVerifyUI.getString(com.tencent.mm.R.string.i7y));
        intent.putExtra("show_bottom", false);
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, securityAccountVerifyUI);
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
