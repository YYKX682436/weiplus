package zl2;

/* loaded from: classes13.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zl2.e f473708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f473709g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.c0 c0Var, java.lang.String str, zl2.e eVar, kotlinx.coroutines.q qVar) {
        super(0);
        this.f473706d = c0Var;
        this.f473707e = str;
        this.f473708f = eVar;
        this.f473709g = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.c0 c0Var = this.f473706d;
        if (!c0Var.f310112d) {
            pm0.z.b(xy2.b.f458155b, this.f473707e + "_timeout", false, null, null, false, false, null, 124, null);
            ((sb0.f) ((tb0.i) i95.n0.c(tb0.i.class))).Vi(this.f473708f);
            zl2.f.a(c0Var, this.f473709g, new com.tencent.mm.plugin.finder.assist.u0(null));
        }
        return jz5.f0.f302826a;
    }
}
