package wh0;

/* loaded from: classes11.dex */
public class d extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final wh0.b f445913a;

    /* renamed from: b, reason: collision with root package name */
    public final wh0.c f445914b = new wh0.c(null);

    public d(java.lang.String str, int i17, int i18) {
        this.f445913a = new wh0.b(str, i17, i18);
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f445913a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f445914b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 17907;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/sendweixinaicommand";
    }
}
