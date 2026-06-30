package yc5;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f460904g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, java.lang.String str, java.lang.String str2, kotlinx.coroutines.z zVar) {
        super(0);
        this.f460901d = context;
        this.f460902e = str;
        this.f460903f = str2;
        this.f460904g = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        yc5.d dVar = new yc5.d(this.f460904g);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.e(this.f460901d, this.f460902e, this.f460903f, dVar);
        return jz5.f0.f302826a;
    }
}
