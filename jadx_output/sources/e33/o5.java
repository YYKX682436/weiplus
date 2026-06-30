package e33;

/* loaded from: classes10.dex */
public class o5 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.SmartGalleryUI f247427d;

    public o5(com.tencent.mm.plugin.gallery.ui.SmartGalleryUI smartGalleryUI) {
        this.f247427d = smartGalleryUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (3 != i17) {
            return false;
        }
        java.lang.String charSequence = textView.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
            return false;
        }
        com.tencent.mm.plugin.gallery.ui.SmartGalleryUI.T6(this.f247427d, charSequence, true);
        return true;
    }
}
