package e14;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.j f246428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f246429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.protobuf.j jVar, java.util.Map map) {
        super(0);
        this.f246428d = jVar;
        this.f246429e = map;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protobuf.k kVar = this.f246428d.f192158a;
        java.lang.Class cls = kVar.f192164e;
        return "[277]Unknown type: " + kVar + " [type]" + (cls != null ? cls.getSimpleName() : null) + ", [xmlMap]: " + this.f246429e;
    }
}
