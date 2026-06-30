package uw0;

/* loaded from: classes5.dex */
public final class p0 extends android.text.InputFilter.LengthFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f431592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(uw0.t0 t0Var, int i17) {
        super(i17);
        this.f431592d = t0Var;
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        java.lang.CharSequence filter = super.filter(charSequence, i17, i18, spanned, i19, i27);
        if (filter != null) {
            uw0.t0 t0Var = this.f431592d;
            pf5.e.launchUI$default(t0Var, null, null, new uw0.o0(t0Var, null), 3, null);
        }
        return filter;
    }
}
