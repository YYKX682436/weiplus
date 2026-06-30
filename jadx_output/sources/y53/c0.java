package y53;

/* loaded from: classes8.dex */
public final class c0 implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f459476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f459477c;

    public c0(java.lang.String str, kotlin.jvm.internal.h0 h0Var, c01.o8 o8Var) {
        this.f459475a = str;
        this.f459476b = h0Var;
        this.f459477c = o8Var;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        pm0.v.X(new y53.b0(map, this.f459475a, this.f459476b, this.f459477c));
    }
}
