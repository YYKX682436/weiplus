package h11;

/* loaded from: classes12.dex */
public class d extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.eh f278068a = new o45.eh();

    /* renamed from: b, reason: collision with root package name */
    public final o45.fh f278069b = new o45.fh();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f278068a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f278069b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 145;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/bindopmobileforreg";
    }
}
