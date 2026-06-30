package qa5;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa5.l f361125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qa5.l lVar) {
        super(0);
        this.f361125d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qa5.l lVar = this.f361125d;
        lVar.f361126b.post(new qa5.j(lVar));
        return jz5.f0.f302826a;
    }
}
