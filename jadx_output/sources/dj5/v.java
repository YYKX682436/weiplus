package dj5;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.b0 f233096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f233097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dj5.b0 b0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f233096d = b0Var;
        this.f233097e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dj5.b0 b0Var = this.f233096d;
        java.lang.String stringExtra = b0Var.getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = (java.lang.String) ((jz5.n) b0Var.f233057f).getValue();
        kotlin.jvm.internal.o.f(str, "access$getOwnerHeadDisplay(...)");
        return new pi5.l(this.f233097e, stringExtra, str);
    }
}
