package os3;

/* loaded from: classes8.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f348100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ os3.j4 f348102f;

    public h4(os3.j4 j4Var, android.os.Bundle bundle, java.lang.String str) {
        this.f348102f = j4Var;
        this.f348100d = bundle;
        this.f348101e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // java.lang.Runnable
    public void run() {
        os3.j4 j4Var = this.f348102f;
        j4Var.f348128d.f154929h.setVisibility(8);
        android.os.Bundle bundle = this.f348100d;
        int i17 = bundle.getInt("err_type");
        int i18 = bundle.getInt("err_code");
        java.lang.String string = bundle.getString("err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.ReadMailUI", "mailId %s, errType %d, errCode %d, errMsg %s", this.f348101e, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), string);
        ?? r76 = 0;
        if (i17 != 0 || i18 != 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                string = j4Var.f348128d.getString(com.tencent.mm.R.string.hke);
            }
            dp.a.makeText(j4Var.f348128d, string, 1).show();
            j4Var.f348128d.f154930i.setVisibility(0);
            return;
        }
        ks3.b0 b0Var = j4Var.f348128d.f154927f;
        b0Var.getClass();
        b0Var.f311634i = bundle.getString("mail_content");
        b0Var.f311632g = bundle.getParcelableArrayList("mail_normal_attach");
        b0Var.f311633h = bundle.getParcelableArrayList("mail_big_attach");
        b0Var.f311635j = (android.os.Bundle) bundle.getParcelable("mail_cookie");
        java.lang.String str = j4Var.f348128d.f154927f.f311634i;
        java.lang.String str2 = "<html style=\"margin-top:" + com.tencent.mm.plugin.qqmail.ui.ReadMailUI.S + "px\">" + j4Var.f348128d.f154927f.f311634i + "</html>";
        j4Var.f348128d.f154928g.loadDataWithBaseURL(ks3.k0.c() + "?pageWidth=" + com.tencent.mm.plugin.qqmail.ui.ReadMailUI.R, str2, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = j4Var.f348128d.f154927f.f311632g;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        java.util.ArrayList arrayList3 = j4Var.f348128d.f154927f.f311633h;
        if (arrayList3 != null) {
            arrayList3.forEach(new os3.h4$$a());
            arrayList.addAll(j4Var.f348128d.f154927f.f311633h);
        }
        if (arrayList.isEmpty()) {
            j4Var.f348128d.f154939u.setVisibility(8);
        } else {
            j4Var.f348128d.f154939u.setVisibility(0);
            ((android.widget.TextView) j4Var.f348128d.findViewById(com.tencent.mm.R.id.ljv)).setText(j4Var.f348128d.getString(com.tencent.mm.R.string.hro, java.lang.Integer.valueOf(arrayList.size())));
            j4Var.f348128d.f154940v.removeAllViews();
            com.tencent.mm.plugin.qqmail.ui.MailAttachListLinearLayout mailAttachListLinearLayout = j4Var.f348128d.f154940v;
            mailAttachListLinearLayout.getClass();
            int i19 = 0;
            while (i19 < arrayList.size()) {
                android.view.View inflate = android.view.View.inflate(mailAttachListLinearLayout.f154891d, com.tencent.mm.R.layout.ccb, null);
                android.os.Bundle bundle2 = (android.os.Bundle) arrayList.get(i19);
                if (i19 == arrayList.size() - 1) {
                    inflate.setBackgroundResource(com.tencent.mm.R.drawable.ana);
                } else {
                    inflate.setBackgroundResource(com.tencent.mm.R.drawable.an_);
                }
                mailAttachListLinearLayout.addView(inflate);
                java.lang.String string2 = bundle2.getString("attach_name", "");
                ((java.util.ArrayList) mailAttachListLinearLayout.f154892e).add(string2);
                int i27 = bundle2.getInt("attach_size", r76);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ljx)).setText(string2);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ljz)).setText(com.tencent.mm.sdk.platformtools.t8.f0(i27));
                inflate.setOnClickListener(new os3.v2(mailAttachListLinearLayout, string2, bundle2.getString("attach_fileId", ""), i27, bundle2.getString("attach_download_url", ""), bundle2.getBoolean("is_big_attach", r76)));
                ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ljw)).setImageResource(o25.y.b(string2));
                i19++;
                r76 = 0;
            }
        }
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = j4Var.f348128d;
        ks3.b0 b0Var2 = readMailUI.f154927f;
        readMailUI.getClass();
        com.tencent.xweb.d.g().c();
        if (b0Var2.f311635j == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReadMailUI", "cookie is null");
            return;
        }
        com.tencent.xweb.d.g().b(ks3.k0.c(), "xm_skey=" + b0Var2.f311635j.getString("cookie_xmail_skey"));
        com.tencent.xweb.d.g().b(ks3.k0.c(), "xm_uin=" + b0Var2.f311635j.getLong("cookie_xmail_uin"));
        com.tencent.xweb.d.g().b(ks3.k0.c(), "xm_sid=" + b0Var2.f311635j.getString("cookie_xmail_sid"));
        com.tencent.xweb.d.g().flush();
    }
}
