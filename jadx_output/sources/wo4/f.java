package wo4;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f448257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.p1 f448258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wo4.g f448259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f448260g;

    public f(long j17, com.tencent.mm.plugin.vlog.model.p1 p1Var, wo4.g gVar, byte[] bArr) {
        this.f448257d = j17;
        this.f448258e = p1Var;
        this.f448259f = gVar;
        this.f448260g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.model.p1 p1Var = this.f448258e;
        long j17 = (this.f448257d - p1Var.f175711d) + (p1Var.f175708a * 1000);
        wo4.g gVar = this.f448259f;
        yz5.p pVar = gVar.f266215e;
        if (pVar != null) {
        }
        gVar.F = j17;
    }
}
