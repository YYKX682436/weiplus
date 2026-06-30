package o45;

/* loaded from: classes12.dex */
public class nh extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f342983a;

    /* renamed from: b, reason: collision with root package name */
    public final o45.oh f342984b;

    /* renamed from: c, reason: collision with root package name */
    public final o45.ph f342985c = new o45.ph();

    public nh(boolean z17) {
        this.f342983a = true;
        this.f342983a = z17;
        this.f342984b = new o45.oh(z17);
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return this.f342983a ? 1 : 0;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f342984b;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f342985c;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return this.f342983a ? 3944 : 836;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return this.f342983a ? "/cgi-bin/micromsg-bin/fpfreshnl" : "/cgi-bin/micromsg-bin/fpfresh";
    }
}
