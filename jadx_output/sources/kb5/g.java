package kb5;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb5.k f306251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f306252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kb5.k kVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f306251d = kVar;
        this.f306252e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f306251d.getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new pi5.y(this.f306252e, stringExtra, true);
    }
}
