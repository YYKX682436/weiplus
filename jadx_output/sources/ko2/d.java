package ko2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f309924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309925g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, java.lang.String str, long j17, java.lang.String str2) {
        super(0);
        this.f309922d = context;
        this.f309923e = str;
        this.f309924f = j17;
        this.f309925g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f309922d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ho2.g gVar = new ho2.g(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), this.f309923e, 1, 2, this.f309924f, 0L);
        gVar.t(context, context.getResources().getString(com.tencent.mm.R.string.f9y), 0L);
        pm0.v.T(gVar.l(), new ko2.c(this.f309925g, 2, context));
        return jz5.f0.f302826a;
    }
}
