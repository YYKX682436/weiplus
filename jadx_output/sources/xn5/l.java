package xn5;

/* loaded from: classes13.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f455689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f455690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f455691f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, androidx.lifecycle.y yVar, java.lang.String str) {
        super(0);
        this.f455689d = context;
        this.f455690e = yVar;
        this.f455691f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xn5.p0 p0Var = xn5.q0.f455702a;
        if (!(p0Var.b() instanceof xn5.n)) {
            p0Var.b().b().d(this.f455689d, this.f455690e, this.f455691f);
            xn5.q0.f455709h = null;
        }
        return jz5.f0.f302826a;
    }
}
