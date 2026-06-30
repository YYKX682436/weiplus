package hr3;

/* loaded from: classes5.dex */
public final class td implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiPictureUI f284027d;

    public td(com.tencent.mm.plugin.profile.ui.SayHiPictureUI sayHiPictureUI) {
        this.f284027d = sayHiPictureUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int i27 = com.tencent.mm.plugin.profile.ui.SayHiPictureUI.f153807h;
        com.tencent.mm.plugin.profile.ui.SayHiPictureUI sayHiPictureUI = this.f284027d;
        if (sayHiPictureUI.W6().getVisibility() != 0) {
            hr3.pf pfVar = (hr3.pf) sayHiPictureUI.component(hr3.pf.class);
            if (!pfVar.f283899r.equals(pfVar.S6().getText().toString())) {
                sayHiPictureUI.W6().setVisibility(0);
            }
        }
        if (!sayHiPictureUI.U6().isShowAddPhotoLayout || !r26.n0.N(sayHiPictureUI.U6().getText())) {
            sayHiPictureUI.V6().setEnabled(true);
        } else {
            sayHiPictureUI.W6().setVisibility(8);
            sayHiPictureUI.V6().setEnabled(false);
        }
    }
}
