package wh0;

/* loaded from: classes11.dex */
public class b extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.f06 f445911a;

    public b(java.lang.String str, int i17, int i18) {
        r45.f06 f06Var = new r45.f06();
        this.f445911a = f06Var;
        f06Var.setBaseRequest(o45.bh.a(this));
        f06Var.f373914d = i17;
        f06Var.f373915e = i18;
        f06Var.f373916f = str;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        f06Var.f373919i = java.lang.String.format("cmd_%d_%s_%d_%d", valueOf, str, valueOf2, java.lang.Integer.valueOf(new java.util.Random().nextInt()));
    }

    @Override // o45.xg
    public int getFuncId() {
        return 17907;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        return this.f445911a.toByteArray();
    }
}
