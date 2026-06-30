package e21;

/* loaded from: classes11.dex */
public class g extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final e21.h f246520a = new e21.h();

    /* renamed from: b, reason: collision with root package name */
    public final e21.i f246521b = new e21.i();

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f246520a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f246521b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/oplog";
    }
}
