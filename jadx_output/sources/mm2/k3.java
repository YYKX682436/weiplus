package mm2;

/* loaded from: classes.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yt4 f329195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(r45.yt4 yt4Var) {
        super(1);
        this.f329195d = yt4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        km2.q user = (km2.q) obj;
        kotlin.jvm.internal.o.g(user, "user");
        return java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.D0(user.f309170a, this.f329195d.getString(1)));
    }
}
