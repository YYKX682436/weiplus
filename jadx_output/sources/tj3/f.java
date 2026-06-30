package tj3;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f419735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context) {
        super(0);
        this.f419735d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f419735d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return (com.tencent.mm.plugin.multitalk.ui.b0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.multitalk.ui.b0.class);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
