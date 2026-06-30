package w11;

/* loaded from: classes12.dex */
public class t0 extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.gi f442147a = new o45.gi();

    /* renamed from: b, reason: collision with root package name */
    public final o45.ii f442148b = new o45.ii();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f442147a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f442148b;
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
