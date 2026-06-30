package ty2;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f423058a;

    /* renamed from: b, reason: collision with root package name */
    public final ty2.q f423059b;

    /* renamed from: c, reason: collision with root package name */
    public ty2.z f423060c;

    public b(android.content.Context context, ty2.q viewType, ty2.z config) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(viewType, "viewType");
        kotlin.jvm.internal.o.g(config, "config");
        this.f423058a = context;
        this.f423059b = viewType;
        this.f423060c = config;
    }

    public final java.lang.String a() {
        return getClass().toString() + this.f423059b.f423112d;
    }

    public abstract android.view.View b(bw5.q5 q5Var);
}
