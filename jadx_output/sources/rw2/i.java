package rw2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f400600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f400601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f400602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rw2.j f400603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, kotlin.jvm.internal.g0 g0Var, android.graphics.Bitmap bitmap, rw2.j jVar) {
        super(1);
        this.f400600d = j17;
        this.f400601e = g0Var;
        this.f400602f = bitmap;
        this.f400603g = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        rw2.g it = (rw2.g) obj;
        kotlin.jvm.internal.o.g(it, "it");
        long j17 = it.f400596a;
        if (j17 == this.f400600d) {
            this.f400601e.f310121d = j17;
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            yz5.p pVar = it.f400597b;
            android.graphics.Bitmap bitmap = this.f400602f;
            pVar.invoke(valueOf, bitmap);
            com.tencent.mars.xlog.Log.i(this.f400603g.f400607c, "callback " + j17 + ", " + bitmap);
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
