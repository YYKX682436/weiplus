package dk2;

/* loaded from: classes14.dex */
public final class e5 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f233354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.i5 f233355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f233356f;

    public e5(v65.n nVar, dk2.i5 i5Var, kotlin.jvm.internal.h0 h0Var) {
        this.f233354d = nVar;
        this.f233355e = i5Var;
        this.f233356f = h0Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 18193) {
            return;
        }
        v65.n nVar = this.f233354d;
        if (i18 != -1 || intent == null) {
            nVar.a(null);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("resultCode");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("resultDesc");
        nVar.a(new dk2.d5(stringExtra, stringExtra2 != null ? stringExtra2 : "", intent.getStringExtra("idCardAuthData"), intent.getStringExtra("certPwdData")));
        this.f233355e.f233609a.unregisterMMOnFragmentActivityResult((com.tencent.mm.ui.xc) this.f233356f.f310123d);
    }
}
