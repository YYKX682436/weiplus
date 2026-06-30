package x11;

/* loaded from: classes8.dex */
public class z extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.vh f451423a = new o45.vh();

    /* renamed from: b, reason: collision with root package name */
    public final o45.wh f451424b = new o45.wh();

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f451423a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f451424b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 139;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/newinit";
    }
}
