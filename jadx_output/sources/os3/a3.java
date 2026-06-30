package os3;

/* loaded from: classes8.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailWebViewUI f348033d;

    public a3(com.tencent.mm.plugin.qqmail.ui.MailWebViewUI mailWebViewUI) {
        this.f348033d = mailWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.qqmail.ui.MailWebViewUI.f154908i;
        com.tencent.mm.plugin.qqmail.ui.MailWebViewUI mailWebViewUI = this.f348033d;
        java.lang.String stringExtra = mailWebViewUI.getIntent().getStringExtra("uri");
        java.lang.String[] stringArrayExtra = mailWebViewUI.getIntent().getStringArrayExtra("params");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i18 = 0; i18 < stringArrayExtra.length; i18++) {
            int indexOf = stringArrayExtra[i18].indexOf("=");
            hashMap.put(stringArrayExtra[i18].substring(0, indexOf), stringArrayExtra[i18].substring(indexOf + 1));
        }
        mailWebViewUI.f154910e = mailWebViewUI.getIntent().getStringExtra("baseurl");
        java.lang.String stringExtra2 = mailWebViewUI.getIntent().getStringExtra(ya.b.METHOD);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra2 == null) {
            stringExtra2 = "get";
        }
        if (stringExtra2.length() == 0 || stringExtra == null || stringExtra.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.QQMail.WebViewUI", "doSend invalid argument.");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("qqmail_httpoptions_expired", false);
        bundle.putBoolean("qqmail_httpoptions_needcache", true);
        bundle.putBoolean("qqmail_httpoptions_needparse", false);
        try {
            boolean equals = stringExtra2.equals("get");
            hs3.j jVar = mailWebViewUI.f154912g;
            k55.k kVar = mailWebViewUI.f154913h;
            if (equals) {
                ((java.lang.Long) new com.tencent.mm.plugin.qqmail.stub.ReadMailProxy(kVar, jVar).REMOTE_CALL("get", stringExtra, hashMap, bundle)).longValue();
            } else {
                ((java.lang.Long) new com.tencent.mm.plugin.qqmail.stub.ReadMailProxy(kVar, jVar).REMOTE_CALL("post", stringExtra, hashMap, bundle)).longValue();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.QQMail.WebViewUI", "get/post, method = %s, ex = %s", stringExtra2, e17.getMessage());
        }
    }
}
