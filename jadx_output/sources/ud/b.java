package ud;

/* loaded from: classes7.dex */
public abstract class b extends ud.g {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f426564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime, boolean z17) {
        super(context, jsRuntime);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
        this.f426564f = z17;
    }

    @Override // ud.g
    public void d(com.tencent.magicbrush.a builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        super.d(builder);
        f06.v[] vVarArr = com.tencent.magicbrush.c0.I;
        builder.f48612n.b(builder, vVarArr[7], java.lang.Boolean.FALSE);
        builder.f48610l.b(builder, vVarArr[5], java.lang.Boolean.valueOf(this.f426564f));
    }
}
