package w11;

/* loaded from: classes12.dex */
public class y extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final w11.w f442169a;

    /* renamed from: b, reason: collision with root package name */
    public final w11.x f442170b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442171c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f442172d;

    public y(int i17, java.lang.String str, int i18, r45.cu5 cu5Var, byte[] bArr) {
        w11.w wVar = new w11.w();
        this.f442169a = wVar;
        this.f442170b = new w11.x();
        this.f442171c = i17;
        this.f442172d = str;
        wVar.f442157b = i17;
        wVar.f442158c = bArr;
        r45.tc tcVar = wVar.f442156a;
        tcVar.f386283d = i18;
        tcVar.f386284e = cu5Var;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public boolean getIsUserCmd() {
        return true;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f442169a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f442170b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return this.f442171c;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return this.f442172d;
    }
}
