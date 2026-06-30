package fq4;

/* loaded from: classes9.dex */
public final class d extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final c01.n9 f265577a = new c01.n9();

    /* renamed from: b, reason: collision with root package name */
    public final c01.o9 f265578b = new c01.o9();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f265577a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f265578b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 617;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/verifyvoiceprintrsa";
    }
}
