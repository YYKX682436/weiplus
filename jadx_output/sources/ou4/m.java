package ou4;

/* loaded from: classes8.dex */
public final class m implements ou4.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f348992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f348993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f348994c;

    public m(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3) {
        this.f348992a = h0Var;
        this.f348993b = h0Var2;
        this.f348994c = h0Var3;
    }

    @Override // ou4.b0
    public void a(java.util.Map map) {
        this.f348992a.f310123d = map;
    }

    @Override // ou4.b0
    public void b(java.lang.String code, java.lang.String message) {
        kotlin.jvm.internal.o.g(code, "code");
        kotlin.jvm.internal.o.g(message, "message");
        this.f348993b.f310123d = code;
        this.f348994c.f310123d = message;
    }
}
