package o45;

/* loaded from: classes12.dex */
public class qh extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f343001a;

    /* renamed from: b, reason: collision with root package name */
    public final o45.rh f343002b;

    /* renamed from: c, reason: collision with root package name */
    public final o45.sh f343003c = new o45.sh();

    public qh(boolean z17) {
        this.f343001a = true;
        this.f343001a = z17;
        this.f343002b = new o45.rh(z17);
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return this.f343001a ? 1 : 0;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f343002b;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f343003c;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return this.f343001a ? 3789 : 3644;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return this.f343001a ? "/cgi-bin/micromsg-bin/fpinitnl" : "/cgi-bin/micromsg-bin/fpinit";
    }
}
