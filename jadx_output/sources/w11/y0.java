package w11;

/* loaded from: classes12.dex */
public class y0 extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.xh f442173a;

    /* renamed from: b, reason: collision with root package name */
    public final o45.yh f442174b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f442175c;

    public y0(boolean z17) {
        this.f442173a = new o45.xh();
        this.f442174b = new o45.yh();
        this.f442175c = z17;
    }

    @Override // com.tencent.mm.modelbase.k1
    public boolean getPush() {
        return this.f442175c;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f442173a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f442174b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 138;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/newsync";
    }

    public y0(o45.yh yhVar) {
        this.f442173a = new o45.xh();
        this.f442174b = yhVar;
        this.f442175c = true;
    }
}
