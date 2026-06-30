package e33;

/* loaded from: classes10.dex */
public class p5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.SmartGalleryUI f247436d;

    public p5(com.tencent.mm.plugin.gallery.ui.SmartGalleryUI smartGalleryUI) {
        this.f247436d = smartGalleryUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.tencent.mm.plugin.gallery.ui.SmartGalleryUI smartGalleryUI = this.f247436d;
        smartGalleryUI.f138627i.f247292g = obj;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            com.tencent.mm.plugin.gallery.ui.SmartGalleryUI.T6(smartGalleryUI, obj, false);
            return;
        }
        smartGalleryUI.f138632q = false;
        smartGalleryUI.f138622d.setAdapter(smartGalleryUI.f138624f);
        smartGalleryUI.f138622d.N(smartGalleryUI.f138634s);
        smartGalleryUI.f138624f.notifyDataSetChanged();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
