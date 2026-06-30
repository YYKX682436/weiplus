package js3;

/* loaded from: classes5.dex */
public class e implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "MailAppEnterMailAppUrlAndroid");
        java.lang.String b18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "MailAppRedirectUrAndroid");
        boolean z17 = com.tencent.mm.sdk.platformtools.a0.f192439b != 1 && com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "ShowMailAppRecommend"), 0) == 1;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            b17 = b17.replace("http:", "https:");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b18)) {
            b18 = b18.replace("http:", "https:");
        }
        bundle.putString("mail_app_enter_url", b17);
        bundle.putString("mail_app_download_url", b18);
        bundle.putBoolean("mail_app_show_recommend", z17);
        rVar.a(bundle);
    }
}
