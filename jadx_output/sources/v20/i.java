package v20;

/* loaded from: classes.dex */
public final class i implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f432771c;

    public i(java.lang.String str, java.lang.String str2, kotlinx.coroutines.q qVar) {
        this.f432769a = str;
        this.f432770b = str2;
        this.f432771c = qVar;
    }

    @Override // q80.x
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        kotlinx.coroutines.q qVar = this.f432771c;
        if (i18 != -1 || i17 != 1015) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, "")));
            return;
        }
        boolean z17 = true;
        java.lang.String str = this.f432769a;
        if (str == null || str.length() == 0) {
            return;
        }
        java.lang.String str2 = this.f432770b;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        ((dk5.s5) tg3.t1.a()).Ui(str, str2);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String str3 = (java.lang.String) kz5.n0.Z(stringArrayListExtra);
        qVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(bool, str3 != null ? str3 : "")));
    }
}
