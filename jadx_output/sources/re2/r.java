package re2;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.w f394477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(re2.w wVar, yz5.l lVar) {
        super(2);
        this.f394477d = wVar;
        this.f394478e = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        re2.g gVar = re2.g.f394413f;
        re2.w.a(this.f394477d, this.f394478e, gVar, ((java.lang.Number) obj).intValue(), (java.lang.String) obj2);
        return jz5.f0.f302826a;
    }
}
