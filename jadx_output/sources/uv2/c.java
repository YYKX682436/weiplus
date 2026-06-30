package uv2;

/* loaded from: classes10.dex */
public final class c implements uv2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f431371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f431372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f431373c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f431374d;

    public c(yz5.l lVar, kotlin.jvm.internal.h0 h0Var, java.lang.Object obj, kotlin.jvm.internal.c0 c0Var) {
        this.f431371a = lVar;
        this.f431372b = h0Var;
        this.f431373c = obj;
        this.f431374d = c0Var;
    }

    @Override // uv2.m
    public void a(java.lang.String mediaId, uv2.n result) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(result, "result");
        this.f431372b.f310123d = result;
        java.lang.Object obj = this.f431373c;
        kotlin.jvm.internal.c0 c0Var = this.f431374d;
        synchronized (obj) {
            c0Var.f310112d = true;
            obj.notifyAll();
        }
    }

    @Override // uv2.m
    public void b(java.lang.String mediaId, float f17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f431371a.invoke(java.lang.Float.valueOf(f17));
    }
}
