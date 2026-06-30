package fq4;

/* loaded from: classes12.dex */
public final class c extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final c01.l9 f265573a = new c01.l9();

    /* renamed from: b, reason: collision with root package name */
    public final c01.m9 f265574b = new c01.m9();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f265573a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f265574b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.ia.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/getvoiceprintticketrsa";
    }
}
