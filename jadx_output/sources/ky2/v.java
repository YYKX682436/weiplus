package ky2;

/* loaded from: classes.dex */
public final class v implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313583d;

    public v(ky2.w wVar) {
        this.f313583d = wVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.util.List list = this.f313583d.f313585e;
        kotlin.jvm.internal.o.f(list, "access$getDataList$p(...)");
        ky2.r rVar = (ky2.r) kz5.n0.Z(list);
        ky2.s sVar = rVar != null ? rVar.f313576b : null;
        if (sVar == null) {
            return;
        }
        sVar.f313580c = r26.n0.u0(java.lang.String.valueOf(editable)).toString();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
