package ro2;

/* loaded from: classes2.dex */
public final class m implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f398064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398066c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f398067d;

    public m(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.content.Context context, com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        this.f398064a = baseFinderFeed;
        this.f398065b = context;
        this.f398066c = qeVar;
        this.f398067d = s0Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        pm0.v.X(new ro2.l(this.f398064a, this.f398065b, this.f398066c, this.f398067d, destPath));
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        pm0.v.X(new ro2.i(this.f398065b));
    }
}
