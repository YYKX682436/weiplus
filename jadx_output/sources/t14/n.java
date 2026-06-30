package t14;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t14.q f414584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f414585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t14.q qVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f414584d = qVar;
        this.f414585e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f414584d.getIntent().getStringExtra("KEY_CUSTOM_PAGE_NAME");
        return !(stringExtra == null || r26.n0.N(stringExtra)) ? stringExtra : this.f414585e.getClass().getSimpleName();
    }
}
