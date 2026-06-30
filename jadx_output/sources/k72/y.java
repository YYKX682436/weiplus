package k72;

/* loaded from: classes14.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f304776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcontrol.VideoTransPara f304777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[][] f304778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k72.d0 f304779g;

    public y(k72.d0 d0Var, int i17, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, byte[][] bArr) {
        this.f304779g = d0Var;
        this.f304776d = i17;
        this.f304777e = videoTransPara;
        this.f304778f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        h72.s e17 = h72.s.e();
        e17.f279469c.postToWorker(new h72.i(e17, this.f304776d));
        h72.s e18 = h72.s.e();
        e18.f279469c.postToWorker(new h72.j(e18, this.f304777e.f71193f));
        k72.d0 d0Var = this.f304779g;
        d0Var.getClass();
        k72.u uVar = k72.u.B;
        k72.a0 a0Var = new k72.a0(d0Var, this.f304778f);
        com.tencent.mm.sdk.platformtools.n3 n3Var = uVar.f304762t;
        if (n3Var != null) {
            n3Var.post(a0Var);
        }
    }
}
