package fb3;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb3.b f260850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f260851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fb3.b bVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f260850d = bVar;
        this.f260851e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fb3.b bVar = this.f260850d;
        db3.c cVar = new db3.c(this.f260851e, bVar.getIntent().getBooleanExtra("QSRPRecentConversationDataSourceIsBlockOpenIM", false));
        j75.f Q6 = bVar.Q6();
        if (Q6 != null) {
        }
        return cVar;
    }
}
