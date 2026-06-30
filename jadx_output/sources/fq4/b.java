package fq4;

/* loaded from: classes12.dex */
public final class b extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final c01.j9 f265570a = new c01.j9();

    /* renamed from: b, reason: collision with root package name */
    public final c01.k9 f265571b = new c01.k9();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f265570a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f265571b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 616;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/getvoiceprintresourcersa";
    }
}
