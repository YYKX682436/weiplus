package in2;

/* loaded from: classes10.dex */
public final class d0 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f292817d;

    public d0(in2.f0 f0Var) {
        this.f292817d = f0Var;
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        boolean contentEquals = charSequence.toString().contentEquals("\n");
        in2.f0 f0Var = this.f292817d;
        if (contentEquals) {
            f0Var.f292836u = false;
            return "";
        }
        if (!charSequence.toString().contentEquals(" ")) {
            f0Var.f292836u = false;
        } else {
            if (f0Var.f292836u) {
                return "";
            }
            f0Var.f292836u = true;
        }
        return null;
    }
}
