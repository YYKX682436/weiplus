package os4;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hs3 f348276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.hs3 hs3Var) {
        super(0);
        this.f348276d = hs3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] byteArray = this.f348276d.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WECOIN_PAGE_INFO_RESPONSE_STRING_SYNC, new java.lang.String(byteArray, r26.c.f368867c));
        return jz5.f0.f302826a;
    }
}
