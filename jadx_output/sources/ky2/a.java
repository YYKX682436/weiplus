package ky2;

/* loaded from: classes.dex */
public final class a implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f313505d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313506e;

    public a(ky2.w wVar) {
        this.f313506e = wVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = this.f313505d;
        ky2.w wVar = this.f313506e;
        if (i17 != -1) {
            ky2.r rVar = (ky2.r) wVar.f313585e.get(i17);
            java.lang.String obj = r26.n0.u0(java.lang.String.valueOf(editable)).toString();
            rVar.getClass();
            kotlin.jvm.internal.o.g(obj, "<set-?>");
            rVar.f313575a = obj;
        }
        wVar.x();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
