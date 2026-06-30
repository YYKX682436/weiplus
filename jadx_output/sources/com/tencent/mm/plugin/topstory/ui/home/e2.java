package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class e2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI f174963d;

    public e2(com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI topStoryUploadUI) {
        this.f174963d = topStoryUploadUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        o11.g gVar = com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI.D;
        com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI topStoryUploadUI = this.f174963d;
        topStoryUploadUI.W6();
        if (topStoryUploadUI.f174932x.getText().toString().length() <= 200) {
            topStoryUploadUI.enableOptionMenu(0, true);
        } else {
            topStoryUploadUI.enableOptionMenu(0, false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
