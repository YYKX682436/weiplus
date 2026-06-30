package jb1;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jb1.e f298702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f298703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f298704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(jb1.e eVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        super(0);
        this.f298702d = eVar;
        this.f298703e = i17;
        this.f298704f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qb1.a.a(this.f298702d, this.f298703e, this.f298704f, 3, "fail:system permission denied", null, 16, null);
        return jz5.f0.f302826a;
    }
}
