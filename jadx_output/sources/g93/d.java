package g93;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f269774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g93.j f269775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity appCompatActivity, g93.j jVar) {
        super(0);
        this.f269774d = appCompatActivity;
        this.f269775e = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f269774d;
        g93.j jVar = this.f269775e;
        return new qi5.b0(appCompatActivity, (java.util.HashSet) ((jz5.n) jVar.f269786i).getValue(), (java.util.List) ((jz5.n) jVar.f269782e).getValue(), "", "", ((java.lang.Boolean) ((jz5.n) jVar.f269785h).getValue()).booleanValue());
    }
}
