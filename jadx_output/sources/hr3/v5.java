package hr3;

/* loaded from: classes11.dex */
public class v5 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f284099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI f284100b;

    public v5(com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI contactSocialInfoUI, java.lang.String[] strArr) {
        this.f284100b = contactSocialInfoUI;
        this.f284099a = strArr;
    }

    @Override // db5.c1
    public void e(int i17) {
        int lastIndexOf;
        r61.a aVar;
        com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI contactSocialInfoUI = this.f284100b;
        if (i17 == 0) {
            java.lang.String str = contactSocialInfoUI.f153717g;
            if (str == null || str.length() == 0 || (lastIndexOf = contactSocialInfoUI.f153717g.lastIndexOf(32) + 1) <= 0) {
                return;
            }
            contactSocialInfoUI.V6(contactSocialInfoUI.f153717g.substring(lastIndexOf));
            return;
        }
        if (i17 == 1) {
            java.lang.String str2 = contactSocialInfoUI.f153717g;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            java.lang.String substring = contactSocialInfoUI.f153717g.substring(0, contactSocialInfoUI.f153717g.lastIndexOf(32));
            if (substring == null || substring.length() == 0) {
                return;
            }
            c01.e2.q0(contactSocialInfoUI.f153715e, substring.trim());
            return;
        }
        if (i17 == 2) {
            java.lang.String[] strArr = this.f284099a;
            if (strArr == null || strArr.length <= 2 || (aVar = contactSocialInfoUI.f153716f) == null || contactSocialInfoUI.f153715e == null) {
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f392800p)) {
                java.lang.String d17 = contactSocialInfoUI.f153715e.d1();
                java.lang.String str3 = contactSocialInfoUI.f153716f.f392800p;
                if (com.tencent.mm.sdk.platformtools.t8.K0(d17) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    dp.a.makeText(contactSocialInfoUI.getContext(), contactSocialInfoUI.getContext().getString(com.tencent.mm.R.string.bgr), 0).show();
                    return;
                }
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                android.graphics.Bitmap m17 = com.tencent.mm.modelavatar.d1.Ai().m(d17);
                if (m17 == null) {
                    dp.a.makeText(contactSocialInfoUI.getContext(), contactSocialInfoUI.getContext().getString(com.tencent.mm.R.string.bgs), 0).show();
                    com.tencent.mm.modelavatar.m0 m0Var = new com.tencent.mm.modelavatar.m0();
                    m0Var.a(d17, new hr3.w5(contactSocialInfoUI, m0Var, d17, str3));
                    return;
                } else if (contactSocialInfoUI.X6(str3, m17)) {
                    dp.a.makeText(contactSocialInfoUI.getContext(), contactSocialInfoUI.getContext().getString(com.tencent.mm.R.string.bgt), 0).show();
                    return;
                } else {
                    dp.a.makeText(contactSocialInfoUI.getContext(), contactSocialInfoUI.getContext().getString(com.tencent.mm.R.string.bgr), 0).show();
                    return;
                }
            }
        } else if (i17 != 3) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("fromScene", 2);
        intent.putExtra("reportArgs", bundle);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
        android.os.Bundle bundleExtra = intent.getBundleExtra("reportArgs");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11621, java.lang.Integer.valueOf(bundleExtra != null ? bundleExtra.getInt("fromScene") : 0), 0);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r17 = com.tencent.mm.plugin.downloader.model.r0.i().r("http://dianhua.qq.com/cgi-bin/cloudgrptemplate?t=dianhuaben_download&channel=100008");
        if (r17 == null || r17.f96963f != 3) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPhoneBookHelper", "weixin phonebook already download successfully, install directly");
        if (com.tencent.mm.vfs.w6.j(r17.f96964g)) {
            com.tencent.mm.pluginsdk.model.app.n1.d(contactSocialInfoUI, r17.f96964g, null, false);
        }
    }
}
