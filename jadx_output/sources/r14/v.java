package r14;

/* loaded from: classes9.dex */
public final class v implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r14.y f368629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368630e;

    public v(r14.y yVar, java.lang.String str) {
        this.f368629d = yVar;
        this.f368630e = str;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1 && intent != null && i17 == 1) {
            r14.y yVar = this.f368629d;
            com.tencent.mm.ui.MMActivity mMActivity = yVar.f368633a;
            java.lang.String str = this.f368630e;
            yVar.getClass();
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(mMActivity, "", mMActivity.getResources().getString(com.tencent.mm.R.string.f492702hi3), true, false, null);
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            for (java.lang.String str2 : r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null)) {
                k70.i0 i0Var = new k70.i0();
                i0Var.f304642a = 4;
                java.lang.String r17 = c01.z1.r();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                r70.g gVar = new r70.g(str, 0, r17 == null ? "" : r17, str2 == null ? "" : str2, i0Var);
                gVar.f393108j = "qrcode_send_img";
                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, str2);
            }
            if (Q != null) {
                Q.dismiss();
            }
        }
    }
}
