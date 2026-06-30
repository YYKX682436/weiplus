package df;

/* loaded from: classes15.dex */
public final class v implements df.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f229561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df.z f229562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.RenderMode f229563c;

    public v(kotlinx.coroutines.q qVar, df.z zVar, io.flutter.embedding.android.RenderMode renderMode) {
        this.f229561a = qVar;
        this.f229562b = zVar;
        this.f229563c = renderMode;
        ((kotlinx.coroutines.r) qVar).m(new df.u(zVar, renderMode, this));
    }

    @Override // df.q
    public void a() {
        kotlinx.coroutines.q qVar = this.f229561a;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
        df.z.b(this.f229562b, this.f229563c, this);
    }
}
