package oe4;

/* loaded from: classes9.dex */
public final class b extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final oe4.c f344798a = new oe4.c();

    /* renamed from: b, reason: collision with root package name */
    public final oe4.d f344799b = new oe4.d();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f344798a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f344799b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.z4.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/updatesoteraskrsa";
    }
}
