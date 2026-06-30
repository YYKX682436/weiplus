package w11;

/* loaded from: classes12.dex */
public class s0 extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.fi f442144a = new o45.fi();

    /* renamed from: b, reason: collision with root package name */
    public final o45.hi f442145b = new o45.hi();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f442144a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f442145b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 39;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return null;
    }
}
