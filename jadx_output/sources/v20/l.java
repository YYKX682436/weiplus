package v20;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f432782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f432784f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Intent intent, java.lang.String str, kotlinx.coroutines.q qVar) {
        super(3);
        this.f432782d = intent;
        this.f432783e = str;
        this.f432784f = qVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        ((java.lang.Number) obj3).intValue();
        kotlinx.coroutines.q qVar = this.f432784f;
        if (booleanValue) {
            android.content.Intent intent = this.f432782d;
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", this.f432783e);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.TRUE, str)));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, null)));
        }
        return jz5.f0.f302826a;
    }
}
