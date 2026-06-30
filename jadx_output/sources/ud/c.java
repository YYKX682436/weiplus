package ud;

/* loaded from: classes7.dex */
public abstract class c extends ud.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime) {
        super(context, jsRuntime);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
    }

    @Override // ud.g
    public void c(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        wd.g gVar = wd.g.f444684a;
        com.tencent.magicbrush.MagicBrush magicBrush = this.f426569c;
        kotlin.jvm.internal.o.d(magicBrush);
        gVar.a(magicBrush, runtime, false);
    }

    @Override // ud.g
    public void d(com.tencent.magicbrush.a builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        super.d(builder);
        builder.f48612n.b(builder, com.tencent.magicbrush.c0.I[7], java.lang.Boolean.TRUE);
        builder.e(gh.b.ChoreographerInMainThread);
    }
}
