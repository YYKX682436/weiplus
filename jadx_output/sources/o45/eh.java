package o45;

/* loaded from: classes12.dex */
public class eh extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.di f342922a = new r45.di();

    @Override // o45.xg
    public int getFuncId() {
        return 145;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.di diVar = this.f342922a;
        diVar.f372492q = cu5Var;
        diVar.setBaseRequest(o45.bh.a(this));
        return diVar.toByteArray();
    }
}
