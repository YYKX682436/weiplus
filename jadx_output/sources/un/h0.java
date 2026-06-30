package un;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f429280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ un.k0 f429281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(androidx.appcompat.app.AppCompatActivity appCompatActivity, un.k0 k0Var) {
        super(0);
        this.f429280d = appCompatActivity;
        this.f429281e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        un.k0 k0Var = this.f429281e;
        java.lang.String U6 = un.k0.U6(k0Var);
        kotlin.jvm.internal.o.f(U6, "access$getChatroomName(...)");
        java.lang.String str = (java.lang.String) ((jz5.n) k0Var.f429298f).getValue();
        kotlin.jvm.internal.o.f(str, "access$getOwnerHeadDisplay(...)");
        return new pi5.o(this.f429280d, U6, str);
    }
}
