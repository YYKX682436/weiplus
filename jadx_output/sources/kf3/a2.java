package kf3;

/* loaded from: classes5.dex */
public class a2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendMsgUI f307318d;

    public a2(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI) {
        this.f307318d = massSendMsgUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String valueOf = java.lang.String.valueOf(charSequence);
        int i27 = i19 + i17;
        java.lang.String substring = valueOf.substring(i17, i27);
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307318d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = massSendMsgUI.f148552s;
        if ((j0Var != null && j0Var.isShowing()) || !com.tencent.mm.sdk.platformtools.y1.f(substring)) {
            massSendMsgUI.f148550q = valueOf;
            return;
        }
        android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(substring, 300, 300, false);
        if (T == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MassSendMsgUI", "showAlert fail, bmp is null");
            return;
        }
        android.widget.ImageView imageView = new android.widget.ImageView(massSendMsgUI);
        imageView.setImageBitmap(T);
        int dimensionPixelSize = massSendMsgUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI2 = this.f307318d;
        massSendMsgUI2.f148552s = db5.e1.r(massSendMsgUI2, massSendMsgUI2.getString(com.tencent.mm.R.string.f490889b63), imageView, massSendMsgUI.getString(com.tencent.mm.R.string.f490507x1), massSendMsgUI.getString(com.tencent.mm.R.string.f490347sg), new kf3.z1(this, substring), null);
        java.lang.String str = valueOf.substring(0, i17) + valueOf.substring(i27);
        massSendMsgUI.f148544h.k1(str, -1, false);
        massSendMsgUI.f148550q = str;
    }
}
