package ky2;

/* loaded from: classes.dex */
public final class t implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313581d;

    public t(ky2.w wVar) {
        this.f313581d = wVar;
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        boolean contentEquals = charSequence.toString().contentEquals("\n");
        ky2.w wVar = this.f313581d;
        if (contentEquals) {
            wVar.f313597t = false;
            return "";
        }
        if (!charSequence.toString().contentEquals(" ")) {
            wVar.f313597t = false;
        } else {
            if (wVar.f313597t) {
                return "";
            }
            wVar.f313597t = true;
        }
        return null;
    }
}
