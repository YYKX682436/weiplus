package jb1;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jb1.e f298698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f298699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f298700f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jb1.e eVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        super(1);
        this.f298698d = eVar;
        this.f298699e = i17;
        this.f298700f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            qb1.a.b(this.f298698d, this.f298699e, this.f298700f, null);
        } else {
            qb1.a.a(this.f298698d, this.f298699e, this.f298700f, 10008, "fail:system error, add service fail", null, 16, null);
        }
        return jz5.f0.f302826a;
    }
}
