package nu0;

/* loaded from: classes5.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.imagestudio.MJImageLayer f340010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.o4 f340011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f340012f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.tencent.maas.imagestudio.MJImageLayer mJImageLayer, nu0.o4 o4Var, com.tencent.maas.base.MJID mjid) {
        super(1);
        this.f340010d = mJImageLayer;
        this.f340011e = o4Var;
        this.f340012f = mjid;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f340010d.d(by0.h.b((r45.ze2) obj));
        com.tencent.maas.base.MJID mjID = this.f340012f;
        kotlin.jvm.internal.o.f(mjID, "$mjID");
        gx0.hf.V6((nu0.i4) ((jz5.n) this.f340011e.f340056s).getValue(), mjID, null, 2, null);
        return jz5.f0.f302826a;
    }
}
