package r61;

/* loaded from: classes12.dex */
public class l1 extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final r61.y0 f392897a = new r61.y0();

    /* renamed from: b, reason: collision with root package name */
    public final r61.z0 f392898b = new r61.z0();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f392897a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f392898b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return com.tencent.wxmm.v2helper.EMethodSetIosMicAbCheckOff;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/getsuggestalias";
    }
}
