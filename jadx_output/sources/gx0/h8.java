package gx0;

/* loaded from: classes5.dex */
public final class h8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.ExportSession f276501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(com.tencent.maas.moviecomposing.ExportSession exportSession, gx0.w8 w8Var, java.lang.String str) {
        super(1);
        this.f276501d = exportSession;
        this.f276502e = w8Var;
        this.f276503f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f276501d.a(new gx0.g8(this.f276502e, this.f276503f));
        return jz5.f0.f302826a;
    }
}
