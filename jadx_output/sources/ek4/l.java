package ek4;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f253662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f253663g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f253664h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ek4.v f253665i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ek4.s sVar, java.lang.String str, long j17, long j18, int i17, ek4.v vVar) {
        super(0);
        this.f253660d = sVar;
        this.f253661e = str;
        this.f253662f = j17;
        this.f253663g = j18;
        this.f253664h = i17;
        this.f253665i = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ek4.s sVar = this.f253660d;
        java.util.HashMap hashMap = sVar.f253685a;
        java.lang.String str = this.f253661e;
        boolean containsKey = hashMap.containsKey(str);
        ek4.v vVar = this.f253665i;
        if (containsKey) {
            int Ni = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ni(this.f253661e, this.f253662f, this.f253663g, this.f253664h);
            if (vVar != null) {
                vVar.a(Ni);
            }
            ek4.s.a(sVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "requestVideoData in cdn thread mediaId:" + str + " offset:" + this.f253662f + " length:" + this.f253663g + " ret:" + Ni);
        } else {
            if (vVar != null) {
                vVar.a(-1);
            }
            ek4.s.a(sVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "requestVideoData not running id " + str);
        }
        return jz5.f0.f302826a;
    }
}
