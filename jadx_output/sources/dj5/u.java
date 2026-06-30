package dj5;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.b0 f233094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f233095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(dj5.b0 b0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f233094d = b0Var;
        this.f233095e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f233094d.getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new pi5.y(this.f233095e, stringExtra, false, 4, null);
    }
}
